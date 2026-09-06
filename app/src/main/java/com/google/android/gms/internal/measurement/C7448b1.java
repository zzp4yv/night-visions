package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* loaded from: classes.dex */
final class C7448b1<T> implements zzcz<T>, Serializable {

    /* renamed from: f */
    @NullableDecl
    private final T f27693f;

    C7448b1(@NullableDecl T t) {
        this.f27693f = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    /* renamed from: a */
    public final T mo20970a() {
        return this.f27693f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C7448b1)) {
            return false;
        }
        T t = this.f27693f;
        T t2 = ((C7448b1) obj).f27693f;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27693f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27693f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
