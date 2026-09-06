package com.bumptech.glide.load;

import com.bumptech.glide.p145r.C5555b;
import java.security.MessageDigest;
import p024c.p041e.C0867a;

/* compiled from: Options.java */
/* renamed from: com.bumptech.glide.load.i */
/* loaded from: classes.dex */
public final class C5393i implements InterfaceC5390f {

    /* renamed from: b */
    private final C0867a<C5392h<?>, Object> f13562b = new C5555b();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <T> void m10448d(C5392h<T> c5392h, Object obj, MessageDigest messageDigest) {
        c5392h.m10446g(obj, messageDigest);
    }

    /* renamed from: a */
    public <T> T m10449a(C5392h<T> c5392h) {
        return this.f13562b.containsKey(c5392h) ? (T) this.f13562b.get(c5392h) : c5392h.m10445c();
    }

    /* renamed from: b */
    public void m10450b(C5393i c5393i) {
        this.f13562b.mo5474k(c5393i.f13562b);
    }

    /* renamed from: c */
    public <T> C5393i m10451c(C5392h<T> c5392h, T t) {
        this.f13562b.put(c5392h, t);
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (obj instanceof C5393i) {
            return this.f13562b.equals(((C5393i) obj).f13562b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        return this.f13562b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f13562b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f13562b.size(); i2++) {
            m10448d(this.f13562b.m5473j(i2), this.f13562b.m5477n(i2), messageDigest);
        }
    }
}
