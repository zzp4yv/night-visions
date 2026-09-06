package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.C9531w;
import io.sentry.util.thread.C9617a;
import io.sentry.util.thread.InterfaceC9618b;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidMainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.h */
/* loaded from: classes2.dex */
public final class C9278h implements InterfaceC9618b {

    /* renamed from: a */
    private static final C9278h f35995a = new C9278h();

    private C9278h() {
    }

    /* renamed from: e */
    public static C9278h m30273e() {
        return f35995a;
    }

    @Override // io.sentry.util.thread.InterfaceC9618b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return Looper.getMainLooper().getThread().getId() == j2;
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
