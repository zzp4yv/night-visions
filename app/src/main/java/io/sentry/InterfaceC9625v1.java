package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: IHub.java */
/* renamed from: io.sentry.v1 */
/* loaded from: classes2.dex */
public interface InterfaceC9625v1 {
    InterfaceC9625v1 clone();

    void close();

    void endSession();

    /* renamed from: h */
    void mo31147h(long j2);

    /* renamed from: i */
    void mo31148i(C9624v0 c9624v0);

    boolean isEnabled();

    /* renamed from: j */
    C9525q mo31149j(C9416h4 c9416h4, C9484n1 c9484n1);

    /* renamed from: k */
    C9525q mo31150k(C9473l4 c9473l4);

    /* renamed from: l */
    InterfaceC9393e2 mo31151l(C9548r5 c9548r5, C9562t5 c9562t5);

    @ApiStatus.Internal
    /* renamed from: m */
    C9525q mo31152m(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1);

    /* renamed from: n */
    void mo31153n(C9624v0 c9624v0, C9484n1 c9484n1);

    /* renamed from: o */
    void mo31154o(InterfaceC9560t3 interfaceC9560t3);

    @ApiStatus.Internal
    /* renamed from: p */
    void mo31155p(Throwable th, InterfaceC9386d2 interfaceC9386d2, String str);

    /* renamed from: q */
    C9647x4 mo31156q();

    @ApiStatus.Internal
    /* renamed from: r */
    C9525q mo31157r(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1, C9479m3 c9479m3);

    /* renamed from: s */
    C9525q mo31158s(C9416h4 c9416h4);

    void startSession();

    /* renamed from: t */
    C9525q mo31159t(C9473l4 c9473l4, C9484n1 c9484n1);
}
