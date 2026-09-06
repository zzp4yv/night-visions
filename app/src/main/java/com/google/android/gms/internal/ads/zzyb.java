package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzyb implements Parcelable.Creator<zzxz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxz createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzaca zzacaVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzxt zzxtVar = null;
        String str5 = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 3:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 4:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 6:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 7:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 8:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 9:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 10:
                    zzacaVar = (zzaca) SafeParcelReader.m14451o(parcel, m14425C, zzaca.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m14451o(parcel, m14425C, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.m14454r(parcel, m14425C);
                    break;
                case 16:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 17:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 18:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 19:
                    zzxtVar = (zzxt) SafeParcelReader.m14451o(parcel, m14425C, zzxt.CREATOR);
                    break;
                case 20:
                    i5 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 21:
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzxz(i2, j2, bundle, i3, arrayList, z, i4, z2, str, zzacaVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzxtVar, i5, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxz[] newArray(int i2) {
        return new zzxz[i2];
    }
}
