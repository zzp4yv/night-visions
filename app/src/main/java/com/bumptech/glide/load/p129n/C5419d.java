package com.bumptech.glide.load.p129n;

import android.util.Log;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import com.bumptech.glide.p145r.C5554a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.d */
/* loaded from: classes.dex */
public class C5419d implements InterfaceC5429n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$a */
    private static final class a implements InterfaceC5400d<ByteBuffer> {

        /* renamed from: f */
        private final File f13614f;

        a(File file) {
            this.f13614f = file;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<ByteBuffer> mo10455a() {
            return ByteBuffer.class;
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
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10228f(C5554a.m11014a(this.f13614f));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.mo10227c(e2);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$b */
    public static class b implements InterfaceC5430o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<File, ByteBuffer> mo10513b(C5433r c5433r) {
            return new C5419d();
        }
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<ByteBuffer> mo10509b(File file, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(file), new a(file));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(File file) {
        return true;
    }
}
