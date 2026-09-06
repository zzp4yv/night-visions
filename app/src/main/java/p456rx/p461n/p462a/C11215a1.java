package p456rx.p461n.p462a;

import android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.C11311h;
import p456rx.p461n.p466e.p467n.C11323g;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11380d;
import p456rx.p474t.C11381e;

/* compiled from: OperatorSwitch.java */
/* renamed from: rx.n.a.a1 */
/* loaded from: classes3.dex */
public final class C11215a1<T> implements C11186e.b<T, C11186e<? extends T>> {

    /* renamed from: f */
    final boolean f42161f;

    /* compiled from: OperatorSwitch.java */
    /* renamed from: rx.n.a.a1$a */
    static final class a {

        /* renamed from: a */
        static final C11215a1<Object> f42162a = new C11215a1<>(false);
    }

    /* compiled from: OperatorSwitch.java */
    /* renamed from: rx.n.a.a1$b */
    static final class b {

        /* renamed from: a */
        static final C11215a1<Object> f42163a = new C11215a1<>(true);
    }

    /* compiled from: OperatorSwitch.java */
    /* renamed from: rx.n.a.a1$c */
    static final class c<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        private final long f42164f;

        /* renamed from: g */
        private final d<T> f42165g;

        c(long j2, d<T> dVar) {
            this.f42164f = j2;
            this.f42165g = dVar;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42165g.m40173f(this.f42164f);
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42165g.m40176i(th, this.f42164f);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42165g.m40175h(t, this);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42165g.m40178k(interfaceC11194g, this.f42164f);
        }
    }

    /* compiled from: OperatorSwitch.java */
    /* renamed from: rx.n.a.a1$d */
    static final class d<T> extends AbstractC11197j<C11186e<? extends T>> {

        /* renamed from: f */
        static final Throwable f42166f = new Throwable("Terminal error");

        /* renamed from: g */
        final AbstractC11197j<? super T> f42167g;

        /* renamed from: i */
        final boolean f42169i;

        /* renamed from: l */
        boolean f42172l;

        /* renamed from: m */
        boolean f42173m;

        /* renamed from: n */
        long f42174n;

        /* renamed from: o */
        InterfaceC11194g f42175o;

        /* renamed from: p */
        volatile boolean f42176p;

        /* renamed from: q */
        Throwable f42177q;

        /* renamed from: r */
        boolean f42178r;

        /* renamed from: h */
        final C11380d f42168h = new C11380d();

        /* renamed from: j */
        final AtomicLong f42170j = new AtomicLong();

        /* renamed from: k */
        final C11323g<Object> f42171k = new C11323g<>(C11311h.f42884f);

        /* compiled from: OperatorSwitch.java */
        /* renamed from: rx.n.a.a1$d$a */
        class a implements InterfaceC11204a {
            a() {
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                d.this.m40172e();
            }
        }

        /* compiled from: OperatorSwitch.java */
        /* renamed from: rx.n.a.a1$d$b */
        class b implements InterfaceC11194g {
            b() {
            }

            @Override // p456rx.InterfaceC11194g
            public void request(long j2) {
                if (j2 > 0) {
                    d.this.m40171d(j2);
                } else {
                    if (j2 >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j2);
                }
            }
        }

        d(AbstractC11197j<? super T> abstractC11197j, boolean z) {
            this.f42167g = abstractC11197j;
            this.f42169i = z;
        }

        /* renamed from: c */
        protected boolean m40170c(boolean z, boolean z2, Throwable th, C11323g<Object> c11323g, AbstractC11197j<? super T> abstractC11197j, boolean z3) {
            if (this.f42169i) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    abstractC11197j.onError(th);
                } else {
                    abstractC11197j.onCompleted();
                }
                return true;
            }
            if (th != null) {
                c11323g.clear();
                abstractC11197j.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            abstractC11197j.onCompleted();
            return true;
        }

        /* renamed from: d */
        void m40171d(long j2) {
            InterfaceC11194g interfaceC11194g;
            synchronized (this) {
                interfaceC11194g = this.f42175o;
                this.f42174n = C11213a.m40161a(this.f42174n, j2);
            }
            if (interfaceC11194g != null) {
                interfaceC11194g.request(j2);
            }
            m40174g();
        }

        /* renamed from: e */
        void m40172e() {
            synchronized (this) {
                this.f42175o = null;
            }
        }

        /* renamed from: f */
        void m40173f(long j2) {
            synchronized (this) {
                if (this.f42170j.get() != j2) {
                    return;
                }
                this.f42178r = false;
                this.f42175o = null;
                m40174g();
            }
        }

        /* renamed from: g */
        void m40174g() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                if (this.f42172l) {
                    this.f42173m = true;
                    return;
                }
                this.f42172l = true;
                boolean z = this.f42178r;
                long j2 = this.f42174n;
                Throwable th3 = this.f42177q;
                if (th3 != null && th3 != (th2 = f42166f) && !this.f42169i) {
                    this.f42177q = th2;
                }
                C11323g<Object> c11323g = this.f42171k;
                AtomicLong atomicLong = this.f42170j;
                AbstractC11197j<? super T> abstractC11197j = this.f42167g;
                long j3 = j2;
                Throwable th4 = th3;
                boolean z2 = this.f42176p;
                while (true) {
                    long j4 = 0;
                    while (j4 != j3) {
                        if (abstractC11197j.isUnsubscribed()) {
                            return;
                        }
                        boolean isEmpty = c11323g.isEmpty();
                        if (m40170c(z2, z, th4, c11323g, abstractC11197j, isEmpty)) {
                            return;
                        }
                        if (isEmpty) {
                            break;
                        }
                        c cVar = (c) c11323g.poll();
                        R.bool boolVar = (Object) C11234h.m40219e(c11323g.poll());
                        if (atomicLong.get() == cVar.f42164f) {
                            abstractC11197j.onNext(boolVar);
                            j4++;
                        }
                    }
                    if (j4 == j3) {
                        if (abstractC11197j.isUnsubscribed()) {
                            return;
                        }
                        if (m40170c(this.f42176p, z, th4, c11323g, abstractC11197j, c11323g.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j5 = this.f42174n;
                        if (j5 != Long.MAX_VALUE) {
                            j5 -= j4;
                            this.f42174n = j5;
                        }
                        j3 = j5;
                        if (!this.f42173m) {
                            this.f42172l = false;
                            return;
                        }
                        this.f42173m = false;
                        z2 = this.f42176p;
                        z = this.f42178r;
                        th4 = this.f42177q;
                        if (th4 != null && th4 != (th = f42166f) && !this.f42169i) {
                            this.f42177q = th;
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        void m40175h(T t, c<T> cVar) {
            synchronized (this) {
                if (this.f42170j.get() != ((c) cVar).f42164f) {
                    return;
                }
                this.f42171k.m40505u(cVar, C11234h.m40221g(t));
                m40174g();
            }
        }

        /* renamed from: i */
        void m40176i(Throwable th, long j2) {
            boolean z;
            synchronized (this) {
                if (this.f42170j.get() == j2) {
                    z = m40181n(th);
                    this.f42178r = false;
                    this.f42175o = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                m40174g();
            } else {
                m40180m(th);
            }
        }

        /* renamed from: j */
        void m40177j() {
            this.f42167g.add(this.f42168h);
            this.f42167g.add(C11381e.m40674a(new a()));
            this.f42167g.setProducer(new b());
        }

        /* renamed from: k */
        void m40178k(InterfaceC11194g interfaceC11194g, long j2) {
            synchronized (this) {
                if (this.f42170j.get() != j2) {
                    return;
                }
                long j3 = this.f42174n;
                this.f42175o = interfaceC11194g;
                interfaceC11194g.request(j3);
            }
        }

        @Override // p456rx.InterfaceC11193f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onNext(C11186e<? extends T> c11186e) {
            c cVar;
            long incrementAndGet = this.f42170j.incrementAndGet();
            InterfaceC11198k m40672a = this.f42168h.m40672a();
            if (m40672a != null) {
                m40672a.unsubscribe();
            }
            synchronized (this) {
                cVar = new c(incrementAndGet, this);
                this.f42178r = true;
                this.f42175o = null;
            }
            this.f42168h.m40673b(cVar);
            c11186e.m40089c1(cVar);
        }

        /* renamed from: m */
        void m40180m(Throwable th) {
            C11361c.m40578j(th);
        }

        /* renamed from: n */
        boolean m40181n(Throwable th) {
            Throwable th2 = this.f42177q;
            if (th2 == f42166f) {
                return false;
            }
            if (th2 == null) {
                this.f42177q = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).m40129b());
                arrayList.add(th);
                this.f42177q = new CompositeException(arrayList);
            } else {
                this.f42177q = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42176p = true;
            m40174g();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            boolean m40181n;
            synchronized (this) {
                m40181n = m40181n(th);
            }
            if (!m40181n) {
                m40180m(th);
            } else {
                this.f42176p = true;
                m40174g();
            }
        }
    }

    C11215a1(boolean z) {
        this.f42161f = z;
    }

    /* renamed from: b */
    public static <T> C11215a1<T> m40167b(boolean z) {
        return z ? (C11215a1<T>) b.f42163a : (C11215a1<T>) a.f42162a;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super C11186e<? extends T>> call(AbstractC11197j<? super T> abstractC11197j) {
        d dVar = new d(abstractC11197j, this.f42161f);
        abstractC11197j.add(dVar);
        dVar.m40177j();
        return dVar;
    }
}
