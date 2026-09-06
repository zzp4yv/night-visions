package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.e */
/* loaded from: classes2.dex */
final class RunnableC7866e implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29527f;

    /* renamed from: g */
    final /* synthetic */ C7867f f29528g;

    RunnableC7866e(C7867f c7867f, Task task) {
        this.f29528g = c7867f;
        this.f29527f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7884x c7884x;
        C7884x c7884x2;
        C7884x c7884x3;
        Continuation continuation;
        C7884x c7884x4;
        C7884x c7884x5;
        if (this.f29527f.mo23649l()) {
            c7884x5 = this.f29528g.f29531c;
            c7884x5.m23694s();
            return;
        }
        try {
            continuation = this.f29528g.f29530b;
            Object mo13777a = continuation.mo13777a(this.f29527f);
            c7884x4 = this.f29528g.f29531c;
            c7884x4.m23693r(mo13777a);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                c7884x3 = this.f29528g.f29531c;
                c7884x3.m23692q((Exception) e2.getCause());
            } else {
                c7884x2 = this.f29528g.f29531c;
                c7884x2.m23692q(e2);
            }
        } catch (Exception e3) {
            c7884x = this.f29528g.f29531c;
            c7884x.m23692q(e3);
        }
    }
}
