package io.sentry.util;

import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: LogUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.p */
/* loaded from: classes2.dex */
public final class C9612p {
    /* renamed from: a */
    public static void m31799a(Class<?> cls, Object obj, InterfaceC9637w1 interfaceC9637w1) {
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        Object[] objArr = new Object[2];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        objArr[1] = cls.getCanonicalName();
        interfaceC9637w1.mo30214c(enumC9554s4, "%s is not %s", objArr);
    }
}
