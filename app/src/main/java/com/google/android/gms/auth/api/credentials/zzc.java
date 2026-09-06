package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 2:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m14451o(parcel, m14425C, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m14456t(parcel, m14425C, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 6:
                    str4 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
                case 9:
                    str5 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 10:
                    str6 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i2) {
        return new Credential[i2];
    }
}
