package io.sentry.util.thread;

import io.sentry.protocol.C9531w;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.thread.c */
/* loaded from: classes2.dex */
public final class C9619c implements InterfaceC9618b {

    /* renamed from: a */
    private static final long f36937a = Thread.currentThread().getId();

    /* renamed from: b */
    private static final C9619c f36938b = new C9619c();

    private C9619c() {
    }

    /* renamed from: e */
    public static C9619c m31815e() {
        return f36938b;
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return f36937a == j2;
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: b */
    public /* synthetic */ boolean mo30275b(C9531w c9531w) {
        return C9617a.m31813b(this, c9531w);
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: c */
    public /* synthetic */ boolean mo30276c(Thread thread) {
        return C9617a.m31814c(this, thread);
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: d */
    public /* synthetic */ boolean mo30277d() {
        return C9617a.m31812a(this);
    }
}
