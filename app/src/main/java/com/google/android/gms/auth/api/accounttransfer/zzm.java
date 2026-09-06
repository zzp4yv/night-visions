package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        ArrayList arrayList = null;
        zzo zzoVar = null;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
                hashSet.add(1);
            } else if (m14458v == 2) {
                arrayList = SafeParcelReader.m14456t(parcel, m14425C, zzr.CREATOR);
                hashSet.add(2);
            } else if (m14458v == 3) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
                hashSet.add(3);
            } else if (m14458v != 4) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                zzoVar = (zzo) SafeParcelReader.m14451o(parcel, m14425C, zzo.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == m14434L) {
            return new zzl(hashSet, i2, arrayList, i3, zzoVar);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(m14434L);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl[] newArray(int i2) {
        return new zzl[i2];
    }
}
