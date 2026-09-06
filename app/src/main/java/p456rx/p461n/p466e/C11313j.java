package p456rx.p461n.p466e;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p463b.C11287c;
import p456rx.p461n.p464c.C11289b;
import p456rx.p470p.C11358f;
import p456rx.p471q.C11361c;

/* compiled from: ScalarSynchronousObservable.java */
/* renamed from: rx.n.e.j */
/* loaded from: classes3.dex */
public final class C11313j<T> extends C11186e<T> {

    /* renamed from: g */
    static final boolean f42890g = Boolean.valueOf(System.getProperty("rx.just.strong-mode", AdultContentAnalytics.UNLOCK)).booleanValue();

    /* renamed from: h */
    final T f42891h;

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$a */
    class a implements InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> {

        /* renamed from: f */
        final /* synthetic */ C11289b f42892f;

        a(C11289b c11289b) {
            this.f42892f = c11289b;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC11198k call(InterfaceC11204a interfaceC11204a) {
            return this.f42892f.m40385a(interfaceC11204a);
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$b */
    class b implements InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h f42894f;

        /* compiled from: ScalarSynchronousObservable.java */
        /* renamed from: rx.n.e.j$b$a */
        class a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11204a f42896f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11195h.a f42897g;

            a(InterfaceC11204a interfaceC11204a, AbstractC11195h.a aVar) {
                this.f42896f = interfaceC11204a;
                this.f42897g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                try {
                    this.f42896f.call();
                } finally {
                    this.f42897g.unsubscribe();
                }
            }
        }

        b(AbstractC11195h abstractC11195h) {
            this.f42894f = abstractC11195h;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC11198k call(InterfaceC11204a interfaceC11204a) {
            AbstractC11195h.a createWorker = this.f42894f.createWorker();
            createWorker.mo40146c(new a(interfaceC11204a, createWorker));
            return createWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$c */
    class c<R> implements C11186e.a<R> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42899f;

        c(InterfaceC11208e interfaceC11208e) {
            this.f42899f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super R> abstractC11197j) {
            C11186e c11186e = (C11186e) this.f42899f.call(C11313j.this.f42891h);
            if (c11186e instanceof C11313j) {
                abstractC11197j.setProducer(C11313j.m40447g1(abstractC11197j, ((C11313j) c11186e).f42891h));
            } else {
                c11186e.m40089c1(C11358f.m40561c(abstractC11197j));
            }
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$d */
    static final class d<T> implements C11186e.a<T> {

        /* renamed from: f */
        final T f42901f;

        d(T t) {
            this.f42901f = t;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super T> abstractC11197j) {
            abstractC11197j.setProducer(C11313j.m40447g1(abstractC11197j, this.f42901f));
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$e */
    static final class e<T> implements C11186e.a<T> {

        /* renamed from: f */
        final T f42902f;

        /* renamed from: g */
        final InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> f42903g;

        e(T t, InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> interfaceC11208e) {
            this.f42902f = t;
            this.f42903g = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super T> abstractC11197j) {
            abstractC11197j.setProducer(new f(abstractC11197j, this.f42902f, this.f42903g));
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$f */
    static final class f<T> extends AtomicBoolean implements InterfaceC11194g, InterfaceC11204a {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42904f;

        /* renamed from: g */
        final T f42905g;

        /* renamed from: h */
        final InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> f42906h;

        public f(AbstractC11197j<? super T> abstractC11197j, T t, InterfaceC11208e<InterfaceC11204a, InterfaceC11198k> interfaceC11208e) {
            this.f42904f = abstractC11197j;
            this.f42905g = t;
            this.f42906h = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            AbstractC11197j<? super T> abstractC11197j = this.f42904f;
            if (abstractC11197j.isUnsubscribed()) {
                return;
            }
            T t = this.f42905g;
            try {
                abstractC11197j.onNext(t);
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onCompleted();
            } catch (Throwable th) {
                C11192a.m40142g(th, abstractC11197j, t);
            }
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
            if (j2 == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.f42904f.add(this.f42906h.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.f42905g + ", " + get() + "]";
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* renamed from: rx.n.e.j$g */
    static final class g<T> implements InterfaceC11194g {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42907f;

        /* renamed from: g */
        final T f42908g;

        /* renamed from: h */
        boolean f42909h;

        public g(AbstractC11197j<? super T> abstractC11197j, T t) {
            this.f42907f = abstractC11197j;
            this.f42908g = t;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (this.f42909h) {
                return;
            }
            if (j2 < 0) {
                throw new IllegalStateException("n >= required but it was " + j2);
            }
            if (j2 == 0) {
                return;
            }
            this.f42909h = true;
            AbstractC11197j<? super T> abstractC11197j = this.f42907f;
            if (abstractC11197j.isUnsubscribed()) {
                return;
            }
            T t = this.f42908g;
            try {
                abstractC11197j.onNext(t);
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onCompleted();
            } catch (Throwable th) {
                C11192a.m40142g(th, abstractC11197j, t);
            }
        }
    }

    protected C11313j(T t) {
        super(C11361c.m40576h(new d(t)));
        this.f42891h = t;
    }

    /* renamed from: f1 */
    public static <T> C11313j<T> m40446f1(T t) {
        return new C11313j<>(t);
    }

    /* renamed from: g1 */
    static <T> InterfaceC11194g m40447g1(AbstractC11197j<? super T> abstractC11197j, T t) {
        return f42890g ? new C11287c(abstractC11197j, t) : new g(abstractC11197j, t);
    }

    /* renamed from: h1 */
    public T m40448h1() {
        return this.f42891h;
    }

    /* renamed from: i1 */
    public <R> C11186e<R> m40449i1(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return C11186e.m40035b1(new c(interfaceC11208e));
    }

    /* renamed from: j1 */
    public C11186e<T> m40450j1(AbstractC11195h abstractC11195h) {
        return C11186e.m40035b1(new e(this.f42891h, abstractC11195h instanceof C11289b ? new a((C11289b) abstractC11195h) : new b(abstractC11195h)));
    }
}
