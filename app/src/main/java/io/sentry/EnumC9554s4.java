package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* compiled from: SentryLevel.java */
/* renamed from: io.sentry.s4 */
/* loaded from: classes2.dex */
public enum EnumC9554s4 implements InterfaceC9545r2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* compiled from: SentryLevel.java */
    /* renamed from: io.sentry.s4$a */
    static final class a implements InterfaceC9471l2<EnumC9554s4> {
        a() {
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC9554s4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            return EnumC9554s4.valueOf(c9485n2.m31881J().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30819b(name().toLowerCase(Locale.ROOT));
    }
}
