package com.bumptech.glide.p141p.p143m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;

/* compiled from: DrawableCrossFadeTransition.java */
/* renamed from: com.bumptech.glide.p.m.b */
/* loaded from: classes.dex */
public class C5547b implements InterfaceC5549d<Drawable> {

    /* renamed from: a */
    private final int f14015a;

    /* renamed from: b */
    private final boolean f14016b;

    public C5547b(int i2, boolean z) {
        this.f14015a = i2;
        this.f14016b = z;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5549d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo11005a(Drawable drawable, InterfaceC5549d.a aVar) {
        Drawable mo10983b = aVar.mo10983b();
        if (mo10983b == null) {
            mo10983b = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo10983b, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f14016b);
        transitionDrawable.startTransition(this.f14015a);
        aVar.mo10982a(transitionDrawable);
        return true;
    }
}
