package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: CompanionObjectMappingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.b.d */
/* loaded from: classes2.dex */
public final class C9877d {
    /* renamed from: a */
    public static final boolean m32702a(C9876c c9876c, InterfaceC10552e interfaceC10552e) {
        boolean m38577K;
        C9768m.m32346f(c9876c, "<this>");
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        if (C10154d.m35836x(interfaceC10552e)) {
            Set<C10126b> m32701b = c9876c.m32701b();
            C10126b m36073g = C10202a.m36073g(interfaceC10552e);
            m38577K = C10749c0.m38577K(m32701b, m36073g != null ? m36073g.m35412g() : null);
            if (m38577K) {
                return true;
            }
        }
        return false;
    }
}
