package com.bumptech.glide.p141p.p142l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p141p.InterfaceC5528d;

/* compiled from: BaseTarget.java */
@Deprecated
/* renamed from: com.bumptech.glide.p.l.a */
/* loaded from: classes.dex */
public abstract class AbstractC5536a<Z> implements InterfaceC5544i<Z> {
    private InterfaceC5528d request;

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public InterfaceC5528d getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStart() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStop() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void setRequest(InterfaceC5528d interfaceC5528d) {
        this.request = interfaceC5528d;
    }
}
