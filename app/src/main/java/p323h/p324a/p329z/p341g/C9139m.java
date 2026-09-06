package p323h.p324a.p329z.p341g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9057d;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: TrampolineScheduler.java */
/* renamed from: h.a.z.g.m */
/* loaded from: classes2.dex */
public final class C9139m extends AbstractC9048r {

    /* renamed from: b */
    private static final C9139m f35259b = new C9139m();

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: h.a.z.g.m$a */
    static final class a implements Runnable {

        /* renamed from: f */
        private final Runnable f35260f;

        /* renamed from: g */
        private final c f35261g;

        /* renamed from: h */
        private final long f35262h;

        a(Runnable runnable, c cVar, long j2) {
            this.f35260f = runnable;
            this.f35261g = cVar;
            this.f35262h = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35261g.f35270i) {
                return;
            }
            long m29223a = this.f35261g.m29223a(TimeUnit.MILLISECONDS);
            long j2 = this.f35262h;
            if (j2 > m29223a) {
                try {
                    Thread.sleep(j2 - m29223a);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    C9030a.m29147o(e2);
                    return;
                }
            }
            if (this.f35261g.f35270i) {
                return;
            }
            this.f35260f.run();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: h.a.z.g.m$b */
    static final class b implements Comparable<b> {

        /* renamed from: f */
        final Runnable f35263f;

        /* renamed from: g */
        final long f35264g;

        /* renamed from: h */
        final int f35265h;

        /* renamed from: i */
        volatile boolean f35266i;

        b(Runnable runnable, Long l, int i2) {
            this.f35263f = runnable;
            this.f35264g = l.longValue();
            this.f35265h = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int m29270b = C9075b.m29270b(this.f35264g, bVar.f35264g);
            return m29270b == 0 ? C9075b.m29269a(this.f35265h, bVar.f35265h) : m29270b;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: h.a.z.g.m$c */
    static final class c extends AbstractC9048r.b implements InterfaceC9056c {

        /* renamed from: f */
        final PriorityBlockingQueue<b> f35267f = new PriorityBlockingQueue<>();

        /* renamed from: g */
        private final AtomicInteger f35268g = new AtomicInteger();

        /* renamed from: h */
        final AtomicInteger f35269h = new AtomicInteger();

        /* renamed from: i */
        volatile boolean f35270i;

        /* compiled from: TrampolineScheduler.java */
        /* renamed from: h.a.z.g.m$c$a */
        final class a implements Runnable {

            /* renamed from: f */
            final b f35271f;

            a(b bVar) {
                this.f35271f = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35271f.f35266i = true;
                c.this.f35267f.remove(this.f35271f);
            }
        }

        c() {
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: b */
        public InterfaceC9056c mo29224b(Runnable runnable) {
            return m29376d(runnable, m29223a(TimeUnit.MILLISECONDS));
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: c */
        public InterfaceC9056c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long m29223a = m29223a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j2);
            return m29376d(new a(runnable, this, m29223a), m29223a);
        }

        /* renamed from: d */
        InterfaceC9056c m29376d(Runnable runnable, long j2) {
            if (this.f35270i) {
                return EnumC9071d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.f35269h.incrementAndGet());
            this.f35267f.add(bVar);
            if (this.f35268g.getAndIncrement() != 0) {
                return C9057d.m29245d(new a(bVar));
            }
            int i2 = 1;
            while (!this.f35270i) {
                b poll = this.f35267f.poll();
                if (poll == null) {
                    i2 = this.f35268g.addAndGet(-i2);
                    if (i2 == 0) {
                        return EnumC9071d.INSTANCE;
                    }
                } else if (!poll.f35266i) {
                    poll.f35263f.run();
                }
            }
            this.f35267f.clear();
            return EnumC9071d.INSTANCE;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35270i = true;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35270i;
        }
    }

    C9139m() {
    }

    /* renamed from: d */
    public static C9139m m29374d() {
        return f35259b;
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: a */
    public AbstractC9048r.b mo29220a() {
        return new c();
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: b */
    public InterfaceC9056c mo29221b(Runnable runnable) {
        C9030a.m29149q(runnable).run();
        return EnumC9071d.INSTANCE;
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: c */
    public InterfaceC9056c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            C9030a.m29149q(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            C9030a.m29147o(e2);
        }
        return EnumC9071d.INSTANCE;
    }
}
