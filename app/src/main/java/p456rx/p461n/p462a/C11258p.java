package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11197j;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p466e.EnumC11308e;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11378b;

/* compiled from: OnSubscribeFlatMapCompletable.java */
/* renamed from: rx.n.a.p */
/* loaded from: classes3.dex */
public final class C11258p<T> implements C11186e.a<T> {

    /* renamed from: f */
    final C11186e<T> f42455f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, ? extends C11183b> f42456g;

    /* renamed from: h */
    final boolean f42457h;

    /* renamed from: i */
    final int f42458i;

    /* compiled from: OnSubscribeFlatMapCompletable.java */
    /* renamed from: rx.n.a.p$a */
    static final class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42459f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, ? extends C11183b> f42460g;

        /* renamed from: h */
        final boolean f42461h;

        /* renamed from: i */
        final int f42462i;

        /* renamed from: j */
        final AtomicInteger f42463j = new AtomicInteger(1);

        /* renamed from: l */
        final AtomicReference<Throwable> f42465l = new AtomicReference<>();

        /* renamed from: k */
        final C11378b f42464k = new C11378b();

        /* compiled from: OnSubscribeFlatMapCompletable.java */
        /* renamed from: rx.n.a.p$a$a, reason: collision with other inner class name */
        final class C11552a extends AtomicReference<InterfaceC11198k> implements InterfaceC11184c, InterfaceC11198k {
            C11552a() {
            }

            @Override // p456rx.InterfaceC11184c
            /* renamed from: a */
            public void mo29114a(InterfaceC11198k interfaceC11198k) {
                if (compareAndSet(null, interfaceC11198k)) {
                    return;
                }
                interfaceC11198k.unsubscribe();
                if (get() != this) {
                    C11361c.m40578j(new IllegalStateException("Subscription already set!"));
                }
            }

            @Override // p456rx.InterfaceC11198k
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // p456rx.InterfaceC11184c
            public void onCompleted() {
                a.this.m40267d(this);
            }

            @Override // p456rx.InterfaceC11184c
            public void onError(Throwable th) {
                a.this.m40268e(this, th);
            }

            @Override // p456rx.InterfaceC11198k
            public void unsubscribe() {
                InterfaceC11198k andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }
        }

        a(AbstractC11197j<? super T> abstractC11197j, InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e, boolean z, int i2) {
            this.f42459f = abstractC11197j;
            this.f42460g = interfaceC11208e;
            this.f42461h = z;
            this.f42462i = i2;
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        /* renamed from: c */
        boolean m40266c() {
            if (this.f42463j.decrementAndGet() != 0) {
                return false;
            }
            Throwable m40423q = EnumC11308e.m40423q(this.f42465l);
            if (m40423q != null) {
                this.f42459f.onError(m40423q);
                return true;
            }
            this.f42459f.onCompleted();
            return true;
        }

        /* renamed from: d */
        public void m40267d(a<T>.C11552a c11552a) {
            this.f42464k.m40670d(c11552a);
            if (m40266c() || this.f42462i == Integer.MAX_VALUE) {
                return;
            }
            request(1L);
        }

        /* renamed from: e */
        public void m40268e(a<T>.C11552a c11552a, Throwable th) {
            this.f42464k.m40670d(c11552a);
            if (this.f42461h) {
                EnumC11308e.m40421g(this.f42465l, th);
                if (m40266c() || this.f42462i == Integer.MAX_VALUE) {
                    return;
                }
                request(1L);
                return;
            }
            this.f42464k.unsubscribe();
            unsubscribe();
            if (this.f42465l.compareAndSet(null, th)) {
                this.f42459f.onError(EnumC11308e.m40423q(this.f42465l));
            } else {
                C11361c.m40578j(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            m40266c();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42461h) {
                EnumC11308e.m40421g(this.f42465l, th);
                onCompleted();
                return;
            }
            this.f42464k.unsubscribe();
            if (this.f42465l.compareAndSet(null, th)) {
                this.f42459f.onError(EnumC11308e.m40423q(this.f42465l));
            } else {
                C11361c.m40578j(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                C11183b call = this.f42460g.call(t);
                if (call == null) {
                    throw new NullPointerException("The mapper returned a null Completable");
                }
                C11552a c11552a = new C11552a();
                this.f42464k.m40667a(c11552a);
                this.f42463j.getAndIncrement();
                call.m39971P(c11552a);
            } catch (Throwable th) {
                C11192a.m40140e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public C11258p(C11186e<T> c11186e, InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e, boolean z, int i2) {
        if (interfaceC11208e == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
        }
        this.f42455f = c11186e;
        this.f42456g = interfaceC11208e;
        this.f42457h = z;
        this.f42458i = i2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42456g, this.f42457h, this.f42458i);
        abstractC11197j.add(aVar);
        abstractC11197j.add(aVar.f42464k);
        this.f42455f.m40089c1(aVar);
    }
}
