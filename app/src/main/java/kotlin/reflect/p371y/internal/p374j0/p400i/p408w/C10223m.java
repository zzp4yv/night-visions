package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10170d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;

/* compiled from: SubstitutingScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.m */
/* loaded from: classes3.dex */
public final class C10223m implements InterfaceC10218h {

    /* renamed from: b */
    private final InterfaceC10218h f39676b;

    /* renamed from: c */
    private final C10333l1 f39677c;

    /* renamed from: d */
    private Map<InterfaceC10576m, InterfaceC10576m> f39678d;

    /* renamed from: e */
    private final Lazy f39679e;

    /* compiled from: SubstitutingScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.m$a */
    static final class a extends Lambda implements Function0<Collection<? extends InterfaceC10576m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10576m> invoke() {
            C10223m c10223m = C10223m.this;
            return c10223m.m36171k(InterfaceC10221k.a.m36162a(c10223m.f39676b, null, null, 3, null));
        }
    }

    public C10223m(InterfaceC10218h interfaceC10218h, C10333l1 c10333l1) {
        Lazy m37594b;
        C9768m.m32346f(interfaceC10218h, "workerScope");
        C9768m.m32346f(c10333l1, "givenSubstitutor");
        this.f39676b = interfaceC10218h;
        AbstractC10327j1 m36755j = c10333l1.m36755j();
        C9768m.m32345e(m36755j, "givenSubstitutor.substitution");
        this.f39677c = C10170d.m36010f(m36755j, false, 1, null).m36726c();
        m37594b = C10517i.m37594b(new a());
        this.f39679e = m37594b;
    }

    /* renamed from: j */
    private final Collection<InterfaceC10576m> m36170j() {
        return (Collection) this.f39679e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <D extends InterfaceC10576m> Collection<D> m36171k(Collection<? extends D> collection) {
        if (this.f39677c.m36756k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet m38514g = C10734a.m38514g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m38514g.add(m36172l((InterfaceC10576m) it.next()));
        }
        return m38514g;
    }

    /* renamed from: l */
    private final <D extends InterfaceC10576m> D m36172l(D d2) {
        if (this.f39677c.m36756k()) {
            return d2;
        }
        if (this.f39678d == null) {
            this.f39678d = new HashMap();
        }
        Map<InterfaceC10576m, InterfaceC10576m> map = this.f39678d;
        C9768m.m32343c(map);
        InterfaceC10576m interfaceC10576m = map.get(d2);
        if (interfaceC10576m == null) {
            if (!(d2 instanceof InterfaceC10545b1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
            }
            interfaceC10576m = ((InterfaceC10545b1) d2).mo36396c(this.f39677c);
            if (interfaceC10576m == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d2 + " substitution fails");
            }
            map.put(d2, interfaceC10576m);
        }
        D d3 = (D) interfaceC10576m;
        C9768m.m32344d(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<? extends InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return m36171k(this.f39676b.mo33311a(c10130f, interfaceC9906b));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        return this.f39676b.mo33312b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<? extends InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return m36171k(this.f39676b.mo33313c(c10130f, interfaceC9906b));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        return this.f39676b.mo33314d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        return this.f39676b.mo33315e();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        InterfaceC10561h mo33316f = this.f39676b.mo33316f(c10130f, interfaceC9906b);
        if (mo33316f != null) {
            return (InterfaceC10561h) m36172l(mo33316f);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        return m36170j();
    }
}
