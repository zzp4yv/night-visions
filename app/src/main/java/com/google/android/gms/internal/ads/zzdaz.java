package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzdaz implements Parcelable.Creator<zzday> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        int i2 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 2) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                bArr = SafeParcelReader.m14443g(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzday(i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday[] newArray(int i2) {
        return new zzday[i2];
    }
}
