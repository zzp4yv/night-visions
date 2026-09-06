package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzki implements Parcelable.Creator<zzkj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkj createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        Long l = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 4:
                    l = SafeParcelReader.m14430H(parcel, m14425C);
                    break;
                case 5:
                    f2 = SafeParcelReader.m14424B(parcel, m14425C);
                    break;
                case 6:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    d2 = SafeParcelReader.m14462z(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzkj(i2, str, j2, l, f2, str2, str3, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkj[] newArray(int i2) {
        return new zzkj[i2];
    }
}
