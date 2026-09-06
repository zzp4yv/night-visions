package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.C11183b;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: CompletableFlatMapSingleToCompletable.java */
/* renamed from: rx.n.a.c */
/* loaded from: classes3.dex */
public final class C11219c<T> implements C11183b.w {

    /* renamed from: f */
    final Single<T> f42203f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, ? extends C11183b> f42204g;

    /* compiled from: CompletableFlatMapSingleToCompletable.java */
    /* renamed from: rx.n.a.c$a */
    static final class a<T> extends AbstractC11196i<T> implements InterfaceC11184c {

        /* renamed from: g */
        final InterfaceC11184c f42205g;

        /* renamed from: h */
        final InterfaceC11208e<? super T, ? extends C11183b> f42206h;

        public a(InterfaceC11184c interfaceC11184c, InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e) {
            this.f42205g = interfaceC11184c;
            this.f42206h = interfaceC11208e;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            m40149b(interfaceC11198k);
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            try {
                C11183b call = this.f42206h.call(t);
                if (call == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    call.m39966J(this);
                }
            } catch (Throwable th) {
                C11192a.m40140e(th);
                onError(th);
            }
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            this.f42205g.onCompleted();
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            this.f42205g.onError(th);
        }
    }

    public C11219c(Single<T> single, InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e) {
        this.f42203f = single;
        this.f42204g = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11184c interfaceC11184c) {
        a aVar = new a(interfaceC11184c, this.f42204g);
        interfaceC11184c.mo29114a(aVar);
        this.f42203f.m39928t(aVar);
    }
}
