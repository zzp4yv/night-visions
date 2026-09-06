package p323h.p324a.p329z.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.C9073f;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: SingleSubscribeOn.java */
/* renamed from: h.a.z.e.e.e */
/* loaded from: classes2.dex */
public final class C9122e<T> extends AbstractC9049s<T> {

    /* renamed from: a */
    final InterfaceC9053w<? extends T> f35152a;

    /* renamed from: b */
    final AbstractC9048r f35153b;

    /* compiled from: SingleSubscribeOn.java */
    /* renamed from: h.a.z.e.e.e$a */
    static final class a<T> extends AtomicReference<InterfaceC9056c> implements InterfaceC9051u<T>, InterfaceC9056c, Runnable {

        /* renamed from: f */
        final InterfaceC9051u<? super T> f35154f;

        /* renamed from: g */
        final C9073f f35155g = new C9073f();

        /* renamed from: h */
        final InterfaceC9053w<? extends T> f35156h;

        a(InterfaceC9051u<? super T> interfaceC9051u, InterfaceC9053w<? extends T> interfaceC9053w) {
            this.f35154f = interfaceC9051u;
            this.f35156h = interfaceC9053w;
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29248A(this, interfaceC9056c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
            this.f35155g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            this.f35154f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            this.f35154f.onSuccess(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35156h.mo29228b(this);
        }
    }

    public C9122e(InterfaceC9053w<? extends T> interfaceC9053w, AbstractC9048r abstractC9048r) {
        this.f35152a = interfaceC9053w;
        this.f35153b = abstractC9048r;
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9051u<? super T> interfaceC9051u) {
        a aVar = new a(interfaceC9051u, this.f35152a);
        interfaceC9051u.mo29132b(aVar);
        aVar.f35155g.m29261a(this.f35153b.mo29221b(aVar));
    }
}
