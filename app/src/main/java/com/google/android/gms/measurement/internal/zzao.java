package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzao implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(m14425C) != 2) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                bundle = SafeParcelReader.m14442f(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzam(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i2) {
        return new zzam[i2];
    }
}
