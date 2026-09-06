package io.sentry;

import io.sentry.protocol.C9527s;
import io.sentry.protocol.C9532x;

/* compiled from: SentryRuntimeEventProcessor.java */
/* renamed from: io.sentry.y4 */
/* loaded from: classes2.dex */
final class C9653y4 implements InterfaceC9463k1 {

    /* renamed from: f */
    private final String f37023f;

    /* renamed from: g */
    private final String f37024g;

    public C9653y4(String str, String str2) {
        this.f37023f = str;
        this.f37024g = str2;
    }

    /* renamed from: a */
    private <T extends AbstractC9342c4> T m31958a(T t) {
        if (t.m30575C().m31233d() == null) {
            t.m30575C().m31241m(new C9527s());
        }
        C9527s m31233d = t.m30575C().m31233d();
        if (m31233d != null && m31233d.m31459d() == null && m31233d.m31460e() == null) {
            m31233d.m31461f(this.f37024g);
            m31233d.m31463h(this.f37023f);
        }
        return t;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        return (C9473l4) m31958a(c9473l4);
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        return (C9532x) m31958a(c9532x);
    }

    public C9653y4() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
