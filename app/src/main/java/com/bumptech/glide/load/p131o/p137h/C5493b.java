package com.bumptech.glide.load.p131o.p137h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.p131o.p132c.C5464r;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: BitmapDrawableTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.b */
/* loaded from: classes.dex */
public class C5493b implements InterfaceC5496e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f13846a;

    public C5493b(Resources resources) {
        this.f13846a = (Resources) C5563j.m11042d(resources);
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5496e
    /* renamed from: a */
    public InterfaceC5371u<BitmapDrawable> mo10776a(InterfaceC5371u<Bitmap> interfaceC5371u, C5393i c5393i) {
        return C5464r.m10661f(this.f13846a, interfaceC5371u);
    }
}
