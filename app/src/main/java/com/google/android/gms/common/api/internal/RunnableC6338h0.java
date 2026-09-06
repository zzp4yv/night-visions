package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes2.dex */
final class RunnableC6338h0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Result f17414f;

    /* renamed from: g */
    private final /* synthetic */ zacm f17415g;

    RunnableC6338h0(zacm zacmVar, Result result) {
        this.f17415g = zacmVar;
        this.f17414f = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ResultTransform resultTransform;
        HandlerC6340i0 unused;
        HandlerC6340i0 unused2;
        HandlerC6340i0 unused3;
        HandlerC6340i0 unused4;
        try {
            try {
                BasePendingResult.f17311a.set(Boolean.TRUE);
                resultTransform = this.f17415g.f17567a;
                resultTransform.m13911b(this.f17414f);
                unused = this.f17415g.f17573g;
                unused2 = this.f17415g.f17573g;
                throw null;
            } catch (RuntimeException unused5) {
                unused3 = this.f17415g.f17573g;
                unused4 = this.f17415g.f17573g;
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.f17311a.set(Boolean.FALSE);
            zacm zacmVar = this.f17415g;
            zacm.m14195c(this.f17414f);
            weakReference = this.f17415g.f17572f;
            GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
            if (googleApiClient != null) {
                googleApiClient.mo13885v(this.f17415g);
            }
            throw th;
        }
    }
}
