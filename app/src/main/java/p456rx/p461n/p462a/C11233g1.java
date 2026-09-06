package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11193f;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.C11212i;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p460m.InterfaceC11211h;
import p456rx.p461n.p466e.C11311h;
import p456rx.p474t.C11378b;

/* compiled from: OperatorZip.java */
/* renamed from: rx.n.a.g1 */
/* loaded from: classes3.dex */
public final class C11233g1<R> implements C11186e.b<R, C11186e<?>[]> {

    /* renamed from: f */
    final InterfaceC11211h<? extends R> f42292f;

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$a */
    static final class a<R> extends AtomicLong {

        /* renamed from: f */
        static final int f42293f;

        /* renamed from: g */
        final InterfaceC11193f<? super R> f42294g;

        /* renamed from: h */
        private final InterfaceC11211h<? extends R> f42295h;

        /* renamed from: i */
        private final C11378b f42296i;

        /* renamed from: j */
        int f42297j;

        /* renamed from: k */
        private volatile Object[] f42298k;

        /* renamed from: l */
        private AtomicLong f42299l;

        /* compiled from: OperatorZip.java */
        /* renamed from: rx.n.a.g1$a$a, reason: collision with other inner class name */
        final class C11549a extends AbstractC11197j {

            /* renamed from: f */
            final C11311h f42300f = C11311h.m40436a();

            C11549a() {
            }

            /* renamed from: c */
            public void m40213c(long j2) {
                request(j2);
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                this.f42300f.m40441f();
                a.this.m40212b();
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                a.this.f42294g.onError(th);
            }

            @Override // p456rx.InterfaceC11193f
            public void onNext(Object obj) {
                try {
                    this.f42300f.m40442g(obj);
                } catch (MissingBackpressureException e2) {
                    onError(e2);
                }
                a.this.m40212b();
            }

            @Override // p456rx.AbstractC11197j
            public void onStart() {
                request(C11311h.f42884f);
            }
        }

        static {
            double d2 = C11311h.f42884f;
            Double.isNaN(d2);
            f42293f = (int) (d2 * 0.7d);
        }

        public a(AbstractC11197j<? super R> abstractC11197j, InterfaceC11211h<? extends R> interfaceC11211h) {
            C11378b c11378b = new C11378b();
            this.f42296i = c11378b;
            this.f42294g = abstractC11197j;
            this.f42295h = interfaceC11211h;
            abstractC11197j.add(c11378b);
        }

        /* renamed from: a */
        public void m40211a(C11186e[] c11186eArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[c11186eArr.length];
            for (int i2 = 0; i2 < c11186eArr.length; i2++) {
                C11549a c11549a = new C11549a();
                objArr[i2] = c11549a;
                this.f42296i.m40667a(c11549a);
            }
            this.f42299l = atomicLong;
            this.f42298k = objArr;
            for (int i3 = 0; i3 < c11186eArr.length; i3++) {
                c11186eArr[i3].m40089c1((C11549a) objArr[i3]);
            }
        }

        /* renamed from: b */
        void m40212b() {
            Object[] objArr = this.f42298k;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            InterfaceC11193f<? super R> interfaceC11193f = this.f42294g;
            AtomicLong atomicLong = this.f42299l;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i2 = 0; i2 < length; i2++) {
                    C11311h c11311h = ((C11549a) objArr[i2]).f42300f;
                    Object m40443h = c11311h.m40443h();
                    if (m40443h == null) {
                        z = false;
                    } else {
                        if (c11311h.m40439d(m40443h)) {
                            interfaceC11193f.onCompleted();
                            this.f42296i.unsubscribe();
                            return;
                        }
                        objArr2[i2] = c11311h.m40438c(m40443h);
                    }
                }
                if (z && atomicLong.get() > 0) {
                    try {
                        interfaceC11193f.onNext(this.f42295h.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.f42297j++;
                        for (Object obj : objArr) {
                            C11311h c11311h2 = ((C11549a) obj).f42300f;
                            c11311h2.m40444i();
                            if (c11311h2.m40439d(c11311h2.m40443h())) {
                                interfaceC11193f.onCompleted();
                                this.f42296i.unsubscribe();
                                return;
                            }
                        }
                        if (this.f42297j > f42293f) {
                            for (Object obj2 : objArr) {
                                ((C11549a) obj2).m40213c(this.f42297j);
                            }
                            this.f42297j = 0;
                        }
                    } catch (Throwable th) {
                        C11192a.m40142g(th, interfaceC11193f, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$b */
    static final class b<R> extends AtomicLong implements InterfaceC11194g {

        /* renamed from: f */
        final a<R> f42302f;

        public b(a<R> aVar) {
            this.f42302f = aVar;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            C11213a.m40162b(this, j2);
            this.f42302f.m40212b();
        }
    }

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$c */
    final class c extends AbstractC11197j<C11186e[]> {

        /* renamed from: f */
        final AbstractC11197j<? super R> f42303f;

        /* renamed from: g */
        final a<R> f42304g;

        /* renamed from: h */
        final b<R> f42305h;

        /* renamed from: i */
        boolean f42306i;

        public c(AbstractC11197j<? super R> abstractC11197j, a<R> aVar, b<R> bVar) {
            this.f42303f = abstractC11197j;
            this.f42304g = aVar;
            this.f42305h = bVar;
        }

        @Override // p456rx.InterfaceC11193f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(C11186e[] c11186eArr) {
            if (c11186eArr == null || c11186eArr.length == 0) {
                this.f42303f.onCompleted();
            } else {
                this.f42306i = true;
                this.f42304g.m40211a(c11186eArr, this.f42305h);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42306i) {
                return;
            }
            this.f42303f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42303f.onError(th);
        }
    }

    public C11233g1(InterfaceC11209f interfaceC11209f) {
        this.f42292f = C11212i.m40159a(interfaceC11209f);
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super C11186e[]> call(AbstractC11197j<? super R> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42292f);
        b bVar = new b(aVar);
        c cVar = new c(abstractC11197j, aVar, bVar);
        abstractC11197j.add(cVar);
        abstractC11197j.setProducer(bVar);
        return cVar;
    }
}
