package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.h */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC8402h implements Executor {

    /* renamed from: f */
    static final Executor f31997f = new ExecutorC8402h();

    private ExecutorC8402h() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
