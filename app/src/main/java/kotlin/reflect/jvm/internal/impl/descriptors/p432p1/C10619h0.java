package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10213c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;

/* compiled from: SubpackagesScope.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.h0 */
/* loaded from: classes2.dex */
public class C10619h0 extends AbstractC10219i {

    /* renamed from: b */
    private final InterfaceC10559g0 f40983b;

    /* renamed from: c */
    private final C10127c f40984c;

    public C10619h0(InterfaceC10559g0 interfaceC10559g0, C10127c c10127c) {
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(c10127c, "fqName");
        this.f40983b = interfaceC10559g0;
        this.f40984c = c10127c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        Set<C10130f> m38917d;
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        if (!c10214d.m36137a(C10214d.f39630a.m36147f())) {
            return C10784u.m38888j();
        }
        if (this.f40984c.m35422d() && c10214d.m36138l().contains(AbstractC10213c.b.f39629a)) {
            return C10784u.m38888j();
        }
        Collection<C10127c> mo37022p = this.f40983b.mo37022p(this.f40984c, function1);
        ArrayList arrayList = new ArrayList(mo37022p.size());
        Iterator<C10127c> it = mo37022p.iterator();
        while (it.hasNext()) {
            C10130f m35425g = it.next().m35425g();
            C9768m.m32345e(m35425g, "subFqName.shortName()");
            if (function1.invoke(m35425g).booleanValue()) {
                C10734a.m38508a(arrayList, m37855h(m35425g));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    protected final InterfaceC10603p0 m37855h(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        if (c10130f.m35458y()) {
            return null;
        }
        InterfaceC10559g0 interfaceC10559g0 = this.f40983b;
        C10127c m35421c = this.f40984c.m35421c(c10130f);
        C9768m.m32345e(m35421c, "fqName.child(name)");
        InterfaceC10603p0 mo37018N = interfaceC10559g0.mo37018N(m35421c);
        if (mo37018N.isEmpty()) {
            return null;
        }
        return mo37018N;
    }

    public String toString() {
        return "subpackages of " + this.f40984c + " from " + this.f40983b;
    }
}
