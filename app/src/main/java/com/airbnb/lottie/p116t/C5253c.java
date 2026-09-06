package com.airbnb.lottie.p116t;

import android.content.Context;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.C5156e;
import com.airbnb.lottie.C5162k;
import com.airbnb.lottie.C5163l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p024c.p052i.p059j.C0955e;

/* compiled from: NetworkFetcher.java */
/* renamed from: com.airbnb.lottie.t.c */
/* loaded from: classes.dex */
public class C5253c {

    /* renamed from: a */
    private final Context f12896a;

    /* renamed from: b */
    private final String f12897b;

    /* renamed from: c */
    private final C5252b f12898c;

    /* compiled from: NetworkFetcher.java */
    /* renamed from: com.airbnb.lottie.t.c$a */
    class a implements Callable<C5162k<C5155d>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5162k<C5155d> call() throws Exception {
            return C5253c.this.m9772f();
        }
    }

    private C5253c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f12896a = applicationContext;
        this.f12897b = str;
        this.f12898c = new C5252b(applicationContext, str);
    }

    /* renamed from: a */
    private C5163l<C5155d> m9767a() {
        return new C5163l<>(new a());
    }

    /* renamed from: b */
    public static C5163l<C5155d> m9768b(Context context, String str) {
        return new C5253c(context, str).m9767a();
    }

    /* renamed from: c */
    private C5155d m9769c() {
        C0955e<EnumC5251a, InputStream> m9764a = this.f12898c.m9764a();
        if (m9764a == null) {
            return null;
        }
        EnumC5251a enumC5251a = m9764a.f6405a;
        InputStream inputStream = m9764a.f6406b;
        C5162k<C5155d> m9423m = enumC5251a == EnumC5251a.Zip ? C5156e.m9423m(new ZipInputStream(inputStream), this.f12897b) : C5156e.m9416f(inputStream, this.f12897b);
        if (m9423m.m9488b() != null) {
            return m9423m.m9488b();
        }
        return null;
    }

    /* renamed from: d */
    private C5162k<C5155d> m9770d() {
        try {
            return m9771e();
        } catch (IOException e2) {
            return new C5162k<>((Throwable) e2);
        }
    }

    /* renamed from: e */
    private C5162k m9771e() throws IOException {
        EnumC5251a enumC5251a;
        C5162k<C5155d> m9423m;
        C5154c.m9392b("Fetching " + this.f12897b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f12897b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            String contentType = httpURLConnection.getContentType();
            char c2 = 65535;
            int hashCode = contentType.hashCode();
            if (hashCode != -1248325150) {
                if (hashCode == -43840953 && contentType.equals("application/json")) {
                    c2 = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c2 = 0;
            }
            if (c2 != 0) {
                C5154c.m9392b("Received json response.");
                enumC5251a = EnumC5251a.Json;
                m9423m = C5156e.m9416f(new FileInputStream(new File(this.f12898c.m9766e(httpURLConnection.getInputStream(), enumC5251a).getAbsolutePath())), this.f12897b);
            } else {
                C5154c.m9392b("Handling zip response.");
                enumC5251a = EnumC5251a.Zip;
                m9423m = C5156e.m9423m(new ZipInputStream(new FileInputStream(this.f12898c.m9766e(httpURLConnection.getInputStream(), enumC5251a))), this.f12897b);
            }
            if (m9423m.m9488b() != null) {
                this.f12898c.m9765d(enumC5251a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Completed fetch from network. Success: ");
            sb.append(m9423m.m9488b() != null);
            C5154c.m9392b(sb.toString());
            return m9423m;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new C5162k((Throwable) new IllegalArgumentException("Unable to fetch " + this.f12897b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + ((Object) sb2)));
            }
            sb2.append(readLine);
            sb2.append('\n');
        }
    }

    /* renamed from: f */
    public C5162k<C5155d> m9772f() {
        C5155d m9769c = m9769c();
        if (m9769c != null) {
            return new C5162k<>(m9769c);
        }
        C5154c.m9392b("Animation for " + this.f12897b + " not found in cache. Fetching from network.");
        return m9770d();
    }
}
