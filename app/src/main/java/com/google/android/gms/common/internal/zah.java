package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public final class zah extends com.google.android.gms.internal.base.zaa implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    /* renamed from: l3 */
    public final IObjectWrapper mo14354l3(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel m20890H = m20890H();
        zac.m20895c(m20890H, iObjectWrapper);
        zac.m20896d(m20890H, signInButtonConfig);
        Parcel m20891P = m20891P(2, m20890H);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20891P.readStrongBinder());
        m20891P.recycle();
        return m14707P;
    }
}
