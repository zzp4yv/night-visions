package p456rx.p461n.p462a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11182a;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.C11306c;

/* compiled from: OperatorOnBackpressureBuffer.java */
/* renamed from: rx.n.a.s0 */
/* loaded from: classes3.dex */
public class C11268s0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    private final Long f42584f = null;

    /* renamed from: g */
    private final InterfaceC11204a f42585g = null;

    /* renamed from: h */
    private final C11182a.d f42586h = C11182a.f42035b;

    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* renamed from: rx.n.a.s0$a */
    static final class a<T> extends AbstractC11197j<T> implements C11306c.a {

        /* renamed from: g */
        private final AtomicLong f42588g;

        /* renamed from: h */
        private final AbstractC11197j<? super T> f42589h;

        /* renamed from: j */
        private final C11306c f42591j;

        /* renamed from: k */
        private final InterfaceC11204a f42592k;

        /* renamed from: l */
        private final C11182a.d f42593l;

        /* renamed from: f */
        private final ConcurrentLinkedQueue<Object> f42587f = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        private final AtomicBoolean f42590i = new AtomicBoolean(false);

        public a(AbstractC11197j<? super T> abstractC11197j, Long l, InterfaceC11204a interfaceC11204a, C11182a.d dVar) {
            this.f42589h = abstractC11197j;
            this.f42588g = l != null ? new AtomicLong(l.longValue()) : null;
            this.f42592k = interfaceC11204a;
            this.f42591j = new C11306c(this);
            this.f42593l = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean m40320c() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f42588g
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f42588g
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4a
                r0 = 0
                rx.a$d r4 = r6.f42593l     // Catch: p456rx.exceptions.MissingBackpressureException -> L23
                boolean r4 = r4.mo39942a()     // Catch: p456rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.poll()     // Catch: p456rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                r4 = 1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f42590i
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                rx.j<? super T> r5 = r6.f42589h
                r5.onError(r4)
            L34:
                r4 = 0
            L35:
                rx.m.a r5 = r6.f42592k
                if (r5 == 0) goto L47
                r5.call()     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r1 = move-exception
                p456rx.exceptions.C11192a.m40140e(r1)
                rx.n.e.c r2 = r6.f42591j
                r2.m40419c(r1)
                return r0
            L47:
                if (r4 != 0) goto L4a
                return r0
            L4a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f42588g
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11268s0.a.m40320c():boolean");
        }

        @Override // p456rx.p461n.p466e.C11306c.a
        /* renamed from: a */
        public boolean mo40321a(Object obj) {
            return C11234h.m40215a(this.f42589h, obj);
        }

        @Override // p456rx.p461n.p466e.C11306c.a
        /* renamed from: b */
        public void mo40322b(Throwable th) {
            if (th != null) {
                this.f42589h.onError(th);
            } else {
                this.f42589h.onCompleted();
            }
        }

        /* renamed from: d */
        protected InterfaceC11194g m40323d() {
            return this.f42591j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42590i.get()) {
                return;
            }
            this.f42591j.m40418b();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42590i.get()) {
                return;
            }
            this.f42591j.m40419c(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (m40320c()) {
                this.f42587f.offer(C11234h.m40221g(t));
                this.f42591j.m40417a();
            }
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // p456rx.p461n.p466e.C11306c.a
        public Object peek() {
            return this.f42587f.peek();
        }

        @Override // p456rx.p461n.p466e.C11306c.a
        public Object poll() {
            Object poll = this.f42587f.poll();
            AtomicLong atomicLong = this.f42588g;
            if (atomicLong != null && poll != null) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }
    }

    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* renamed from: rx.n.a.s0$b */
    static final class b {

        /* renamed from: a */
        static final C11268s0<?> f42594a = new C11268s0<>();
    }

    C11268s0() {
    }

    /* renamed from: b */
    public static <T> C11268s0<T> m40318b() {
        return (C11268s0<T>) b.f42594a;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42584f, this.f42585g, this.f42586h);
        abstractC11197j.add(aVar);
        abstractC11197j.setProducer(aVar.m40323d());
        return aVar;
    }
}
