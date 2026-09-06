package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10362f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10402b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.k */
/* loaded from: classes3.dex */
public final class C10367k {
    /* renamed from: a */
    private static final List<InterfaceC10318g1> m36945a(AbstractC10348q1 abstractC10348q1, EnumC10402b enumC10402b) {
        List<Pair> m38580L0;
        if (abstractC10348q1.mo35991M0().size() != abstractC10348q1.mo35993O0().getParameters().size()) {
            return null;
        }
        List<InterfaceC10318g1> mo35991M0 = abstractC10348q1.mo35991M0();
        boolean z = true;
        if (!(mo35991M0 instanceof Collection) || !mo35991M0.isEmpty()) {
            Iterator<T> it = mo35991M0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((InterfaceC10318g1) it.next()).mo36708a() == EnumC10351r1.INVARIANT)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        List<InterfaceC10554e1> parameters = abstractC10348q1.mo35993O0().getParameters();
        C9768m.m32345e(parameters, "type.constructor.parameters");
        m38580L0 = C10749c0.m38580L0(mo35991M0, parameters);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38580L0, 10));
        for (Pair pair : m38580L0) {
            InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) pair.m37646a();
            InterfaceC10554e1 interfaceC10554e1 = (InterfaceC10554e1) pair.m37647b();
            if (interfaceC10318g1.mo36708a() != EnumC10351r1.INVARIANT) {
                AbstractC10348q1 mo36635R0 = (interfaceC10318g1.mo36710c() || interfaceC10318g1.mo36708a() != EnumC10351r1.IN_VARIANCE) ? null : interfaceC10318g1.getType().mo36635R0();
                C9768m.m32345e(interfaceC10554e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                interfaceC10318g1 = C10424a.m37135a(new C10365i(enumC10402b, mo36635R0, interfaceC10318g1, interfaceC10554e1));
            }
            arrayList.add(interfaceC10318g1);
        }
        C10333l1 m36726c = AbstractC10315f1.f40104c.m36682b(abstractC10348q1.mo35993O0(), arrayList).m36726c();
        int size = mo35991M0.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC10318g1 interfaceC10318g12 = mo35991M0.get(i2);
            InterfaceC10318g1 interfaceC10318g13 = (InterfaceC10318g1) arrayList.get(i2);
            if (interfaceC10318g12.mo36708a() != EnumC10351r1.INVARIANT) {
                List<AbstractC10311e0> upperBounds = abstractC10348q1.mo35993O0().getParameters().get(i2).getUpperBounds();
                C9768m.m32345e(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC10362f.a.f40182a.mo36711a(m36726c.m36758n((AbstractC10311e0) it2.next(), EnumC10351r1.INVARIANT).mo36635R0()));
                }
                if (!interfaceC10318g12.mo36710c() && interfaceC10318g12.mo36708a() == EnumC10351r1.OUT_VARIANCE) {
                    arrayList2.add(AbstractC10362f.a.f40182a.mo36711a(interfaceC10318g12.getType().mo36635R0()));
                }
                AbstractC10311e0 type = interfaceC10318g13.getType();
                C9768m.m32344d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((C10365i) type).mo35993O0().m36943j(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final AbstractC10335m0 m36946b(AbstractC10335m0 abstractC10335m0, EnumC10402b enumC10402b) {
        C9768m.m32346f(abstractC10335m0, "type");
        C9768m.m32346f(enumC10402b, "status");
        List<InterfaceC10318g1> m36945a = m36945a(abstractC10335m0, enumC10402b);
        if (m36945a != null) {
            return m36947c(abstractC10335m0, m36945a);
        }
        return null;
    }

    /* renamed from: c */
    private static final AbstractC10335m0 m36947c(AbstractC10348q1 abstractC10348q1, List<? extends InterfaceC10318g1> list) {
        return C10314f0.m36669i(abstractC10348q1.mo35992N0(), abstractC10348q1.mo35993O0(), list, abstractC10348q1.mo33691P0(), null, 16, null);
    }
}
