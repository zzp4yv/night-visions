package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Iterator;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9932c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: LazyJavaAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.d */
/* loaded from: classes2.dex */
public final class C9954d implements InterfaceC10587g {

    /* renamed from: f */
    private final C9957g f37989f;

    /* renamed from: g */
    private final InterfaceC9992d f37990g;

    /* renamed from: h */
    private final boolean f37991h;

    /* renamed from: i */
    private final InterfaceC10291h<InterfaceC9986a, InterfaceC10583c> f37992i;

    /* compiled from: LazyJavaAnnotations.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.d$a */
    static final class a extends Lambda implements Function1<InterfaceC9986a, InterfaceC10583c> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10583c invoke(InterfaceC9986a interfaceC9986a) {
            C9768m.m32346f(interfaceC9986a, "annotation");
            return C9932c.f37907a.m33171e(interfaceC9986a, C9954d.this.f37989f, C9954d.this.f37991h);
        }
    }

    public C9954d(C9957g c9957g, InterfaceC9992d interfaceC9992d, boolean z) {
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC9992d, "annotationOwner");
        this.f37989f = c9957g;
        this.f37990g = interfaceC9992d;
        this.f37991h = z;
        this.f37992i = c9957g.m33282a().m33261u().mo36521i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        return InterfaceC10587g.b.m37738b(this, c10127c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        return this.f37990g.getAnnotations().isEmpty() && !this.f37990g.mo33583m();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        Sequence m38575J;
        Sequence m37391u;
        Sequence m37394x;
        m38575J = C10749c0.m38575J(this.f37990g.getAnnotations());
        m37391u = C10489n.m37391u(m38575J, this.f37992i);
        m37394x = C10489n.m37394x(m37391u, C9932c.f37907a.m33167a(C9884k.a.f37608y, this.f37990g, this.f37989f));
        return C10489n.m37384n(m37394x).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: l */
    public InterfaceC10583c mo33271l(C10127c c10127c) {
        InterfaceC10583c invoke;
        C9768m.m32346f(c10127c, "fqName");
        InterfaceC9986a mo33582l = this.f37990g.mo33582l(c10127c);
        return (mo33582l == null || (invoke = this.f37992i.invoke(mo33582l)) == null) ? C9932c.f37907a.m33167a(c10127c, this.f37990g, this.f37989f) : invoke;
    }

    public /* synthetic */ C9954d(C9957g c9957g, InterfaceC9992d interfaceC9992d, boolean z, int i2, C9756g c9756g) {
        this(c9957g, interfaceC9992d, (i2 & 4) != 0 ? false : z);
    }
}
