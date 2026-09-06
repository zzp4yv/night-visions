package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        zzkj zzkjVar = null;
        String str3 = null;
        zzan zzanVar = null;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 2:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 4:
                    zzkjVar = (zzkj) SafeParcelReader.m14451o(parcel, m14425C, zzkj.CREATOR);
                    break;
                case 5:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 6:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    zzanVar = (zzan) SafeParcelReader.m14451o(parcel, m14425C, zzan.CREATOR);
                    break;
                case 9:
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 10:
                    zzanVar2 = (zzan) SafeParcelReader.m14451o(parcel, m14425C, zzan.CREATOR);
                    break;
                case 11:
                    j4 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 12:
                    zzanVar3 = (zzan) SafeParcelReader.m14451o(parcel, m14425C, zzan.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzv(str, str2, zzkjVar, j2, z, str3, zzanVar, j3, zzanVar2, j4, zzanVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i2) {
        return new zzv[i2];
    }
}
