package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.InterfaceC5367q;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;

/* compiled from: BitmapResource.java */
/* renamed from: com.bumptech.glide.load.o.c.d */
/* loaded from: classes.dex */
public class C5450d implements InterfaceC5371u<Bitmap>, InterfaceC5367q {

    /* renamed from: f */
    private final Bitmap f13716f;

    /* renamed from: g */
    private final InterfaceC5380e f13717g;

    public C5450d(Bitmap bitmap, InterfaceC5380e interfaceC5380e) {
        this.f13716f = (Bitmap) C5563j.m11043e(bitmap, "Bitmap must not be null");
        this.f13717g = (InterfaceC5380e) C5563j.m11043e(interfaceC5380e, "BitmapPool must not be null");
    }

    /* renamed from: f */
    public static C5450d m10607f(Bitmap bitmap, InterfaceC5380e interfaceC5380e) {
        if (bitmap == null) {
            return null;
        }
        return new C5450d(bitmap, interfaceC5380e);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5367q
    /* renamed from: a */
    public void mo10346a() {
        this.f13716f.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f13716f;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: c */
    public void mo10340c() {
        this.f13717g.mo10387c(this.f13716f);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: d */
    public int mo10341d() {
        return C5564k.m11051h(this.f13716f);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: e */
    public Class<Bitmap> mo10342e() {
        return Bitmap.class;
    }
}
