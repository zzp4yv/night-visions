package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbaj implements Parcelable.Creator<zzbai> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbai createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 3) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 4) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 5) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v != 6) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                z2 = SafeParcelReader.m14459w(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzbai(str, i2, i3, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbai[] newArray(int i2) {
        return new zzbai[i2];
    }
}
