package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10701w;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9876c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9877d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k */
/* loaded from: classes2.dex */
public final class C9941k {
    /* renamed from: a */
    private static /* synthetic */ void m33196a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "companionObject";
        } else if (i2 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i2 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i2 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i2 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m33197b(InterfaceC10543b interfaceC10543b) {
        InterfaceC10701w mo37034q0;
        if (interfaceC10543b == null) {
            m33196a(3);
        }
        if ((interfaceC10543b instanceof InterfaceC10696t0) && (mo37034q0 = ((InterfaceC10696t0) interfaceC10543b).mo37034q0()) != null && mo37034q0.getAnnotations().mo33270R0(C10047z.f38330b)) {
            return true;
        }
        return interfaceC10543b.getAnnotations().mo33270R0(C10047z.f38330b);
    }

    /* renamed from: c */
    public static boolean m33198c(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m33196a(1);
        }
        return C10154d.m35836x(interfaceC10576m) && C10154d.m35835w(interfaceC10576m.mo32876b()) && !m33199d((InterfaceC10552e) interfaceC10576m);
    }

    /* renamed from: d */
    public static boolean m33199d(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m33196a(2);
        }
        return C9877d.m32702a(C9876c.f37450a, interfaceC10552e);
    }

    /* renamed from: e */
    public static boolean m33200e(InterfaceC10696t0 interfaceC10696t0) {
        if (interfaceC10696t0 == null) {
            m33196a(0);
        }
        if (interfaceC10696t0.mo37030i() == InterfaceC10543b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (m33198c(interfaceC10696t0.mo32876b())) {
            return true;
        }
        return C10154d.m35836x(interfaceC10696t0.mo32876b()) && m33197b(interfaceC10696t0);
    }
}
