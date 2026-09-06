package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: HubAdapter.java */
/* renamed from: io.sentry.q1 */
/* loaded from: classes2.dex */
public final class C9537q1 implements InterfaceC9625v1 {

    /* renamed from: a */
    private static final C9537q1 f36792a = new C9537q1();

    private C9537q1() {
    }

    /* renamed from: a */
    public static C9537q1 m31548a() {
        return f36792a;
    }

    @Override // io.sentry.InterfaceC9625v1
    public void close() {
        C9214a4.m30035e();
    }

    @Override // io.sentry.InterfaceC9625v1
    public void endSession() {
        C9214a4.m30037g();
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: h */
    public void mo31147h(long j2) {
        C9214a4.m30039i(j2);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9624v0 c9624v0) {
        C9592u1.m31760a(this, c9624v0);
    }

    @Override // io.sentry.InterfaceC9625v1
    public boolean isEnabled() {
        return C9214a4.m30046p();
    }

    @Override // io.sentry.InterfaceC9625v1
    @ApiStatus.Internal
    /* renamed from: j */
    public C9525q mo31149j(C9416h4 c9416h4, C9484n1 c9484n1) {
        return C9214a4.m30040j().mo31149j(c9416h4, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: k */
    public /* synthetic */ C9525q mo31150k(C9473l4 c9473l4) {
        return C9592u1.m31762c(this, c9473l4);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: l */
    public InterfaceC9393e2 mo31151l(C9548r5 c9548r5, C9562t5 c9562t5) {
        return C9214a4.m30051u(c9548r5, c9562t5);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: m */
    public /* synthetic */ C9525q mo31152m(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1) {
        return C9592u1.m31763d(this, c9532x, c9495o5, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: n */
    public void mo31153n(C9624v0 c9624v0, C9484n1 c9484n1) {
        C9214a4.m30031a(c9624v0, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9560t3 interfaceC9560t3) {
        C9214a4.m30036f(interfaceC9560t3);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9386d2 interfaceC9386d2, String str) {
        C9214a4.m30040j().mo31155p(th, interfaceC9386d2, str);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: q */
    public C9647x4 mo31156q() {
        return C9214a4.m30040j().mo31156q();
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: r */
    public C9525q mo31157r(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1, C9479m3 c9479m3) {
        return C9214a4.m30040j().mo31157r(c9532x, c9495o5, c9484n1, c9479m3);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: s */
    public /* synthetic */ C9525q mo31158s(C9416h4 c9416h4) {
        return C9592u1.m31761b(this, c9416h4);
    }

    @Override // io.sentry.InterfaceC9625v1
    public void startSession() {
        C9214a4.m30050t();
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: t */
    public C9525q mo31159t(C9473l4 c9473l4, C9484n1 c9484n1) {
        return C9214a4.m30034d(c9473l4, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9625v1 m41049clone() {
        return C9214a4.m30040j().m41050clone();
    }
}
