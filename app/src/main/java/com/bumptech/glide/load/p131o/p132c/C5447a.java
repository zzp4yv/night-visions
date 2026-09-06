package com.bumptech.glide.load.p131o.p132c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5563j;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.a */
/* loaded from: classes.dex */
public class C5447a<DataType> implements InterfaceC5394j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC5394j<DataType, Bitmap> f13709a;

    /* renamed from: b */
    private final Resources f13710b;

    public C5447a(Resources resources, InterfaceC5394j<DataType, Bitmap> interfaceC5394j) {
        this.f13710b = (Resources) C5563j.m11042d(resources);
        this.f13709a = (InterfaceC5394j) C5563j.m11042d(interfaceC5394j);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: a */
    public boolean mo10452a(DataType datatype, C5393i c5393i) throws IOException {
        return this.f13709a.mo10452a(datatype, c5393i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: b */
    public InterfaceC5371u<BitmapDrawable> mo10453b(DataType datatype, int i2, int i3, C5393i c5393i) throws IOException {
        return C5464r.m10661f(this.f13710b, this.f13709a.mo10453b(datatype, i2, i3, c5393i));
    }
}
