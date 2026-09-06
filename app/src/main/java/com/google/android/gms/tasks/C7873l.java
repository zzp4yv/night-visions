package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.l */
/* loaded from: classes2.dex */
final class C7873l implements InterfaceC7880t {

    /* renamed from: a */
    private final Executor f29543a;

    /* renamed from: b */
    private final Object f29544b = new Object();

    /* renamed from: c */
    private OnCompleteListener f29545c;

    public C7873l(Executor executor, OnCompleteListener onCompleteListener) {
        this.f29543a = executor;
        this.f29545c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7880t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        synchronized (this.f29544b) {
            if (this.f29545c == null) {
                return;
            }
            this.f29543a.execute(new RunnableC7872k(this, task));
        }
    }
}
