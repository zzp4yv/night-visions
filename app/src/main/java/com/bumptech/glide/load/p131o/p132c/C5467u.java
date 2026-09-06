package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* renamed from: com.bumptech.glide.load.o.c.u */
/* loaded from: classes.dex */
public final class C5467u extends AbstractC5451e {

    /* renamed from: b */
    private static final byte[] f13769b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC5390f.f13555a);

    /* renamed from: c */
    private final int f13770c;

    public C5467u(int i2) {
        C5563j.m11039a(i2 > 0, "roundingRadius must be greater than 0.");
        this.f13770c = i2;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        return (obj instanceof C5467u) && this.f13770c == ((C5467u) obj).f13770c;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return C5564k.m11057n(-569625254, C5564k.m11056m(this.f13770c));
    }

    @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5451e
    protected Bitmap transform(InterfaceC5380e interfaceC5380e, Bitmap bitmap, int i2, int i3) {
        return C5469w.m10685o(interfaceC5380e, bitmap, this.f13770c);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13769b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13770c).array());
    }
}
