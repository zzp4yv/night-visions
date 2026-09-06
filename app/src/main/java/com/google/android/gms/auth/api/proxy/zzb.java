package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, m14425C, PendingIntent.CREATOR);
            } else if (m14458v == 3) {
                i4 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 4) {
                bundle = SafeParcelReader.m14442f(parcel, m14425C);
            } else if (m14458v == 5) {
                bArr = SafeParcelReader.m14443g(parcel, m14425C);
            } else if (m14458v != 1000) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new ProxyResponse(i2, i3, pendingIntent, i4, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse[] newArray(int i2) {
        return new ProxyResponse[i2];
    }
}
