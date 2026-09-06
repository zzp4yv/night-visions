package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbi implements Parcelable.Creator<zzbh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        String str = null;
        long j2 = 0;
        int i2 = 0;
        short s = 0;
        float f2 = 0.0f;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 2:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 3:
                    s = SafeParcelReader.m14431I(parcel, m14425C);
                    break;
                case 4:
                    d2 = SafeParcelReader.m14461y(parcel, m14425C);
                    break;
                case 5:
                    d3 = SafeParcelReader.m14461y(parcel, m14425C);
                    break;
                case 6:
                    f2 = SafeParcelReader.m14423A(parcel, m14425C);
                    break;
                case 7:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 8:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 9:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzbh(str, i2, s, d2, d3, f2, j2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i2) {
        return new zzbh[i2];
    }
}
