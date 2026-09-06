package com.bumptech.glide.load.p131o;

import android.content.Context;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import java.security.MessageDigest;

/* compiled from: UnitTransformation.java */
/* renamed from: com.bumptech.glide.load.o.b */
/* loaded from: classes.dex */
public final class C5446b<T> implements InterfaceC5396l<T> {

    /* renamed from: b */
    private static final InterfaceC5396l<?> f13708b = new C5446b();

    private C5446b() {
    }

    /* renamed from: a */
    public static <T> C5446b<T> m10603a() {
        return (C5446b) f13708b;
    }

    @Override // com.bumptech.glide.load.InterfaceC5396l
    public InterfaceC5371u<T> transform(Context context, InterfaceC5371u<T> interfaceC5371u, int i2, int i3) {
        return interfaceC5371u;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
