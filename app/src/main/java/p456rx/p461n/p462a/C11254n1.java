package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: SingleOnErrorReturn.java */
/* renamed from: rx.n.a.n1 */
/* loaded from: classes3.dex */
public final class C11254n1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single.InterfaceC11181j<T> f42437f;

    /* renamed from: g */
    final InterfaceC11208e<Throwable, ? extends T> f42438g;

    /* compiled from: SingleOnErrorReturn.java */
    /* renamed from: rx.n.a.n1$a */
    static final class a<T> extends AbstractC11196i<T> {

        /* renamed from: g */
        final AbstractC11196i<? super T> f42439g;

        /* renamed from: h */
        final InterfaceC11208e<Throwable, ? extends T> f42440h;

        public a(AbstractC11196i<? super T> abstractC11196i, InterfaceC11208e<Throwable, ? extends T> interfaceC11208e) {
            this.f42439g = abstractC11196i;
            this.f42440h = interfaceC11208e;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42439g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            try {
                this.f42439g.mo29130c(this.f42440h.call(th));
            } catch (Throwable th2) {
                C11192a.m40140e(th2);
                this.f42439g.onError(th2);
            }
        }
    }

    public C11254n1(Single.InterfaceC11181j<T> interfaceC11181j, InterfaceC11208e<Throwable, ? extends T> interfaceC11208e) {
        this.f42437f = interfaceC11181j;
        this.f42438g = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i, this.f42438g);
        abstractC11196i.m40149b(aVar);
        this.f42437f.call(aVar);
    }
}
