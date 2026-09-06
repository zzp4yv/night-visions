package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zac implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                strArr = SafeParcelReader.m14453q(parcel, m14425C);
            } else if (m14458v == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m14455s(parcel, m14425C, CursorWindow.CREATOR);
            } else if (m14458v == 3) {
                i3 = SafeParcelReader.m14427E(parcel, m14425C);
            } else if (m14458v == 4) {
                bundle = SafeParcelReader.m14442f(parcel, m14425C);
            } else if (m14458v != 1000) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                i2 = SafeParcelReader.m14427E(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.m14266p0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
