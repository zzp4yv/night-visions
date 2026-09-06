package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p471q.C11361c;

/* compiled from: OperatorCast.java */
/* renamed from: rx.n.a.j0 */
/* loaded from: classes3.dex */
public class C11241j0<T, R> implements C11186e.b<R, T> {

    /* renamed from: f */
    final Class<R> f42352f;

    /* compiled from: OperatorCast.java */
    /* renamed from: rx.n.a.j0$a */
    static final class a<T, R> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super R> f42353f;

        /* renamed from: g */
        final Class<R> f42354g;

        /* renamed from: h */
        boolean f42355h;

        public a(AbstractC11197j<? super R> abstractC11197j, Class<R> cls) {
            this.f42353f = abstractC11197j;
            this.f42354g = cls;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42355h) {
                return;
            }
            this.f42353f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42355h) {
                C11361c.m40578j(th);
            } else {
                this.f42355h = true;
                this.f42353f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                this.f42353f.onNext(this.f42354g.cast(t));
            } catch (Throwable th) {
                C11192a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42353f.setProducer(interfaceC11194g);
        }
    }

    public C11241j0(Class<R> cls) {
        this.f42352f = cls;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super R> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42352f);
        abstractC11197j.add(aVar);
        return aVar;
    }
}
