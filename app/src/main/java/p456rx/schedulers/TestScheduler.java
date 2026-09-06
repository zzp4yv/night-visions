package p456rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p464c.C11296i;
import p456rx.p474t.C11377a;
import p456rx.p474t.C11381e;

/* loaded from: classes3.dex */
public class TestScheduler extends AbstractC11195h {

    /* renamed from: a */
    static long f43071a;

    /* renamed from: b */
    final Queue<C11376c> f43072b = new PriorityQueue(11, new C11374a());

    /* renamed from: c */
    long f43073c;

    /* renamed from: rx.schedulers.TestScheduler$a */
    static final class C11374a implements Comparator<C11376c> {
        C11374a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C11376c c11376c, C11376c c11376c2) {
            long j2 = c11376c.f43080a;
            long j3 = c11376c2.f43080a;
            if (j2 == j3) {
                if (c11376c.f43083d < c11376c2.f43083d) {
                    return -1;
                }
                return c11376c.f43083d > c11376c2.f43083d ? 1 : 0;
            }
            if (j2 < j3) {
                return -1;
            }
            return j2 > j3 ? 1 : 0;
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    final class C11375b extends AbstractC11195h.a implements C11296i.b {

        /* renamed from: f */
        private final C11377a f43074f = new C11377a();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        class a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ C11376c f43076f;

            a(C11376c c11376c) {
                this.f43076f = c11376c;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                TestScheduler.this.f43072b.remove(this.f43076f);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        class b implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ C11376c f43078f;

            b(C11376c c11376c) {
                this.f43078f = c11376c;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                TestScheduler.this.f43072b.remove(this.f43078f);
            }
        }

        C11375b() {
        }

        @Override // p456rx.p461n.p464c.C11296i.b
        /* renamed from: a */
        public long mo40401a() {
            return TestScheduler.this.f43073c;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: b */
        public long mo40145b() {
            return TestScheduler.this.now();
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            C11376c c11376c = new C11376c(this, 0L, interfaceC11204a);
            TestScheduler.this.f43072b.add(c11376c);
            return C11381e.m40674a(new b(c11376c));
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            C11376c c11376c = new C11376c(this, TestScheduler.this.f43073c + timeUnit.toNanos(j2), interfaceC11204a);
            TestScheduler.this.f43072b.add(c11376c);
            return C11381e.m40674a(new a(c11376c));
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: e */
        public InterfaceC11198k mo40148e(InterfaceC11204a interfaceC11204a, long j2, long j3, TimeUnit timeUnit) {
            return C11296i.m40400a(this, interfaceC11204a, j2, j3, timeUnit, this);
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f43074f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f43074f.unsubscribe();
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    static final class C11376c {

        /* renamed from: a */
        final long f43080a;

        /* renamed from: b */
        final InterfaceC11204a f43081b;

        /* renamed from: c */
        final AbstractC11195h.a f43082c;

        /* renamed from: d */
        private final long f43083d;

        C11376c(AbstractC11195h.a aVar, long j2, InterfaceC11204a interfaceC11204a) {
            long j3 = TestScheduler.f43071a;
            TestScheduler.f43071a = 1 + j3;
            this.f43083d = j3;
            this.f43080a = j2;
            this.f43081b = interfaceC11204a;
            this.f43082c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f43080a), this.f43081b.toString());
        }
    }

    /* renamed from: a */
    private void m40661a(long j2) {
        while (!this.f43072b.isEmpty()) {
            C11376c peek = this.f43072b.peek();
            long j3 = peek.f43080a;
            if (j3 > j2) {
                break;
            }
            if (j3 == 0) {
                j3 = this.f43073c;
            }
            this.f43073c = j3;
            this.f43072b.remove();
            if (!peek.f43082c.isUnsubscribed()) {
                peek.f43081b.call();
            }
        }
        this.f43073c = j2;
    }

    public void advanceTimeBy(long j2, TimeUnit timeUnit) {
        advanceTimeTo(this.f43073c + timeUnit.toNanos(j2), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j2, TimeUnit timeUnit) {
        m40661a(timeUnit.toNanos(j2));
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new C11375b();
    }

    @Override // p456rx.AbstractC11195h
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f43073c);
    }

    public void triggerActions() {
        m40661a(this.f43073c);
    }
}
