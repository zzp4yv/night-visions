package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10768m;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.collections.C10794z;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9747b0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.InterfaceC9761i0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10652b;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10655e;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10656f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10661k;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10662l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10682p;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10671e;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.p371y.internal.calls.C9863b;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10070s;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10156f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10182k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10171a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10188q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10190s;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10270m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: util.kt */
@Metadata(m32266d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001al\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0013*\u00020\u0014\"\b\b\u0001\u0010\u0012*\u00020\u00062\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u0002H\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001d\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u001f¢\u0006\u0002\b!H\u0000¢\u0006\u0002\u0010\"\u001a.\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002\u001a(\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010)\u001a\u00020*H\u0002\u001a%\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.00H\u0080\bø\u0001\u0000¢\u0006\u0002\u00101\u001a\u0016\u00102\u001a\u0004\u0018\u00010\u000e*\u0002032\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0014\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u000105*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u00106\u001a\u0004\u0018\u000107*\u0004\u0018\u00010\u000eH\u0000\u001a\u0014\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u000109*\u0004\u0018\u00010\u000eH\u0000\u001a\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;*\u00020=H\u0000\u001a\u0014\u0010>\u001a\u0006\u0012\u0002\b\u00030\u0016*\u0006\u0012\u0002\b\u00030\u0016H\u0000\u001a\u000e\u0010?\u001a\u0004\u0018\u00010<*\u00020@H\u0002\u001a\u0012\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u00020BH\u0000\u001a\u000e\u0010C\u001a\u0004\u0018\u00010D*\u00020EH\u0000\u001a\u001a\u0010F\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030G2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020<0;*\b\u0012\u0004\u0012\u00020<0;H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, m32267d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "isInlineClassType", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)Z", "defaultPrimitiveValue", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Ljava/lang/reflect/Type;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "Ljava/lang/Class;", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "loadClass", "classLoader", "Ljava/lang/ClassLoader;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "className", "arrayDimensions", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "arrayToRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "computeAnnotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "createArrayType", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toJavaClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "toRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "unwrapRepeatableAnnotations", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.g0 */
/* loaded from: classes2.dex */
public final class C9858g0 {

    /* renamed from: a */
    private static final C10127c f37316a = new C10127c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.g0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37317a;

        static {
            int[] iArr = new int[EnumC9882i.values().length];
            iArr[EnumC9882i.BOOLEAN.ordinal()] = 1;
            iArr[EnumC9882i.CHAR.ordinal()] = 2;
            iArr[EnumC9882i.BYTE.ordinal()] = 3;
            iArr[EnumC9882i.SHORT.ordinal()] = 4;
            iArr[EnumC9882i.INT.ordinal()] = 5;
            iArr[EnumC9882i.FLOAT.ordinal()] = 6;
            iArr[EnumC9882i.LONG.ordinal()] = 7;
            iArr[EnumC9882i.DOUBLE.ordinal()] = 8;
            f37317a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object m32556a(kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.C9858g0.m32556a(kotlin.f0.y.e.j0.i.r.b, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final KCallableImpl<?> m32557b(Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl m32558c = m32558c(obj);
        return m32558c != null ? m32558c : m32559d(obj);
    }

    /* renamed from: c */
    public static final KFunctionImpl m32558c(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        C9760i c9760i = obj instanceof C9760i ? (C9760i) obj : null;
        KCallable compute = c9760i != null ? c9760i.compute() : null;
        if (compute instanceof KFunctionImpl) {
            return (KFunctionImpl) compute;
        }
        return null;
    }

    /* renamed from: d */
    public static final KPropertyImpl<?> m32559d(Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        AbstractC9747b0 abstractC9747b0 = obj instanceof AbstractC9747b0 ? (AbstractC9747b0) obj : null;
        KCallable compute = abstractC9747b0 != null ? abstractC9747b0.compute() : null;
        if (compute instanceof KPropertyImpl) {
            return (KPropertyImpl) compute;
        }
        return null;
    }

    /* renamed from: e */
    public static final List<Annotation> m32560e(InterfaceC10581a interfaceC10581a) {
        C9768m.m32346f(interfaceC10581a, "<this>");
        InterfaceC10587g annotations = interfaceC10581a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10583c interfaceC10583c : annotations) {
            InterfaceC10708z0 mo33164t = interfaceC10583c.mo33164t();
            Annotation annotation = null;
            if (mo33164t instanceof C10652b) {
                annotation = ((C10652b) mo33164t).m38014d();
            } else if (mo33164t instanceof C10662l.a) {
                AbstractC10682p mo33568b = ((C10662l.a) mo33164t).mo33568b();
                C10671e c10671e = mo33568b instanceof C10671e ? (C10671e) mo33568b : null;
                if (c10671e != null) {
                    annotation = c10671e.m38078R();
                }
            } else {
                annotation = m32570o(interfaceC10583c);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return m32574s(arrayList);
    }

    /* renamed from: f */
    public static final Class<?> m32561f(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: g */
    public static final Object m32562g(Type type) {
        C9768m.m32346f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C9768m.m32341a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C9768m.m32341a(type, Character.TYPE)) {
            return (char) 0;
        }
        if (C9768m.m32341a(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C9768m.m32341a(type, Short.TYPE)) {
            return (short) 0;
        }
        if (C9768m.m32341a(type, Integer.TYPE)) {
            return 0;
        }
        if (C9768m.m32341a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C9768m.m32341a(type, Long.TYPE)) {
            return 0L;
        }
        if (C9768m.m32341a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C9768m.m32341a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: h */
    public static final <M extends InterfaceC10723o, D extends InterfaceC10540a> D m32563h(Class<?> cls, M m, InterfaceC10118c interfaceC10118c, C10122g c10122g, AbstractC10116a abstractC10116a, Function2<? super C10280w, ? super M, ? extends D> function2) {
        List<C10107s> m34897n0;
        C9768m.m32346f(cls, "moduleAnchor");
        C9768m.m32346f(m, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C9768m.m32346f(function2, "createDescriptor");
        C10661k m37330a = C10474z.m37330a(cls);
        if (m instanceof C10097i) {
            m34897n0 = ((C10097i) m).m34731m0();
        } else {
            if (!(m instanceof C10102n)) {
                throw new IllegalStateException(("Unsupported message: " + m).toString());
            }
            m34897n0 = ((C10102n) m).m34897n0();
        }
        List<C10107s> list = m34897n0;
        C10268k m38031a = m37330a.m38031a();
        InterfaceC10559g0 m38032b = m37330a.m38032b();
        C10123h m35402b = C10123h.f39237a.m35402b();
        C9768m.m32345e(list, "typeParameters");
        return function2.invoke(new C10280w(new C10270m(m38031a, interfaceC10118c, m38032b, c10122g, m35402b, abstractC10116a, null, null, list)), m);
    }

    /* renamed from: i */
    public static final InterfaceC10702w0 m32564i(InterfaceC10540a interfaceC10540a) {
        C9768m.m32346f(interfaceC10540a, "<this>");
        if (interfaceC10540a.mo37029f0() == null) {
            return null;
        }
        InterfaceC10576m mo32876b = interfaceC10540a.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC10552e) mo32876b).mo37677K0();
    }

    /* renamed from: j */
    public static final C10127c m32565j() {
        return f37316a;
    }

    /* renamed from: k */
    public static final boolean m32566k(KType kType) {
        AbstractC10311e0 f40589g;
        C9768m.m32346f(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (f40589g = kTypeImpl.getF40589g()) == null || !C10156f.m35841c(f40589g)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: l */
    private static final Class<?> m32567l(ClassLoader classLoader, String str, String str2, int i2) {
        String m37524z;
        String m37521w;
        if (C9768m.m32341a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        m37524z = C10513u.m37524z(str2, '.', '$', false, 4, null);
        sb.append(m37524z);
        String sb2 = sb.toString();
        if (i2 > 0) {
            StringBuilder sb3 = new StringBuilder();
            m37521w = C10513u.m37521w("[", i2);
            sb3.append(m37521w);
            sb3.append('L');
            sb3.append(sb2);
            sb3.append(';');
            sb2 = sb3.toString();
        }
        return C10655e.m38024a(classLoader, sb2);
    }

    /* renamed from: m */
    private static final Class<?> m32568m(ClassLoader classLoader, C10126b c10126b, int i2) {
        C9896c c9896c = C9896c.f37667a;
        C10128d m35428j = c10126b.m35409b().m35428j();
        C9768m.m32345e(m35428j, "kotlinClassId.asSingleFqName().toUnsafe()");
        C10126b m32929n = c9896c.m32929n(m35428j);
        if (m32929n != null) {
            c10126b = m32929n;
        }
        String m35420b = c10126b.m35413h().m35420b();
        C9768m.m32345e(m35420b, "javaClassId.packageFqName.asString()");
        String m35420b2 = c10126b.m35414i().m35420b();
        C9768m.m32345e(m35420b2, "javaClassId.relativeClassName.asString()");
        return m32567l(classLoader, m35420b, m35420b2, i2);
    }

    /* renamed from: n */
    static /* synthetic */ Class m32569n(ClassLoader classLoader, C10126b c10126b, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m32568m(classLoader, c10126b, i2);
    }

    /* renamed from: o */
    private static final Annotation m32570o(InterfaceC10583c interfaceC10583c) {
        Map m38805q;
        InterfaceC10552e m36071e = C10202a.m36071e(interfaceC10583c);
        Class<?> m32571p = m36071e != null ? m32571p(m36071e) : null;
        if (!(m32571p instanceof Class)) {
            m32571p = null;
        }
        if (m32571p == null) {
            return null;
        }
        Set<Map.Entry<C10130f, AbstractC10178g<?>>> entrySet = interfaceC10583c.mo33159a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C10130f c10130f = (C10130f) entry.getKey();
            AbstractC10178g abstractC10178g = (AbstractC10178g) entry.getValue();
            ClassLoader classLoader = m32571p.getClassLoader();
            C9768m.m32345e(classLoader, "annotationClass.classLoader");
            Object m32573r = m32573r(abstractC10178g, classLoader);
            Pair m38547a = m32573r != null ? C10740s.m38547a(c10130f.m35455k(), m32573r) : null;
            if (m38547a != null) {
                arrayList.add(m38547a);
            }
        }
        m38805q = C10777q0.m38805q(arrayList);
        return (Annotation) C9863b.m32648g(m32571p, m38805q, null, 4, null);
    }

    /* renamed from: p */
    public static final Class<?> m32571p(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "<this>");
        InterfaceC10708z0 mo32883t = interfaceC10552e.mo32883t();
        C9768m.m32345e(mo32883t, "source");
        if (mo32883t instanceof C10070s) {
            InterfaceC10068q m34029d = ((C10070s) mo32883t).m34029d();
            C9768m.m32344d(m34029d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C10656f) m34029d).m38025d();
        }
        if (mo32883t instanceof C10662l.a) {
            AbstractC10682p mo33568b = ((C10662l.a) mo32883t).mo33568b();
            C9768m.m32344d(mo33568b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C10678l) mo33568b).mo38048w();
        }
        C10126b m36073g = C10202a.m36073g(interfaceC10552e);
        if (m36073g == null) {
            return null;
        }
        return m32568m(C10670d.m38073e(interfaceC10552e.getClass()), m36073g, 0);
    }

    /* renamed from: q */
    public static final KVisibility m32572q(AbstractC10697u abstractC10697u) {
        C9768m.m32346f(abstractC10697u, "<this>");
        if (C9768m.m32341a(abstractC10697u, C10695t.f41220e)) {
            return KVisibility.PUBLIC;
        }
        if (C9768m.m32341a(abstractC10697u, C10695t.f41218c)) {
            return KVisibility.PROTECTED;
        }
        if (C9768m.m32341a(abstractC10697u, C10695t.f41219d)) {
            return KVisibility.INTERNAL;
        }
        if (C9768m.m32341a(abstractC10697u, C10695t.f41216a) ? true : C9768m.m32341a(abstractC10697u, C10695t.f41217b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* renamed from: r */
    private static final Object m32573r(AbstractC10178g<?> abstractC10178g, ClassLoader classLoader) {
        if (abstractC10178g instanceof C10171a) {
            return m32570o(((C10171a) abstractC10178g).mo36023b());
        }
        if (abstractC10178g instanceof C10173b) {
            return m32556a((C10173b) abstractC10178g, classLoader);
        }
        if (abstractC10178g instanceof C10181j) {
            Pair<? extends C10126b, ? extends C10130f> mo36023b = ((C10181j) abstractC10178g).mo36023b();
            C10126b m37646a = mo36023b.m37646a();
            C10130f m37647b = mo36023b.m37647b();
            Class m32569n = m32569n(classLoader, m37646a, 0, 4, null);
            if (m32569n != null) {
                return C9856f0.m32554a(m32569n, m37647b.m35455k());
            }
            return null;
        }
        if (!(abstractC10178g instanceof C10188q)) {
            if (abstractC10178g instanceof AbstractC10182k ? true : abstractC10178g instanceof C10190s) {
                return null;
            }
            return abstractC10178g.mo36023b();
        }
        C10188q.b mo36023b2 = ((C10188q) abstractC10178g).mo36023b();
        if (mo36023b2 instanceof C10188q.b.C11513b) {
            C10188q.b.C11513b c11513b = (C10188q.b.C11513b) mo36023b2;
            return m32568m(classLoader, c11513b.m36056b(), c11513b.m36055a());
        }
        if (!(mo36023b2 instanceof C10188q.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC10561h mo32891w = ((C10188q.b.a) mo36023b2).m36054a().mo35993O0().mo32891w();
        InterfaceC10552e interfaceC10552e = mo32891w instanceof InterfaceC10552e ? (InterfaceC10552e) mo32891w : null;
        if (interfaceC10552e != null) {
            return m32571p(interfaceC10552e);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private static final List<Annotation> m32574s(List<? extends Annotation> list) {
        boolean z;
        List m38883e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C9768m.m32341a(C9719a.m32276b(C9719a.m32275a((Annotation) it.next())).getSimpleName(), "Container")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : list) {
            Class m32276b = C9719a.m32276b(C9719a.m32275a(annotation));
            if (!C9768m.m32341a(m32276b.getSimpleName(), "Container") || m32276b.getAnnotation(InterfaceC9761i0.class) == null) {
                m38883e = C10782t.m38883e(annotation);
            } else {
                Object invoke = m32276b.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                C9768m.m32344d(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                m38883e = C10768m.m38702c((Annotation[]) invoke);
            }
            C10794z.m38933z(arrayList, m38883e);
        }
        return arrayList;
    }
}
