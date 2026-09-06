package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9953c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10303b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.d */
/* loaded from: classes3.dex */
public final class C10021d {

    /* renamed from: a */
    private final InterfaceC9953c f38210a;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.d$a */
    private static final class a {

        /* renamed from: a */
        private final AbstractC10311e0 f38211a;

        /* renamed from: b */
        private final int f38212b;

        public a(AbstractC10311e0 abstractC10311e0, int i2) {
            this.f38211a = abstractC10311e0;
            this.f38212b = i2;
        }

        /* renamed from: a */
        public final int m33676a() {
            return this.f38212b;
        }

        /* renamed from: b */
        public final AbstractC10311e0 m33677b() {
            return this.f38211a;
        }
    }

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.d$b */
    private static final class b {

        /* renamed from: a */
        private final AbstractC10335m0 f38213a;

        /* renamed from: b */
        private final int f38214b;

        /* renamed from: c */
        private final boolean f38215c;

        public b(AbstractC10335m0 abstractC10335m0, int i2, boolean z) {
            this.f38213a = abstractC10335m0;
            this.f38214b = i2;
            this.f38215c = z;
        }

        /* renamed from: a */
        public final boolean m33678a() {
            return this.f38215c;
        }

        /* renamed from: b */
        public final int m33679b() {
            return this.f38214b;
        }

        /* renamed from: c */
        public final AbstractC10335m0 m33680c() {
            return this.f38213a;
        }
    }

    public C10021d(InterfaceC9953c interfaceC9953c) {
        C9768m.m32346f(interfaceC9953c, "javaResolverSettings");
        this.f38210a = interfaceC9953c;
    }

