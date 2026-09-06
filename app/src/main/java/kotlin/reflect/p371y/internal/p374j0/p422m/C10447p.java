package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10229e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10442k;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10449r;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10451t;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.p */
/* loaded from: classes3.dex */
public final class C10447p extends AbstractC10433b {

    /* renamed from: a */
    public static final C10447p f40431a = new C10447p();

    /* renamed from: b */
    private static final List<C10439h> f40432b;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$a */
    static final class a extends Lambda implements Function1<InterfaceC10705y, String> {

        /* renamed from: f */
        public static final a f40433f = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if ((!kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36067a(r4) && r4.mo37697l0() == null) == true) goto L13;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.C9768m.m32346f(r4, r0)
                java.util.List r4 = r4.mo37028f()
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.C9768m.m32345e(r4, r0)
                java.lang.Object r4 = kotlin.collections.C10780s.m38847i0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1) r4
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L2a
                boolean r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36067a(r4)
                if (r2 != 0) goto L26
                kotlin.f0.y.e.j0.l.e0 r4 = r4.mo37697l0()
                if (r4 != 0) goto L26
                r4 = 1
                goto L27
            L26:
                r4 = 0
            L27:
                if (r4 != r0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                kotlin.f0.y.e.j0.m.p r4 = kotlin.reflect.p371y.internal.p374j0.p422m.C10447p.f40431a
                if (r0 != 0) goto L32
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L33
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p422m.C10447p.a.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$b */
    static final class b extends Lambda implements Function1<InterfaceC10705y, String> {

        /* renamed from: f */
        public static final b f40434f = new b();

        b() {
            super(1);
        }

        /* renamed from: c */
        private static final boolean m37213c(InterfaceC10576m interfaceC10576m) {
            return (interfaceC10576m instanceof InterfaceC10552e) && AbstractC9881h.m32734a0((InterfaceC10552e) interfaceC10576m);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC10705y interfaceC10705y) {
            boolean z;
            C9768m.m32346f(interfaceC10705y, "$this$$receiver");
            C10447p c10447p = C10447p.f40431a;
            InterfaceC10576m mo32876b = interfaceC10705y.mo32876b();
            C9768m.m32345e(mo32876b, "containingDeclaration");
            boolean z2 = true;
            if (!m37213c(mo32876b)) {
                Collection<? extends InterfaceC10705y> mo37027e = interfaceC10705y.mo37027e();
                C9768m.m32345e(mo37027e, "overriddenDescriptors");
                if (!mo37027e.isEmpty()) {
                    Iterator<T> it = mo37027e.iterator();
                    while (it.hasNext()) {
                        InterfaceC10576m mo32876b2 = ((InterfaceC10705y) it.next()).mo32876b();
                        C9768m.m32345e(mo32876b2, "it.containingDeclaration");
                        if (m37213c(mo32876b2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$c */
    static final class c extends Lambda implements Function1<InterfaceC10705y, String> {

        /* renamed from: f */
        public static final c f40435f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC10705y interfaceC10705y) {
            boolean z;
            C9768m.m32346f(interfaceC10705y, "$this$$receiver");
            InterfaceC10702w0 mo37029f0 = interfaceC10705y.mo37029f0();
            if (mo37029f0 == null) {
                mo37029f0 = interfaceC10705y.mo37032m0();
            }
            C10447p c10447p = C10447p.f40431a;
            boolean z2 = false;
            if (mo37029f0 != null) {
                AbstractC10311e0 returnType = interfaceC10705y.getReturnType();
                if (returnType != null) {
                    AbstractC10311e0 type = mo37029f0.getType();
                    C9768m.m32345e(type, "receiver.type");
                    z = C10424a.m37149o(returnType, type);
                } else {
                    z = false;
                }
                if (z || c10447p.m37211d(interfaceC10705y, mo37029f0)) {
                    z2 = true;
                }
            }
            if (z2) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        List m38891m;
        List<C10439h> m38891m2;
        C10130f c10130f = C10448q.f40466k;
        AbstractC10442k.b bVar = AbstractC10442k.b.f40423b;
        InterfaceC10437f[] interfaceC10437fArr = {bVar, new AbstractC10451t.a(1)};
        C10130f c10130f2 = C10448q.f40467l;
        InterfaceC10437f[] interfaceC10437fArr2 = {bVar, new AbstractC10451t.a(2)};
        C10130f c10130f3 = C10448q.f40457b;
        C10444m c10444m = C10444m.f40425a;
        C10441j c10441j = C10441j.f40419a;
        C10130f c10130f4 = C10448q.f40463h;
        AbstractC10451t.d dVar = AbstractC10451t.d.f40498b;
        AbstractC10449r.a aVar = AbstractC10449r.a.f40485d;
        C10130f c10130f5 = C10448q.f40465j;
        AbstractC10451t.c cVar = AbstractC10451t.c.f40497b;
        m38891m = C10784u.m38891m(C10448q.f40479x, C10448q.f40480y);
        m38891m2 = C10784u.m38891m(new C10439h(c10130f, interfaceC10437fArr, (Function1) null, 4, (C9756g) null), new C10439h(c10130f2, interfaceC10437fArr2, a.f40433f), new C10439h(c10130f3, new InterfaceC10437f[]{bVar, c10444m, new AbstractC10451t.a(2), c10441j}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40458c, new InterfaceC10437f[]{bVar, c10444m, new AbstractC10451t.a(3), c10441j}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40459d, new InterfaceC10437f[]{bVar, c10444m, new AbstractC10451t.b(2), c10441j}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40464i, new InterfaceC10437f[]{bVar}, (Function1) null, 4, (C9756g) null), new C10439h(c10130f4, new InterfaceC10437f[]{bVar, dVar, c10444m, aVar}, (Function1) null, 4, (C9756g) null), new C10439h(c10130f5, new InterfaceC10437f[]{bVar, cVar}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40468m, new InterfaceC10437f[]{bVar, cVar}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40469n, new InterfaceC10437f[]{bVar, cVar, aVar}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40444I, new InterfaceC10437f[]{bVar, dVar, c10444m}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40460e, new InterfaceC10437f[]{AbstractC10442k.a.f40422b}, b.f40434f), new C10439h(C10448q.f40462g, new InterfaceC10437f[]{bVar, AbstractC10449r.b.f40487d, dVar, c10444m}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40453R, new InterfaceC10437f[]{bVar, dVar, c10444m}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40452Q, new InterfaceC10437f[]{bVar, cVar}, (Function1) null, 4, (C9756g) null), new C10439h(m38891m, new InterfaceC10437f[]{bVar}, c.f40435f), new C10439h(C10448q.f40454S, new InterfaceC10437f[]{bVar, AbstractC10449r.c.f40489d, dVar, c10444m}, (Function1) null, 4, (C9756g) null), new C10439h(C10448q.f40471p, new InterfaceC10437f[]{bVar, cVar}, (Function1) null, 4, (C9756g) null));
        f40432b = m38891m2;
    }

    private C10447p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m37211d(InterfaceC10705y interfaceC10705y, InterfaceC10702w0 interfaceC10702w0) {
        C10126b m36073g;
        AbstractC10311e0 returnType;
        InterfaceC10230f value = interfaceC10702w0.getValue();
        C9768m.m32345e(value, "receiver.value");
        if (!(value instanceof C10229e)) {
            return false;
        }
        InterfaceC10552e mo36183r = ((C10229e) value).mo36183r();
        if (!mo36183r.mo32863M() || (m36073g = C10202a.m36073g(mo36183r)) == null) {
            return false;
        }
        InterfaceC10561h m38150b = C10703x.m38150b(C10202a.m36078l(mo36183r), m36073g);
        if (!(m38150b instanceof InterfaceC10551d1)) {
            m38150b = null;
        }
        InterfaceC10551d1 interfaceC10551d1 = (InterfaceC10551d1) m38150b;
        if (interfaceC10551d1 == null || (returnType = interfaceC10705y.getReturnType()) == null) {
            return false;
        }
        return C10424a.m37149o(returnType, interfaceC10551d1.mo36395W());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10433b
    /* renamed from: b */
    public List<C10439h> mo37187b() {
        return f40432b;
    }
}
