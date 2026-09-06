package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10556f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.h */
/* loaded from: classes3.dex */
public final class C10364h {

    /* renamed from: a */
    private static final C10556f0<C10372p<AbstractC10380x>> f40184a = new C10556f0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C10556f0<C10372p<AbstractC10380x>> m36932a() {
        return f40184a;
    }

    /* renamed from: b */
    public static final List<AbstractC10311e0> m36933b(AbstractC10363g abstractC10363g, Iterable<? extends AbstractC10311e0> iterable) {
        C9768m.m32346f(abstractC10363g, "<this>");
        C9768m.m32346f(iterable, "types");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(iterable, 10));
        Iterator<? extends AbstractC10311e0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC10363g.mo36717a(it.next()));
        }
        return arrayList;
    }
}
