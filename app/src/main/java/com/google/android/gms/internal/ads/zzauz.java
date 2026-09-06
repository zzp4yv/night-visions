package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzauz implements Parcelable.Creator<zzauy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 7:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 8:
                    z4 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzauy(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy[] newArray(int i2) {
        return new zzauy[i2];
    }
}
