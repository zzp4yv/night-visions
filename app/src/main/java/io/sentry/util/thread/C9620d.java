package io.sentry.util.thread;

import io.sentry.protocol.C9531w;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpMainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.thread.d */
/* loaded from: classes2.dex */
public final class C9620d implements InterfaceC9618b {

    /* renamed from: a */
    private static final C9620d f36939a = new C9620d();

    /* renamed from: e */
    public static C9620d m31816e() {
        return f36939a;
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return false;
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
