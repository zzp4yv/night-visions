package p323h.p324a.p329z.p334e.p335a;

import p323h.p324a.AbstractC9031b;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;

/* compiled from: CompletableFromSingle.java */
/* renamed from: h.a.z.e.a.c */
/* loaded from: classes2.dex */
public final class C9087c<T> extends AbstractC9031b {

    /* renamed from: a */
    final InterfaceC9053w<T> f34966a;

    /* compiled from: CompletableFromSingle.java */
    /* renamed from: h.a.z.e.a.c$a */
    static final class a<T> implements InterfaceC9051u<T> {

        /* renamed from: f */
        final InterfaceC9034d f34967f;

        a(InterfaceC9034d interfaceC9034d) {
            this.f34967f = interfaceC9034d;
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            this.f34967f.mo29119b(interfaceC9056c);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            this.f34967f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            this.f34967f.mo29118a();
        }
    }

    public C9087c(InterfaceC9053w<T> interfaceC9053w) {
        this.f34966a = interfaceC9053w;
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        this.f34966a.mo29228b(new a(interfaceC9034d));
    }
}
