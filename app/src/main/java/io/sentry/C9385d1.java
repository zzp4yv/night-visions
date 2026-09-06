package io.sentry;

import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiagnosticLogger.java */
@ApiStatus.Internal
/* renamed from: io.sentry.d1 */
/* loaded from: classes2.dex */
public final class C9385d1 implements InterfaceC9637w1 {

    /* renamed from: a */
    private final C9647x4 f36261a;

    /* renamed from: b */
    private final InterfaceC9637w1 f36262b;

    public C9385d1(C9647x4 c9647x4, InterfaceC9637w1 interfaceC9637w1) {
        this.f36261a = (C9647x4) C9613q.m31802c(c9647x4, "SentryOptions is required.");
        this.f36262b = interfaceC9637w1;
    }

    @Override // io.sentry.InterfaceC9637w1
    /* renamed from: a */
    public void mo30212a(EnumC9554s4 enumC9554s4, Throwable th, String str, Object... objArr) {
        if (this.f36262b == null || !mo30215d(enumC9554s4)) {
            return;
        }
        this.f36262b.mo30212a(enumC9554s4, th, str, objArr);
    }

    @Override // io.sentry.InterfaceC9637w1
    /* renamed from: b */
    public void mo30213b(EnumC9554s4 enumC9554s4, String str, Throwable th) {
        if (this.f36262b == null || !mo30215d(enumC9554s4)) {
            return;
        }
        this.f36262b.mo30213b(enumC9554s4, str, th);
    }

    @Override // io.sentry.InterfaceC9637w1
    /* renamed from: c */
    public void mo30214c(EnumC9554s4 enumC9554s4, String str, Object... objArr) {
        if (this.f36262b == null || !mo30215d(enumC9554s4)) {
            return;
        }
        this.f36262b.mo30214c(enumC9554s4, str, objArr);
    }

    @Override // io.sentry.InterfaceC9637w1
    /* renamed from: d */
    public boolean mo30215d(EnumC9554s4 enumC9554s4) {
        return enumC9554s4 != null && this.f36261a.isDebug() && enumC9554s4.ordinal() >= this.f36261a.getDiagnosticLevel().ordinal();
    }
}
