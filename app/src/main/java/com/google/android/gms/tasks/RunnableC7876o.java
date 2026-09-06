package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: classes2.dex */
final class RunnableC7876o implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29551f;

    /* renamed from: g */
    final /* synthetic */ C7877p f29552g;

    RunnableC7876o(C7877p c7877p, Task task) {
        this.f29552g = c7877p;
        this.f29551f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.f29552g.f29554b;
        synchronized (obj) {
            C7877p c7877p = this.f29552g;
            onSuccessListener = c7877p.f29555c;
            if (onSuccessListener != null) {
                onSuccessListener2 = c7877p.f29555c;
                onSuccessListener2.onSuccess(this.f29551f.mo23647j());
            }
        }
    }
}
