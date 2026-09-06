package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzaeVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                arrayList = SafeParcelReader.m14456t(parcel, m14425C, LocationRequest.CREATOR);
            } else if (m14458v == 2) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v == 3) {
                z2 = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                zzaeVar = (zzae) SafeParcelReader.m14451o(parcel, m14425C, zzae.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new LocationSettingsRequest(arrayList, z, z2, zzaeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest[] newArray(int i2) {
        return new LocationSettingsRequest[i2];
    }
}
