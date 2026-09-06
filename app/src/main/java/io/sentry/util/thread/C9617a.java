package io.sentry.util.thread;

import io.sentry.protocol.C9531w;

/* compiled from: IMainThreadChecker.java */
/* renamed from: io.sentry.util.thread.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9617a {
    /* renamed from: a */
    public static boolean m31812a(InterfaceC9618b _this) {
        return _this.mo30276c(Thread.currentThread());
    }

    /* renamed from: b */
    public static boolean m31813b(InterfaceC9618b _this, C9531w c9531w) {
        Long m31516l = c9531w.m31516l();
        return m31516l != null && _this.mo30274a(m31516l.longValue());
    }

    /* renamed from: c */
    public static boolean m31814c(InterfaceC9618b _this, Thread thread) {
        return _this.mo30274a(thread.getId());
    }
}
