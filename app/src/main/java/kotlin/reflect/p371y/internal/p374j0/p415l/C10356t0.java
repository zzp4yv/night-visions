package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t0 */
/* loaded from: classes3.dex */
public final class C10356t0 {

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t0$a */
    public static final class a extends AbstractC10315f1 {

        /* renamed from: d */
        final /* synthetic */ List<InterfaceC10312e1> f40178d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends InterfaceC10312e1> list) {
            this.f40178d = list;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1
        /* renamed from: k */
        public InterfaceC10318g1 mo36679k(InterfaceC10312e1 interfaceC10312e1) {
            C9768m.m32346f(interfaceC10312e1, RoomNotification.KEY);
            if (!this.f40178d.contains(interfaceC10312e1)) {
                return null;
            }
            InterfaceC10561h mo32887c = interfaceC10312e1.mo32887c();
            C9768m.m32344d(mo32887c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return C10339n1.m36786s((InterfaceC10554e1) mo32887c);
        }
    }

    /* renamed from: a */
    private static final AbstractC10311e0 m36827a(List<? extends InterfaceC10312e1> list, List<? extends AbstractC10311e0> list2, AbstractC9881h abstractC9881h) {
        AbstractC10311e0 m36759p = C10333l1.m36747g(new a(list)).m36759p((AbstractC10311e0) C10780s.m38830U(list2), EnumC10351r1.OUT_VARIANCE);
        if (m36759p == null) {
            m36759p = abstractC9881h.m32805y();
        }
        C9768m.m32345e(m36759p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return m36759p;
    }

    /* renamed from: b */
    public static final AbstractC10311e0 m36828b(InterfaceC10554e1 interfaceC10554e1) {
        C9768m.m32346f(interfaceC10554e1, "<this>");
        InterfaceC10576m mo32876b = interfaceC10554e1.mo32876b();
        C9768m.m32345e(mo32876b, "this.containingDeclaration");
        if (mo32876b instanceof InterfaceC10564i) {
            List<InterfaceC10554e1> parameters = ((InterfaceC10564i) mo32876b).mo32877h().getParameters();
            C9768m.m32345e(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                InterfaceC10312e1 mo32877h = ((InterfaceC10554e1) it.next()).mo32877h();
                C9768m.m32345e(mo32877h, "it.typeConstructor");
                arrayList.add(mo32877h);
            }
            List<AbstractC10311e0> upperBounds = interfaceC10554e1.getUpperBounds();
            C9768m.m32345e(upperBounds, "upperBounds");
            return m36827a(arrayList, upperBounds, C10202a.m36072f(interfaceC10554e1));
        }
        if (!(mo32876b instanceof InterfaceC10705y)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<InterfaceC10554e1> typeParameters = ((InterfaceC10705y) mo32876b).getTypeParameters();
        C9768m.m32345e(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            InterfaceC10312e1 mo32877h2 = ((InterfaceC10554e1) it2.next()).mo32877h();
            C9768m.m32345e(mo32877h2, "it.typeConstructor");
            arrayList2.add(mo32877h2);
        }
        List<AbstractC10311e0> upperBounds2 = interfaceC10554e1.getUpperBounds();
        C9768m.m32345e(upperBounds2, "upperBounds");
        return m36827a(arrayList2, upperBounds2, C10202a.m36072f(interfaceC10554e1));
    }
}
