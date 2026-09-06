package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzvw implements Parcelable.Creator<zzvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 2:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 4:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 8:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 9:
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzvv(str, j2, str2, str3, str4, bundle, z, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv[] newArray(int i2) {
        return new zzvv[i2];
    }
}
