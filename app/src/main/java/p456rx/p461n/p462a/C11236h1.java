package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.InterfaceC11205b;

/* compiled from: SingleDoOnEvent.java */
/* renamed from: rx.n.a.h1 */
/* loaded from: classes3.dex */
public final class C11236h1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single<T> f42318f;

    /* renamed from: g */
    final InterfaceC11205b<? super T> f42319g;

    /* renamed from: h */
    final InterfaceC11205b<Throwable> f42320h;

    /* compiled from: SingleDoOnEvent.java */
    /* renamed from: rx.n.a.h1$a */
    static final class a<T> extends AbstractC11196i<T> {

        /* renamed from: g */
        final AbstractC11196i<? super T> f42321g;

        /* renamed from: h */
        final InterfaceC11205b<? super T> f42322h;

        /* renamed from: i */
        final InterfaceC11205b<Throwable> f42323i;

        a(AbstractC11196i<? super T> abstractC11196i, InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<Throwable> interfaceC11205b2) {
            this.f42321g = abstractC11196i;
            this.f42322h = interfaceC11205b;
            this.f42323i = interfaceC11205b2;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            try {
                this.f42322h.call(t);
                this.f42321g.mo29130c(t);
            } catch (Throwable th) {
                C11192a.m40144i(th, this, t);
            }
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            try {
                this.f42323i.call(th);
                this.f42321g.onError(th);
            } catch (Throwable th2) {
                C11192a.m40140e(th2);
                this.f42321g.onError(new CompositeException(th, th2));
            }
        }
    }

    public C11236h1(Single<T> single, InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<Throwable> interfaceC11205b2) {
        this.f42318f = single;
        this.f42319g = interfaceC11205b;
        this.f42320h = interfaceC11205b2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i, this.f42319g, this.f42320h);
        abstractC11196i.m40149b(aVar);
        this.f42318f.m39928t(aVar);
    }
}
