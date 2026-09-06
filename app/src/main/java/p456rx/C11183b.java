package p456rx;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.C11206c;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.p461n.p462a.C11222d;
import p456rx.p461n.p462a.C11228f;
import p456rx.p461n.p466e.C11315l;
import p456rx.p461n.p466e.C11316m;
import p456rx.p470p.C11354b;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11377a;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11379c;
import p456rx.p474t.C11380d;
import p456rx.p474t.C11381e;
import p456rx.schedulers.Schedulers;

/* compiled from: Completable.java */
/* renamed from: rx.b */
/* loaded from: classes.dex */
public class C11183b {

    /* renamed from: a */
    static final C11183b f42041a = new C11183b(new f(), false);

    /* renamed from: b */
    static final C11183b f42042b = new C11183b(new m(), false);

    /* renamed from: c */
    private final w f42043c;

    /* compiled from: Completable.java */
    /* renamed from: rx.b$a */
    /* loaded from: classes3.dex */
    static class a implements w {

        /* renamed from: f */
        final /* synthetic */ C11186e f42044f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$a$a, reason: collision with other inner class name */
        class C11543a extends AbstractC11197j<Object> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11184c f42045f;

            C11543a(InterfaceC11184c interfaceC11184c) {
                this.f42045f = interfaceC11184c;
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                this.f42045f.onCompleted();
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                this.f42045f.onError(th);
            }

            @Override // p456rx.InterfaceC11193f
            public void onNext(Object obj) {
            }
        }

