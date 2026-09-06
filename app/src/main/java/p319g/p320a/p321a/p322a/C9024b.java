package p319g.p320a.p321a.p322a;

import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9036f;
import p323h.p324a.p327x.InterfaceC9056c;
import p456rx.C11183b;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;

/* compiled from: CompletableV2ToCompletableV1.java */
/* renamed from: g.a.a.a.b */
/* loaded from: classes2.dex */
final class C9024b implements C11183b.w {

    /* renamed from: f */
    final InterfaceC9036f f34888f;

    /* compiled from: CompletableV2ToCompletableV1.java */
    /* renamed from: g.a.a.a.b$a */
    static final class a implements InterfaceC9034d, InterfaceC11198k {

        /* renamed from: f */
        final InterfaceC11184c f34889f;

        /* renamed from: g */
        InterfaceC9056c f34890g;

        a(InterfaceC11184c interfaceC11184c) {
            this.f34889f = interfaceC11184c;
        }

        @Override // p323h.p324a.InterfaceC9034d
        /* renamed from: a */
        public void mo29118a() {
            this.f34889f.onCompleted();
        }

        @Override // p323h.p324a.InterfaceC9034d
        /* renamed from: b */
        public void mo29119b(InterfaceC9056c interfaceC9056c) {
            this.f34890g = interfaceC9056c;
            this.f34889f.mo29114a(this);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f34890g.mo29116q();
        }

        @Override // p323h.p324a.InterfaceC9034d
        public void onError(Throwable th) {
            this.f34889f.onError(th);
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f34890g.mo29115k();
        }
    }

    C9024b(InterfaceC9036f interfaceC9036f) {
        this.f34888f = interfaceC9036f;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11184c interfaceC11184c) {
        this.f34888f.mo29160b(new a(interfaceC11184c));
    }
}
