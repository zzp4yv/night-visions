package com.bumptech.glide.load.p129n;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* renamed from: com.bumptech.glide.load.n.f */
/* loaded from: classes.dex */
public class C5421f<Data> implements InterfaceC5429n<File, Data> {

    /* renamed from: a */
    private final d<Data> f13621a;

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$a */
    public static class a<Data> implements InterfaceC5430o<File, Data> {

        /* renamed from: a */
        private final d<Data> f13622a;

        public a(d<Data> dVar) {
            this.f13622a = dVar;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public final InterfaceC5429n<File, Data> mo10513b(C5433r c5433r) {
            return new C5421f(this.f13622a);
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* renamed from: com.bumptech.glide.load.n.f$b$a */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo10530a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo10531b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo10532c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$c */
    private static final class c<Data> implements InterfaceC5400d<Data> {

        /* renamed from: f */
        private final File f13623f;

        /* renamed from: g */
        private final d<Data> f13624g;

        /* renamed from: h */
        private Data f13625h;

        c(File file, d<Data> dVar) {
            this.f13623f = file;
            this.f13624g = dVar;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<Data> mo10455a() {
            return this.f13624g.mo10530a();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: b */
        public void mo10460b() {
            Data data = this.f13625h;
            if (data != null) {
                try {
                    this.f13624g.mo10531b(data);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: e */
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super Data> aVar) {
            try {
                Data mo10532c = this.f13624g.mo10532c(this.f13623f);
                this.f13625h = mo10532c;
                aVar.mo10228f(mo10532c);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.mo10227c(e2);
            }
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$d */
    public interface d<Data> {
        /* renamed from: a */
        Class<Data> mo10530a();

        /* renamed from: b */
        void mo10531b(Data data) throws IOException;

        /* renamed from: c */
        Data mo10532c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$e */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: com.bumptech.glide.load.n.f$e$a */
        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: a */
            public Class<InputStream> mo10530a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo10531b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p129n.C5421f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo10532c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C5421f(d<Data> dVar) {
        this.f13621a = dVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<Data> mo10509b(File file, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(file), new c(file, this.f13621a));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(File file) {
        return true;
    }
}
