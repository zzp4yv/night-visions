package com.bumptech.glide.load.p129n;

import android.util.Base64;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.e */
/* loaded from: classes.dex */
public final class C5420e<Model, Data> implements InterfaceC5429n<Model, Data> {

    /* renamed from: a */
    private final a<Data> f13615a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$a */
    public interface a<Data> {
        /* renamed from: a */
        Class<Data> mo10523a();

        /* renamed from: b */
        void mo10524b(Data data) throws IOException;

        /* renamed from: c */
        Data mo10525c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$b */
    private static final class b<Data> implements InterfaceC5400d<Data> {

        /* renamed from: f */
        private final String f13616f;

        /* renamed from: g */
        private final a<Data> f13617g;

        /* renamed from: h */
        private Data f13618h;

        b(String str, a<Data> aVar) {
            this.f13616f = str;
            this.f13617g = aVar;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<Data> mo10455a() {
            return this.f13617g.mo10523a();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: b */
        public void mo10460b() {
            try {
                this.f13617g.mo10524b(this.f13618h);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: d */
        public EnumC5332a mo10462d() {
            return EnumC5332a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: e */
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super Data> aVar) {
            try {
                Data mo10525c = this.f13617g.mo10525c(this.f13616f);
                this.f13618h = mo10525c;
                aVar.mo10228f(mo10525c);
            } catch (IllegalArgumentException e2) {
                aVar.mo10227c(e2);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$c */
    public static final class c<Model> implements InterfaceC5430o<Model, InputStream> {

        /* renamed from: a */
        private final a<InputStream> f13619a = new a();

        /* compiled from: DataUrlLoader.java */
        /* renamed from: com.bumptech.glide.load.n.e$c$a */
        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5420e.a
            /* renamed from: a */
            public Class<InputStream> mo10523a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5420e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo10524b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p129n.C5420e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo10525c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Model, InputStream> mo10513b(C5433r c5433r) {
            return new C5420e(this.f13619a);
        }
    }

    public C5420e(a<Data> aVar) {
        this.f13615a = aVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: a */
    public boolean mo10508a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: b */
    public InterfaceC5429n.a<Data> mo10509b(Model model, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(model), new b(model.toString(), this.f13615a));
    }
}
