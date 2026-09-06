package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<AccountChangeEventsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsRequest createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        Account account = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 2) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 3) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v != 4) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                account = (Account) SafeParcelReader.m14451o(parcel, m14425C, Account.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new AccountChangeEventsRequest(i2, i3, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsRequest[] newArray(int i2) {
        return new AccountChangeEventsRequest[i2];
    }
}
