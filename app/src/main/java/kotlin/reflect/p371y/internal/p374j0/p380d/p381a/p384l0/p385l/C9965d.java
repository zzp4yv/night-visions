package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C10770n;
import kotlin.collections.C10789w0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9904a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10220j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10453a;

/* compiled from: JvmPackageScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.d */
/* loaded from: classes2.dex */
public final class C9965d implements InterfaceC10218h {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f38019b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9965d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: c */
    private final C9957g f38020c;

    /* renamed from: d */
    private final C9969h f38021d;

    /* renamed from: e */
    private final C9970i f38022e;

    /* renamed from: f */
    private final InterfaceC10292i f38023f;

    /* compiled from: JvmPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.d$a */
    static final class a extends Lambda implements Function0<InterfaceC10218h[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10218h[] invoke() {
            Collection<InterfaceC10068q> values = C9965d.this.f38021d.m33427N0().values();
            C9965d c9965d = C9965d.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                InterfaceC10218h m33970b = c9965d.f38020c.m33282a().m33242b().m33970b(c9965d.f38021d, (InterfaceC10068q) it.next());
                if (m33970b != null) {
                    arrayList.add(m33970b);
                }
            }
            Object[] array = C10453a.m37231b(arrayList).toArray(new InterfaceC10218h[0]);
            C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (InterfaceC10218h[]) array;
        }
    }

    public C9965d(C9957g c9957g, InterfaceC10011u interfaceC10011u, C9969h c9969h) {
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC10011u, "jPackage");
        C9768m.m32346f(c9969h, "packageFragment");
        this.f38020c = c9957g;
        this.f38021d = c9969h;
        this.f38022e = new C9970i(c9957g, interfaceC10011u, c9969h);
        this.f38023f = c9957g.m33286e().mo36516d(new a());
    }

    /* renamed from: k */
    private final InterfaceC10218h[] m33310k() {
        return (InterfaceC10218h[]) C10296m.m36555a(this.f38023f, this, f38019b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        Set m38917d;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33319l(c10130f, interfaceC9906b);
        C9970i c9970i = this.f38022e;
        InterfaceC10218h[] m33310k = m33310k();
        Collection<? extends InterfaceC10706y0> mo33311a = c9970i.mo33311a(c10130f, interfaceC9906b);
        int length = m33310k.length;
        int i2 = 0;
        Collection collection = mo33311a;
        while (i2 < length) {
            Collection m37230a = C10453a.m37230a(collection, m33310k[i2].mo33311a(c10130f, interfaceC9906b));
            i2++;
            collection = m37230a;
        }
        if (collection != null) {
            return collection;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        InterfaceC10218h[] m33310k = m33310k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10218h interfaceC10218h : m33310k) {
            C10794z.m38933z(linkedHashSet, interfaceC10218h.mo33312b());
        }
        linkedHashSet.addAll(this.f38022e.mo33312b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        Set m38917d;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33319l(c10130f, interfaceC9906b);
        C9970i c9970i = this.f38022e;
        InterfaceC10218h[] m33310k = m33310k();
        Collection<? extends InterfaceC10696t0> mo33313c = c9970i.mo33313c(c10130f, interfaceC9906b);
        int length = m33310k.length;
        int i2 = 0;
        Collection collection = mo33313c;
        while (i2 < length) {
            Collection m37230a = C10453a.m37230a(collection, m33310k[i2].mo33313c(c10130f, interfaceC9906b));
            i2++;
            collection = m37230a;
        }
        if (collection != null) {
            return collection;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        InterfaceC10218h[] m33310k = m33310k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10218h interfaceC10218h : m33310k) {
            C10794z.m38933z(linkedHashSet, interfaceC10218h.mo33314d());
        }
        linkedHashSet.addAll(this.f38022e.mo33314d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        Iterable m38761q;
        m38761q = C10770n.m38761q(m33310k());
        Set<C10130f> m36161a = C10220j.m36161a(m38761q);
        if (m36161a == null) {
            return null;
        }
        m36161a.addAll(this.f38022e.mo33315e());
        return m36161a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33319l(c10130f, interfaceC9906b);
        InterfaceC10552e mo33316f = this.f38022e.mo33316f(c10130f, interfaceC9906b);
        if (mo33316f != null) {
            return mo33316f;
        }
        InterfaceC10561h interfaceC10561h = null;
        for (InterfaceC10218h interfaceC10218h : m33310k()) {
            InterfaceC10561h mo33316f2 = interfaceC10218h.mo33316f(c10130f, interfaceC9906b);
            if (mo33316f2 != null) {
                if (!(mo33316f2 instanceof InterfaceC10564i) || !((InterfaceC10564i) mo33316f2).mo32863M()) {
                    return mo33316f2;
                }
                if (interfaceC10561h == null) {
                    interfaceC10561h = mo33316f2;
                }
            }
        }
        return interfaceC10561h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set m38917d;
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        C9970i c9970i = this.f38022e;
        InterfaceC10218h[] m33310k = m33310k();
        Collection<InterfaceC10576m> mo33317g = c9970i.mo33317g(c10214d, function1);
        for (InterfaceC10218h interfaceC10218h : m33310k) {
            mo33317g = C10453a.m37230a(mo33317g, interfaceC10218h.mo33317g(c10214d, function1));
        }
        if (mo33317g != null) {
            return mo33317g;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    /* renamed from: j */
    public final C9970i m33318j() {
        return this.f38022e;
    }

    /* renamed from: l */
    public void m33319l(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        C9904a.m33014b(this.f38020c.m33282a().m33252l(), interfaceC9906b, this.f38021d, c10130f);
    }

    public String toString() {
        return "scope for " + this.f38021d;
    }
}
