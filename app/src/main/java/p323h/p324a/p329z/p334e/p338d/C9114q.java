package p323h.p324a.p329z.p334e.p338d;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: ObservableSubscribeOn.java */
/* renamed from: h.a.z.e.d.q */
/* loaded from: classes2.dex */
public final class C9114q<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final AbstractC9048r f35120g;

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: h.a.z.e.d.q$a */
    static final class a<T> extends AtomicReference<InterfaceC9056c> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35121f;

        /* renamed from: g */
        final AtomicReference<InterfaceC9056c> f35122g = new AtomicReference<>();

        a(InterfaceC9047q<? super T> interfaceC9047q) {
            this.f35121f = interfaceC9047q;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            this.f35121f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29248A(this.f35122g, interfaceC9056c);
        }

        /* renamed from: c */
        void m29311c(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29248A(this, interfaceC9056c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this.f35122g);
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            this.f35121f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            this.f35121f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: h.a.z.e.d.q$b */
    final class b implements Runnable {

        /* renamed from: f */
        private final a<T> f35123f;

        b(a<T> aVar) {
            this.f35123f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9114q.this.f35009f.mo29199a(this.f35123f);
        }
    }

    public C9114q(InterfaceC9046p<T> interfaceC9046p, AbstractC9048r abstractC9048r) {
        super(interfaceC9046p);
        this.f35120g = abstractC9048r;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        a aVar = new a(interfaceC9047q);
        interfaceC9047q.mo29219b(aVar);
        aVar.m29311c(this.f35120g.mo29221b(new b(aVar)));
    }
}
