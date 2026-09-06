package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10169c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10187p;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10319h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10308d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10402b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: KotlinTypePreparator.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC10362f extends AbstractC10319h {

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.f$a */
    public static final class a extends AbstractC10362f {

        /* renamed from: a */
        public static final a f40182a = new a();

        private a() {
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.f$b */
    /* synthetic */ class b extends C9760i implements Function1<InterfaceC10409i, AbstractC10348q1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(AbstractC10362f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final AbstractC10348q1 invoke(InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "p0");
            return ((AbstractC10362f) this.receiver).mo36711a(interfaceC10409i);
        }
    }

    /* renamed from: c */
    private final AbstractC10335m0 m36921c(AbstractC10335m0 abstractC10335m0) {
        AbstractC10311e0 type;
        InterfaceC10312e1 mo35993O0 = abstractC10335m0.mo35993O0();
        boolean z = false;
        C10308d0 c10308d0 = null;
        r5 = null;
        AbstractC10348q1 abstractC10348q1 = null;
        if (mo35993O0 instanceof C10169c) {
            C10169c c10169c = (C10169c) mo35993O0;
            InterfaceC10318g1 mo35997f = c10169c.mo35997f();
            if (!(mo35997f.mo36708a() == EnumC10351r1.IN_VARIANCE)) {
                mo35997f = null;
            }
            if (mo35997f != null && (type = mo35997f.getType()) != null) {
                abstractC10348q1 = type.mo36635R0();
            }
            AbstractC10348q1 abstractC10348q12 = abstractC10348q1;
            if (c10169c.m36001h() == null) {
                InterfaceC10318g1 mo35997f2 = c10169c.mo35997f();
                Collection<AbstractC10311e0> mo35998a = c10169c.mo35998a();
                ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35998a, 10));
                Iterator<T> it = mo35998a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC10311e0) it.next()).mo36635R0());
                }
                c10169c.m36003j(new C10366j(mo35997f2, arrayList, null, 4, null));
            }
            EnumC10402b enumC10402b = EnumC10402b.FOR_SUBTYPING;
            C10366j m36001h = c10169c.m36001h();
            C9768m.m32343c(m36001h);
            return new C10365i(enumC10402b, m36001h, abstractC10348q12, abstractC10335m0.mo35992N0(), abstractC10335m0.mo33691P0(), false, 32, null);
        }
        if (mo35993O0 instanceof C10187p) {
            Collection<AbstractC10311e0> mo35998a2 = ((C10187p) mo35993O0).mo35998a();
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(mo35998a2, 10));
            Iterator<T> it2 = mo35998a2.iterator();
            while (it2.hasNext()) {
                AbstractC10311e0 m36783p = C10339n1.m36783p((AbstractC10311e0) it2.next(), abstractC10335m0.mo33691P0());
                C9768m.m32345e(m36783p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(m36783p);
            }
            return C10314f0.m36670j(abstractC10335m0.mo35992N0(), new C10308d0(arrayList2), C10784u.m38888j(), false, abstractC10335m0.mo33553q());
        }
        if (!(mo35993O0 instanceof C10308d0) || !abstractC10335m0.mo33691P0()) {
            return abstractC10335m0;
        }
        C10308d0 c10308d02 = (C10308d0) mo35993O0;
        Collection<AbstractC10311e0> mo35998a3 = c10308d02.mo35998a();
        ArrayList arrayList3 = new ArrayList(C10786v.m38911u(mo35998a3, 10));
        Iterator<T> it3 = mo35998a3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C10424a.m37154t((AbstractC10311e0) it3.next()));
            z = true;
        }
        if (z) {
            AbstractC10311e0 m36603i = c10308d02.m36603i();
            c10308d0 = new C10308d0(arrayList3).m36606m(m36603i != null ? C10424a.m37154t(m36603i) : null);
        }
        if (c10308d0 != null) {
            c10308d02 = c10308d0;
        }
        return c10308d02.m36602h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10319h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC10348q1 mo36711a(InterfaceC10409i interfaceC10409i) {
        AbstractC10348q1 m36664d;
        C9768m.m32346f(interfaceC10409i, "type");
        if (!(interfaceC10409i instanceof AbstractC10311e0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AbstractC10348q1 mo36635R0 = ((AbstractC10311e0) interfaceC10409i).mo36635R0();
        if (mo36635R0 instanceof AbstractC10335m0) {
            m36664d = m36921c((AbstractC10335m0) mo36635R0);
        } else {
            if (!(mo36635R0 instanceof AbstractC10425y)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10425y abstractC10425y = (AbstractC10425y) mo36635R0;
            AbstractC10335m0 m36921c = m36921c(abstractC10425y.m37161W0());
            AbstractC10335m0 m36921c2 = m36921c(abstractC10425y.m37162X0());
            m36664d = (m36921c == abstractC10425y.m37161W0() && m36921c2 == abstractC10425y.m37162X0()) ? mo36635R0 : C10314f0.m36664d(m36921c, m36921c2);
        }
        return C10345p1.m36805c(m36664d, mo36635R0, new b(this));
    }
}
