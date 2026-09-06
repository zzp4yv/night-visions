package p323h.p324a.p329z.p334e.p336b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9038h;
import p323h.p324a.InterfaceC9039i;
import p323h.p324a.p329z.p343i.EnumC9142b;
import p323h.p324a.p329z.p344j.C9144b;
import p355k.p356a.InterfaceC9696b;
import p355k.p356a.InterfaceC9697c;

/* compiled from: FlowableOnBackpressureLatest.java */
/* renamed from: h.a.z.e.b.f */
/* loaded from: classes2.dex */
public final class C9094f<T> extends AbstractC9089a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    /* renamed from: h.a.z.e.b.f$a */
    static final class a<T> extends AtomicInteger implements InterfaceC9039i<T>, InterfaceC9697c {

        /* renamed from: f */
        final InterfaceC9696b<? super T> f34999f;

        /* renamed from: g */
        InterfaceC9697c f35000g;

        /* renamed from: h */
        volatile boolean f35001h;

        /* renamed from: i */
        Throwable f35002i;

        /* renamed from: j */
        volatile boolean f35003j;

        /* renamed from: k */
        final AtomicLong f35004k = new AtomicLong();

        /* renamed from: l */
        final AtomicReference<T> f35005l = new AtomicReference<>();

        a(InterfaceC9696b<? super T> interfaceC9696b) {
            this.f34999f = interfaceC9696b;
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: a */
        public void mo29121a() {
            this.f35001h = true;
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9696b
        /* renamed from: b */
        public void mo29122b(InterfaceC9697c interfaceC9697c) {
            if (EnumC9142b.m29383y(this.f35000g, interfaceC9697c)) {
                this.f35000g = interfaceC9697c;
                this.f34999f.mo29122b(this);
                interfaceC9697c.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        boolean m29279c(boolean z, boolean z2, InterfaceC9696b<?> interfaceC9696b, AtomicReference<T> atomicReference) {
            if (this.f35003j) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f35002i;
            if (th != null) {
                atomicReference.lazySet(null);
                interfaceC9696b.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC9696b.mo29121a();
            return true;
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void cancel() {
            if (this.f35003j) {
                return;
            }
            this.f35003j = true;
            this.f35000g.cancel();
            if (getAndIncrement() == 0) {
                this.f35005l.lazySet(null);
            }
        }

        /* renamed from: d */
        void m29280d() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC9696b<? super T> interfaceC9696b = this.f34999f;
            AtomicLong atomicLong = this.f35004k;
            AtomicReference<T> atomicReference = this.f35005l;
            int i2 = 1;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.f35001h;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (m29279c(z, z2, interfaceC9696b, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC9696b.onNext(andSet);
                    j2++;
                }
                if (j2 == atomicLong.get()) {
                    if (m29279c(this.f35001h, atomicReference.get() == null, interfaceC9696b, atomicReference)) {
                        return;
                    }
                }
                if (j2 != 0) {
                    C9144b.m29388c(atomicLong, j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onError(Throwable th) {
            this.f35002i = th;
            this.f35001h = true;
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9696b
        public void onNext(T t) {
            this.f35005l.lazySet(t);
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9697c
        public void request(long j2) {
            if (EnumC9142b.m29382x(j2)) {
                C9144b.m29386a(this.f35004k, j2);
                m29280d();
            }
        }
    }

    public C9094f(AbstractC9038h<T> abstractC9038h) {
        super(abstractC9038h);
    }

    @Override // p323h.p324a.AbstractC9038h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9696b<? super T> interfaceC9696b) {
        this.f34973b.m29178h(new a(interfaceC9696b));
    }
}
