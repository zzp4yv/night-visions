package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.h */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8327h implements Executor {

    /* renamed from: f */
    static final Executor f31734f = new ExecutorC8327h();

    private ExecutorC8327h() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
