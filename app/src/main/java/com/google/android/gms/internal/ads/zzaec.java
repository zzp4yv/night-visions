package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaec extends zzfm implements zzaea {
    zzaec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: M0 */
    public final List<zzaei> mo16459M0() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        ArrayList m19952f = zzfo.m19952f(m19945P);
        m19945P.recycle();
        return m19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: m1 */
    public final String mo16464m1() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }
}
