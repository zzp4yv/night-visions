package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC6353p implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zaak f17436f;

    private AbstractRunnableC6353p(zaak zaakVar) {
        this.f17436f = zaakVar;
    }

    /* renamed from: a */
    protected abstract void mo14062a();

    @Override // java.lang.Runnable
    public void run() {
        Lock lock;
        Lock lock2;
        zabe zabeVar;
        lock = this.f17436f.f17486b;
        lock.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            mo14062a();
        } catch (RuntimeException e2) {
            zabeVar = this.f17436f.f17485a;
            zabeVar.m14179k(e2);
        } finally {
            lock2 = this.f17436f.f17486b;
            lock2.unlock();
        }
    }

    /* synthetic */ AbstractRunnableC6353p(zaak zaakVar, RunnableC6335g runnableC6335g) {
        this(zaakVar);
    }
}
