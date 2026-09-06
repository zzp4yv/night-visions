package org.parceler.p455g;

import android.os.Parcel;
import org.parceler.InterfaceC11142f;

/* compiled from: CharArrayParcelConverter.java */
/* renamed from: org.parceler.g.c */
/* loaded from: classes3.dex */
public class C11145c implements InterfaceC11142f {
    @Override // org.parceler.InterfaceC11142f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public char[] mo39880a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        char[] cArr = new char[readInt];
        parcel.readCharArray(cArr);
        return cArr;
    }

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo39881b(char[] cArr, Parcel parcel) {
        if (cArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(cArr.length);
            parcel.writeCharArray(cArr);
        }
    }
}
