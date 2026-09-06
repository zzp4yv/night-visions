package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: SimpleFunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.g0 */
/* loaded from: classes2.dex */
public class C10617g0 extends AbstractC10633p implements InterfaceC10706y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10617g0(InterfaceC10576m interfaceC10576m, InterfaceC10706y0 interfaceC10706y0, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, interfaceC10708z0);
        if (interfaceC10576m == null) {
            m37849v(0);
        }
        if (interfaceC10587g == null) {
            m37849v(1);
        }
        if (c10130f == null) {
            m37849v(2);
        }
        if (aVar == null) {
            m37849v(3);
        }
        if (interfaceC10708z0 == null) {
            m37849v(4);
        }
    }

    /* renamed from: m1 */
    public static C10617g0 m37848m1(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10576m == null) {
            m37849v(5);
        }
        if (interfaceC10587g == null) {
            m37849v(6);
        }
        if (c10130f == null) {
            m37849v(7);
        }
        if (aVar == null) {
            m37849v(8);
        }
        if (interfaceC10708z0 == null) {
            m37849v(9);
        }
        return new C10617g0(interfaceC10576m, null, interfaceC10587g, c10130f, aVar, interfaceC10708z0);
    }

    /* renamed from: v */
    private static /* synthetic */ void m37849v(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? 2 : 3];
        switch (i2) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i2 == 13 || i2 == 18 || i2 == 23) {
            objArr[1] = "initialize";
        } else if (i2 == 24) {
            objArr[1] = "getOriginal";
        } else if (i2 == 29) {
            objArr[1] = "copy";
        } else if (i2 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 13 && i2 != 18 && i2 != 23 && i2 != 24 && i2 != 29 && i2 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: M0 */
    protected AbstractC10633p mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10576m == null) {
            m37849v(25);
        }
        if (aVar == null) {
            m37849v(26);
        }
        if (interfaceC10587g == null) {
            m37849v(27);
        }
        if (interfaceC10708z0 == null) {
            m37849v(28);
        }
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) interfaceC10705y;
        if (c10130f == null) {
            c10130f = getName();
        }
        return new C10617g0(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10706y0 mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, boolean z) {
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) super.mo36990k0(interfaceC10576m, enumC10550d0, abstractC10697u, aVar, z);
        if (interfaceC10706y0 == null) {
            m37849v(29);
        }
        return interfaceC10706y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10706y0 mo37019a() {
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) super.mo37019a();
        if (interfaceC10706y0 == null) {
            m37849v(24);
        }
        return interfaceC10706y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C10617g0 mo37850S0(InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<InterfaceC10702w0> list, List<? extends InterfaceC10554e1> list2, List<InterfaceC10566i1> list3, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u) {
        if (list == null) {
            m37849v(14);
        }
        if (list2 == null) {
            m37849v(15);
        }
        if (list3 == null) {
            m37849v(16);
        }
        if (abstractC10697u == null) {
            m37849v(17);
        }
        C10617g0 mo33214p1 = mo33214p1(interfaceC10702w0, interfaceC10702w02, list, list2, list3, abstractC10311e0, enumC10550d0, abstractC10697u, null);
        if (mo33214p1 == null) {
            m37849v(18);
        }
        return mo33214p1;
    }

    /* renamed from: p1 */
    public C10617g0 mo33214p1(InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<InterfaceC10702w0> list, List<? extends InterfaceC10554e1> list2, List<InterfaceC10566i1> list3, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, Map<? extends InterfaceC10540a.a<?>, ?> map) {
        if (list == null) {
            m37849v(19);
        }
        if (list2 == null) {
            m37849v(20);
        }
        if (list3 == null) {
            m37849v(21);
        }
        if (abstractC10697u == null) {
            m37849v(22);
        }
        super.mo37850S0(interfaceC10702w0, interfaceC10702w02, list, list2, list3, abstractC10311e0, enumC10550d0, abstractC10697u);
        if (map != null && !map.isEmpty()) {
            this.f41039I = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0
    /* renamed from: u */
    public InterfaceC10705y.a<? extends InterfaceC10706y0> mo36992u() {
        InterfaceC10705y.a mo36992u = super.mo36992u();
        if (mo36992u == null) {
            m37849v(30);
        }
        return mo36992u;
    }
}
