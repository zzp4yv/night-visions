package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: mappingUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.j */
/* loaded from: classes2.dex */
public final class C9903j {
    /* renamed from: a */
    public static final AbstractC10315f1 m33012a(InterfaceC10552e interfaceC10552e, InterfaceC10552e interfaceC10552e2) {
        List m38580L0;
        Map m38805q;
        C9768m.m32346f(interfaceC10552e, "from");
        C9768m.m32346f(interfaceC10552e2, "to");
        interfaceC10552e.mo32884w().size();
        interfaceC10552e2.mo32884w().size();
        AbstractC10315f1.a aVar = AbstractC10315f1.f40104c;
        List<InterfaceC10554e1> mo32884w = interfaceC10552e.mo32884w();
        C9768m.m32345e(mo32884w, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo32884w, 10));
        Iterator<T> it = mo32884w.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10554e1) it.next()).mo32877h());
        }
        List<InterfaceC10554e1> mo32884w2 = interfaceC10552e2.mo32884w();
        C9768m.m32345e(mo32884w2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(mo32884w2, 10));
        Iterator<T> it2 = mo32884w2.iterator();
        while (it2.hasNext()) {
            AbstractC10335m0 mo36400s = ((InterfaceC10554e1) it2.next()).mo36400s();
            C9768m.m32345e(mo36400s, "it.defaultType");
            arrayList2.add(C10424a.m37135a(mo36400s));
        }
        m38580L0 = C10749c0.m38580L0(arrayList, arrayList2);
        m38805q = C10777q0.m38805q(m38580L0);
        return AbstractC10315f1.a.m36680e(aVar, m38805q, false, 2, null);
    }
}
