package com.bumptech.glide.load.p127m;

import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.p127m.InterfaceC5401e;
import com.bumptech.glide.load.p131o.p132c.C5465s;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* renamed from: com.bumptech.glide.load.m.k */
/* loaded from: classes.dex */
public final class C5407k implements InterfaceC5401e<InputStream> {

    /* renamed from: a */
    private final C5465s f13585a;

    /* compiled from: InputStreamRewinder.java */
    /* renamed from: com.bumptech.glide.load.m.k$a */
    public static final class a implements InterfaceC5401e.a<InputStream> {

        /* renamed from: a */
        private final InterfaceC5377b f13586a;

        public a(InterfaceC5377b interfaceC5377b) {
            this.f13586a = interfaceC5377b;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5401e.a
        /* renamed from: a */
        public Class<InputStream> mo10470a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5401e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5401e<InputStream> mo10471b(InputStream inputStream) {
            return new C5407k(inputStream, this.f13586a);
        }
    }

    C5407k(InputStream inputStream, InterfaceC5377b interfaceC5377b) {
        C5465s c5465s = new C5465s(inputStream, interfaceC5377b);
        this.f13585a = c5465s;
        c5465s.mark(5242880);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5401e
    /* renamed from: b */
    public void mo10469b() {
        this.f13585a.m10666c();
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5401e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo10468a() throws IOException {
        this.f13585a.reset();
        return this.f13585a;
    }
}
