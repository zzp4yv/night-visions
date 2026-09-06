package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaun implements Parcelable.Creator<zzaum> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaum createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v != 2) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                str2 = SafeParcelReader.m14452p(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzaum(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaum[] newArray(int i2) {
        return new zzaum[i2];
    }
}
