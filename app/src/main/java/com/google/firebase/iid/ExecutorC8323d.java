package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.d */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8323d implements Executor {

    /* renamed from: f */
    static final Executor f31723f = new ExecutorC8323d();

    private ExecutorC8323d() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
