package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j7 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 7:
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 8:
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 9:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 10:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 11:
                    j7 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 12:
                    str6 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 13:
                    j4 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 14:
                    j5 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 15:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 16:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 17:
                    z4 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 18:
                    z5 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 19:
                    str7 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 20:
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
                case 21:
                    bool = SafeParcelReader.m14460x(parcel, m14425C);
                    break;
                case 22:
                    j6 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 24:
                    str8 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzm(str, str2, str3, str4, j2, j3, str5, z, z2, j7, str6, j4, j5, i2, z3, z4, z5, str7, bool, j6, arrayList, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i2) {
        return new zzm[i2];
    }
}
