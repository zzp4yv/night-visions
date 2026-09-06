package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9762j;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.C10484i;
import kotlin.sequences.C10487l;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@Metadata(m32266d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, m32267d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", HttpUrl.FRAGMENT_ENCODE_SET, "typeToString", HttpUrl.FRAGMENT_ENCODE_SET, "type", "computeJavaType", "forceWrapper", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.w */
/* loaded from: classes2.dex */
public final class C9839w {

    /* compiled from: TypesJVM.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.w$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37259a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.IN.ordinal()] = 1;
            iArr[KVariance.INVARIANT.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            f37259a = iArr;
        }
    }

    /* compiled from: TypesJVM.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.w$b */
    /* synthetic */ class b extends C9762j implements Function1<Class<?>, Class<?>> {

        /* renamed from: h */
        public static final b f37260h = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> cls) {
            C9768m.m32346f(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Type m32453c(KType kType, boolean z) {
        KClassifier mo32437c = kType.mo32437c();
        if (mo32437c instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) mo32437c);
        }
        if (!(mo32437c instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) mo32437c;
        Class m32277c = z ? C9719a.m32277c(kClass) : C9719a.m32276b(kClass);
        List<KTypeProjection> mo32436b = kType.mo32436b();
        if (mo32436b.isEmpty()) {
            return m32277c;
        }
        if (!m32277c.isArray()) {
            return m32455e(m32277c, mo32436b);
        }
        if (m32277c.getComponentType().isPrimitive()) {
            return m32277c;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) C10780s.m38870u0(mo32436b);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance f37242c = kTypeProjection.getF37242c();
        KType f37243d = kTypeProjection.getF37243d();
        int i2 = f37242c == null ? -1 : a.f37259a[f37242c.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return m32277c;
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        C9768m.m32343c(f37243d);
        Type m32454d = m32454d(f37243d, false, 1, null);
        return m32454d instanceof Class ? m32277c : new GenericArrayTypeImpl(m32454d);
    }

    /* renamed from: d */
    static /* synthetic */ Type m32454d(KType kType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m32453c(kType, z);
    }

    /* renamed from: e */
    private static final Type m32455e(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m32457g((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m32457g((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type m32455e = m32455e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C10786v.m38911u(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m32457g((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, m32455e, arrayList3);
    }

    /* renamed from: f */
    public static final Type m32456f(KType kType) {
        Type mo32365j;
        C9768m.m32346f(kType, "<this>");
        return (!(kType instanceof KTypeBase) || (mo32365j = ((KTypeBase) kType).mo32365j()) == null) ? m32454d(kType, false, 1, null) : mo32365j;
    }

    /* renamed from: g */
    private static final Type m32457g(KTypeProjection kTypeProjection) {
        KVariance m32443d = kTypeProjection.m32443d();
        if (m32443d == null) {
            return WildcardTypeImpl.f37261f.m32461a();
        }
        KType m32442c = kTypeProjection.m32442c();
        C9768m.m32343c(m32442c);
        int i2 = a.f37259a[m32443d.ordinal()];
        if (i2 == 1) {
            return new WildcardTypeImpl(null, m32453c(m32442c, true));
        }
        if (i2 == 2) {
            return m32453c(m32442c, true);
        }
        if (i2 == 3) {
            return new WildcardTypeImpl(m32453c(m32442c, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final String m32458h(Type type) {
        String name;
        Sequence m37373f;
        int m37380j;
        String m37521w;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            m37373f = C10487l.m37373f(type, b.f37260h);
            StringBuilder sb = new StringBuilder();
            sb.append(((Class) C10484i.m37362t(m37373f)).getName());
            m37380j = C10489n.m37380j(m37373f);
            m37521w = C10513u.m37521w(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, m37380j);
            sb.append(m37521w);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        C9768m.m32345e(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }
}
