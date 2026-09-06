package p323h.p324a.p329z.p334e.p335a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9036f;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.C9073f;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: CompletableSubscribeOn.java */
/* renamed from: h.a.z.e.a.d */
/* loaded from: classes2.dex */
public final class C9088d extends AbstractC9031b {

    /* renamed from: a */
    final InterfaceC9036f f34968a;

    /* renamed from: b */
    final AbstractC9048r f34969b;

    /* compiled from: CompletableSubscribeOn.java */
    /* renamed from: h.a.z.e.a.d$a */
    static final class a extends AtomicReference<InterfaceC9056c> implements InterfaceC9034d, InterfaceC9056c, Runnable {

        /* renamed from: f */
        final InterfaceC9034d f34970f;

        /* renamed from: g */
        final C9073f f34971g = new C9073f();

        /* renamed from: h */
        final InterfaceC9036f f34972h;

        a(InterfaceC9034d interfaceC9034d, InterfaceC9036f interfaceC9036f) {
            this.f34970f = interfaceC9034d;
            this.f34972h = interfaceC9036f;
        }

        @Override // p323h.p324a.InterfaceC9034d
        /* renamed from: a */
        public void mo29118a() {
            this.f34970f.mo29118a();
        }

        @Override // p323h.p324a.InterfaceC9034d
        /* renamed from: b */
        public void mo29119b(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29248A(this, interfaceC9056c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
            this.f34971g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9034d
        public void onError(Throwable th) {
            this.f34970f.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34972h.mo29160b(this);
        }
    }

    public C9088d(InterfaceC9036f interfaceC9036f, AbstractC9048r abstractC9048r) {
        this.f34968a = interfaceC9036f;
        this.f34969b = abstractC9048r;
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        a aVar = new a(interfaceC9034d, this.f34968a);
        interfaceC9034d.mo29119b(aVar);
        aVar.f34971g.m29261a(this.f34969b.mo29221b(aVar));
    }
}
