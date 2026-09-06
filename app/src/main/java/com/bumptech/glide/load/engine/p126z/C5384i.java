package com.bumptech.glide.load.engine.p126z;

/* compiled from: IntegerArrayAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.i */
/* loaded from: classes.dex */
public final class C5384i implements InterfaceC5376a<int[]> {
    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5376a
    /* renamed from: a */
    public int mo10363a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5376a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int mo10364b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5376a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i2) {
        return new int[i2];
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5376a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
