package com.bumptech.glide.load.p131o.p136g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.p122l.InterfaceC5327a;

/* compiled from: GifBitmapProvider.java */
/* renamed from: com.bumptech.glide.load.o.g.b */
/* loaded from: classes.dex */
public final class C5483b implements InterfaceC5327a.a {

    /* renamed from: a */
    private final InterfaceC5380e f13802a;

    /* renamed from: b */
    private final InterfaceC5377b f13803b;

    public C5483b(InterfaceC5380e interfaceC5380e, InterfaceC5377b interfaceC5377b) {
        this.f13802a = interfaceC5380e;
        this.f13803b = interfaceC5377b;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: a */
    public Bitmap mo10114a(int i2, int i3, Bitmap.Config config) {
        return this.f13802a.mo10389e(i2, i3, config);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: b */
    public int[] mo10115b(int i2) {
        InterfaceC5377b interfaceC5377b = this.f13803b;
        return interfaceC5377b == null ? new int[i2] : (int[]) interfaceC5377b.mo10369e(i2, int[].class);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: c */
    public void mo10116c(Bitmap bitmap) {
        this.f13802a.mo10387c(bitmap);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: d */
    public void mo10117d(byte[] bArr) {
        InterfaceC5377b interfaceC5377b = this.f13803b;
        if (interfaceC5377b == null) {
            return;
        }
        interfaceC5377b.mo10368d(bArr);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: e */
    public byte[] mo10118e(int i2) {
        InterfaceC5377b interfaceC5377b = this.f13803b;
        return interfaceC5377b == null ? new byte[i2] : (byte[]) interfaceC5377b.mo10369e(i2, byte[].class);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a.a
    /* renamed from: f */
    public void mo10119f(int[] iArr) {
        InterfaceC5377b interfaceC5377b = this.f13803b;
        if (interfaceC5377b == null) {
            return;
        }
        interfaceC5377b.mo10368d(iArr);
    }
}
