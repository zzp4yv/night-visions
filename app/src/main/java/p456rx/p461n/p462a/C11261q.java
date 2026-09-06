package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11196i;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p466e.EnumC11308e;
import p456rx.p461n.p466e.p467n.C11320d;
import p456rx.p461n.p466e.p468o.C11333i;
import p456rx.p461n.p466e.p468o.C11350z;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11378b;

/* compiled from: OnSubscribeFlatMapSingle.java */
/* renamed from: rx.n.a.q */
/* loaded from: classes3.dex */
public final class C11261q<T, R> implements C11186e.a<R> {

    /* renamed from: f */
    final C11186e<T> f42490f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, ? extends Single<? extends R>> f42491g;

    /* renamed from: h */
    final boolean f42492h;

    /* renamed from: i */
    final int f42493i;

    /* compiled from: OnSubscribeFlatMapSingle.java */
    /* renamed from: rx.n.a.q$a */
    static final class a<T, R> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super R> f42494f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, ? extends Single<? extends R>> f42495g;

        /* renamed from: h */
        final boolean f42496h;

        /* renamed from: i */
        final int f42497i;

        /* renamed from: n */
        final Queue<Object> f42502n;

        /* renamed from: p */
        volatile boolean f42504p;

        /* renamed from: q */
        volatile boolean f42505q;

        /* renamed from: j */
        final AtomicInteger f42498j = new AtomicInteger();

        /* renamed from: m */
        final AtomicReference<Throwable> f42501m = new AtomicReference<>();

        /* renamed from: o */
        final a<T, R>.b f42503o = new b();

        /* renamed from: l */
        final C11378b f42500l = new C11378b();

        /* renamed from: k */
        final AtomicInteger f42499k = new AtomicInteger();

        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* renamed from: rx.n.a.q$a$a, reason: collision with other inner class name */
        final class C11553a extends AbstractC11196i<R> {
            C11553a() {
            }

            @Override // p456rx.AbstractC11196i
            /* renamed from: c */
            public void mo29130c(R r) {
                a.this.m40278e(this, r);
            }

            @Override // p456rx.AbstractC11196i
            public void onError(Throwable th) {
                a.this.m40277d(this, th);
            }
        }

        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* renamed from: rx.n.a.q$a$b */
        final class b extends AtomicLong implements InterfaceC11194g, InterfaceC11198k {
            b() {
            }

            /* renamed from: a */
            void m40279a(long j2) {
                C11213a.m40163c(this, j2);
            }

            @Override // p456rx.InterfaceC11198k
            public boolean isUnsubscribed() {
                return a.this.f42505q;
            }

            @Override // p456rx.InterfaceC11194g
            public void request(long j2) {
                if (j2 > 0) {
                    C11213a.m40162b(this, j2);
                    a.this.m40276c();
                }
            }

            @Override // p456rx.InterfaceC11198k
            public void unsubscribe() {
                a.this.f42505q = true;
                a.this.unsubscribe();
                if (a.this.f42498j.getAndIncrement() == 0) {
                    a.this.f42502n.clear();
                }
            }
        }

        a(AbstractC11197j<? super R> abstractC11197j, InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e, boolean z, int i2) {
            this.f42494f = abstractC11197j;
            this.f42495g = interfaceC11208e;
            this.f42496h = z;
            this.f42497i = i2;
            if (C11350z.m40548b()) {
                this.f42502n = new C11333i();
            } else {
                this.f42502n = new C11320d();
            }
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        /* renamed from: c */
        void m40276c() {
            if (this.f42498j.getAndIncrement() != 0) {
                return;
            }
            AbstractC11197j<? super R> abstractC11197j = this.f42494f;
            Queue<Object> queue = this.f42502n;
            boolean z = this.f42496h;
            AtomicInteger atomicInteger = this.f42499k;
            int i2 = 1;
            do {
                long j2 = this.f42503o.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f42505q) {
                        queue.clear();
                        return;
                    }
                    boolean z2 = this.f42504p;
                    if (!z && z2 && this.f42501m.get() != null) {
                        queue.clear();
                        abstractC11197j.onError(EnumC11308e.m40423q(this.f42501m));
                        return;
                    }
                    Object poll = queue.poll();
                    boolean z3 = poll == null;
                    if (z2 && atomicInteger.get() == 0 && z3) {
                        if (this.f42501m.get() != null) {
                            abstractC11197j.onError(EnumC11308e.m40423q(this.f42501m));
                            return;
                        } else {
                            abstractC11197j.onCompleted();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    abstractC11197j.onNext((Object) C11234h.m40219e(poll));
                    j3++;
                }
                if (j3 == j2) {
                    if (this.f42505q) {
                        queue.clear();
                        return;
                    }
                    if (this.f42504p) {
                        if (z) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.f42501m.get() != null) {
                                    abstractC11197j.onError(EnumC11308e.m40423q(this.f42501m));
                                    return;
                                } else {
                                    abstractC11197j.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.f42501m.get() != null) {
                            queue.clear();
                            abstractC11197j.onError(EnumC11308e.m40423q(this.f42501m));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            abstractC11197j.onCompleted();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    this.f42503o.m40279a(j3);
                    if (!this.f42504p && this.f42497i != Integer.MAX_VALUE) {
                        request(j3);
                    }
                }
                i2 = this.f42498j.addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: d */
        void m40277d(a<T, R>.C11553a c11553a, Throwable th) {
            if (this.f42496h) {
                EnumC11308e.m40421g(this.f42501m, th);
                this.f42500l.m40670d(c11553a);
                if (!this.f42504p && this.f42497i != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.f42500l.unsubscribe();
                unsubscribe();
                if (!this.f42501m.compareAndSet(null, th)) {
                    C11361c.m40578j(th);
                    return;
                }
                this.f42504p = true;
            }
            this.f42499k.decrementAndGet();
            m40276c();
        }

        /* renamed from: e */
        void m40278e(a<T, R>.C11553a c11553a, R r) {
            this.f42502n.offer(C11234h.m40221g(r));
            this.f42500l.m40670d(c11553a);
            this.f42499k.decrementAndGet();
            m40276c();
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42504p = true;
            m40276c();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42496h) {
                EnumC11308e.m40421g(this.f42501m, th);
            } else {
                this.f42500l.unsubscribe();
                if (!this.f42501m.compareAndSet(null, th)) {
                    C11361c.m40578j(th);
                    return;
                }
            }
            this.f42504p = true;
            m40276c();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                Single<? extends R> call = this.f42495g.call(t);
                if (call == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                C11553a c11553a = new C11553a();
                this.f42500l.m40667a(c11553a);
                this.f42499k.incrementAndGet();
                call.m39928t(c11553a);
            } catch (Throwable th) {
                C11192a.m40140e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public C11261q(C11186e<T> c11186e, InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e, boolean z, int i2) {
        if (interfaceC11208e == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
        }
        this.f42490f = c11186e;
        this.f42491g = interfaceC11208e;
        this.f42492h = z;
        this.f42493i = i2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super R> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42491g, this.f42492h, this.f42493i);
        abstractC11197j.add(aVar.f42500l);
        abstractC11197j.add(aVar.f42503o);
        abstractC11197j.setProducer(aVar.f42503o);
        this.f42490f.m40089c1(aVar);
    }
}
