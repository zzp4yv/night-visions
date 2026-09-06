package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbe implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        List<ClientIdentity> list = zzbd.f27643f;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v != 1) {
                switch (m14458v) {
                    case 5:
                        list = SafeParcelReader.m14456t(parcel, m14425C, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m14452p(parcel, m14425C);
                        break;
                    case 7:
                        z = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m14452p(parcel, m14425C);
                        break;
                    default:
                        SafeParcelReader.m14433K(parcel, m14425C);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m14451o(parcel, m14425C, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzbd(locationRequest, list, str, z, z2, z3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i2) {
        return new zzbd[i2];
    }
}
