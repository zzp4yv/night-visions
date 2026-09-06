package io.sentry.android.core.internal.util;

import io.sentry.C9624v0;
import io.sentry.EnumC9554s4;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BreadcrumbFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.i */
/* loaded from: classes2.dex */
public class C9279i {
    /* renamed from: a */
    public static C9624v0 m30278a(String str) {
        C9624v0 c9624v0 = new C9624v0();
        c9624v0.m31844p("session");
        c9624v0.m31841m("state", str);
        c9624v0.m31840l("app.lifecycle");
        c9624v0.m31842n(EnumC9554s4.INFO);
        return c9624v0;
    }
}
