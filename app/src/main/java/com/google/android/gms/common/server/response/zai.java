package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zai implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 3:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 4:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 6:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                    i5 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 8:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 9:
                    zaaVar = (zaa) SafeParcelReader.m14451o(parcel, m14425C, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new FastJsonResponse.Field(i2, i3, z, i4, z2, str, i5, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i2) {
        return new FastJsonResponse.Field[i2];
    }
}
