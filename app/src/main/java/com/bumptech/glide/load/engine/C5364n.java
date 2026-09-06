package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.p145r.C5563j;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* renamed from: com.bumptech.glide.load.engine.n */
/* loaded from: classes.dex */
class C5364n implements InterfaceC5390f {

    /* renamed from: b */
    private final Object f13455b;

    /* renamed from: c */
    private final int f13456c;

    /* renamed from: d */
    private final int f13457d;

    /* renamed from: e */
    private final Class<?> f13458e;

    /* renamed from: f */
    private final Class<?> f13459f;

    /* renamed from: g */
    private final InterfaceC5390f f13460g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC5396l<?>> f13461h;

    /* renamed from: i */
    private final C5393i f13462i;

    /* renamed from: j */
    private int f13463j;

    C5364n(Object obj, InterfaceC5390f interfaceC5390f, int i2, int i3, Map<Class<?>, InterfaceC5396l<?>> map, Class<?> cls, Class<?> cls2, C5393i c5393i) {
        this.f13455b = C5563j.m11042d(obj);
        this.f13460g = (InterfaceC5390f) C5563j.m11043e(interfaceC5390f, "Signature must not be null");
        this.f13456c = i2;
        this.f13457d = i3;
        this.f13461h = (Map) C5563j.m11042d(map);
        this.f13458e = (Class) C5563j.m11043e(cls, "Resource class must not be null");
        this.f13459f = (Class) C5563j.m11043e(cls2, "Transcode class must not be null");
        this.f13462i = (C5393i) C5563j.m11042d(c5393i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5364n)) {
            return false;
        }
        C5364n c5364n = (C5364n) obj;
        return this.f13455b.equals(c5364n.f13455b) && this.f13460g.equals(c5364n.f13460g) && this.f13457d == c5364n.f13457d && this.f13456c == c5364n.f13456c && this.f13461h.equals(c5364n.f13461h) && this.f13458e.equals(c5364n.f13458e) && this.f13459f.equals(c5364n.f13459f) && this.f13462i.equals(c5364n.f13462i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        if (this.f13463j == 0) {
            int hashCode = this.f13455b.hashCode();
            this.f13463j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f13460g.hashCode();
            this.f13463j = hashCode2;
            int i2 = (hashCode2 * 31) + this.f13456c;
            this.f13463j = i2;
            int i3 = (i2 * 31) + this.f13457d;
            this.f13463j = i3;
            int hashCode3 = (i3 * 31) + this.f13461h.hashCode();
            this.f13463j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f13458e.hashCode();
            this.f13463j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f13459f.hashCode();
            this.f13463j = hashCode5;
            this.f13463j = (hashCode5 * 31) + this.f13462i.hashCode();
        }
        return this.f13463j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f13455b + ", width=" + this.f13456c + ", height=" + this.f13457d + ", resourceClass=" + this.f13458e + ", transcodeClass=" + this.f13459f + ", signature=" + this.f13460g + ", hashCode=" + this.f13463j + ", transformations=" + this.f13461h + ", options=" + this.f13462i + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
