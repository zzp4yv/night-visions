package com.bumptech.glide.load.p131o.p137h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.p132c.C5450d;
import com.bumptech.glide.load.p131o.p136g.C5484c;

/* compiled from: DrawableBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.c */
/* loaded from: classes.dex */
public final class C5494c implements InterfaceC5496e<Drawable, byte[]> {

    /* renamed from: a */
    private final InterfaceC5380e f13847a;

    /* renamed from: b */
    private final InterfaceC5496e<Bitmap, byte[]> f13848b;

    /* renamed from: c */
    private final InterfaceC5496e<C5484c, byte[]> f13849c;

    public C5494c(InterfaceC5380e interfaceC5380e, InterfaceC5496e<Bitmap, byte[]> interfaceC5496e, InterfaceC5496e<C5484c, byte[]> interfaceC5496e2) {
        this.f13847a = interfaceC5380e;
        this.f13848b = interfaceC5496e;
        this.f13849c = interfaceC5496e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static InterfaceC5371u<C5484c> m10777b(InterfaceC5371u<Drawable> interfaceC5371u) {
        return interfaceC5371u;
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5496e
    /* renamed from: a */
    public InterfaceC5371u<byte[]> mo10776a(InterfaceC5371u<Drawable> interfaceC5371u, C5393i c5393i) {
        Drawable drawable = interfaceC5371u.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f13848b.mo10776a(C5450d.m10607f(((BitmapDrawable) drawable).getBitmap(), this.f13847a), c5393i);
        }
        if (drawable instanceof C5484c) {
            return this.f13849c.mo10776a(m10777b(interfaceC5371u), c5393i);
        }
        return null;
    }
}
