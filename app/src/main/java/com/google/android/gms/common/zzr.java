package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        boolean z = false;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v == 2) {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            } else if (m14458v == 3) {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v != 4) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzq(z, str, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzq[i2];
    }
}
