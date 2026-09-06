package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzam implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal createFromParcel(Parcel parcel) {
        int m14434L = SafeParcelReader.m14434L(parcel);
        ArrayList<String> arrayList = null;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            int m14458v = SafeParcelReader.m14458v(m14425C);
            if (m14458v == 1) {
                arrayList = SafeParcelReader.m14454r(parcel, m14425C);
            } else if (m14458v == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, m14425C, PendingIntent.CREATOR);
            } else if (m14458v != 3) {
                SafeParcelReader.m14433K(parcel, m14425C);
            } else {
                str = SafeParcelReader.m14452p(parcel, m14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, m14434L);
        return new zzal(arrayList, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i2) {
        return new zzal[i2];
    }
}
