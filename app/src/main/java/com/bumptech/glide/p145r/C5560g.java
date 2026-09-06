package com.bumptech.glide.p145r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* renamed from: com.bumptech.glide.r.g */
/* loaded from: classes.dex */
public class C5560g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f14038a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f14039b;

    /* renamed from: c */
    private long f14040c;

    /* renamed from: d */
    private long f14041d;

    public C5560g(long j2) {
        this.f14039b = j2;
        this.f14040c = j2;
    }

    /* renamed from: f */
    private void m11029f() {
        m11035m(this.f14040c);
    }

    /* renamed from: b */
    public void m11030b() {
        m11035m(0L);
    }

    /* renamed from: g */
    public synchronized Y m11031g(T t) {
        return this.f14038a.get(t);
    }

    /* renamed from: h */
    public synchronized long m11032h() {
        return this.f14040c;
    }

    /* renamed from: i */
    protected int mo10194i(Y y) {
        return 1;
    }

    /* renamed from: j */
    protected void mo10195j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y m11033k(T t, Y y) {
        long mo10194i = mo10194i(y);
        if (mo10194i >= this.f14040c) {
            mo10195j(t, y);
            return null;
        }
        if (y != null) {
            this.f14041d += mo10194i;
        }
        Y put = this.f14038a.put(t, y);
        if (put != null) {
            this.f14041d -= mo10194i(put);
            if (!put.equals(y)) {
                mo10195j(t, put);
            }
        }
        m11029f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y m11034l(T t) {
        Y remove;
        remove = this.f14038a.remove(t);
        if (remove != null) {
            this.f14041d -= mo10194i(remove);
        }
        return remove;
    }

    /* renamed from: m */
    protected synchronized void m11035m(long j2) {
        while (this.f14041d > j2) {
            Iterator<Map.Entry<T, Y>> it = this.f14038a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f14041d -= mo10194i(value);
            T key = next.getKey();
            it.remove();
            mo10195j(key, value);
        }
    }
}
