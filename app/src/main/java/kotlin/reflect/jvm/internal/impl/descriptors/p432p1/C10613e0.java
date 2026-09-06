package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
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
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: PropertySetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 */
/* loaded from: classes2.dex */
public class C10613e0 extends AbstractC10607b0 implements InterfaceC10700v0 {

    /* renamed from: r */
    private InterfaceC10566i1 f40969r;

    /* renamed from: s */
    private final InterfaceC10700v0 f40970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10613e0(InterfaceC10696t0 interfaceC10696t0, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, boolean z2, boolean z3, InterfaceC10543b.a aVar, InterfaceC10700v0 interfaceC10700v0, InterfaceC10708z0 interfaceC10708z0) {
        super(enumC10550d0, abstractC10697u, interfaceC10696t0, interfaceC10587g, C10130f.m35451D("<set-" + interfaceC10696t0.getName() + ">"), z, z2, z3, aVar, interfaceC10708z0);
        C10613e0 c10613e0;
        C10613e0 c10613e02;
        if (interfaceC10696t0 == null) {
            m37835v(0);
        }
        if (interfaceC10587g == null) {
            m37835v(1);
        }
        if (enumC10550d0 == null) {
            m37835v(2);
        }
        if (abstractC10697u == null) {
            m37835v(3);
        }
        if (aVar == null) {
            m37835v(4);
        }
        if (interfaceC10708z0 == null) {
            m37835v(5);
        }
        if (interfaceC10700v0 != 0) {
            c10613e02 = this;
            c10613e0 = interfaceC10700v0;
        } else {
            c10613e0 = this;
            c10613e02 = c10613e0;
        }
        c10613e02.f40970s = c10613e0;
    }

    /* renamed from: Q0 */
    public static C10627l0 m37834Q0(InterfaceC10700v0 interfaceC10700v0, AbstractC10311e0 abstractC10311e0, InterfaceC10587g interfaceC10587g) {
        if (interfaceC10700v0 == null) {
            m37835v(7);
        }
        if (abstractC10311e0 == null) {
            m37835v(8);
        }
        if (interfaceC10587g == null) {
            m37835v(9);
        }
        return new C10627l0(interfaceC10700v0, null, 0, interfaceC10587g, C10132h.f39278n, abstractC10311e0, false, false, false, null, InterfaceC10708z0.f41247a);
    }

    /* renamed from: v */
    private static /* synthetic */ void m37835v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 9:
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
                objArr[0] = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i2) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i2) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35679i(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10607b0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10700v0 mo37019a() {
        InterfaceC10700v0 interfaceC10700v0 = this.f40970s;
        if (interfaceC10700v0 == null) {
            m37835v(13);
        }
        return interfaceC10700v0;
    }

    /* renamed from: S0 */
    public void m37837S0(InterfaceC10566i1 interfaceC10566i1) {
        if (interfaceC10566i1 == null) {
            m37835v(6);
        }
        this.f40969r = interfaceC10566i1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<? extends InterfaceC10700v0> mo37027e() {
        Collection<InterfaceC10694s0> m37768M0 = super.m37768M0(false);
        if (m37768M0 == null) {
            m37835v(10);
        }
        return m37768M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f */
    public List<InterfaceC10566i1> mo37028f() {
        InterfaceC10566i1 interfaceC10566i1 = this.f40969r;
        if (interfaceC10566i1 == null) {
            throw new IllegalStateException();
        }
        List<InterfaceC10566i1> singletonList = Collections.singletonList(interfaceC10566i1);
        if (singletonList == null) {
            m37835v(11);
        }
        return singletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        AbstractC10335m0 m32787Z = C10202a.m36072f(this).m32787Z();
        if (m32787Z == null) {
            m37835v(12);
        }
        return m32787Z;
    }
}
