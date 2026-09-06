package com.google.firebase.installations.p198r;

import com.google.firebase.installations.C8358o;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* renamed from: com.google.firebase.installations.r.e */
/* loaded from: classes2.dex */
class C8368e {

    /* renamed from: a */
    private static final long f31869a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    private static final long f31870b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private final C8358o f31871c = C8358o.m26290c();

    /* renamed from: d */
    private long f31872d;

    /* renamed from: e */
    private int f31873e;

    C8368e() {
    }

    /* renamed from: a */
    private synchronized long m26378a(int i2) {
        if (!m26379c(i2)) {
            return f31869a;
        }
        double pow = Math.pow(2.0d, this.f31873e);
        double m26296e = this.f31871c.m26296e();
        Double.isNaN(m26296e);
        return (long) Math.min(pow + m26296e, f31870b);
    }

    /* renamed from: c */
    private static boolean m26379c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    /* renamed from: d */
    private static boolean m26380d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    /* renamed from: e */
    private synchronized void m26381e() {
        this.f31873e = 0;
    }

    /* renamed from: b */
    public synchronized boolean m26382b() {
        boolean z;
        if (this.f31873e != 0) {
            z = this.f31871c.m26294a() > this.f31872d;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void m26383f(int i2) {
        if (m26380d(i2)) {
            m26381e();
            return;
        }
        this.f31873e++;
        this.f31872d = this.f31871c.m26294a() + m26378a(i2);
    }
}
