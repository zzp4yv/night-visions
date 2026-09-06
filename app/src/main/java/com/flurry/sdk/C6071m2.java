package com.flurry.sdk;

/* renamed from: com.flurry.sdk.m2 */
/* loaded from: classes2.dex */
public final class C6071m2 {

    /* renamed from: a */
    static C6071m2 f16132a;

    /* renamed from: b */
    public C6132t2 f16133b = new C6132t2();

    /* renamed from: c */
    public C6184z6 f16134c;

    /* renamed from: d */
    public InterfaceC6152v6 f16135d;

    private C6071m2() {
        int m13058a = C6007f1.m13058a();
        this.f16135d = (m13058a == 0 || m13058a == 2) ? C6007f1.m13060c() ? new C6053k2() : new C6044j2() : null;
        this.f16134c = new C6184z6(this.f16135d);
    }

    /* renamed from: a */
    public static synchronized C6071m2 m13180a() {
        C6071m2 c6071m2;
        synchronized (C6071m2.class) {
            if (f16132a == null) {
                f16132a = new C6071m2();
            }
            c6071m2 = f16132a;
        }
        return c6071m2;
    }

    /* renamed from: b */
    public final void m13181b(InterfaceC6144u6 interfaceC6144u6) {
        if (interfaceC6144u6 != null) {
            this.f16133b.m13307a(interfaceC6144u6);
        } else {
            C5988d1.m13030c(5, "StreamingManager", "sendFrameToStreaming failed -- message is null");
        }
    }
}
