package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9876c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9891c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10129e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10133i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;

/* compiled from: JavaToKotlinClassMap.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.c */
/* loaded from: classes2.dex */
public final class C9896c {

    /* renamed from: a */
    public static final C9896c f37667a;

    /* renamed from: b */
    private static final String f37668b;

    /* renamed from: c */
    private static final String f37669c;

    /* renamed from: d */
    private static final String f37670d;

    /* renamed from: e */
    private static final String f37671e;

    /* renamed from: f */
    private static final C10126b f37672f;

    /* renamed from: g */
    private static final C10127c f37673g;

    /* renamed from: h */
    private static final C10126b f37674h;

    /* renamed from: i */
    private static final C10126b f37675i;

    /* renamed from: j */
    private static final C10126b f37676j;

    /* renamed from: k */
    private static final HashMap<C10128d, C10126b> f37677k;

    /* renamed from: l */
    private static final HashMap<C10128d, C10126b> f37678l;

    /* renamed from: m */
    private static final HashMap<C10128d, C10127c> f37679m;

    /* renamed from: n */
    private static final HashMap<C10128d, C10127c> f37680n;

    /* renamed from: o */
    private static final HashMap<C10126b, C10126b> f37681o;

    /* renamed from: p */
    private static final HashMap<C10126b, C10126b> f37682p;

    /* renamed from: q */
    private static final List<a> f37683q;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.c$a */
    public static final class a {

        /* renamed from: a */
        private final C10126b f37684a;

        /* renamed from: b */
        private final C10126b f37685b;

        /* renamed from: c */
        private final C10126b f37686c;

        public a(C10126b c10126b, C10126b c10126b2, C10126b c10126b3) {
            C9768m.m32346f(c10126b, "javaClass");
            C9768m.m32346f(c10126b2, "kotlinReadOnly");
            C9768m.m32346f(c10126b3, "kotlinMutable");
            this.f37684a = c10126b;
            this.f37685b = c10126b2;
            this.f37686c = c10126b3;
        }

        /* renamed from: a */
        public final C10126b m32932a() {
            return this.f37684a;
        }

        /* renamed from: b */
        public final C10126b m32933b() {
            return this.f37685b;
        }

        /* renamed from: c */
        public final C10126b m32934c() {
            return this.f37686c;
        }

        /* renamed from: d */
        public final C10126b m32935d() {
            return this.f37684a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9768m.m32341a(this.f37684a, aVar.f37684a) && C9768m.m32341a(this.f37685b, aVar.f37685b) && C9768m.m32341a(this.f37686c, aVar.f37686c);
        }

        public int hashCode() {
            return (((this.f37684a.hashCode() * 31) + this.f37685b.hashCode()) * 31) + this.f37686c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f37684a + ", kotlinReadOnly=" + this.f37685b + ", kotlinMutable=" + this.f37686c + ')';
        }
    }

