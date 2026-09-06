package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
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
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                    str6 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    str7 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.m14451o(parcel, m14425C, Intent.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i2) {
        return new zzc[i2];
    }
}
