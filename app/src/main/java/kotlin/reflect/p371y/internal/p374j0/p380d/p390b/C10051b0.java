package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10036s;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10336m1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10414n;

/* compiled from: typeSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.b0 */
/* loaded from: classes3.dex */
public final class C10051b0 {
    /* renamed from: a */
    public static final <T> T m33888a(InterfaceC10064m<T> interfaceC10064m, T t, boolean z) {
        C9768m.m32346f(interfaceC10064m, "<this>");
        C9768m.m32346f(t, "possiblyPrimitiveType");
        return z ? interfaceC10064m.mo34009d(t) : t;
    }

    /* renamed from: b */
    public static final <T> T m33889b(InterfaceC10336m1 interfaceC10336m1, InterfaceC10409i interfaceC10409i, InterfaceC10064m<T> interfaceC10064m, C10049a0 c10049a0) {
        C9768m.m32346f(interfaceC10336m1, "<this>");
        C9768m.m32346f(interfaceC10409i, "type");
        C9768m.m32346f(interfaceC10064m, "typeFactory");
        C9768m.m32346f(c10049a0, "mode");
        InterfaceC10414n mo35977w = interfaceC10336m1.mo35977w(interfaceC10409i);
        if (!interfaceC10336m1.mo35928V(mo35977w)) {
            return null;
        }
        EnumC9882i mo35950i0 = interfaceC10336m1.mo35950i0(mo35977w);
        boolean z = true;
        if (mo35950i0 != null) {
            T mo34011f = interfaceC10064m.mo34011f(mo35950i0);
            if (!interfaceC10336m1.mo35964p0(interfaceC10409i) && !C10036s.m33779c(interfaceC10336m1, interfaceC10409i)) {
                z = false;
            }
            return (T) m33888a(interfaceC10064m, mo34011f, z);
        }
        EnumC9882i mo35955l = interfaceC10336m1.mo35955l(mo35977w);
        if (mo35955l != null) {
            return interfaceC10064m.mo34007b('[' + EnumC10207e.m36115q(mo35955l).m36116u());
        }
        if (interfaceC10336m1.mo35949i(mo35977w)) {
            C10128d mo35917K = interfaceC10336m1.mo35917K(mo35977w);
            C10126b m32929n = mo35917K != null ? C9896c.f37667a.m32929n(mo35917K) : null;
            if (m32929n != null) {
                if (!c10049a0.m33855a()) {
                    List<C9896c.a> m32925i = C9896c.f37667a.m32925i();
                    if (!(m32925i instanceof Collection) || !m32925i.isEmpty()) {
                        Iterator<T> it = m32925i.iterator();
                        while (it.hasNext()) {
                            if (C9768m.m32341a(((C9896c.a) it.next()).m32935d(), m32929n)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String m36111f = C10206d.m36107b(m32929n).m36111f();
                C9768m.m32345e(m36111f, "byClassId(classId).internalName");
                return interfaceC10064m.mo34008c(m36111f);
            }
        }
        return null;
    }
}
