package p456rx.p473s;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p470p.C11356d;

/* compiled from: SerializedSubject.java */
/* renamed from: rx.s.c */
/* loaded from: classes3.dex */
public class C11371c<T, R> extends AbstractC11372d<T, R> {

    /* renamed from: g */
    private final C11356d<T> f43047g;

    /* renamed from: h */
    private final AbstractC11372d<T, R> f43048h;

    /* compiled from: SerializedSubject.java */
    /* renamed from: rx.s.c$a */
    class a implements C11186e.a<R> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11372d f43049f;

        a(AbstractC11372d abstractC11372d) {
            this.f43049f = abstractC11372d;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super R> abstractC11197j) {
            this.f43049f.m40089c1(abstractC11197j);
        }
    }

    public C11371c(AbstractC11372d<T, R> abstractC11372d) {
        super(new a(abstractC11372d));
        this.f43048h = abstractC11372d;
        this.f43047g = new C11356d<>(abstractC11372d);
    }

    @Override // p456rx.InterfaceC11193f
    public void onCompleted() {
        this.f43047g.onCompleted();
    }

    @Override // p456rx.InterfaceC11193f
    public void onError(Throwable th) {
        this.f43047g.onError(th);
    }

    @Override // p456rx.InterfaceC11193f
    public void onNext(T t) {
        this.f43047g.onNext(t);
    }
}
