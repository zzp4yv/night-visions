package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10606b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10242d0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10270m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.m */
/* loaded from: classes3.dex */
public final class C10263m extends AbstractC10606b {

    /* renamed from: p */
    private final C10270m f39897p;

    /* renamed from: q */
    private final C10107s f39898q;

    /* renamed from: r */
    private final C10251a f39899r;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.m$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10583c>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            return C10749c0.m38569E0(C10263m.this.f39897p.m36452c().m36419d().mo33870a(C10263m.this.m36403P0(), C10263m.this.f39897p.m36456g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10263m(kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10270m r12, kotlin.reflect.p371y.internal.p374j0.p392e.C10107s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C9768m.m32346f(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C9768m.m32346f(r13, r0)
            kotlin.f0.y.e.j0.k.n r2 = r12.m36457h()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r12.m36454e()
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g.f40808c
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g r4 = r0.m37735b()
            kotlin.f0.y.e.j0.e.z.c r0 = r12.m36456g()
            int r1 = r13.m35187N()
            kotlin.f0.y.e.j0.f.f r5 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10281x.m36495b(r0, r1)
            kotlin.f0.y.e.j0.j.b.a0 r0 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10236a0.f39714a
            kotlin.f0.y.e.j0.e.s$c r1 = r13.m35193T()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.C9768m.m32345e(r1, r6)
            kotlin.f0.y.e.j0.l.r1 r6 = r0.m36207d(r1)
            boolean r7 = r13.m35188O()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r9 = kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0.f41247a
            kotlin.reflect.jvm.internal.impl.descriptors.c1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1.a.f40737a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f39897p = r12
            r11.f39898q = r13
            kotlin.f0.y.e.j0.j.b.g0.a r13 = new kotlin.f0.y.e.j0.j.b.g0.a
            kotlin.f0.y.e.j0.k.n r12 = r12.m36457h()
            kotlin.f0.y.e.j0.j.b.g0.m$a r14 = new kotlin.f0.y.e.j0.j.b.g0.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f39899r = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10263m.<init>(kotlin.f0.y.e.j0.j.b.m, kotlin.f0.y.e.j0.e.s, int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10612e
    /* renamed from: M0 */
    protected List<AbstractC10311e0> mo33498M0() {
        List<C10105q> m35397p = C10121f.m35397p(this.f39898q, this.f39897p.m36459j());
        if (m35397p.isEmpty()) {
            return C10782t.m38883e(C10202a.m36072f(this).m32805y());
        }
        C10242d0 m36458i = this.f39897p.m36458i();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m35397p, 10));
        Iterator<T> it = m35397p.iterator();
        while (it.hasNext()) {
            arrayList.add(m36458i.m36231q((C10105q) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10582b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C10251a getAnnotations() {
        return this.f39899r;
    }

    /* renamed from: P0 */
    public final C10107s m36403P0() {
        return this.f39898q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10612e
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void mo33497L0(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
