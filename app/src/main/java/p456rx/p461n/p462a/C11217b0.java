package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: OnSubscribeSkipTimed.java */
/* renamed from: rx.n.a.b0 */
/* loaded from: classes3.dex */
public final class C11217b0<T> implements C11186e.a<T> {

    /* renamed from: f */
    final long f42189f;

    /* renamed from: g */
    final TimeUnit f42190g;

    /* renamed from: h */
    final AbstractC11195h f42191h;

    /* renamed from: i */
    final C11186e<T> f42192i;

    /* compiled from: OnSubscribeSkipTimed.java */
    /* renamed from: rx.n.a.b0$a */
    static final class a<T> extends AbstractC11197j<T> implements InterfaceC11204a {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42193f;

        /* renamed from: g */
        volatile boolean f42194g;

        a(AbstractC11197j<? super T> abstractC11197j) {
            this.f42193f = abstractC11197j;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            this.f42194g = true;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            try {
                this.f42193f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            try {
                this.f42193f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42194g) {
                this.f42193f.onNext(t);
            }
        }
    }

    public C11217b0(C11186e<T> c11186e, long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42192i = c11186e;
        this.f42189f = j2;
        this.f42190g = timeUnit;
        this.f42191h = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42191h.createWorker();
        a aVar = new a(abstractC11197j);
        aVar.add(createWorker);
        abstractC11197j.add(aVar);
        createWorker.mo40147d(aVar, this.f42189f, this.f42190g);
        this.f42192i.m40089c1(aVar);
    }
}
