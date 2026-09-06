package p323h.p324a.p329z.p334e.p336b;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.AbstractC9038h;
import p323h.p324a.InterfaceC9039i;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p329z.p343i.EnumC9142b;
import p323h.p324a.p329z.p344j.C9144b;
import p355k.p356a.InterfaceC9696b;
import p355k.p356a.InterfaceC9697c;

/* compiled from: FlowableOnBackpressureDrop.java */
/* renamed from: h.a.z.e.b.d */
/* loaded from: classes2.dex */
public final class C9092d<T> extends AbstractC9089a<T, T> implements InterfaceC9064e<T> {

    /* renamed from: c */
    final InterfaceC9064e<? super T> f34991c;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* renamed from: h.a.z.e.b.d$a */
    static final class a<T> extends AtomicLong implements InterfaceC9039i<T>, InterfaceC9697c {

        /* renamed from: f */
        final InterfaceC9696b<? super T> f34992f;

        /* renamed from: g */
        final InterfaceC9064e<? super T> f34993g;

        /* renamed from: h */
        InterfaceC9697c f34994h;

        /* renamed from: i */
        boolean f34995i;

        a(InterfaceC9696b<? super T> interfaceC9696b, InterfaceC9064e<? super T> interfaceC9064e) {
            this.f34992f = interfaceC9696b;
            this.f34993g = interfaceC9064e;
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: a */
        public void mo29121a() {
            if (this.f34995i) {
                return;
            }
            this.f34995i = true;
            this.f34992f.mo29121a();
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: b */
        public void mo29122b(InterfaceC9697c interfaceC9697c) {
            if (EnumC9142b.m29383y(this.f34994h, interfaceC9697c)) {
                this.f34994h = interfaceC9697c;
                this.f34992f.mo29122b(this);
                interfaceC9697c.request(Long.MAX_VALUE);
            }
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void cancel() {
            this.f34994h.cancel();
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onError(Throwable th) {
            if (this.f34995i) {
                C9030a.m29147o(th);
            } else {
                this.f34995i = true;
                this.f34992f.onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onNext(T t) {
            if (this.f34995i) {
                return;
            }
            if (get() != 0) {
                this.f34992f.onNext(t);
                C9144b.m29388c(this, 1L);
                return;
            }
            try {
                this.f34993g.mo7420a(t);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                cancel();
                onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void request(long j2) {
            if (EnumC9142b.m29382x(j2)) {
                C9144b.m29386a(this, j2);
            }
        }
    }

    public C9092d(AbstractC9038h<T> abstractC9038h) {
        super(abstractC9038h);
        this.f34991c = this;
    }

    @Override // p323h.p324a.p328y.InterfaceC9064e
    /* renamed from: a */
    public void mo7420a(T t) {
    }

    @Override // p323h.p324a.AbstractC9038h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9696b<? super T> interfaceC9696b) {
        this.f34973b.m29178h(new a(interfaceC9696b, this.f34991c));
    }
}
