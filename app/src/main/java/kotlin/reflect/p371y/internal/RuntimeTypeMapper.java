package kotlin.reflect.p371y.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10681o;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10684r;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10687u;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.JvmPropertySignature;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9894a;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9924g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9943b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9947f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9983a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10002l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10083d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10156f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10260j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10252b;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "isKnownBuiltInFunction", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "mapName", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.d0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class RuntimeTypeMapper {

    /* renamed from: a */
    public static final RuntimeTypeMapper f37288a = new RuntimeTypeMapper();

    /* renamed from: b */
    private static final C10126b f37289b;

    static {
        C10126b m35408m = C10126b.m35408m(new C10127c("java.lang.Void"));
        C9768m.m32345e(m35408m, "topLevel(FqName(\"java.lang.Void\"))");
        f37289b = m35408m;
    }

    private RuntimeTypeMapper() {
    }

    /* renamed from: a */
    private final EnumC9882i m32515a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC10207e.m36114k(cls.getSimpleName()).m36118x();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m32516b(InterfaceC10705y interfaceC10705y) {
        if (C10153c.m35797o(interfaceC10705y) || C10153c.m35798p(interfaceC10705y)) {
            return true;
        }
        return C9768m.m32341a(interfaceC10705y.getName(), C9894a.f37663e.m32912a()) && interfaceC10705y.mo37028f().isEmpty();
    }

    /* renamed from: d */
    private final JvmFunctionSignature.e m32517d(InterfaceC10705y interfaceC10705y) {
        return new JvmFunctionSignature.e(new AbstractC10083d.b(m32518e(interfaceC10705y), C10073v.m34039c(interfaceC10705y, false, false, 1, null)));
    }

    /* renamed from: e */
    private final String m32518e(InterfaceC10543b interfaceC10543b) {
        String m33101b = C9924g0.m33101b(interfaceC10543b);
        if (m33101b != null) {
            return m33101b;
        }
        if (interfaceC10543b instanceof InterfaceC10698u0) {
            String m35455k = C10202a.m36081o(interfaceC10543b).getName().m35455k();
            C9768m.m32345e(m35455k, "descriptor.propertyIfAccessor.name.asString()");
            return C10047z.m33829b(m35455k);
        }
        if (interfaceC10543b instanceof InterfaceC10700v0) {
            String m35455k2 = C10202a.m36081o(interfaceC10543b).getName().m35455k();
            C9768m.m32345e(m35455k2, "descriptor.propertyIfAccessor.name.asString()");
            return C10047z.m33832e(m35455k2);
        }
        String m35455k3 = interfaceC10543b.getName().m35455k();
        C9768m.m32345e(m35455k3, "descriptor.name.asString()");
        return m35455k3;
    }

    /* renamed from: c */
    public final C10126b m32519c(Class<?> cls) {
        C9768m.m32346f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C9768m.m32345e(componentType, "klass.componentType");
            EnumC9882i m32515a = m32515a(componentType);
            if (m32515a != null) {
                return new C10126b(C9884k.f37517r, m32515a.m32814q());
            }
            C10126b m35408m = C10126b.m35408m(C9884k.a.f37576i.m35441l());
            C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m35408m;
        }
        if (C9768m.m32341a(cls, Void.TYPE)) {
            return f37289b;
        }
        EnumC9882i m32515a2 = m32515a(cls);
        if (m32515a2 != null) {
            return new C10126b(C9884k.f37517r, m32515a2.m32816v());
        }
        C10126b m38069a = C10670d.m38069a(cls);
        if (!m38069a.m35416k()) {
            C9896c c9896c = C9896c.f37667a;
            C10127c m35409b = m38069a.m35409b();
            C9768m.m32345e(m35409b, "classId.asSingleFqName()");
            C10126b m32928m = c9896c.m32928m(m35409b);
            if (m32928m != null) {
                return m32928m;
            }
        }
        return m38069a;
    }

    /* renamed from: f */
    public final JvmPropertySignature m32520f(InterfaceC10696t0 interfaceC10696t0) {
        C9768m.m32346f(interfaceC10696t0, "possiblyOverriddenProperty");
        InterfaceC10696t0 mo37019a = ((InterfaceC10696t0) C10154d.m35811L(interfaceC10696t0)).mo37019a();
        C9768m.m32345e(mo37019a, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (mo37019a instanceof C10260j) {
            C10260j c10260j = (C10260j) mo37019a;
            C10102n mo36257E = c10260j.mo36257E();
            AbstractC10716h.f<C10102n, C10079a.d> fVar = C10079a.f38494d;
            C9768m.m32345e(fVar, "propertySignature");
            C10079a.d dVar = (C10079a.d) C10120e.m35380a(mo36257E, fVar);
            if (dVar != null) {
                return new JvmPropertySignature.c(mo37019a, mo36257E, dVar, c10260j.mo36259Z(), c10260j.mo36258T());
            }
        } else if (mo37019a instanceof C9947f) {
            InterfaceC10708z0 mo32883t = ((C9947f) mo37019a).mo32883t();
            InterfaceC9983a interfaceC9983a = mo32883t instanceof InterfaceC9983a ? (InterfaceC9983a) mo32883t : null;
            InterfaceC10002l mo33568b = interfaceC9983a != null ? interfaceC9983a.mo33568b() : null;
            if (mo33568b instanceof C10684r) {
                return new JvmPropertySignature.a(((C10684r) mo33568b).mo38106U());
            }
            if (mo33568b instanceof C10687u) {
                Method mo38106U = ((C10687u) mo33568b).mo38106U();
                InterfaceC10700v0 setter = mo37019a.getSetter();
                InterfaceC10708z0 mo32883t2 = setter != null ? setter.mo32883t() : null;
                InterfaceC9983a interfaceC9983a2 = mo32883t2 instanceof InterfaceC9983a ? (InterfaceC9983a) mo32883t2 : null;
                InterfaceC10002l mo33568b2 = interfaceC9983a2 != null ? interfaceC9983a2.mo33568b() : null;
                C10687u c10687u = mo33568b2 instanceof C10687u ? (C10687u) mo33568b2 : null;
                return new JvmPropertySignature.b(mo38106U, c10687u != null ? c10687u.mo38106U() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + mo37019a + " (source = " + mo33568b + ')');
        }
        InterfaceC10698u0 getter = mo37019a.getGetter();
        C9768m.m32343c(getter);
        JvmFunctionSignature.e m32517d = m32517d(getter);
        InterfaceC10700v0 setter2 = mo37019a.getSetter();
        return new JvmPropertySignature.d(m32517d, setter2 != null ? m32517d(setter2) : null);
    }

    /* renamed from: g */
    public final JvmFunctionSignature m32521g(InterfaceC10705y interfaceC10705y) {
        Method mo38106U;
        AbstractC10083d.b m34266b;
        AbstractC10083d.b m34268e;
        C9768m.m32346f(interfaceC10705y, "possiblySubstitutedFunction");
        InterfaceC10705y mo37019a = ((InterfaceC10705y) C10154d.m35811L(interfaceC10705y)).mo37019a();
        C9768m.m32345e(mo37019a, "unwrapFakeOverride(possi…titutedFunction).original");
        if (mo37019a instanceof InterfaceC10252b) {
            InterfaceC10252b interfaceC10252b = (InterfaceC10252b) mo37019a;
            InterfaceC10723o mo36257E = interfaceC10252b.mo36257E();
            if ((mo36257E instanceof C10097i) && (m34268e = C10088i.f38607a.m34268e((C10097i) mo36257E, interfaceC10252b.mo36259Z(), interfaceC10252b.mo36258T())) != null) {
                return new JvmFunctionSignature.e(m34268e);
            }
            if (!(mo36257E instanceof C10092d) || (m34266b = C10088i.f38607a.m34266b((C10092d) mo36257E, interfaceC10252b.mo36259Z(), interfaceC10252b.mo36258T())) == null) {
                return m32517d(mo37019a);
            }
            InterfaceC10576m mo32876b = interfaceC10705y.mo32876b();
            C9768m.m32345e(mo32876b, "possiblySubstitutedFunction.containingDeclaration");
            return C10156f.m35840b(mo32876b) ? new JvmFunctionSignature.e(m34266b) : new JvmFunctionSignature.d(m34266b);
        }
        if (mo37019a instanceof C9946e) {
            InterfaceC10708z0 mo32883t = ((C9946e) mo37019a).mo32883t();
            InterfaceC9983a interfaceC9983a = mo32883t instanceof InterfaceC9983a ? (InterfaceC9983a) mo32883t : null;
            InterfaceC10002l mo33568b = interfaceC9983a != null ? interfaceC9983a.mo33568b() : null;
            C10687u c10687u = mo33568b instanceof C10687u ? (C10687u) mo33568b : null;
            if (c10687u != null && (mo38106U = c10687u.mo38106U()) != null) {
                return new JvmFunctionSignature.c(mo38106U);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + mo37019a);
        }
        if (!(mo37019a instanceof C9943b)) {
            if (m32516b(mo37019a)) {
                return m32517d(mo37019a);
            }
            throw new KotlinReflectionInternalError("Unknown origin of " + mo37019a + " (" + mo37019a.getClass() + ')');
        }
        InterfaceC10708z0 mo32883t2 = ((C9943b) mo37019a).mo32883t();
        InterfaceC9983a interfaceC9983a2 = mo32883t2 instanceof InterfaceC9983a ? (InterfaceC9983a) mo32883t2 : null;
        InterfaceC10002l mo33568b2 = interfaceC9983a2 != null ? interfaceC9983a2.mo33568b() : null;
        if (mo33568b2 instanceof C10681o) {
            return new JvmFunctionSignature.b(((C10681o) mo33568b2).mo38106U());
        }
        if (mo33568b2 instanceof C10678l) {
            C10678l c10678l = (C10678l) mo33568b2;
            if (c10678l.mo33601r()) {
                return new JvmFunctionSignature.a(c10678l.mo38048w());
            }
        }
        throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + mo37019a + " (" + mo33568b2 + ')');
    }
}
