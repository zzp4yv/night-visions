package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p461n.p466e.C11316m;

/* compiled from: OperatorDistinctUntilChanged.java */
/* renamed from: rx.n.a.m0 */
/* loaded from: classes3.dex */
public final class C11250m0<T, U> implements C11186e.b<T, T>, InterfaceC11209f<U, U, Boolean> {

    /* renamed from: f */
    final InterfaceC11208e<? super T, ? extends U> f42418f;

    /* renamed from: g */
    final InterfaceC11209f<? super U, ? super U, Boolean> f42419g = this;

    /* compiled from: OperatorDistinctUntilChanged.java */
    /* renamed from: rx.n.a.m0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        U f42420f;

        /* renamed from: g */
        boolean f42421g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11197j f42422h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11197j abstractC11197j, AbstractC11197j abstractC11197j2) {
            super(abstractC11197j);
            this.f42422h = abstractC11197j2;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42422h.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42422h.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                U call = C11250m0.this.f42418f.call(t);
                U u = this.f42420f;
                this.f42420f = call;
                if (!this.f42421g) {
                    this.f42421g = true;
                    this.f42422h.onNext(t);
                    return;
                }
                try {
                    if (C11250m0.this.f42419g.mo6865a(u, call).booleanValue()) {
                        request(1L);
                    } else {
                        this.f42422h.onNext(t);
                    }
                } catch (Throwable th) {
                    C11192a.m40142g(th, this.f42422h, call);
                }
            } catch (Throwable th2) {
                C11192a.m40142g(th2, this.f42422h, t);
            }
        }
    }

    /* compiled from: OperatorDistinctUntilChanged.java */
    /* renamed from: rx.n.a.m0$b */
    static final class b {

        /* renamed from: a */
        static final C11250m0<?, ?> f42424a = new C11250m0<>(C11316m.m40467b());
    }

    public C11250m0(InterfaceC11208e<? super T, ? extends U> interfaceC11208e) {
        this.f42418f = interfaceC11208e;
    }

    /* renamed from: d */
    public static <T> C11250m0<T, T> m40255d() {
        return (C11250m0<T, T>) b.f42424a;
    }

    @Override // p456rx.p460m.InterfaceC11209f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean mo6865a(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        return new a(abstractC11197j, abstractC11197j);
    }
}
