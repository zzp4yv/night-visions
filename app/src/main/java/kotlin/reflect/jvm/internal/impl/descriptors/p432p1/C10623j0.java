package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0 */
/* loaded from: classes2.dex */
public final class C10623j0 extends AbstractC10633p implements InterfaceC10621i0 {

    /* renamed from: L */
    private final InterfaceC10297n f40990L;

    /* renamed from: M */
    private final InterfaceC10551d1 f40991M;

    /* renamed from: N */
    private final InterfaceC10293j f40992N;

    /* renamed from: O */
    private InterfaceC10549d f40993O;

    /* renamed from: K */
    static final /* synthetic */ KProperty<Object>[] f40989K = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10623j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: J */
    public static final a f40988J = new a(null);

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C10333l1 m37867c(InterfaceC10551d1 interfaceC10551d1) {
            if (interfaceC10551d1.mo36399r() == null) {
                return null;
            }
            return C10333l1.m36746f(interfaceC10551d1.mo36395W());
        }

        /* renamed from: b */
        public final InterfaceC10621i0 m37868b(InterfaceC10297n interfaceC10297n, InterfaceC10551d1 interfaceC10551d1, InterfaceC10549d interfaceC10549d) {
            InterfaceC10549d mo36396c;
            List<InterfaceC10702w0> m38888j;
            C9768m.m32346f(interfaceC10297n, "storageManager");
            C9768m.m32346f(interfaceC10551d1, "typeAliasDescriptor");
            C9768m.m32346f(interfaceC10549d, "constructor");
            C10333l1 m37867c = m37867c(interfaceC10551d1);
            if (m37867c == null || (mo36396c = interfaceC10549d.mo36396c(m37867c)) == null) {
                return null;
            }
            InterfaceC10587g annotations = interfaceC10549d.getAnnotations();
            InterfaceC10543b.a mo37030i = interfaceC10549d.mo37030i();
            C9768m.m32345e(mo37030i, "constructor.kind");
            InterfaceC10708z0 mo32883t = interfaceC10551d1.mo32883t();
            C9768m.m32345e(mo32883t, "typeAliasDescriptor.source");
            C10623j0 c10623j0 = new C10623j0(interfaceC10297n, interfaceC10551d1, mo36396c, null, annotations, mo37030i, mo32883t, null);
            List<InterfaceC10566i1> m37913P0 = AbstractC10633p.m37913P0(c10623j0, interfaceC10549d.mo37028f(), m37867c);
            if (m37913P0 == null) {
                return null;
            }
            AbstractC10335m0 m36584c = C10302b0.m36584c(mo36396c.getReturnType().mo36635R0());
            AbstractC10335m0 mo36400s = interfaceC10551d1.mo36400s();
            C9768m.m32345e(mo36400s, "typeAliasDescriptor.defaultType");
            AbstractC10335m0 m36816j = C10347q0.m36816j(m36584c, mo36400s);
            InterfaceC10702w0 mo37029f0 = interfaceC10549d.mo37029f0();
            InterfaceC10702w0 m35790h = mo37029f0 != null ? C10153c.m35790h(c10623j0, m37867c.m36758n(mo37029f0.getType(), EnumC10351r1.INVARIANT), InterfaceC10587g.f40808c.m37735b()) : null;
            InterfaceC10552e mo36399r = interfaceC10551d1.mo36399r();
            if (mo36399r != null) {
                List<InterfaceC10702w0> mo37035r0 = interfaceC10549d.mo37035r0();
                C9768m.m32345e(mo37035r0, "constructor.contextReceiverParameters");
                m38888j = new ArrayList<>(C10786v.m38911u(mo37035r0, 10));
                Iterator<T> it = mo37035r0.iterator();
                while (it.hasNext()) {
                    m38888j.add(C10153c.m35785c(mo36399r, m37867c.m36758n(((InterfaceC10702w0) it.next()).getType(), EnumC10351r1.INVARIANT), InterfaceC10587g.f40808c.m37735b()));
                }
            } else {
                m38888j = C10784u.m38888j();
            }
            c10623j0.mo37850S0(m35790h, null, m38888j, interfaceC10551d1.mo32884w(), m37913P0, m36816j, EnumC10550d0.FINAL, interfaceC10551d1.getVisibility());
            return c10623j0;
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j0$b */
    static final class b extends Lambda implements Function0<C10623j0> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10549d f40995g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC10549d interfaceC10549d) {
            super(0);
            this.f40995g = interfaceC10549d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10623j0 invoke() {
            InterfaceC10297n m37859h0 = C10623j0.this.m37859h0();
            InterfaceC10551d1 m37864p1 = C10623j0.this.m37864p1();
            InterfaceC10549d interfaceC10549d = this.f40995g;
            C10623j0 c10623j0 = C10623j0.this;
            InterfaceC10587g annotations = interfaceC10549d.getAnnotations();
            InterfaceC10543b.a mo37030i = this.f40995g.mo37030i();
            C9768m.m32345e(mo37030i, "underlyingConstructorDescriptor.kind");
            InterfaceC10708z0 mo32883t = C10623j0.this.m37864p1().mo32883t();
            C9768m.m32345e(mo32883t, "typeAliasDescriptor.source");
            C10623j0 c10623j02 = new C10623j0(m37859h0, m37864p1, interfaceC10549d, c10623j0, annotations, mo37030i, mo32883t, null);
            C10623j0 c10623j03 = C10623j0.this;
            InterfaceC10549d interfaceC10549d2 = this.f40995g;
            C10333l1 m37867c = C10623j0.f40988J.m37867c(c10623j03.m37864p1());
            if (m37867c == null) {
                return null;
            }
            InterfaceC10702w0 mo37029f0 = interfaceC10549d2.mo37029f0();
            InterfaceC10702w0 mo36396c = mo37029f0 != null ? mo37029f0.mo36396c(m37867c) : null;
            List<InterfaceC10702w0> mo37035r0 = interfaceC10549d2.mo37035r0();
            C9768m.m32345e(mo37035r0, "underlyingConstructorDes…contextReceiverParameters");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37035r0, 10));
            Iterator<T> it = mo37035r0.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10702w0) it.next()).mo36396c(m37867c));
            }
            c10623j02.mo37850S0(null, mo36396c, arrayList, c10623j03.m37864p1().mo32884w(), c10623j03.mo37028f(), c10623j03.getReturnType(), EnumC10550d0.FINAL, c10623j03.m37864p1().getVisibility());
            return c10623j02;
        }
    }

    private C10623j0(InterfaceC10297n interfaceC10297n, InterfaceC10551d1 interfaceC10551d1, InterfaceC10549d interfaceC10549d, InterfaceC10621i0 interfaceC10621i0, InterfaceC10587g interfaceC10587g, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10551d1, interfaceC10621i0, interfaceC10587g, C10132h.f39273i, aVar, interfaceC10708z0);
        this.f40990L = interfaceC10297n;
        this.f40991M = interfaceC10551d1;
        m37922W0(m37864p1().mo32859E0());
        this.f40992N = interfaceC10297n.mo36518f(new b(interfaceC10549d));
        this.f40993O = interfaceC10549d;
    }

    public /* synthetic */ C10623j0(InterfaceC10297n interfaceC10297n, InterfaceC10551d1 interfaceC10551d1, InterfaceC10549d interfaceC10549d, InterfaceC10621i0 interfaceC10621i0, InterfaceC10587g interfaceC10587g, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0, C9756g c9756g) {
        this(interfaceC10297n, interfaceC10551d1, interfaceC10549d, interfaceC10621i0, interfaceC10587g, aVar, interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l
    /* renamed from: B */
    public boolean mo37713B() {
        return mo37856p0().mo37713B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l
    /* renamed from: C */
    public InterfaceC10552e mo37714C() {
        InterfaceC10552e mo37714C = mo37856p0().mo37714C();
        C9768m.m32345e(mo37714C, "underlyingConstructorDescriptor.constructedClass");
        return mo37714C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        AbstractC10311e0 returnType = super.getReturnType();
        C9768m.m32343c(returnType);
        return returnType;
    }

    /* renamed from: h0 */
    public final InterfaceC10297n m37859h0() {
        return this.f40990L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10621i0 mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, boolean z) {
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(enumC10550d0, "modality");
        C9768m.m32346f(abstractC10697u, "visibility");
        C9768m.m32346f(aVar, "kind");
        InterfaceC10705y mo36996c = mo36992u().mo37009p(interfaceC10576m).mo36997d(enumC10550d0).mo37008o(abstractC10697u).mo37011r(aVar).mo37003j(z).mo36996c();
        C9768m.m32344d(mo36996c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC10621i0) mo36996c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C10623j0 mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(interfaceC10708z0, "source");
        InterfaceC10543b.a aVar2 = InterfaceC10543b.a.DECLARATION;
        if (aVar != aVar2) {
            InterfaceC10543b.a aVar3 = InterfaceC10543b.a.SYNTHESIZED;
        }
        return new C10623j0(this.f40990L, m37864p1(), mo37856p0(), this, interfaceC10587g, aVar2, interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10551d1 mo32876b() {
        return m37864p1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10621i0 mo37019a() {
        InterfaceC10705y mo37019a = super.mo37019a();
        C9768m.m32344d(mo37019a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC10621i0) mo37019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10621i0
    /* renamed from: p0 */
    public InterfaceC10549d mo37856p0() {
        return this.f40993O;
    }

    /* renamed from: p1 */
    public InterfaceC10551d1 m37864p1() {
        return this.f40991M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10621i0 mo36396c(C10333l1 c10333l1) {
        C9768m.m32346f(c10333l1, "substitutor");
        InterfaceC10705y mo36396c = super.mo36396c(c10333l1);
        C9768m.m32344d(mo36396c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C10623j0 c10623j0 = (C10623j0) mo36396c;
        C10333l1 m36746f = C10333l1.m36746f(c10623j0.getReturnType());
        C9768m.m32345e(m36746f, "create(substitutedTypeAliasConstructor.returnType)");
        InterfaceC10549d mo36396c2 = mo37856p0().mo37019a().mo36396c(m36746f);
        if (mo36396c2 == null) {
            return null;
        }
        c10623j0.f40993O = mo36396c2;
        return c10623j0;
    }
}
