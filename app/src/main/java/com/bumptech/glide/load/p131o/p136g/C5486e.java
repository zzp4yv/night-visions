package com.bumptech.glide.load.p131o.p136g;

import com.bumptech.glide.load.engine.InterfaceC5367q;
import com.bumptech.glide.load.p131o.p134e.AbstractC5475b;

/* compiled from: GifDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.g.e */
/* loaded from: classes.dex */
public class C5486e extends AbstractC5475b<C5484c> implements InterfaceC5367q {
    public C5486e(C5484c c5484c) {
        super(c5484c);
    }

    @Override // com.bumptech.glide.load.p131o.p134e.AbstractC5475b, com.bumptech.glide.load.engine.InterfaceC5367q
    /* renamed from: a */
    public void mo10346a() {
        ((C5484c) this.f13792f).m10741e().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: c */
    public void mo10340c() {
        ((C5484c) this.f13792f).stop();
        ((C5484c) this.f13792f).m10745k();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: d */
    public int mo10341d() {
        return ((C5484c) this.f13792f).m10744i();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: e */
    public Class<C5484c> mo10342e() {
        return C5484c.class;
    }
}
