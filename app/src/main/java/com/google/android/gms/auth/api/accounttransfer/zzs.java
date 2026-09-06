package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
                hashSet.add(1);
            } else if (m14458v == 2) {
                zztVar = (zzt) SafeParcelReader.m14451o(parcel, m14425C, zzt.CREATOR);
                hashSet.add(2);
            } else if (m14458v == 3) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
                hashSet.add(3);
            } else if (m14458v == 4) {
                str2 = SafeParcelReader.m14452p(parcel, m14425C);
                hashSet.add(4);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                str3 = SafeParcelReader.m14452p(parcel, m14425C);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == m14434L) {
            return new zzr(hashSet, i2, zztVar, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(m14434L);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr[] newArray(int i2) {
        return new zzr[i2];
    }
}
