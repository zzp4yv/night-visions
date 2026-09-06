package com.bumptech.glide.p141p.p142l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p138m.InterfaceC5507i;
import com.bumptech.glide.p141p.InterfaceC5528d;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;

/* compiled from: Target.java */
/* renamed from: com.bumptech.glide.p.l.i */
/* loaded from: classes.dex */
public interface InterfaceC5544i<R> extends InterfaceC5507i {
    InterfaceC5528d getRequest();

    void getSize(InterfaceC5543h interfaceC5543h);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, InterfaceC5549d<? super R> interfaceC5549d);

    void removeCallback(InterfaceC5543h interfaceC5543h);

    void setRequest(InterfaceC5528d interfaceC5528d);
}
