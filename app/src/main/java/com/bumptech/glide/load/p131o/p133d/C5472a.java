package com.bumptech.glide.load.p131o.p133d;

import com.bumptech.glide.load.p127m.InterfaceC5401e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* renamed from: com.bumptech.glide.load.o.d.a */
/* loaded from: classes.dex */
public class C5472a implements InterfaceC5401e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f13789a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: com.bumptech.glide.load.o.d.a$a */
    public static class a implements InterfaceC5401e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.p127m.InterfaceC5401e.a
        /* renamed from: a */
        public Class<ByteBuffer> mo10470a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5401e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5401e<ByteBuffer> mo10471b(ByteBuffer byteBuffer) {
            return new C5472a(byteBuffer);
        }
    }

    public C5472a(ByteBuffer byteBuffer) {
        this.f13789a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5401e
    /* renamed from: b */
    public void mo10469b() {
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5401e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo10468a() {
        this.f13789a.position(0);
        return this.f13789a;
    }
}
