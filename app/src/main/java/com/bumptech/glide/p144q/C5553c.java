package com.bumptech.glide.p144q;

import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.p145r.C5563j;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* renamed from: com.bumptech.glide.q.c */
/* loaded from: classes.dex */
public final class C5553c implements InterfaceC5390f {

    /* renamed from: b */
    private final Object f14021b;

    public C5553c(Object obj) {
        this.f14021b = C5563j.m11042d(obj);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (obj instanceof C5553c) {
            return this.f14021b.equals(((C5553c) obj).f14021b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return this.f14021b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f14021b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f14021b.toString().getBytes(InterfaceC5390f.f13555a));
    }
}
