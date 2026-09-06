package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11185d;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p463b.C11285a;
import p456rx.p470p.C11358f;
import p456rx.p473s.AbstractC11372d;
import p456rx.p473s.C11369a;
import p456rx.p473s.C11371c;
import p456rx.p474t.C11380d;
import p456rx.schedulers.Schedulers;

/* compiled from: OnSubscribeRedo.java */
/* renamed from: rx.n.a.y */
/* loaded from: classes3.dex */
public final class C11281y<T> implements C11186e.a<T> {

    /* renamed from: f */
    static final InterfaceC11208e<C11186e<? extends C11185d<?>>, C11186e<?>> f42665f = new a();

    /* renamed from: g */
    final C11186e<T> f42666g;

    /* renamed from: h */
    private final InterfaceC11208e<? super C11186e<? extends C11185d<?>>, ? extends C11186e<?>> f42667h;

    /* renamed from: i */
    final boolean f42668i;

    /* renamed from: j */
    final boolean f42669j;

    /* renamed from: k */
    private final AbstractC11195h f42670k;

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$a */
    static class a implements InterfaceC11208e<C11186e<? extends C11185d<?>>, C11186e<?>> {

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$a$a, reason: collision with other inner class name */
        class C11557a implements InterfaceC11208e<C11185d<?>, C11185d<?>> {
            C11557a() {
            }

            @Override // p456rx.p460m.InterfaceC11208e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C11185d<?> call(C11185d<?> c11185d) {
                return C11185d.m40007c(null);
            }
        }

