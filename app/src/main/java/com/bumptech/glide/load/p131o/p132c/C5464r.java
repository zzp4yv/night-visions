package com.bumptech.glide.load.p131o.p132c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC5367q;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: LazyBitmapDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.c.r */
/* loaded from: classes.dex */
public final class C5464r implements InterfaceC5371u<BitmapDrawable>, InterfaceC5367q {

    /* renamed from: f */
    private final Resources f13759f;

    /* renamed from: g */
    private final InterfaceC5371u<Bitmap> f13760g;

    private C5464r(Resources resources, InterfaceC5371u<Bitmap> interfaceC5371u) {
        this.f13759f = (Resources) C5563j.m11042d(resources);
        this.f13760g = (InterfaceC5371u) C5563j.m11042d(interfaceC5371u);
    }

    /* renamed from: f */
    public static InterfaceC5371u<BitmapDrawable> m10661f(Resources resources, InterfaceC5371u<Bitmap> interfaceC5371u) {
        if (interfaceC5371u == null) {
            return null;
        }
        return new C5464r(resources, interfaceC5371u);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5367q
    /* renamed from: a */
    public void mo10346a() {
        InterfaceC5371u<Bitmap> interfaceC5371u = this.f13760g;
        if (interfaceC5371u instanceof InterfaceC5367q) {
            ((InterfaceC5367q) interfaceC5371u).mo10346a();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f13759f, this.f13760g.get());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: c */
    public void mo10340c() {
        this.f13760g.mo10340c();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13760g.mo10341d();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: e */
    public Class<BitmapDrawable> mo10342e() {
        return BitmapDrawable.class;
    }
}