    static {
        List<a> m38891m;
        C9896c c9896c = new C9896c();
        f37667a = c9896c;
        StringBuilder sb = new StringBuilder();
        EnumC9891c enumC9891c = EnumC9891c.f37650g;
        sb.append(enumC9891c.m32895q().toString());
        sb.append('.');
        sb.append(enumC9891c.m32894k());
        f37668b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        EnumC9891c enumC9891c2 = EnumC9891c.f37652i;
        sb2.append(enumC9891c2.m32895q().toString());
        sb2.append('.');
        sb2.append(enumC9891c2.m32894k());
        f37669c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC9891c enumC9891c3 = EnumC9891c.f37651h;
        sb3.append(enumC9891c3.m32895q().toString());
        sb3.append('.');
        sb3.append(enumC9891c3.m32894k());
        f37670d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC9891c enumC9891c4 = EnumC9891c.f37653j;
        sb4.append(enumC9891c4.m32895q().toString());
        sb4.append('.');
        sb4.append(enumC9891c4.m32894k());
        f37671e = sb4.toString();
        C10126b m35408m = C10126b.m35408m(new C10127c("kotlin.jvm.functions.FunctionN"));
        C9768m.m32345e(m35408m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f37672f = m35408m;
        C10127c m35409b = m35408m.m35409b();
        C9768m.m32345e(m35409b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f37673g = m35409b;
        C10133i c10133i = C10133i.f39305a;
        f37674h = c10133i.m35470i();
        f37675i = c10133i.m35469h();
        f37676j = c9896c.m32922g(Class.class);
        f37677k = new HashMap<>();
        f37678l = new HashMap<>();
        f37679m = new HashMap<>();
        f37680n = new HashMap<>();
        f37681o = new HashMap<>();
        f37682p = new HashMap<>();
        C10126b m35408m2 = C10126b.m35408m(C9884k.a.f37553T);
        C9768m.m32345e(m35408m2, "topLevel(FqNames.iterable)");
        C10127c c10127c = C9884k.a.f37563b0;
        C10127c m35413h = m35408m2.m35413h();
        C10127c m35413h2 = m35408m2.m35413h();
        C9768m.m32345e(m35413h2, "kotlinReadOnly.packageFqName");
        C10127c m35449g = C10129e.m35449g(c10127c, m35413h2);
        C10126b c10126b = new C10126b(m35413h, m35449g, false);
        C10126b m35408m3 = C10126b.m35408m(C9884k.a.f37552S);
        C9768m.m32345e(m35408m3, "topLevel(FqNames.iterator)");
        C10127c c10127c2 = C9884k.a.f37561a0;
        C10127c m35413h3 = m35408m3.m35413h();
        C10127c m35413h4 = m35408m3.m35413h();
        C9768m.m32345e(m35413h4, "kotlinReadOnly.packageFqName");
        C10126b c10126b2 = new C10126b(m35413h3, C10129e.m35449g(c10127c2, m35413h4), false);
        C10126b m35408m4 = C10126b.m35408m(C9884k.a.f37554U);
        C9768m.m32345e(m35408m4, "topLevel(FqNames.collection)");
        C10127c c10127c3 = C9884k.a.f37565c0;
        C10127c m35413h5 = m35408m4.m35413h();
        C10127c m35413h6 = m35408m4.m35413h();
        C9768m.m32345e(m35413h6, "kotlinReadOnly.packageFqName");
        C10126b c10126b3 = new C10126b(m35413h5, C10129e.m35449g(c10127c3, m35413h6), false);
        C10126b m35408m5 = C10126b.m35408m(C9884k.a.f37555V);
        C9768m.m32345e(m35408m5, "topLevel(FqNames.list)");
        C10127c c10127c4 = C9884k.a.f37567d0;
        C10127c m35413h7 = m35408m5.m35413h();
        C10127c m35413h8 = m35408m5.m35413h();
        C9768m.m32345e(m35413h8, "kotlinReadOnly.packageFqName");
        C10126b c10126b4 = new C10126b(m35413h7, C10129e.m35449g(c10127c4, m35413h8), false);
        C10126b m35408m6 = C10126b.m35408m(C9884k.a.f37557X);
        C9768m.m32345e(m35408m6, "topLevel(FqNames.set)");
        C10127c c10127c5 = C9884k.a.f37571f0;
        C10127c m35413h9 = m35408m6.m35413h();
        C10127c m35413h10 = m35408m6.m35413h();
        C9768m.m32345e(m35413h10, "kotlinReadOnly.packageFqName");
        C10126b c10126b5 = new C10126b(m35413h9, C10129e.m35449g(c10127c5, m35413h10), false);
        C10126b m35408m7 = C10126b.m35408m(C9884k.a.f37556W);
        C9768m.m32345e(m35408m7, "topLevel(FqNames.listIterator)");
        C10127c c10127c6 = C9884k.a.f37569e0;
        C10127c m35413h11 = m35408m7.m35413h();
        C10127c m35413h12 = m35408m7.m35413h();
        C9768m.m32345e(m35413h12, "kotlinReadOnly.packageFqName");
        C10126b c10126b6 = new C10126b(m35413h11, C10129e.m35449g(c10127c6, m35413h12), false);
        C10127c c10127c7 = C9884k.a.f37558Y;
        C10126b m35408m8 = C10126b.m35408m(c10127c7);
        C9768m.m32345e(m35408m8, "topLevel(FqNames.map)");
        C10127c c10127c8 = C9884k.a.f37573g0;
        C10127c m35413h13 = m35408m8.m35413h();
        C10127c m35413h14 = m35408m8.m35413h();
        C9768m.m32345e(m35413h14, "kotlinReadOnly.packageFqName");
        C10126b c10126b7 = new C10126b(m35413h13, C10129e.m35449g(c10127c8, m35413h14), false);
        C10126b m35411d = C10126b.m35408m(c10127c7).m35411d(C9884k.a.f37559Z.m35425g());
        C9768m.m32345e(m35411d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        C10127c c10127c9 = C9884k.a.f37575h0;
        C10127c m35413h15 = m35411d.m35413h();
        C10127c m35413h16 = m35411d.m35413h();
        C9768m.m32345e(m35413h16, "kotlinReadOnly.packageFqName");
        m38891m = C10784u.m38891m(new a(c9896c.m32922g(Iterable.class), m35408m2, c10126b), new a(c9896c.m32922g(Iterator.class), m35408m3, c10126b2), new a(c9896c.m32922g(Collection.class), m35408m4, c10126b3), new a(c9896c.m32922g(List.class), m35408m5, c10126b4), new a(c9896c.m32922g(Set.class), m35408m6, c10126b5), new a(c9896c.m32922g(ListIterator.class), m35408m7, c10126b6), new a(c9896c.m32922g(Map.class), m35408m8, c10126b7), new a(c9896c.m32922g(Map.Entry.class), m35411d, new C10126b(m35413h15, C10129e.m35449g(c10127c9, m35413h16), false)));
        f37683q = m38891m;
        c9896c.m32921f(Object.class, C9884k.a.f37562b);
        c9896c.m32921f(String.class, C9884k.a.f37574h);
        c9896c.m32921f(CharSequence.class, C9884k.a.f37572g);
        c9896c.m32920e(Throwable.class, C9884k.a.f37600u);
        c9896c.m32921f(Cloneable.class, C9884k.a.f37566d);
        c9896c.m32921f(Number.class, C9884k.a.f37594r);
        c9896c.m32920e(Comparable.class, C9884k.a.f37602v);
        c9896c.m32921f(Enum.class, C9884k.a.f37596s);
        c9896c.m32920e(Annotation.class, C9884k.a.f37536G);
        Iterator<a> it = m38891m.iterator();
        while (it.hasNext()) {
            f37667a.m32919d(it.next());
        }
        for (EnumC10207e enumC10207e : EnumC10207e.values()) {
            C9896c c9896c2 = f37667a;
            C10126b m35408m9 = C10126b.m35408m(enumC10207e.m36119y());
            C9768m.m32345e(m35408m9, "topLevel(jvmType.wrapperFqName)");
            EnumC9882i m36118x = enumC10207e.m36118x();
            C9768m.m32345e(m36118x, "jvmType.primitiveType");
            C10126b m35408m10 = C10126b.m35408m(C9884k.m32828c(m36118x));
            C9768m.m32345e(m35408m10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            c9896c2.m32916a(m35408m9, m35408m10);
        }
        for (C10126b c10126b8 : C9876c.f37450a.m32700a()) {
            C9896c c9896c3 = f37667a;
            C10126b m35408m11 = C10126b.m35408m(new C10127c("kotlin.jvm.internal." + c10126b8.m35415j().m35455k() + "CompanionObject"));
            C9768m.m32345e(m35408m11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            C10126b m35411d2 = c10126b8.m35411d(C10132h.f39268d);
            C9768m.m32345e(m35411d2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            c9896c3.m32916a(m35408m11, m35411d2);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            C9896c c9896c4 = f37667a;
            C10126b m35408m12 = C10126b.m35408m(new C10127c("kotlin.jvm.functions.Function" + i2));
            C9768m.m32345e(m35408m12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            c9896c4.m32916a(m35408m12, C9884k.m32826a(i2));
            c9896c4.m32918c(new C10127c(f37669c + i2), f37674h);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            EnumC9891c enumC9891c5 = EnumC9891c.f37653j;
            f37667a.m32918c(new C10127c((enumC9891c5.m32895q().toString() + '.' + enumC9891c5.m32894k()) + i3), f37674h);
        }
        C9896c c9896c5 = f37667a;
        C10127c m35441l = C9884k.a.f37564c.m35441l();
        C9768m.m32345e(m35441l, "nothing.toSafe()");
        c9896c5.m32918c(m35441l, c9896c5.m32922g(Void.class));
    }

    private C9896c() {
    }

    /* renamed from: a */
    private final void m32916a(C10126b c10126b, C10126b c10126b2) {
        m32917b(c10126b, c10126b2);
        C10127c m35409b = c10126b2.m35409b();
        C9768m.m32345e(m35409b, "kotlinClassId.asSingleFqName()");
        m32918c(m35409b, c10126b);
    }

    /* renamed from: b */
    private final void m32917b(C10126b c10126b, C10126b c10126b2) {
        HashMap<C10128d, C10126b> hashMap = f37677k;
        C10128d m35428j = c10126b.m35409b().m35428j();
        C9768m.m32345e(m35428j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m35428j, c10126b2);
    }

    /* renamed from: c */
    private final void m32918c(C10127c c10127c, C10126b c10126b) {
        HashMap<C10128d, C10126b> hashMap = f37678l;
        C10128d m35428j = c10127c.m35428j();
        C9768m.m32345e(m35428j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(m35428j, c10126b);
    }

    /* renamed from: d */
    private final void m32919d(a aVar) {
        C10126b m32932a = aVar.m32932a();
        C10126b m32933b = aVar.m32933b();
        C10126b m32934c = aVar.m32934c();
        m32916a(m32932a, m32933b);
        C10127c m35409b = m32934c.m35409b();
        C9768m.m32345e(m35409b, "mutableClassId.asSingleFqName()");
        m32918c(m35409b, m32932a);
        f37681o.put(m32934c, m32933b);
        f37682p.put(m32933b, m32934c);
        C10127c m35409b2 = m32933b.m35409b();
        C9768m.m32345e(m35409b2, "readOnlyClassId.asSingleFqName()");
        C10127c m35409b3 = m32934c.m35409b();
        C9768m.m32345e(m35409b3, "mutableClassId.asSingleFqName()");
        HashMap<C10128d, C10127c> hashMap = f37679m;
        C10128d m35428j = m32934c.m35409b().m35428j();
        C9768m.m32345e(m35428j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m35428j, m35409b2);
        HashMap<C10128d, C10127c> hashMap2 = f37680n;
        C10128d m35428j2 = m35409b2.m35428j();
        C9768m.m32345e(m35428j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(m35428j2, m35409b3);
    }

    /* renamed from: e */
    private final void m32920e(Class<?> cls, C10127c c10127c) {
        C10126b m32922g = m32922g(cls);
        C10126b m35408m = C10126b.m35408m(c10127c);
        C9768m.m32345e(m35408m, "topLevel(kotlinFqName)");
        m32916a(m32922g, m35408m);
    }

    /* renamed from: f */
    private final void m32921f(Class<?> cls, C10128d c10128d) {
        C10127c m35441l = c10128d.m35441l();
        C9768m.m32345e(m35441l, "kotlinFqName.toSafe()");
        m32920e(cls, m35441l);
    }

    /* renamed from: g */
    private final C10126b m32922g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C10126b m35408m = C10126b.m35408m(new C10127c(cls.getCanonicalName()));
            C9768m.m32345e(m35408m, "topLevel(FqName(clazz.canonicalName))");
            return m35408m;
        }
        C10126b m35411d = m32922g(declaringClass).m35411d(C10130f.m35454x(cls.getSimpleName()));
        C9768m.m32345e(m35411d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return m35411d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r5 = kotlin.text.C10512t.m37503j(r5);
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m32923j(kotlin.reflect.p371y.internal.p374j0.p397f.C10128d r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.m35432b()
            java.lang.String r0 = "kotlinFqName.asString()"
            kotlin.jvm.internal.C9768m.m32345e(r5, r0)
            java.lang.String r0 = ""
            java.lang.String r5 = kotlin.text.C10504l.m37451E0(r5, r6, r0)
            int r6 = r5.length()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 == 0) goto L37
            r6 = 48
            r2 = 2
            r3 = 0
            boolean r6 = kotlin.text.C10504l.m37446A0(r5, r6, r1, r2, r3)
            if (r6 != 0) goto L37
            java.lang.Integer r5 = kotlin.text.C10504l.m37476j(r5)
            if (r5 == 0) goto L35
            int r5 = r5.intValue()
            r6 = 23
            if (r5 < r6) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c.m32923j(kotlin.f0.y.e.j0.f.d, java.lang.String):boolean");
    }

    /* renamed from: h */
    public final C10127c m32924h() {
        return f37673g;
    }

    /* renamed from: i */
    public final List<a> m32925i() {
        return f37683q;
    }

    /* renamed from: k */
    public final boolean m32926k(C10128d c10128d) {
        return f37679m.containsKey(c10128d);
    }

    /* renamed from: l */
    public final boolean m32927l(C10128d c10128d) {
        return f37680n.containsKey(c10128d);
    }

    /* renamed from: m */
    public final C10126b m32928m(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return f37677k.get(c10127c.m35428j());
    }

    /* renamed from: n */
    public final C10126b m32929n(C10128d c10128d) {
        C9768m.m32346f(c10128d, "kotlinFqName");
        if (!m32923j(c10128d, f37668b) && !m32923j(c10128d, f37670d)) {
            if (!m32923j(c10128d, f37669c) && !m32923j(c10128d, f37671e)) {
                return f37678l.get(c10128d);
            }
            return f37674h;
        }
        return f37672f;
    }

    /* renamed from: o */
    public final C10127c m32930o(C10128d c10128d) {
        return f37679m.get(c10128d);
    }

    /* renamed from: p */
    public final C10127c m32931p(C10128d c10128d) {
        return f37680n.get(c10128d);
    }
}
