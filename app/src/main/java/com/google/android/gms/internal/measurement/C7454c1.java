package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes.dex */
final class C7454c1<T> implements zzcz<T> {

    /* renamed from: f */
    private volatile zzcz<T> f27704f;

    /* renamed from: g */
    private volatile boolean f27705g;

    /* renamed from: h */
    @NullableDecl
    private T f27706h;

    C7454c1(zzcz<T> zzczVar) {
        this.f27704f = (zzcz) zzcx.m22126a(zzczVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    /* renamed from: a */
    public final T mo20970a() {
        if (!this.f27705g) {
            synchronized (this) {
                if (!this.f27705g) {
                    T mo20970a = this.f27704f.mo20970a();
                    this.f27706h = mo20970a;
                    this.f27705g = true;
                    this.f27704f = null;
                    return mo20970a;
                }
            }
        }
        return this.f27706h;
    }

    public final String toString() {
        Object obj = this.f27704f;
        if (obj == null) {
            String valueOf = String.valueOf(this.f27706h);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
