package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                j2 = SafeParcelReader.m14429G(parcel, m14425C);
            } else if (m14458v == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) SafeParcelReader.m14455s(parcel, m14425C, HarmfulAppsData.CREATOR);
            } else if (m14458v == 4) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzd(j2, harmfulAppsDataArr, i2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i2) {
        return new zzd[i2];
    }
}
