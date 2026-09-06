package p319g.p320a.p321a.p322a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p456rx.AbstractC11196i;
import p456rx.InterfaceC11198k;
import p456rx.Single;

/* compiled from: SingleV2ToSingleV1.java */
/* renamed from: g.a.a.a.f */
/* loaded from: classes2.dex */
final class C9028f<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final InterfaceC9053w<T> f34896f;

    /* compiled from: SingleV2ToSingleV1.java */
    /* renamed from: g.a.a.a.f$a */
    static final class a<T> extends AtomicReference<InterfaceC9056c> implements InterfaceC9051u<T>, InterfaceC11198k {

        /* renamed from: f */
        final AbstractC11196i<? super T> f34897f;

        a(AbstractC11196i<? super T> abstractC11196i) {
            this.f34897f = abstractC11196i;
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29248A(this, interfaceC9056c);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return EnumC9070c.m29251u(get());
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            this.f34897f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            this.f34897f.mo29130c(t);
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            EnumC9070c.m29250g(this);
        }
    }

    C9028f(InterfaceC9053w<T> interfaceC9053w) {
        this.f34896f = interfaceC9053w;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i);
        abstractC11196i.m40149b(aVar);
        this.f34896f.mo29228b(aVar);
    }
}
