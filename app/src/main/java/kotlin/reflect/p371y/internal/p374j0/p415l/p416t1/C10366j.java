package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10168b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.j */
/* loaded from: classes3.dex */
public final class C10366j implements InterfaceC10168b {

    /* renamed from: a */
    private final InterfaceC10318g1 f40191a;

    /* renamed from: b */
    private Function0<? extends List<? extends AbstractC10348q1>> f40192b;

    /* renamed from: c */
    private final C10366j f40193c;

    /* renamed from: d */
    private final InterfaceC10554e1 f40194d;

    /* renamed from: e */
    private final Lazy f40195e;

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$a */
    static final class a extends Lambda implements Function0<List<? extends AbstractC10348q1>> {

        /* renamed from: f */
        final /* synthetic */ List<AbstractC10348q1> f40196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends AbstractC10348q1> list) {
            super(0);
            this.f40196f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10348q1> invoke() {
            return this.f40196f;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$b */
    static final class b extends Lambda implements Function0<List<? extends AbstractC10348q1>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10348q1> invoke() {
            Function0 function0 = C10366j.this.f40192b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$c */
    static final class c extends Lambda implements Function0<List<? extends AbstractC10348q1>> {

        /* renamed from: f */
        final /* synthetic */ List<AbstractC10348q1> f40198f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends AbstractC10348q1> list) {
            super(0);
            this.f40198f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10348q1> invoke() {
            return this.f40198f;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.j$d */
    static final class d extends Lambda implements Function0<List<? extends AbstractC10348q1>> {

        /* renamed from: g */
        final /* synthetic */ AbstractC10363g f40200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC10363g abstractC10363g) {
            super(0);
            this.f40200g = abstractC10363g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC10348q1> invoke() {
            List<AbstractC10348q1> mo35998a = C10366j.this.mo35998a();
            AbstractC10363g abstractC10363g = this.f40200g;
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35998a, 10));
            Iterator<T> it = mo35998a.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC10348q1) it.next()).mo36558Y0(abstractC10363g));
            }
            return arrayList;
        }
    }

    public C10366j(InterfaceC10318g1 interfaceC10318g1, Function0<? extends List<? extends AbstractC10348q1>> function0, C10366j c10366j, InterfaceC10554e1 interfaceC10554e1) {
        Lazy m37593a;
        C9768m.m32346f(interfaceC10318g1, "projection");
        this.f40191a = interfaceC10318g1;
        this.f40192b = function0;
        this.f40193c = c10366j;
        this.f40194d = interfaceC10554e1;
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new b());
        this.f40195e = m37593a;
    }

    /* renamed from: i */
    private final List<AbstractC10348q1> m36941i() {
        return (List) this.f40195e.getValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public InterfaceC10561h mo32891w() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9768m.m32341a(C10366j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9768m.m32344d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C10366j c10366j = (C10366j) obj;
        C10366j c10366j2 = this.f40193c;
        if (c10366j2 == null) {
            c10366j2 = this;
        }
        C10366j c10366j3 = c10366j.f40193c;
        if (c10366j3 != null) {
            c10366j = c10366j3;
        }
        return c10366j2 == c10366j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10168b
    /* renamed from: f */
    public InterfaceC10318g1 mo35997f() {
        return this.f40191a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    public List<InterfaceC10554e1> getParameters() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<AbstractC10348q1> mo35998a() {
        List<AbstractC10348q1> m36941i = m36941i();
        return m36941i == null ? C10784u.m38888j() : m36941i;
    }

    public int hashCode() {
        C10366j c10366j = this.f40193c;
        return c10366j != null ? c10366j.hashCode() : super.hashCode();
    }

    /* renamed from: j */
    public final void m36943j(List<? extends AbstractC10348q1> list) {
        C9768m.m32346f(list, "supertypes");
        Function0<? extends List<? extends AbstractC10348q1>> function0 = this.f40192b;
        this.f40192b = new c(list);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C10366j mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        InterfaceC10318g1 mo36709b = mo35997f().mo36709b(abstractC10363g);
        C9768m.m32345e(mo36709b, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f40192b != null ? new d(abstractC10363g) : null;
        C10366j c10366j = this.f40193c;
        if (c10366j == null) {
            c10366j = this;
        }
        return new C10366j(mo36709b, dVar, c10366j, this.f40194d);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        AbstractC10311e0 type = mo35997f().getType();
        C9768m.m32345e(type, "projection.type");
        return C10424a.m37142h(type);
    }

    public String toString() {
        return "CapturedType(" + mo35997f() + ')';
    }

    public /* synthetic */ C10366j(InterfaceC10318g1 interfaceC10318g1, Function0 function0, C10366j c10366j, InterfaceC10554e1 interfaceC10554e1, int i2, C9756g c9756g) {
        this(interfaceC10318g1, (i2 & 2) != 0 ? null : function0, (i2 & 4) != 0 ? null : c10366j, (i2 & 8) != 0 ? null : interfaceC10554e1);
    }

    public /* synthetic */ C10366j(InterfaceC10318g1 interfaceC10318g1, List list, C10366j c10366j, int i2, C9756g c9756g) {
        this(interfaceC10318g1, list, (i2 & 4) != 0 ? null : c10366j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10366j(InterfaceC10318g1 interfaceC10318g1, List<? extends AbstractC10348q1> list, C10366j c10366j) {
        this(interfaceC10318g1, new a(list), c10366j, null, 8, null);
        C9768m.m32346f(interfaceC10318g1, "projection");
        C9768m.m32346f(list, "supertypes");
    }
}
