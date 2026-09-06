package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9207a;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: SingleMap.java */
/* renamed from: h.a.z.e.e.d */
/* loaded from: classes2.dex */
public final class C9121d<T, R> extends AbstractC9049s<R> {

    /* renamed from: a */
    final InterfaceC9053w<? extends T> f35148a;

    /* renamed from: b */
    final InterfaceC9065f<? super T, ? extends R> f35149b;

    /* compiled from: SingleMap.java */
    /* renamed from: h.a.z.e.e.d$a */
    static final class a<T, R> implements InterfaceC9051u<T> {

        /* renamed from: f */
        final InterfaceC9051u<? super R> f35150f;

        /* renamed from: g */
        final InterfaceC9065f<? super T, ? extends R> f35151g;

        a(InterfaceC9051u<? super R> interfaceC9051u, InterfaceC9065f<? super T, ? extends R> interfaceC9065f) {
            this.f35150f = interfaceC9051u;
            this.f35151g = interfaceC9065f;
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            this.f35150f.mo29132b(interfaceC9056c);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            this.f35150f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            try {
                this.f35150f.onSuccess(C9075b.m29271c(this.f35151g.mo4660a(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C9207a.m30000a(th);
                onError(th);
            }
        }
    }

    public C9121d(InterfaceC9053w<? extends T> interfaceC9053w, InterfaceC9065f<? super T, ? extends R> interfaceC9065f) {
        this.f35148a = interfaceC9053w;
        this.f35149b = interfaceC9065f;
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9051u<? super R> interfaceC9051u) {
        this.f35148a.mo29228b(new a(interfaceC9051u, this.f35149b));
    }
}
