package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.a1 */
/* loaded from: classes.dex */
final class C7442a1<T> implements zzcz<T>, Serializable {

    /* renamed from: f */
    private final zzcz<T> f27685f;

    /* renamed from: g */
    private volatile transient boolean f27686g;

    /* renamed from: h */
    @NullableDecl
    private transient T f27687h;

    C7442a1(zzcz<T> zzczVar) {
        this.f27685f = (zzcz) zzcx.m22126a(zzczVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    /* renamed from: a */
    public final T mo20970a() {
        if (!this.f27686g) {
            synchronized (this) {
                if (!this.f27686g) {
                    T mo20970a = this.f27685f.mo20970a();
                    this.f27687h = mo20970a;
                    this.f27686g = true;
                    return mo20970a;
                }
            }
        }
        return this.f27687h;
    }

    public final String toString() {
        Object obj;
        if (this.f27686g) {
            String valueOf = String.valueOf(this.f27687h);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f27685f;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
