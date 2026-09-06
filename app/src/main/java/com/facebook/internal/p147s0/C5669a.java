package com.facebook.internal.p147s0;

import kotlin.jvm.internal.C9768m;

/* compiled from: GateKeeper.kt */
/* renamed from: com.facebook.internal.s0.a */
/* loaded from: classes2.dex */
public final class C5669a {

    /* renamed from: a */
    private final String f14537a;

    /* renamed from: b */
    private final boolean f14538b;

    public C5669a(String str, boolean z) {
        C9768m.m32346f(str, "name");
        this.f14537a = str;
        this.f14538b = z;
    }

    /* renamed from: a */
    public final String m11701a() {
        return this.f14537a;
    }

    /* renamed from: b */
    public final boolean m11702b() {
        return this.f14538b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5669a)) {
            return false;
        }
        C5669a c5669a = (C5669a) obj;
        return C9768m.m32341a(this.f14537a, c5669a.f14537a) && this.f14538b == c5669a.f14538b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f14537a.hashCode() * 31;
        boolean z = this.f14538b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f14537a + ", value=" + this.f14538b + ')';
    }
}
