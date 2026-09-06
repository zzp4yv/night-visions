package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzary implements Parcelable.Creator<zzarx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundle = null;
        zzbai zzbaiVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 2:
                    zzbaiVar = (zzbai) SafeParcelReader.m14451o(parcel, m14425C, zzbai.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14451o(parcel, m14425C, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m14451o(parcel, m14425C, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 9:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzarx(bundle, zzbaiVar, applicationInfo, str, arrayList, packageInfo, str2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx[] newArray(int i2) {
        return new zzarx[i2];
    }
}
