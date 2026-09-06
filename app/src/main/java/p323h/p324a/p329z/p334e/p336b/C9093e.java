package p323h.p324a.p329z.p334e.p336b;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.AbstractC9038h;
import p323h.p324a.InterfaceC9039i;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p343i.EnumC9142b;
import p323h.p324a.p329z.p344j.C9144b;
import p355k.p356a.InterfaceC9696b;
import p355k.p356a.InterfaceC9697c;

/* compiled from: FlowableOnBackpressureError.java */
/* renamed from: h.a.z.e.b.e */
/* loaded from: classes2.dex */
public final class C9093e<T> extends AbstractC9089a<T, T> {

    /* compiled from: FlowableOnBackpressureError.java */
    /* renamed from: h.a.z.e.b.e$a */
    static final class a<T> extends AtomicLong implements InterfaceC9039i<T>, InterfaceC9697c {

        /* renamed from: f */
        final InterfaceC9696b<? super T> f34996f;

        /* renamed from: g */
        InterfaceC9697c f34997g;

        /* renamed from: h */
        boolean f34998h;

        a(InterfaceC9696b<? super T> interfaceC9696b) {
            this.f34996f = interfaceC9696b;
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: a */
        public void mo29121a() {
            if (this.f34998h) {
                return;
            }
            this.f34998h = true;
            this.f34996f.mo29121a();
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: b */
        public void mo29122b(InterfaceC9697c interfaceC9697c) {
            if (EnumC9142b.m29383y(this.f34997g, interfaceC9697c)) {
                this.f34997g = interfaceC9697c;
                this.f34996f.mo29122b(this);
                interfaceC9697c.request(Long.MAX_VALUE);
            }
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void cancel() {
            this.f34997g.cancel();
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onError(Throwable th) {
            if (this.f34998h) {
                C9030a.m29147o(th);
            } else {
                this.f34998h = true;
                this.f34996f.onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onNext(T t) {
            if (this.f34998h) {
                return;
            }
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.f34996f.onNext(t);
                C9144b.m29388c(this, 1L);
            }
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void request(long j2) {
            if (EnumC9142b.m29382x(j2)) {
                C9144b.m29386a(this, j2);
            }
        }
    }

    public C9093e(AbstractC9038h<T> abstractC9038h) {
        super(abstractC9038h);
    }

    @Override // p323h.p324a.AbstractC9038h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9696b<? super T> interfaceC9696b) {
        this.f34973b.m29178h(new a(interfaceC9696b));
    }
}
