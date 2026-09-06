package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p464c.C11293f;
import p456rx.p461n.p464c.C11301n;
import p456rx.p461n.p466e.C11311h;
import p456rx.p461n.p466e.p467n.C11321e;
import p456rx.p461n.p466e.p468o.C11343s;
import p456rx.p461n.p466e.p468o.C11350z;
import p456rx.p471q.C11361c;

/* compiled from: OperatorObserveOn.java */
/* renamed from: rx.n.a.r0 */
/* loaded from: classes3.dex */
public final class C11265r0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    private final AbstractC11195h f42558f;

    /* renamed from: g */
    private final boolean f42559g;

    /* renamed from: h */
    private final int f42560h;

    /* compiled from: OperatorObserveOn.java */
    /* renamed from: rx.n.a.r0$a */
    static final class a<T> extends AbstractC11197j<T> implements InterfaceC11204a {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42561f;

        /* renamed from: g */
        final AbstractC11195h.a f42562g;

        /* renamed from: h */
        final boolean f42563h;

        /* renamed from: i */
        final Queue<Object> f42564i;

        /* renamed from: j */
        final int f42565j;

        /* renamed from: k */
        volatile boolean f42566k;

        /* renamed from: l */
        final AtomicLong f42567l = new AtomicLong();

        /* renamed from: m */
        final AtomicLong f42568m = new AtomicLong();

        /* renamed from: n */
        Throwable f42569n;

        /* renamed from: o */
        long f42570o;

        /* compiled from: OperatorObserveOn.java */
        /* renamed from: rx.n.a.r0$a$a, reason: collision with other inner class name */
        class C11554a implements InterfaceC11194g {
            C11554a() {
            }

            @Override // p456rx.InterfaceC11194g
            public void request(long j2) {
                if (j2 > 0) {
                    C11213a.m40162b(a.this.f42567l, j2);
                    a.this.m40312e();
                }
            }
        }

        public a(AbstractC11195h abstractC11195h, AbstractC11197j<? super T> abstractC11197j, boolean z, int i2) {
            this.f42561f = abstractC11197j;
            this.f42562g = abstractC11195h.createWorker();
            this.f42563h = z;
            i2 = i2 <= 0 ? C11311h.f42884f : i2;
            this.f42565j = i2 - (i2 >> 2);
            if (C11350z.m40548b()) {
                this.f42564i = new C11343s(i2);
            } else {
                this.f42564i = new C11321e(i2);
            }
            request(i2);
        }

        /* renamed from: c */
        boolean m40310c(boolean z, boolean z2, AbstractC11197j<? super T> abstractC11197j, Queue<Object> queue) {
            if (abstractC11197j.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f42563h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f42569n;
                try {
                    if (th != null) {
                        abstractC11197j.onError(th);
                    } else {
                        abstractC11197j.onCompleted();
                    }
                    return false;
                } finally {
                }
            }
            Throwable th2 = this.f42569n;
            if (th2 != null) {
                queue.clear();
                try {
                    abstractC11197j.onError(th2);
                    return true;
                } finally {
                }
            }
            if (!z2) {
                return false;
            }
            try {
                abstractC11197j.onCompleted();
                return true;
            } finally {
            }
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            long j2 = this.f42570o;
            Queue<Object> queue = this.f42564i;
            AbstractC11197j<? super T> abstractC11197j = this.f42561f;
            long j3 = 1;
            do {
                long j4 = this.f42567l.get();
                while (j4 != j2) {
                    boolean z = this.f42566k;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (m40310c(z, z2, abstractC11197j, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    abstractC11197j.onNext((Object) C11234h.m40219e(poll));
                    j2++;
                    if (j2 == this.f42565j) {
                        j4 = C11213a.m40163c(this.f42567l, j2);
                        request(j2);
                        j2 = 0;
                    }
                }
                if (j4 == j2 && m40310c(this.f42566k, queue.isEmpty(), abstractC11197j, queue)) {
                    return;
                }
                this.f42570o = j2;
                j3 = this.f42568m.addAndGet(-j3);
            } while (j3 != 0);
        }

        /* renamed from: d */
        void m40311d() {
            AbstractC11197j<? super T> abstractC11197j = this.f42561f;
            abstractC11197j.setProducer(new C11554a());
            abstractC11197j.add(this.f42562g);
            abstractC11197j.add(this);
        }

        /* renamed from: e */
        protected void m40312e() {
            if (this.f42568m.getAndIncrement() == 0) {
                this.f42562g.mo40146c(this);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (isUnsubscribed() || this.f42566k) {
                return;
            }
            this.f42566k = true;
            m40312e();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f42566k) {
                C11361c.m40578j(th);
                return;
            }
            this.f42569n = th;
            this.f42566k = true;
            m40312e();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (isUnsubscribed() || this.f42566k) {
                return;
            }
            if (this.f42564i.offer(C11234h.m40221g(t))) {
                m40312e();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public C11265r0(AbstractC11195h abstractC11195h, boolean z, int i2) {
        this.f42558f = abstractC11195h;
        this.f42559g = z;
        this.f42560h = i2 <= 0 ? C11311h.f42884f : i2;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        AbstractC11195h abstractC11195h = this.f42558f;
        if ((abstractC11195h instanceof C11293f) || (abstractC11195h instanceof C11301n)) {
            return abstractC11197j;
        }
        a aVar = new a(abstractC11195h, abstractC11197j, this.f42559g, this.f42560h);
        aVar.m40311d();
        return aVar;
    }
}
