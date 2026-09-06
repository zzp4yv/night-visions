package com.bumptech.glide.load.p131o.p132c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.o.c.n */
/* loaded from: classes.dex */
public class C5460n implements InterfaceC5396l<Drawable> {

    /* renamed from: b */
    private final InterfaceC5396l<Bitmap> f13752b;

    /* renamed from: c */
    private final boolean f13753c;

    public C5460n(InterfaceC5396l<Bitmap> interfaceC5396l, boolean z) {
        this.f13752b = interfaceC5396l;
        this.f13753c = z;
    }

    /* renamed from: b */
    private InterfaceC5371u<Drawable> m10656b(Context context, InterfaceC5371u<Bitmap> interfaceC5371u) {
        return C5464r.m10661f(context.getResources(), interfaceC5371u);
    }

    /* renamed from: a */
    public InterfaceC5396l<BitmapDrawable> m10657a() {
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (obj instanceof C5460n) {
            return this.f13752b.equals(((C5460n) obj).f13752b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return this.f13752b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5396l
    public InterfaceC5371u<Drawable> transform(Context context, InterfaceC5371u<Drawable> interfaceC5371u, int i2, int i3) {
        InterfaceC5380e m9982f = ComponentCallbacks2C5316c.m9972c(context).m9982f();
        Drawable drawable = interfaceC5371u.get();
        InterfaceC5371u<Bitmap> m10654a = C5459m.m10654a(m9982f, drawable, i2, i3);
        if (m10654a != null) {
            InterfaceC5371u<Bitmap> transform = this.f13752b.transform(context, m10654a, i2, i3);
            if (!transform.equals(m10654a)) {
                return m10656b(context, transform);
            }
            transform.mo10340c();
            return interfaceC5371u;
        }
        if (!this.f13753c) {
            return interfaceC5371u;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13752b.updateDiskCacheKey(messageDigest);
    }
}
