package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzac implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        List<Location> list = LocationResult.f28479f;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(m14425C) != 1) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                list = SafeParcelReader.m14456t(parcel, m14425C, Location.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
