package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EnumC9425h;
import io.sentry.protocol.C9524p;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9609m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DeduplicateMultithreadedEventProcessor.java */
/* renamed from: io.sentry.b1 */
/* loaded from: classes2.dex */
public final class C9332b1 implements InterfaceC9463k1 {

    /* renamed from: f */
    private final Map<String, Long> f36149f = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private final C9647x4 f36150g;

    public C9332b1(C9647x4 c9647x4) {
        this.f36150g = c9647x4;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        C9524p m31006u0;
        String m31443i;
        Long m31442h;
        if (!C9609m.m31781d(c9484n1, UncaughtExceptionHandlerIntegration.C9208a.class) || (m31006u0 = c9473l4.m31006u0()) == null || (m31443i = m31006u0.m31443i()) == null || (m31442h = m31006u0.m31442h()) == null) {
            return c9473l4;
        }
        Long l = this.f36149f.get(m31443i);
        if (l == null || l.equals(m31442h)) {
            this.f36149f.put(m31443i, m31442h);
            return c9473l4;
        }
        this.f36150g.getLogger().mo30214c(EnumC9554s4.INFO, "Event %s has been dropped due to multi-threaded deduplication", c9473l4.m30579G());
        C9609m.m31791n(c9484n1, EnumC9425h.MULTITHREADED_DEDUPLICATION);
        return null;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public /* synthetic */ C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        return C9456j1.m30876a(this, c9532x, c9484n1);
    }
}
