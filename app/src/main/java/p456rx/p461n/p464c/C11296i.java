package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p465d.C11302a;

/* compiled from: SchedulePeriodicHelper.java */
/* renamed from: rx.n.c.i */
/* loaded from: classes3.dex */
public final class C11296i {

    /* renamed from: a */
    public static final long f42807a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: SchedulePeriodicHelper.java */
    /* renamed from: rx.n.c.i$a */
    static class a implements InterfaceC11204a {

        /* renamed from: f */
        long f42808f;

        /* renamed from: g */
        long f42809g;

        /* renamed from: h */
        long f42810h;

        /* renamed from: i */
        final /* synthetic */ long f42811i;

        /* renamed from: j */
        final /* synthetic */ long f42812j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11204a f42813k;

        /* renamed from: l */
        final /* synthetic */ C11302a f42814l;

        /* renamed from: m */
        final /* synthetic */ b f42815m;

        /* renamed from: n */
        final /* synthetic */ AbstractC11195h.a f42816n;

        /* renamed from: o */
        final /* synthetic */ long f42817o;

        a(long j2, long j3, InterfaceC11204a interfaceC11204a, C11302a c11302a, b bVar, AbstractC11195h.a aVar, long j4) {
            this.f42811i = j2;
            this.f42812j = j3;
            this.f42813k = interfaceC11204a;
            this.f42814l = c11302a;
            this.f42815m = bVar;
            this.f42816n = aVar;
            this.f42817o = j4;
            this.f42809g = j2;
            this.f42810h = j3;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            long j2;
            this.f42813k.call();
            if (this.f42814l.isUnsubscribed()) {
                return;
            }
            b bVar = this.f42815m;
            long mo40401a = bVar != null ? bVar.mo40401a() : TimeUnit.MILLISECONDS.toNanos(this.f42816n.mo40145b());
            long j3 = C11296i.f42807a;
            long j4 = mo40401a + j3;
            long j5 = this.f42809g;
            if (j4 >= j5) {
                long j6 = this.f42817o;
                if (mo40401a < j5 + j6 + j3) {
                    long j7 = this.f42810h;
                    long j8 = this.f42808f + 1;
                    this.f42808f = j8;
                    j2 = j7 + (j8 * j6);
                    this.f42809g = mo40401a;
                    this.f42814l.m40415b(this.f42816n.mo40147d(this, j2 - mo40401a, TimeUnit.NANOSECONDS));
                }
            }
            long j9 = this.f42817o;
            long j10 = mo40401a + j9;
            long j11 = this.f42808f + 1;
            this.f42808f = j11;
            this.f42810h = j10 - (j9 * j11);
            j2 = j10;
            this.f42809g = mo40401a;
            this.f42814l.m40415b(this.f42816n.mo40147d(this, j2 - mo40401a, TimeUnit.NANOSECONDS));
        }
    }

    /* compiled from: SchedulePeriodicHelper.java */
    /* renamed from: rx.n.c.i$b */
    public interface b {
        /* renamed from: a */
        long mo40401a();
    }

    /* renamed from: a */
    public static InterfaceC11198k m40400a(AbstractC11195h.a aVar, InterfaceC11204a interfaceC11204a, long j2, long j3, TimeUnit timeUnit, b bVar) {
        long nanos = timeUnit.toNanos(j3);
        long mo40401a = bVar != null ? bVar.mo40401a() : TimeUnit.MILLISECONDS.toNanos(aVar.mo40145b());
        long nanos2 = timeUnit.toNanos(j2) + mo40401a;
        C11302a c11302a = new C11302a();
        C11302a c11302a2 = new C11302a(c11302a);
        c11302a.m40415b(aVar.mo40147d(new a(mo40401a, nanos2, interfaceC11204a, c11302a2, bVar, aVar, nanos), j2, timeUnit));
        return c11302a2;
    }
}