        a() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<?> call(C11186e<? extends C11185d<?>> c11186e) {
            return c11186e.m40082X(new C11557a());
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$b */
    class b implements InterfaceC11204a {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42672f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11372d f42673g;

        /* renamed from: h */
        final /* synthetic */ C11285a f42674h;

        /* renamed from: i */
        final /* synthetic */ AtomicLong f42675i;

        /* renamed from: j */
        final /* synthetic */ C11380d f42676j;

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$b$a */
        class a extends AbstractC11197j<T> {

            /* renamed from: f */
            boolean f42678f;

            a() {
            }

            /* renamed from: c */
            private void m40359c() {
                long j2;
                do {
                    j2 = b.this.f42675i.get();
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!b.this.f42675i.compareAndSet(j2, j2 - 1));
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                if (this.f42678f) {
                    return;
                }
                this.f42678f = true;
                unsubscribe();
                b.this.f42673g.onNext(C11185d.m40005a());
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                if (this.f42678f) {
                    return;
                }
                this.f42678f = true;
                unsubscribe();
                b.this.f42673g.onNext(C11185d.m40006b(th));
            }

            @Override // p456rx.InterfaceC11193f
            public void onNext(T t) {
                if (this.f42678f) {
                    return;
                }
                b.this.f42672f.onNext(t);
                m40359c();
                b.this.f42674h.m40374b(1L);
            }

            @Override // p456rx.AbstractC11197j
            public void setProducer(InterfaceC11194g interfaceC11194g) {
                b.this.f42674h.m40375c(interfaceC11194g);
            }
        }

        b(AbstractC11197j abstractC11197j, AbstractC11372d abstractC11372d, C11285a c11285a, AtomicLong atomicLong, C11380d c11380d) {
            this.f42672f = abstractC11197j;
            this.f42673g = abstractC11372d;
            this.f42674h = c11285a;
            this.f42675i = atomicLong;
            this.f42676j = c11380d;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            if (this.f42672f.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f42676j.m40673b(aVar);
            C11281y.this.f42666g.m40089c1(aVar);
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$c */
    class c implements C11186e.b<C11185d<?>, C11185d<?>> {

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$c$a */
        class a extends AbstractC11197j<C11185d<?>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC11197j f42681f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC11197j abstractC11197j, AbstractC11197j abstractC11197j2) {
                super(abstractC11197j);
                this.f42681f = abstractC11197j2;
            }

            @Override // p456rx.InterfaceC11193f
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(C11185d<?> c11185d) {
                if (c11185d.m40013i() && C11281y.this.f42668i) {
                    this.f42681f.onCompleted();
                } else if (c11185d.m40014j() && C11281y.this.f42669j) {
                    this.f42681f.onError(c11185d.m40009e());
                } else {
                    this.f42681f.onNext(c11185d);
                }
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                this.f42681f.onCompleted();
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                this.f42681f.onError(th);
            }

            @Override // p456rx.AbstractC11197j
            public void setProducer(InterfaceC11194g interfaceC11194g) {
                interfaceC11194g.request(Long.MAX_VALUE);
            }
        }

        c() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC11197j<? super C11185d<?>> call(AbstractC11197j<? super C11185d<?>> abstractC11197j) {
            return new a(abstractC11197j, abstractC11197j);
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$d */
    class d implements InterfaceC11204a {

        /* renamed from: f */
        final /* synthetic */ C11186e f42683f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11197j f42684g;

        /* renamed from: h */
        final /* synthetic */ AtomicLong f42685h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11195h.a f42686i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11204a f42687j;

        /* renamed from: k */
        final /* synthetic */ AtomicBoolean f42688k;

        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$d$a */
        class a extends AbstractC11197j<Object> {
            a(AbstractC11197j abstractC11197j) {
                super(abstractC11197j);
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                d.this.f42684g.onCompleted();
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                d.this.f42684g.onError(th);
            }

            @Override // p456rx.InterfaceC11193f
            public void onNext(Object obj) {
                if (d.this.f42684g.isUnsubscribed()) {
                    return;
                }
                if (d.this.f42685h.get() <= 0) {
                    d.this.f42688k.compareAndSet(false, true);
                } else {
                    d dVar = d.this;
                    dVar.f42686i.mo40146c(dVar.f42687j);
                }
            }

            @Override // p456rx.AbstractC11197j
            public void setProducer(InterfaceC11194g interfaceC11194g) {
                interfaceC11194g.request(Long.MAX_VALUE);
            }
        }

        d(C11186e c11186e, AbstractC11197j abstractC11197j, AtomicLong atomicLong, AbstractC11195h.a aVar, InterfaceC11204a interfaceC11204a, AtomicBoolean atomicBoolean) {
            this.f42683f = c11186e;
            this.f42684g = abstractC11197j;
            this.f42685h = atomicLong;
            this.f42686i = aVar;
            this.f42687j = interfaceC11204a;
            this.f42688k = atomicBoolean;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            this.f42683f.m40089c1(new a(this.f42684g));
        }
    }

    /* compiled from: OnSubscribeRedo.java */
    /* renamed from: rx.n.a.y$e */
    class e implements InterfaceC11194g {

        /* renamed from: f */
        final /* synthetic */ AtomicLong f42691f;

        /* renamed from: g */
        final /* synthetic */ C11285a f42692g;

        /* renamed from: h */
        final /* synthetic */ AtomicBoolean f42693h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11195h.a f42694i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11204a f42695j;

        e(AtomicLong atomicLong, C11285a c11285a, AtomicBoolean atomicBoolean, AbstractC11195h.a aVar, InterfaceC11204a interfaceC11204a) {
            this.f42691f = atomicLong;
            this.f42692g = c11285a;
            this.f42693h = atomicBoolean;
            this.f42694i = aVar;
            this.f42695j = interfaceC11204a;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (j2 > 0) {
                C11213a.m40162b(this.f42691f, j2);
                this.f42692g.request(j2);
                if (this.f42693h.compareAndSet(true, false)) {
                    this.f42694i.mo40146c(this.f42695j);
                }
            }
        }
    }

    private C11281y(C11186e<T> c11186e, InterfaceC11208e<? super C11186e<? extends C11185d<?>>, ? extends C11186e<?>> interfaceC11208e, boolean z, boolean z2, AbstractC11195h abstractC11195h) {
        this.f42666g = c11186e;
        this.f42667h = interfaceC11208e;
        this.f42668i = z;
        this.f42669j = z2;
        this.f42670k = abstractC11195h;
    }

    /* renamed from: b */
    public static <T> C11186e<T> m40354b(C11186e<T> c11186e) {
        return m40355c(c11186e, f42665f);
    }

    /* renamed from: c */
    public static <T> C11186e<T> m40355c(C11186e<T> c11186e, InterfaceC11208e<? super C11186e<? extends C11185d<?>>, ? extends C11186e<?>> interfaceC11208e) {
        return C11186e.m40035b1(new C11281y(c11186e, interfaceC11208e, true, false, Schedulers.trampoline()));
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        AbstractC11195h.a createWorker = this.f42670k.createWorker();
        abstractC11197j.add(createWorker);
        C11380d c11380d = new C11380d();
        abstractC11197j.add(c11380d);
        C11371c<T, T> m40642f1 = C11369a.m40634g1().m40642f1();
        m40642f1.m40058E0(C11358f.m40559a());
        C11285a c11285a = new C11285a();
        b bVar = new b(abstractC11197j, m40642f1, c11285a, atomicLong, c11380d);
        createWorker.mo40146c(new d(this.f42667h.call(m40642f1.m40080W(new c())), abstractC11197j, atomicLong, createWorker, bVar, atomicBoolean));
        abstractC11197j.setProducer(new e(atomicLong, c11285a, atomicBoolean, createWorker, bVar));
    }
}
