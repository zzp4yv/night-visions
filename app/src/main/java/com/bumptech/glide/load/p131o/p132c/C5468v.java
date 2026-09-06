package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.p132c.C5458l;
import com.bumptech.glide.p145r.C5557d;
import com.bumptech.glide.p145r.C5561h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.v */
/* loaded from: classes.dex */
public class C5468v implements InterfaceC5394j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C5458l f13771a;

    /* renamed from: b */
    private final InterfaceC5377b f13772b;

    /* compiled from: StreamBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.v$a */
    static class a implements C5458l.b {

        /* renamed from: a */
        private final C5465s f13773a;

        /* renamed from: b */
        private final C5557d f13774b;

        a(C5465s c5465s, C5557d c5557d) {
            this.f13773a = c5465s;
            this.f13774b = c5557d;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5458l.b
        /* renamed from: a */
        public void mo10652a(InterfaceC5380e interfaceC5380e, Bitmap bitmap) throws IOException {
            IOException m11022a = this.f13774b.m11022a();
            if (m11022a != null) {
                if (bitmap == null) {
                    throw m11022a;
                }
                interfaceC5380e.mo10387c(bitmap);
                throw m11022a;
            }
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5458l.b
        /* renamed from: b */
        public void mo10653b() {
            this.f13773a.m10665b();
        }
    }

    public C5468v(C5458l c5458l, InterfaceC5377b interfaceC5377b) {
        this.f13771a = c5458l;
        this.f13772b = interfaceC5377b;
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<Bitmap> mo10453b(InputStream inputStream, int i2, int i3, C5393i c5393i) throws IOException {
        C5465s c5465s;
        boolean z;
        if (inputStream instanceof C5465s) {
            c5465s = (C5465s) inputStream;
            z = false;
        } else {
            c5465s = new C5465s(inputStream, this.f13772b);
            z = true;
        }
        C5557d m11021b = C5557d.m11021b(c5465s);
        try {
            return this.f13771a.m10649e(new C5561h(m11021b), i2, i3, c5393i, new a(c5465s, m11021b));
        } finally {
            m11021b.m11023c();
            if (z) {
                c5465s.m10666c();
            }
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InputStream inputStream, C5393i c5393i) {
        return this.f13771a.m10650m(inputStream);
    }
}
