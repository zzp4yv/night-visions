package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.ads.ww */
/* loaded from: classes2.dex */
final class C7284ww<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f20873f;

    /* renamed from: g */
    private boolean f20874g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f20875h;

    /* renamed from: i */
    private final /* synthetic */ C6988ow f20876i;

    private C7284ww(C6988ow c6988ow) {
        this.f20876i = c6988ow;
        this.f20873f = -1;
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m15984b() {
        Map map;
        if (this.f20875h == null) {
            map = this.f20876i.f20219h;
            this.f20875h = map.entrySet().iterator();
        }
        return this.f20875h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.f20873f + 1;
        list = this.f20876i.f20218g;
        if (i2 >= list.size()) {
            map = this.f20876i.f20219h;
            if (map.isEmpty() || !m15984b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f20874g = true;
        int i2 = this.f20873f + 1;
        this.f20873f = i2;
        list = this.f20876i.f20218g;
        if (i2 >= list.size()) {
            return m15984b().next();
        }
        list2 = this.f20876i.f20218g;
        return (Map.Entry) list2.get(this.f20873f);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f20874g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20874g = false;
        this.f20876i.m15697k();
        int i2 = this.f20873f;
        list = this.f20876i.f20218g;
        if (i2 >= list.size()) {
            m15984b().remove();
            return;
        }
        C6988ow c6988ow = this.f20876i;
        int i3 = this.f20873f;
        this.f20873f = i3 - 1;
        c6988ow.m15703r(i3);
    }

    /* synthetic */ C7284ww(C6988ow c6988ow, C7025pw c7025pw) {
        this(c6988ow);
    }
}
