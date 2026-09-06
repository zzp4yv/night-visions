package io.sentry.transport;

import io.sentry.C9416h4;
import io.sentry.C9500p3;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HttpConnection.java */
/* renamed from: io.sentry.transport.p */
/* loaded from: classes2.dex */
final class C9579p {

    /* renamed from: a */
    private static final Charset f36895a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final Proxy f36896b;

    /* renamed from: c */
    private final C9500p3 f36897c;

    /* renamed from: d */
    private final C9647x4 f36898d;

    /* renamed from: e */
    private final C9588y f36899e;

    public C9579p(C9647x4 c9647x4, C9500p3 c9500p3, C9588y c9588y) {
        this(c9647x4, c9500p3, C9577n.m31692a(), c9588y);
    }

    /* renamed from: a */
    private void m31695a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: b */
    private HttpURLConnection m31696b() throws IOException {
        HttpURLConnection m31701e = m31701e();
        for (Map.Entry<String, String> entry : this.f36897c.m31173a().entrySet()) {
            m31701e.setRequestProperty(entry.getKey(), entry.getValue());
        }
        m31701e.setRequestMethod("POST");
        m31701e.setDoOutput(true);
        m31701e.setRequestProperty("Content-Encoding", "gzip");
        m31701e.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        m31701e.setRequestProperty("Accept", "application/json");
        m31701e.setRequestProperty("Connection", "close");
        m31701e.setConnectTimeout(this.f36898d.getConnectionTimeoutMillis());
        m31701e.setReadTimeout(this.f36898d.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.f36898d.getHostnameVerifier();
        boolean z = m31701e instanceof HttpsURLConnection;
        if (z && hostnameVerifier != null) {
            ((HttpsURLConnection) m31701e).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.f36898d.getSslSocketFactory();
        if (z && sslSocketFactory != null) {
            ((HttpsURLConnection) m31701e).setSSLSocketFactory(sslSocketFactory);
        }
        m31701e.connect();
        return m31701e;
    }

    /* renamed from: c */
    private String m31697c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f36895a));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(readLine);
                        z = false;
                    }
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return sb2;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused3) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* renamed from: d */
    private boolean m31698d(int i2) {
        return i2 == 200;
    }

    /* renamed from: f */
    private AbstractC9564a0 m31699f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                m31703i(httpURLConnection, responseCode);
                if (m31698d(responseCode)) {
                    this.f36898d.getLogger().mo30214c(EnumC9554s4.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return AbstractC9564a0.m31663e();
                }
                InterfaceC9637w1 logger = this.f36898d.getLogger();
                EnumC9554s4 enumC9554s4 = EnumC9554s4.ERROR;
                logger.mo30214c(enumC9554s4, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.f36898d.isDebug()) {
                    this.f36898d.getLogger().mo30214c(enumC9554s4, "%s", m31697c(httpURLConnection));
                }
                return AbstractC9564a0.m31662b(responseCode);
            } catch (IOException e2) {
                this.f36898d.getLogger().mo30212a(EnumC9554s4.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                m31695a(httpURLConnection);
                return AbstractC9564a0.m31661a();
            }
        } finally {
            m31695a(httpURLConnection);
        }
    }

    /* renamed from: g */
    private Proxy m31700g(C9647x4.e eVar) {
        if (eVar != null) {
            String m31949c = eVar.m31949c();
            String m31947a = eVar.m31947a();
            if (m31949c != null && m31947a != null) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(m31947a, Integer.parseInt(m31949c)));
                } catch (NumberFormatException e2) {
                    this.f36898d.getLogger().mo30212a(EnumC9554s4.ERROR, e2, "Failed to parse Sentry Proxy port: " + eVar.m31949c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    HttpURLConnection m31701e() throws IOException {
        return (HttpURLConnection) (this.f36896b == null ? this.f36897c.m31174b().openConnection() : this.f36897c.m31174b().openConnection(this.f36896b));
    }

    /* renamed from: h */
    public AbstractC9564a0 m31702h(C9416h4 c9416h4) throws IOException {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        try {
            outputStream = m31696b().getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.f36898d.getSerializer().mo30488b(c9416h4, gZIPOutputStream);
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            return m31699f(r0);
        } catch (Throwable th2) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: i */
    public void m31703i(HttpURLConnection httpURLConnection, int i2) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f36899e.m31717i(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i2);
    }

    C9579p(C9647x4 c9647x4, C9500p3 c9500p3, C9577n c9577n, C9588y c9588y) {
        this.f36897c = c9500p3;
        this.f36898d = c9647x4;
        this.f36899e = c9588y;
        Proxy m31700g = m31700g(c9647x4.getProxy());
        this.f36896b = m31700g;
        if (m31700g == null || c9647x4.getProxy() == null) {
            return;
        }
        String m31950d = c9647x4.getProxy().m31950d();
        String m31948b = c9647x4.getProxy().m31948b();
        if (m31950d == null || m31948b == null) {
            return;
        }
        c9577n.m31693b(new C9586w(m31950d, m31948b));
    }
}
