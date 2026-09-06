package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    /* renamed from: a */
    static void m14506a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, getServiceRequest.f17733h);
        SafeParcelWriter.m14477l(parcel, 2, getServiceRequest.f17734i);
        SafeParcelWriter.m14477l(parcel, 3, getServiceRequest.f17735j);
        SafeParcelWriter.m14486u(parcel, 4, getServiceRequest.f17736k, false);
        SafeParcelWriter.m14476k(parcel, 5, getServiceRequest.f17737l, false);
        SafeParcelWriter.m14489x(parcel, 6, getServiceRequest.f17738m, i2, false);
        SafeParcelWriter.m14470e(parcel, 7, getServiceRequest.f17739n, false);
        SafeParcelWriter.m14484s(parcel, 8, getServiceRequest.f17740o, i2, false);
        SafeParcelWriter.m14489x(parcel, 10, getServiceRequest.f17741p, i2, false);
        SafeParcelWriter.m14489x(parcel, 11, getServiceRequest.f17742q, i2, false);
        SafeParcelWriter.m14468c(parcel, 12, getServiceRequest.f17743r);
        SafeParcelWriter.m14477l(parcel, 13, getServiceRequest.f17744s);
        SafeParcelWriter.m14468c(parcel, 14, getServiceRequest.f17745t);
        SafeParcelWriter.m14486u(parcel, 15, getServiceRequest.m14325y(), false);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        Scope[] scopeArr = GetServiceRequest.f17731f;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f17732g;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(m14425C)) {
                case 1:
                    i2 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 2:
                    i3 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 3:
                    i4 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 4:
                    str = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m14426D(parcel, m14425C);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m14455s(parcel, m14425C, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m14442f(parcel, m14425C);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m14451o(parcel, m14425C, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.m14433K(parcel, m14425C);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m14455s(parcel, m14425C, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m14455s(parcel, m14425C, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 13:
                    i5 = SafeParcelReader.m14427E(parcel, m14425C);
                    break;
                case 14:
                    z2 = SafeParcelReader.m14459w(parcel, m14425C);
                    break;
                case 15:
                    str2 = SafeParcelReader.m14452p(parcel, m14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new GetServiceRequest(i2, i3, i4, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i5, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
