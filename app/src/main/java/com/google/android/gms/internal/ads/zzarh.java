package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarh implements Parcelable.Creator<zzarg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarg createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        zzxz zzxzVar = null;
        zzyd zzydVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzbai zzbaiVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzady zzadyVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzaax zzaaxVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzaiy zzaiyVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 3:
                    zzxzVar = (zzxz) SafeParcelReader.m14451o(parcel, m14425C, zzxz.CREATOR);
                    break;
                case 4:
                    zzydVar = (zzyd) SafeParcelReader.m14451o(parcel, m14425C, zzyd.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14451o(parcel, m14425C, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m14451o(parcel, m14425C, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 9:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 10:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 11:
                    zzbaiVar = (zzbai) SafeParcelReader.m14451o(parcel, m14425C, zzbai.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 13:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 16:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
                case 18:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 19:
                    i5 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 20:
                    f2 = SafeParcelReader.m14423A(parcel, m14425C);
                    break;
                case 21:
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 25:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 26:
                    str6 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 28:
                    str7 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 29:
                    zzadyVar = (zzady) SafeParcelReader.m14451o(parcel, m14425C, zzady.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 31:
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 33:
                    str8 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 34:
                    f3 = SafeParcelReader.m14423A(parcel, m14425C);
                    break;
                case 35:
                    i6 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 36:
                    i7 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 37:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 38:
                    z4 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 39:
                    str9 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 40:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 41:
                    str10 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 42:
                    z5 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 43:
                    i8 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 45:
                    str11 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 46:
                    zzaaxVar = (zzaax) SafeParcelReader.m14451o(parcel, m14425C, zzaax.CREATOR);
                    break;
                case 47:
                    z6 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 49:
                    str12 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 50:
                    str13 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 51:
                    str14 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 52:
                    z7 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.m14447k(parcel, m14425C);
                    break;
                case 54:
                    str15 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 56:
                    i9 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 57:
                    z8 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 58:
                    z9 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 59:
                    z10 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 61:
                    str16 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 63:
                    zzaiyVar = (zzaiy) SafeParcelReader.m14451o(parcel, m14425C, zzaiy.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzarg(i2, bundle, zzxzVar, zzydVar, str, applicationInfo, packageInfo, str2, str3, str4, zzbaiVar, bundle2, i3, arrayList, bundle3, z, i4, i5, f2, str5, j2, str6, arrayList2, str7, zzadyVar, arrayList3, j3, str8, f3, z2, i6, i7, z3, z4, str9, str10, z5, i8, bundle4, str11, zzaaxVar, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i9, z8, z9, z10, arrayList6, str16, zzaiyVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarg[] newArray(int i2) {
        return new zzarg[i2];
    }
}
