package kotlin.reflect.p371y.internal.p374j0.p415l.p421y1;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10170d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10168b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10330k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y1.b */
/* loaded from: classes3.dex */
public final class C10428b {

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40390a;

        static {
            int[] iArr = new int[EnumC10351r1.values().length];
            iArr[EnumC10351r1.INVARIANT.ordinal()] = 1;
            iArr[EnumC10351r1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC10351r1.OUT_VARIANCE.ordinal()] = 3;
            f40390a = iArr;
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$b */
    static final class b extends Lambda implements Function1<AbstractC10348q1, Boolean> {

        /* renamed from: f */
        public static final b f40391f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10348q1 abstractC10348q1) {
            C9768m.m32345e(abstractC10348q1, "it");
            return Boolean.valueOf(C10170d.m36008d(abstractC10348q1));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$c */
    public static final class c extends AbstractC10315f1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1
        /* renamed from: k */
        public InterfaceC10318g1 mo36679k(InterfaceC10312e1 interfaceC10312e1) {
            C9768m.m32346f(interfaceC10312e1, RoomNotification.KEY);
            InterfaceC10168b interfaceC10168b = interfaceC10312e1 instanceof InterfaceC10168b ? (InterfaceC10168b) interfaceC10312e1 : null;
            if (interfaceC10168b == null) {
                return null;
            }
            return interfaceC10168b.mo35997f().mo36710c() ? new C10324i1(EnumC10351r1.OUT_VARIANCE, interfaceC10168b.mo35997f().getType()) : interfaceC10168b.mo35997f();
        }
    }

    /* renamed from: a */
    public static final C10427a<AbstractC10311e0> m37167a(AbstractC10311e0 abstractC10311e0) {
        List<Pair> m38580L0;
        Object m37171e;
        C9768m.m32346f(abstractC10311e0, "type");
        if (C10302b0.m36583b(abstractC10311e0)) {
            C10427a<AbstractC10311e0> m37167a = m37167a(C10302b0.m36584c(abstractC10311e0));
            C10427a<AbstractC10311e0> m37167a2 = m37167a(C10302b0.m36585d(abstractC10311e0));
            return new C10427a<>(C10345p1.m36804b(C10314f0.m36664d(C10302b0.m36584c(m37167a.m37165c()), C10302b0.m36585d(m37167a2.m37165c())), abstractC10311e0), C10345p1.m36804b(C10314f0.m36664d(C10302b0.m36584c(m37167a.m37166d()), C10302b0.m36585d(m37167a2.m37166d())), abstractC10311e0));
        }
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        if (C10170d.m36008d(abstractC10311e0)) {
            C9768m.m32344d(mo35993O0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC10318g1 mo35997f = ((InterfaceC10168b) mo35993O0).mo35997f();
            AbstractC10311e0 type = mo35997f.getType();
            C9768m.m32345e(type, "typeProjection.type");
            AbstractC10311e0 m37168b = m37168b(type, abstractC10311e0);
            int i2 = a.f40390a[mo35997f.mo36708a().ordinal()];
            if (i2 == 2) {
                AbstractC10335m0 m32774I = C10424a.m37142h(abstractC10311e0).m32774I();
                C9768m.m32345e(m32774I, "type.builtIns.nullableAnyType");
                return new C10427a<>(m37168b, m32774I);
            }
            if (i2 == 3) {
                AbstractC10335m0 m32773H = C10424a.m37142h(abstractC10311e0).m32773H();
                C9768m.m32345e(m32773H, "type.builtIns.nothingType");
                return new C10427a<>(m37168b(m32773H, abstractC10311e0), m37168b);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + mo35997f);
        }
        if (abstractC10311e0.mo35991M0().isEmpty() || abstractC10311e0.mo35991M0().size() != mo35993O0.getParameters().size()) {
            return new C10427a<>(abstractC10311e0, abstractC10311e0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<InterfaceC10318g1> mo35991M0 = abstractC10311e0.mo35991M0();
        List<InterfaceC10554e1> parameters = mo35993O0.getParameters();
        C9768m.m32345e(parameters, "typeConstructor.parameters");
        m38580L0 = C10749c0.m38580L0(mo35991M0, parameters);
        for (Pair pair : m38580L0) {
            InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) pair.m37646a();
            InterfaceC10554e1 interfaceC10554e1 = (InterfaceC10554e1) pair.m37647b();
            C9768m.m32345e(interfaceC10554e1, "typeParameter");
            C10429c m37173g = m37173g(interfaceC10318g1, interfaceC10554e1);
            if (interfaceC10318g1.mo36710c()) {
                arrayList.add(m37173g);
                arrayList2.add(m37173g);
            } else {
                C10427a<C10429c> m37170d = m37170d(m37173g);
                C10429c m37163a = m37170d.m37163a();
                C10429c m37164b = m37170d.m37164b();
                arrayList.add(m37163a);
                arrayList2.add(m37164b);
            }
        }
        boolean z = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C10429c) it.next()).m37180d()) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            m37171e = C10424a.m37142h(abstractC10311e0).m32773H();
            C9768m.m32345e(m37171e, "type.builtIns.nothingType");
        } else {
            m37171e = m37171e(abstractC10311e0, arrayList);
        }
        return new C10427a<>(m37171e, m37171e(abstractC10311e0, arrayList2));
    }

    /* renamed from: b */
    private static final AbstractC10311e0 m37168b(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        AbstractC10311e0 m36784q = C10339n1.m36784q(abstractC10311e0, abstractC10311e02.mo33691P0());
        C9768m.m32345e(m36784q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return m36784q;
    }

    /* renamed from: c */
    public static final InterfaceC10318g1 m37169c(InterfaceC10318g1 interfaceC10318g1, boolean z) {
        if (interfaceC10318g1 == null) {
            return null;
        }
        if (interfaceC10318g1.mo36710c()) {
            return interfaceC10318g1;
        }
        AbstractC10311e0 type = interfaceC10318g1.getType();
        C9768m.m32345e(type, "typeProjection.type");
        if (!C10339n1.m36770c(type, b.f40391f)) {
            return interfaceC10318g1;
        }
        EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
        C9768m.m32345e(mo36708a, "typeProjection.projectionKind");
        return mo36708a == EnumC10351r1.OUT_VARIANCE ? new C10324i1(mo36708a, m37167a(type).m37166d()) : z ? new C10324i1(mo36708a, m37167a(type).m37165c()) : m37172f(interfaceC10318g1);
    }

    /* renamed from: d */
    private static final C10427a<C10429c> m37170d(C10429c c10429c) {
        C10427a<AbstractC10311e0> m37167a = m37167a(c10429c.m37177a());
        AbstractC10311e0 m37163a = m37167a.m37163a();
        AbstractC10311e0 m37164b = m37167a.m37164b();
        C10427a<AbstractC10311e0> m37167a2 = m37167a(c10429c.m37178b());
        return new C10427a<>(new C10429c(c10429c.m37179c(), m37164b, m37167a2.m37163a()), new C10429c(c10429c.m37179c(), m37163a, m37167a2.m37164b()));
    }

    /* renamed from: e */
    private static final AbstractC10311e0 m37171e(AbstractC10311e0 abstractC10311e0, List<C10429c> list) {
        abstractC10311e0.mo35991M0().size();
        list.size();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m37174h((C10429c) it.next()));
        }
        return C10330k1.m36738e(abstractC10311e0, arrayList, null, null, 6, null);
    }

    /* renamed from: f */
    private static final InterfaceC10318g1 m37172f(InterfaceC10318g1 interfaceC10318g1) {
        C10333l1 m36747g = C10333l1.m36747g(new c());
        C9768m.m32345e(m36747g, "create(object : TypeCons…ojection\n        }\n    })");
        return m36747g.m36761t(interfaceC10318g1);
    }

    /* renamed from: g */
    private static final C10429c m37173g(InterfaceC10318g1 interfaceC10318g1, InterfaceC10554e1 interfaceC10554e1) {
        int i2 = a.f40390a[C10333l1.m36743c(interfaceC10554e1.mo37672n(), interfaceC10318g1).ordinal()];
        if (i2 == 1) {
            AbstractC10311e0 type = interfaceC10318g1.getType();
            C9768m.m32345e(type, "type");
            AbstractC10311e0 type2 = interfaceC10318g1.getType();
            C9768m.m32345e(type2, "type");
            return new C10429c(interfaceC10554e1, type, type2);
        }
        if (i2 == 2) {
            AbstractC10311e0 type3 = interfaceC10318g1.getType();
            C9768m.m32345e(type3, "type");
            AbstractC10335m0 m32774I = C10202a.m36072f(interfaceC10554e1).m32774I();
            C9768m.m32345e(m32774I, "typeParameter.builtIns.nullableAnyType");
            return new C10429c(interfaceC10554e1, type3, m32774I);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC10335m0 m32773H = C10202a.m36072f(interfaceC10554e1).m32773H();
        C9768m.m32345e(m32773H, "typeParameter.builtIns.nothingType");
        AbstractC10311e0 type4 = interfaceC10318g1.getType();
        C9768m.m32345e(type4, "type");
        return new C10429c(interfaceC10554e1, m32773H, type4);
    }

    /* renamed from: h */
    private static final InterfaceC10318g1 m37174h(C10429c c10429c) {
        c10429c.m37180d();
        if (!C9768m.m32341a(c10429c.m37177a(), c10429c.m37178b())) {
            EnumC10351r1 mo37672n = c10429c.m37179c().mo37672n();
            EnumC10351r1 enumC10351r1 = EnumC10351r1.IN_VARIANCE;
            if (mo37672n != enumC10351r1) {
                return (!AbstractC9881h.m32750m0(c10429c.m37177a()) || c10429c.m37179c().mo37672n() == enumC10351r1) ? AbstractC9881h.m32752o0(c10429c.m37178b()) ? new C10324i1(m37175i(c10429c, enumC10351r1), c10429c.m37177a()) : new C10324i1(m37175i(c10429c, EnumC10351r1.OUT_VARIANCE), c10429c.m37178b()) : new C10324i1(m37175i(c10429c, EnumC10351r1.OUT_VARIANCE), c10429c.m37178b());
            }
        }
        return new C10324i1(c10429c.m37177a());
    }

    /* renamed from: i */
    private static final EnumC10351r1 m37175i(C10429c c10429c, EnumC10351r1 enumC10351r1) {
        return enumC10351r1 == c10429c.m37179c().mo37672n() ? EnumC10351r1.INVARIANT : enumC10351r1;
    }
}
