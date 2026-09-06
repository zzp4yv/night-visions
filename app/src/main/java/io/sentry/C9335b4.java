package io.sentry;

import io.sentry.util.C9615s;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryAutoDateProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.b4 */
/* loaded from: classes2.dex */
public final class C9335b4 implements InterfaceC9409g4 {

    /* renamed from: a */
    private final InterfaceC9409g4 f36152a;

    public C9335b4() {
        if (m30493b()) {
            this.f36152a = new C9501p4();
        } else {
            this.f36152a = new C9640w4();
        }
    }

    /* renamed from: b */
    private static boolean m30493b() {
        return C9615s.m31806b() && C9615s.m31805a();
    }

    @Override // io.sentry.InterfaceC9409g4
    /* renamed from: a */
    public AbstractC9402f4 mo30210a() {
        return this.f36152a.mo30210a();
    }
}
