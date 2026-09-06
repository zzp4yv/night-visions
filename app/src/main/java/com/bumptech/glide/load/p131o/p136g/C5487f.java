package com.bumptech.glide.load.p131o.p136g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.p131o.p132c.C5450d;
import com.bumptech.glide.p145r.C5563j;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.o.g.f */
/* loaded from: classes.dex */
public class C5487f implements InterfaceC5396l<C5484c> {

    /* renamed from: b */
    private final InterfaceC5396l<Bitmap> f13816b;

    public C5487f(InterfaceC5396l<Bitmap> interfaceC5396l) {
        this.f13816b = (InterfaceC5396l) C5563j.m11042d(interfaceC5396l);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (obj instanceof C5487f) {
            return this.f13816b.equals(((C5487f) obj).f13816b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return this.f13816b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5396l
    public InterfaceC5371u<C5484c> transform(Context context, InterfaceC5371u<C5484c> interfaceC5371u, int i2, int i3) {
        C5484c c5484c = interfaceC5371u.get();
        InterfaceC5371u<Bitmap> c5450d = new C5450d(c5484c.m10741e(), ComponentCallbacks2C5316c.m9972c(context).m9982f());
        InterfaceC5371u<Bitmap> transform = this.f13816b.transform(context, c5450d, i2, i3);
        if (!c5450d.equals(transform)) {
            c5450d.mo10340c();
        }
        c5484c.m10746m(this.f13816b, transform.get());
        return interfaceC5371u;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13816b.updateDiskCacheKey(messageDigest);
    }
}
