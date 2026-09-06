package p456rx.p461n.p466e;

import p456rx.AbstractC11195h;
import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p464c.C11289b;

/* compiled from: ScalarSynchronousSingle.java */
/* renamed from: rx.n.e.k */
/* loaded from: classes3.dex */
public final class C11314k<T> extends Single<T> {

    /* renamed from: b */
    final T f42910b;

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$a */
    class a implements Single.InterfaceC11181j<T> {

        /* renamed from: f */
        final /* synthetic */ Object f42911f;

        a(Object obj) {
            this.f42911f = obj;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            abstractC11196i.mo29130c((Object) this.f42911f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$b */
    class b<R> implements Single.InterfaceC11181j<R> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42912f;

        /* compiled from: ScalarSynchronousSingle.java */
        /* renamed from: rx.n.e.k$b$a */
        class a extends AbstractC11196i<R> {

            /* renamed from: g */
            final /* synthetic */ AbstractC11196i f42914g;

            a(AbstractC11196i abstractC11196i) {
                this.f42914g = abstractC11196i;
            }

            @Override // p456rx.AbstractC11196i
            /* renamed from: c */
            public void mo29130c(R r) {
                this.f42914g.mo29130c(r);
            }

            @Override // p456rx.AbstractC11196i
            public void onError(Throwable th) {
                this.f42914g.onError(th);
            }
        }

        b(InterfaceC11208e interfaceC11208e) {
            this.f42912f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super R> abstractC11196i) {
            Single single = (Single) this.f42912f.call(C11314k.this.f42910b);
            if (single instanceof C11314k) {
                abstractC11196i.mo29130c(((C11314k) single).f42910b);
                return;
            }
            a aVar = new a(abstractC11196i);
            abstractC11196i.m40149b(aVar);
            single.m39928t(aVar);
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$c */
    static final class c<T> implements Single.InterfaceC11181j<T> {

        /* renamed from: f */
        private final C11289b f42916f;

        /* renamed from: g */
        private final T f42917g;

        c(C11289b c11289b, T t) {
            this.f42916f = c11289b;
            this.f42917g = t;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            abstractC11196i.m40149b(this.f42916f.m40385a(new e(abstractC11196i, this.f42917g)));
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$d */
    static final class d<T> implements Single.InterfaceC11181j<T> {

        /* renamed from: f */
        private final AbstractC11195h f42918f;

        /* renamed from: g */
        private final T f42919g;

        d(AbstractC11195h abstractC11195h, T t) {
            this.f42918f = abstractC11195h;
            this.f42919g = t;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11196i<? super T> abstractC11196i) {
            AbstractC11195h.a createWorker = this.f42918f.createWorker();
            abstractC11196i.m40149b(createWorker);
            createWorker.mo40146c(new e(abstractC11196i, this.f42919g));
        }
    }

    /* compiled from: ScalarSynchronousSingle.java */
    /* renamed from: rx.n.e.k$e */
    static final class e<T> implements InterfaceC11204a {

        /* renamed from: f */
        private final AbstractC11196i<? super T> f42920f;

        /* renamed from: g */
        private final T f42921g;

        e(AbstractC11196i<? super T> abstractC11196i, T t) {
            this.f42920f = abstractC11196i;
            this.f42921g = t;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            try {
                this.f42920f.mo29130c(this.f42921g);
            } catch (Throwable th) {
                this.f42920f.onError(th);
            }
        }
    }

    protected C11314k(T t) {
        super(new a(t));
        this.f42910b = t;
    }

    /* renamed from: D */
    public static <T> C11314k<T> m40456D(T t) {
        return new C11314k<>(t);
    }

    /* renamed from: E */
    public <R> Single<R> m40457E(InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e) {
        return Single.m39909b(new b(interfaceC11208e));
    }

    /* renamed from: F */
    public Single<T> m40458F(AbstractC11195h abstractC11195h) {
        return abstractC11195h instanceof C11289b ? Single.m39909b(new c((C11289b) abstractC11195h, this.f42910b)) : Single.m39909b(new d(abstractC11195h, this.f42910b));
    }
}
