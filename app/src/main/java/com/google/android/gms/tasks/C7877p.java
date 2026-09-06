package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.p */
/* loaded from: classes2.dex */
final class C7877p implements InterfaceC7880t {

    /* renamed from: a */
    private final Executor f29553a;

    /* renamed from: b */
    private final Object f29554b = new Object();

    /* renamed from: c */
    private OnSuccessListener f29555c;

    public C7877p(Executor executor, OnSuccessListener onSuccessListener) {
        this.f29553a = executor;
        this.f29555c = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7880t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        if (task.mo23651n()) {
            synchronized (this.f29554b) {
                if (this.f29555c == null) {
                    return;
                }
                this.f29553a.execute(new RunnableC7876o(this, task));
            }
        }
    }
}
