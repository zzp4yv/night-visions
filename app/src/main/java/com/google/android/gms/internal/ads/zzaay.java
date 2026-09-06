package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaay implements Parcelable.Creator<zzaax> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaax createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(m14425C) != 2) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzaax(i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaax[] newArray(int i2) {
        return new zzaax[i2];
    }
}
