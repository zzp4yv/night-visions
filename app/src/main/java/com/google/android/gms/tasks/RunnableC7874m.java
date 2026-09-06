package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: classes2.dex */
final class RunnableC7874m implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29546f;

    /* renamed from: g */
    final /* synthetic */ C7875n f29547g;

    RunnableC7874m(C7875n c7875n, Task task) {
        this.f29547g = c7875n;
        this.f29546f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.f29547g.f29549b;
        synchronized (obj) {
            C7875n c7875n = this.f29547g;
            onFailureListener = c7875n.f29550c;
            if (onFailureListener != null) {
                onFailureListener2 = c7875n.f29550c;
                onFailureListener2.mo23637c((Exception) Preconditions.m14372k(this.f29546f.mo23646i()));
            }
        }
    }
}
