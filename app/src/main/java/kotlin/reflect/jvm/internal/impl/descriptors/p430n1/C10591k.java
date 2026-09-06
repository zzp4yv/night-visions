package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.sequences.C10484i;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k */
/* loaded from: classes2.dex */
public final class C10591k implements InterfaceC10587g {

    /* renamed from: f */
    private final List<InterfaceC10587g> f40817f;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k$a */
    static final class a extends Lambda implements Function1<InterfaceC10587g, InterfaceC10583c> {

        /* renamed from: f */
        final /* synthetic */ C10127c f40818f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10127c c10127c) {
            super(1);
            this.f40818f = c10127c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10583c invoke(InterfaceC10587g interfaceC10587g) {
            C9768m.m32346f(interfaceC10587g, "it");
            return interfaceC10587g.mo33271l(this.f40818f);
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k$b */
    static final class b extends Lambda implements Function1<InterfaceC10587g, Sequence<? extends InterfaceC10583c>> {

        /* renamed from: f */
        public static final b f40819f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<InterfaceC10583c> invoke(InterfaceC10587g interfaceC10587g) {
            Sequence<InterfaceC10583c> m38575J;
            C9768m.m32346f(interfaceC10587g, "it");
            m38575J = C10749c0.m38575J(interfaceC10587g);
            return m38575J;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10591k(List<? extends InterfaceC10587g> list) {
        C9768m.m32346f(list, "delegates");
        this.f40817f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        Sequence m38575J;
        C9768m.m32346f(c10127c, "fqName");
        m38575J = C10749c0.m38575J(this.f40817f);
        Iterator it = m38575J.iterator();
        while (it.hasNext()) {
            if (((InterfaceC10587g) it.next()).mo33270R0(c10127c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        List<InterfaceC10587g> list = this.f40817f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC10587g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        Sequence m38575J;
        Sequence m37386p;
        m38575J = C10749c0.m38575J(this.f40817f);
        m37386p = C10489n.m37386p(m38575J, b.f40819f);
        return m37386p.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: l */
    public InterfaceC10583c mo33271l(C10127c c10127c) {
        Sequence m38575J;
        Sequence m37392v;
        C9768m.m32346f(c10127c, "fqName");
        m38575J = C10749c0.m38575J(this.f40817f);
        m37392v = C10489n.m37392v(m38575J, new a(c10127c));
        return (InterfaceC10583c) C10484i.m37359o(m37392v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10591k(kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.C9768m.m32346f(r2, r0)
            java.util.List r2 = kotlin.collections.C10762j.m38671Z(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10591k.<init>(kotlin.reflect.jvm.internal.impl.descriptors.n1.g[]):void");
    }
}
