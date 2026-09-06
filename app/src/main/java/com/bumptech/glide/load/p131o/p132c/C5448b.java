package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5334c;
import com.bumptech.glide.load.InterfaceC5395k;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.o.c.b */
/* loaded from: classes.dex */
public class C5448b implements InterfaceC5395k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC5380e f13711a;

    /* renamed from: b */
    private final InterfaceC5395k<Bitmap> f13712b;

    public C5448b(InterfaceC5380e interfaceC5380e, InterfaceC5395k<Bitmap> interfaceC5395k) {
        this.f13711a = interfaceC5380e;
        this.f13712b = interfaceC5395k;
    }

    @Override // com.bumptech.glide.load.InterfaceC5395k
    /* renamed from: b */
    public EnumC5334c mo10454b(C5393i c5393i) {
        return this.f13712b.mo10454b(c5393i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5335d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(InterfaceC5371u<BitmapDrawable> interfaceC5371u, File file, C5393i c5393i) {
        return this.f13712b.mo10155a(new C5450d(interfaceC5371u.get().getBitmap(), this.f13711a), file, c5393i);
    }
}
