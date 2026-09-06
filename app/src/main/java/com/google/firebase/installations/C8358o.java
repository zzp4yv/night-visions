package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p197q.AbstractC8363d;
import com.google.firebase.installations.p199s.C8371b;
import com.google.firebase.installations.p199s.InterfaceC8370a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* renamed from: com.google.firebase.installations.o */
/* loaded from: classes2.dex */
public final class C8358o {

    /* renamed from: a */
    public static final long f31815a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f31816b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    private static C8358o f31817c;

    /* renamed from: d */
    private final InterfaceC8370a f31818d;

    private C8358o(InterfaceC8370a interfaceC8370a) {
        this.f31818d = interfaceC8370a;
    }

    /* renamed from: c */
    public static C8358o m26290c() {
        return m26291d(C8371b.m26386b());
    }

    /* renamed from: d */
    public static C8358o m26291d(InterfaceC8370a interfaceC8370a) {
        if (f31817c == null) {
            f31817c = new C8358o(interfaceC8370a);
        }
        return f31817c;
    }

    /* renamed from: g */
    static boolean m26292g(String str) {
        return f31816b.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m26293h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m26294a() {
        return this.f31818d.mo26385a();
    }

    /* renamed from: b */
    public long m26295b() {
        return TimeUnit.MILLISECONDS.toSeconds(m26294a());
    }

    /* renamed from: e */
    public long m26296e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m26297f(AbstractC8363d abstractC8363d) {
        return TextUtils.isEmpty(abstractC8363d.mo26299b()) || abstractC8363d.mo26305h() + abstractC8363d.mo26300c() < m26295b() + f31815a;
    }
}
