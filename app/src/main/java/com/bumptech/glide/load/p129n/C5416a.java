package com.bumptech.glide.load.p129n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p127m.C5404h;
import com.bumptech.glide.load.p127m.C5409m;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.a */
/* loaded from: classes.dex */
public class C5416a<Data> implements InterfaceC5429n<Uri, Data> {

    /* renamed from: a */
    private static final int f13604a = 22;

    /* renamed from: b */
    private final AssetManager f13605b;

    /* renamed from: c */
    private final a<Data> f13606c;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$a */
    public interface a<Data> {
        /* renamed from: a */
        InterfaceC5400d<Data> mo10512a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$b */
    public static class b implements InterfaceC5430o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f13607a;

        public b(AssetManager assetManager) {
            this.f13607a = assetManager;
        }

        @Override // com.bumptech.glide.load.p129n.C5416a.a
        /* renamed from: a */
        public InterfaceC5400d<ParcelFileDescriptor> mo10512a(AssetManager assetManager, String str) {
            return new C5404h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, ParcelFileDescriptor> mo10513b(C5433r c5433r) {
            return new C5416a(this.f13607a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$c */
    public static class c implements InterfaceC5430o<Uri, InputStream>, a<InputStream> {

        /* renamed from: a */
        private final AssetManager f13608a;

        public c(AssetManager assetManager) {
            this.f13608a = assetManager;
        }

        @Override // com.bumptech.glide.load.p129n.C5416a.a
        /* renamed from: a */
        public InterfaceC5400d<InputStream> mo10512a(AssetManager assetManager, String str) {
            return new C5409m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, InputStream> mo10513b(C5433r c5433r) {
            return new C5416a(this.f13608a, this);
        }
    }

    public C5416a(AssetManager assetManager, a<Data> aVar) {
        this.f13605b = assetManager;
        this.f13606c = aVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<Data> mo10509b(Uri uri, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(uri), this.f13606c.mo10512a(this.f13605b, uri.toString().substring(f13604a)));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
