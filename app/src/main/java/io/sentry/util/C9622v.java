package io.sentry.util;

import io.sentry.C9493o3;
import io.sentry.C9553s3;
import io.sentry.C9591u0;
import io.sentry.C9647x4;
import io.sentry.InterfaceC9560t3;
import io.sentry.InterfaceC9625v1;

/* compiled from: TracingUtils.java */
/* renamed from: io.sentry.util.v */
/* loaded from: classes2.dex */
public final class C9622v {
    /* renamed from: a */
    static /* synthetic */ void m31823a(C9647x4 c9647x4, C9553s3 c9553s3, C9493o3 c9493o3) {
        C9591u0 m31124b = c9493o3.m31124b();
        if (m31124b == null) {
            m31124b = new C9591u0(c9647x4.getLogger());
            c9493o3.m31129g(m31124b);
        }
        if (m31124b.m31753q()) {
            m31124b.m31737D(c9553s3, c9647x4);
            m31124b.m31740a();
        }
    }

    /* renamed from: d */
    public static C9493o3 m31826d(final C9553s3 c9553s3, final C9647x4 c9647x4) {
        return c9553s3.m31587B(new C9553s3.a() { // from class: io.sentry.util.f
            @Override // io.sentry.C9553s3.a
            /* renamed from: a */
            public final void mo31614a(C9493o3 c9493o3) {
                C9622v.m31823a(C9647x4.this, c9553s3, c9493o3);
            }
        });
    }

    /* renamed from: e */
    public static void m31827e(InterfaceC9625v1 interfaceC9625v1) {
        interfaceC9625v1.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.util.g
            @Override // io.sentry.InterfaceC9560t3
            /* renamed from: a */
            public final void mo30217a(C9553s3 c9553s3) {
                c9553s3.m31587B(new C9553s3.a() { // from class: io.sentry.util.e
                    @Override // io.sentry.C9553s3.a
                    /* renamed from: a */
                    public final void mo31614a(C9493o3 c9493o3) {
                        C9553s3.this.m31611x(new C9493o3());
                    }
                });
            }
        });
    }
}
