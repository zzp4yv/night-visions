package com.bumptech.glide.load.p131o.p137h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.p131o.p133d.C5473b;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.a */
/* loaded from: classes.dex */
public class C5492a implements InterfaceC5496e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f13844a;

    /* renamed from: b */
    private final int f13845b;

    public C5492a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5496e
    /* renamed from: a */
    public InterfaceC5371u<byte[]> mo10776a(InterfaceC5371u<Bitmap> interfaceC5371u, C5393i c5393i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC5371u.get().compress(this.f13844a, this.f13845b, byteArrayOutputStream);
        interfaceC5371u.mo10340c();
        return new C5473b(byteArrayOutputStream.toByteArray());
    }

    public C5492a(Bitmap.CompressFormat compressFormat, int i2) {
        this.f13844a = compressFormat;
        this.f13845b = i2;
    }
}
