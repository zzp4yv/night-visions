package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.InterfaceC9580q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidCurrentDateProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.g */
/* loaded from: classes2.dex */
public final class C9277g implements InterfaceC9580q {

    /* renamed from: a */
    private static final InterfaceC9580q f35994a = new C9277g();

    private C9277g() {
    }

    /* renamed from: b */
    public static InterfaceC9580q m30272b() {
        return f35994a;
    }

    @Override // io.sentry.transport.InterfaceC9580q
    /* renamed from: a */
    public long mo30147a() {
        return SystemClock.uptimeMillis();
    }
}
