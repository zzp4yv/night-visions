package com.bumptech.glide.load.p131o.p134e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC5367q;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.p131o.p136g.C5484c;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: DrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.e.b */
/* loaded from: classes.dex */
public abstract class AbstractC5475b<T extends Drawable> implements InterfaceC5371u<T>, InterfaceC5367q {

    /* renamed from: f */
    protected final T f13792f;

    public AbstractC5475b(T t) {
        this.f13792f = (T) C5563j.m11042d(t);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5367q
    /* renamed from: a */
    public void mo10346a() {
        T t = this.f13792f;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C5484c) {
            ((C5484c) t).m10741e().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f13792f.getConstantState();
        return constantState == null ? this.f13792f : (T) constantState.newDrawable();
    }
}
