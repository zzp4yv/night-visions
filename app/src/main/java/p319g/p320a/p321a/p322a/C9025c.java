package p319g.p320a.p321a.p322a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9039i;
import p323h.p324a.p329z.p343i.EnumC9142b;
import p355k.p356a.InterfaceC9695a;
import p355k.p356a.InterfaceC9697c;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;

/* compiled from: FlowableV2ToObservableV1.java */
/* renamed from: g.a.a.a.c */
/* loaded from: classes2.dex */
final class C9025c<T> implements C11186e.a<T> {

    /* renamed from: f */
    final InterfaceC9695a<T> f34891f;

    /* compiled from: FlowableV2ToObservableV1.java */
    /* renamed from: g.a.a.a.c$a */
    static final class a<T> extends AtomicReference<InterfaceC9697c> implements InterfaceC9039i<T>, InterfaceC11198k, InterfaceC11194g {

        /* renamed from: f */
        final AbstractC11197j<? super T> f34892f;

        /* renamed from: g */
        final AtomicLong f34893g = new AtomicLong();

        a(AbstractC11197j<? super T> abstractC11197j) {
            this.f34892f = abstractC11197j;
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: a */
        public void mo29121a() {
            this.f34892f.onCompleted();
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: b */
        public void mo29122b(InterfaceC9697c interfaceC9697c) {
            EnumC9142b.m29379q(this, this.f34893g, interfaceC9697c);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return EnumC9142b.CANCELLED == get();
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onError(Throwable th) {
            this.f34892f.onError(th);
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onNext(T t) {
            this.f34892f.onNext(t);
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (j2 != 0) {
                EnumC9142b.m29378k(this, this.f34893g, j2);
            }
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            EnumC9142b.m29377g(this);
        }
    }

    C9025c(InterfaceC9695a<T> interfaceC9695a) {
        this.f34891f = interfaceC9695a;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(aVar);
        abstractC11197j.setProducer(aVar);
        this.f34891f.mo29173b(aVar);
    }
}
