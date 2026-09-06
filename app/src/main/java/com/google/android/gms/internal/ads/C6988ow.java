package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.ow */
/* loaded from: classes2.dex */
class C6988ow<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f20217f;

    /* renamed from: g */
    private List<C7247vw> f20218g;

    /* renamed from: h */
    private Map<K, V> f20219h;

    /* renamed from: i */
    private boolean f20220i;

    /* renamed from: j */
    private volatile C7321xw f20221j;

    /* renamed from: k */
    private Map<K, V> f20222k;

    /* renamed from: l */
    private volatile C7099rw f20223l;

    private C6988ow(int i2) {
        this.f20217f = i2;
        this.f20218g = Collections.emptyList();
        this.f20219h = Collections.emptyMap();
        this.f20222k = Collections.emptyMap();
    }

    /* renamed from: b */
    private final int m15694b(K k2) {
        int size = this.f20218g.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f20218g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo((Comparable) this.f20218g.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m15697k() {
        if (this.f20220i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l */
    private final SortedMap<K, V> m15698l() {
        m15697k();
        if (this.f20219h.isEmpty() && !(this.f20219h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f20219h = treeMap;
            this.f20222k = treeMap.descendingMap();
        }
        return (SortedMap) this.f20219h;
    }

    /* renamed from: p */
    static <FieldDescriptorType extends zzdnu<FieldDescriptorType>> C6988ow<FieldDescriptorType, Object> m15702p(int i2) {
        return new C7025pw(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final V m15703r(int i2) {
        m15697k();
        V v = (V) this.f20218g.remove(i2).getValue();
        if (!this.f20219h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m15698l().entrySet().iterator();
            this.f20218g.add(new C7247vw(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* renamed from: a */
    public final boolean m15704a() {
        return this.f20220i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m15697k();
        if (!this.f20218g.isEmpty()) {
            this.f20218g.clear();
        }
        if (this.f20219h.isEmpty()) {
            return;
        }
        this.f20219h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m15694b(comparable) >= 0 || this.f20219h.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        m15697k();
        int m15694b = m15694b(k2);
        if (m15694b >= 0) {
            return (V) this.f20218g.get(m15694b).setValue(v);
        }
        m15697k();
        if (this.f20218g.isEmpty() && !(this.f20218g instanceof ArrayList)) {
            this.f20218g = new ArrayList(this.f20217f);
        }
        int i2 = -(m15694b + 1);
        if (i2 >= this.f20217f) {
            return m15698l().put(k2, v);
        }
        int size = this.f20218g.size();
        int i3 = this.f20217f;
        if (size == i3) {
            C7247vw remove = this.f20218g.remove(i3 - 1);
            m15698l().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f20218g.add(i2, new C7247vw(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f20221j == null) {
            this.f20221j = new C7321xw(this, null);
        }
        return this.f20221j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6988ow)) {
            return super.equals(obj);
        }
        C6988ow c6988ow = (C6988ow) obj;
        int size = size();
        if (size != c6988ow.size()) {
            return false;
        }
        int m15707h = m15707h();
        if (m15707h != c6988ow.m15707h()) {
            return entrySet().equals(c6988ow.entrySet());
        }
        for (int i2 = 0; i2 < m15707h; i2++) {
            if (!m15710q(i2).equals(c6988ow.m15710q(i2))) {
                return false;
            }
        }
        if (m15707h != size) {
            return this.f20219h.equals(c6988ow.f20219h);
        }
        return true;
    }

    /* renamed from: f */
    public void mo15706f() {
        if (this.f20220i) {
            return;
        }
        this.f20219h = this.f20219h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f20219h);
        this.f20222k = this.f20222k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f20222k);
        this.f20220i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m15694b = m15694b(comparable);
        return m15694b >= 0 ? (V) this.f20218g.get(m15694b).getValue() : this.f20219h.get(comparable);
    }

    /* renamed from: h */
    public final int m15707h() {
        return this.f20218g.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m15707h = m15707h();
        int i2 = 0;
        for (int i3 = 0; i3 < m15707h; i3++) {
            i2 += this.f20218g.get(i3).hashCode();
        }
        return this.f20219h.size() > 0 ? i2 + this.f20219h.hashCode() : i2;
    }

    /* renamed from: i */
    public final Iterable<Map.Entry<K, V>> m15708i() {
        return this.f20219h.isEmpty() ? C7136sw.m15895a() : this.f20219h.entrySet();
    }

    /* renamed from: j */
    final Set<Map.Entry<K, V>> m15709j() {
        if (this.f20223l == null) {
            this.f20223l = new C7099rw(this, null);
        }
        return this.f20223l;
    }

    /* renamed from: q */
    public final Map.Entry<K, V> m15710q(int i2) {
        return this.f20218g.get(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m15697k();
        Comparable comparable = (Comparable) obj;
        int m15694b = m15694b(comparable);
        if (m15694b >= 0) {
            return (V) m15703r(m15694b);
        }
        if (this.f20219h.isEmpty()) {
            return null;
        }
        return this.f20219h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f20218g.size() + this.f20219h.size();
    }

    /* synthetic */ C6988ow(int i2, C7025pw c7025pw) {
        this(i2);
    }
}
