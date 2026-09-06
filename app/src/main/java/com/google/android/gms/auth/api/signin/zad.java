package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zad implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m14456t(parcel, m14425C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m14451o(parcel, m14425C, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 6:
                    z3 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 7:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m14456t(parcel, m14425C, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new GoogleSignInOptions(i2, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
