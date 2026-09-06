package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.protocol.EnumC9534z;
import okhttp3.HttpUrl;

/* compiled from: NoOpTransaction.java */
/* renamed from: io.sentry.d3 */
/* loaded from: classes2.dex */
public final class C9387d3 implements InterfaceC9393e2 {

    /* renamed from: a */
    private static final C9387d3 f36263a = new C9387d3();

    private C9387d3() {
    }

    /* renamed from: r */
    public static C9387d3 m30717r() {
        return f36263a;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: a */
    public C9495o5 mo30515a() {
        return new C9495o5(C9525q.f36725f, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: b */
    public boolean mo30516b() {
        return true;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: c */
    public boolean mo30517c(AbstractC9402f4 abstractC9402f4) {
        return false;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: d */
    public void mo30518d(EnumC9460j5 enumC9460j5) {
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: e */
    public void mo30519e(EnumC9460j5 enumC9460j5, boolean z) {
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: f */
    public InterfaceC9386d2 mo30520f(String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2) {
        return C9341c3.m30546r();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: g */
    public void mo30521g() {
    }

    @Override // io.sentry.InterfaceC9386d2
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.InterfaceC9393e2
    public String getName() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // io.sentry.InterfaceC9386d2
    public EnumC9460j5 getStatus() {
        return null;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: h */
    public void mo30522h(String str, Number number, InterfaceC9626v2 interfaceC9626v2) {
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: i */
    public C9396e5 mo30523i() {
        return null;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: j */
    public void mo30524j(String str) {
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: k */
    public C9525q mo30525k() {
        return C9525q.f36725f;
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: l */
    public void mo30526l() {
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: m */
    public C9403f5 mo30527m() {
        return new C9403f5(C9525q.f36725f, C9417h5.f36344f, "op", null, null);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: n */
    public AbstractC9402f4 mo30528n() {
        return new C9628v4();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: o */
    public void mo30529o(EnumC9460j5 enumC9460j5, AbstractC9402f4 abstractC9402f4) {
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: p */
    public EnumC9534z mo30530p() {
        return EnumC9534z.CUSTOM;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: q */
    public AbstractC9402f4 mo30531q() {
        return new C9628v4();
    }
}
