package p456rx.p461n.p464c;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p474t.C11377a;
import p456rx.p474t.C11381e;

/* compiled from: TrampolineScheduler.java */
/* renamed from: rx.n.c.n */
/* loaded from: classes3.dex */
public final class C11301n extends AbstractC11195h {

    /* renamed from: a */
    public static final C11301n f42848a = new C11301n();

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: rx.n.c.n$a */
    static final class a extends AbstractC11195h.a implements InterfaceC11198k {

        /* renamed from: f */
        final AtomicInteger f42849f = new AtomicInteger();

        /* renamed from: g */
        final PriorityBlockingQueue<b> f42850g = new PriorityBlockingQueue<>();

        /* renamed from: h */
        private final C11377a f42851h = new C11377a();

        /* renamed from: i */
        private final AtomicInteger f42852i = new AtomicInteger();

        /* compiled from: TrampolineScheduler.java */
        /* renamed from: rx.n.c.n$a$a, reason: collision with other inner class name */
        class C11564a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ b f42853f;

            C11564a(b bVar) {
                this.f42853f = bVar;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a.this.f42850g.remove(this.f42853f);
            }
        }

        a() {
        }

        /* renamed from: f */
        private InterfaceC11198k m40412f(InterfaceC11204a interfaceC11204a, long j2) {
            if (this.f42851h.isUnsubscribed()) {
                return C11381e.m40676c();
            }
            b bVar = new b(interfaceC11204a, Long.valueOf(j2), this.f42849f.incrementAndGet());
            this.f42850g.add(bVar);
            if (this.f42852i.getAndIncrement() != 0) {
                return C11381e.m40674a(new C11564a(bVar));
            }
            do {
                b poll = this.f42850g.poll();
                if (poll != null) {
                    poll.f42855f.call();
                }
            } while (this.f42852i.decrementAndGet() > 0);
            return C11381e.m40676c();
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            return m40412f(interfaceC11204a, mo40145b());
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            long mo40145b = mo40145b() + timeUnit.toMillis(j2);
            return m40412f(new C11300m(interfaceC11204a, this, mo40145b), mo40145b);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42851h.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f42851h.unsubscribe();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: rx.n.c.n$b */
    static final class b implements Comparable<b> {

        /* renamed from: f */
        final InterfaceC11204a f42855f;

        /* renamed from: g */
        final Long f42856g;

        /* renamed from: h */
        final int f42857h;

        b(InterfaceC11204a interfaceC11204a, Long l, int i2) {
            this.f42855f = interfaceC11204a;
            this.f42856g = l;
            this.f42857h = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int compareTo = this.f42856g.compareTo(bVar.f42856g);
            return compareTo == 0 ? C11301n.m40411a(this.f42857h, bVar.f42857h) : compareTo;
        }
    }

    private C11301n() {
    }

    /* renamed from: a */
    static int m40411a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new a();
    }
}
