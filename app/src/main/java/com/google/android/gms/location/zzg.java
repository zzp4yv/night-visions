package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(m14425C) != 1) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                arrayList = SafeParcelReader.m14456t(parcel, m14425C, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new ActivityTransitionResult(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult[] newArray(int i2) {
        return new ActivityTransitionResult[i2];
    }
}
