package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10399w;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: IntersectionType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.d */
/* loaded from: classes3.dex */
public final class C10360d {
    /* renamed from: a */
    public static final AbstractC10348q1 m36918a(List<? extends AbstractC10348q1> list) {
        AbstractC10335m0 m37161W0;
        C9768m.m32346f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (AbstractC10348q1) C10780s.m38866s0(list);
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        boolean z = false;
        boolean z2 = false;
        for (AbstractC10348q1 abstractC10348q1 : list) {
            z = z || C10317g0.m36706a(abstractC10348q1);
            if (abstractC10348q1 instanceof AbstractC10335m0) {
                m37161W0 = (AbstractC10335m0) abstractC10348q1;
            } else {
                if (!(abstractC10348q1 instanceof AbstractC10425y)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (C10399w.m37085a(abstractC10348q1)) {
                    return abstractC10348q1;
                }
                m37161W0 = ((AbstractC10425y) abstractC10348q1).m37161W0();
                z2 = true;
            }
            arrayList.add(m37161W0);
        }
        if (z) {
            return C10394k.m37053d(EnumC10393j.f40350y0, list.toString());
        }
        if (!z2) {
            return C10379w.f40213a.m36970c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C10302b0.m36585d((AbstractC10348q1) it.next()));
        }
        C10379w c10379w = C10379w.f40213a;
        return C10314f0.m36664d(c10379w.m36970c(arrayList), c10379w.m36970c(arrayList2));
    }
}
