package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzadz implements Parcelable.Creator<zzady> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        zzacd zzacdVar = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 3:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 4:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 5:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 6:
                    zzacdVar = (zzacd) SafeParcelReader.m14451o(parcel, m14425C, zzacd.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 8:
                    i5 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzady(i2, z, i3, z2, i4, zzacdVar, z3, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady[] newArray(int i2) {
        return new zzady[i2];
    }
}
