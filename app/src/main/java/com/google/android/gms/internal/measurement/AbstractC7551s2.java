package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* loaded from: classes2.dex */
abstract class AbstractC7551s2 {

    /* renamed from: a */
    private static final AbstractC7551s2 f27891a;

    /* renamed from: b */
    private static final AbstractC7551s2 f27892b;

    static {
        C7545r2 c7545r2 = null;
        f27891a = new C7563u2();
        f27892b = new C7557t2();
    }

    private AbstractC7551s2() {
    }

    /* renamed from: a */
    static AbstractC7551s2 m21398a() {
        return f27891a;
    }

    /* renamed from: d */
    static AbstractC7551s2 m21399d() {
        return f27892b;
    }

    /* renamed from: b */
    abstract <L> List<L> mo21400b(Object obj, long j2);

    /* renamed from: c */
    abstract <L> void mo21401c(Object obj, Object obj2, long j2);

    /* renamed from: e */
    abstract void mo21402e(Object obj, long j2);
}
