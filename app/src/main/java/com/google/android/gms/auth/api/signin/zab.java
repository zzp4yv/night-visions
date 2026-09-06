package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zab implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 4:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m14451o(parcel, m14425C, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 8:
                    j2 = SafeParcelReader.m14429G(parcel, m14425C);
                    break;
                case 9:
                    str6 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m14456t(parcel, m14425C, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 12:
                    str8 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
