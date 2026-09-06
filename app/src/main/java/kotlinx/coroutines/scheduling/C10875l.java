package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.C9815l;
import kotlinx.coroutines.internal.C10947f0;
import kotlinx.coroutines.internal.C10951h0;
import okhttp3.HttpUrl;

/* compiled from: Tasks.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010*\u00020\u00118À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, m32267d2 = {"BlockingContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "CORE_POOL_SIZE", HttpUrl.FRAGMENT_ENCODE_SET, "DEFAULT_SCHEDULER_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "IDLE_WORKER_KEEP_ALIVE_NS", HttpUrl.FRAGMENT_ENCODE_SET, "MAX_POOL_SIZE", "NonBlockingContext", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.l */
/* loaded from: classes3.dex */
public final class C10875l {

    /* renamed from: a */
    public static final long f41631a;

    /* renamed from: b */
    public static final int f41632b;

    /* renamed from: c */
    public static final int f41633c;

    /* renamed from: d */
    public static final long f41634d;

    /* renamed from: e */
    public static SchedulerTimeSource f41635e;

    /* renamed from: f */
    public static final TaskContext f41636f;

    /* renamed from: g */
    public static final TaskContext f41637g;

    static {
        long m39486e;
        int m32419b;
        int m39485d;
        int m39485d2;
        long m39486e2;
        m39486e = C10951h0.m39486e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f41631a = m39486e;
        m32419b = C9815l.m32419b(C10947f0.m39466a(), 2);
        m39485d = C10951h0.m39485d("kotlinx.coroutines.scheduler.core.pool.size", m32419b, 1, 0, 8, null);
        f41632b = m39485d;
        m39485d2 = C10951h0.m39485d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f41633c = m39485d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m39486e2 = C10951h0.m39486e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f41634d = timeUnit.toNanos(m39486e2);
        f41635e = NanoTimeSource.f41621a;
        f41636f = new TaskContextImpl(0);
        f41637g = new TaskContextImpl(1);
    }
}
