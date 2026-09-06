package p323h.p324a.p329z.p341g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p327x.C9055b;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.C9072e;
import p323h.p324a.p329z.p330a.EnumC9071d;

/* compiled from: ComputationScheduler.java */
/* renamed from: h.a.z.g.b */
/* loaded from: classes2.dex */
public final class C9128b extends AbstractC9048r {

    /* renamed from: b */
    static final b f35182b;

    /* renamed from: c */
    static final ThreadFactoryC9134h f35183c;

    /* renamed from: d */
    static final int f35184d = m29348d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e */
    static final c f35185e;

    /* renamed from: f */
    final ThreadFactory f35186f;

    /* renamed from: g */
    final AtomicReference<b> f35187g;

    /* compiled from: ComputationScheduler.java */
    /* renamed from: h.a.z.g.b$a */
    static final class a extends AbstractC9048r.b {

        /* renamed from: f */
        private final C9072e f35188f;

        /* renamed from: g */
        private final C9055b f35189g;

        /* renamed from: h */
        private final C9072e f35190h;

        /* renamed from: i */
        private final c f35191i;

        /* renamed from: j */
        volatile boolean f35192j;

        a(c cVar) {
            this.f35191i = cVar;
            C9072e c9072e = new C9072e();
            this.f35188f = c9072e;
            C9055b c9055b = new C9055b();
            this.f35189g = c9055b;
            C9072e c9072e2 = new C9072e();
            this.f35190h = c9072e2;
            c9072e2.mo29239b(c9072e);
            c9072e2.mo29239b(c9055b);
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: b */
        public InterfaceC9056c mo29224b(Runnable runnable) {
            return this.f35192j ? EnumC9071d.INSTANCE : this.f35191i.m29361d(runnable, 0L, TimeUnit.MILLISECONDS, this.f35188f);
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: c */
        public InterfaceC9056c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.f35192j ? EnumC9071d.INSTANCE : this.f35191i.m29361d(runnable, j2, timeUnit, this.f35189g);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35192j) {
                return;
            }
            this.f35192j = true;
            this.f35190h.mo29115k();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35192j;
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: h.a.z.g.b$b */
    static final class b {

        /* renamed from: a */
        final int f35193a;

        /* renamed from: b */
        final c[] f35194b;

        /* renamed from: c */
        long f35195c;

        b(int i2, ThreadFactory threadFactory) {
            this.f35193a = i2;
            this.f35194b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f35194b[i3] = new c(threadFactory);
            }
        }

        /* renamed from: a */
        public c m29350a() {
            int i2 = this.f35193a;
            if (i2 == 0) {
                return C9128b.f35185e;
            }
            c[] cVarArr = this.f35194b;
            long j2 = this.f35195c;
            this.f35195c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        /* renamed from: b */
        public void m29351b() {
            for (c cVar : this.f35194b) {
                cVar.mo29115k();
            }
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: h.a.z.g.b$c */
    static final class c extends C9133g {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new ThreadFactoryC9134h("RxComputationShutdown"));
        f35185e = cVar;
        cVar.mo29115k();
        ThreadFactoryC9134h threadFactoryC9134h = new ThreadFactoryC9134h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f35183c = threadFactoryC9134h;
        b bVar = new b(0, threadFactoryC9134h);
        f35182b = bVar;
        bVar.m29351b();
    }

    public C9128b() {
        this(f35183c);
    }

    /* renamed from: d */
    static int m29348d(int i2, int i3) {
        return (i3 <= 0 || i3 > i2) ? i2 : i3;
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: a */
    public AbstractC9048r.b mo29220a() {
        return new a(this.f35187g.get().m29350a());
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: c */
    public InterfaceC9056c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f35187g.get().m29350a().m29362e(runnable, j2, timeUnit);
    }

    /* renamed from: e */
    public void m29349e() {
        b bVar = new b(f35184d, this.f35186f);
        if (this.f35187g.compareAndSet(f35182b, bVar)) {
            return;
        }
        bVar.m29351b();
    }

    public C9128b(ThreadFactory threadFactory) {
        this.f35186f = threadFactory;
        this.f35187g = new AtomicReference<>(f35182b);
        m29349e();
    }
}
