package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: OperatorTakeUntilPredicate.java */
/* renamed from: rx.n.a.d1 */
/* loaded from: classes3.dex */
public final class C11224d1<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final InterfaceC11208e<? super T, Boolean> f42229f;

    /* compiled from: OperatorTakeUntilPredicate.java */
    /* renamed from: rx.n.a.d1$a */
    class a implements InterfaceC11194g {

        /* renamed from: f */
        final /* synthetic */ b f42230f;

        a(b bVar) {
            this.f42230f = bVar;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            this.f42230f.m40196c(j2);
        }
    }

    /* compiled from: OperatorTakeUntilPredicate.java */
    /* renamed from: rx.n.a.d1$b */
    final class b extends AbstractC11197j<T> {

        /* renamed from: f */
        private final AbstractC11197j<? super T> f42232f;

        /* renamed from: g */
        private boolean f42233g;

        b(AbstractC11197j<? super T> abstractC11197j) {
            this.f42232f = abstractC11197j;
        }

        /* renamed from: c */
        void m40196c(long j2) {
            request(j2);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42233g) {
                return;
            }
            this.f42232f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42233g) {
                return;
            }
            this.f42232f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42232f.onNext(t);
            try {
                if (C11224d1.this.f42229f.call(t).booleanValue()) {
                    this.f42233g = true;
                    this.f42232f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f42233g = true;
                C11192a.m40142g(th, this.f42232f, t);
                unsubscribe();
            }
        }
    }

    public C11224d1(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        this.f42229f = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        b bVar = new b(abstractC11197j);
        abstractC11197j.add(bVar);
        abstractC11197j.setProducer(new a(bVar));
        return bVar;
    }
}
