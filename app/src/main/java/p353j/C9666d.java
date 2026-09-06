package p353j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10742u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9764k;
import kotlin.jvm.internal.C9768m;

/* compiled from: AsyncTimeout.kt */
/* renamed from: j.d */
/* loaded from: classes3.dex */
public class C9666d extends C9669e0 {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static C9666d head;
    private boolean inQueue;
    private C9666d next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m31989d(C9666d c9666d) {
            synchronized (C9666d.class) {
                if (!c9666d.inQueue) {
                    return false;
                }
                c9666d.inQueue = false;
                for (C9666d c9666d2 = C9666d.head; c9666d2 != null; c9666d2 = c9666d2.next) {
                    if (c9666d2.next == c9666d) {
                        c9666d2.next = c9666d.next;
                        c9666d.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m31990e(C9666d c9666d, long j2, boolean z) {
            synchronized (C9666d.class) {
                if (!(!c9666d.inQueue)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                c9666d.inQueue = true;
                if (C9666d.head == null) {
                    C9666d.head = new C9666d();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    c9666d.timeoutAt = Math.min(j2, c9666d.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    c9666d.timeoutAt = j2 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    c9666d.timeoutAt = c9666d.deadlineNanoTime();
                }
                long remainingNanos = c9666d.remainingNanos(nanoTime);
                C9666d c9666d2 = C9666d.head;
                C9768m.m32343c(c9666d2);
                while (c9666d2.next != null) {
                    C9666d c9666d3 = c9666d2.next;
                    C9768m.m32343c(c9666d3);
                    if (remainingNanos < c9666d3.remainingNanos(nanoTime)) {
                        break;
                    }
                    c9666d2 = c9666d2.next;
                    C9768m.m32343c(c9666d2);
                }
                c9666d.next = c9666d2.next;
                c9666d2.next = c9666d;
                if (c9666d2 == C9666d.head) {
                    C9666d.class.notify();
                }
                C10742u c10742u = C10742u.f41439a;
            }
        }

        /* renamed from: c */
        public final C9666d m31991c() throws InterruptedException {
            C9666d c9666d = C9666d.head;
            C9768m.m32343c(c9666d);
            C9666d c9666d2 = c9666d.next;
            if (c9666d2 == null) {
                long nanoTime = System.nanoTime();
                C9666d.class.wait(C9666d.IDLE_TIMEOUT_MILLIS);
                C9666d c9666d3 = C9666d.head;
                C9768m.m32343c(c9666d3);
                if (c9666d3.next != null || System.nanoTime() - nanoTime < C9666d.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C9666d.head;
            }
            long remainingNanos = c9666d2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j2 = remainingNanos / 1000000;
                C9666d.class.wait(j2, (int) (remainingNanos - (1000000 * j2)));
                return null;
            }
            C9666d c9666d4 = C9666d.head;
            C9768m.m32343c(c9666d4);
            c9666d4.next = c9666d2.next;
            c9666d2.next = null;
            return c9666d2;
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C9666d m31991c;
            while (true) {
                try {
                    synchronized (C9666d.class) {
                        try {
                            m31991c = C9666d.Companion.m31991c();
                            if (m31991c == C9666d.head) {
                                C9666d.head = null;
                                return;
                            }
                            C10742u c10742u = C10742u.f41439a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (m31991c != null) {
                        m31991c.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$c */
    public static final class c implements InterfaceC9663b0 {

        /* renamed from: g */
        final /* synthetic */ InterfaceC9663b0 f37035g;

        c(InterfaceC9663b0 interfaceC9663b0) {
            this.f37035g = interfaceC9663b0;
        }

        @Override // p353j.InterfaceC9663b0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9666d timeout() {
            return C9666d.this;
        }

        @Override // p353j.InterfaceC9663b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9666d c9666d = C9666d.this;
            c9666d.enter();
            try {
                this.f37035g.close();
                C10742u c10742u = C10742u.f41439a;
                if (c9666d.exit()) {
                    throw c9666d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9666d.exit()) {
                    throw e2;
                }
                throw c9666d.access$newTimeoutException(e2);
            } finally {
                c9666d.exit();
            }
        }

        @Override // p353j.InterfaceC9663b0, java.io.Flushable
        public void flush() {
            C9666d c9666d = C9666d.this;
            c9666d.enter();
            try {
                this.f37035g.flush();
                C10742u c10742u = C10742u.f41439a;
                if (c9666d.exit()) {
                    throw c9666d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9666d.exit()) {
                    throw e2;
                }
                throw c9666d.access$newTimeoutException(e2);
            } finally {
                c9666d.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f37035g + ')';
        }

        @Override // p353j.InterfaceC9663b0
        public void write(C9670f c9670f, long j2) {
            C9768m.m32346f(c9670f, "source");
            C9664c.m31982b(c9670f.size(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                C9693y c9693y = c9670f.f37038f;
                C9768m.m32343c(c9693y);
                while (true) {
                    if (j3 >= C9666d.TIMEOUT_WRITE_SIZE) {
                        break;
                    }
                    j3 += c9693y.f37093d - c9693y.f37092c;
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        c9693y = c9693y.f37096g;
                        C9768m.m32343c(c9693y);
                    }
                }
                C9666d c9666d = C9666d.this;
                c9666d.enter();
                try {
                    this.f37035g.write(c9670f, j3);
                    C10742u c10742u = C10742u.f41439a;
                    if (c9666d.exit()) {
                        throw c9666d.access$newTimeoutException(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    if (!c9666d.exit()) {
                        throw e2;
                    }
                    throw c9666d.access$newTimeoutException(e2);
                } finally {
                    c9666d.exit();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$d */
    public static final class d implements InterfaceC9667d0 {

        /* renamed from: g */
        final /* synthetic */ InterfaceC9667d0 f37037g;

        d(InterfaceC9667d0 interfaceC9667d0) {
            this.f37037g = interfaceC9667d0;
        }

        @Override // p353j.InterfaceC9667d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9666d timeout() {
            return C9666d.this;
        }

        @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9666d c9666d = C9666d.this;
            c9666d.enter();
            try {
                this.f37037g.close();
                C10742u c10742u = C10742u.f41439a;
                if (c9666d.exit()) {
                    throw c9666d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9666d.exit()) {
                    throw e2;
                }
                throw c9666d.access$newTimeoutException(e2);
            } finally {
                c9666d.exit();
            }
        }

        @Override // p353j.InterfaceC9667d0
        public long read(C9670f c9670f, long j2) {
            C9768m.m32346f(c9670f, "sink");
            C9666d c9666d = C9666d.this;
            c9666d.enter();
            try {
                long read = this.f37037g.read(c9670f, j2);
                if (c9666d.exit()) {
                    throw c9666d.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e2) {
                if (c9666d.exit()) {
                    throw c9666d.access$newTimeoutException(e2);
                }
                throw e2;
            } finally {
                c9666d.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f37037g + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.m31990e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.m31989d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC9663b0 sink(InterfaceC9663b0 interfaceC9663b0) {
        C9768m.m32346f(interfaceC9663b0, "sink");
        return new c(interfaceC9663b0);
    }

    public final InterfaceC9667d0 source(InterfaceC9667d0 interfaceC9667d0) {
        C9768m.m32346f(interfaceC9667d0, "source");
        return new d(interfaceC9667d0);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> function0) {
        C9768m.m32346f(function0, "block");
        enter();
        try {
            try {
                T invoke = function0.invoke();
                C9764k.m32324b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                C9764k.m32323a(1);
                return invoke;
            } catch (IOException e2) {
                if (exit()) {
                    throw access$newTimeoutException(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            C9764k.m32324b(1);
            exit();
            C9764k.m32323a(1);
            throw th;
        }
    }
}
