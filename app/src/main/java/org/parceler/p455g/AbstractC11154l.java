package org.parceler.p455g;

import android.os.Parcel;
import android.util.SparseArray;
import org.parceler.InterfaceC11142f;

/* compiled from: SparseArrayParcelConverter.java */
/* renamed from: org.parceler.g.l */
/* loaded from: classes3.dex */
public abstract class AbstractC11154l<T> implements InterfaceC11142f {
    @Override // org.parceler.InterfaceC11142f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SparseArray<T> mo39880a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), mo39820d(parcel));
        }
        return sparseArray;
    }

    /* renamed from: d */
    public abstract T mo39820d(Parcel parcel);

    /* renamed from: e */
    public abstract void mo39821e(T t, Parcel parcel);

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo39881b(SparseArray<T> sparseArray, Parcel parcel) {
        if (sparseArray == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            mo39821e(sparseArray.valueAt(i2), parcel);
        }
    }
}
