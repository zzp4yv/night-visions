package p323h.p324a.p329z.p334e.p338d;

import android.R;
import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9041k;
import p323h.p324a.InterfaceC9042l;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9055b;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p340f.C9126c;
import p323h.p324a.p329z.p344j.C9143a;

/* compiled from: ObservableFlatMapMaybe.java */
/* renamed from: h.a.z.e.d.i */
/* loaded from: classes2.dex */
public final class C9106i<T, R> extends AbstractC9098a<T, R> {

    /* renamed from: g */
    final InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> f35073g;

    /* renamed from: h */
    final boolean f35074h;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* renamed from: h.a.z.e.d.i$a */
    static final class a<T, R> extends AtomicInteger implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super R> f35075f;

        /* renamed from: g */
        final boolean f35076g;

        /* renamed from: k */
        final InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> f35080k;

        /* renamed from: m */
        InterfaceC9056c f35082m;

        /* renamed from: n */
        volatile boolean f35083n;

        /* renamed from: h */
        final C9055b f35077h = new C9055b();

        /* renamed from: j */
        final C9143a f35079j = new C9143a();

        /* renamed from: i */
        final AtomicInteger f35078i = new AtomicInteger(1);

        /* renamed from: l */
        final AtomicReference<C9126c<R>> f35081l = new AtomicReference<>();

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: h.a.z.e.d.i$a$a, reason: collision with other inner class name */
        final class C11481a extends AtomicReference<InterfaceC9056c> implements InterfaceC9041k<R>, InterfaceC9056c {
            C11481a() {
            }

            @Override // p323h.p324a.InterfaceC9041k
            /* renamed from: a */
            public void mo29185a() {
                a.this.m29301g(this);
            }

            @Override // p323h.p324a.InterfaceC9041k
            /* renamed from: b */
            public void mo29186b(InterfaceC9056c interfaceC9056c) {
                EnumC9070c.m29248A(this, interfaceC9056c);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: k */
            public void mo29115k() {
                EnumC9070c.m29250g(this);
            }

            @Override // p323h.p324a.InterfaceC9041k
            public void onError(Throwable th) {
                a.this.m29302h(this, th);
            }

            @Override // p323h.p324a.InterfaceC9041k
            public void onSuccess(R r) {
                a.this.m29303i(this, r);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9070c.m29251u(get());
            }
        }

        a(InterfaceC9047q<? super R> interfaceC9047q, InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> interfaceC9065f, boolean z) {
            this.f35075f = interfaceC9047q;
            this.f35080k = interfaceC9065f;
            this.f35076g = z;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            this.f35078i.decrementAndGet();
            m29298d();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35082m, interfaceC9056c)) {
                this.f35082m = interfaceC9056c;
                this.f35075f.mo29219b(this);
            }
        }

        /* renamed from: c */
        void m29297c() {
            C9126c<R> c9126c = this.f35081l.get();
            if (c9126c != null) {
                c9126c.clear();
            }
        }

        /* renamed from: d */
        void m29298d() {
            if (getAndIncrement() == 0) {
                m29299e();
            }
        }

        /* renamed from: e */
        void m29299e() {
            InterfaceC9047q<? super R> interfaceC9047q = this.f35075f;
            AtomicInteger atomicInteger = this.f35078i;
            AtomicReference<C9126c<R>> atomicReference = this.f35081l;
            int i2 = 1;
            while (!this.f35083n) {
                if (!this.f35076g && this.f35079j.get() != null) {
                    Throwable m29385b = this.f35079j.m29385b();
                    m29297c();
                    interfaceC9047q.onError(m29385b);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                C9126c<R> c9126c = atomicReference.get();
                R.bool poll = c9126c != null ? c9126c.poll() : null;
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable m29385b2 = this.f35079j.m29385b();
                    if (m29385b2 != null) {
                        interfaceC9047q.onError(m29385b2);
                        return;
                    } else {
                        interfaceC9047q.mo29218a();
                        return;
                    }
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    interfaceC9047q.onNext(poll);
                }
            }
            m29297c();
        }

        /* renamed from: f */
        C9126c<R> m29300f() {
            C9126c<R> c9126c;
            do {
                C9126c<R> c9126c2 = this.f35081l.get();
                if (c9126c2 != null) {
                    return c9126c2;
                }
                c9126c = new C9126c<>(AbstractC9043m.m29188b());
            } while (!this.f35081l.compareAndSet(null, c9126c));
            return c9126c;
        }

        /* renamed from: g */
        void m29301g(a<T, R>.C11481a c11481a) {
            this.f35077h.mo29240c(c11481a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f35078i.decrementAndGet() == 0;
                    C9126c<R> c9126c = this.f35081l.get();
                    if (!z || (c9126c != null && !c9126c.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        m29299e();
                        return;
                    } else {
                        Throwable m29385b = this.f35079j.m29385b();
                        if (m29385b != null) {
                            this.f35075f.onError(m29385b);
                            return;
                        } else {
                            this.f35075f.mo29218a();
                            return;
                        }
                    }
                }
            }
            this.f35078i.decrementAndGet();
            m29298d();
        }

        /* renamed from: h */
        void m29302h(a<T, R>.C11481a c11481a, Throwable th) {
            this.f35077h.mo29240c(c11481a);
            if (!this.f35079j.m29384a(th)) {
                C9030a.m29147o(th);
                return;
            }
            if (!this.f35076g) {
                this.f35082m.mo29115k();
                this.f35077h.mo29115k();
            }
            this.f35078i.decrementAndGet();
            m29298d();
        }

        /* renamed from: i */
        void m29303i(a<T, R>.C11481a c11481a, R r) {
            this.f35077h.mo29240c(c11481a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f35075f.onNext(r);
                    boolean z = this.f35078i.decrementAndGet() == 0;
                    C9126c<R> c9126c = this.f35081l.get();
                    if (!z || (c9126c != null && !c9126c.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        m29299e();
                    } else {
                        Throwable m29385b = this.f35079j.m29385b();
                        if (m29385b != null) {
                            this.f35075f.onError(m29385b);
                            return;
                        } else {
                            this.f35075f.mo29218a();
                            return;
                        }
                    }
                }
            }
            C9126c<R> m29300f = m29300f();
            synchronized (m29300f) {
                m29300f.offer(r);
            }
            this.f35078i.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m29299e();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35083n = true;
            this.f35082m.mo29115k();
            this.f35077h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            this.f35078i.decrementAndGet();
            if (!this.f35079j.m29384a(th)) {
                C9030a.m29147o(th);
                return;
            }
            if (!this.f35076g) {
                this.f35077h.mo29115k();
            }
            m29298d();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            try {
                InterfaceC9042l interfaceC9042l = (InterfaceC9042l) C9075b.m29271c(this.f35080k.mo4660a(t), "The mapper returned a null MaybeSource");
                this.f35078i.getAndIncrement();
                C11481a c11481a = new C11481a();
                if (this.f35083n || !this.f35077h.mo29239b(c11481a)) {
                    return;
                }
                interfaceC9042l.mo29183a(c11481a);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35082m.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35083n;
        }
    }

    public C9106i(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> interfaceC9065f, boolean z) {
        super(interfaceC9046p);
        this.f35073g = interfaceC9065f;
        this.f35074h = z;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super R> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35073g, this.f35074h));
    }
}
