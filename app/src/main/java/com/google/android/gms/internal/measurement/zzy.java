package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 2:
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 3:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 4:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzv(j2, j3, z, str, str2, str3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i2) {
        return new zzv[i2];
    }
}
