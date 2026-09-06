package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.C10742u;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.utils.C10737d;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9880g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9885l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10156f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10308d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10422x;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10373q;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.text.C10513u;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.d */
/* loaded from: classes3.dex */
public final class C10055d {
    /* renamed from: a */
    public static final String m33951a(InterfaceC10552e interfaceC10552e, InterfaceC10076y<?> interfaceC10076y) {
        String m37524z;
        C9768m.m32346f(interfaceC10552e, "klass");
        C9768m.m32346f(interfaceC10076y, "typeMappingConfiguration");
        String mo34058b = interfaceC10076y.mo34058b(interfaceC10552e);
        if (mo34058b != null) {
            return mo34058b;
        }
        InterfaceC10576m mo32876b = interfaceC10552e.mo32876b();
        C9768m.m32345e(mo32876b, "klass.containingDeclaration");
        String m35457u = C10132h.m35460b(interfaceC10552e.getName()).m35457u();
        C9768m.m32345e(m35457u, "safeIdentifier(klass.name).identifier");
        if (mo32876b instanceof InterfaceC10571k0) {
            C10127c mo37712d = ((InterfaceC10571k0) mo32876b).mo37712d();
            if (mo37712d.m35422d()) {
                return m35457u;
            }
            StringBuilder sb = new StringBuilder();
            String m35420b = mo37712d.m35420b();
            C9768m.m32345e(m35420b, "fqName.asString()");
            m37524z = C10513u.m37524z(m35420b, '.', '/', false, 4, null);
            sb.append(m37524z);
            sb.append('/');
            sb.append(m35457u);
            return sb.toString();
        }
        InterfaceC10552e interfaceC10552e2 = mo32876b instanceof InterfaceC10552e ? (InterfaceC10552e) mo32876b : null;
        if (interfaceC10552e2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + mo32876b + " for " + interfaceC10552e);
        }
        String mo34060d = interfaceC10076y.mo34060d(interfaceC10552e2);
        if (mo34060d == null) {
            mo34060d = m33951a(interfaceC10552e2, interfaceC10076y);
        }
        return mo34060d + '$' + m35457u;
    }

    /* renamed from: b */
    public static /* synthetic */ String m33952b(InterfaceC10552e interfaceC10552e, InterfaceC10076y interfaceC10076y, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC10076y = C10077z.f38490a;
        }
        return m33951a(interfaceC10552e, interfaceC10076y);
    }

    /* renamed from: c */
    public static final boolean m33953c(InterfaceC10540a interfaceC10540a) {
        C9768m.m32346f(interfaceC10540a, "descriptor");
        if (interfaceC10540a instanceof InterfaceC10573l) {
            return true;
        }
        AbstractC10311e0 returnType = interfaceC10540a.getReturnType();
        C9768m.m32343c(returnType);
        if (AbstractC9881h.m32727B0(returnType)) {
            AbstractC10311e0 returnType2 = interfaceC10540a.getReturnType();
            C9768m.m32343c(returnType2);
            if (!C10339n1.m36779l(returnType2) && !(interfaceC10540a instanceof InterfaceC10698u0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [T, java.lang.Object] */
    /* renamed from: d */
    public static final <T> T m33954d(AbstractC10311e0 abstractC10311e0, InterfaceC10064m<T> interfaceC10064m, C10049a0 c10049a0, InterfaceC10076y<? extends T> interfaceC10076y, C10061j<T> c10061j, Function3<? super AbstractC10311e0, ? super T, ? super C10049a0, C10742u> function3) {
        T t;
        AbstractC10311e0 abstractC10311e02;
        Object m33954d;
        C9768m.m32346f(abstractC10311e0, "kotlinType");
        C9768m.m32346f(interfaceC10064m, "factory");
        C9768m.m32346f(c10049a0, "mode");
        C9768m.m32346f(interfaceC10076y, "typeMappingConfiguration");
        C9768m.m32346f(function3, "writeGenericType");
        AbstractC10311e0 mo34061e = interfaceC10076y.mo34061e(abstractC10311e0);
        if (mo34061e != null) {
            return (T) m33954d(mo34061e, interfaceC10064m, c10049a0, interfaceC10076y, c10061j, function3);
        }
        if (C9880g.m32721q(abstractC10311e0)) {
            return (T) m33954d(C9885l.m32837a(abstractC10311e0), interfaceC10064m, c10049a0, interfaceC10076y, c10061j, function3);
        }
        C10373q c10373q = C10373q.f40209a;
        Object m33889b = C10051b0.m33889b(c10373q, abstractC10311e0, interfaceC10064m, c10049a0);
        if (m33889b != null) {
            ?? r11 = (Object) C10051b0.m33888a(interfaceC10064m, m33889b, c10049a0.m33858d());
            function3.mo26879d(abstractC10311e0, r11, c10049a0);
            return r11;
        }
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        if (mo35993O0 instanceof C10308d0) {
            C10308d0 c10308d0 = (C10308d0) mo35993O0;
            AbstractC10311e0 m36603i = c10308d0.m36603i();
            if (m36603i == null) {
                m36603i = interfaceC10076y.mo34059c(c10308d0.mo35998a());
            }
            return (T) m33954d(C10424a.m37157w(m36603i), interfaceC10064m, c10049a0, interfaceC10076y, c10061j, function3);
        }
        InterfaceC10561h mo32891w = mo35993O0.mo32891w();
        if (mo32891w == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC10311e0);
        }
        if (C10394k.m37054m(mo32891w)) {
            T t2 = (T) interfaceC10064m.mo34008c("error/NonExistentClass");
            interfaceC10076y.mo34062f(abstractC10311e0, (InterfaceC10552e) mo32891w);
            if (c10061j == null) {
                return t2;
            }
            throw null;
        }
        boolean z = mo32891w instanceof InterfaceC10552e;
        if (z && AbstractC9881h.m32738c0(abstractC10311e0)) {
            if (abstractC10311e0.mo35991M0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC10318g1 interfaceC10318g1 = abstractC10311e0.mo35991M0().get(0);
            AbstractC10311e0 type = interfaceC10318g1.getType();
            C9768m.m32345e(type, "memberProjection.type");
            if (interfaceC10318g1.mo36708a() == EnumC10351r1.IN_VARIANCE) {
                m33954d = interfaceC10064m.mo34008c("java/lang/Object");
                if (c10061j != null) {
                    throw null;
                }
            } else {
                if (c10061j != null) {
                    throw null;
                }
                EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
                C9768m.m32345e(mo36708a, "memberProjection.projectionKind");
                m33954d = m33954d(type, interfaceC10064m, c10049a0.m33860f(mo36708a, true), interfaceC10076y, c10061j, function3);
                if (c10061j != null) {
                    throw null;
                }
            }
            return (T) interfaceC10064m.mo34007b('[' + interfaceC10064m.mo34006a(m33954d));
        }
        if (!z) {
            if (!(mo32891w instanceof InterfaceC10554e1)) {
                if ((mo32891w instanceof InterfaceC10551d1) && c10049a0.m33856b()) {
                    return (T) m33954d(((InterfaceC10551d1) mo32891w).mo36395W(), interfaceC10064m, c10049a0, interfaceC10076y, c10061j, function3);
                }
                throw new UnsupportedOperationException("Unknown type " + abstractC10311e0);
            }
            AbstractC10311e0 m37143i = C10424a.m37143i((InterfaceC10554e1) mo32891w);
            if (abstractC10311e0.mo33691P0()) {
                m37143i = C10424a.m37154t(m37143i);
            }
            T t3 = (T) m33954d(m37143i, interfaceC10064m, c10049a0, interfaceC10076y, null, C10737d.m38526b());
            if (c10061j == null) {
                return t3;
            }
            C9768m.m32345e(mo32891w.getName(), "descriptor.getName()");
            throw null;
        }
        if (C10156f.m35840b(mo32891w) && !c10049a0.m33857c() && (abstractC10311e02 = (AbstractC10311e0) C10422x.m37129a(c10373q, abstractC10311e0)) != null) {
            return (T) m33954d(abstractC10311e02, interfaceC10064m, c10049a0.m33861g(), interfaceC10076y, c10061j, function3);
        }
        if (c10049a0.m33859e() && AbstractC9881h.m32748k0((InterfaceC10552e) mo32891w)) {
            t = (Object) interfaceC10064m.mo34010e();
        } else {
            InterfaceC10552e interfaceC10552e = (InterfaceC10552e) mo32891w;
            InterfaceC10552e mo37019a = interfaceC10552e.mo37019a();
            C9768m.m32345e(mo37019a, "descriptor.original");
            T mo34057a = interfaceC10076y.mo34057a(mo37019a);
            if (mo34057a == null) {
                if (interfaceC10552e.mo32878i() == EnumC10555f.ENUM_ENTRY) {
                    InterfaceC10576m mo32876b = interfaceC10552e.mo32876b();
                    C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC10552e = (InterfaceC10552e) mo32876b;
                }
                InterfaceC10552e mo37019a2 = interfaceC10552e.mo37019a();
                C9768m.m32345e(mo37019a2, "enumClassIfEnumEntry.original");
                t = (Object) interfaceC10064m.mo34008c(m33951a(mo37019a2, interfaceC10076y));
            } else {
                t = (Object) mo34057a;
            }
        }
        function3.mo26879d(abstractC10311e0, t, c10049a0);
        return t;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m33955e(AbstractC10311e0 abstractC10311e0, InterfaceC10064m interfaceC10064m, C10049a0 c10049a0, InterfaceC10076y interfaceC10076y, C10061j c10061j, Function3 function3, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            function3 = C10737d.m38526b();
        }
        return m33954d(abstractC10311e0, interfaceC10064m, c10049a0, interfaceC10076y, c10061j, function3);
    }
}
