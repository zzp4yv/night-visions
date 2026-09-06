package org.parceler.p455g;

import android.os.Parcel;
import java.util.Map;
import org.parceler.InterfaceC11142f;

/* compiled from: MapParcelConverter.java */
/* renamed from: org.parceler.g.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11152j<K, V, M extends Map<K, V>> implements InterfaceC11142f<Map<K, V>, M> {
    /* renamed from: c */
    public abstract M mo39890c();

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public M mo39880a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        M mo39890c = mo39890c();
        for (int i2 = 0; i2 < readInt; i2++) {
            mo39890c.put(mo39797e(parcel), mo39799g(parcel));
        }
        return mo39890c;
    }

    /* renamed from: e */
    public abstract K mo39797e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo39798f(K k2, Parcel parcel);

    /* renamed from: g */
    public abstract V mo39799g(Parcel parcel);

    /* renamed from: h */
    public abstract void mo39800h(V v, Parcel parcel);

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo39881b(Map<K, V> map, Parcel parcel) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            mo39798f(entry.getKey(), parcel);
            mo39800h(entry.getValue(), parcel);
        }
    }
}
