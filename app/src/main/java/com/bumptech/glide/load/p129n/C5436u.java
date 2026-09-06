package com.bumptech.glide.load.p129n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* renamed from: com.bumptech.glide.load.n.u */
/* loaded from: classes.dex */
public class C5436u<Data> implements InterfaceC5429n<String, Data> {

    /* renamed from: a */
    private final InterfaceC5429n<Uri, Data> f13686a;

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$a */
    public static final class a implements InterfaceC5430o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<String, AssetFileDescriptor> mo10513b(C5433r c5433r) {
            return new C5436u(c5433r.m10571d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$b */
    public static class b implements InterfaceC5430o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<String, ParcelFileDescriptor> mo10513b(C5433r c5433r) {
            return new C5436u(c5433r.m10571d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$c */
    public static class c implements InterfaceC5430o<String, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<String, InputStream> mo10513b(C5433r c5433r) {
            return new C5436u(c5433r.m10571d(Uri.class, InputStream.class));
        }
    }

    public C5436u(InterfaceC5429n<Uri, Data> interfaceC5429n) {
        this.f13686a = interfaceC5429n;
    }

    /* renamed from: e */
    private static Uri m10581e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m10582f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m10582f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m10582f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<Data> mo10509b(String str, int i2, int i3, C5393i c5393i) {
        Uri m10581e = m10581e(str);
        if (m10581e == null || !this.f13686a.mo10508a(m10581e)) {
            return null;
        }
        return this.f13686a.mo10509b(m10581e, i2, i3, c5393i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(String str) {
        return true;
    }
}
