package com.bumptech.glide.load.p129n.p130y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p127m.p128o.C5412b;
import com.bumptech.glide.load.p127m.p128o.C5413c;
import com.bumptech.glide.load.p129n.C5433r;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import com.bumptech.glide.load.p131o.p132c.C5471y;
import com.bumptech.glide.p144q.C5553c;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.d */
/* loaded from: classes.dex */
public class C5443d implements InterfaceC5429n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f13704a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.d$a */
    public static class a implements InterfaceC5430o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f13705a;

        public a(Context context) {
            this.f13705a = context;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, InputStream> mo10513b(C5433r c5433r) {
            return new C5443d(this.f13705a);
        }
    }

    public C5443d(Context context) {
        this.f13704a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m10598e(C5393i c5393i) {
        Long l = (Long) c5393i.m10449a(C5471y.f13781a);
        return l != null && l.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<InputStream> mo10509b(Uri uri, int i2, int i3, C5393i c5393i) {
        if (C5412b.m10497d(i2, i3) && m10598e(c5393i)) {
            return new InterfaceC5429n.a<>(new C5553c(uri), C5413c.m10501g(this.f13704a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return C5412b.m10496c(uri);
    }
}
