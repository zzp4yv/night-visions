package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator<SafeBrowsingData> {
    /* renamed from: a */
    static void m23604a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i2) {
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, safeBrowsingData.m23597Y(), false);
        SafeParcelWriter.m14484s(parcel, 3, safeBrowsingData.m23599y(), i2, false);
        SafeParcelWriter.m14484s(parcel, 4, safeBrowsingData.m23600z(), i2, false);
        SafeParcelWriter.m14481p(parcel, 5, safeBrowsingData.m23596W());
        SafeParcelWriter.m14471f(parcel, 6, safeBrowsingData.m23598e0(), false);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j2 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 3) {
                dataHolder = (DataHolder) SafeParcelReader.m14451o(parcel, m14425C, DataHolder.CREATOR);
            } else if (m14458v == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m14451o(parcel, m14425C, ParcelFileDescriptor.CREATOR);
            } else if (m14458v == 5) {
                j2 = SafeParcelReader.m14429G(parcel, m14425C);
            } else if (m14458v != 6) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                bArr = SafeParcelReader.m14443g(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData[] newArray(int i2) {
        return new SafeBrowsingData[i2];
    }
}
