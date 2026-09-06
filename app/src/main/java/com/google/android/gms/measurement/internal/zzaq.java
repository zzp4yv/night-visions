package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzaq implements Parcelable.Creator<zzan> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        zzam zzamVar = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 3) {
                zzamVar = (zzam) SafeParcelReader.m14451o(parcel, m14425C, zzam.CREATOR);
            } else if (m14458v == 4) {
                str2 = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v != 5) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                j2 = SafeParcelReader.m14429G(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzan(str, zzamVar, str2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i2) {
        return new zzan[i2];
    }
}
