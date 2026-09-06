package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m14426D(parcel, m14425C);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.m14455s(parcel, m14425C, Scope.CREATOR);
                    break;
                case 4:
                    num = SafeParcelReader.m14428F(parcel, m14425C);
                    break;
                case 5:
                    num2 = SafeParcelReader.m14428F(parcel, m14425C);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.m14451o(parcel, m14425C, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new AuthAccountRequest(i2, iBinder, scopeArr, num, num2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i2) {
        return new AuthAccountRequest[i2];
    }
}
