package com.bumptech.glide.load.p131o.p136g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.p132c.C5450d;
import com.bumptech.glide.p122l.InterfaceC5327a;

/* compiled from: GifFrameResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.h */
/* loaded from: classes.dex */
public final class C5489h implements InterfaceC5394j<InterfaceC5327a, Bitmap> {

    /* renamed from: a */
    private final InterfaceC5380e f13838a;

    public C5489h(InterfaceC5380e interfaceC5380e) {
        this.f13838a = interfaceC5380e;
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<Bitmap> mo10453b(InterfaceC5327a interfaceC5327a, int i2, int i3, C5393i c5393i) {
        return C5450d.m10607f(interfaceC5327a.mo10105a(), this.f13838a);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InterfaceC5327a interfaceC5327a, C5393i c5393i) {
        return true;
    }
}
