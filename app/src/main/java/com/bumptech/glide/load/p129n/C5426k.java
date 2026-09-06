package com.bumptech.glide.load.p129n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p127m.p128o.C5412b;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.k */
/* loaded from: classes.dex */
public final class C5426k implements InterfaceC5429n<Uri, File> {

    /* renamed from: a */
    private final Context f13643a;

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$a */
    public static final class a implements InterfaceC5430o<Uri, File> {

        /* renamed from: a */
        private final Context f13644a;

        public a(Context context) {
            this.f13644a = context;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, File> mo10513b(C5433r c5433r) {
            return new C5426k(this.f13644a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$b */
    private static class b implements InterfaceC5400d<File> {

        /* renamed from: f */
        private static final String[] f13645f = {"_data"};

        /* renamed from: g */
        private final Context f13646g;

        /* renamed from: h */
        private final Uri f13647h;

        b(Context context, Uri uri) {
            this.f13646g = context;
            this.f13647h = uri;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<File> mo10455a() {
            return File.class;
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
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super File> aVar) {
            Cursor query = this.f13646g.getContentResolver().query(this.f13647h, f13645f, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.mo10228f(new File(r0));
                return;
            }
            aVar.mo10227c(new FileNotFoundException("Failed to find file path for: " + this.f13647h));
        }
    }

    public C5426k(Context context) {
        this.f13643a = context;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<File> mo10509b(Uri uri, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(uri), new b(this.f13643a, uri));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return C5412b.m10495b(uri);
    }
}
