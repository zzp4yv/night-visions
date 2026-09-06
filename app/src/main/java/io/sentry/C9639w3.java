package io.sentry;

import java.io.File;

/* compiled from: SendCachedEnvelopeFireAndForgetIntegration.java */
/* renamed from: io.sentry.w3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9639w3 {
    /* renamed from: a */
    public static boolean m31932a(InterfaceC9646x3 _this, String str, InterfaceC9637w1 interfaceC9637w1) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* renamed from: b */
    public static InterfaceC9594u3 m31933b(InterfaceC9646x3 _this, final AbstractC9392e1 abstractC9392e1, final String str, final InterfaceC9637w1 interfaceC9637w1) {
        final File file = new File(str);
        return new InterfaceC9594u3() { // from class: io.sentry.s
            @Override // io.sentry.InterfaceC9594u3
            /* renamed from: a */
            public final void mo31571a() {
                C9639w3.m31934c(InterfaceC9637w1.this, str, abstractC9392e1, file);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m31934c(InterfaceC9637w1 interfaceC9637w1, String str, AbstractC9392e1 abstractC9392e1, File file) {
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        interfaceC9637w1.mo30214c(enumC9554s4, "Started processing cached files from %s", str);
        abstractC9392e1.mo30759e(file);
        interfaceC9637w1.mo30214c(enumC9554s4, "Finished processing cached files from %s", str);
    }
}
