package com.bumptech.glide.load.p129n.p130y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p127m.p128o.C5412b;
import com.bumptech.glide.load.p127m.p128o.C5413c;
import com.bumptech.glide.load.p129n.C5433r;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import com.bumptech.glide.p144q.C5553c;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.c */
/* loaded from: classes.dex */
public class C5442c implements InterfaceC5429n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f13702a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.c$a */
    public static class a implements InterfaceC5430o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f13703a;

        public a(Context context) {
            this.f13703a = context;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, InputStream> mo10513b(C5433r c5433r) {
            return new C5442c(this.f13703a);
        }
    }

    public C5442c(Context context) {
        this.f13702a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<InputStream> mo10509b(Uri uri, int i2, int i3, C5393i c5393i) {
        if (C5412b.m10497d(i2, i3)) {
            return new InterfaceC5429n.a<>(new C5553c(uri), C5413c.m10500f(this.f13702a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return C5412b.m10494a(uri);
    }
}
