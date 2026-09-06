package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.p471q.C11361c;

/* compiled from: OperatorTake.java */
/* renamed from: rx.n.a.b1 */
/* loaded from: classes3.dex */
public final class C11218b1<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final int f42195f;

    /* compiled from: OperatorTake.java */
    /* renamed from: rx.n.a.b1$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        int f42196f;

        /* renamed from: g */
        boolean f42197g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11197j f42198h;

        /* compiled from: OperatorTake.java */
        /* renamed from: rx.n.a.b1$a$a, reason: collision with other inner class name */
        class C11548a implements InterfaceC11194g {

            /* renamed from: f */
            final AtomicLong f42200f = new AtomicLong(0);

            /* renamed from: g */
            final /* synthetic */ InterfaceC11194g f42201g;

            C11548a(InterfaceC11194g interfaceC11194g) {
                this.f42201g = interfaceC11194g;
            }

            @Override // p456rx.InterfaceC11194g
            public void request(long j2) {
                long j3;
                long min;
                if (j2 <= 0 || a.this.f42197g) {
                    return;
                }
                do {
                    j3 = this.f42200f.get();
                    min = Math.min(j2, C11218b1.this.f42195f - j3);
                    if (min == 0) {
                        return;
                    }
                } while (!this.f42200f.compareAndSet(j3, j3 + min));
                this.f42201g.request(min);
            }
        }

        a(AbstractC11197j abstractC11197j) {
            this.f42198h = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42197g) {
                return;
            }
            this.f42197g = true;
            this.f42198h.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42197g) {
                C11361c.m40578j(th);
                return;
            }
            this.f42197g = true;
            try {
                this.f42198h.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i2 = this.f42196f;
            int i3 = i2 + 1;
            this.f42196f = i3;
            int i4 = C11218b1.this.f42195f;
            if (i2 < i4) {
                boolean z = i3 == i4;
                this.f42198h.onNext(t);
                if (!z || this.f42197g) {
                    return;
                }
                this.f42197g = true;
                try {
                    this.f42198h.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42198h.setProducer(new C11548a(interfaceC11194g));
        }
    }

    public C11218b1(int i2) {
        if (i2 >= 0) {
            this.f42195f = i2;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i2);
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        a aVar = new a(abstractC11197j);
        if (this.f42195f == 0) {
            abstractC11197j.onCompleted();
            aVar.unsubscribe();
        }
        abstractC11197j.add(aVar);
        return aVar;
    }
}
