package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10567j;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10611d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10613e0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10035r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: JavaPropertyDescriptor.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.f */
/* loaded from: classes2.dex */
public class C9947f extends C10609c0 implements InterfaceC9942a {

    /* renamed from: H */
    private final boolean f37953H;

    /* renamed from: I */
    private final Pair<InterfaceC10540a.a<?>, ?> f37954I;

    /* renamed from: J */
    private AbstractC10311e0 f37955J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9947f(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0, InterfaceC10696t0 interfaceC10696t0, InterfaceC10543b.a aVar, boolean z2, Pair<InterfaceC10540a.a<?>, ?> pair) {
        super(interfaceC10576m, interfaceC10696t0, interfaceC10587g, enumC10550d0, abstractC10697u, z, c10130f, aVar, interfaceC10708z0, false, false, false, false, false, false);
        if (interfaceC10576m == null) {
            m33221v(0);
        }
        if (interfaceC10587g == null) {
            m33221v(1);
        }
        if (enumC10550d0 == null) {
            m33221v(2);
        }
        if (abstractC10697u == null) {
            m33221v(3);
        }
        if (c10130f == null) {
            m33221v(4);
        }
        if (interfaceC10708z0 == null) {
            m33221v(5);
        }
        if (aVar == null) {
            m33221v(6);
        }
        this.f37955J = null;
        this.f37953H = z2;
        this.f37954I = pair;
    }

    /* renamed from: g1 */
    public static C9947f m33220g1(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0, boolean z2) {
        if (interfaceC10576m == null) {
            m33221v(7);
        }
        if (interfaceC10587g == null) {
            m33221v(8);
        }
        if (enumC10550d0 == null) {
            m33221v(9);
        }
        if (abstractC10697u == null) {
            m33221v(10);
        }
        if (c10130f == null) {
            m33221v(11);
        }
        if (interfaceC10708z0 == null) {
            m33221v(12);
        }
        return new C9947f(interfaceC10576m, interfaceC10587g, enumC10550d0, abstractC10697u, z, c10130f, interfaceC10708z0, null, InterfaceC10543b.a.DECLARATION, z2, null);
    }

    /* renamed from: v */
    private static /* synthetic */ void m33221v(int i2) {
        String str = i2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 21 ? 3 : 2];
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10629m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0
    /* renamed from: Q0 */
    protected C10609c0 mo33222Q0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10696t0 interfaceC10696t0, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10576m == null) {
            m33221v(13);
        }
        if (enumC10550d0 == null) {
            m33221v(14);
        }
        if (abstractC10697u == null) {
            m33221v(15);
        }
        if (aVar == null) {
            m33221v(16);
        }
        if (c10130f == null) {
            m33221v(17);
        }
        if (interfaceC10708z0 == null) {
            m33221v(18);
        }
        return new C9947f(interfaceC10576m, getAnnotations(), enumC10550d0, abstractC10697u, mo37031j0(), c10130f, interfaceC10708z0, interfaceC10696t0, aVar, this.f37953H, this.f37954I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0
    /* renamed from: a1 */
    public void mo33223a1(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m33221v(22);
        }
        this.f37955J = abstractC10311e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10540a.a<V> aVar) {
        Pair<InterfaceC10540a.a<?>, ?> pair = this.f37954I;
        if (pair == null || !pair.m37648c().equals(aVar)) {
            return null;
        }
        return (V) this.f37954I.m37649d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    public boolean isConst() {
        AbstractC10311e0 type = getType();
        return this.f37953H && C10567j.m37699a(type) && (!C10035r.m33776i(type) || AbstractC9881h.m32760u0(type));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9942a
    /* renamed from: y */
    public InterfaceC9942a mo33201y(AbstractC10311e0 abstractC10311e0, List<AbstractC10311e0> list, AbstractC10311e0 abstractC10311e02, Pair<InterfaceC10540a.a<?>, ?> pair) {
        C10611d0 c10611d0;
        C10613e0 c10613e0;
        if (list == null) {
            m33221v(19);
        }
        if (abstractC10311e02 == null) {
            m33221v(20);
        }
        InterfaceC10696t0 mo37019a = mo37019a() == this ? null : mo37019a();
        C9947f c9947f = new C9947f(mo32876b(), getAnnotations(), mo32879j(), getVisibility(), mo37031j0(), getName(), mo32883t(), mo37019a, mo37030i(), this.f37953H, pair);
        C10611d0 getter = getGetter();
        if (getter != null) {
            c10611d0 = r15;
            C10611d0 c10611d02 = new C10611d0(c9947f, getter.getAnnotations(), getter.mo32879j(), getter.getVisibility(), getter.mo37773V(), getter.mo32885z(), getter.isInline(), mo37030i(), mo37019a == null ? null : mo37019a.getGetter(), getter.mo32883t());
            c10611d0.m37770O0(getter.mo37774d0());
            c10611d0.m37828R0(abstractC10311e02);
        } else {
            c10611d0 = null;
        }
        InterfaceC10700v0 setter = getSetter();
        if (setter != null) {
            C10613e0 c10613e02 = new C10613e0(c9947f, setter.getAnnotations(), setter.mo32879j(), setter.getVisibility(), setter.mo37773V(), setter.mo32885z(), setter.isInline(), mo37030i(), mo37019a == null ? null : mo37019a.getSetter(), setter.mo32883t());
            c10613e02.m37770O0(c10613e02.mo37774d0());
            c10613e02.m37837S0(setter.mo37028f().get(0));
            c10613e0 = c10613e02;
        } else {
            c10613e0 = null;
        }
        c9947f.m37790W0(c10611d0, c10613e0, mo37034q0(), mo37033n0());
        c9947f.m37793b1(m37791X0());
        Function0<InterfaceC10293j<AbstractC10178g<?>>> function0 = this.f41029m;
        if (function0 != null) {
            c9947f.m37909L0(this.f41028l, function0);
        }
        c9947f.mo36993x0(mo37027e());
        c9947f.m37794c1(abstractC10311e02, getTypeParameters(), mo37029f0(), abstractC10311e0 == null ? null : C10153c.m35790h(this, abstractC10311e0, InterfaceC10587g.f40808c.m37735b()), C10784u.m38888j());
        return c9947f;
    }
}
