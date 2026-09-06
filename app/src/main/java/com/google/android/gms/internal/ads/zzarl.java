package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarl implements Parcelable.Creator<zzark> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 2) {
                z = SafeParcelReader.m14459w(parcel, m14425C);
            } else if (m14458v != 3) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                arrayList = SafeParcelReader.m14454r(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzark(z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark[] newArray(int i2) {
        return new zzark[i2];
    }
}
