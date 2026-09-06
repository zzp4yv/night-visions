package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* loaded from: classes2.dex */
final class C6364u0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C6358r0 f17465a;

    private C6364u0(C6358r0 c6358r0) {
        this.f17465a = c6358r0;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: a */
    public final void mo14102a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f17465a.f17455r;
        lock.lock();
        try {
            this.f17465a.f17453p = connectionResult;
            this.f17465a.m14092y();
        } finally {
            lock2 = this.f17465a.f17455r;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: b */
    public final void mo14103b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f17465a.f17455r;
        lock.lock();
        try {
            this.f17465a.f17453p = ConnectionResult.f17198f;
            this.f17465a.m14092y();
        } finally {
            lock2 = this.f17465a.f17455r;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: c */
    public final void mo14104c(int i2, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        zabe zabeVar;
        lock = this.f17465a.f17455r;
        lock.lock();
        try {
            z2 = this.f17465a.f17454q;
            if (z2) {
                this.f17465a.f17454q = false;
                this.f17465a.m14077j(i2, z);
            } else {
                this.f17465a.f17454q = true;
                zabeVar = this.f17465a.f17446i;
                zabeVar.mo13893H(i2);
            }
        } finally {
            lock2 = this.f17465a.f17455r;
            lock2.unlock();
        }
    }

    /* synthetic */ C6364u0(C6358r0 c6358r0, RunnableC6360s0 runnableC6360s0) {
        this(c6358r0);
    }
}
