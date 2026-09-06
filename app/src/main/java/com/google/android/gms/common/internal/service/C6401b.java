package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.internal.service.b */
/* loaded from: classes2.dex */
final class C6401b extends AbstractC6404e {
    C6401b(zad zadVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: s */
    protected final /* synthetic */ void mo13719s(zai zaiVar) throws RemoteException {
        ((zal) zaiVar.getService()).mo14494N0(new BinderC6402c(this));
    }
}
