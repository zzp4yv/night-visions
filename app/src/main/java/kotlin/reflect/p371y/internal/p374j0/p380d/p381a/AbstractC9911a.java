package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.collections.C10780s;
import kotlin.collections.C10791x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10594n;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10026i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10023f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9911a<TAnnotation> {

    /* renamed from: a */
    private static final a f37781a = new a(null);

    /* renamed from: b */
    @Deprecated
    private static final Map<String, EnumC9913b> f37782b;

    /* renamed from: c */
    private final C10044w f37783c;

    /* renamed from: d */
    private final ConcurrentHashMap<Object, TAnnotation> f37784d;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.a$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.a$b */
    static final class b extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f */
        public static final b f37785f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            C9768m.m32346f(tannotation, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC9913b enumC9913b : EnumC9913b.values()) {
            String m33045k = enumC9913b.m33045k();
            if (linkedHashMap.get(m33045k) == null) {
                linkedHashMap.put(m33045k, enumC9913b);
            }
        }
        f37782b = linkedHashMap;
    }

    public AbstractC9911a(C10044w c10044w) {
        C9768m.m32346f(c10044w, "javaTypeEnhancementState");
        this.f37783c = c10044w;
        this.f37784d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final Set<EnumC9913b> m33023a(Set<? extends EnumC9913b> set) {
        Set m38758l0;
        Set m38924k;
        Set<EnumC9913b> m38925l;
        if (!set.contains(EnumC9913b.TYPE_USE)) {
            return set;
        }
        m38758l0 = C10770n.m38758l0(EnumC9913b.values());
        m38924k = C10791x0.m38924k(m38758l0, EnumC9913b.TYPE_PARAMETER_BOUNDS);
        m38925l = C10791x0.m38925l(m38924k, set);
        return m38925l;
    }

    /* renamed from: d */
    private final C10038q m33024d(TAnnotation tannotation) {
        C10026i m33025g;
        C10038q m33032r = m33032r(tannotation);
        if (m33032r != null) {
            return m33032r;
        }
        Pair<TAnnotation, Set<EnumC9913b>> m33033t = m33033t(tannotation);
        if (m33033t == null) {
            return null;
        }
        TAnnotation m37646a = m33033t.m37646a();
        Set<EnumC9913b> m37647b = m33033t.m37647b();
        EnumC9922f0 m33031q = m33031q(tannotation);
        if (m33031q == null) {
            m33031q = m33030p(m37646a);
        }
        if (m33031q.m33094q() || (m33025g = m33025g(m37646a, b.f37785f)) == null) {
            return null;
        }
        return new C10038q(C10026i.m33699b(m33025g, null, m33031q.m33095u(), 1, null), m37647b, false, 4, null);
    }

    /* renamed from: g */
    private final C10026i m33025g(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        C10026i m33028n;
        C10026i m33028n2 = m33028n(tannotation, function1.invoke(tannotation).booleanValue());
        if (m33028n2 != null) {
            return m33028n2;
        }
        TAnnotation m33042s = m33042s(tannotation);
        if (m33042s == null) {
            return null;
        }
        EnumC9922f0 m33030p = m33030p(tannotation);
        if (m33030p.m33094q() || (m33028n = m33028n(m33042s, function1.invoke(m33042s).booleanValue())) == null) {
            return null;
        }
        return C10026i.m33699b(m33028n, null, m33030p.m33095u(), 1, null);
    }

    /* renamed from: h */
    private final TAnnotation m33026h(TAnnotation tannotation, C10127c c10127c) {
        for (TAnnotation tannotation2 : mo33040k(tannotation)) {
            if (C9768m.m32341a(mo33038i(tannotation2), c10127c)) {
                return tannotation2;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m33027l(TAnnotation tannotation, C10127c c10127c) {
        Iterable<TAnnotation> mo33040k = mo33040k(tannotation);
        if ((mo33040k instanceof Collection) && ((Collection) mo33040k).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = mo33040k.iterator();
        while (it.hasNext()) {
            if (C9768m.m32341a(mo33038i(it.next()), c10127c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r6.equals("NEVER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r6.equals("MAYBE") == false) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10026i m33028n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.f0.y.e.j0.f.c r0 = r5.mo33038i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.f0.y.e.j0.d.a.w r2 = r5.f37783c
            kotlin.a0.c.l r2 = r2.m33818c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.f0.y.e.j0.d.a.f0 r2 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9922f0) r2
            boolean r3 = r2.m33094q()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33057l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
            goto Ld3
        L2a:
            java.util.List r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33056k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NOT_NULL
            goto Ld3
        L38:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33052g()
            boolean r3 = kotlin.jvm.internal.C9768m.m32341a(r0, r3)
            if (r3 == 0) goto L46
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
            goto Ld3
        L46:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33053h()
            boolean r3 = kotlin.jvm.internal.C9768m.m32341a(r0, r3)
            if (r3 == 0) goto L54
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.FORCE_FLEXIBILITY
            goto Ld3
        L54:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33051f()
            boolean r3 = kotlin.jvm.internal.C9768m.m32341a(r0, r3)
            if (r3 == 0) goto La0
            java.lang.Iterable r6 = r5.mo33034b(r6, r4)
            java.lang.Object r6 = kotlin.collections.C10780s.m38831V(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L90;
                case 74175084: goto L87;
                case 433141802: goto L7b;
                case 1933739535: goto L72;
                default: goto L71;
            }
        L71:
            goto L9c
        L72:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9c
            goto L9d
        L7b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L84
            goto L9c
        L84:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.FORCE_FLEXIBILITY
            goto Ld3
        L87:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L90:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L99:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
            goto Ld3
        L9c:
            return r1
        L9d:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NOT_NULL
            goto Ld3
        La0:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33049d()
            boolean r6 = kotlin.jvm.internal.C9768m.m32341a(r0, r6)
            if (r6 == 0) goto Lad
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
            goto Ld3
        Lad:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33048c()
            boolean r6 = kotlin.jvm.internal.C9768m.m32341a(r0, r6)
            if (r6 == 0) goto Lba
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NOT_NULL
            goto Ld3
        Lba:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33046a()
            boolean r6 = kotlin.jvm.internal.C9768m.m32341a(r0, r6)
            if (r6 == 0) goto Lc7
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NOT_NULL
            goto Ld3
        Lc7:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9914b0.m33047b()
            boolean r6 = kotlin.jvm.internal.C9768m.m32341a(r0, r6)
            if (r6 == 0) goto Le2
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
        Ld3:
            kotlin.f0.y.e.j0.d.a.o0.i r0 = new kotlin.f0.y.e.j0.d.a.o0.i
            boolean r1 = r2.m33095u()
            if (r1 != 0) goto Ldd
            if (r7 == 0) goto Lde
        Ldd:
            r4 = 1
        Lde:
            r0.<init>(r6, r4)
            return r0
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a.m33028n(java.lang.Object, boolean):kotlin.f0.y.e.j0.d.a.o0.i");
    }

    /* renamed from: o */
    private final EnumC9922f0 m33029o(TAnnotation tannotation) {
        C10127c mo33038i = mo33038i(tannotation);
        return (mo33038i == null || !C9915c.m33061c().containsKey(mo33038i)) ? m33030p(tannotation) : this.f37783c.m33818c().invoke(mo33038i);
    }

    /* renamed from: p */
    private final EnumC9922f0 m33030p(TAnnotation tannotation) {
        EnumC9922f0 m33031q = m33031q(tannotation);
        return m33031q != null ? m33031q : this.f37783c.m33819d().m33824a();
    }

    /* renamed from: q */
    private final EnumC9922f0 m33031q(TAnnotation tannotation) {
        Iterable<String> mo33034b;
        String str;
        EnumC9922f0 enumC9922f0 = this.f37783c.m33819d().m33826c().get(mo33038i(tannotation));
        if (enumC9922f0 != null) {
            return enumC9922f0;
        }
        TAnnotation m33026h = m33026h(tannotation, C9915c.m33062d());
        if (m33026h == null || (mo33034b = mo33034b(m33026h, false)) == null || (str = (String) C10780s.m38831V(mo33034b)) == null) {
            return null;
        }
        EnumC9922f0 m33825b = this.f37783c.m33819d().m33825b();
        if (m33825b != null) {
            return m33825b;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC9922f0.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC9922f0.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return EnumC9922f0.WARN;
        }
        return null;
    }

    /* renamed from: r */
    private final C10038q m33032r(TAnnotation tannotation) {
        C10038q c10038q;
        if (this.f37783c.m33817b() || (c10038q = C9915c.m33059a().get(mo33038i(tannotation))) == null) {
            return null;
        }
        EnumC9922f0 m33029o = m33029o(tannotation);
        if (!(m33029o != EnumC9922f0.IGNORE)) {
            m33029o = null;
        }
        if (m33029o == null) {
            return null;
        }
        return C10038q.m33783b(c10038q, C10026i.m33699b(c10038q.m33786d(), null, m33029o.m33095u(), 1, null), null, false, 6, null);
    }

    /* renamed from: t */
    private final Pair<TAnnotation, Set<EnumC9913b>> m33033t(TAnnotation tannotation) {
        TAnnotation m33026h;
        TAnnotation tannotation2;
        if (this.f37783c.m33819d().m33827d() || (m33026h = m33026h(tannotation, C9915c.m33063e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo33040k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = it.next();
            if (m33042s(tannotation2) != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> mo33034b = mo33034b(m33026h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = mo33034b.iterator();
        while (it2.hasNext()) {
            EnumC9913b enumC9913b = f37782b.get(it2.next());
            if (enumC9913b != null) {
                linkedHashSet.add(enumC9913b);
            }
        }
        return new Pair<>(tannotation2, m33023a(linkedHashSet));
    }

    /* renamed from: b */
    protected abstract Iterable<String> mo33034b(TAnnotation tannotation, boolean z);

    /* renamed from: c */
    public final C10045x m33035c(C10045x c10045x, Iterable<? extends TAnnotation> iterable) {
        EnumMap<EnumC9913b, C10038q> m33823b;
        C9768m.m32346f(iterable, "annotations");
        if (this.f37783c.m33817b()) {
            return c10045x;
        }
        ArrayList<C10038q> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            C10038q m33024d = m33024d(it.next());
            if (m33024d != null) {
                arrayList.add(m33024d);
            }
        }
        if (arrayList.isEmpty()) {
            return c10045x;
        }
        EnumMap enumMap = (c10045x == null || (m33823b = c10045x.m33823b()) == null) ? new EnumMap(EnumC9913b.class) : new EnumMap((EnumMap) m33823b);
        boolean z = false;
        for (C10038q c10038q : arrayList) {
            Iterator<EnumC9913b> it2 = c10038q.m33787e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (EnumC9913b) c10038q);
                z = true;
            }
        }
        return !z ? c10045x : new C10045x(enumMap);
    }

    /* renamed from: e */
    public final EnumC10023f m33036e(Iterable<? extends TAnnotation> iterable) {
        EnumC10023f enumC10023f;
        C9768m.m32346f(iterable, "annotations");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        EnumC10023f enumC10023f2 = null;
        while (it.hasNext()) {
            C10127c mo33038i = mo33038i(it.next());
            if (C9914b0.m33058m().contains(mo33038i)) {
                enumC10023f = EnumC10023f.READ_ONLY;
            } else if (C9914b0.m33055j().contains(mo33038i)) {
                enumC10023f = EnumC10023f.MUTABLE;
            } else {
                continue;
            }
            if (enumC10023f2 != null && enumC10023f2 != enumC10023f) {
                return null;
            }
            enumC10023f2 = enumC10023f;
        }
        return enumC10023f2;
    }

    /* renamed from: f */
    public final C10026i m33037f(Iterable<? extends TAnnotation> iterable, Function1<? super TAnnotation, Boolean> function1) {
        C9768m.m32346f(iterable, "annotations");
        C9768m.m32346f(function1, "forceWarning");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        C10026i c10026i = null;
        while (it.hasNext()) {
            C10026i m33025g = m33025g(it.next(), function1);
            if (c10026i != null) {
                if (m33025g != null && !C9768m.m32341a(m33025g, c10026i) && (!m33025g.m33702d() || c10026i.m33702d())) {
                    if (m33025g.m33702d() || !c10026i.m33702d()) {
                        return null;
                    }
                }
            }
            c10026i = m33025g;
        }
        return c10026i;
    }

    /* renamed from: i */
    protected abstract C10127c mo33038i(TAnnotation tannotation);

    /* renamed from: j */
    protected abstract Object mo33039j(TAnnotation tannotation);

    /* renamed from: k */
    protected abstract Iterable<TAnnotation> mo33040k(TAnnotation tannotation);

    /* renamed from: m */
    public final boolean m33041m(TAnnotation tannotation) {
        C9768m.m32346f(tannotation, "annotation");
        TAnnotation m33026h = m33026h(tannotation, C9884k.a.f37538H);
        if (m33026h == null) {
            return false;
        }
        Iterable<String> mo33034b = mo33034b(m33026h, false);
        if ((mo33034b instanceof Collection) && ((Collection) mo33034b).isEmpty()) {
            return false;
        }
        Iterator<String> it = mo33034b.iterator();
        while (it.hasNext()) {
            if (C9768m.m32341a(it.next(), EnumC10594n.f40834H.name())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final TAnnotation m33042s(TAnnotation tannotation) {
        boolean m38577K;
        TAnnotation tannotation2;
        C9768m.m32346f(tannotation, "annotation");
        if (this.f37783c.m33819d().m33827d()) {
            return null;
        }
        m38577K = C10749c0.m38577K(C9915c.m33060b(), mo33038i(tannotation));
        if (m38577K || m33027l(tannotation, C9915c.m33064f())) {
            return tannotation;
        }
        if (!m33027l(tannotation, C9915c.m33065g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f37784d;
        Object mo33039j = mo33039j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(mo33039j);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator<TAnnotation> it = mo33040k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = m33042s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(mo33039j, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
