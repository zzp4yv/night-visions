package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.p134e.C5478e;

/* compiled from: ResourceBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.t */
/* loaded from: classes.dex */
public class C5466t implements InterfaceC5394j<Uri, Bitmap> {

    /* renamed from: a */
    private final C5478e f13767a;

    /* renamed from: b */
    private final InterfaceC5380e f13768b;

    public C5466t(C5478e c5478e, InterfaceC5380e interfaceC5380e) {
        this.f13767a = c5478e;
        this.f13768b = interfaceC5380e;
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<Bitmap> mo10453b(Uri uri, int i2, int i3, C5393i c5393i) {
        InterfaceC5371u<Drawable> mo10453b = this.f13767a.mo10453b(uri, i2, i3, c5393i);
        if (mo10453b == null) {
            return null;
        }
        return C5459m.m10654a(this.f13768b, mo10453b.get(), i2, i3);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(Uri uri, C5393i c5393i) {
        return "android.resource".equals(uri.getScheme());
    }
}
