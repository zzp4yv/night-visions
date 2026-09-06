package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;

/* compiled from: OperatorSkipWhile.java */
/* renamed from: rx.n.a.y0 */
/* loaded from: classes3.dex */
public final class C11282y0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final InterfaceC11209f<? super T, Integer, Boolean> f42697f;

    /* compiled from: OperatorSkipWhile.java */
    /* renamed from: rx.n.a.y0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        boolean f42698f;

        /* renamed from: g */
        int f42699g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11197j f42700h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11197j abstractC11197j, AbstractC11197j abstractC11197j2) {
            super(abstractC11197j);
            this.f42700h = abstractC11197j2;
            this.f42698f = true;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42700h.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42700h.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (!this.f42698f) {
                this.f42700h.onNext(t);
                return;
            }
            try {
                InterfaceC11209f<? super T, Integer, Boolean> interfaceC11209f = C11282y0.this.f42697f;
                int i2 = this.f42699g;
                this.f42699g = i2 + 1;
                if (interfaceC11209f.mo6865a(t, Integer.valueOf(i2)).booleanValue()) {
                    request(1L);
                } else {
                    this.f42698f = false;
                    this.f42700h.onNext(t);
                }
            } catch (Throwable th) {
                C11192a.m40142g(th, this.f42700h, t);
            }
        }
    }

    /* compiled from: OperatorSkipWhile.java */
    /* renamed from: rx.n.a.y0$b */
    static class b implements InterfaceC11209f<T, Integer, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42702f;

        b(InterfaceC11208e interfaceC11208e) {
            this.f42702f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11209f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo6865a(T t, Integer num) {
            return (Boolean) this.f42702f.call(t);
        }
    }

    public C11282y0(InterfaceC11209f<? super T, Integer, Boolean> interfaceC11209f) {
        this.f42697f = interfaceC11209f;
    }

    /* renamed from: b */
    public static <T> InterfaceC11209f<T, Integer, Boolean> m40362b(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return new b(interfaceC11208e);
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        return new a(abstractC11197j, abstractC11197j);
    }
}
