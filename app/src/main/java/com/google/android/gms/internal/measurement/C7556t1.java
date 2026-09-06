package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* loaded from: classes2.dex */
final class C7556t1 {

    /* renamed from: a */
    private final zzen f27897a;

    /* renamed from: b */
    private final byte[] f27898b;

    private C7556t1(int i2) {
        byte[] bArr = new byte[i2];
        this.f27898b = bArr;
        this.f27897a = zzen.m22190f(bArr);
    }

    /* renamed from: a */
    public final zzdu m21404a() {
        this.f27897a.m22211N();
        return new C7562u1(this.f27898b);
    }

    /* renamed from: b */
    public final zzen m21405b() {
        return this.f27897a;
    }

    /* synthetic */ C7556t1(int i2, C7526o1 c7526o1) {
        this(i2);
    }
}
