package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5564k;

/* compiled from: UnitBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.x */
/* loaded from: classes.dex */
public final class C5470x implements InterfaceC5394j<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.x$a */
    private static final class a implements InterfaceC5371u<Bitmap> {

        /* renamed from: f */
        private final Bitmap f13780f;

        a(Bitmap bitmap) {
            this.f13780f = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5371u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f13780f;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5371u
        /* renamed from: c */
        public void mo10340c() {
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5371u
        /* renamed from: d */
        public int mo10341d() {
            return C5564k.m11051h(this.f13780f);
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5371u
        /* renamed from: e */
        public Class<Bitmap> mo10342e() {
            return Bitmap.class;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<Bitmap> mo10453b(Bitmap bitmap, int i2, int i3, C5393i c5393i) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(Bitmap bitmap, C5393i c5393i) {
        return true;
    }
}
