package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c4 */
/* loaded from: classes2.dex */
final class C7457c4<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f27708f;

    /* renamed from: g */
    private boolean f27709g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f27710h;

    /* renamed from: i */
    private final /* synthetic */ C7564u3 f27711i;

    private C7457c4(C7564u3 c7564u3) {
        this.f27711i = c7564u3;
        this.f27708f = -1;
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m21029b() {
        Map map;
        if (this.f27710h == null) {
            map = this.f27711i.f27905h;
            this.f27710h = map.entrySet().iterator();
        }
        return this.f27710h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.f27708f + 1;
        list = this.f27711i.f27904g;
        if (i2 >= list.size()) {
            map = this.f27711i.f27905h;
            if (map.isEmpty() || !m21029b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f27709g = true;
        int i2 = this.f27708f + 1;
        this.f27708f = i2;
        list = this.f27711i.f27904g;
        if (i2 >= list.size()) {
            return m21029b().next();
        }
        list2 = this.f27711i.f27904g;
        return (Map.Entry) list2.get(this.f27708f);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f27709g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f27709g = false;
        this.f27711i.m21426q();
        int i2 = this.f27708f;
        list = this.f27711i.f27904g;
        if (i2 >= list.size()) {
            m21029b().remove();
            return;
        }
        C7564u3 c7564u3 = this.f27711i;
        int i3 = this.f27708f;
        this.f27708f = i3 - 1;
        c7564u3.m21423l(i3);
    }

    /* synthetic */ C7457c4(C7564u3 c7564u3, C7558t3 c7558t3) {
        this(c7564u3);
    }
}
