package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.s */
/* loaded from: classes2.dex */
final class C7879s<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, InterfaceC7880t {

    /* renamed from: a */
    private final Executor f29558a;

    /* renamed from: b */
    private final SuccessContinuation f29559b;

    /* renamed from: c */
    private final C7884x f29560c;

    public C7879s(Executor executor, SuccessContinuation successContinuation, C7884x c7884x) {
        this.f29558a = executor;
        this.f29559b = successContinuation;
        this.f29560c = c7884x;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7880t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        this.f29558a.execute(new RunnableC7878q(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: b */
    public final void mo23636b() {
        this.f29560c.m23694s();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: c */
    public final void mo23637c(Exception exc) {
        this.f29560c.m23692q(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f29560c.m23693r(tcontinuationresult);
    }
}
