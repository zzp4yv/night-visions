package com.bumptech.glide.load.p131o.p132c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.p145r.C5564k;

/* compiled from: BitmapTransformation.java */
/* renamed from: com.bumptech.glide.load.o.c.e */
/* loaded from: classes.dex */
public abstract class AbstractC5451e implements InterfaceC5396l<Bitmap> {
    protected abstract Bitmap transform(InterfaceC5380e interfaceC5380e, Bitmap bitmap, int i2, int i3);

    @Override // com.bumptech.glide.load.InterfaceC5396l
    public final InterfaceC5371u<Bitmap> transform(Context context, InterfaceC5371u<Bitmap> interfaceC5371u, int i2, int i3) {
        if (!C5564k.m11063t(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC5380e m9982f = ComponentCallbacks2C5316c.m9972c(context).m9982f();
        Bitmap bitmap = interfaceC5371u.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap transform = transform(m9982f, bitmap, i2, i3);
        return bitmap.equals(transform) ? interfaceC5371u : C5450d.m10607f(transform, m9982f);
    }
}
