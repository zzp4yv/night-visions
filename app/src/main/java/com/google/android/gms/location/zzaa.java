package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaa implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        zzaj[] zzajVarArr = null;
        int i2 = 1000;
        int i3 = 1;
        int i4 = 1;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 2) {
                i4 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 3) {
                j2 = SafeParcelReader.m14429G(parcel, m14425C);
            } else if (m14458v == 4) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                zzajVarArr = (zzaj[]) SafeParcelReader.m14455s(parcel, m14425C, zzaj.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new LocationAvailability(i2, i3, i4, j2, zzajVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability[] newArray(int i2) {
        return new LocationAvailability[i2];
    }
}
