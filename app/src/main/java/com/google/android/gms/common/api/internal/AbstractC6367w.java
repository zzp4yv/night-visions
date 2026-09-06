package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes2.dex */
abstract class AbstractC6367w {

    /* renamed from: a */
    private final zabd f17467a;

    protected AbstractC6367w(zabd zabdVar) {
        this.f17467a = zabdVar;
    }

    /* renamed from: a */
    protected abstract void mo14060a();

    /* renamed from: b */
    public final void m14105b(zabe zabeVar) {
        Lock lock;
        Lock lock2;
        zabd zabdVar;
        lock = zabeVar.f17533f;
        lock.lock();
        try {
            zabdVar = zabeVar.f17543p;
            if (zabdVar != this.f17467a) {
                return;
            }
            mo14060a();
        } finally {
            lock2 = zabeVar.f17533f;
            lock2.unlock();
        }
    }
}
