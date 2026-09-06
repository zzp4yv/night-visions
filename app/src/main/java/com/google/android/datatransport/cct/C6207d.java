package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.datatransport.cct.C6207d;
import com.google.android.datatransport.cct.p177f.AbstractC6209a;
import com.google.android.datatransport.cct.p177f.AbstractC6218j;
import com.google.android.datatransport.cct.p177f.AbstractC6219k;
import com.google.android.datatransport.cct.p177f.AbstractC6220l;
import com.google.android.datatransport.cct.p177f.AbstractC6221m;
import com.google.android.datatransport.cct.p177f.AbstractC6222n;
import com.google.android.datatransport.cct.p177f.AbstractC6223o;
import com.google.android.datatransport.cct.p177f.EnumC6224p;
import com.google.android.datatransport.runtime.backends.AbstractC6230f;
import com.google.android.datatransport.runtime.backends.AbstractC6231g;
import com.google.android.datatransport.runtime.backends.InterfaceC6237m;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8292a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.p258i.AbstractC8834j;
import p241e.p254e.p256b.p257a.p258i.C8833i;
import p241e.p254e.p256b.p257a.p258i.p259a0.C8761b;
import p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8760a;
import p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8762c;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8858a;

/* compiled from: CctTransportBackend.java */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes2.dex */
final class C6207d implements InterfaceC6237m {

    /* renamed from: a */
    private final InterfaceC8292a f16587a;

    /* renamed from: b */
    private final ConnectivityManager f16588b;

    /* renamed from: c */
    private final Context f16589c;

    /* renamed from: d */
    final URL f16590d;

    /* renamed from: e */
    private final InterfaceC8821a f16591e;

    /* renamed from: f */
    private final InterfaceC8821a f16592f;

