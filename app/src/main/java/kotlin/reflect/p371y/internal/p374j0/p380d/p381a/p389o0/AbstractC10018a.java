package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10770n;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10045x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9913b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10407g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10413m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10414n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10415o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10416p;

/* compiled from: AbstractSignatureParts.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10018a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$a */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC10409i f38200a;

        /* renamed from: b */
        private final C10045x f38201b;

        /* renamed from: c */
        private final InterfaceC10415o f38202c;

        public a(InterfaceC10409i interfaceC10409i, C10045x c10045x, InterfaceC10415o interfaceC10415o) {
            this.f38200a = interfaceC10409i;
            this.f38201b = c10045x;
            this.f38202c = interfaceC10415o;
        }

        /* renamed from: a */
        public final C10045x m33663a() {
            return this.f38201b;
        }

        /* renamed from: b */
        public final InterfaceC10409i m33664b() {
            return this.f38200a;
        }

        /* renamed from: c */
        public final InterfaceC10415o m33665c() {
            return this.f38202c;
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$b */
    static final class b extends Lambda implements Function1<Integer, C10022e> {

        /* renamed from: f */
        final /* synthetic */ C10034q f38203f;

        /* renamed from: g */
        final /* synthetic */ C10022e[] f38204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10034q c10034q, C10022e[] c10022eArr) {
            super(1);
            this.f38203f = c10034q;
            this.f38204g = c10022eArr;
        }

        /* renamed from: b */
        public final C10022e m33666b(int i2) {
            Map<Integer, C10022e> m33767a;
            C10022e c10022e;
            C10034q c10034q = this.f38203f;
            if (c10034q != null && (m33767a = c10034q.m33767a()) != null && (c10022e = m33767a.get(Integer.valueOf(i2))) != null) {
                return c10022e;
            }
            C10022e[] c10022eArr = this.f38204g;
            return (i2 < 0 || i2 > C10770n.m38721A(c10022eArr)) ? C10022e.f38216a.m33686a() : c10022eArr[i2];
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10022e invoke(Integer num) {
            return m33666b(num.intValue());
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$c */
    static final class c extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10018a<TAnnotation> f38205f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC10018a<TAnnotation> abstractC10018a) {
            super(1);
            this.f38205f = abstractC10018a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            C9768m.m32346f(tannotation, "$this$extractNullability");
            return Boolean.valueOf(this.f38205f.mo33655r(tannotation));
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$d */
    static final class d extends Lambda implements Function1<a, Iterable<? extends a>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10018a<TAnnotation> f38206f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10416p f38207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC10018a<TAnnotation> abstractC10018a, InterfaceC10416p interfaceC10416p) {
            super(1);
            this.f38206f = abstractC10018a;
            this.f38207g = interfaceC10416p;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<a> invoke(a aVar) {
            InterfaceC10414n mo35977w;
            List<InterfaceC10415o> mo35942e0;
            a aVar2;
            InterfaceC10407g mo35919M;
            C9768m.m32346f(aVar, "it");
            if (this.f38206f.mo33657u()) {
                InterfaceC10409i m33664b = aVar.m33664b();
                if (((m33664b == null || (mo35919M = this.f38207g.mo35919M(m33664b)) == null) ? null : this.f38207g.mo35981y(mo35919M)) != null) {
                    return null;
                }
            }
            InterfaceC10409i m33664b2 = aVar.m33664b();
            if (m33664b2 == null || (mo35977w = this.f38207g.mo35977w(m33664b2)) == null || (mo35942e0 = this.f38207g.mo35942e0(mo35977w)) == null) {
                return null;
            }
            List<InterfaceC10413m> mo35930X = this.f38207g.mo35930X(aVar.m33664b());
            InterfaceC10416p interfaceC10416p = this.f38207g;
            AbstractC10018a<TAnnotation> abstractC10018a = this.f38206f;
            Iterator<T> it = mo35942e0.iterator();
            Iterator<T> it2 = mo35930X.iterator();
            ArrayList arrayList = new ArrayList(Math.min(C10786v.m38911u(mo35942e0, 10), C10786v.m38911u(mo35930X, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                InterfaceC10413m interfaceC10413m = (InterfaceC10413m) it2.next();
                InterfaceC10415o interfaceC10415o = (InterfaceC10415o) next;
                if (interfaceC10416p.mo35918L(interfaceC10413m)) {
                    aVar2 = new a(null, aVar.m33663a(), interfaceC10415o);
                } else {
                    InterfaceC10409i mo35980x0 = interfaceC10416p.mo35980x0(interfaceC10413m);
                    aVar2 = new a(mo35980x0, abstractC10018a.m33637c(mo35980x0, aVar.m33663a()), interfaceC10415o);
                }
                arrayList.add(aVar2);
            }
            return arrayList;
        }
    }

    /* renamed from: B */
    private final C10026i m33634B(C10026i c10026i, C10026i c10026i2) {
        return c10026i == null ? c10026i2 : c10026i2 == null ? c10026i : (!c10026i.m33702d() || c10026i2.m33702d()) ? (c10026i.m33702d() || !c10026i2.m33702d()) ? (c10026i.m33701c().compareTo(c10026i2.m33701c()) >= 0 && c10026i.m33701c().compareTo(c10026i2.m33701c()) > 0) ? c10026i : c10026i2 : c10026i : c10026i2;
    }

    /* renamed from: C */
    private final List<a> m33635C(InterfaceC10409i interfaceC10409i) {
        return m33640f(new a(interfaceC10409i, m33637c(interfaceC10409i, mo33650m()), null), new d(this, mo33658v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C10045x m33637c(InterfaceC10409i interfaceC10409i, C10045x c10045x) {
        return mo33646h().m33035c(c10045x, mo33647i(interfaceC10409i));
    }

    /* renamed from: d */
    private final C10022e m33638d(InterfaceC10409i interfaceC10409i) {
        EnumC10025h enumC10025h;
        EnumC10025h m33643t = m33643t(interfaceC10409i);
        EnumC10023f enumC10023f = null;
        if (m33643t == null) {
            InterfaceC10409i mo33653p = mo33653p(interfaceC10409i);
            enumC10025h = mo33653p != null ? m33643t(mo33653p) : null;
        } else {
            enumC10025h = m33643t;
        }
        InterfaceC10416p mo33658v = mo33658v();
        C9896c c9896c = C9896c.f37667a;
        if (c9896c.m32927l(mo33656s(mo33658v.mo35948h0(interfaceC10409i)))) {
            enumC10023f = EnumC10023f.READ_ONLY;
        } else if (c9896c.m32926k(mo33656s(mo33658v.mo35926T(interfaceC10409i)))) {
            enumC10023f = EnumC10023f.MUTABLE;
        }
        return new C10022e(enumC10025h, enumC10023f, mo33658v().mo35905C(interfaceC10409i) || mo33644A(interfaceC10409i), enumC10025h != m33643t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
    
        if ((r0 != null && r0.m33785c()) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e m33639e(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a.a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a.m33639e(kotlin.f0.y.e.j0.d.a.o0.a$a):kotlin.f0.y.e.j0.d.a.o0.e");
    }

    /* renamed from: f */
    private final <T> List<T> m33640f(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m33641g(t, arrayList, function1);
        return arrayList;
    }

    /* renamed from: g */
    private final <T> void m33641g(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> invoke = function1.invoke(t);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                m33641g(it.next(), list, function1);
            }
        }
    }

    /* renamed from: j */
    private final C10026i m33642j(InterfaceC10415o interfaceC10415o) {
        boolean z;
        boolean z2;
        boolean z3;
        List<InterfaceC10409i> arrayList;
        boolean z4;
        InterfaceC10416p mo33658v = mo33658v();
        C10026i c10026i = null;
        if (!mo33662z(interfaceC10415o)) {
            return null;
        }
        List<InterfaceC10409i> mo35904B0 = mo33658v.mo35904B0(interfaceC10415o);
        boolean z5 = mo35904B0 instanceof Collection;
        if (!z5 || !mo35904B0.isEmpty()) {
            Iterator<T> it = mo35904B0.iterator();
            while (it.hasNext()) {
                if (!mo33658v.mo35931Y((InterfaceC10409i) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z5 || !mo35904B0.isEmpty()) {
            Iterator<T> it2 = mo35904B0.iterator();
            while (it2.hasNext()) {
                if (m33643t((InterfaceC10409i) it2.next()) != null) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            if (!z5 || !mo35904B0.isEmpty()) {
                Iterator<T> it3 = mo35904B0.iterator();
                while (it3.hasNext()) {
                    if (mo33653p((InterfaceC10409i) it3.next()) != null) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                arrayList = new ArrayList<>();
                Iterator<T> it4 = mo35904B0.iterator();
                while (it4.hasNext()) {
                    InterfaceC10409i mo33653p = mo33653p((InterfaceC10409i) it4.next());
                    if (mo33653p != null) {
                        arrayList.add(mo33653p);
                    }
                }
            }
            return c10026i;
        }
        arrayList = mo35904B0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                if (!mo33658v.mo35964p0((InterfaceC10409i) it5.next())) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        c10026i = new C10026i(z4 ? EnumC10025h.NULLABLE : EnumC10025h.NOT_NULL, arrayList != mo35904B0);
        return c10026i;
    }

    /* renamed from: t */
    private final EnumC10025h m33643t(InterfaceC10409i interfaceC10409i) {
        InterfaceC10416p mo33658v = mo33658v();
        if (mo33658v.mo35929W(mo33658v.mo35948h0(interfaceC10409i))) {
            return EnumC10025h.NULLABLE;
        }
        if (mo33658v.mo35929W(mo33658v.mo35926T(interfaceC10409i))) {
            return null;
        }
        return EnumC10025h.NOT_NULL;
    }

    /* renamed from: A */
    public abstract boolean mo33644A(InterfaceC10409i interfaceC10409i);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r10 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0070  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e> m33645b(kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i r10, java.lang.Iterable<? extends kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i> r11, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10034q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9768m.m32346f(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C9768m.m32346f(r11, r0)
            java.util.List r0 = r9.m33635C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10780s.m38869u(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            kotlin.f0.y.e.j0.l.w1.i r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i) r3
            java.util.List r3 = r9.m33635C(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.m33654q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L6b
            boolean r2 = r9.mo33660x()
            if (r2 == 0) goto L69
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
        L4c:
            r10 = 0
            goto L66
        L4e:
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r11.next()
            kotlin.f0.y.e.j0.l.w1.i r2 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i) r2
            boolean r2 = r9.mo33661y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L52
            r10 = 1
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = 0
            goto L6c
        L6b:
            r10 = 1
        L6c:
            if (r10 == 0) goto L70
            r10 = 1
            goto L74
        L70:
            int r10 = r0.size()
        L74:
            kotlin.f0.y.e.j0.d.a.o0.e[] r11 = new kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e[r10]
            r2 = 0
        L77:
            if (r2 >= r10) goto Ld1
            java.lang.Object r5 = r0.get(r2)
            kotlin.f0.y.e.j0.d.a.o0.a$a r5 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a.a) r5
            kotlin.f0.y.e.j0.d.a.o0.e r5 = r9.m33639e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.C10780s.m38833X(r8, r2)
            kotlin.f0.y.e.j0.d.a.o0.a$a r8 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a.a) r8
            if (r8 == 0) goto Lab
            kotlin.f0.y.e.j0.l.w1.i r8 = r8.m33664b()
            if (r8 == 0) goto Lab
            kotlin.f0.y.e.j0.d.a.o0.e r8 = r9.m33638d(r8)
            goto Lac
        Lab:
            r8 = 0
        Lac:
            if (r8 == 0) goto L8c
            r6.add(r8)
            goto L8c
        Lb2:
            if (r2 != 0) goto Lbc
            boolean r7 = r9.mo33660x()
            if (r7 == 0) goto Lbc
            r7 = 1
            goto Lbd
        Lbc:
            r7 = 0
        Lbd:
            if (r2 != 0) goto Lc7
            boolean r8 = r9.mo33651n()
            if (r8 == 0) goto Lc7
            r8 = 1
            goto Lc8
        Lc7:
            r8 = 0
        Lc8:
            kotlin.f0.y.e.j0.d.a.o0.e r5 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10036s.m33777a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L77
        Ld1:
            kotlin.f0.y.e.j0.d.a.o0.a$b r10 = new kotlin.f0.y.e.j0.d.a.o0.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a.m33645b(kotlin.f0.y.e.j0.l.w1.i, java.lang.Iterable, kotlin.f0.y.e.j0.d.a.o0.q, boolean):kotlin.a0.c.l");
    }

    /* renamed from: h */
    public abstract AbstractC9911a<TAnnotation> mo33646h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo33647i(InterfaceC10409i interfaceC10409i);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo33648k();

    /* renamed from: l */
    public abstract EnumC9913b mo33649l();

    /* renamed from: m */
    public abstract C10045x mo33650m();

    /* renamed from: n */
    public abstract boolean mo33651n();

    /* renamed from: o */
    public abstract boolean mo33652o();

    /* renamed from: p */
    public abstract InterfaceC10409i mo33653p(InterfaceC10409i interfaceC10409i);

    /* renamed from: q */
    public boolean m33654q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo33655r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract C10128d mo33656s(InterfaceC10409i interfaceC10409i);

    /* renamed from: u */
    public abstract boolean mo33657u();

    /* renamed from: v */
    public abstract InterfaceC10416p mo33658v();

    /* renamed from: w */
    public abstract boolean mo33659w(InterfaceC10409i interfaceC10409i);

    /* renamed from: x */
    public abstract boolean mo33660x();

    /* renamed from: y */
    public abstract boolean mo33661y(InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2);

    /* renamed from: z */
    public abstract boolean mo33662z(InterfaceC10415o interfaceC10415o);
}
