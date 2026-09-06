package kotlin.reflect.p371y.internal.p374j0.p400i;

import android.R;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.C10742u;
import kotlin.collections.C10780s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;

/* compiled from: overridingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.l */
/* loaded from: classes3.dex */
public final class C10162l {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.l$a */
    static final class a<H> extends Lambda implements Function1<H, C10742u> {

        /* renamed from: f */
        final /* synthetic */ C10739f<H> f39546f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10739f<H> c10739f) {
            super(1);
            this.f39546f = c10739f;
        }

        /* renamed from: b */
        public final void m35987b(H h2) {
            C10739f<H> c10739f = this.f39546f;
            C9768m.m32345e(h2, "it");
            c10739f.add(h2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10742u invoke(Object obj) {
            m35987b(obj);
            return C10742u.f41439a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <H> Collection<H> m35986a(Collection<? extends H> collection, Function1<? super H, ? extends InterfaceC10540a> function1) {
        C9768m.m32346f(collection, "<this>");
        C9768m.m32346f(function1, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C10739f m38544a = C10739f.f41432f.m38544a();
        while (!linkedList.isEmpty()) {
            Object m38830U = C10780s.m38830U(linkedList);
            C10739f m38544a2 = C10739f.f41432f.m38544a();
            Collection<R.attr> m35873p = C10160j.m35873p(m38830U, linkedList, function1, new a(m38544a2));
            C9768m.m32345e(m35873p, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (m35873p.size() == 1 && m38544a2.isEmpty()) {
                Object m38864r0 = C10780s.m38864r0(m35873p);
                C9768m.m32345e(m38864r0, "overridableGroup.single()");
                m38544a.add(m38864r0);
            } else {
                R.attr attrVar = (Object) C10160j.m35857L(m35873p, function1);
                C9768m.m32345e(attrVar, "selectMostSpecificMember…roup, descriptorByHandle)");
                InterfaceC10540a invoke = function1.invoke(attrVar);
                for (R.attr attrVar2 : m35873p) {
                    C9768m.m32345e(attrVar2, "it");
                    if (!C10160j.m35850B(invoke, function1.invoke(attrVar2))) {
                        m38544a2.add(attrVar2);
                    }
                }
                if (!m38544a2.isEmpty()) {
                    m38544a.addAll(m38544a2);
                }
                m38544a.add(attrVar);
            }
        }
        return m38544a;
    }
}
