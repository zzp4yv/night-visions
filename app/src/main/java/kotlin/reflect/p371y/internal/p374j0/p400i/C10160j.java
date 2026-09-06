package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C10742u;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10607b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10313f;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10362f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;

/* compiled from: OverridingUtil.java */
/* renamed from: kotlin.f0.y.e.j0.i.j */
/* loaded from: classes3.dex */
public class C10160j {

    /* renamed from: a */
    private static final List<InterfaceC10155e> f39519a = C10749c0.m38569E0(ServiceLoader.load(InterfaceC10155e.class, InterfaceC10155e.class.getClassLoader()));

    /* renamed from: b */
    public static final C10160j f39520b;

    /* renamed from: c */
    private static final InterfaceC10361e.a f39521c;

    /* renamed from: d */
    private final AbstractC10363g f39522d;

    /* renamed from: e */
    private final AbstractC10362f f39523e;

    /* renamed from: f */
    private final InterfaceC10361e.a f39524f;

    /* renamed from: g */
    private final Function2<AbstractC10311e0, AbstractC10311e0, Boolean> f39525g;

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$a */
    static class a implements InterfaceC10361e.a {
        a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m35887b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e.a
        /* renamed from: a */
        public boolean mo35780a(InterfaceC10312e1 interfaceC10312e1, InterfaceC10312e1 interfaceC10312e12) {
            if (interfaceC10312e1 == null) {
                m35887b(0);
            }
            if (interfaceC10312e12 == null) {
                m35887b(1);
            }
            return interfaceC10312e1.equals(interfaceC10312e12);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$b */
    static class b<D> implements Function2<D, D, Pair<InterfaceC10540a, InterfaceC10540a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/m<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair invoke(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
            return new Pair(interfaceC10540a, interfaceC10540a2);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$c */
    static class c implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10576m f39526f;

        c(InterfaceC10576m interfaceC10576m) {
            this.f39526f = interfaceC10576m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10543b interfaceC10543b) {
            return Boolean.valueOf(interfaceC10543b.mo32876b() == this.f39526f);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$d */
    static class d implements Function1<InterfaceC10543b, InterfaceC10540a> {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10543b invoke(InterfaceC10543b interfaceC10543b) {
            return interfaceC10543b;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$e */
    static class e implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10552e f39527f;

        e(InterfaceC10552e interfaceC10552e) {
            this.f39527f = interfaceC10552e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10543b interfaceC10543b) {
            boolean z = false;
            if (!C10695t.m38132g(interfaceC10543b.getVisibility()) && C10695t.m38133h(interfaceC10543b, this.f39527f, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$f */
    static class f implements Function1<InterfaceC10543b, InterfaceC10540a> {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10540a invoke(InterfaceC10543b interfaceC10543b) {
            return interfaceC10543b;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$g */
    static class g implements Function1<InterfaceC10543b, C10742u> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10159i f39528f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10543b f39529g;

        g(AbstractC10159i abstractC10159i, InterfaceC10543b interfaceC10543b) {
            this.f39528f = abstractC10159i;
            this.f39529g = interfaceC10543b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10742u invoke(InterfaceC10543b interfaceC10543b) {
            this.f39528f.mo35847b(this.f39529g, interfaceC10543b);
            return C10742u.f41439a;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$h */
    static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f39530a;

        /* renamed from: b */
        static final /* synthetic */ int[] f39531b;

        /* renamed from: c */
        static final /* synthetic */ int[] f39532c;

        static {
            int[] iArr = new int[EnumC10550d0.values().length];
            f39532c = iArr;
            try {
                iArr[EnumC10550d0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39532c[EnumC10550d0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39532c[EnumC10550d0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39532c[EnumC10550d0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f39531b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39531b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39531b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC10155e.b.values().length];
            f39530a = iArr3;
            try {
                iArr3[InterfaceC10155e.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39530a[InterfaceC10155e.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39530a[InterfaceC10155e.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39530a[InterfaceC10155e.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$i */
    public static class i {

        /* renamed from: a */
        private static final i f39533a = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: b */
        private final a f39534b;

        /* renamed from: c */
        private final String f39535c;

        /* compiled from: OverridingUtil.java */
        /* renamed from: kotlin.f0.y.e.j0.i.j$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                m35894a(3);
            }
            if (str == null) {
                m35894a(4);
            }
            this.f39534b = aVar;
            this.f39535c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void m35894a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10160j.i.m35894a(int):void");
        }

        /* renamed from: b */
        public static i m35895b(String str) {
            if (str == null) {
                m35894a(2);
            }
            return new i(a.CONFLICT, str);
        }

        /* renamed from: d */
        public static i m35896d(String str) {
            if (str == null) {
                m35894a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static i m35897e() {
            i iVar = f39533a;
            if (iVar == null) {
                m35894a(0);
            }
            return iVar;
        }

        /* renamed from: c */
        public a m35898c() {
            a aVar = this.f39534b;
            if (aVar == null) {
                m35894a(5);
            }
            return aVar;
        }
    }

    static {
        a aVar = new a();
        f39521c = aVar;
        f39520b = new C10160j(aVar, AbstractC10363g.a.f40183a, AbstractC10362f.a.f40182a, null);
    }

    private C10160j(InterfaceC10361e.a aVar, AbstractC10363g abstractC10363g, AbstractC10362f abstractC10362f, Function2<AbstractC10311e0, AbstractC10311e0, Boolean> function2) {
        if (aVar == null) {
            m35858a(5);
        }
        if (abstractC10363g == null) {
            m35858a(6);
        }
        if (abstractC10362f == null) {
            m35858a(7);
        }
        this.f39524f = aVar;
        this.f39522d = abstractC10363g;
        this.f39523e = abstractC10362f;
        this.f39525g = function2;
    }

    /* renamed from: A */
    private static boolean m35849A(InterfaceC10694s0 interfaceC10694s0, InterfaceC10694s0 interfaceC10694s02) {
        if (interfaceC10694s0 == null || interfaceC10694s02 == null) {
            return true;
        }
        return m35853H(interfaceC10694s0, interfaceC10694s02);
    }

    /* renamed from: B */
    public static boolean m35850B(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
        if (interfaceC10540a == null) {
            m35858a(67);
        }
        if (interfaceC10540a2 == null) {
            m35858a(68);
        }
        AbstractC10311e0 returnType = interfaceC10540a.getReturnType();
        AbstractC10311e0 returnType2 = interfaceC10540a2.getReturnType();
        if (!m35853H(interfaceC10540a, interfaceC10540a2)) {
            return false;
        }
        C10309d1 m35869l = f39520b.m35869l(interfaceC10540a.getTypeParameters(), interfaceC10540a2.getTypeParameters());
        if (interfaceC10540a instanceof InterfaceC10705y) {
            return m35852G(interfaceC10540a, returnType, interfaceC10540a2, returnType2, m35869l);
        }
        if (!(interfaceC10540a instanceof InterfaceC10696t0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC10540a.getClass());
        }
        InterfaceC10696t0 interfaceC10696t0 = (InterfaceC10696t0) interfaceC10540a;
        InterfaceC10696t0 interfaceC10696t02 = (InterfaceC10696t0) interfaceC10540a2;
        if (m35849A(interfaceC10696t0.getSetter(), interfaceC10696t02.getSetter())) {
            return (interfaceC10696t0.mo37031j0() && interfaceC10696t02.mo37031j0()) ? C10313f.f40078a.m36654k(m35869l, returnType.mo36635R0(), returnType2.mo36635R0()) : (interfaceC10696t0.mo37031j0() || !interfaceC10696t02.mo37031j0()) && m35852G(interfaceC10540a, returnType, interfaceC10540a2, returnType2, m35869l);
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m35851C(InterfaceC10540a interfaceC10540a, Collection<InterfaceC10540a> collection) {
        if (interfaceC10540a == null) {
            m35858a(71);
        }
        if (collection == null) {
            m35858a(72);
        }
        Iterator<InterfaceC10540a> it = collection.iterator();
        while (it.hasNext()) {
            if (!m35850B(interfaceC10540a, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m35852G(InterfaceC10540a interfaceC10540a, AbstractC10311e0 abstractC10311e0, InterfaceC10540a interfaceC10540a2, AbstractC10311e0 abstractC10311e02, C10309d1 c10309d1) {
        if (interfaceC10540a == null) {
            m35858a(73);
        }
        if (abstractC10311e0 == null) {
            m35858a(74);
        }
        if (interfaceC10540a2 == null) {
            m35858a(75);
        }
        if (abstractC10311e02 == null) {
            m35858a(76);
        }
        if (c10309d1 == null) {
            m35858a(77);
        }
        return C10313f.f40078a.m36657r(c10309d1, abstractC10311e0.mo36635R0(), abstractC10311e02.mo36635R0());
    }

    /* renamed from: H */
    private static boolean m35853H(InterfaceC10644q interfaceC10644q, InterfaceC10644q interfaceC10644q2) {
        if (interfaceC10644q == null) {
            m35858a(69);
        }
        if (interfaceC10644q2 == null) {
            m35858a(70);
        }
        Integer m38129d = C10695t.m38129d(interfaceC10644q.getVisibility(), interfaceC10644q2.getVisibility());
        return m38129d == null || m38129d.intValue() >= 0;
    }

    /* renamed from: I */
    public static boolean m35854I(InterfaceC10547c0 interfaceC10547c0, InterfaceC10547c0 interfaceC10547c02, boolean z) {
        if (interfaceC10547c0 == null) {
            m35858a(57);
        }
        if (interfaceC10547c02 == null) {
            m35858a(58);
        }
        return !C10695t.m38132g(interfaceC10547c02.getVisibility()) && C10695t.m38133h(interfaceC10547c02, interfaceC10547c0, z);
    }

    /* renamed from: J */
    public static <D extends InterfaceC10540a> boolean m35855J(D d2, D d3, boolean z, boolean z2) {
        if (d2 == null) {
            m35858a(13);
        }
        if (d3 == null) {
            m35858a(14);
        }
        if (!d2.equals(d3) && C10152b.f39498a.m35776d(d2.mo37019a(), d3.mo37019a(), z, z2)) {
            return true;
        }
        InterfaceC10540a mo37019a = d3.mo37019a();
        Iterator it = C10154d.m35816d(d2).iterator();
        while (it.hasNext()) {
            if (C10152b.f39498a.m35776d(mo37019a, (InterfaceC10540a) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m35856K(InterfaceC10543b interfaceC10543b, Function1<InterfaceC10543b, C10742u> function1) {
        AbstractC10697u abstractC10697u;
        if (interfaceC10543b == null) {
            m35858a(107);
        }
        for (InterfaceC10543b interfaceC10543b2 : interfaceC10543b.mo37027e()) {
            if (interfaceC10543b2.getVisibility() == C10695t.f41222g) {
                m35856K(interfaceC10543b2, function1);
            }
        }
        if (interfaceC10543b.getVisibility() != C10695t.f41222g) {
            return;
        }
        AbstractC10697u m35865h = m35865h(interfaceC10543b);
        if (m35865h == null) {
            if (function1 != null) {
                function1.invoke(interfaceC10543b);
            }
            abstractC10697u = C10695t.f41220e;
        } else {
            abstractC10697u = m35865h;
        }
        if (interfaceC10543b instanceof C10609c0) {
            ((C10609c0) interfaceC10543b).m37795d1(abstractC10697u);
            Iterator<InterfaceC10694s0> it = ((InterfaceC10696t0) interfaceC10543b).mo37037x().iterator();
            while (it.hasNext()) {
                m35856K(it.next(), m35865h == null ? null : function1);
            }
            return;
        }
        if (interfaceC10543b instanceof AbstractC10633p) {
            ((AbstractC10633p) interfaceC10543b).m37931k1(abstractC10697u);
            return;
        }
        AbstractC10607b0 abstractC10607b0 = (AbstractC10607b0) interfaceC10543b;
        abstractC10607b0.m37771P0(abstractC10697u);
        if (abstractC10697u != abstractC10607b0.mo37763B0().getVisibility()) {
            abstractC10607b0.m37769N0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public static <H> H m35857L(Collection<H> collection, Function1<H, InterfaceC10540a> function1) {
        List m38604j0;
        if (collection == null) {
            m35858a(78);
        }
        if (function1 == 0) {
            m35858a(79);
        }
        if (collection.size() == 1) {
            H h2 = (H) C10780s.m38829T(collection);
            if (h2 == null) {
                m35858a(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        m38604j0 = C10749c0.m38604j0(collection, function1);
        H h3 = (H) C10780s.m38829T(collection);
        InterfaceC10540a interfaceC10540a = (InterfaceC10540a) function1.invoke(h3);
        for (H h4 : collection) {
            InterfaceC10540a interfaceC10540a2 = (InterfaceC10540a) function1.invoke(h4);
            if (m35851C(interfaceC10540a2, m38604j0)) {
                arrayList.add(h4);
            }
            if (m35850B(interfaceC10540a2, interfaceC10540a) && !m35850B(interfaceC10540a, interfaceC10540a2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m35858a(81);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) C10780s.m38829T(arrayList);
            if (h5 == null) {
                m35858a(82);
            }
            return h5;
        }
        H h6 = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!C10302b0.m36583b(((InterfaceC10540a) function1.invoke(next)).getReturnType())) {
                h6 = next;
                break;
            }
        }
        if (h6 != null) {
            return h6;
        }
        H h7 = (H) C10780s.m38829T(arrayList);
        if (h7 == null) {
            m35858a(84);
        }
        return h7;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m35858a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10160j.m35858a(int):void");
    }

    /* renamed from: b */
    private static boolean m35859b(Collection<InterfaceC10543b> collection) {
        boolean m38573I;
        if (collection == null) {
            m35858a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        m38573I = C10749c0.m38573I(collection, new c(collection.iterator().next().mo32876b()));
        return m38573I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m35860c(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1 r4, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1 r5, kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            m35858a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            m35858a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            m35858a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.f0.y.e.j0.l.e0 r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.f0.y.e.j0.l.e0 r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0) r3
            boolean r3 = m35861d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10160j.m35860c(kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.f0.y.e.j0.l.d1):boolean");
    }

    /* renamed from: d */
    private static boolean m35861d(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, C10309d1 c10309d1) {
        if (abstractC10311e0 == null) {
            m35858a(46);
        }
        if (abstractC10311e02 == null) {
            m35858a(47);
        }
        if (c10309d1 == null) {
            m35858a(48);
        }
        if (C10317g0.m36706a(abstractC10311e0) && C10317g0.m36706a(abstractC10311e02)) {
            return true;
        }
        return C10313f.f40078a.m36654k(c10309d1, abstractC10311e0.mo36635R0(), abstractC10311e02.mo36635R0());
    }

    /* renamed from: e */
    private static i m35862e(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
        if ((interfaceC10540a.mo37032m0() == null) != (interfaceC10540a2.mo37032m0() == null)) {
            return i.m35896d("Receiver presence mismatch");
        }
        if (interfaceC10540a.mo37028f().size() != interfaceC10540a2.mo37028f().size()) {
            return i.m35896d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m35863f(InterfaceC10543b interfaceC10543b, Set<InterfaceC10543b> set) {
        if (interfaceC10543b == null) {
            m35858a(17);
        }
        if (set == null) {
            m35858a(18);
        }
        if (interfaceC10543b.mo37030i().m37667g()) {
            set.add(interfaceC10543b);
            return;
        }
        if (interfaceC10543b.mo37027e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC10543b);
        }
        Iterator<? extends InterfaceC10543b> it = interfaceC10543b.mo37027e().iterator();
        while (it.hasNext()) {
            m35863f(it.next(), set);
        }
    }

    /* renamed from: g */
    private static List<AbstractC10311e0> m35864g(InterfaceC10540a interfaceC10540a) {
        InterfaceC10702w0 mo37032m0 = interfaceC10540a.mo37032m0();
        ArrayList arrayList = new ArrayList();
        if (mo37032m0 != null) {
            arrayList.add(mo37032m0.getType());
        }
        Iterator<InterfaceC10566i1> it = interfaceC10540a.mo37028f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static AbstractC10697u m35865h(InterfaceC10543b interfaceC10543b) {
        if (interfaceC10543b == null) {
            m35858a(108);
        }
        Collection<? extends InterfaceC10543b> mo37027e = interfaceC10543b.mo37027e();
        AbstractC10697u m35878u = m35878u(mo37027e);
        if (m35878u == null) {
            return null;
        }
        if (interfaceC10543b.mo37030i() != InterfaceC10543b.a.FAKE_OVERRIDE) {
            return m35878u.mo38009f();
        }
        for (InterfaceC10543b interfaceC10543b2 : mo37027e) {
            if (interfaceC10543b2.mo32879j() != EnumC10550d0.ABSTRACT && !interfaceC10543b2.getVisibility().equals(m35878u)) {
                return null;
            }
        }
        return m35878u;
    }

    /* renamed from: i */
    public static C10160j m35866i(AbstractC10363g abstractC10363g, InterfaceC10361e.a aVar) {
        if (abstractC10363g == null) {
            m35858a(3);
        }
        if (aVar == null) {
            m35858a(4);
        }
        return new C10160j(aVar, abstractC10363g, AbstractC10362f.a.f40182a, null);
    }

    /* renamed from: j */
    private static void m35867j(Collection<InterfaceC10543b> collection, InterfaceC10552e interfaceC10552e, AbstractC10159i abstractC10159i) {
        if (collection == null) {
            m35858a(85);
        }
        if (interfaceC10552e == null) {
            m35858a(86);
        }
        if (abstractC10159i == null) {
            m35858a(87);
        }
        Collection<InterfaceC10543b> m35877t = m35877t(interfaceC10552e, collection);
        boolean isEmpty = m35877t.isEmpty();
        if (!isEmpty) {
            collection = m35877t;
        }
        InterfaceC10543b mo36990k0 = ((InterfaceC10543b) m35857L(collection, new d())).mo36990k0(interfaceC10552e, m35871n(collection, interfaceC10552e), isEmpty ? C10695t.f41223h : C10695t.f41222g, InterfaceC10543b.a.FAKE_OVERRIDE, false);
        abstractC10159i.mo33155d(mo36990k0, collection);
        abstractC10159i.mo33154a(mo36990k0);
    }

    /* renamed from: k */
    private static void m35868k(InterfaceC10552e interfaceC10552e, Collection<InterfaceC10543b> collection, AbstractC10159i abstractC10159i) {
        if (interfaceC10552e == null) {
            m35858a(64);
        }
        if (collection == null) {
            m35858a(65);
        }
        if (abstractC10159i == null) {
            m35858a(66);
        }
        if (m35859b(collection)) {
            Iterator<InterfaceC10543b> it = collection.iterator();
            while (it.hasNext()) {
                m35867j(Collections.singleton(it.next()), interfaceC10552e, abstractC10159i);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m35867j(m35874q(C10166p.m35990a(linkedList), linkedList, abstractC10159i), interfaceC10552e, abstractC10159i);
            }
        }
    }

    /* renamed from: l */
    private C10309d1 m35869l(List<InterfaceC10554e1> list, List<InterfaceC10554e1> list2) {
        if (list == null) {
            m35858a(42);
        }
        if (list2 == null) {
            m35858a(43);
        }
        if (list.isEmpty()) {
            C10309d1 m35914H0 = new C10161k(null, this.f39524f, this.f39522d, this.f39523e, this.f39525g).m35914H0(true, true);
            if (m35914H0 == null) {
                m35858a(44);
            }
            return m35914H0;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashMap.put(list.get(i2).mo32877h(), list2.get(i2).mo32877h());
        }
        C10309d1 m35914H02 = new C10161k(hashMap, this.f39524f, this.f39522d, this.f39523e, this.f39525g).m35914H0(true, true);
        if (m35914H02 == null) {
            m35858a(45);
        }
        return m35914H02;
    }

    /* renamed from: m */
    public static C10160j m35870m(AbstractC10363g abstractC10363g) {
        if (abstractC10363g == null) {
            m35858a(0);
        }
        return new C10160j(f39521c, abstractC10363g, AbstractC10362f.a.f40182a, null);
    }

    /* renamed from: n */
    private static EnumC10550d0 m35871n(Collection<InterfaceC10543b> collection, InterfaceC10552e interfaceC10552e) {
        if (collection == null) {
            m35858a(88);
        }
        if (interfaceC10552e == null) {
            m35858a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC10543b interfaceC10543b : collection) {
            int i2 = h.f39532c[interfaceC10543b.mo32879j().ordinal()];
            if (i2 == 1) {
                EnumC10550d0 enumC10550d0 = EnumC10550d0.FINAL;
                if (enumC10550d0 == null) {
                    m35858a(90);
                }
                return enumC10550d0;
            }
            if (i2 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC10543b);
            }
            if (i2 == 3) {
                z2 = true;
            } else if (i2 == 4) {
                z3 = true;
            }
        }
        if (interfaceC10552e.mo32863M() && interfaceC10552e.mo32879j() != EnumC10550d0.ABSTRACT && interfaceC10552e.mo32879j() != EnumC10550d0.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            EnumC10550d0 enumC10550d02 = EnumC10550d0.OPEN;
            if (enumC10550d02 == null) {
                m35858a(91);
            }
            return enumC10550d02;
        }
        if (!z2 && z3) {
            EnumC10550d0 mo32879j = z ? interfaceC10552e.mo32879j() : EnumC10550d0.ABSTRACT;
            if (mo32879j == null) {
                m35858a(92);
            }
            return mo32879j;
        }
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10543b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m35882z(it.next()));
        }
        return m35881y(m35875r(hashSet), z, interfaceC10552e.mo32879j());
    }

    /* renamed from: o */
    private Collection<InterfaceC10543b> m35872o(InterfaceC10543b interfaceC10543b, Collection<? extends InterfaceC10543b> collection, InterfaceC10552e interfaceC10552e, AbstractC10159i abstractC10159i) {
        if (interfaceC10543b == null) {
            m35858a(59);
        }
        if (collection == null) {
            m35858a(60);
        }
        if (interfaceC10552e == null) {
            m35858a(61);
        }
        if (abstractC10159i == null) {
            m35858a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C10739f m38540c = C10739f.m38540c();
        for (InterfaceC10543b interfaceC10543b2 : collection) {
            i.a m35898c = m35883D(interfaceC10543b2, interfaceC10543b, interfaceC10552e).m35898c();
            boolean m35854I = m35854I(interfaceC10543b, interfaceC10543b2, false);
            int i2 = h.f39531b[m35898c.ordinal()];
            if (i2 == 1) {
                if (m35854I) {
                    m38540c.add(interfaceC10543b2);
                }
                arrayList.add(interfaceC10543b2);
            } else if (i2 == 2) {
                if (m35854I) {
                    abstractC10159i.mo35848c(interfaceC10543b2, interfaceC10543b);
                }
                arrayList.add(interfaceC10543b2);
            }
        }
        abstractC10159i.mo33155d(interfaceC10543b, m38540c);
        return arrayList;
    }

    /* renamed from: p */
    public static <H> Collection<H> m35873p(H h2, Collection<H> collection, Function1<H, InterfaceC10540a> function1, Function1<H, C10742u> function12) {
        if (h2 == null) {
            m35858a(99);
        }
        if (collection == null) {
            m35858a(100);
        }
        if (function1 == null) {
            m35858a(101);
        }
        if (function12 == null) {
            m35858a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h2);
        InterfaceC10540a invoke = function1.invoke(h2);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            InterfaceC10540a invoke2 = function1.invoke(next);
            if (h2 == next) {
                it.remove();
            } else {
                i.a m35880x = m35880x(invoke, invoke2);
                if (m35880x == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (m35880x == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private static Collection<InterfaceC10543b> m35874q(InterfaceC10543b interfaceC10543b, Queue<InterfaceC10543b> queue, AbstractC10159i abstractC10159i) {
        if (interfaceC10543b == null) {
            m35858a(104);
        }
        if (queue == null) {
            m35858a(105);
        }
        if (abstractC10159i == null) {
            m35858a(106);
        }
        return m35873p(interfaceC10543b, queue, new f(), new g(abstractC10159i, interfaceC10543b));
    }

    /* renamed from: r */
    public static <D extends InterfaceC10540a> Set<D> m35875r(Set<D> set) {
        if (set == null) {
            m35858a(8);
        }
        return m35876s(set, !set.isEmpty() && C10202a.m36083q(C10202a.m36078l(set.iterator().next())), null, new b());
    }

    /* renamed from: s */
    public static <D> Set<D> m35876s(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<InterfaceC10540a, InterfaceC10540a>> function2) {
        if (set == null) {
            m35858a(9);
        }
        if (function2 == null) {
            m35858a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<InterfaceC10540a, InterfaceC10540a> invoke = function2.invoke(obj, (Object) it.next());
                InterfaceC10540a m37646a = invoke.m37646a();
                InterfaceC10540a m37647b = invoke.m37647b();
                if (!m35855J(m37646a, m37647b, z, true)) {
                    if (m35855J(m37647b, m37646a, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    private static Collection<InterfaceC10543b> m35877t(InterfaceC10552e interfaceC10552e, Collection<InterfaceC10543b> collection) {
        List m38585Q;
        if (interfaceC10552e == null) {
            m35858a(96);
        }
        if (collection == null) {
            m35858a(97);
        }
        m38585Q = C10749c0.m38585Q(collection, new e(interfaceC10552e));
        if (m38585Q == null) {
            m35858a(98);
        }
        return m38585Q;
    }

    /* renamed from: u */
    public static AbstractC10697u m35878u(Collection<? extends InterfaceC10543b> collection) {
        AbstractC10697u abstractC10697u;
        if (collection == null) {
            m35858a(109);
        }
        if (collection.isEmpty()) {
            return C10695t.f41227l;
        }
        Iterator<? extends InterfaceC10543b> it = collection.iterator();
        loop0: while (true) {
            abstractC10697u = null;
            while (it.hasNext()) {
                AbstractC10697u visibility = it.next().getVisibility();
                if (abstractC10697u != null) {
                    Integer m38129d = C10695t.m38129d(visibility, abstractC10697u);
                    if (m38129d == null) {
                        break;
                    }
                    if (m38129d.intValue() > 0) {
                    }
                }
                abstractC10697u = visibility;
            }
        }
        if (abstractC10697u == null) {
            return null;
        }
        Iterator<? extends InterfaceC10543b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer m38129d2 = C10695t.m38129d(abstractC10697u, it2.next().getVisibility());
            if (m38129d2 == null || m38129d2.intValue() < 0) {
                return null;
            }
        }
        return abstractC10697u;
    }

    /* renamed from: w */
    public static i m35879w(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
        boolean z;
        if (interfaceC10540a == null) {
            m35858a(40);
        }
        if (interfaceC10540a2 == null) {
            m35858a(41);
        }
        boolean z2 = interfaceC10540a instanceof InterfaceC10705y;
        if ((z2 && !(interfaceC10540a2 instanceof InterfaceC10705y)) || (((z = interfaceC10540a instanceof InterfaceC10696t0)) && !(interfaceC10540a2 instanceof InterfaceC10696t0))) {
            return i.m35896d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC10540a);
        }
        if (!interfaceC10540a.getName().equals(interfaceC10540a2.getName())) {
            return i.m35896d("Name mismatch");
        }
        i m35862e = m35862e(interfaceC10540a, interfaceC10540a2);
        if (m35862e != null) {
            return m35862e;
        }
        return null;
    }

    /* renamed from: x */
    public static i.a m35880x(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
        C10160j c10160j = f39520b;
        i.a m35898c = c10160j.m35883D(interfaceC10540a2, interfaceC10540a, null).m35898c();
        i.a m35898c2 = c10160j.m35883D(interfaceC10540a, interfaceC10540a2, null).m35898c();
        i.a aVar = i.a.OVERRIDABLE;
        if (m35898c == aVar && m35898c2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (m35898c == aVar2 || m35898c2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    /* renamed from: y */
    private static EnumC10550d0 m35881y(Collection<InterfaceC10543b> collection, boolean z, EnumC10550d0 enumC10550d0) {
        if (collection == null) {
            m35858a(93);
        }
        if (enumC10550d0 == null) {
            m35858a(94);
        }
        EnumC10550d0 enumC10550d02 = EnumC10550d0.ABSTRACT;
        for (InterfaceC10543b interfaceC10543b : collection) {
            EnumC10550d0 mo32879j = (z && interfaceC10543b.mo32879j() == EnumC10550d0.ABSTRACT) ? enumC10550d0 : interfaceC10543b.mo32879j();
            if (mo32879j.compareTo(enumC10550d02) < 0) {
                enumC10550d02 = mo32879j;
            }
        }
        if (enumC10550d02 == null) {
            m35858a(95);
        }
        return enumC10550d02;
    }

    /* renamed from: z */
    public static Set<InterfaceC10543b> m35882z(InterfaceC10543b interfaceC10543b) {
        if (interfaceC10543b == null) {
            m35858a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m35863f(interfaceC10543b, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public i m35883D(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e) {
        if (interfaceC10540a == null) {
            m35858a(19);
        }
        if (interfaceC10540a2 == null) {
            m35858a(20);
        }
        i m35884E = m35884E(interfaceC10540a, interfaceC10540a2, interfaceC10552e, false);
        if (m35884E == null) {
            m35858a(21);
        }
        return m35884E;
    }

    /* renamed from: E */
    public i m35884E(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e, boolean z) {
        if (interfaceC10540a == null) {
            m35858a(22);
        }
        if (interfaceC10540a2 == null) {
            m35858a(23);
        }
        i m35885F = m35885F(interfaceC10540a, interfaceC10540a2, z);
        boolean z2 = m35885F.m35898c() == i.a.OVERRIDABLE;
        for (InterfaceC10155e interfaceC10155e : f39519a) {
            if (interfaceC10155e.mo33227a() != InterfaceC10155e.a.CONFLICTS_ONLY && (!z2 || interfaceC10155e.mo33227a() != InterfaceC10155e.a.SUCCESS_ONLY)) {
                int i2 = h.f39530a[interfaceC10155e.mo33228b(interfaceC10540a, interfaceC10540a2, interfaceC10552e).ordinal()];
                if (i2 == 1) {
                    z2 = true;
                } else {
                    if (i2 == 2) {
                        i m35895b = i.m35895b("External condition failed");
                        if (m35895b == null) {
                            m35858a(24);
                        }
                        return m35895b;
                    }
                    if (i2 == 3) {
                        i m35896d = i.m35896d("External condition");
                        if (m35896d == null) {
                            m35858a(25);
                        }
                        return m35896d;
                    }
                }
            }
        }
        if (!z2) {
            return m35885F;
        }
        for (InterfaceC10155e interfaceC10155e2 : f39519a) {
            if (interfaceC10155e2.mo33227a() == InterfaceC10155e.a.CONFLICTS_ONLY) {
                int i3 = h.f39530a[interfaceC10155e2.mo33228b(interfaceC10540a, interfaceC10540a2, interfaceC10552e).ordinal()];
                if (i3 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC10155e2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i3 == 2) {
                    i m35895b2 = i.m35895b("External condition failed");
                    if (m35895b2 == null) {
                        m35858a(27);
                    }
                    return m35895b2;
                }
                if (i3 == 3) {
                    i m35896d2 = i.m35896d("External condition");
                    if (m35896d2 == null) {
                        m35858a(28);
                    }
                    return m35896d2;
                }
            }
        }
        i m35897e = i.m35897e();
        if (m35897e == null) {
            m35858a(29);
        }
        return m35897e;
    }

    /* renamed from: F */
    public i m35885F(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, boolean z) {
        if (interfaceC10540a == null) {
            m35858a(30);
        }
        if (interfaceC10540a2 == null) {
            m35858a(31);
        }
        i m35879w = m35879w(interfaceC10540a, interfaceC10540a2);
        if (m35879w != null) {
            return m35879w;
        }
        List<AbstractC10311e0> m35864g = m35864g(interfaceC10540a);
        List<AbstractC10311e0> m35864g2 = m35864g(interfaceC10540a2);
        List<InterfaceC10554e1> typeParameters = interfaceC10540a.getTypeParameters();
        List<InterfaceC10554e1> typeParameters2 = interfaceC10540a2.getTypeParameters();
        int i2 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i2 < m35864g.size()) {
                if (!InterfaceC10361e.f40181a.mo36919b(m35864g.get(i2), m35864g2.get(i2))) {
                    i m35896d = i.m35896d("Type parameter number mismatch");
                    if (m35896d == null) {
                        m35858a(33);
                    }
                    return m35896d;
                }
                i2++;
            }
            i m35895b = i.m35895b("Type parameter number mismatch");
            if (m35895b == null) {
                m35858a(34);
            }
            return m35895b;
        }
        C10309d1 m35869l = m35869l(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            if (!m35860c(typeParameters.get(i3), typeParameters2.get(i3), m35869l)) {
                i m35896d2 = i.m35896d("Type parameter bounds mismatch");
                if (m35896d2 == null) {
                    m35858a(35);
                }
                return m35896d2;
            }
        }
        for (int i4 = 0; i4 < m35864g.size(); i4++) {
            if (!m35861d(m35864g.get(i4), m35864g2.get(i4), m35869l)) {
                i m35896d3 = i.m35896d("Value parameter type mismatch");
                if (m35896d3 == null) {
                    m35858a(36);
                }
                return m35896d3;
            }
        }
        if ((interfaceC10540a instanceof InterfaceC10705y) && (interfaceC10540a2 instanceof InterfaceC10705y) && ((InterfaceC10705y) interfaceC10540a).isSuspend() != ((InterfaceC10705y) interfaceC10540a2).isSuspend()) {
            i m35895b2 = i.m35895b("Incompatible suspendability");
            if (m35895b2 == null) {
                m35858a(37);
            }
            return m35895b2;
        }
        if (z) {
            AbstractC10311e0 returnType = interfaceC10540a.getReturnType();
            AbstractC10311e0 returnType2 = interfaceC10540a2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (C10317g0.m36706a(returnType2) && C10317g0.m36706a(returnType)) {
                    i2 = 1;
                }
                if (i2 == 0 && !C10313f.f40078a.m36657r(m35869l, returnType2.mo36635R0(), returnType.mo36635R0())) {
                    i m35895b3 = i.m35895b("Return type mismatch");
                    if (m35895b3 == null) {
                        m35858a(38);
                    }
                    return m35895b3;
                }
            }
        }
        i m35897e = i.m35897e();
        if (m35897e == null) {
            m35858a(39);
        }
        return m35897e;
    }

    /* renamed from: v */
    public void m35886v(C10130f c10130f, Collection<? extends InterfaceC10543b> collection, Collection<? extends InterfaceC10543b> collection2, InterfaceC10552e interfaceC10552e, AbstractC10159i abstractC10159i) {
        if (c10130f == null) {
            m35858a(52);
        }
        if (collection == null) {
            m35858a(53);
        }
        if (collection2 == null) {
            m35858a(54);
        }
        if (interfaceC10552e == null) {
            m35858a(55);
        }
        if (abstractC10159i == null) {
            m35858a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends InterfaceC10543b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(m35872o(it.next(), collection, interfaceC10552e, abstractC10159i));
        }
        m35868k(interfaceC10552e, linkedHashSet, abstractC10159i);
    }
}
