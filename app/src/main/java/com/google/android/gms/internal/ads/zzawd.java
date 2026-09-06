package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzawd implements Parcelable.Creator<zzawc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        zzyd zzydVar = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 2) {
                str2 = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v != 3) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                zzydVar = (zzyd) SafeParcelReader.m14451o(parcel, m14425C, zzyd.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzawc(str, str2, zzydVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc[] newArray(int i2) {
        return new zzawc[i2];
    }
}
