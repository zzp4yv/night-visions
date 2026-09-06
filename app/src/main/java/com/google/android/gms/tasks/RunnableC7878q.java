package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.q */
/* loaded from: classes2.dex */
final class RunnableC7878q implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29556f;

    /* renamed from: g */
    final /* synthetic */ C7879s f29557g;

    RunnableC7878q(C7879s c7879s, Task task) {
        this.f29557g = c7879s;
        this.f29556f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuccessContinuation successContinuation;
        try {
            successContinuation = this.f29557g.f29559b;
            Task mo13778a = successContinuation.mo13778a(this.f29556f.mo23647j());
            if (mo13778a == null) {
                this.f29557g.mo23637c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f29516b;
            mo13778a.mo23642e(executor, this.f29557g);
            mo13778a.mo23641d(executor, this.f29557g);
            mo13778a.mo23638a(executor, this.f29557g);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f29557g.mo23637c((Exception) e2.getCause());
            } else {
                this.f29557g.mo23637c(e2);
            }
        } catch (CancellationException unused) {
            this.f29557g.mo23636b();
        } catch (Exception e3) {
            this.f29557g.mo23637c(e3);
        }
    }
}
