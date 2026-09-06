package com.bumptech.glide.load.p129n.p130y;

import android.net.Uri;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p129n.C5422g;
import com.bumptech.glide.load.p129n.C5433r;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HttpUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.b */
/* loaded from: classes.dex */
public class C5441b implements InterfaceC5429n<Uri, InputStream> {

    /* renamed from: a */
    private static final Set<String> f13700a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)));

    /* renamed from: b */
    private final InterfaceC5429n<C5422g, InputStream> f13701b;

    /* compiled from: HttpUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.b$a */
    public static class a implements InterfaceC5430o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Uri, InputStream> mo10513b(C5433r c5433r) {
            return new C5441b(c5433r.m10571d(C5422g.class, InputStream.class));
        }
    }

    public C5441b(InterfaceC5429n<C5422g, InputStream> interfaceC5429n) {
        this.f13701b = interfaceC5429n;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<InputStream> mo10509b(Uri uri, int i2, int i3, C5393i c5393i) {
        return this.f13701b.mo10509b(new C5422g(uri.toString()), i2, i3, c5393i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return f13700a.contains(uri.getScheme());
    }
}
