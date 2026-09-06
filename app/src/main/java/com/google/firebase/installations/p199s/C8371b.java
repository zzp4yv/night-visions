package com.google.firebase.installations.p199s;

/* compiled from: SystemClock.java */
/* renamed from: com.google.firebase.installations.s.b */
/* loaded from: classes2.dex */
public class C8371b implements InterfaceC8370a {

    /* renamed from: a */
    private static C8371b f31878a;

    private C8371b() {
    }

    /* renamed from: b */
    public static C8371b m26386b() {
        if (f31878a == null) {
            f31878a = new C8371b();
        }
        return f31878a;
    }

    @Override // com.google.firebase.installations.p199s.InterfaceC8370a
    /* renamed from: a */
    public long mo26385a() {
        return System.currentTimeMillis();
    }
}
