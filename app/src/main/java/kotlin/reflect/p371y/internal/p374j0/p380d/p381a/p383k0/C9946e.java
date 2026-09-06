package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p422m.C10447p;

/* compiled from: JavaMethodDescriptor.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.e */
/* loaded from: classes2.dex */
public class C9946e extends C10617g0 implements InterfaceC9942a {

    /* renamed from: J */
    public static final InterfaceC10540a.a<InterfaceC10566i1> f37942J = new a();

    /* renamed from: K */
    public static final InterfaceC10540a.a<Boolean> f37943K = new b();

    /* renamed from: L */
    private c f37944L;

    /* renamed from: M */
    private final boolean f37945M;

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$a */
    static class a implements InterfaceC10540a.a<InterfaceC10566i1> {
        a() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$b */
    static class b implements InterfaceC10540a.a<Boolean> {
        b() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$c */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: k */
        public final boolean f37951k;

        /* renamed from: l */
        public final boolean f37952l;

        c(boolean z, boolean z2) {
            this.f37951k = z;
            this.f37952l = z2;
        }

        /* renamed from: g */
        private static /* synthetic */ void m33218g(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* renamed from: k */
        public static c m33219k(boolean z, boolean z2) {
            c cVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                m33218g(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9946e(InterfaceC10576m interfaceC10576m, InterfaceC10706y0 interfaceC10706y0, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0, boolean z) {
        super(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, interfaceC10708z0);
        if (interfaceC10576m == null) {
            m33213v(0);
        }
        if (interfaceC10587g == null) {
            m33213v(1);
        }
        if (c10130f == null) {
            m33213v(2);
        }
        if (aVar == null) {
            m33213v(3);
        }
        if (interfaceC10708z0 == null) {
            m33213v(4);
        }
        this.f37944L = null;
        this.f37945M = z;
    }

    /* renamed from: q1 */
    public static C9946e m33212q1(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0, boolean z) {
        if (interfaceC10576m == null) {
            m33213v(5);
        }
        if (interfaceC10587g == null) {
            m33213v(6);
        }
        if (c10130f == null) {
            m33213v(7);
        }
        if (interfaceC10708z0 == null) {
            m33213v(8);
        }
        return new C9946e(interfaceC10576m, null, interfaceC10587g, c10130f, InterfaceC10543b.a.DECLARATION, interfaceC10708z0, z);
    }

    /* renamed from: v */
    private static /* synthetic */ void m33213v(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 21) ? 2 : 3];
        switch (i2) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i2 == 13) {
            objArr[1] = "initialize";
        } else if (i2 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 13 && i2 != 18 && i2 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: G */
    public boolean mo33204G() {
        return this.f37944L.f37952l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: R0 */
    public boolean mo33205R0() {
        return this.f37944L.f37951k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0
    /* renamed from: p1 */
    public C10617g0 mo33214p1(InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<InterfaceC10702w0> list, List<? extends InterfaceC10554e1> list2, List<InterfaceC10566i1> list3, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, Map<? extends InterfaceC10540a.a<?>, ?> map) {
        if (list == null) {
            m33213v(9);
        }
        if (list2 == null) {
            m33213v(10);
        }
        if (list3 == null) {
            m33213v(11);
        }
        if (abstractC10697u == null) {
            m33213v(12);
        }
        C10617g0 mo33214p1 = super.mo33214p1(interfaceC10702w0, interfaceC10702w02, list, list2, list3, abstractC10311e0, enumC10550d0, abstractC10697u, map);
        m37927g1(C10447p.f40431a.m37186a(mo33214p1).m37197a());
        if (mo33214p1 == null) {
            m33213v(13);
        }
        return mo33214p1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C9946e mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10576m == null) {
            m33213v(14);
        }
        if (aVar == null) {
            m33213v(15);
        }
        if (interfaceC10587g == null) {
            m33213v(16);
        }
        if (interfaceC10708z0 == null) {
            m33213v(17);
        }
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) interfaceC10705y;
        if (c10130f == null) {
            c10130f = getName();
        }
        C9946e c9946e = new C9946e(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, interfaceC10708z0, this.f37945M);
        c9946e.m33217t1(mo33205R0(), mo33204G());
        return c9946e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9942a
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C9946e mo33201y(AbstractC10311e0 abstractC10311e0, List<AbstractC10311e0> list, AbstractC10311e0 abstractC10311e02, Pair<InterfaceC10540a.a<?>, ?> pair) {
        if (list == null) {
            m33213v(19);
        }
        if (abstractC10311e02 == null) {
            m33213v(20);
        }
        C9946e c9946e = (C9946e) mo36992u().mo36995b(C9949h.m33225a(list, mo37028f(), this)).mo37000g(abstractC10311e02).mo37004k(abstractC10311e0 == null ? null : C10153c.m35790h(this, abstractC10311e0, InterfaceC10587g.f40808c.m37735b())).mo36994a().mo36999f().mo36996c();
        if (pair != null) {
            c9946e.m37921V0(pair.m37648c(), pair.m37649d());
        }
        if (c9946e == null) {
            m33213v(21);
        }
        return c9946e;
    }

    /* renamed from: t1 */
    public void m33217t1(boolean z, boolean z2) {
        this.f37944L = c.m33219k(z, z2);
    }
}
