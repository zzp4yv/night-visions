package p456rx;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p456rx.AbstractC11195h;
import p456rx.exceptions.C11192a;
import p456rx.p460m.C11206c;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p460m.InterfaceC11210g;
import p456rx.p460m.InterfaceC11211h;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.p461n.p462a.C11219c;
import p456rx.p461n.p462a.C11236h1;
import p456rx.p461n.p462a.C11239i1;
import p456rx.p461n.p462a.C11242j1;
import p456rx.p461n.p462a.C11251m1;
import p456rx.p461n.p462a.C11254n1;
import p456rx.p461n.p462a.C11257o1;
import p456rx.p461n.p462a.C11260p1;
import p456rx.p461n.p462a.C11263q1;
import p456rx.p461n.p462a.C11266r1;
import p456rx.p461n.p462a.C11269s1;
import p456rx.p461n.p462a.C11272t1;
import p456rx.p461n.p466e.C11314k;
import p456rx.p461n.p466e.C11316m;
import p456rx.p471q.C11361c;
import p456rx.p472r.C11368a;
import p456rx.p474t.C11381e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class Single<T> {

    /* renamed from: a */
    final InterfaceC11181j<T> f42014a;

    /* renamed from: rx.Single$a */
    /* loaded from: classes3.dex */
    class C11172a extends AbstractC11196i<T> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC11205b f42015g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11205b f42016h;

        C11172a(InterfaceC11205b interfaceC11205b, InterfaceC11205b interfaceC11205b2) {
            this.f42015g = interfaceC11205b;
            this.f42016h = interfaceC11205b2;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public final void mo29130c(T t) {
            try {
                this.f42016h.call(t);
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.AbstractC11196i
        public final void onError(Throwable th) {
            try {
                this.f42015g.call(th);
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: rx.Single$b */
    /* loaded from: classes3.dex */
    class C11173b implements InterfaceC11181j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h f42018f;

        /* renamed from: rx.Single$b$a */
        class a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ AbstractC11196i f42020f;

            /* renamed from: g */
            final /* synthetic */ AbstractC11195h.a f42021g;

            /* renamed from: rx.Single$b$a$a, reason: collision with other inner class name */
            class C11542a extends AbstractC11196i<T> {
                C11542a() {
                }

                @Override // p456rx.AbstractC11196i
                /* renamed from: c */
                public void mo29130c(T t) {
                    try {
                        a.this.f42020f.mo29130c(t);
                    } finally {
                        a.this.f42021g.unsubscribe();
                    }
                }

                @Override // p456rx.AbstractC11196i
                public void onError(Throwable th) {
                    try {
                        a.this.f42020f.onError(th);
                    } finally {
                        a.this.f42021g.unsubscribe();
                    }
                }
            }

            a(AbstractC11196i abstractC11196i, AbstractC11195h.a aVar) {
                this.f42020f = abstractC11196i;
                this.f42021g = aVar;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                C11542a c11542a = new C11542a();
                this.f42020f.m40149b(c11542a);
                Single.this.m39928t(c11542a);
            }
        }

        C11173b(AbstractC11195h abstractC11195h) {
            this.f42018f = abstractC11195h;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            AbstractC11195h.a createWorker = this.f42018f.createWorker();
            abstractC11196i.m40149b(createWorker);
            createWorker.mo40146c(new a(abstractC11196i, createWorker));
        }
    }

    /* renamed from: rx.Single$c */
    /* loaded from: classes3.dex */
    class C11174c implements InterfaceCallableC11207d<Single<T>> {
        C11174c() {
        }

        @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single<T> call() {
            return Single.m39911h(new TimeoutException());
        }
    }

    /* renamed from: rx.Single$d */
    /* loaded from: classes3.dex */
    class C11175d implements InterfaceC11205b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11205b f42025f;

        C11175d(InterfaceC11205b interfaceC11205b) {
            this.f42025f = interfaceC11205b;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f42025f.call(th);
        }
    }

    /* renamed from: rx.Single$e */
    /* loaded from: classes3.dex */
    static class C11176e implements InterfaceC11181j<T> {

        /* renamed from: f */
        final /* synthetic */ Callable f42027f;

        C11176e(Callable callable) {
            this.f42027f = callable;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            try {
                ((Single) this.f42027f.call()).m39928t(abstractC11196i);
            } catch (Throwable th) {
                C11192a.m40140e(th);
                abstractC11196i.onError(th);
            }
        }
    }

    /* renamed from: rx.Single$f */
    /* loaded from: classes3.dex */
    static class C11177f implements InterfaceC11181j<T> {

        /* renamed from: f */
        final /* synthetic */ Throwable f42028f;

        C11177f(Throwable th) {
            this.f42028f = th;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            abstractC11196i.onError(this.f42028f);
        }
    }

    /* renamed from: rx.Single$g */
    /* loaded from: classes3.dex */
    static class C11178g implements InterfaceC11181j<T> {

        /* renamed from: rx.Single$g$a */
        class a extends AbstractC11196i<Single<? extends T>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC11196i f42030g;

            a(AbstractC11196i abstractC11196i) {
                this.f42030g = abstractC11196i;
            }

            @Override // p456rx.AbstractC11196i
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo29130c(Single<? extends T> single) {
                single.m39928t(this.f42030g);
            }

            @Override // p456rx.AbstractC11196i
            public void onError(Throwable th) {
                this.f42030g.onError(th);
            }
        }

        C11178g() {
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            a aVar = new a(abstractC11196i);
            abstractC11196i.m40149b(aVar);
            Single.this.m39928t(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: rx.Single$h */
    /* loaded from: classes3.dex */
    static class C11179h<R> implements InterfaceC11211h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11209f f42032a;

        C11179h(InterfaceC11209f interfaceC11209f) {
            this.f42032a = interfaceC11209f;
        }

        @Override // p456rx.p460m.InterfaceC11211h
        public R call(Object... objArr) {
            return (R) this.f42032a.mo6865a(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: rx.Single$i */
    /* loaded from: classes3.dex */
    static class C11180i<R> implements InterfaceC11211h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11210g f42033a;

        C11180i(InterfaceC11210g interfaceC11210g) {
            this.f42033a = interfaceC11210g;
        }

        @Override // p456rx.p460m.InterfaceC11211h
        public R call(Object... objArr) {
            return (R) this.f42033a.mo6864a(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* renamed from: rx.Single$j */
    /* loaded from: classes3.dex */
    public interface InterfaceC11181j<T> extends InterfaceC11205b<AbstractC11196i<? super T>> {
    }

    protected Single(InterfaceC11181j<T> interfaceC11181j) {
        this.f42014a = C11361c.m40577i(interfaceC11181j);
    }

    /* renamed from: B */
    public static <T1, T2, T3, R> Single<R> m39906B(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, InterfaceC11210g<? super T1, ? super T2, ? super T3, ? extends R> interfaceC11210g) {
        return C11266r1.m40313a(new Single[]{single, single2, single3}, new C11180i(interfaceC11210g));
    }

    /* renamed from: C */
    public static <T1, T2, R> Single<R> m39907C(Single<? extends T1> single, Single<? extends T2> single2, InterfaceC11209f<? super T1, ? super T2, ? extends R> interfaceC11209f) {
        return C11266r1.m40313a(new Single[]{single, single2}, new C11179h(interfaceC11209f));
    }

    /* renamed from: a */
    private static <T> C11186e<T> m39908a(Single<T> single) {
        return C11186e.m40035b1(new C11272t1(single.f42014a));
    }

    /* renamed from: b */
    public static <T> Single<T> m39909b(InterfaceC11181j<T> interfaceC11181j) {
        return new Single<>(interfaceC11181j);
    }

    /* renamed from: c */
    public static <T> Single<T> m39910c(Callable<Single<T>> callable) {
        return m39909b(new C11176e(callable));
    }

    /* renamed from: h */
    public static <T> Single<T> m39911h(Throwable th) {
        return m39909b(new C11177f(th));
    }

    /* renamed from: l */
    public static <T> Single<T> m39912l(Callable<? extends T> callable) {
        return m39909b(new C11242j1(callable));
    }

    /* renamed from: m */
    public static <T> Single<T> m39913m(T t) {
        return C11314k.m40456D(t);
    }

    /* renamed from: o */
    public static <T> Single<T> m39914o(Single<? extends Single<? extends T>> single) {
        return single instanceof C11314k ? ((C11314k) single).m40457E(C11316m.m40467b()) : m39909b(new C11178g());
    }

    /* renamed from: A */
    public final C11186e<T> m39915A() {
        return m39908a(this);
    }

    /* renamed from: d */
    public final Single<T> m39916d(C11186e<?> c11186e) {
        c11186e.getClass();
        return m39909b(new C11257o1(this, c11186e));
    }

    /* renamed from: e */
    public final Single<T> m39917e(InterfaceC11205b<Throwable> interfaceC11205b) {
        if (interfaceC11205b != null) {
            return m39909b(new C11236h1(this, C11206c.m40157a(), new C11175d(interfaceC11205b)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    /* renamed from: f */
    public final Single<T> m39918f(InterfaceC11204a interfaceC11204a) {
        return m39909b(new C11239i1(this.f42014a, interfaceC11204a));
    }

    /* renamed from: g */
    public final Single<T> m39919g(InterfaceC11205b<? super T> interfaceC11205b) {
        if (interfaceC11205b != null) {
            return m39909b(new C11236h1(this, interfaceC11205b, C11206c.m40157a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <R> Single<R> m39920i(InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e) {
        return this instanceof C11314k ? ((C11314k) this).m40457E(interfaceC11208e) : m39914o(m39923n(interfaceC11208e));
    }

    /* renamed from: j */
    public final C11183b m39921j(InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e) {
        return C11183b.m39948h(new C11219c(this, interfaceC11208e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <R> C11186e<R> m39922k(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return C11186e.m40032Z(m39908a(m39923n(interfaceC11208e)));
    }

    /* renamed from: n */
    public final <R> Single<R> m39923n(InterfaceC11208e<? super T, ? extends R> interfaceC11208e) {
        return m39909b(new C11260p1(this, interfaceC11208e));
    }

    /* renamed from: p */
    public final Single<T> m39924p(AbstractC11195h abstractC11195h) {
        if (this instanceof C11314k) {
            return ((C11314k) this).m40458F(abstractC11195h);
        }
        if (abstractC11195h != null) {
            return m39909b(new C11251m1(this.f42014a, abstractC11195h));
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: q */
    public final Single<T> m39925q(InterfaceC11208e<Throwable, ? extends Single<? extends T>> interfaceC11208e) {
        return new Single<>(C11263q1.m40301b(this, interfaceC11208e));
    }

    /* renamed from: r */
    public final Single<T> m39926r(InterfaceC11208e<Throwable, ? extends T> interfaceC11208e) {
        return m39909b(new C11254n1(this.f42014a, interfaceC11208e));
    }

    /* renamed from: s */
    public final Single<T> m39927s(InterfaceC11208e<C11186e<? extends Throwable>, ? extends C11186e<?>> interfaceC11208e) {
        return m39915A().m40112t0(interfaceC11208e).m40085Z0();
    }

    /* renamed from: t */
    public final InterfaceC11198k m39928t(AbstractC11196i<? super T> abstractC11196i) {
        if (abstractC11196i == null) {
            throw new IllegalArgumentException("te is null");
        }
        try {
            C11361c.m40588t(this, this.f42014a).call(abstractC11196i);
            return C11361c.m40587s(abstractC11196i);
        } catch (Throwable th) {
            C11192a.m40140e(th);
            try {
                abstractC11196i.onError(C11361c.m40586r(th));
                return C11381e.m40675b();
            } catch (Throwable th2) {
                C11192a.m40140e(th2);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                C11361c.m40586r(runtimeException);
                throw runtimeException;
            }
        }
    }

    /* renamed from: u */
    public final InterfaceC11198k m39929u(InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<Throwable> interfaceC11205b2) {
        if (interfaceC11205b == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (interfaceC11205b2 != null) {
            return m39928t(new C11172a(interfaceC11205b2, interfaceC11205b));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    /* renamed from: v */
    public final Single<T> m39930v(AbstractC11195h abstractC11195h) {
        return this instanceof C11314k ? ((C11314k) this).m40458F(abstractC11195h) : m39909b(new C11173b(abstractC11195h));
    }

    /* renamed from: w */
    public final Single<T> m39931w(long j2, TimeUnit timeUnit) {
        return m39932x(j2, timeUnit, null, Schedulers.computation());
    }

    /* renamed from: x */
    public final Single<T> m39932x(long j2, TimeUnit timeUnit, Single<? extends T> single, AbstractC11195h abstractC11195h) {
        if (single == null) {
            single = m39910c(new C11174c());
        }
        return m39909b(new C11269s1(this.f42014a, j2, timeUnit, abstractC11195h, single.f42014a));
    }

    /* renamed from: y */
    public final C11368a<T> m39933y() {
        return C11368a.m40632a(this);
    }

    /* renamed from: z */
    public final C11183b m39934z() {
        return C11183b.m39955w(this);
    }
}
