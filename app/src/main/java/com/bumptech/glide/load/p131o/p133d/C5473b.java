package com.bumptech.glide.load.p131o.p133d;

import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: BytesResource.java */
/* renamed from: com.bumptech.glide.load.o.d.b */
/* loaded from: classes.dex */
public class C5473b implements InterfaceC5371u<byte[]> {

    /* renamed from: f */
    private final byte[] f13790f;

    public C5473b(byte[] bArr) {
        this.f13790f = (byte[]) C5563j.m11042d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f13790f;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: c */
    public void mo10340c() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13790f.length;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5371u
    /* renamed from: e */
    public Class<byte[]> mo10342e() {
        return byte[].class;
    }
}
