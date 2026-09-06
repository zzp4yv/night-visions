package p353j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10742u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9764k;
import kotlin.jvm.internal.C9768m;

/* compiled from: Timeout.kt */
/* renamed from: j.e0 */
/* loaded from: classes3.dex */
public class C9669e0 {
    public static final b Companion = new b(null);
    public static final C9669e0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    /* renamed from: j.e0$a */
    public static final class a extends C9669e0 {
        a() {
        }

        @Override // p353j.C9669e0
        public C9669e0 deadlineNanoTime(long j2) {
            return this;
        }

        @Override // p353j.C9669e0
        public void throwIfReached() {
        }

        @Override // p353j.C9669e0
        public C9669e0 timeout(long j2, TimeUnit timeUnit) {
            C9768m.m32346f(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    /* renamed from: j.e0$b */
    public static final class b {
        private b() {
        }

        /* renamed from: a */
        public final long m31994a(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }
    }

    public C9669e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C9669e0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C9669e0 deadline(long j2, TimeUnit timeUnit) {
        C9768m.m32346f(timeUnit, "unit");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(C9669e0 c9669e0, Function0<C10742u> function0) {
        C9768m.m32346f(c9669e0, "other");
        C9768m.m32346f(function0, "block");
        long timeoutNanos = timeoutNanos();
        long m31994a = Companion.m31994a(c9669e0.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(m31994a, timeUnit);
        if (!hasDeadline()) {
            if (c9669e0.hasDeadline()) {
                deadlineNanoTime(c9669e0.deadlineNanoTime());
            }
            try {
                function0.invoke();
                C9764k.m32324b(1);
                timeout(timeoutNanos, timeUnit);
                if (c9669e0.hasDeadline()) {
                    clearDeadline();
                }
                C9764k.m32323a(1);
                return;
            } catch (Throwable th) {
                C9764k.m32324b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (c9669e0.hasDeadline()) {
                    clearDeadline();
                }
                C9764k.m32323a(1);
                throw th;
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (c9669e0.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), c9669e0.deadlineNanoTime()));
        }
        try {
            function0.invoke();
            C9764k.m32324b(1);
            timeout(timeoutNanos, timeUnit);
            if (c9669e0.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            C9764k.m32323a(1);
        } catch (Throwable th2) {
            C9764k.m32324b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (c9669e0.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            C9764k.m32323a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        Thread currentThread = Thread.currentThread();
        C9768m.m32345e(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C9669e0 timeout(long j2, TimeUnit timeUnit) {
        C9768m.m32346f(timeUnit, "unit");
        if (j2 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        C9768m.m32346f(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j2 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j3 = timeoutNanos / 1000000;
                Long.signum(j3);
                obj.wait(j3, (int) (timeoutNanos - (1000000 * j3)));
                j2 = System.nanoTime() - nanoTime;
            }
            if (j2 >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C9669e0 deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }
}
