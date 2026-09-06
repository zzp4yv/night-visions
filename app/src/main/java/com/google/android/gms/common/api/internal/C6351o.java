package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.zad;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes2.dex */
final class C6351o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zaak f17433f;

    private C6351o(zaak zaakVar) {
        this.f17433f = zaakVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo13895E0(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean m14153w;
        lock = this.f17433f.f17486b;
        lock.lock();
        try {
            m14153w = this.f17433f.m14153w(connectionResult);
            if (m14153w) {
                this.f17433f.m14142l();
                this.f17433f.m14140j();
            } else {
                this.f17433f.m14154x(connectionResult);
            }
        } finally {
            lock2 = this.f17433f.f17486b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        ClientSettings clientSettings;
        zad zadVar;
        Lock lock;
        Lock lock2;
        zad zadVar2;
        zad zadVar3;
        clientSettings = this.f17433f.f17502r;
        if (!clientSettings.m14299m()) {
            zadVar = this.f17433f.f17495k;
            zadVar.mo23617d(new BinderC6347m(this.f17433f));
            return;
        }
        lock = this.f17433f.f17486b;
        lock.lock();
        try {
            zadVar2 = this.f17433f.f17495k;
            if (zadVar2 == null) {
                return;
            }
            zadVar3 = this.f17433f.f17495k;
            zadVar3.mo23617d(new BinderC6347m(this.f17433f));
        } finally {
            lock2 = this.f17433f.f17486b;
            lock2.unlock();
        }
    }

    /* synthetic */ C6351o(zaak zaakVar, RunnableC6335g runnableC6335g) {
        this(zaakVar);
    }
}
