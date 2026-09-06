package org.parceler.p455g;

import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import org.parceler.InterfaceC11142f;

/* compiled from: CollectionParcelConverter.java */
/* renamed from: org.parceler.g.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11146d<T, C extends Collection<T>> implements InterfaceC11142f<Collection<T>, C> {
    /* renamed from: c */
    public abstract C mo39882c();

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C mo39880a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        C mo39882c = mo39882c();
        for (int i2 = 0; i2 < readInt; i2++) {
            mo39882c.add(mo39777e(parcel));
        }
        return mo39882c;
    }

    /* renamed from: e */
    public abstract T mo39777e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo39778f(T t, Parcel parcel);

    @Override // org.parceler.InterfaceC11142f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo39881b(Collection<T> collection, Parcel parcel) {
        if (collection == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo39778f(it.next(), parcel);
        }
    }
}
