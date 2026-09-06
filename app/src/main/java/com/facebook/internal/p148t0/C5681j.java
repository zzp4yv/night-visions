package com.facebook.internal.p148t0;

import com.facebook.C5608a0;
import com.facebook.internal.C5633a0;
import com.facebook.internal.p148t0.p149l.C5687e;
import com.facebook.internal.p148t0.p150m.C5690c;
import com.facebook.internal.p148t0.p151n.C5691a;
import com.facebook.internal.p148t0.p152o.C5696e;
import com.facebook.internal.p148t0.p153p.C5697a;

/* compiled from: InstrumentManager.kt */
/* renamed from: com.facebook.internal.t0.j */
/* loaded from: classes2.dex */
public final class C5681j {

    /* renamed from: a */
    public static final C5681j f14589a = new C5681j();

    private C5681j() {
    }

    /* renamed from: d */
    public static final void m11738d() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11288g()) {
            C5633a0 c5633a0 = C5633a0.f14313a;
            C5633a0.m11372a(C5633a0.b.CrashReport, new C5633a0.a() { // from class: com.facebook.internal.t0.b
                @Override // com.facebook.internal.C5633a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5681j.m11739e(z);
                }
            });
            C5633a0.m11372a(C5633a0.b.ErrorReport, new C5633a0.a() { // from class: com.facebook.internal.t0.d
                @Override // com.facebook.internal.C5633a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5681j.m11740f(z);
                }
            });
            C5633a0.m11372a(C5633a0.b.AnrReport, new C5633a0.a() { // from class: com.facebook.internal.t0.c
                @Override // com.facebook.internal.C5633a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5681j.m11741g(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m11739e(boolean z) {
        if (z) {
            C5690c.f14603f.m11780a();
            C5633a0 c5633a0 = C5633a0.f14313a;
            if (C5633a0.m11378g(C5633a0.b.CrashShield)) {
                C5679h c5679h = C5679h.f14569a;
                C5679h.m11714a();
                C5691a c5691a = C5691a.f14607a;
                C5691a.m11781a();
            }
            if (C5633a0.m11378g(C5633a0.b.ThreadCheck)) {
                C5697a c5697a = C5697a.f14618a;
                C5697a.m11797a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11740f(boolean z) {
        if (z) {
            C5696e c5696e = C5696e.f14617a;
            C5696e.m11787a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m11741g(boolean z) {
        if (z) {
            C5687e c5687e = C5687e.f14599a;
            C5687e.m11766a();
        }
    }
}
