package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.w3 */
/* loaded from: classes2.dex */
final class C7576w3<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f27920f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f27921g;

    /* renamed from: h */
    private final /* synthetic */ C7564u3 f27922h;

    private C7576w3(C7564u3 c7564u3) {
        List list;
        this.f27922h = c7564u3;
        list = c7564u3.f27904g;
        this.f27920f = list.size();
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m21442b() {
        Map map;
        if (this.f27921g == null) {
            map = this.f27922h.f27908k;
            this.f27921g = map.entrySet().iterator();
        }
        return this.f27921g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i2 = this.f27920f;
        if (i2 > 0) {
            list = this.f27922h.f27904g;
            if (i2 <= list.size()) {
                return true;
            }
        }
        return m21442b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (m21442b().hasNext()) {
            return m21442b().next();
        }
        list = this.f27922h.f27904g;
        int i2 = this.f27920f - 1;
        this.f27920f = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7576w3(C7564u3 c7564u3, C7558t3 c7558t3) {
        this(c7564u3);
    }
}
