package p323h.p324a.p329z.p334e.p338d;

import java.util.concurrent.atomic.AtomicBoolean;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: ObservableUnsubscribeOn.java */
/* renamed from: h.a.z.e.d.t */
/* loaded from: classes2.dex */
public final class C9117t<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final AbstractC9048r f35134g;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* renamed from: h.a.z.e.d.t$a */
    static final class a<T> extends AtomicBoolean implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35135f;

        /* renamed from: g */
        final AbstractC9048r f35136g;

        /* renamed from: h */
        InterfaceC9056c f35137h;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: h.a.z.e.d.t$a$a, reason: collision with other inner class name */
        final class RunnableC11482a implements Runnable {
            RunnableC11482a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35137h.mo29115k();
            }
        }

        a(InterfaceC9047q<? super T> interfaceC9047q, AbstractC9048r abstractC9048r) {
            this.f35135f = interfaceC9047q;
            this.f35136g = abstractC9048r;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (get()) {
                return;
            }
            this.f35135f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35137h, interfaceC9056c)) {
                this.f35137h = interfaceC9056c;
                this.f35135f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (compareAndSet(false, true)) {
                this.f35136g.mo29221b(new RunnableC11482a());
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (get()) {
                C9030a.m29147o(th);
            } else {
                this.f35135f.onError(th);
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f35135f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return get();
        }
    }

    public C9117t(InterfaceC9046p<T> interfaceC9046p, AbstractC9048r abstractC9048r) {
        super(interfaceC9046p);
        this.f35134g = abstractC9048r;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35134g));
    }
}
