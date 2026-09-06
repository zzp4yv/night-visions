package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 4) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m14451o(parcel, m14425C, GoogleSignInAccount.CREATOR);
            } else if (m14458v != 8) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                str2 = SafeParcelReader.m14452p(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
