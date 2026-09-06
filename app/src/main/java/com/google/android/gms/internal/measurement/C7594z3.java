package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes2.dex */
final class C7594z3<K, V> implements Comparable<C7594z3>, Map.Entry<K, V> {

    /* renamed from: f */
    private final Comparable f27948f;

    /* renamed from: g */
    private V f27949g;

    /* renamed from: h */
    private final /* synthetic */ C7564u3 f27950h;

    C7594z3(C7564u3 c7564u3, Map.Entry<K, V> entry) {
        this(c7564u3, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: g */
    private static boolean m21487g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C7594z3 c7594z3) {
        return ((Comparable) getKey()).compareTo((Comparable) c7594z3.getKey());
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
        return m21487g(this.f27948f, entry.getKey()) && m21487g(this.f27949g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f27948f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f27949g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f27948f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f27949g;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f27950h.m21426q();
        V v2 = this.f27949g;
        this.f27949g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27948f);
        String valueOf2 = String.valueOf(this.f27949g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    C7594z3(C7564u3 c7564u3, K k2, V v) {
        this.f27950h = c7564u3;
        this.f27948f = k2;
        this.f27949g = v;
    }
}
