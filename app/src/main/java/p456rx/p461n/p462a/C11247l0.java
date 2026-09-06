package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: OperatorDelay.java */
/* renamed from: rx.n.a.l0 */
/* loaded from: classes3.dex */
public final class C11247l0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final long f42399f;

    /* renamed from: g */
    final TimeUnit f42400g;

    /* renamed from: h */
    final AbstractC11195h f42401h;

    /* compiled from: OperatorDelay.java */
    /* renamed from: rx.n.a.l0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        boolean f42402f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11195h.a f42403g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11197j f42404h;

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$a, reason: collision with other inner class name */
        class C11551a implements InterfaceC11204a {
            C11551a() {
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42402f = true;
                aVar.f42404h.onCompleted();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$b */
        class b implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ Throwable f42407f;

            b(Throwable th) {
                this.f42407f = th;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42402f = true;
                aVar.f42404h.onError(this.f42407f);
                a.this.f42403g.unsubscribe();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$c */
        class c implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ Object f42409f;

            c(Object obj) {
                this.f42409f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42404h.onNext(this.f42409f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11197j abstractC11197j, AbstractC11195h.a aVar, AbstractC11197j abstractC11197j2) {
            super(abstractC11197j);
            this.f42403g = aVar;
            this.f42404h = abstractC11197j2;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            AbstractC11195h.a aVar = this.f42403g;
            C11551a c11551a = new C11551a();
            C11247l0 c11247l0 = C11247l0.this;
            aVar.mo40147d(c11551a, c11247l0.f42399f, c11247l0.f42400g);
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42403g.mo40146c(new b(th));
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            AbstractC11195h.a aVar = this.f42403g;
            c cVar = new c(t);
            C11247l0 c11247l0 = C11247l0.this;
            aVar.mo40147d(cVar, c11247l0.f42399f, c11247l0.f42400g);
        }
    }

    public C11247l0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42399f = j2;
        this.f42400g = timeUnit;
        this.f42401h = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42401h.createWorker();
        abstractC11197j.add(createWorker);
        return new a(abstractC11197j, createWorker, abstractC11197j);
    }
}
