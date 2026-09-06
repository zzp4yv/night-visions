package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* renamed from: com.bumptech.glide.load.o.c.g */
/* loaded from: classes.dex */
public class C5453g extends AbstractC5451e {

    /* renamed from: b */
    private static final byte[] f13719b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC5390f.f13555a);

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        return obj instanceof C5453g;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5451e
    protected Bitmap transform(InterfaceC5380e interfaceC5380e, Bitmap bitmap, int i2, int i3) {
        return C5469w.m10672b(interfaceC5380e, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13719b);
    }
}
