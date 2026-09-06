package com.bumptech.glide.load.p127m;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.C5422g;
import com.bumptech.glide.p145r.C5556c;
import com.bumptech.glide.p145r.C5559f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* renamed from: com.bumptech.glide.load.m.j */
/* loaded from: classes.dex */
public class C5406j implements InterfaceC5400d<InputStream> {

    /* renamed from: f */
    static final b f13578f = new a();

    /* renamed from: g */
    private final C5422g f13579g;

    /* renamed from: h */
    private final int f13580h;

    /* renamed from: i */
    private final b f13581i;

    /* renamed from: j */
    private HttpURLConnection f13582j;

    /* renamed from: k */
    private InputStream f13583k;

    /* renamed from: l */
    private volatile boolean f13584l;

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.j$a */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.p127m.C5406j.b
        /* renamed from: a */
        public HttpURLConnection mo10482a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.j$b */
    interface b {
        /* renamed from: a */
        HttpURLConnection mo10482a(URL url) throws IOException;
    }

    public C5406j(C5422g c5422g, int i2) {
        this(c5422g, i2, f13578f);
    }

    /* renamed from: c */
    private InputStream m10478c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f13583k = C5556c.m11020b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f13583k = httpURLConnection.getInputStream();
        }
        return this.f13583k;
    }

    /* renamed from: f */
    private static boolean m10479f(int i2) {
        return i2 / 100 == 2;
    }

    /* renamed from: g */
    private static boolean m10480g(int i2) {
        return i2 / 100 == 3;
    }

    /* renamed from: h */
    private InputStream m10481h(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f13582j = this.f13581i.mo10482a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f13582j.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f13582j.setConnectTimeout(this.f13580h);
        this.f13582j.setReadTimeout(this.f13580h);
        this.f13582j.setUseCaches(false);
        this.f13582j.setDoInput(true);
        this.f13582j.setInstanceFollowRedirects(false);
        this.f13582j.connect();
        this.f13583k = this.f13582j.getInputStream();
        if (this.f13584l) {
            return null;
        }
        int responseCode = this.f13582j.getResponseCode();
        if (m10479f(responseCode)) {
            return m10478c(this.f13582j);
        }
        if (!m10480g(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f13582j.getResponseMessage(), responseCode);
        }
        String headerField = this.f13582j.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo10460b();
        return m10481h(url3, i2 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: b */
    public void mo10460b() {
        InputStream inputStream = this.f13583k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f13582j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f13582j = null;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    public void cancel() {
        this.f13584l = true;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: d */
    public EnumC5332a mo10462d() {
        return EnumC5332a.REMOTE;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: e */
    public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long m11028b = C5559f.m11028b();
        try {
            try {
                aVar.mo10228f(m10481h(this.f13579g.m10542f(), 0, null, this.f13579g.m10541c()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                aVar.mo10227c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C5559f.m11027a(m11028b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C5559f.m11027a(m11028b));
            }
            throw th;
        }
    }

    C5406j(C5422g c5422g, int i2, b bVar) {
        this.f13579g = c5422g;
        this.f13580h = i2;
        this.f13581i = bVar;
    }
}
