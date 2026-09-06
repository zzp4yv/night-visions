package p456rx.p470p;

import p456rx.AbstractC11197j;
import p456rx.InterfaceC11193f;

/* compiled from: SerializedSubscriber.java */
/* renamed from: rx.p.e */
/* loaded from: classes3.dex */
public class C11357e<T> extends AbstractC11197j<T> {

    /* renamed from: f */
    private final InterfaceC11193f<T> f42998f;

    public C11357e(AbstractC11197j<? super T> abstractC11197j) {
        this(abstractC11197j, true);
    }

    @Override // p456rx.InterfaceC11193f
    public void onCompleted() {
        this.f42998f.onCompleted();
    }

    @Override // p456rx.InterfaceC11193f
    public void onError(Throwable th) {
        this.f42998f.onError(th);
    }

    @Override // p456rx.InterfaceC11193f
    public void onNext(T t) {
        this.f42998f.onNext(t);
    }

    public C11357e(AbstractC11197j<? super T> abstractC11197j, boolean z) {
        super(abstractC11197j, z);
        this.f42998f = new C11356d(abstractC11197j);
    }
}
