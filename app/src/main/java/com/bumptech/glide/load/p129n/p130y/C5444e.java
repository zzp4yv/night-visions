package com.bumptech.glide.load.p129n.p130y;

import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p129n.C5422g;
import com.bumptech.glide.load.p129n.C5433r;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.e */
/* loaded from: classes.dex */
public class C5444e implements InterfaceC5429n<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC5429n<C5422g, InputStream> f13706a;

    /* compiled from: UrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$a */
    public static class a implements InterfaceC5430o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<URL, InputStream> mo10513b(C5433r c5433r) {
            return new C5444e(c5433r.m10571d(C5422g.class, InputStream.class));
        }
    }

    public C5444e(InterfaceC5429n<C5422g, InputStream> interfaceC5429n) {
        this.f13706a = interfaceC5429n;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<InputStream> mo10509b(URL url, int i2, int i3, C5393i c5393i) {
        return this.f13706a.mo10509b(new C5422g(url), i2, i3, c5393i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(URL url) {
        return true;
    }
}
