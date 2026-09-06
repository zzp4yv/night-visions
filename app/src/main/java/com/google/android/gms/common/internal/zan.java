package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator<ResolveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 2) {
                iBinder = SafeParcelReader.m14426D(parcel, m14425C);
            } else if (m14458v == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m14451o(parcel, m14425C, ConnectionResult.CREATOR);
            } else if (m14458v == 4) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                z2 = SafeParcelReader.m14459w(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new ResolveAccountResponse(i2, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i2) {
        return new ResolveAccountResponse[i2];
    }
}
