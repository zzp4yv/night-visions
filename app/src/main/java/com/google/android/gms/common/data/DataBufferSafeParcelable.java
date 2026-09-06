package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: g */
    private static final String[] f17653g = {"data"};

    /* renamed from: h */
    private final Parcelable.Creator<T> f17654h;

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i2) {
        DataHolder dataHolder = this.f17640f;
        byte[] m14267y = dataHolder.m14267y("data", i2, dataHolder.m14265e0(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(m14267y, 0, m14267y.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f17654h.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
