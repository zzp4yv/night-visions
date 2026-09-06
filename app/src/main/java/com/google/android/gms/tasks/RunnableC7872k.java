package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: classes2.dex */
final class RunnableC7872k implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29541f;

    /* renamed from: g */
    final /* synthetic */ C7873l f29542g;

    RunnableC7872k(C7873l c7873l, Task task) {
        this.f29542g = c7873l;
        this.f29541f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.f29542g.f29544b;
        synchronized (obj) {
            C7873l c7873l = this.f29542g;
            onCompleteListener = c7873l.f29545c;
            if (onCompleteListener != null) {
                onCompleteListener2 = c7873l.f29545c;
                onCompleteListener2.mo7019a(this.f29541f);
            }
        }
    }
}
