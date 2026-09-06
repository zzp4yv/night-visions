package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5554a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.f */
/* loaded from: classes.dex */
public class C5452f implements InterfaceC5394j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C5458l f13718a;

    public C5452f(C5458l c5458l) {
        this.f13718a = c5458l;
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<Bitmap> mo10453b(ByteBuffer byteBuffer, int i2, int i3, C5393i c5393i) throws IOException {
        return this.f13718a.m10648d(C5554a.m11018e(byteBuffer), i2, i3, c5393i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(ByteBuffer byteBuffer, C5393i c5393i) {
        return this.f13718a.m10651n(byteBuffer);
    }
}
