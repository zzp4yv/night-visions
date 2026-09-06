package p323h.p324a.p329z.p334e.p336b;

import p323h.p324a.AbstractC9038h;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p327x.InterfaceC9056c;
import p355k.p356a.InterfaceC9696b;
import p355k.p356a.InterfaceC9697c;

/* compiled from: FlowableFromObservable.java */
/* renamed from: h.a.z.e.b.b */
/* loaded from: classes2.dex */
public final class C9090b<T> extends AbstractC9038h<T> {

    /* renamed from: b */
    private final AbstractC9043m<T> f34974b;

    /* compiled from: FlowableFromObservable.java */
    /* renamed from: h.a.z.e.b.b$a */
    static final class a<T> implements InterfaceC9047q<T>, InterfaceC9697c {

        /* renamed from: f */
        final InterfaceC9696b<? super T> f34975f;

        /* renamed from: g */
        InterfaceC9056c f34976g;

        a(InterfaceC9696b<? super T> interfaceC9696b) {
            this.f34975f = interfaceC9696b;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            this.f34975f.mo29121a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            this.f34976g = interfaceC9056c;
            this.f34975f.mo29122b(this);
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void cancel() {
            this.f34976g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            this.f34975f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            this.f34975f.onNext(t);
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void request(long j2) {
        }
    }

    public C9090b(AbstractC9043m<T> abstractC9043m) {
        this.f34974b = abstractC9043m;
    }

    @Override // p323h.p324a.AbstractC9038h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9696b<? super T> interfaceC9696b) {
        this.f34974b.mo29199a(new a(interfaceC9696b));
    }
}
