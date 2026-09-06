package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10791x0;
import kotlin.collections.C10794z;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10075x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;

/* compiled from: JvmBuiltInsSignatures.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.i */
/* loaded from: classes2.dex */
public final class C9902i {

    /* renamed from: a */
    public static final C9902i f37742a;

    /* renamed from: b */
    private static final Set<String> f37743b;

    /* renamed from: c */
    private static final Set<String> f37744c;

    /* renamed from: d */
    private static final Set<String> f37745d;

    /* renamed from: e */
    private static final Set<String> f37746e;

    /* renamed from: f */
    private static final Set<String> f37747f;

    /* renamed from: g */
    private static final Set<String> f37748g;

    static {
        Set<String> m38926m;
        Set m38925l;
        Set m38925l2;
        Set m38925l3;
        Set m38925l4;
        Set m38925l5;
        Set<String> m38925l6;
        Set m38925l7;
        Set m38925l8;
        Set m38925l9;
        Set m38925l10;
        Set m38925l11;
        Set<String> m38925l12;
        Set m38925l13;
        Set<String> m38925l14;
        Set m38925l15;
        Set<String> m38925l16;
        C9902i c9902i = new C9902i();
        f37742a = c9902i;
        C10075x c10075x = C10075x.f38488a;
        m38926m = C10791x0.m38926m(c10075x.m34050f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f37743b = m38926m;
        m38925l = C10791x0.m38925l(c9902i.m33003b(), c10075x.m34050f("List", "sort(Ljava/util/Comparator;)V"));
        m38925l2 = C10791x0.m38925l(m38925l, c10075x.m34049e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        m38925l3 = C10791x0.m38925l(m38925l2, c10075x.m34049e("Double", "isInfinite()Z", "isNaN()Z"));
        m38925l4 = C10791x0.m38925l(m38925l3, c10075x.m34049e("Float", "isInfinite()Z", "isNaN()Z"));
        m38925l5 = C10791x0.m38925l(m38925l4, c10075x.m34049e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        m38925l6 = C10791x0.m38925l(m38925l5, c10075x.m34049e("CharSequence", "isEmpty()Z"));
        f37744c = m38925l6;
        m38925l7 = C10791x0.m38925l(c10075x.m34049e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c10075x.m34050f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        m38925l8 = C10791x0.m38925l(m38925l7, c10075x.m34049e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        m38925l9 = C10791x0.m38925l(m38925l8, c10075x.m34049e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        m38925l10 = C10791x0.m38925l(m38925l9, c10075x.m34050f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        m38925l11 = C10791x0.m38925l(m38925l10, c10075x.m34050f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        m38925l12 = C10791x0.m38925l(m38925l11, c10075x.m34050f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f37745d = m38925l12;
        m38925l13 = C10791x0.m38925l(c10075x.m34050f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c10075x.m34050f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        m38925l14 = C10791x0.m38925l(m38925l13, c10075x.m34050f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f37746e = m38925l14;
        Set<String> m33002a = c9902i.m33002a();
        String[] m34047b = c10075x.m34047b("D");
        m38925l15 = C10791x0.m38925l(m33002a, c10075x.m34049e("Float", (String[]) Arrays.copyOf(m34047b, m34047b.length)));
        String[] m34047b2 = c10075x.m34047b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        m38925l16 = C10791x0.m38925l(m38925l15, c10075x.m34049e("String", (String[]) Arrays.copyOf(m34047b2, m34047b2.length)));
        f37747f = m38925l16;
        String[] m34047b3 = c10075x.m34047b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f37748g = c10075x.m34049e("Throwable", (String[]) Arrays.copyOf(m34047b3, m34047b3.length));
    }

    private C9902i() {
    }

    /* renamed from: a */
    private final Set<String> m33002a() {
        List m38891m;
        C10075x c10075x = C10075x.f38488a;
        EnumC10207e enumC10207e = EnumC10207e.BYTE;
        m38891m = C10784u.m38891m(EnumC10207e.BOOLEAN, enumC10207e, EnumC10207e.DOUBLE, EnumC10207e.FLOAT, enumC10207e, EnumC10207e.INT, EnumC10207e.LONG, EnumC10207e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m38891m.iterator();
        while (it.hasNext()) {
            String m35455k = ((EnumC10207e) it.next()).m36119y().m35425g().m35455k();
            C9768m.m32345e(m35455k, "it.wrapperFqName.shortName().asString()");
            String[] m34047b = c10075x.m34047b("Ljava/lang/String;");
            C10794z.m38933z(linkedHashSet, c10075x.m34049e(m35455k, (String[]) Arrays.copyOf(m34047b, m34047b.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private final Set<String> m33003b() {
        List<EnumC10207e> m38891m;
        C10075x c10075x = C10075x.f38488a;
        m38891m = C10784u.m38891m(EnumC10207e.BOOLEAN, EnumC10207e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC10207e enumC10207e : m38891m) {
            String m35455k = enumC10207e.m36119y().m35425g().m35455k();
            C9768m.m32345e(m35455k, "it.wrapperFqName.shortName().asString()");
            C10794z.m38933z(linkedHashSet, c10075x.m34049e(m35455k, enumC10207e.m36117v() + "Value()" + enumC10207e.m36116u()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> m33004c() {
        return f37743b;
    }

    /* renamed from: d */
    public final Set<String> m33005d() {
        return f37747f;
    }

    /* renamed from: e */
    public final Set<String> m33006e() {
        return f37744c;
    }

    /* renamed from: f */
    public final Set<String> m33007f() {
        return f37746e;
    }

    /* renamed from: g */
    public final Set<String> m33008g() {
        return f37748g;
    }

    /* renamed from: h */
    public final Set<String> m33009h() {
        return f37745d;
    }

    /* renamed from: i */
    public final boolean m33010i(C10128d c10128d) {
        C9768m.m32346f(c10128d, "fqName");
        return C9768m.m32341a(c10128d, C9884k.a.f37576i) || C9884k.m32830e(c10128d);
    }

    /* renamed from: j */
    public final boolean m33011j(C10128d c10128d) {
        C9768m.m32346f(c10128d, "fqName");
        if (m33010i(c10128d)) {
            return true;
        }
        C10126b m32929n = C9896c.f37667a.m32929n(c10128d);
        if (m32929n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(m32929n.m35409b().m35420b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
