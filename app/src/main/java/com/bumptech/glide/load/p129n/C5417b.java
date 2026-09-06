package com.bumptech.glide.load.p129n;

import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* renamed from: com.bumptech.glide.load.n.b */
/* loaded from: classes.dex */
public class C5417b<Data> implements InterfaceC5429n<byte[], Data> {

    /* renamed from: a */
    private final b<Data> f13609a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$a */
    public static class a implements InterfaceC5430o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.n.b$a$a, reason: collision with other inner class name */
        class C11408a implements b<ByteBuffer> {
            C11408a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5417b.b
            /* renamed from: a */
            public Class<ByteBuffer> mo10516a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5417b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo10517b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<byte[], ByteBuffer> mo10513b(C5433r c5433r) {
            return new C5417b(new C11408a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$b */
    public interface b<Data> {
        /* renamed from: a */
        Class<Data> mo10516a();

        /* renamed from: b */
        Data mo10517b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$c */
    private static class c<Data> implements InterfaceC5400d<Data> {

        /* renamed from: f */
        private final byte[] f13611f;

        /* renamed from: g */
        private final b<Data> f13612g;

        c(byte[] bArr, b<Data> bVar) {
            this.f13611f = bArr;
            this.f13612g = bVar;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<Data> mo10455a() {
            return this.f13612g.mo10516a();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: b */
        public void mo10460b() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: d */
        public EnumC5332a mo10462d() {
            return EnumC5332a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: e */
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super Data> aVar) {
            aVar.mo10228f(this.f13612g.mo10517b(this.f13611f));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$d */
    public static class d implements InterfaceC5430o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.n.b$d$a */
        class a implements b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5417b.b
            /* renamed from: a */
            public Class<InputStream> mo10516a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5417b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo10517b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<byte[], InputStream> mo10513b(C5433r c5433r) {
            return new C5417b(new a());
        }
    }

    public C5417b(b<Data> bVar) {
        this.f13609a = bVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<Data> mo10509b(byte[] bArr, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(bArr), new c(bArr, this.f13609a));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(byte[] bArr) {
        return true;
    }
}
