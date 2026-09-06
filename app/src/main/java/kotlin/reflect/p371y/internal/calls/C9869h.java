package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.p371y.internal.C9858g0;
import kotlin.reflect.p371y.internal.KotlinReflectionInternalError;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10156f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import okhttp3.HttpUrl;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, m32267d2 = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "isDefault", HttpUrl.FRAGMENT_ENCODE_SET, "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "hasInlineClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.h */
/* loaded from: classes2.dex */
public final class C9869h {
    /* renamed from: a */
    public static final Object m32665a(Object obj, InterfaceC10543b interfaceC10543b) {
        AbstractC10311e0 m32669e;
        Class<?> m32673i;
        Method m32670f;
        C9768m.m32346f(interfaceC10543b, "descriptor");
        return (((interfaceC10543b instanceof InterfaceC10696t0) && C10156f.m35842d((InterfaceC10569j1) interfaceC10543b)) || (m32669e = m32669e(interfaceC10543b)) == null || (m32673i = m32673i(m32669e)) == null || (m32670f = m32670f(m32673i, interfaceC10543b)) == null) ? obj : m32670f.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <M extends Member> Caller<M> m32666b(Caller<? extends M> caller, InterfaceC10543b interfaceC10543b, boolean z) {
        boolean z2;
        C9768m.m32346f(caller, "<this>");
        C9768m.m32346f(interfaceC10543b, "descriptor");
        boolean z3 = true;
        if (!C10156f.m35839a(interfaceC10543b)) {
            List<InterfaceC10566i1> mo37028f = interfaceC10543b.mo37028f();
            C9768m.m32345e(mo37028f, "descriptor.valueParameters");
            if (!(mo37028f instanceof Collection) || !mo37028f.isEmpty()) {
                Iterator<T> it = mo37028f.iterator();
                while (it.hasNext()) {
                    AbstractC10311e0 type = ((InterfaceC10566i1) it.next()).getType();
                    C9768m.m32345e(type, "it.type");
                    if (C10156f.m35841c(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                AbstractC10311e0 returnType = interfaceC10543b.getReturnType();
                if (!(returnType != null && C10156f.m35841c(returnType)) && ((caller instanceof BoundCaller) || !m32671g(interfaceC10543b))) {
                    z3 = false;
                }
            }
        }
        return z3 ? new InlineClassAwareCaller(interfaceC10543b, caller, z) : caller;
    }

    /* renamed from: c */
    public static /* synthetic */ Caller m32667c(Caller caller, InterfaceC10543b interfaceC10543b, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m32666b(caller, interfaceC10543b, z);
    }

    /* renamed from: d */
    public static final Method m32668d(Class<?> cls, InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(cls, "<this>");
        C9768m.m32346f(interfaceC10543b, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m32670f(cls, interfaceC10543b).getReturnType());
            C9768m.m32345e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + interfaceC10543b + ')');
        }
    }

    /* renamed from: e */
    private static final AbstractC10311e0 m32669e(InterfaceC10543b interfaceC10543b) {
        InterfaceC10702w0 mo37032m0 = interfaceC10543b.mo37032m0();
        InterfaceC10702w0 mo37029f0 = interfaceC10543b.mo37029f0();
        if (mo37032m0 != null) {
            return mo37032m0.getType();
        }
        if (mo37029f0 == null) {
            return null;
        }
        if (interfaceC10543b instanceof InterfaceC10573l) {
            return mo37029f0.getType();
        }
        InterfaceC10576m mo32876b = interfaceC10543b.mo32876b();
        InterfaceC10552e interfaceC10552e = mo32876b instanceof InterfaceC10552e ? (InterfaceC10552e) mo32876b : null;
        if (interfaceC10552e != null) {
            return interfaceC10552e.mo36400s();
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m32670f(Class<?> cls, InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(cls, "<this>");
        C9768m.m32346f(interfaceC10543b, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C9768m.m32345e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + interfaceC10543b + ')');
        }
    }

    /* renamed from: g */
    private static final boolean m32671g(InterfaceC10543b interfaceC10543b) {
        AbstractC10311e0 m32669e = m32669e(interfaceC10543b);
        return m32669e != null && C10156f.m35841c(m32669e);
    }

    /* renamed from: h */
    public static final Class<?> m32672h(InterfaceC10576m interfaceC10576m) {
        if (!(interfaceC10576m instanceof InterfaceC10552e) || !C10156f.m35840b(interfaceC10576m)) {
            return null;
        }
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) interfaceC10576m;
        Class<?> m32571p = C9858g0.m32571p(interfaceC10552e);
        if (m32571p != null) {
            return m32571p;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + interfaceC10552e.getName() + " cannot be found (classId=" + C10202a.m36073g((InterfaceC10561h) interfaceC10576m) + ')');
    }

    /* renamed from: i */
    public static final Class<?> m32673i(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        Class<?> m32672h = m32672h(abstractC10311e0.mo35993O0().mo32891w());
        if (m32672h == null) {
            return null;
        }
        if (!C10339n1.m36779l(abstractC10311e0)) {
            return m32672h;
        }
        AbstractC10311e0 m35843e = C10156f.m35843e(abstractC10311e0);
        if (m35843e == null || C10339n1.m36779l(m35843e) || AbstractC9881h.m32757r0(m35843e)) {
            return null;
        }
        return m32672h;
    }
}
