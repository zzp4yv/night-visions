package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;

/* compiled from: NoOpHub.java */
/* renamed from: io.sentry.y2 */
/* loaded from: classes2.dex */
public final class C9651y2 implements InterfaceC9625v1 {

    /* renamed from: a */
    private static final C9651y2 f37020a = new C9651y2();

    /* renamed from: b */
    private final C9647x4 f37021b = C9647x4.empty();

    private C9651y2() {
    }

    /* renamed from: a */
    public static C9651y2 m31957a() {
        return f37020a;
    }

    @Override // io.sentry.InterfaceC9625v1
    public void close() {
    }

    @Override // io.sentry.InterfaceC9625v1
    public void endSession() {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: h */
    public void mo31147h(long j2) {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9624v0 c9624v0) {
        C9592u1.m31760a(this, c9624v0);
    }

    @Override // io.sentry.InterfaceC9625v1
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: j */
    public C9525q mo31149j(C9416h4 c9416h4, C9484n1 c9484n1) {
        return C9525q.f36725f;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: k */
    public /* synthetic */ C9525q mo31150k(C9473l4 c9473l4) {
        return C9592u1.m31762c(this, c9473l4);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: l */
    public InterfaceC9393e2 mo31151l(C9548r5 c9548r5, C9562t5 c9562t5) {
        return C9387d3.m30717r();
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: m */
    public /* synthetic */ C9525q mo31152m(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1) {
        return C9592u1.m31763d(this, c9532x, c9495o5, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: n */
    public void mo31153n(C9624v0 c9624v0, C9484n1 c9484n1) {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9560t3 interfaceC9560t3) {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9386d2 interfaceC9386d2, String str) {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: q */
    public C9647x4 mo31156q() {
        return this.f37021b;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: r */
    public C9525q mo31157r(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1, C9479m3 c9479m3) {
        return C9525q.f36725f;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: s */
    public /* synthetic */ C9525q mo31158s(C9416h4 c9416h4) {
        return C9592u1.m31761b(this, c9416h4);
    }

    @Override // io.sentry.InterfaceC9625v1
    public void startSession() {
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: t */
    public C9525q mo31159t(C9473l4 c9473l4, C9484n1 c9484n1) {
        return C9525q.f36725f;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9625v1 m41050clone() {
        return f37020a;
    }
}
