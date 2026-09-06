package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.f */
/* loaded from: classes2.dex */
final class C7867f implements InterfaceC7880t {

    /* renamed from: a */
    private final Executor f29529a;

    /* renamed from: b */
    private final Continuation f29530b;

    /* renamed from: c */
    private final C7884x f29531c;

    public C7867f(Executor executor, Continuation continuation, C7884x c7884x) {
        this.f29529a = executor;
        this.f29530b = continuation;
        this.f29531c = c7884x;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7880t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        this.f29529a.execute(new RunnableC7866e(this, task));
    }
}
