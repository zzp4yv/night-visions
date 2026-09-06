package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10453a;

/* compiled from: ChainedMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.b */
/* loaded from: classes3.dex */
public final class C10212b implements InterfaceC10218h {

    /* renamed from: b */
    public static final a f39624b = new a(null);

    /* renamed from: c */
    private final String f39625c;

    /* renamed from: d */
    private final InterfaceC10218h[] f39626d;

    /* compiled from: ChainedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10218h m36124a(String str, Iterable<? extends InterfaceC10218h> iterable) {
            C9768m.m32346f(str, "debugName");
            C9768m.m32346f(iterable, "scopes");
            C10738e c10738e = new C10738e();
            for (InterfaceC10218h interfaceC10218h : iterable) {
                if (interfaceC10218h != InterfaceC10218h.b.f39671b) {
                    if (interfaceC10218h instanceof C10212b) {
                        C10794z.m38930A(c10738e, ((C10212b) interfaceC10218h).f39626d);
                    } else {
                        c10738e.add(interfaceC10218h);
                    }
                }
            }
            return m36125b(str, c10738e);
        }

        /* renamed from: b */
        public final InterfaceC10218h m36125b(String str, List<? extends InterfaceC10218h> list) {
            C9768m.m32346f(str, "debugName");
            C9768m.m32346f(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return InterfaceC10218h.b.f39671b;
            }
            if (size == 1) {
                return list.get(0);
            }
            Object[] array = list.toArray(new InterfaceC10218h[0]);
            C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C10212b(str, (InterfaceC10218h[]) array, null);
        }
    }

    private C10212b(String str, InterfaceC10218h[] interfaceC10218hArr) {
        this.f39625c = str;
        this.f39626d = interfaceC10218hArr;
    }

    public /* synthetic */ C10212b(String str, InterfaceC10218h[] interfaceC10218hArr, C9756g c9756g) {
        this(str, interfaceC10218hArr);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        Set m38917d;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        InterfaceC10218h[] interfaceC10218hArr = this.f39626d;
        int length = interfaceC10218hArr.length;
        if (length == 0) {
            return C10784u.m38888j();
        }
        if (length == 1) {
            return interfaceC10218hArr[0].mo33311a(c10130f, interfaceC9906b);
        }
        Collection<InterfaceC10706y0> collection = null;
        for (InterfaceC10218h interfaceC10218h : interfaceC10218hArr) {
            collection = C10453a.m37230a(collection, interfaceC10218h.mo33311a(c10130f, interfaceC9906b));
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
        InterfaceC10218h[] interfaceC10218hArr = this.f39626d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10218h interfaceC10218h : interfaceC10218hArr) {
            C10794z.m38933z(linkedHashSet, interfaceC10218h.mo33312b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        Set m38917d;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        InterfaceC10218h[] interfaceC10218hArr = this.f39626d;
        int length = interfaceC10218hArr.length;
        if (length == 0) {
            return C10784u.m38888j();
        }
        if (length == 1) {
            return interfaceC10218hArr[0].mo33313c(c10130f, interfaceC9906b);
        }
        Collection<InterfaceC10696t0> collection = null;
        for (InterfaceC10218h interfaceC10218h : interfaceC10218hArr) {
            collection = C10453a.m37230a(collection, interfaceC10218h.mo33313c(c10130f, interfaceC9906b));
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
        InterfaceC10218h[] interfaceC10218hArr = this.f39626d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10218h interfaceC10218h : interfaceC10218hArr) {
            C10794z.m38933z(linkedHashSet, interfaceC10218h.mo33314d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        Iterable m38761q;
        m38761q = C10770n.m38761q(this.f39626d);
        return C10220j.m36161a(m38761q);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        InterfaceC10561h interfaceC10561h = null;
        for (InterfaceC10218h interfaceC10218h : this.f39626d) {
            InterfaceC10561h mo33316f = interfaceC10218h.mo33316f(c10130f, interfaceC9906b);
            if (mo33316f != null) {
                if (!(mo33316f instanceof InterfaceC10564i) || !((InterfaceC10564i) mo33316f).mo32863M()) {
                    return mo33316f;
                }
                if (interfaceC10561h == null) {
                    interfaceC10561h = mo33316f;
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
        InterfaceC10218h[] interfaceC10218hArr = this.f39626d;
        int length = interfaceC10218hArr.length;
        if (length == 0) {
            return C10784u.m38888j();
        }
        if (length == 1) {
            return interfaceC10218hArr[0].mo33317g(c10214d, function1);
        }
        Collection<InterfaceC10576m> collection = null;
        for (InterfaceC10218h interfaceC10218h : interfaceC10218hArr) {
            collection = C10453a.m37230a(collection, interfaceC10218h.mo33317g(c10214d, function1));
        }
        if (collection != null) {
            return collection;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    public String toString() {
        return this.f39625c;
    }
}
