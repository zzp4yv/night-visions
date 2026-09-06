package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaid implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 2:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 4:
                    bArr = SafeParcelReader.m14443g(parcel, m14425C);
                    break;
                case 5:
                    strArr = SafeParcelReader.m14453q(parcel, m14425C);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m14453q(parcel, m14425C);
                    break;
                case 7:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 8:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzaic(z, str, i2, bArr, strArr, strArr2, z2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i2) {
        return new zzaic[i2];
    }
}
