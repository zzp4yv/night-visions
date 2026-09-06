package com.facebook.p157o0.p158k0;

import android.app.Activity;
import com.facebook.C5608a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5664q;
import kotlin.jvm.internal.C9768m;

/* compiled from: MetadataIndexer.kt */
/* renamed from: com.facebook.o0.k0.c */
/* loaded from: classes.dex */
public final class C5802c {

    /* renamed from: a */
    public static final C5802c f14978a = new C5802c();

    /* renamed from: b */
    private static final String f14979b = C5802c.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f14980c;

    private C5802c() {
    }

    /* renamed from: a */
    public static final void m12271a() {
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.k0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5802c.m12272b();
                }
            });
        } catch (Exception e2) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11573i0(f14979b, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12272b() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5664q.f14488a.m11629h(C5608a0.m11284c())) {
            return;
        }
        f14978a.m12275e();
        f14980c = true;
    }

    /* renamed from: d */
    public static final void m12274d(Activity activity) {
        C9768m.m32346f(activity, "activity");
        try {
            if (f14980c && !C5804e.f14982a.m12288c().isEmpty()) {
                ViewTreeObserverOnGlobalFocusChangeListenerC5805f.f14987f.m12302e(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m12275e() {
        String m11404h;
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5637c0 m11428o = C5639d0.m11428o(C5608a0.m11285d(), false);
        if (m11428o == null || (m11404h = m11428o.m11404h()) == null) {
            return;
        }
        C5804e.f14982a.m12289d(m11404h);
    }
}
