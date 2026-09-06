package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator<HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v != 1000) {
                switch (m14458v) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m14451o(parcel, m14425C, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 3:
                        z2 = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 4:
                        strArr = SafeParcelReader.m14453q(parcel, m14425C);
                        break;
                    case 5:
                        z3 = SafeParcelReader.m14459w(parcel, m14425C);
                        break;
                    case 6:
                        str = SafeParcelReader.m14452p(parcel, m14425C);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m14452p(parcel, m14425C);
                        break;
                    default:
                        SafeParcelReader.m14433K(parcel, m14425C);
                        break;
                }
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new HintRequest(i2, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i2) {
        return new HintRequest[i2];
    }
}
