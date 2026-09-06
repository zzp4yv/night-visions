package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MultiTransformation.java */
/* renamed from: com.bumptech.glide.load.g */
/* loaded from: classes.dex */
public class C5391g<T> implements InterfaceC5396l<T> {

    /* renamed from: b */
    private final Collection<? extends InterfaceC5396l<T>> f13556b;

    @SafeVarargs
    public C5391g(InterfaceC5396l<T>... interfaceC5396lArr) {
        if (interfaceC5396lArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f13556b = Arrays.asList(interfaceC5396lArr);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (obj instanceof C5391g) {
            return this.f13556b.equals(((C5391g) obj).f13556b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return this.f13556b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5396l
    public InterfaceC5371u<T> transform(Context context, InterfaceC5371u<T> interfaceC5371u, int i2, int i3) {
        Iterator<? extends InterfaceC5396l<T>> it = this.f13556b.iterator();
        InterfaceC5371u<T> interfaceC5371u2 = interfaceC5371u;
        while (it.hasNext()) {
            InterfaceC5371u<T> transform = it.next().transform(context, interfaceC5371u2, i2, i3);
            if (interfaceC5371u2 != null && !interfaceC5371u2.equals(interfaceC5371u) && !interfaceC5371u2.equals(transform)) {
                interfaceC5371u2.mo10340c();
            }
            interfaceC5371u2 = transform;
        }
        return interfaceC5371u2;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator<? extends InterfaceC5396l<T>> it = this.f13556b.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }
}
