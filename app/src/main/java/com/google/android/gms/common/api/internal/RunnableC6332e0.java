package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes2.dex */
final class RunnableC6332e0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ConnectionResult f17404f;

    /* renamed from: g */
    private final /* synthetic */ GoogleApiManager.C6322b f17405g;

    RunnableC6332e0(GoogleApiManager.C6322b c6322b, ConnectionResult connectionResult) {
        this.f17405g = c6322b;
        this.f17404f = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zai zaiVar;
        Api.Client client;
        zai zaiVar2;
        Api.Client client2;
        if (!this.f17404f.m13795e0()) {
            Map map = GoogleApiManager.this.f17342r;
            zaiVar = this.f17405g.f17350b;
            ((GoogleApiManager.zaa) map.get(zaiVar)).mo13895E0(this.f17404f);
            return;
        }
        GoogleApiManager.C6322b.m13976e(this.f17405g, true);
        client = this.f17405g.f17349a;
        if (client.requiresSignIn()) {
            this.f17405g.m13978g();
            return;
        }
        try {
            client2 = this.f17405g.f17349a;
            client2.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            Map map2 = GoogleApiManager.this.f17342r;
            zaiVar2 = this.f17405g.f17350b;
            ((GoogleApiManager.zaa) map2.get(zaiVar2)).mo13895E0(new ConnectionResult(10));
        }
    }
}
