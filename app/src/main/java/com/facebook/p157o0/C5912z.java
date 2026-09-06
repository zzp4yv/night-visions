package com.facebook.p157o0;

import com.facebook.p157o0.p165q0.C5869g;
import kotlin.jvm.internal.C9768m;

/* compiled from: AppEventStore.kt */
/* renamed from: com.facebook.o0.z */
/* loaded from: classes.dex */
public final class C5912z {

    /* renamed from: a */
    public static final C5912z f15551a = new C5912z();

    /* renamed from: b */
    private static final String f15552b = C5912z.class.getName();

    private C5912z() {
    }

    /* renamed from: a */
    public static final synchronized void m12874a(C5895t c5895t, C5796i0 c5796i0) {
        synchronized (C5912z.class) {
            C9768m.m32346f(c5895t, "accessTokenAppIdPair");
            C9768m.m32346f(c5796i0, "appEvents");
            C5869g c5869g = C5869g.f15370a;
            C5869g.m12625b();
            C5910x c5910x = C5910x.f15541a;
            C5794h0 m12851a = C5910x.m12851a();
            m12851a.m12254a(c5895t, c5796i0.m12260d());
            C5910x.m12852b(m12851a);
        }
    }

    /* renamed from: b */
    public static final synchronized void m12875b(C5909w c5909w) {
        synchronized (C5912z.class) {
            C9768m.m32346f(c5909w, "eventsToPersist");
            C5869g c5869g = C5869g.f15370a;
            C5869g.m12625b();
            C5910x c5910x = C5910x.f15541a;
            C5794h0 m12851a = C5910x.m12851a();
            for (C5895t c5895t : c5909w.m12850f()) {
                C5796i0 m12848c = c5909w.m12848c(c5895t);
                if (m12848c == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                m12851a.m12254a(c5895t, m12848c.m12260d());
            }
            C5910x c5910x2 = C5910x.f15541a;
            C5910x.m12852b(m12851a);
        }
    }
}
