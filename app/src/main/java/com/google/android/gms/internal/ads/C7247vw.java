package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* renamed from: com.google.android.gms.internal.ads.vw */
/* loaded from: classes2.dex */
final class C7247vw<K, V> implements Comparable<C7247vw>, Map.Entry<K, V> {

    /* renamed from: f */
    private final Comparable f20757f;

    /* renamed from: g */
    private V f20758g;

    /* renamed from: h */
    private final /* synthetic */ C6988ow f20759h;

    C7247vw(C6988ow c6988ow, Map.Entry<K, V> entry) {
        this(c6988ow, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: g */
    private static boolean m15967g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C7247vw c7247vw) {
        return ((Comparable) getKey()).compareTo((Comparable) c7247vw.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m15967g(this.f20757f, entry.getKey()) && m15967g(this.f20758g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f20757f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f20758g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f20757f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f20758g;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f20759h.m15697k();
        V v2 = this.f20758g;
        this.f20758g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20757f);
        String valueOf2 = String.valueOf(this.f20758g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    C7247vw(C6988ow c6988ow, K k2, V v) {
        this.f20759h = c6988ow;
        this.f20757f = k2;
        this.f20758g = v;
    }
}