    /* renamed from: b */
    private final b m33671b(AbstractC10335m0 abstractC10335m0, Function1<? super Integer, C10022e> function1, int i2, EnumC10032o enumC10032o, boolean z, boolean z2) {
        InterfaceC10561h m33774g;
        Boolean m33775h;
        InterfaceC10312e1 mo35993O0;
        C10020c c10020c;
        C10020c c10020c2;
        List m38893o;
        InterfaceC10587g m33773f;
        boolean z3;
        boolean z4;
        a aVar;
        InterfaceC10318g1 m36786s;
        Function1<? super Integer, C10022e> function12 = function1;
        boolean m33766a = C10033p.m33766a(enumC10032o);
        boolean z5 = (z2 && z) ? false : true;
        AbstractC10311e0 abstractC10311e0 = null;
        if (!m33766a && abstractC10335m0.mo35991M0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC10561h mo32891w = abstractC10335m0.mo35993O0().mo32891w();
        if (mo32891w == null) {
            return new b(null, 1, false);
        }
        C10022e invoke = function12.invoke(Integer.valueOf(i2));
        m33774g = C10035r.m33774g(mo32891w, invoke, enumC10032o);
        m33775h = C10035r.m33775h(invoke, enumC10032o);
        if (m33774g == null || (mo35993O0 = m33774g.mo32877h()) == null) {
            mo35993O0 = abstractC10335m0.mo35993O0();
        }
        InterfaceC10312e1 interfaceC10312e1 = mo35993O0;
        C9768m.m32345e(interfaceC10312e1, "enhancedClassifier?.typeConstructor ?: constructor");
        int i3 = i2 + 1;
        List<InterfaceC10318g1> mo35991M0 = abstractC10335m0.mo35991M0();
        List<InterfaceC10554e1> parameters = interfaceC10312e1.getParameters();
        C9768m.m32345e(parameters, "typeConstructor.parameters");
        Iterator<T> it = mo35991M0.iterator();
        Iterator<T> it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C10786v.m38911u(mo35991M0, 10), C10786v.m38911u(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            InterfaceC10554e1 interfaceC10554e1 = (InterfaceC10554e1) it2.next();
            InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) next;
            if (z5) {
                z4 = z5;
                if (!interfaceC10318g1.mo36710c()) {
                    aVar = m33673d(interfaceC10318g1.getType().mo36635R0(), function12, i3, z2);
                } else if (function12.invoke(Integer.valueOf(i3)).m33684d() == EnumC10025h.FORCE_FLEXIBILITY) {
                    AbstractC10348q1 mo36635R0 = interfaceC10318g1.getType().mo36635R0();
                    aVar = new a(C10314f0.m36664d(C10302b0.m36584c(mo36635R0).mo33545S0(false), C10302b0.m36585d(mo36635R0).mo33545S0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z4 = z5;
                aVar = new a(abstractC10311e0, 0);
            }
            i3 += aVar.m33676a();
            if (aVar.m33677b() != null) {
                AbstractC10311e0 m33677b = aVar.m33677b();
                EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
                C9768m.m32345e(mo36708a, "arg.projectionKind");
                m36786s = C10424a.m37139e(m33677b, mo36708a, interfaceC10554e1);
            } else if (m33774g == null || interfaceC10318g1.mo36710c()) {
                m36786s = m33774g != null ? C10339n1.m36786s(interfaceC10554e1) : null;
            } else {
                AbstractC10311e0 type = interfaceC10318g1.getType();
                C9768m.m32345e(type, "arg.type");
                EnumC10351r1 mo36708a2 = interfaceC10318g1.mo36708a();
                C9768m.m32345e(mo36708a2, "arg.projectionKind");
                m36786s = C10424a.m37139e(type, mo36708a2, interfaceC10554e1);
            }
            arrayList.add(m36786s);
            function12 = function1;
            z5 = z4;
            abstractC10311e0 = null;
        }
        int i4 = i3 - i2;
        if (m33774g == null && m33775h == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!(((InterfaceC10318g1) it3.next()) == null)) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                return new b(null, i4, false);
            }
        }
        InterfaceC10587g[] interfaceC10587gArr = new InterfaceC10587g[3];
        interfaceC10587gArr[0] = abstractC10335m0.getAnnotations();
        c10020c = C10035r.f38296b;
        if (!(m33774g != null)) {
            c10020c = null;
        }
        interfaceC10587gArr[1] = c10020c;
        c10020c2 = C10035r.f38295a;
        if (!(m33775h != null)) {
            c10020c2 = null;
        }
        interfaceC10587gArr[2] = c10020c2;
        m38893o = C10784u.m38893o(interfaceC10587gArr);
        m33773f = C10035r.m33773f(m38893o);
        C10300a1 m36587b = C10303b1.m36587b(m33773f);
        List<InterfaceC10318g1> mo35991M02 = abstractC10335m0.mo35991M0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = mo35991M02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(C10786v.m38911u(arrayList, 10), C10786v.m38911u(mo35991M02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            InterfaceC10318g1 interfaceC10318g12 = (InterfaceC10318g1) it5.next();
            InterfaceC10318g1 interfaceC10318g13 = (InterfaceC10318g1) next2;
            if (interfaceC10318g13 != null) {
                interfaceC10318g12 = interfaceC10318g13;
            }
            arrayList2.add(interfaceC10318g12);
        }
        AbstractC10335m0 m36669i = C10314f0.m36669i(m36587b, interfaceC10312e1, arrayList2, m33775h != null ? m33775h.booleanValue() : abstractC10335m0.mo33691P0(), null, 16, null);
        if (invoke.m33682b()) {
            m36669i = m33674e(m36669i);
        }
        return new b(m36669i, i4, m33775h != null && invoke.m33685e());
    }

    /* renamed from: c */
    static /* synthetic */ b m33672c(C10021d c10021d, AbstractC10335m0 abstractC10335m0, Function1 function1, int i2, EnumC10032o enumC10032o, boolean z, boolean z2, int i3, Object obj) {
        return c10021d.m33671b(abstractC10335m0, function1, i2, enumC10032o, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r13 == null) goto L40;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10021d.a m33673d(kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1 r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0.m36706a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            kotlin.f0.y.e.j0.d.a.o0.d$a r12 = new kotlin.f0.y.e.j0.d.a.o0.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
            if (r0 == 0) goto Laf
            boolean r0 = r12 instanceof kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10332l0
            r9 = r12
            kotlin.f0.y.e.j0.l.y r9 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y) r9
            kotlin.f0.y.e.j0.l.m0 r3 = r9.m37161W0()
            kotlin.f0.y.e.j0.d.a.o0.o r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10032o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.f0.y.e.j0.d.a.o0.d$b r10 = r2.m33671b(r3, r4, r5, r6, r7, r8)
            kotlin.f0.y.e.j0.l.m0 r3 = r9.m37162X0()
            kotlin.f0.y.e.j0.d.a.o0.o r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10032o.FLEXIBLE_UPPER
            kotlin.f0.y.e.j0.d.a.o0.d$b r13 = r2.m33671b(r3, r4, r5, r6, r7, r8)
            int r14 = r10.m33679b()
            int r15 = r13.m33679b()
            kotlin.f0.y.e.j0.l.m0 r14 = r10.m33680c()
            if (r14 != 0) goto L45
            kotlin.f0.y.e.j0.l.m0 r14 = r13.m33680c()
            if (r14 != 0) goto L45
            goto La5
        L45:
            boolean r14 = r10.m33678a()
            if (r14 != 0) goto L87
            boolean r14 = r13.m33678a()
            if (r14 == 0) goto L52
            goto L87
        L52:
            if (r0 == 0) goto L6e
            kotlin.f0.y.e.j0.d.a.l0.m.f r1 = new kotlin.f0.y.e.j0.d.a.l0.m.f
            kotlin.f0.y.e.j0.l.m0 r12 = r10.m33680c()
            if (r12 != 0) goto L60
            kotlin.f0.y.e.j0.l.m0 r12 = r9.m37161W0()
        L60:
            kotlin.f0.y.e.j0.l.m0 r13 = r13.m33680c()
            if (r13 != 0) goto L6a
            kotlin.f0.y.e.j0.l.m0 r13 = r9.m37162X0()
        L6a:
            r1.<init>(r12, r13)
            goto La5
        L6e:
            kotlin.f0.y.e.j0.l.m0 r12 = r10.m33680c()
            if (r12 != 0) goto L78
            kotlin.f0.y.e.j0.l.m0 r12 = r9.m37161W0()
        L78:
            kotlin.f0.y.e.j0.l.m0 r13 = r13.m33680c()
            if (r13 != 0) goto L82
            kotlin.f0.y.e.j0.l.m0 r13 = r9.m37162X0()
        L82:
            kotlin.f0.y.e.j0.l.q1 r1 = kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0.m36664d(r12, r13)
            goto La5
        L87:
            kotlin.f0.y.e.j0.l.m0 r13 = r13.m33680c()
            if (r13 == 0) goto L9a
            kotlin.f0.y.e.j0.l.m0 r14 = r10.m33680c()
            if (r14 != 0) goto L94
            r14 = r13
        L94:
            kotlin.f0.y.e.j0.l.q1 r13 = kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0.m36664d(r14, r13)
            if (r13 != 0) goto La1
        L9a:
            kotlin.f0.y.e.j0.l.m0 r13 = r10.m33680c()
            kotlin.jvm.internal.C9768m.m32343c(r13)
        La1:
            kotlin.f0.y.e.j0.l.q1 r1 = kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1.m36806d(r12, r13)
        La5:
            kotlin.f0.y.e.j0.d.a.o0.d$a r12 = new kotlin.f0.y.e.j0.d.a.o0.d$a
            int r13 = r10.m33679b()
            r12.<init>(r1, r13)
            goto Le1
        Laf:
            boolean r0 = r12 instanceof kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
            if (r0 == 0) goto Le2
            r2 = r12
            kotlin.f0.y.e.j0.l.m0 r2 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0) r2
            kotlin.f0.y.e.j0.d.a.o0.o r5 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10032o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            kotlin.f0.y.e.j0.d.a.o0.d$b r13 = m33672c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.f0.y.e.j0.d.a.o0.d$a r14 = new kotlin.f0.y.e.j0.d.a.o0.d$a
            boolean r15 = r13.m33678a()
            if (r15 == 0) goto Ld5
            kotlin.f0.y.e.j0.l.m0 r15 = r13.m33680c()
            kotlin.f0.y.e.j0.l.q1 r12 = kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1.m36806d(r12, r15)
            goto Ld9
        Ld5:
            kotlin.f0.y.e.j0.l.m0 r12 = r13.m33680c()
        Ld9:
            int r13 = r13.m33679b()
            r14.<init>(r12, r13)
            r12 = r14
        Le1:
            return r12
        Le2:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10021d.m33673d(kotlin.f0.y.e.j0.l.q1, kotlin.a0.c.l, int, boolean):kotlin.f0.y.e.j0.d.a.o0.d$a");
    }

    /* renamed from: e */
    private final AbstractC10335m0 m33674e(AbstractC10335m0 abstractC10335m0) {
        return this.f38210a.mo33265a() ? C10347q0.m36814h(abstractC10335m0, true) : new C10024g(abstractC10335m0);
    }

    /* renamed from: a */
    public final AbstractC10311e0 m33675a(AbstractC10311e0 abstractC10311e0, Function1<? super Integer, C10022e> function1, boolean z) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(function1, "qualifiers");
        return m33673d(abstractC10311e0.mo36635R0(), function1, 0, z).m33677b();
    }
}
