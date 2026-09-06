package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v == 2) {
                z2 = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v == 3) {
                z3 = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v == 4) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 1000) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new CredentialPickerConfig(i2, z, z2, z3, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i2) {
        return new CredentialPickerConfig[i2];
    }
}