        a(C11186e c11186e) {
            this.f42044f = c11186e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11543a c11543a = new C11543a(interfaceC11184c);
            interfaceC11184c.mo29114a(c11543a);
            this.f42044f.m40089c1(c11543a);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$b */
    /* loaded from: classes3.dex */
    static class b implements w {

        /* renamed from: f */
        final /* synthetic */ Single f42047f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$b$a */
        class a extends AbstractC11196i<Object> {

            /* renamed from: g */
            final /* synthetic */ InterfaceC11184c f42048g;

            a(InterfaceC11184c interfaceC11184c) {
                this.f42048g = interfaceC11184c;
            }

            @Override // p456rx.AbstractC11196i
            /* renamed from: c */
            public void mo29130c(Object obj) {
                this.f42048g.onCompleted();
            }

            @Override // p456rx.AbstractC11196i
            public void onError(Throwable th) {
                this.f42048g.onError(th);
            }
        }

        b(Single single) {
            this.f42047f = single;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            a aVar = new a(interfaceC11184c);
            interfaceC11184c.mo29114a(aVar);
            this.f42047f.m39928t(aVar);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$c */
    /* loaded from: classes3.dex */
    class c implements InterfaceC11184c {

        /* renamed from: f */
        final /* synthetic */ CountDownLatch f42050f;

        /* renamed from: g */
        final /* synthetic */ Throwable[] f42051g;

        c(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f42050f = countDownLatch;
            this.f42051g = thArr;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            this.f42050f.countDown();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            this.f42051g[0] = th;
            this.f42050f.countDown();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$d */
    /* loaded from: classes3.dex */
    class d implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h f42053f;

        /* renamed from: g */
        final /* synthetic */ long f42054g;

        /* renamed from: h */
        final /* synthetic */ TimeUnit f42055h;

        /* renamed from: i */
        final /* synthetic */ boolean f42056i;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$d$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ C11378b f42058f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11195h.a f42059g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC11184c f42060h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$a, reason: collision with other inner class name */
            class C11544a implements InterfaceC11204a {
                C11544a() {
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    try {
                        a.this.f42060h.onCompleted();
                    } finally {
                        a.this.f42059g.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$b */
            class b implements InterfaceC11204a {

                /* renamed from: f */
                final /* synthetic */ Throwable f42063f;

                b(Throwable th) {
                    this.f42063f = th;
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    try {
                        a.this.f42060h.onError(this.f42063f);
                    } finally {
                        a.this.f42059g.unsubscribe();
                    }
                }
            }

            a(C11378b c11378b, AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c) {
                this.f42058f = c11378b;
                this.f42059g = aVar;
                this.f42060h = interfaceC11184c;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                this.f42058f.m40667a(interfaceC11198k);
                this.f42060h.mo29114a(this.f42058f);
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                C11378b c11378b = this.f42058f;
                AbstractC11195h.a aVar = this.f42059g;
                C11544a c11544a = new C11544a();
                d dVar = d.this;
                c11378b.m40667a(aVar.mo40147d(c11544a, dVar.f42054g, dVar.f42055h));
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                if (!d.this.f42056i) {
                    this.f42060h.onError(th);
                    return;
                }
                C11378b c11378b = this.f42058f;
                AbstractC11195h.a aVar = this.f42059g;
                b bVar = new b(th);
                d dVar = d.this;
                c11378b.m40667a(aVar.mo40147d(bVar, dVar.f42054g, dVar.f42055h));
            }
        }

        d(AbstractC11195h abstractC11195h, long j2, TimeUnit timeUnit, boolean z) {
            this.f42053f = abstractC11195h;
            this.f42054g = j2;
            this.f42055h = timeUnit;
            this.f42056i = z;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11378b c11378b = new C11378b();
            AbstractC11195h.a createWorker = this.f42053f.createWorker();
            c11378b.m40667a(createWorker);
            C11183b.this.m39971P(new a(c11378b, createWorker, interfaceC11184c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$e */
    /* loaded from: classes3.dex */
    class e implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11204a f42065f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC11204a f42066g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11205b f42067h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11205b f42068i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC11204a f42069j;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$e$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11184c f42071f;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$e$a$a, reason: collision with other inner class name */
            class C11545a implements InterfaceC11204a {

                /* renamed from: f */
                final /* synthetic */ InterfaceC11198k f42073f;

                C11545a(InterfaceC11198k interfaceC11198k) {
                    this.f42073f = interfaceC11198k;
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    try {
                        e.this.f42069j.call();
                    } catch (Throwable th) {
                        C11361c.m40578j(th);
                    }
                    this.f42073f.unsubscribe();
                }
            }

            a(InterfaceC11184c interfaceC11184c) {
                this.f42071f = interfaceC11184c;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                try {
                    e.this.f42068i.call(interfaceC11198k);
                    this.f42071f.mo29114a(C11381e.m40674a(new C11545a(interfaceC11198k)));
                } catch (Throwable th) {
                    interfaceC11198k.unsubscribe();
                    this.f42071f.mo29114a(C11381e.m40676c());
                    this.f42071f.onError(th);
                }
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                try {
                    e.this.f42065f.call();
                    this.f42071f.onCompleted();
                    try {
                        e.this.f42066g.call();
                    } catch (Throwable th) {
                        C11361c.m40578j(th);
                    }
                } catch (Throwable th2) {
                    this.f42071f.onError(th2);
                }
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                try {
                    e.this.f42067h.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                this.f42071f.onError(th);
                try {
                    e.this.f42066g.call();
                } catch (Throwable th3) {
                    C11361c.m40578j(th3);
                }
            }
        }

        e(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2, InterfaceC11205b interfaceC11205b, InterfaceC11205b interfaceC11205b2, InterfaceC11204a interfaceC11204a3) {
            this.f42065f = interfaceC11204a;
            this.f42066g = interfaceC11204a2;
            this.f42067h = interfaceC11205b;
            this.f42068i = interfaceC11205b2;
            this.f42069j = interfaceC11204a3;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11183b.this.m39971P(new a(interfaceC11184c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$f */
    /* loaded from: classes3.dex */
    static class f implements w {
        f() {
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            interfaceC11184c.mo29114a(C11381e.m40676c());
            interfaceC11184c.onCompleted();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$g */
    /* loaded from: classes3.dex */
    class g implements InterfaceC11205b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11204a f42075f;

        g(InterfaceC11204a interfaceC11204a) {
            this.f42075f = interfaceC11204a;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f42075f.call();
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$h */
    /* loaded from: classes3.dex */
    class h implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h f42077f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$h$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ AbstractC11195h.a f42079f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC11184c f42080g;

            /* renamed from: h */
            final /* synthetic */ C11315l f42081h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$a, reason: collision with other inner class name */
            class C11546a implements InterfaceC11204a {
                C11546a() {
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    try {
                        a.this.f42080g.onCompleted();
                    } finally {
                        a.this.f42081h.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$b */
            class b implements InterfaceC11204a {

                /* renamed from: f */
                final /* synthetic */ Throwable f42084f;

                b(Throwable th) {
                    this.f42084f = th;
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    try {
                        a.this.f42080g.onError(this.f42084f);
                    } finally {
                        a.this.f42081h.unsubscribe();
                    }
                }
            }

            a(AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c, C11315l c11315l) {
                this.f42079f = aVar;
                this.f42080g = interfaceC11184c;
                this.f42081h = c11315l;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                this.f42081h.m40464a(interfaceC11198k);
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                this.f42079f.mo40146c(new C11546a());
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                this.f42079f.mo40146c(new b(th));
            }
        }

        h(AbstractC11195h abstractC11195h) {
            this.f42077f = abstractC11195h;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11315l c11315l = new C11315l();
            AbstractC11195h.a createWorker = this.f42077f.createWorker();
            c11315l.m40464a(createWorker);
            interfaceC11184c.mo29114a(c11315l);
            C11183b.this.m39971P(new a(createWorker, interfaceC11184c, c11315l));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$i */
    /* loaded from: classes3.dex */
    class i implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42086f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$i$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11184c f42088f;

            a(InterfaceC11184c interfaceC11184c) {
                this.f42088f = interfaceC11184c;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                this.f42088f.mo29114a(interfaceC11198k);
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                this.f42088f.onCompleted();
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                boolean z = false;
                try {
                    z = ((Boolean) i.this.f42086f.call(th)).booleanValue();
                } catch (Throwable th2) {
                    C11192a.m40140e(th2);
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                if (z) {
                    this.f42088f.onCompleted();
                } else {
                    this.f42088f.onError(th);
                }
            }
        }

        i(InterfaceC11208e interfaceC11208e) {
            this.f42086f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11183b.this.m39971P(new a(interfaceC11184c));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$j */
    /* loaded from: classes3.dex */
    class j implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42090f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$j$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11184c f42092f;

            /* renamed from: g */
            final /* synthetic */ C11380d f42093g;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$j$a$a, reason: collision with other inner class name */
            class C11547a implements InterfaceC11184c {
                C11547a() {
                }

                @Override // p456rx.InterfaceC11184c
                /* renamed from: a */
                public void mo29114a(InterfaceC11198k interfaceC11198k) {
                    a.this.f42093g.m40673b(interfaceC11198k);
                }

                @Override // p456rx.InterfaceC11184c
                public void onCompleted() {
                    a.this.f42092f.onCompleted();
                }

                @Override // p456rx.InterfaceC11184c
                public void onError(Throwable th) {
                    a.this.f42092f.onError(th);
                }
            }

            a(InterfaceC11184c interfaceC11184c, C11380d c11380d) {
                this.f42092f = interfaceC11184c;
                this.f42093g = c11380d;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                this.f42093g.m40673b(interfaceC11198k);
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                this.f42092f.onCompleted();
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                try {
                    C11183b c11183b = (C11183b) j.this.f42090f.call(th);
                    if (c11183b == null) {
                        this.f42092f.onError(new CompositeException(Arrays.asList(th, new NullPointerException("The completable returned is null"))));
                    } else {
                        c11183b.m39971P(new C11547a());
                    }
                } catch (Throwable th2) {
                    this.f42092f.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            }
        }

        j(InterfaceC11208e interfaceC11208e) {
            this.f42090f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11380d c11380d = new C11380d();
            interfaceC11184c.mo29114a(c11380d);
            C11183b.this.m39971P(new a(interfaceC11184c, c11380d));
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$k */
    /* loaded from: classes3.dex */
    class k implements InterfaceC11184c {

        /* renamed from: f */
        final /* synthetic */ C11379c f42096f;

        k(C11379c c11379c) {
            this.f42096f = c11379c;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f42096f.m40671a(interfaceC11198k);
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            this.f42096f.unsubscribe();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            C11361c.m40578j(th);
            this.f42096f.unsubscribe();
            C11183b.m39950l(th);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$l */
    /* loaded from: classes3.dex */
    class l implements InterfaceC11184c {

        /* renamed from: f */
        boolean f42098f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC11204a f42099g;

        /* renamed from: h */
        final /* synthetic */ C11379c f42100h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11205b f42101i;

        l(InterfaceC11204a interfaceC11204a, C11379c c11379c, InterfaceC11205b interfaceC11205b) {
            this.f42099g = interfaceC11204a;
            this.f42100h = c11379c;
            this.f42101i = interfaceC11205b;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f42100h.m40671a(interfaceC11198k);
        }

        /* renamed from: b */
        void m39996b(Throwable th) {
            try {
                this.f42101i.call(th);
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            if (this.f42098f) {
                return;
            }
            this.f42098f = true;
            try {
                this.f42099g.call();
                this.f42100h.unsubscribe();
            } catch (Throwable th) {
                m39996b(th);
            }
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            if (this.f42098f) {
                C11361c.m40578j(th);
                C11183b.m39950l(th);
            } else {
                this.f42098f = true;
                m39996b(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$m */
    /* loaded from: classes3.dex */
    static class m implements w {
        m() {
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            interfaceC11184c.mo29114a(C11381e.m40676c());
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$n */
    /* loaded from: classes3.dex */
    class n implements InterfaceC11184c {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42103f;

        n(AbstractC11197j abstractC11197j) {
            this.f42103f = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f42103f.add(interfaceC11198k);
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            this.f42103f.onCompleted();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            this.f42103f.onError(th);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$o */
    /* loaded from: classes3.dex */
    class o implements w {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h f42105f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$o$a */
        class a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11184c f42107f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11195h.a f42108g;

            a(InterfaceC11184c interfaceC11184c, AbstractC11195h.a aVar) {
                this.f42107f = interfaceC11184c;
                this.f42108g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                try {
                    C11183b.this.m39971P(this.f42107f);
                } finally {
                    this.f42108g.unsubscribe();
                }
            }
        }

        o(AbstractC11195h abstractC11195h) {
            this.f42105f = abstractC11195h;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            AbstractC11195h.a createWorker = this.f42105f.createWorker();
            createWorker.mo40146c(new a(interfaceC11184c, createWorker));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$p */
    /* loaded from: classes3.dex */
    class p<T> implements C11186e.a<T> {
        p() {
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super T> abstractC11197j) {
            C11183b.this.m39972Q(abstractC11197j);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$q */
    /* loaded from: classes3.dex */
    class q<T> implements Single.InterfaceC11181j<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceCallableC11207d f42111f;

        /* compiled from: Completable.java */
        /* renamed from: rx.b$q$a */
        class a implements InterfaceC11184c {

            /* renamed from: f */
            final /* synthetic */ AbstractC11196i f42113f;

            a(AbstractC11196i abstractC11196i) {
                this.f42113f = abstractC11196i;
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                this.f42113f.m40149b(interfaceC11198k);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                try {
                    Object call = q.this.f42111f.call();
                    if (call == null) {
                        this.f42113f.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f42113f.mo29130c(call);
                    }
                } catch (Throwable th) {
                    this.f42113f.onError(th);
                }
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                this.f42113f.onError(th);
            }
        }

        q(InterfaceCallableC11207d interfaceCallableC11207d) {
            this.f42111f = interfaceCallableC11207d;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            C11183b.this.m39971P(new a(abstractC11196i));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* renamed from: rx.b$r */
    /* loaded from: classes3.dex */
    class r<T> implements InterfaceCallableC11207d<T> {

        /* renamed from: f */
        final /* synthetic */ Object f42115f;

        r(Object obj) {
            this.f42115f = obj;
        }

        @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
        public T call() {
            return (T) this.f42115f;
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$s */
    /* loaded from: classes3.dex */
    static class s implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceCallableC11207d f42117f;

        s(InterfaceCallableC11207d interfaceCallableC11207d) {
            this.f42117f = interfaceCallableC11207d;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            try {
                C11183b c11183b = (C11183b) this.f42117f.call();
                if (c11183b != null) {
                    c11183b.m39971P(interfaceC11184c);
                } else {
                    interfaceC11184c.mo29114a(C11381e.m40676c());
                    interfaceC11184c.onError(new NullPointerException("The completable returned is null"));
                }
            } catch (Throwable th) {
                interfaceC11184c.mo29114a(C11381e.m40676c());
                interfaceC11184c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$t */
    /* loaded from: classes3.dex */
    static class t implements w {

        /* renamed from: f */
        final /* synthetic */ Throwable f42118f;

        t(Throwable th) {
            this.f42118f = th;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            interfaceC11184c.mo29114a(C11381e.m40676c());
            interfaceC11184c.onError(this.f42118f);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$u */
    /* loaded from: classes3.dex */
    static class u implements w {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11204a f42119f;

        u(InterfaceC11204a interfaceC11204a) {
            this.f42119f = interfaceC11204a;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11377a c11377a = new C11377a();
            interfaceC11184c.mo29114a(c11377a);
            try {
                this.f42119f.call();
                if (c11377a.isUnsubscribed()) {
                    return;
                }
                interfaceC11184c.onCompleted();
            } catch (Throwable th) {
                if (c11377a.isUnsubscribed()) {
                    return;
                }
                interfaceC11184c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$v */
    /* loaded from: classes3.dex */
    static class v implements w {

        /* renamed from: f */
        final /* synthetic */ Callable f42120f;

        v(Callable callable) {
            this.f42120f = callable;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11184c interfaceC11184c) {
            C11377a c11377a = new C11377a();
            interfaceC11184c.mo29114a(c11377a);
            try {
                this.f42120f.call();
                if (c11377a.isUnsubscribed()) {
                    return;
                }
                interfaceC11184c.onCompleted();
            } catch (Throwable th) {
                if (c11377a.isUnsubscribed()) {
                    return;
                }
                interfaceC11184c.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$w */
    /* loaded from: classes3.dex */
    public interface w extends InterfaceC11205b<InterfaceC11184c> {
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$x */
    /* loaded from: classes3.dex */
    public interface x extends InterfaceC11208e<InterfaceC11184c, InterfaceC11184c> {
    }

    protected C11183b(w wVar) {
        this.f42043c = C11361c.m40575g(wVar);
    }

    /* renamed from: D */
    static <T> T m39943D(T t2) {
        t2.getClass();
        return t2;
    }

    /* renamed from: L */
    static NullPointerException m39944L(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: R */
    private <T> void m39945R(AbstractC11197j<T> abstractC11197j, boolean z) {
        m39943D(abstractC11197j);
        if (z) {
            try {
                abstractC11197j.onStart();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                C11192a.m40140e(th);
                Throwable m40581m = C11361c.m40581m(th);
                C11361c.m40578j(m40581m);
                throw m39944L(m40581m);
            }
        }
        m39971P(new n(abstractC11197j));
        C11361c.m40583o(abstractC11197j);
    }

    /* renamed from: e */
    public static C11183b m39946e() {
        C11183b c11183b = f42041a;
        w m40575g = C11361c.m40575g(c11183b.f42043c);
        return m40575g == c11183b.f42043c ? c11183b : new C11183b(m40575g, false);
    }

    /* renamed from: f */
    public static C11183b m39947f(C11183b... c11183bArr) {
        m39943D(c11183bArr);
        return c11183bArr.length == 0 ? m39946e() : c11183bArr.length == 1 ? c11183bArr[0] : m39948h(new C11222d(c11183bArr));
    }

    /* renamed from: h */
    public static C11183b m39948h(w wVar) {
        m39943D(wVar);
        try {
            return new C11183b(wVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C11361c.m40578j(th);
            throw m39944L(th);
        }
    }

    /* renamed from: i */
    public static C11183b m39949i(InterfaceCallableC11207d<? extends C11183b> interfaceCallableC11207d) {
        m39943D(interfaceCallableC11207d);
        return m39948h(new s(interfaceCallableC11207d));
    }

    /* renamed from: l */
    static void m39950l(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: s */
    public static C11183b m39951s(Throwable th) {
        m39943D(th);
        return m39948h(new t(th));
    }

    /* renamed from: t */
    public static C11183b m39952t(InterfaceC11204a interfaceC11204a) {
        m39943D(interfaceC11204a);
        return m39948h(new u(interfaceC11204a));
    }

    /* renamed from: u */
    public static C11183b m39953u(Callable<?> callable) {
        m39943D(callable);
        return m39948h(new v(callable));
    }

    /* renamed from: v */
    public static C11183b m39954v(C11186e<?> c11186e) {
        m39943D(c11186e);
        return m39948h(new a(c11186e));
    }

    /* renamed from: w */
    public static C11183b m39955w(Single<?> single) {
        m39943D(single);
        return m39948h(new b(single));
    }

    /* renamed from: x */
    public static C11183b m39956x(C11183b... c11183bArr) {
        m39943D(c11183bArr);
        return m39948h(new C11228f(c11183bArr));
    }

    /* renamed from: y */
    public static C11183b m39957y() {
        C11183b c11183b = f42042b;
        w m40575g = C11361c.m40575g(c11183b.f42043c);
        return m40575g == c11183b.f42043c ? c11183b : new C11183b(m40575g, false);
    }

    /* renamed from: A */
    public final C11183b m39958A() {
        return m39959B(C11316m.m40466a());
    }

    /* renamed from: B */
    public final C11183b m39959B(InterfaceC11208e<? super Throwable, Boolean> interfaceC11208e) {
        m39943D(interfaceC11208e);
        return m39948h(new i(interfaceC11208e));
    }

    /* renamed from: C */
    public final C11183b m39960C(InterfaceC11208e<? super Throwable, ? extends C11183b> interfaceC11208e) {
        m39943D(interfaceC11208e);
        return m39948h(new j(interfaceC11208e));
    }

    /* renamed from: E */
    public final C11183b m39961E() {
        return m39954v(m39968M().m40110s0());
    }

    /* renamed from: F */
    public final C11183b m39962F(InterfaceC11208e<? super C11186e<? extends Throwable>, ? extends C11186e<?>> interfaceC11208e) {
        return m39954v(m39968M().m40112t0(interfaceC11208e));
    }

    /* renamed from: G */
    public final C11183b m39963G(C11183b c11183b) {
        m39943D(c11183b);
        return m39947f(c11183b, this);
    }

    /* renamed from: H */
    public final InterfaceC11198k m39964H() {
        C11379c c11379c = new C11379c();
        m39971P(new k(c11379c));
        return c11379c;
    }

    /* renamed from: I */
    public final InterfaceC11198k m39965I(InterfaceC11204a interfaceC11204a, InterfaceC11205b<? super Throwable> interfaceC11205b) {
        m39943D(interfaceC11204a);
        m39943D(interfaceC11205b);
        C11379c c11379c = new C11379c();
        m39971P(new l(interfaceC11204a, c11379c, interfaceC11205b));
        return c11379c;
    }

    /* renamed from: J */
    public final void m39966J(InterfaceC11184c interfaceC11184c) {
        if (!(interfaceC11184c instanceof C11354b)) {
            interfaceC11184c = new C11354b(interfaceC11184c);
        }
        m39971P(interfaceC11184c);
    }

    /* renamed from: K */
    public final C11183b m39967K(AbstractC11195h abstractC11195h) {
        m39943D(abstractC11195h);
        return m39948h(new o(abstractC11195h));
    }

    /* renamed from: M */
    public final <T> C11186e<T> m39968M() {
        return C11186e.m40035b1(new p());
    }

    /* renamed from: N */
    public final <T> Single<T> m39969N(InterfaceCallableC11207d<? extends T> interfaceCallableC11207d) {
        m39943D(interfaceCallableC11207d);
        return Single.m39909b(new q(interfaceCallableC11207d));
    }

    /* renamed from: O */
    public final <T> Single<T> m39970O(T t2) {
        m39943D(t2);
        return m39969N(new r(t2));
    }

    /* renamed from: P */
    public final void m39971P(InterfaceC11184c interfaceC11184c) {
        m39943D(interfaceC11184c);
        try {
            C11361c.m40573e(this, this.f42043c).call(interfaceC11184c);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C11192a.m40140e(th);
            Throwable m40572d = C11361c.m40572d(th);
            C11361c.m40578j(m40572d);
            throw m39944L(m40572d);
        }
    }

    /* renamed from: Q */
    public final <T> void m39972Q(AbstractC11197j<T> abstractC11197j) {
        m39945R(abstractC11197j, true);
    }

    /* renamed from: a */
    public final C11183b m39973a(C11183b c11183b) {
        return m39977g(c11183b);
    }

    /* renamed from: b */
    public final <T> C11186e<T> m39974b(C11186e<T> c11186e) {
        m39943D(c11186e);
        return c11186e.m40109s(m39968M());
    }

    /* renamed from: c */
    public final <T> Single<T> m39975c(Single<T> single) {
        m39943D(single);
        return single.m39916d(m39968M());
    }

    /* renamed from: d */
    public final void m39976d() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        m39971P(new c(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                C11192a.m40138c(thArr[0]);
            }
        } else {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    C11192a.m40138c(thArr[0]);
                }
            } catch (InterruptedException e2) {
                throw C11192a.m40138c(e2);
            }
        }
    }

    /* renamed from: g */
    public final C11183b m39977g(C11183b c11183b) {
        m39943D(c11183b);
        return m39947f(this, c11183b);
    }

    /* renamed from: j */
    public final C11183b m39978j(long j2, TimeUnit timeUnit) {
        return m39979k(j2, timeUnit, Schedulers.computation(), false);
    }

    /* renamed from: k */
    public final C11183b m39979k(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h, boolean z) {
        m39943D(timeUnit);
        m39943D(abstractC11195h);
        return m39948h(new d(abstractC11195h, j2, timeUnit, z));
    }

    /* renamed from: m */
    public final C11183b m39980m(InterfaceC11204a interfaceC11204a) {
        return m39982o(C11206c.m40157a(), C11206c.m40157a(), interfaceC11204a, C11206c.m40157a(), C11206c.m40157a());
    }

    /* renamed from: n */
    public final C11183b m39981n(InterfaceC11205b<? super Throwable> interfaceC11205b) {
        return m39982o(C11206c.m40157a(), interfaceC11205b, C11206c.m40157a(), C11206c.m40157a(), C11206c.m40157a());
    }

    /* renamed from: o */
    protected final C11183b m39982o(InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b, InterfaceC11205b<? super Throwable> interfaceC11205b2, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2, InterfaceC11204a interfaceC11204a3) {
        m39943D(interfaceC11205b);
        m39943D(interfaceC11205b2);
        m39943D(interfaceC11204a);
        m39943D(interfaceC11204a2);
        m39943D(interfaceC11204a3);
        return m39948h(new e(interfaceC11204a, interfaceC11204a2, interfaceC11205b2, interfaceC11205b, interfaceC11204a3));
    }

    /* renamed from: p */
    public final C11183b m39983p(InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b) {
        return m39982o(interfaceC11205b, C11206c.m40157a(), C11206c.m40157a(), C11206c.m40157a(), C11206c.m40157a());
    }

    /* renamed from: q */
    public final C11183b m39984q(InterfaceC11204a interfaceC11204a) {
        return m39982o(C11206c.m40157a(), new g(interfaceC11204a), interfaceC11204a, C11206c.m40157a(), C11206c.m40157a());
    }

    /* renamed from: r */
    public final C11183b m39985r(InterfaceC11204a interfaceC11204a) {
        return m39982o(C11206c.m40157a(), C11206c.m40157a(), C11206c.m40157a(), C11206c.m40157a(), interfaceC11204a);
    }

    /* renamed from: z */
    public final C11183b m39986z(AbstractC11195h abstractC11195h) {
        m39943D(abstractC11195h);
        return m39948h(new h(abstractC11195h));
    }

    protected C11183b(w wVar, boolean z) {
        this.f42043c = z ? C11361c.m40575g(wVar) : wVar;
    }
}
