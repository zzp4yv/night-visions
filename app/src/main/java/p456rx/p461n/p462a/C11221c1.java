package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p470p.C11357e;

/* compiled from: OperatorTakeUntil.java */
/* renamed from: rx.n.a.c1 */
/* loaded from: classes3.dex */
public final class C11221c1<T, E> implements C11186e.b<T, T> {

    /* renamed from: f */
    private final C11186e<? extends E> f42218f;

    /* compiled from: OperatorTakeUntil.java */
    /* renamed from: rx.n.a.c1$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11197j abstractC11197j, boolean z, AbstractC11197j abstractC11197j2) {
            super(abstractC11197j, z);
            this.f42219f = abstractC11197j2;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            try {
                this.f42219f.onCompleted();
            } finally {
                this.f42219f.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            try {
                this.f42219f.onError(th);
            } finally {
                this.f42219f.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42219f.onNext(t);
        }
    }

    /* compiled from: OperatorTakeUntil.java */
    /* renamed from: rx.n.a.c1$b */
    class b extends AbstractC11197j<E> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42221f;

        b(AbstractC11197j abstractC11197j) {
            this.f42221f = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42221f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42221f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(E e2) {
            onCompleted();
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C11221c1(C11186e<? extends E> c11186e) {
        this.f42218f = c11186e;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        C11357e c11357e = new C11357e(abstractC11197j, false);
        a aVar = new a(c11357e, false, c11357e);
        b bVar = new b(aVar);
        c11357e.add(aVar);
        c11357e.add(bVar);
        abstractC11197j.add(c11357e);
        this.f42218f.m40089c1(bVar);
        return aVar;
    }
}