    /* renamed from: g */
    private final int f16593g;

    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    static final class a {

        /* renamed from: a */
        final URL f16594a;

        /* renamed from: b */
        final AbstractC6218j f16595b;

        /* renamed from: c */
        final String f16596c;

        a(URL url, AbstractC6218j abstractC6218j, String str) {
            this.f16594a = url;
            this.f16595b = abstractC6218j;
            this.f16596c = str;
        }

        /* renamed from: a */
        a m13415a(URL url) {
            return new a(url, this.f16595b, this.f16596c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    static final class b {

        /* renamed from: a */
        final int f16597a;

        /* renamed from: b */
        final URL f16598b;

        /* renamed from: c */
        final long f16599c;

        b(int i2, URL url, long j2) {
            this.f16597a = i2;
            this.f16598b = url;
            this.f16599c = j2;
        }
    }

    C6207d(Context context, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, int i2) {
        this.f16587a = AbstractC6218j.m13494b();
        this.f16589c = context;
        this.f16588b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16590d = m13412m(C6206c.f16579a);
        this.f16591e = interfaceC8821a2;
        this.f16592f = interfaceC8821a;
        this.f16593g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public b m13402c(a aVar) throws IOException {
        C8858a.m28234f("CctTransportBackend", "Making request to: %s", aVar.f16594a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f16594a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f16593g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f16596c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f16587a.mo26074a(aVar.f16595b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C8858a.m28234f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C8858a.m28230b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C8858a.m28230b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m13411l = m13411l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC6222n.m13503b(new BufferedReader(new InputStreamReader(m13411l))).mo13487c());
                            if (m13411l != null) {
                                m13411l.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (m13411l != null) {
                                try {
                                    m13411l.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (EncodingException e2) {
            e = e2;
            C8858a.m28232d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            C8858a.m28232d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            C8858a.m28232d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            C8858a.m28232d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: d */
    private static int m13403d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC6223o.b.UNKNOWN_MOBILE_SUBTYPE.m13506k();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC6223o.b.COMBINED.m13506k();
        }
        if (AbstractC6223o.b.m13505g(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: e */
    private static int m13404e(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC6223o.c.NONE.m13508k() : networkInfo.getType();
    }

    /* renamed from: f */
    private static int m13405f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            C8858a.m28232d("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    /* renamed from: g */
    private AbstractC6218j m13406g(AbstractC6230f abstractC6230f) {
        AbstractC6220l.a m13498j;
        HashMap hashMap = new HashMap();
        for (AbstractC8834j abstractC8834j : abstractC6230f.mo13509b()) {
            String mo28100j = abstractC8834j.mo28100j();
            if (hashMap.containsKey(mo28100j)) {
                ((List) hashMap.get(mo28100j)).add(abstractC8834j);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC8834j);
                hashMap.put(mo28100j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC8834j abstractC8834j2 = (AbstractC8834j) ((List) entry.getValue()).get(0);
            AbstractC6221m.a mo13480b = AbstractC6221m.m13499a().mo13484f(EnumC6224p.DEFAULT).mo13485g(this.f16592f.mo28110a()).mo13486h(this.f16591e.mo28110a()).mo13480b(AbstractC6219k.m13495a().mo13456c(AbstractC6219k.b.ANDROID_FIREBASE).mo13455b(AbstractC6209a.m13417a().mo13442m(Integer.valueOf(abstractC8834j2.m28152g("sdk-version"))).mo13439j(abstractC8834j2.m28151b("model")).mo13435f(abstractC8834j2.m28151b("hardware")).mo13433d(abstractC8834j2.m28151b("device")).mo13441l(abstractC8834j2.m28151b("product")).mo13440k(abstractC8834j2.m28151b("os-uild")).mo13437h(abstractC8834j2.m28151b("manufacturer")).mo13434e(abstractC8834j2.m28151b("fingerprint")).mo13432c(abstractC8834j2.m28151b("country")).mo13436g(abstractC8834j2.m28151b("locale")).mo13438i(abstractC8834j2.m28151b("mcc_mnc")).mo13431b(abstractC8834j2.m28151b("application_build")).mo13430a()).mo13454a());
            try {
                mo13480b.m13500i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo13480b.m13501j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC8834j abstractC8834j3 : (List) entry.getValue()) {
                C8833i mo28098e = abstractC8834j3.mo28098e();
                C8752b m28149b = mo28098e.m28149b();
                if (m28149b.equals(C8752b.m27945b("proto"))) {
                    m13498j = AbstractC6220l.m13498j(mo28098e.m28148a());
                } else if (m28149b.equals(C8752b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON))) {
                    m13498j = AbstractC6220l.m13497i(new String(mo28098e.m28148a(), Charset.forName("UTF-8")));
                } else {
                    C8858a.m28235g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m28149b);
                }
                m13498j.mo13466c(abstractC8834j3.mo28099f()).mo13467d(abstractC8834j3.mo28101k()).mo13471h(abstractC8834j3.m28153h("tz-offset")).mo13468e(AbstractC6223o.m13504a().mo13492c(AbstractC6223o.c.m13507g(abstractC8834j3.m28152g("net-type"))).mo13491b(AbstractC6223o.b.m13505g(abstractC8834j3.m28152g("mobile-subtype"))).mo13490a());
                if (abstractC8834j3.mo28097d() != null) {
                    m13498j.mo13465b(abstractC8834j3.mo28097d());
                }
                arrayList3.add(m13498j.mo13464a());
            }
            mo13480b.mo13481c(arrayList3);
            arrayList2.add(mo13480b.mo13479a());
        }
        return AbstractC6218j.m13493a(arrayList2);
    }

    /* renamed from: h */
    private static TelephonyManager m13407h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: i */
    static long m13408i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: k */
    static /* synthetic */ a m13410k(a aVar, b bVar) {
        URL url = bVar.f16598b;
        if (url == null) {
            return null;
        }
        C8858a.m28230b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m13415a(bVar.f16598b);
    }

    /* renamed from: l */
    private static InputStream m13411l(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: m */
    private static URL m13412m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6237m
    /* renamed from: a */
    public AbstractC6231g mo13413a(AbstractC6230f abstractC6230f) {
        AbstractC6218j m13406g = m13406g(abstractC6230f);
        URL url = this.f16590d;
        if (abstractC6230f.mo13510c() != null) {
            try {
                C6206c m13397c = C6206c.m13397c(abstractC6230f.mo13510c());
                r3 = m13397c.m13400d() != null ? m13397c.m13400d() : null;
                if (m13397c.m13401e() != null) {
                    url = m13412m(m13397c.m13401e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC6231g.m13521a();
            }
        }
        try {
            b bVar = (b) C8761b.m27950a(5, new a(url, m13406g, r3), new InterfaceC8760a() { // from class: com.google.android.datatransport.cct.b
                @Override // p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8760a
                /* renamed from: a */
                public final Object mo13396a(Object obj) {
                    C6207d.b m13402c;
                    m13402c = C6207d.this.m13402c((C6207d.a) obj);
                    return m13402c;
                }
            }, new InterfaceC8762c() { // from class: com.google.android.datatransport.cct.a
                @Override // p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8762c
                /* renamed from: a */
                public final Object mo13395a(Object obj, Object obj2) {
                    return C6207d.m13410k((C6207d.a) obj, (C6207d.b) obj2);
                }
            });
            int i2 = bVar.f16597a;
            if (i2 == 200) {
                return AbstractC6231g.m13523e(bVar.f16599c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? AbstractC6231g.m13522d() : AbstractC6231g.m13521a();
            }
            return AbstractC6231g.m13524f();
        } catch (IOException e2) {
            C8858a.m28232d("CctTransportBackend", "Could not make request to the backend", e2);
            return AbstractC6231g.m13524f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6237m
    /* renamed from: b */
    public AbstractC8834j mo13414b(AbstractC8834j abstractC8834j) {
        NetworkInfo activeNetworkInfo = this.f16588b.getActiveNetworkInfo();
        return abstractC8834j.m28155l().m28156a("sdk-version", Build.VERSION.SDK_INT).m28158c("model", Build.MODEL).m28158c("hardware", Build.HARDWARE).m28158c("device", Build.DEVICE).m28158c("product", Build.PRODUCT).m28158c("os-uild", Build.ID).m28158c("manufacturer", Build.MANUFACTURER).m28158c("fingerprint", Build.FINGERPRINT).m28157b("tz-offset", m13408i()).m28156a("net-type", m13404e(activeNetworkInfo)).m28156a("mobile-subtype", m13403d(activeNetworkInfo)).m28158c("country", Locale.getDefault().getCountry()).m28158c("locale", Locale.getDefault().getLanguage()).m28158c("mcc_mnc", m13407h(this.f16589c).getSimOperator()).m28158c("application_build", Integer.toString(m13405f(this.f16589c))).mo28102d();
    }

    C6207d(Context context, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2) {
        this(context, interfaceC8821a, interfaceC8821a2, 130000);
    }
}
