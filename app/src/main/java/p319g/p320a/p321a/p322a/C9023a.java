package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9031b;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.p327x.InterfaceC9056c;
import p456rx.C11183b;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;

/* compiled from: CompletableV1ToCompletableV2.java */
/* renamed from: g.a.a.a.a */
/* loaded from: classes2.dex */
final class C9023a extends AbstractC9031b {

    /* renamed from: a */
    final C11183b f34885a;

    /* compiled from: CompletableV1ToCompletableV2.java */
    /* renamed from: g.a.a.a.a$a */
    static final class a implements InterfaceC11184c, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9034d f34886f;

        /* renamed from: g */
        InterfaceC11198k f34887g;

        a(InterfaceC9034d interfaceC9034d) {
            this.f34886f = interfaceC9034d;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f34887g = interfaceC11198k;
            this.f34886f.mo29119b(this);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f34887g.unsubscribe();
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            this.f34886f.mo29118a();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            this.f34886f.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f34887g.isUnsubscribed();
        }
    }

    C9023a(C11183b c11183b) {
        this.f34885a = c11183b;
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        this.f34885a.m39966J(new a(interfaceC9034d));
    }
}
