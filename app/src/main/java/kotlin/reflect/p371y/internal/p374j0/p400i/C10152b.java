package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.collections.C10780s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* renamed from: kotlin.f0.y.e.j0.i.b */
/* loaded from: classes3.dex */
public final class C10152b {

    /* renamed from: a */
    public static final C10152b f39498a = new C10152b();

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$a */
    static final class a extends Lambda implements Function2<InterfaceC10576m, InterfaceC10576m, Boolean> {

        /* renamed from: f */
        public static final a f39499f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$b */
    static final class b implements InterfaceC10361e.a {

        /* renamed from: a */
        final /* synthetic */ boolean f39500a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10540a f39501b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10540a f39502c;

        /* compiled from: DescriptorEquivalenceForOverrides.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.b$b$a */
        static final class a extends Lambda implements Function2<InterfaceC10576m, InterfaceC10576m, Boolean> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10540a f39503f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10540a f39504g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
                super(2);
                this.f39503f = interfaceC10540a;
                this.f39504g = interfaceC10540a2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
                return Boolean.valueOf(C9768m.m32341a(interfaceC10576m, this.f39503f) && C9768m.m32341a(interfaceC10576m2, this.f39504g));
            }
        }

        b(boolean z, InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
            this.f39500a = z;
            this.f39501b = interfaceC10540a;
            this.f39502c = interfaceC10540a2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e.a
        /* renamed from: a */
        public final boolean mo35780a(InterfaceC10312e1 interfaceC10312e1, InterfaceC10312e1 interfaceC10312e12) {
            C9768m.m32346f(interfaceC10312e1, "c1");
            C9768m.m32346f(interfaceC10312e12, "c2");
            if (C9768m.m32341a(interfaceC10312e1, interfaceC10312e12)) {
                return true;
            }
            InterfaceC10561h mo32891w = interfaceC10312e1.mo32891w();
            InterfaceC10561h mo32891w2 = interfaceC10312e12.mo32891w();
            if ((mo32891w instanceof InterfaceC10554e1) && (mo32891w2 instanceof InterfaceC10554e1)) {
                return C10152b.f39498a.m35778g((InterfaceC10554e1) mo32891w, (InterfaceC10554e1) mo32891w2, this.f39500a, new a(this.f39501b, this.f39502c));
            }
            return false;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$c */
    static final class c extends Lambda implements Function2<InterfaceC10576m, InterfaceC10576m, Boolean> {

        /* renamed from: f */
        public static final c f39505f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
            return Boolean.FALSE;
        }
    }

    private C10152b() {
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m35769b(C10152b c10152b, InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, boolean z, boolean z2, boolean z3, AbstractC10363g abstractC10363g, int i2, Object obj) {
        return c10152b.m35775a(interfaceC10540a, interfaceC10540a2, z, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? false : z3, abstractC10363g);
    }

    /* renamed from: c */
    private final boolean m35770c(InterfaceC10552e interfaceC10552e, InterfaceC10552e interfaceC10552e2) {
        return C9768m.m32341a(interfaceC10552e.mo32877h(), interfaceC10552e2.mo32877h());
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m35771e(C10152b c10152b, InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return c10152b.m35776d(interfaceC10576m, interfaceC10576m2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static /* synthetic */ boolean m35772h(C10152b c10152b, InterfaceC10554e1 interfaceC10554e1, InterfaceC10554e1 interfaceC10554e12, boolean z, Function2 function2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function2 = c.f39505f;
        }
        return c10152b.m35778g(interfaceC10554e1, interfaceC10554e12, z, function2);
    }

    /* renamed from: i */
    private final boolean m35773i(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2, Function2<? super InterfaceC10576m, ? super InterfaceC10576m, Boolean> function2, boolean z) {
        InterfaceC10576m mo32876b = interfaceC10576m.mo32876b();
        InterfaceC10576m mo32876b2 = interfaceC10576m2.mo32876b();
        return ((mo32876b instanceof InterfaceC10543b) || (mo32876b2 instanceof InterfaceC10543b)) ? function2.invoke(mo32876b, mo32876b2).booleanValue() : m35771e(this, mo32876b, mo32876b2, z, false, 8, null);
    }

    /* renamed from: j */
    private final InterfaceC10708z0 m35774j(InterfaceC10540a interfaceC10540a) {
        while (interfaceC10540a instanceof InterfaceC10543b) {
            InterfaceC10543b interfaceC10543b = (InterfaceC10543b) interfaceC10540a;
            if (interfaceC10543b.mo37030i() != InterfaceC10543b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends InterfaceC10543b> mo37027e = interfaceC10543b.mo37027e();
            C9768m.m32345e(mo37027e, "overriddenDescriptors");
            interfaceC10540a = (InterfaceC10543b) C10780s.m38868t0(mo37027e);
            if (interfaceC10540a == null) {
                return null;
            }
        }
        return interfaceC10540a.mo32883t();
    }

    /* renamed from: a */
    public final boolean m35775a(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, boolean z, boolean z2, boolean z3, AbstractC10363g abstractC10363g) {
        C9768m.m32346f(interfaceC10540a, "a");
        C9768m.m32346f(interfaceC10540a2, "b");
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        if (C9768m.m32341a(interfaceC10540a, interfaceC10540a2)) {
            return true;
        }
        if (!C9768m.m32341a(interfaceC10540a.getName(), interfaceC10540a2.getName())) {
            return false;
        }
        if (z2 && (interfaceC10540a instanceof InterfaceC10547c0) && (interfaceC10540a2 instanceof InterfaceC10547c0) && ((InterfaceC10547c0) interfaceC10540a).mo32863M() != ((InterfaceC10547c0) interfaceC10540a2).mo32863M()) {
            return false;
        }
        if ((C9768m.m32341a(interfaceC10540a.mo32876b(), interfaceC10540a2.mo32876b()) && (!z || !C9768m.m32341a(m35774j(interfaceC10540a), m35774j(interfaceC10540a2)))) || C10154d.m35804E(interfaceC10540a) || C10154d.m35804E(interfaceC10540a2) || !m35773i(interfaceC10540a, interfaceC10540a2, a.f39499f, z)) {
            return false;
        }
        C10160j m35866i = C10160j.m35866i(abstractC10363g, new b(z, interfaceC10540a, interfaceC10540a2));
        C9768m.m32345e(m35866i, "a: CallableDescriptor,\n …= a && y == b }\n        }");
        C10160j.i.a m35898c = m35866i.m35884E(interfaceC10540a, interfaceC10540a2, null, !z3).m35898c();
        C10160j.i.a aVar = C10160j.i.a.OVERRIDABLE;
        return m35898c == aVar && m35866i.m35884E(interfaceC10540a2, interfaceC10540a, null, z3 ^ true).m35898c() == aVar;
    }

    /* renamed from: d */
    public final boolean m35776d(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2, boolean z, boolean z2) {
        return ((interfaceC10576m instanceof InterfaceC10552e) && (interfaceC10576m2 instanceof InterfaceC10552e)) ? m35770c((InterfaceC10552e) interfaceC10576m, (InterfaceC10552e) interfaceC10576m2) : ((interfaceC10576m instanceof InterfaceC10554e1) && (interfaceC10576m2 instanceof InterfaceC10554e1)) ? m35772h(this, (InterfaceC10554e1) interfaceC10576m, (InterfaceC10554e1) interfaceC10576m2, z, null, 8, null) : ((interfaceC10576m instanceof InterfaceC10540a) && (interfaceC10576m2 instanceof InterfaceC10540a)) ? m35769b(this, (InterfaceC10540a) interfaceC10576m, (InterfaceC10540a) interfaceC10576m2, z, z2, false, AbstractC10363g.a.f40183a, 16, null) : ((interfaceC10576m instanceof InterfaceC10571k0) && (interfaceC10576m2 instanceof InterfaceC10571k0)) ? C9768m.m32341a(((InterfaceC10571k0) interfaceC10576m).mo37712d(), ((InterfaceC10571k0) interfaceC10576m2).mo37712d()) : C9768m.m32341a(interfaceC10576m, interfaceC10576m2);
    }

    /* renamed from: f */
    public final boolean m35777f(InterfaceC10554e1 interfaceC10554e1, InterfaceC10554e1 interfaceC10554e12, boolean z) {
        C9768m.m32346f(interfaceC10554e1, "a");
        C9768m.m32346f(interfaceC10554e12, "b");
        return m35772h(this, interfaceC10554e1, interfaceC10554e12, z, null, 8, null);
    }

    /* renamed from: g */
    public final boolean m35778g(InterfaceC10554e1 interfaceC10554e1, InterfaceC10554e1 interfaceC10554e12, boolean z, Function2<? super InterfaceC10576m, ? super InterfaceC10576m, Boolean> function2) {
        C9768m.m32346f(interfaceC10554e1, "a");
        C9768m.m32346f(interfaceC10554e12, "b");
        C9768m.m32346f(function2, "equivalentCallables");
        if (C9768m.m32341a(interfaceC10554e1, interfaceC10554e12)) {
            return true;
        }
        return !C9768m.m32341a(interfaceC10554e1.mo32876b(), interfaceC10554e12.mo32876b()) && m35773i(interfaceC10554e1, interfaceC10554e12, function2, z) && interfaceC10554e1.mo37670g() == interfaceC10554e12.mo37670g();
    }
}
