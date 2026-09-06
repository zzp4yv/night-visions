package p323h.p324a.p329z.p334e.p339e;

import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p333d.C9084c;

/* compiled from: SingleToObservable.java */
/* renamed from: h.a.z.e.e.f */
/* loaded from: classes2.dex */
public final class C9123f<T> extends AbstractC9043m<T> {

    /* renamed from: f */
    final InterfaceC9053w<? extends T> f35157f;

    /* compiled from: SingleToObservable.java */
    /* renamed from: h.a.z.e.e.f$a */
    static final class a<T> extends C9084c<T> implements InterfaceC9051u<T> {

        /* renamed from: h */
        InterfaceC9056c f35158h;

        a(InterfaceC9047q<? super T> interfaceC9047q) {
            super(interfaceC9047q);
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35158h, interfaceC9056c)) {
                this.f35158h = interfaceC9056c;
                this.f34961f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p329z.p333d.C9084c, p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            super.mo29115k();
            this.f35158h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            m29275d(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            m29274c(t);
        }
    }

    public C9123f(InterfaceC9053w<? extends T> interfaceC9053w) {
        this.f35157f = interfaceC9053w;
    }

    /* renamed from: E */
    public static <T> InterfaceC9051u<T> m29314E(InterfaceC9047q<? super T> interfaceC9047q) {
        return new a(interfaceC9047q);
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f35157f.mo29228b(m29314E(interfaceC9047q));
    }
}
