package com.google.android.datatransport.cct;

import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.p258i.InterfaceC8832h;

/* compiled from: CCTDestination.java */
/* renamed from: com.google.android.datatransport.cct.c */
/* loaded from: classes2.dex */
public final class C6206c implements InterfaceC8832h {

    /* renamed from: a */
    static final String f16579a;

    /* renamed from: b */
    static final String f16580b;

    /* renamed from: c */
    private static final String f16581c;

    /* renamed from: d */
    private static final Set<C8752b> f16582d;

    /* renamed from: e */
    public static final C6206c f16583e;

    /* renamed from: f */
    public static final C6206c f16584f;

    /* renamed from: g */
    private final String f16585g;

    /* renamed from: h */
    private final String f16586h;

    static {
        String m13416a = C6208e.m13416a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f16579a = m13416a;
        String m13416a2 = C6208e.m13416a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f16580b = m13416a2;
        String m13416a3 = C6208e.m13416a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f16581c = m13416a3;
        f16582d = Collections.unmodifiableSet(new HashSet(Arrays.asList(C8752b.m27945b("proto"), C8752b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON))));
        f16583e = new C6206c(m13416a, null);
        f16584f = new C6206c(m13416a2, m13416a3);
    }

    public C6206c(String str, String str2) {
        this.f16585g = str;
        this.f16586h = str2;
    }

    /* renamed from: c */
    public static C6206c m13397c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C6206c(str2, str3);
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8832h
    /* renamed from: a */
    public Set<C8752b> mo13398a() {
        return f16582d;
    }

    /* renamed from: b */
    public byte[] m13399b() {
        String str = this.f16586h;
        if (str == null && this.f16585g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f16585g;
        objArr[2] = "\\";
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m13400d() {
        return this.f16586h;
    }

    /* renamed from: e */
    public String m13401e() {
        return this.f16585g;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8831g
    public byte[] getExtras() {
        return m13399b();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8831g
    public String getName() {
        return "cct";
    }
}
