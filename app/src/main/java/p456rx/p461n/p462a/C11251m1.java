package p456rx.p461n.p462a;

import p456rx.AbstractC11195h;
import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: SingleObserveOn.java */
/* renamed from: rx.n.a.m1 */
/* loaded from: classes3.dex */
public final class C11251m1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single.InterfaceC11181j<T> f42425f;

    /* renamed from: g */
    final AbstractC11195h f42426g;

    /* compiled from: SingleObserveOn.java */
    /* renamed from: rx.n.a.m1$a */
    static final class a<T> extends AbstractC11196i<T> implements InterfaceC11204a {

        /* renamed from: g */
        final AbstractC11196i<? super T> f42427g;

        /* renamed from: h */
        final AbstractC11195h.a f42428h;

        /* renamed from: i */
        T f42429i;

        /* renamed from: j */
        Throwable f42430j;

        public a(AbstractC11196i<? super T> abstractC11196i, AbstractC11195h.a aVar) {
            this.f42427g = abstractC11196i;
            this.f42428h = aVar;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42429i = t;
            this.f42428h.mo40146c(this);
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            try {
                Throwable th = this.f42430j;
                if (th != null) {
                    this.f42430j = null;
                    this.f42427g.onError(th);
                } else {
                    T t = this.f42429i;
                    this.f42429i = null;
                    this.f42427g.mo29130c(t);
                }
            } finally {
                this.f42428h.unsubscribe();
            }
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            this.f42430j = th;
            this.f42428h.mo40146c(this);
        }
    }

    public C11251m1(Single.InterfaceC11181j<T> interfaceC11181j, AbstractC11195h abstractC11195h) {
        this.f42425f = interfaceC11181j;
        this.f42426g = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        AbstractC11195h.a createWorker = this.f42426g.createWorker();
        a aVar = new a(abstractC11196i, createWorker);
        abstractC11196i.m40149b(createWorker);
        abstractC11196i.m40149b(aVar);
        this.f42425f.call(aVar);
    }
}
