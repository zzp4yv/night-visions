package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p330a.InterfaceC9069b;

/* compiled from: NewThreadWorker.java */
/* renamed from: h.a.z.g.g */
/* loaded from: classes2.dex */
public class C9133g extends AbstractC9048r.b implements InterfaceC9056c {

    /* renamed from: f */
    private final ScheduledExecutorService f35238f;

    /* renamed from: g */
    volatile boolean f35239g;

    public C9133g(ThreadFactory threadFactory) {
        this.f35238f = C9137k.m29366a(threadFactory);
    }

    @Override // p323h.p324a.AbstractC9048r.b
    /* renamed from: b */
    public InterfaceC9056c mo29224b(Runnable runnable) {
        return mo29225c(runnable, 0L, null);
    }

    @Override // p323h.p324a.AbstractC9048r.b
    /* renamed from: c */
    public InterfaceC9056c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f35239g ? EnumC9071d.INSTANCE : m29361d(runnable, j2, timeUnit, null);
    }

    /* renamed from: d */
    public RunnableC9136j m29361d(Runnable runnable, long j2, TimeUnit timeUnit, InterfaceC9069b interfaceC9069b) {
        RunnableC9136j runnableC9136j = new RunnableC9136j(C9030a.m29149q(runnable), interfaceC9069b);
        if (interfaceC9069b != null && !interfaceC9069b.mo29239b(runnableC9136j)) {
            return runnableC9136j;
        }
        try {
            runnableC9136j.m29365a(j2 <= 0 ? this.f35238f.submit((Callable) runnableC9136j) : this.f35238f.schedule((Callable) runnableC9136j, j2, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (interfaceC9069b != null) {
                interfaceC9069b.mo29238a(runnableC9136j);
            }
            C9030a.m29147o(e2);
        }
        return runnableC9136j;
    }

    /* renamed from: e */
    public InterfaceC9056c m29362e(Runnable runnable, long j2, TimeUnit timeUnit) {
        CallableC9135i callableC9135i = new CallableC9135i(C9030a.m29149q(runnable));
        try {
            callableC9135i.m29347a(j2 <= 0 ? this.f35238f.submit(callableC9135i) : this.f35238f.schedule(callableC9135i, j2, timeUnit));
            return callableC9135i;
        } catch (RejectedExecutionException e2) {
            C9030a.m29147o(e2);
            return EnumC9071d.INSTANCE;
        }
    }

    /* renamed from: f */
    public void m29363f() {
        if (this.f35239g) {
            return;
        }
        this.f35239g = true;
        this.f35238f.shutdown();
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
        if (this.f35239g) {
            return;
        }
        this.f35239g = true;
        this.f35238f.shutdownNow();
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return this.f35239g;
    }
}
