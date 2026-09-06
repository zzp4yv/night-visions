package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* loaded from: classes2.dex */
final class C6362t0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C6358r0 f17463a;

    private C6362t0(C6358r0 c6358r0) {
        this.f17463a = c6358r0;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: a */
    public final void mo14102a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f17463a.f17455r;
        lock.lock();
        try {
            this.f17463a.f17452o = connectionResult;
            this.f17463a.m14092y();
        } finally {
            lock2 = this.f17463a.f17455r;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: b */
    public final void mo14103b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f17463a.f17455r;
        lock.lock();
        try {
            this.f17463a.m14078k(bundle);
            this.f17463a.f17452o = ConnectionResult.f17198f;
            this.f17463a.m14092y();
        } finally {
            lock2 = this.f17463a.f17455r;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: c */
    public final void mo14104c(int i2, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabe zabeVar;
        lock = this.f17463a.f17455r;
        lock.lock();
        try {
            z2 = this.f17463a.f17454q;
            if (!z2) {
                connectionResult = this.f17463a.f17453p;
                if (connectionResult != null) {
                    connectionResult2 = this.f17463a.f17453p;
                    if (connectionResult2.m13795e0()) {
                        this.f17463a.f17454q = true;
                        zabeVar = this.f17463a.f17447j;
                        zabeVar.mo13893H(i2);
                        return;
                    }
                }
            }
            this.f17463a.f17454q = false;
            this.f17463a.m14077j(i2, z);
        } finally {
            lock2 = this.f17463a.f17455r;
            lock2.unlock();
        }
    }

    /* synthetic */ C6362t0(C6358r0 c6358r0, RunnableC6360s0 runnableC6360s0) {
        this(c6358r0);
    }
}
