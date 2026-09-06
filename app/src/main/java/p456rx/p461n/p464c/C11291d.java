package p456rx.p461n.p464c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: GenericScheduledExecutorService.java */
/* renamed from: rx.n.c.d */
/* loaded from: classes3.dex */
public final class C11291d implements InterfaceC11298k {

    /* renamed from: f */
    private static final ScheduledExecutorService[] f42788f = new ScheduledExecutorService[0];

    /* renamed from: g */
    private static final ScheduledExecutorService f42789g;

    /* renamed from: h */
    public static final C11291d f42790h;

    /* renamed from: i */
    private static int f42791i;

    /* renamed from: j */
    private final AtomicReference<ScheduledExecutorService[]> f42792j = new AtomicReference<>(f42788f);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f42789g = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f42790h = new C11291d();
    }

    private C11291d() {
        start();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m40388a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = f42790h.f42792j.get();
        if (scheduledExecutorServiceArr == f42788f) {
            return f42789g;
        }
        int i2 = f42791i + 1;
        if (i2 >= scheduledExecutorServiceArr.length) {
            i2 = 0;
        }
        f42791i = i2;
        return scheduledExecutorServiceArr[i2];
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f42792j.get();
            scheduledExecutorServiceArr2 = f42788f;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.f42792j.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C11295h.m40392f(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i2 = 0;
        for (int i3 = 0; i3 < availableProcessors; i3++) {
            scheduledExecutorServiceArr[i3] = EnumC11292e.m40389g();
        }
        if (!this.f42792j.compareAndSet(f42788f, scheduledExecutorServiceArr)) {
            while (i2 < availableProcessors) {
                scheduledExecutorServiceArr[i2].shutdownNow();
                i2++;
            }
        } else {
            while (i2 < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i2];
                if (!C11295h.m40396m(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C11295h.m40395i((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i2++;
            }
        }
    }
}
