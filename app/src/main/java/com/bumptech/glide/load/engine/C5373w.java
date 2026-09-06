package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.p145r.C5560g;
import com.bumptech.glide.p145r.C5564k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* renamed from: com.bumptech.glide.load.engine.w */
/* loaded from: classes.dex */
final class C5373w implements InterfaceC5390f {

    /* renamed from: b */
    private static final C5560g<Class<?>, byte[]> f13492b = new C5560g<>(50);

    /* renamed from: c */
    private final InterfaceC5377b f13493c;

    /* renamed from: d */
    private final InterfaceC5390f f13494d;

    /* renamed from: e */
    private final InterfaceC5390f f13495e;

    /* renamed from: f */
    private final int f13496f;

    /* renamed from: g */
    private final int f13497g;

    /* renamed from: h */
    private final Class<?> f13498h;

    /* renamed from: i */
    private final C5393i f13499i;

    /* renamed from: j */
    private final InterfaceC5396l<?> f13500j;

    C5373w(InterfaceC5377b interfaceC5377b, InterfaceC5390f interfaceC5390f, InterfaceC5390f interfaceC5390f2, int i2, int i3, InterfaceC5396l<?> interfaceC5396l, Class<?> cls, C5393i c5393i) {
        this.f13493c = interfaceC5377b;
        this.f13494d = interfaceC5390f;
        this.f13495e = interfaceC5390f2;
        this.f13496f = i2;
        this.f13497g = i3;
        this.f13500j = interfaceC5396l;
        this.f13498h = cls;
        this.f13499i = c5393i;
    }

    /* renamed from: a */
    private byte[] m10359a() {
        C5560g<Class<?>, byte[]> c5560g = f13492b;
        byte[] m11031g = c5560g.m11031g(this.f13498h);
        if (m11031g != null) {
            return m11031g;
        }
        byte[] bytes = this.f13498h.getName().getBytes(InterfaceC5390f.f13555a);
        c5560g.m11033k(this.f13498h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5373w)) {
            return false;
        }
        C5373w c5373w = (C5373w) obj;
        return this.f13497g == c5373w.f13497g && this.f13496f == c5373w.f13496f && C5564k.m11047d(this.f13500j, c5373w.f13500j) && this.f13498h.equals(c5373w.f13498h) && this.f13494d.equals(c5373w.f13494d) && this.f13495e.equals(c5373w.f13495e) && this.f13499i.equals(c5373w.f13499i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public int hashCode() {
        int hashCode = (((((this.f13494d.hashCode() * 31) + this.f13495e.hashCode()) * 31) + this.f13496f) * 31) + this.f13497g;
        InterfaceC5396l<?> interfaceC5396l = this.f13500j;
        if (interfaceC5396l != null) {
            hashCode = (hashCode * 31) + interfaceC5396l.hashCode();
        }
        return (((hashCode * 31) + this.f13498h.hashCode()) * 31) + this.f13499i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f13494d + ", signature=" + this.f13495e + ", width=" + this.f13496f + ", height=" + this.f13497g + ", decodedResourceClass=" + this.f13498h + ", transformation='" + this.f13500j + "', options=" + this.f13499i + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5390f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f13493c.mo10367c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f13496f).putInt(this.f13497g).array();
        this.f13495e.updateDiskCacheKey(messageDigest);
        this.f13494d.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        InterfaceC5396l<?> interfaceC5396l = this.f13500j;
        if (interfaceC5396l != null) {
            interfaceC5396l.updateDiskCacheKey(messageDigest);
        }
        this.f13499i.updateDiskCacheKey(messageDigest);
        messageDigest.update(m10359a());
        this.f13493c.mo10368d(bArr);
    }
}
