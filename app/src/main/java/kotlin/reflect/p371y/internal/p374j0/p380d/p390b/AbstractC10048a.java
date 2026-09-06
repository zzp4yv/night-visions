package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.C9873a;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9888o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10071t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10188q;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.EnumC10237b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10239c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10048a<A, C> extends AbstractC10050b<A, a<? extends A, ? extends C>> implements InterfaceC10239c<A, C> {

    /* renamed from: b */
    private final InterfaceC10290g<InterfaceC10068q, a<A, C>> f38334b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$a */
    public static final class a<A, C> extends AbstractC10050b.a<A> {

        /* renamed from: a */
        private final Map<C10071t, List<A>> f38335a;

        /* renamed from: b */
        private final Map<C10071t, C> f38336b;

        /* renamed from: c */
        private final Map<C10071t, C> f38337c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<C10071t, ? extends List<? extends A>> map, Map<C10071t, ? extends C> map2, Map<C10071t, ? extends C> map3) {
            C9768m.m32346f(map, "memberAnnotations");
            C9768m.m32346f(map2, "propertyConstants");
            C9768m.m32346f(map3, "annotationParametersDefaultValues");
            this.f38335a = map;
            this.f38336b = map2;
            this.f38337c = map3;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b.a
        /* renamed from: a */
        public Map<C10071t, List<A>> mo33845a() {
            return this.f38335a;
        }

        /* renamed from: b */
        public final Map<C10071t, C> m33846b() {
            return this.f38337c;
        }

        /* renamed from: c */
        public final Map<C10071t, C> m33847c() {
            return this.f38336b;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$b */
    static final class b extends Lambda implements Function2<a<? extends A, ? extends C>, C10071t, C> {

        /* renamed from: f */
        public static final b f38338f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(a<? extends A, ? extends C> aVar, C10071t c10071t) {
            C9768m.m32346f(aVar, "$this$loadConstantFromProperty");
            C9768m.m32346f(c10071t, "it");
            return aVar.m33846b().get(c10071t);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$c */
    public static final class c implements InterfaceC10068q.d {

        /* renamed from: a */
        final /* synthetic */ AbstractC10048a<A, C> f38339a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C10071t, List<A>> f38340b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10068q f38341c;

        /* renamed from: d */
        final /* synthetic */ HashMap<C10071t, C> f38342d;

        /* renamed from: e */
        final /* synthetic */ HashMap<C10071t, C> f38343e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.a$c$a */
        public final class a extends b implements InterfaceC10068q.e {

            /* renamed from: d */
            final /* synthetic */ c f38344d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, C10071t c10071t) {
                super(cVar, c10071t);
                C9768m.m32346f(c10071t, RoomInstalled.SIGNATURE);
                this.f38344d = cVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.e
            /* renamed from: c */
            public InterfaceC10068q.a mo33851c(int i2, C10126b c10126b, InterfaceC10708z0 interfaceC10708z0) {
                C9768m.m32346f(c10126b, "classId");
                C9768m.m32346f(interfaceC10708z0, "source");
                C10071t m34035e = C10071t.f38485a.m34035e(m33852d(), i2);
                List<A> list = this.f38344d.f38340b.get(m34035e);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f38344d.f38340b.put(m34035e, list);
                }
                return this.f38344d.f38339a.m33886y(c10126b, interfaceC10708z0, list);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.a$c$b */
        public class b implements InterfaceC10068q.c {

            /* renamed from: a */
            private final C10071t f38345a;

            /* renamed from: b */
            private final ArrayList<A> f38346b;

            /* renamed from: c */
            final /* synthetic */ c f38347c;

            public b(c cVar, C10071t c10071t) {
                C9768m.m32346f(c10071t, RoomInstalled.SIGNATURE);
                this.f38347c = cVar;
                this.f38345a = c10071t;
                this.f38346b = new ArrayList<>();
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
            /* renamed from: a */
            public void mo32695a() {
                if (!this.f38346b.isEmpty()) {
                    this.f38347c.f38340b.put(this.f38345a, this.f38346b);
                }
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
            /* renamed from: b */
            public InterfaceC10068q.a mo32696b(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0) {
                C9768m.m32346f(c10126b, "classId");
                C9768m.m32346f(interfaceC10708z0, "source");
                return this.f38347c.f38339a.m33886y(c10126b, interfaceC10708z0, this.f38346b);
            }

            /* renamed from: d */
            protected final C10071t m33852d() {
                return this.f38345a;
            }
        }

        c(AbstractC10048a<A, C> abstractC10048a, HashMap<C10071t, List<A>> hashMap, InterfaceC10068q interfaceC10068q, HashMap<C10071t, C> hashMap2, HashMap<C10071t, C> hashMap3) {
            this.f38339a = abstractC10048a;
            this.f38340b = hashMap;
            this.f38341c = interfaceC10068q;
            this.f38342d = hashMap2;
            this.f38343e = hashMap3;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.d
        /* renamed from: a */
        public InterfaceC10068q.c mo33849a(C10130f c10130f, String str, Object obj) {
            C mo33840G;
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(str, "desc");
            C10071t.a aVar = C10071t.f38485a;
            String m35455k = c10130f.m35455k();
            C9768m.m32345e(m35455k, "name.asString()");
            C10071t m34031a = aVar.m34031a(m35455k, str);
            if (obj != null && (mo33840G = this.f38339a.mo33840G(str, obj)) != null) {
                this.f38343e.put(m34031a, mo33840G);
            }
            return new b(this, m34031a);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.d
        /* renamed from: b */
        public InterfaceC10068q.e mo33850b(C10130f c10130f, String str) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(str, "desc");
            C10071t.a aVar = C10071t.f38485a;
            String m35455k = c10130f.m35455k();
            C9768m.m32345e(m35455k, "name.asString()");
            return new a(this, aVar.m34034d(m35455k, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$d */
    static final class d extends Lambda implements Function2<a<? extends A, ? extends C>, C10071t, C> {

        /* renamed from: f */
        public static final d f38348f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(a<? extends A, ? extends C> aVar, C10071t c10071t) {
            C9768m.m32346f(aVar, "$this$loadConstantFromProperty");
            C9768m.m32346f(c10071t, "it");
            return aVar.m33847c().get(c10071t);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$e */
    static final class e extends Lambda implements Function1<InterfaceC10068q, a<? extends A, ? extends C>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10048a<A, C> f38349f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC10048a<A, C> abstractC10048a) {
            super(1);
            this.f38349f = abstractC10048a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a<A, C> invoke(InterfaceC10068q interfaceC10068q) {
            C9768m.m32346f(interfaceC10068q, "kotlinClass");
            return this.f38349f.m33836F(interfaceC10068q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10048a(InterfaceC10297n interfaceC10297n, InterfaceC10066o interfaceC10066o) {
        super(interfaceC10066o);
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10066o, "kotlinClassFinder");
        this.f38334b = interfaceC10297n.mo36520h(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final a<A, C> m33836F(InterfaceC10068q interfaceC10068q) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        interfaceC10068q.mo34027c(new c(this, hashMap, interfaceC10068q, hashMap3, hashMap2), m33880q(interfaceC10068q));
        return new a<>(hashMap, hashMap2, hashMap3);
    }

    /* renamed from: H */
    private final C m33837H(AbstractC10283z abstractC10283z, C10102n c10102n, EnumC10237b enumC10237b, AbstractC10311e0 abstractC10311e0, Function2<? super a<? extends A, ? extends C>, ? super C10071t, ? extends C> function2) {
        C invoke;
        InterfaceC10068q m33879o = m33879o(abstractC10283z, m33883v(abstractC10283z, true, true, C10117b.f39189A.mo35368d(c10102n.m34885b0()), C10088i.m34257f(c10102n)));
        if (m33879o == null) {
            return null;
        }
        C10071t m33881r = m33881r(c10102n, abstractC10283z.m36498b(), abstractC10283z.m36500d(), enumC10237b, m33879o.mo34025a().m33914d().m35361d(C10058g.f38445a.m33976a()));
        if (m33881r == null || (invoke = function2.invoke(this.f38334b.invoke(m33879o), m33881r)) == null) {
            return null;
        }
        return C9888o.m32844d(abstractC10311e0) ? mo33841I(invoke) : invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public a<A, C> mo33844p(InterfaceC10068q interfaceC10068q) {
        C9768m.m32346f(interfaceC10068q, "binaryClass");
        return this.f38334b.invoke(interfaceC10068q);
    }

    /* renamed from: E */
    protected final boolean m33839E(C10126b c10126b, Map<C10130f, ? extends AbstractC10178g<?>> map) {
        C9768m.m32346f(c10126b, "annotationClassId");
        C9768m.m32346f(map, "arguments");
        if (!C9768m.m32341a(c10126b, C9873a.f37442a.m32692a())) {
            return false;
        }
        AbstractC10178g<?> abstractC10178g = map.get(C10130f.m35454x("value"));
        C10188q c10188q = abstractC10178g instanceof C10188q ? (C10188q) abstractC10178g : null;
        if (c10188q == null) {
            return false;
        }
        C10188q.b mo36023b = c10188q.mo36023b();
        C10188q.b.C11513b c11513b = mo36023b instanceof C10188q.b.C11513b ? (C10188q.b.C11513b) mo36023b : null;
        if (c11513b == null) {
            return false;
        }
        return m33884w(c11513b.m36056b());
    }

    /* renamed from: G */
    protected abstract C mo33840G(String str, Object obj);

    /* renamed from: I */
    protected abstract C mo33841I(C c2);

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10239c
    /* renamed from: e */
    public C mo33842e(AbstractC10283z abstractC10283z, C10102n c10102n, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(abstractC10311e0, "expectedType");
        return m33837H(abstractC10283z, c10102n, EnumC10237b.PROPERTY, abstractC10311e0, d.f38348f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10239c
    /* renamed from: k */
    public C mo33843k(AbstractC10283z abstractC10283z, C10102n c10102n, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(abstractC10311e0, "expectedType");
        return m33837H(abstractC10283z, c10102n, EnumC10237b.PROPERTY_GETTER, abstractC10311e0, b.f38338f);
    }
}
