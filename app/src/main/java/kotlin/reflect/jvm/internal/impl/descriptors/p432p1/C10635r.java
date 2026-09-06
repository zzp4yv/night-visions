package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10580n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10212b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10217g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r */
/* loaded from: classes2.dex */
public class C10635r extends AbstractC10622j implements InterfaceC10603p0 {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f41086h = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10635r.class), "fragments", "getFragments()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10635r.class), "empty", "getEmpty()Z"))};

    /* renamed from: i */
    private final C10641x f41087i;

    /* renamed from: j */
    private final C10127c f41088j;

    /* renamed from: k */
    private final InterfaceC10292i f41089k;

    /* renamed from: l */
    private final InterfaceC10292i f41090l;

    /* renamed from: m */
    private final InterfaceC10218h f41091m;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C10580n0.m37724b(C10635r.this.mo37752v0().m37992R0(), C10635r.this.mo37750d()));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$b */
    static final class b extends Lambda implements Function0<List<? extends InterfaceC10571k0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10571k0> invoke() {
            return C10580n0.m37725c(C10635r.this.mo37752v0().m37992R0(), C10635r.this.mo37750d());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$c */
    static final class c extends Lambda implements Function0<InterfaceC10218h> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10218h invoke() {
            if (C10635r.this.isEmpty()) {
                return InterfaceC10218h.b.f39671b;
            }
            List<InterfaceC10571k0> mo37749I = C10635r.this.mo37749I();
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37749I, 10));
            Iterator<T> it = mo37749I.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10571k0) it.next()).mo32988q());
            }
            List m38610p0 = C10749c0.m38610p0(arrayList, new C10619h0(C10635r.this.mo37752v0(), C10635r.this.mo37750d()));
            return C10212b.f39624b.m36124a("package view scope for " + C10635r.this.mo37750d() + " in " + C10635r.this.mo37752v0().getName(), m38610p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10635r(C10641x c10641x, C10127c c10127c, InterfaceC10297n interfaceC10297n) {
        super(InterfaceC10587g.f40808c.m37735b(), c10127c.m35426h());
        C9768m.m32346f(c10641x, "module");
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        this.f41087i = c10641x;
        this.f41088j = c10127c;
        this.f41089k = interfaceC10297n.mo36516d(new b());
        this.f41090l = interfaceC10297n.mo36516d(new a());
        this.f41091m = new C10217g(interfaceC10297n, new c());
    }

    /* renamed from: A0 */
    protected final boolean m37963A0() {
        return ((Boolean) C10296m.m36555a(this.f41090l, this, f41086h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0
    /* renamed from: I */
    public List<InterfaceC10571k0> mo37749I() {
        return (List) C10296m.m36555a(this.f41089k, this, f41086h[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10603p0 mo32876b() {
        if (mo37750d().m35422d()) {
            return null;
        }
        C10641x mo37752v0 = mo37752v0();
        C10127c m35423e = mo37750d().m35423e();
        C9768m.m32345e(m35423e, "fqName.parent()");
        return mo37752v0.mo37018N(m35423e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        C9768m.m32346f(interfaceC10595o, "visitor");
        return interfaceC10595o.mo35676c(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C10641x mo37752v0() {
        return this.f41087i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0
    /* renamed from: d */
    public C10127c mo37750d() {
        return this.f41088j;
    }

    public boolean equals(Object obj) {
        InterfaceC10603p0 interfaceC10603p0 = obj instanceof InterfaceC10603p0 ? (InterfaceC10603p0) obj : null;
        return interfaceC10603p0 != null && C9768m.m32341a(mo37750d(), interfaceC10603p0.mo37750d()) && C9768m.m32341a(mo37752v0(), interfaceC10603p0.mo37752v0());
    }

    public int hashCode() {
        return (mo37752v0().hashCode() * 31) + mo37750d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0
    public boolean isEmpty() {
        return m37963A0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0
    /* renamed from: q */
    public InterfaceC10218h mo37751q() {
        return this.f41091m;
    }
}
