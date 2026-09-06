package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.i */
/* loaded from: classes2.dex */
final class RunnableC7870i implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C7871j f29537f;

    RunnableC7870i(C7871j c7871j) {
        this.f29537f = c7871j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.f29537f.f29539b;
        synchronized (obj) {
            C7871j c7871j = this.f29537f;
            onCanceledListener = c7871j.f29540c;
            if (onCanceledListener != null) {
                onCanceledListener2 = c7871j.f29540c;
                onCanceledListener2.mo23636b();
            }
        }
    }
}
