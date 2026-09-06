package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        int i2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 2:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 3:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 4:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 6:
                    f2 = SafeParcelReader.m14423A(parcel, m14425C);
                    break;
                case 7:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 8:
                    z4 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 9:
                    z5 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 10:
                    z6 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzh(z, z2, str, z3, f2, i2, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh[] newArray(int i2) {
        return new zzh[i2];
    }
}
