package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.ads.qw */
/* loaded from: classes2.dex */
final class C7062qw<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f20412f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f20413g;

    /* renamed from: h */
    private final /* synthetic */ C6988ow f20414h;

    private C7062qw(C6988ow c6988ow) {
        List list;
        this.f20414h = c6988ow;
        list = c6988ow.f20218g;
        this.f20412f = list.size();
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m15812b() {
        Map map;
        if (this.f20413g == null) {
            map = this.f20414h.f20222k;
            this.f20413g = map.entrySet().iterator();
        }
        return this.f20413g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i2 = this.f20412f;
        if (i2 > 0) {
            list = this.f20414h.f20218g;
            if (i2 <= list.size()) {
                return true;
            }
        }
        return m15812b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (m15812b().hasNext()) {
            return m15812b().next();
        }
        list = this.f20414h.f20218g;
        int i2 = this.f20412f - 1;
        this.f20412f = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7062qw(C6988ow c6988ow, C7025pw c7025pw) {
        this(c6988ow);
    }
}
