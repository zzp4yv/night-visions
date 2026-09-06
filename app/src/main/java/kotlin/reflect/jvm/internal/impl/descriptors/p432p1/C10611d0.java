package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: PropertyGetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 */
/* loaded from: classes2.dex */
public class C10611d0 extends AbstractC10607b0 implements InterfaceC10698u0 {

    /* renamed from: r */
    private AbstractC10311e0 f40953r;

    /* renamed from: s */
    private final InterfaceC10698u0 f40954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10611d0(InterfaceC10696t0 interfaceC10696t0, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, boolean z2, boolean z3, InterfaceC10543b.a aVar, InterfaceC10698u0 interfaceC10698u0, InterfaceC10708z0 interfaceC10708z0) {
        super(enumC10550d0, abstractC10697u, interfaceC10696t0, interfaceC10587g, C10130f.m35451D("<get-" + interfaceC10696t0.getName() + ">"), z, z2, z3, aVar, interfaceC10708z0);
        C10611d0 c10611d0;
        C10611d0 c10611d02;
        if (interfaceC10696t0 == null) {
            m37826v(0);
        }
        if (interfaceC10587g == null) {
            m37826v(1);
        }
        if (enumC10550d0 == null) {
            m37826v(2);
        }
        if (abstractC10697u == null) {
            m37826v(3);
        }
        if (aVar == null) {
            m37826v(4);
        }
        if (interfaceC10708z0 == null) {
            m37826v(5);
        }
        if (interfaceC10698u0 != 0) {
            c10611d02 = this;
            c10611d0 = interfaceC10698u0;
        } else {
            c10611d0 = this;
            c10611d02 = c10611d0;
        }
        c10611d02.f40954s = c10611d0;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37826v(int i2) {
        String str = (i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i2 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35675b(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10607b0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10698u0 mo37019a() {
        InterfaceC10698u0 interfaceC10698u0 = this.f40954s;
        if (interfaceC10698u0 == null) {
            m37826v(8);
        }
        return interfaceC10698u0;
    }

    /* renamed from: R0 */
    public void m37828R0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            abstractC10311e0 = mo37763B0().getType();
        }
        this.f40953r = abstractC10311e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<? extends InterfaceC10698u0> mo37027e() {
        Collection<InterfaceC10694s0> m37768M0 = super.m37768M0(true);
        if (m37768M0 == null) {
            m37826v(6);
        }
        return m37768M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f */
    public List<InterfaceC10566i1> mo37028f() {
        List<InterfaceC10566i1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37826v(7);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        return this.f40953r;
    }
}
