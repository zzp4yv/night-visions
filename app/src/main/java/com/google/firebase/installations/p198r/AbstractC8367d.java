package com.google.firebase.installations.p198r;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p198r.C8364a;

/* compiled from: InstallationResponse.java */
@AutoValue
/* renamed from: com.google.firebase.installations.r.d */
/* loaded from: classes2.dex */
public abstract class AbstractC8367d {

    /* compiled from: InstallationResponse.java */
    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.r.d$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8367d mo26345a();

        /* renamed from: b */
        public abstract a mo26346b(AbstractC8369f abstractC8369f);

        /* renamed from: c */
        public abstract a mo26347c(String str);

        /* renamed from: d */
        public abstract a mo26348d(String str);

        /* renamed from: e */
        public abstract a mo26349e(b bVar);

        /* renamed from: f */
        public abstract a mo26350f(String str);
    }

    /* compiled from: InstallationResponse.java */
    /* renamed from: com.google.firebase.installations.r.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public static a m26377a() {
        return new C8364a.b();
    }

    /* renamed from: b */
    public abstract AbstractC8369f mo26340b();

    /* renamed from: c */
    public abstract String mo26341c();

    /* renamed from: d */
    public abstract String mo26342d();

    /* renamed from: e */
    public abstract b mo26343e();

    /* renamed from: f */
    public abstract String mo26344f();
}
