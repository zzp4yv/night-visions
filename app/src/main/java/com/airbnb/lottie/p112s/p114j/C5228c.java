package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.p118v.C5291b;
import com.airbnb.lottie.p118v.C5294e;

/* compiled from: GradientColor.java */
/* renamed from: com.airbnb.lottie.s.j.c */
/* loaded from: classes.dex */
public class C5228c {

    /* renamed from: a */
    private final float[] f12697a;

    /* renamed from: b */
    private final int[] f12698b;

    public C5228c(float[] fArr, int[] iArr) {
        this.f12697a = fArr;
        this.f12698b = iArr;
    }

    /* renamed from: a */
    public int[] m9632a() {
        return this.f12698b;
    }

    /* renamed from: b */
    public float[] m9633b() {
        return this.f12697a;
    }

    /* renamed from: c */
    public int m9634c() {
        return this.f12698b.length;
    }

    /* renamed from: d */
    public void m9635d(C5228c c5228c, C5228c c5228c2, float f2) {
        if (c5228c.f12698b.length == c5228c2.f12698b.length) {
            for (int i2 = 0; i2 < c5228c.f12698b.length; i2++) {
                this.f12697a[i2] = C5294e.m9880j(c5228c.f12697a[i2], c5228c2.f12697a[i2], f2);
                this.f12698b[i2] = C5291b.m9848c(f2, c5228c.f12698b[i2], c5228c2.f12698b[i2]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c5228c.f12698b.length + " vs " + c5228c2.f12698b.length + ")");
    }
}
