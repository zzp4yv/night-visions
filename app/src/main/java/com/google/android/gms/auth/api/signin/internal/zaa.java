package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        int i2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 2) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 3) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                bundle = SafeParcelReader.m14442f(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new GoogleSignInOptionsExtensionParcelable(i2, i3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i2) {
        return new GoogleSignInOptionsExtensionParcelable[i2];
    }
}
