package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.Function;
import kotlin.collections.C10770n;
import kotlin.collections.C10777q0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.sequences.C10487l;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;
import kotlin.text.C10513u;

/* compiled from: reflectClassUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d */
/* loaded from: classes2.dex */
public final class C10670d {

    /* renamed from: a */
    private static final List<KClass<? extends Object>> f41178a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f41179b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f41180c;

    /* renamed from: d */
    private static final Map<Class<? extends Function<?>>, Integer> f41181d;

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d$a */
    static final class a extends Lambda implements Function1<ParameterizedType, ParameterizedType> {

        /* renamed from: f */
        public static final a f41182f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            C9768m.m32346f(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d$b */
    static final class b extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: f */
        public static final b f41183f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<Type> invoke(ParameterizedType parameterizedType) {
            Sequence<Type> m38762r;
            C9768m.m32346f(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C9768m.m32345e(actualTypeArguments, "it.actualTypeArguments");
            m38762r = C10770n.m38762r(actualTypeArguments);
            return m38762r;
        }
    }

    static {
        List<KClass<? extends Object>> m38891m;
        Map<Class<? extends Object>, Class<? extends Object>> m38805q;
        Map<Class<? extends Object>, Class<? extends Object>> m38805q2;
        List m38891m2;
        Map<Class<? extends Function<?>>, Integer> m38805q3;
        int i2 = 0;
        m38891m = C10784u.m38891m(C9757g0.m32298b(Boolean.TYPE), C9757g0.m32298b(Byte.TYPE), C9757g0.m32298b(Character.TYPE), C9757g0.m32298b(Double.TYPE), C9757g0.m32298b(Float.TYPE), C9757g0.m32298b(Integer.TYPE), C9757g0.m32298b(Long.TYPE), C9757g0.m32298b(Short.TYPE));
        f41178a = m38891m;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38891m, 10));
        Iterator<T> it = m38891m.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(C10740s.m38547a(C9719a.m32277c(kClass), C9719a.m32278d(kClass)));
        }
        m38805q = C10777q0.m38805q(arrayList);
        f41179b = m38805q;
        List<KClass<? extends Object>> list = f41178a;
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(C10740s.m38547a(C9719a.m32278d(kClass2), C9719a.m32277c(kClass2)));
        }
        m38805q2 = C10777q0.m38805q(arrayList2);
        f41180c = m38805q2;
        m38891m2 = C10784u.m38891m(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(C10786v.m38911u(m38891m2, 10));
        for (Object obj : m38891m2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10784u.m38898t();
            }
            arrayList3.add(C10740s.m38547a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        m38805q3 = C10777q0.m38805q(arrayList3);
        f41181d = m38805q3;
    }

    /* renamed from: a */
    public static final C10126b m38069a(Class<?> cls) {
        C10126b m35408m;
        C10126b m38069a;
        C9768m.m32346f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            C9768m.m32345e(simpleName, "simpleName");
            if (!(simpleName.length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (m38069a = m38069a(declaringClass)) == null || (m35408m = m38069a.m35411d(C10130f.m35454x(cls.getSimpleName()))) == null) {
                    m35408m = C10126b.m35408m(new C10127c(cls.getName()));
                }
                C9768m.m32345e(m35408m, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return m35408m;
            }
        }
        C10127c c10127c = new C10127c(cls.getName());
        return new C10126b(c10127c.m35423e(), C10127c.m35419k(c10127c.m35425g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final String m38070b(Class<?> cls) {
        String m37524z;
        String m37524z2;
        C9768m.m32346f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                C9768m.m32345e(name, "name");
                m37524z2 = C10513u.m37524z(name, '.', '/', false, 4, null);
                return m37524z2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name2 = cls.getName();
            C9768m.m32345e(name2, "name");
            m37524z = C10513u.m37524z(name2, '.', '/', false, 4, null);
            sb.append(m37524z);
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    /* renamed from: c */
    public static final List<Type> m38071c(Type type) {
        Sequence m37373f;
        Sequence m37386p;
        List<Type> m37377A;
        List<Type> m38746Z;
        C9768m.m32346f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C10784u.m38888j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C9768m.m32345e(actualTypeArguments, "actualTypeArguments");
            m38746Z = C10770n.m38746Z(actualTypeArguments);
            return m38746Z;
        }
        m37373f = C10487l.m37373f(type, a.f41182f);
        m37386p = C10489n.m37386p(m37373f, b.f41183f);
        m37377A = C10489n.m37377A(m37386p);
        return m37377A;
    }

    /* renamed from: d */
    public static final Class<?> m38072d(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        return f41179b.get(cls);
    }

    /* renamed from: e */
    public static final ClassLoader m38073e(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C9768m.m32345e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: f */
    public static final Class<?> m38074f(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        return f41180c.get(cls);
    }

    /* renamed from: g */
    public static final boolean m38075g(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
