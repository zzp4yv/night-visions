package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.i0 */
/* loaded from: classes2.dex */
public class C8405i0 implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    static void m26574c(RemoteMessage remoteMessage, Parcel parcel, int i2) {
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14470e(parcel, 2, remoteMessage.f31926f, false);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
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
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }
}
