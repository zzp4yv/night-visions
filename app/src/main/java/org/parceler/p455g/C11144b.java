package org.parceler.p455g;

import android.os.Parcel;
import org.parceler.InterfaceC11142f;

/* compiled from: BooleanArrayParcelConverter.java */
/* renamed from: org.parceler.g.b */
/* loaded from: classes3.dex */
public class C11144b implements InterfaceC11142f {
    @Override // org.parceler.InterfaceC11142f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean[] mo39880a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        parcel.readBooleanArray(zArr);
        return zArr;
    }

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo39881b(boolean[] zArr, Parcel parcel) {
        if (zArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(zArr.length);
            parcel.writeBooleanArray(zArr);
        }
    }
}
