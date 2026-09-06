package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<HarmfulAppsData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HarmfulAppsData createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 3) {
                bArr = SafeParcelReader.m14443g(parcel, m14425C);
            } else if (m14458v != 4) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new HarmfulAppsData(str, bArr, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HarmfulAppsData[] newArray(int i2) {
        return new HarmfulAppsData[i2];
    }
}
