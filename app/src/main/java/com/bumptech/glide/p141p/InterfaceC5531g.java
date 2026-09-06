package com.bumptech.glide.p141p;

import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.p142l.InterfaceC5544i;

/* compiled from: RequestListener.java */
/* renamed from: com.bumptech.glide.p.g */
/* loaded from: classes.dex */
public interface InterfaceC5531g<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5544i<R> interfaceC5544i, boolean z);

    boolean onResourceReady(R r, Object obj, InterfaceC5544i<R> interfaceC5544i, EnumC5332a enumC5332a, boolean z);
}
