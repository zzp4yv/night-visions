package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
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
                    j3 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 4:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 5:
                    j4 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 6:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 7:
                    f2 = SafeParcelReader.m14423A(parcel, m14425C);
                    break;
                case 8:
                    j5 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f2, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
