package p456rx.p461n.p464c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.C11315l;
import p456rx.p461n.p466e.ThreadFactoryC11312i;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11381e;

/* compiled from: EventLoopsScheduler.java */
/* renamed from: rx.n.c.b */
/* loaded from: classes3.dex */
public final class C11289b extends AbstractC11195h implements InterfaceC11298k {

    /* renamed from: f */
    static final int f42760f;

    /* renamed from: g */
    static final c f42761g;

    /* renamed from: h */
    static final b f42762h;

    /* renamed from: i */
    final ThreadFactory f42763i;

    /* renamed from: j */
    final AtomicReference<b> f42764j = new AtomicReference<>(f42762h);

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$a */
    static final class a extends AbstractC11195h.a {

        /* renamed from: f */
        private final C11315l f42765f;

        /* renamed from: g */
        private final C11378b f42766g;

        /* renamed from: h */
        private final C11315l f42767h;

        /* renamed from: i */
        private final c f42768i;

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$a, reason: collision with other inner class name */
        class C11561a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11204a f42769f;

            C11561a(InterfaceC11204a interfaceC11204a) {
                this.f42769f = interfaceC11204a;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f42769f.call();
            }
        }

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$b */
        class b implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11204a f42771f;

            b(InterfaceC11204a interfaceC11204a) {
                this.f42771f = interfaceC11204a;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f42771f.call();
            }
        }

        a(c cVar) {
            C11315l c11315l = new C11315l();
            this.f42765f = c11315l;
            C11378b c11378b = new C11378b();
            this.f42766g = c11378b;
            this.f42767h = new C11315l(c11315l, c11378b);
            this.f42768i = cVar;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            return isUnsubscribed() ? C11381e.m40676c() : this.f42768i.m40398k(new C11561a(interfaceC11204a), 0L, null, this.f42765f);
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            return isUnsubscribed() ? C11381e.m40676c() : this.f42768i.m40399l(new b(interfaceC11204a), j2, timeUnit, this.f42766g);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42767h.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f42767h.unsubscribe();
        }
    }

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$b */
    static final class b {

        /* renamed from: a */
        final int f42773a;

        /* renamed from: b */
        final c[] f42774b;

        /* renamed from: c */
        long f42775c;

        b(ThreadFactory threadFactory, int i2) {
            this.f42773a = i2;
            this.f42774b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f42774b[i3] = new c(threadFactory);
            }
        }

        /* renamed from: a */
        public c m40386a() {
            int i2 = this.f42773a;
            if (i2 == 0) {
                return C11289b.f42761g;
            }
            c[] cVarArr = this.f42774b;
            long j2 = this.f42775c;
            this.f42775c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        /* renamed from: b */
        public void m40387b() {
            for (c cVar : this.f42774b) {
                cVar.unsubscribe();
            }
        }
    }

    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$c */
    static final class c extends C11295h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f42760f = intValue;
        c cVar = new c(ThreadFactoryC11312i.f42888f);
        f42761g = cVar;
        cVar.unsubscribe();
        f42762h = new b(null, 0);
    }

    public C11289b(ThreadFactory threadFactory) {
        this.f42763i = threadFactory;
        start();
    }

    /* renamed from: a */
    public InterfaceC11198k m40385a(InterfaceC11204a interfaceC11204a) {
        return this.f42764j.get().m40386a().m40397j(interfaceC11204a, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new a(this.f42764j.get().m40386a());
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void shutdown() {
        b bVar;
        b bVar2;
        do {
            bVar = this.f42764j.get();
            bVar2 = f42762h;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f42764j.compareAndSet(bVar, bVar2));
        bVar.m40387b();
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void start() {
        b bVar = new b(this.f42763i, f42760f);
        if (this.f42764j.compareAndSet(f42762h, bVar)) {
            return;
        }
        bVar.m40387b();
    }
}
