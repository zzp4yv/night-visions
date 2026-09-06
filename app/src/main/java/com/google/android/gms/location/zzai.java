package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 2:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 3:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 4:
                    z4 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 5:
                    z5 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 6:
                    z6 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates[] newArray(int i2) {
        return new LocationSettingsStates[i2];
    }
}
