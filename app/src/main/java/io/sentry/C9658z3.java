package io.sentry;

import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SendFireAndForgetOutboxSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.z3 */
/* loaded from: classes2.dex */
public final class C9658z3 implements InterfaceC9646x3 {

    /* renamed from: a */
    private final InterfaceC9627v3 f37027a;

    public C9658z3(InterfaceC9627v3 interfaceC9627v3) {
        this.f37027a = (InterfaceC9627v3) C9613q.m31802c(interfaceC9627v3, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.InterfaceC9646x3
    /* renamed from: a */
    public /* synthetic */ InterfaceC9594u3 mo31940a(AbstractC9392e1 abstractC9392e1, String str, InterfaceC9637w1 interfaceC9637w1) {
        return C9639w3.m31933b(this, abstractC9392e1, str, interfaceC9637w1);
    }

    @Override // io.sentry.InterfaceC9646x3
    /* renamed from: b */
    public InterfaceC9594u3 mo31941b(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        C9613q.m31802c(c9647x4, "SentryOptions is required");
        String mo30388a = this.f37027a.mo30388a();
        if (mo30388a != null && mo31942c(mo30388a, c9647x4.getLogger())) {
            return mo31940a(new C9458j3(interfaceC9625v1, c9647x4.getEnvelopeReader(), c9647x4.getSerializer(), c9647x4.getLogger(), c9647x4.getFlushTimeoutMillis()), mo30388a, c9647x4.getLogger());
        }
        c9647x4.getLogger().mo30214c(EnumC9554s4.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC9646x3
    /* renamed from: c */
    public /* synthetic */ boolean mo31942c(String str, InterfaceC9637w1 interfaceC9637w1) {
        return C9639w3.m31932a(this, str, interfaceC9637w1);
    }
}
