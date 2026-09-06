package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.p327x.InterfaceC9056c;
import p456rx.AbstractC11196i;
import p456rx.Single;

/* compiled from: SingleV1ToSingleV2.java */
/* renamed from: g.a.a.a.e */
/* loaded from: classes2.dex */
final class C9027e<T> extends AbstractC9049s<T> {

    /* renamed from: a */
    final Single<T> f34894a;

    /* compiled from: SingleV1ToSingleV2.java */
    /* renamed from: g.a.a.a.e$a */
    static final class a<T> extends AbstractC11196i<T> implements InterfaceC9056c {

        /* renamed from: g */
        final InterfaceC9051u<? super T> f34895g;

        a(InterfaceC9051u<? super T> interfaceC9051u) {
            this.f34895g = interfaceC9051u;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            if (t == null) {
                this.f34895g.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f34895g.onSuccess(t);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            unsubscribe();
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            this.f34895g.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return isUnsubscribed();
        }
    }

    C9027e(Single<T> single) {
        this.f34894a = single;
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9051u<? super T> interfaceC9051u) {
        a aVar = new a(interfaceC9051u);
        interfaceC9051u.mo29132b(aVar);
        this.f34894a.m39928t(aVar);
    }
}
