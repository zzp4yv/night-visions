package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes2.dex */
final class C6361t implements ResultCallback<Status> {

    /* renamed from: a */
    private final /* synthetic */ StatusPendingResult f17459a;

    /* renamed from: b */
    private final /* synthetic */ boolean f17460b;

    /* renamed from: c */
    private final /* synthetic */ GoogleApiClient f17461c;

    /* renamed from: d */
    private final /* synthetic */ zaaw f17462d;

    C6361t(zaaw zaawVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f17462d = zaawVar;
        this.f17459a = statusPendingResult;
        this.f17460b = z;
        this.f17461c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: a */
    public final /* synthetic */ void mo13908a(Status status) {
        Context context;
        Status status2 = status;
        context = this.f17462d.f17512g;
        Storage.m13705b(context).m13717l();
        if (status2.m13915e0() && this.f17462d.mo13879p()) {
            this.f17462d.mo13882s();
        }
        this.f17459a.m13940k(status2);
        if (this.f17460b) {
            this.f17461c.mo13872h();
        }
    }
}
