package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.C5381f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* renamed from: com.bumptech.glide.load.o.c.m */
/* loaded from: classes.dex */
final class C5459m {

    /* renamed from: a */
    private static final InterfaceC5380e f13751a = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* renamed from: com.bumptech.glide.load.o.c.m$a */
    class a extends C5381f {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.p126z.C5381f, com.bumptech.glide.load.engine.p126z.InterfaceC5380e
        /* renamed from: c */
        public void mo10387c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static InterfaceC5371u<Bitmap> m10654a(InterfaceC5380e interfaceC5380e, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m10655b(interfaceC5380e, current, i2, i3);
            z = true;
        }
        if (!z) {
            interfaceC5380e = f13751a;
        }
        return C5450d.m10607f(bitmap, interfaceC5380e);
    }

    /* renamed from: b */
    private static Bitmap m10655b(InterfaceC5380e interfaceC5380e, Drawable drawable, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i3 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Lock m10679i = C5469w.m10679i();
        m10679i.lock();
        Bitmap mo10388d = interfaceC5380e.mo10388d(i2, i3, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(mo10388d);
            drawable.setBounds(0, 0, i2, i3);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return mo10388d;
        } finally {
            m10679i.unlock();
        }
    }
}
