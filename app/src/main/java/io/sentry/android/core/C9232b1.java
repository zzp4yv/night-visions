package io.sentry.android.core;

import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;

/* compiled from: LoadClass.java */
/* renamed from: io.sentry.android.core.b1 */
/* loaded from: classes2.dex */
public final class C9232b1 {
    /* renamed from: a */
    public boolean m30151a(String str, InterfaceC9637w1 interfaceC9637w1) {
        return m30153c(str, interfaceC9637w1) != null;
    }

    /* renamed from: b */
    public boolean m30152b(String str, C9647x4 c9647x4) {
        return m30151a(str, c9647x4 != null ? c9647x4.getLogger() : null);
    }

    /* renamed from: c */
    public Class<?> m30153c(String str, InterfaceC9637w1 interfaceC9637w1) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            if (interfaceC9637w1 == null) {
                return null;
            }
            interfaceC9637w1.mo30213b(EnumC9554s4.DEBUG, "Class not available:" + str, e2);
            return null;
        } catch (UnsatisfiedLinkError e3) {
            if (interfaceC9637w1 == null) {
                return null;
            }
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e3);
            return null;
        } catch (Throwable th) {
            if (interfaceC9637w1 == null) {
                return null;
            }
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }
}
