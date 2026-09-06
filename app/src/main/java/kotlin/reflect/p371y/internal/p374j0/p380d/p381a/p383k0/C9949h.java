package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9972k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: util.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.h */
/* loaded from: classes2.dex */
public final class C9949h {
    /* renamed from: a */
    public static final List<InterfaceC10566i1> m33225a(Collection<? extends AbstractC10311e0> collection, Collection<? extends InterfaceC10566i1> collection2, InterfaceC10540a interfaceC10540a) {
        List<Pair> m38580L0;
        C9768m.m32346f(collection, "newValueParameterTypes");
        C9768m.m32346f(collection2, "oldValueParameters");
        C9768m.m32346f(interfaceC10540a, "newOwner");
        collection.size();
        collection2.size();
        m38580L0 = C10749c0.m38580L0(collection, collection2);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38580L0, 10));
        for (Pair pair : m38580L0) {
            AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) pair.m37646a();
            InterfaceC10566i1 interfaceC10566i1 = (InterfaceC10566i1) pair.m37647b();
            int mo37696g = interfaceC10566i1.mo37696g();
            InterfaceC10587g annotations = interfaceC10566i1.getAnnotations();
            C10130f name = interfaceC10566i1.getName();
            C9768m.m32345e(name, "oldParameter.name");
            boolean mo37698u0 = interfaceC10566i1.mo37698u0();
            boolean mo37695b0 = interfaceC10566i1.mo37695b0();
            boolean mo37694Y = interfaceC10566i1.mo37694Y();
            AbstractC10311e0 m32793k = interfaceC10566i1.mo37697l0() != null ? C10202a.m36078l(interfaceC10540a).mo37021o().m32793k(abstractC10311e0) : null;
            InterfaceC10708z0 mo32883t = interfaceC10566i1.mo32883t();
            C9768m.m32345e(mo32883t, "oldParameter.source");
            arrayList.add(new C10627l0(interfaceC10540a, null, mo37696g, annotations, name, abstractC10311e0, mo37698u0, mo37695b0, mo37694Y, m32793k, mo32883t));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C9972k m33226b(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "<this>");
        InterfaceC10552e m36082p = C10202a.m36082p(interfaceC10552e);
        if (m36082p == null) {
            return null;
        }
        InterfaceC10218h mo32866S = m36082p.mo32866S();
        C9972k c9972k = mo32866S instanceof C9972k ? (C9972k) mo32866S : null;
        return c9972k == null ? m33226b(m36082p) : c9972k;
    }
}
