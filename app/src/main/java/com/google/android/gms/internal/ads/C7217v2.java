package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* loaded from: classes2.dex */
final class C7217v2 {

    /* renamed from: a */
    long f20710a;

    /* renamed from: b */
    final String f20711b;

    /* renamed from: c */
    final String f20712c;

    /* renamed from: d */
    final long f20713d;

    /* renamed from: e */
    final long f20714e;

    /* renamed from: f */
    final long f20715f;

    /* renamed from: g */
    final long f20716g;

    /* renamed from: h */
    final List<zzl> f20717h;

    private C7217v2(String str, String str2, long j2, long j3, long j4, long j5, List<zzl> list) {
        this.f20711b = str;
        this.f20712c = HttpUrl.FRAGMENT_ENCODE_SET.equals(str2) ? null : str2;
        this.f20713d = j2;
        this.f20714e = j3;
        this.f20715f = j4;
        this.f20716g = j5;
        this.f20717h = list;
    }

    /* renamed from: b */
    static C7217v2 m15951b(C7328y2 c7328y2) throws IOException {
        if (zzan.m16737l(c7328y2) == 538247942) {
            return new C7217v2(zzan.m16731f(c7328y2), zzan.m16731f(c7328y2), zzan.m16739n(c7328y2), zzan.m16739n(c7328y2), zzan.m16739n(c7328y2), zzan.m16739n(c7328y2), zzan.m16738m(c7328y2));
        }
        throw new IOException();
    }

    /* renamed from: a */
    final boolean m15952a(OutputStream outputStream) {
        try {
            zzan.m16732g(outputStream, 538247942);
            zzan.m16734i(outputStream, this.f20711b);
            String str = this.f20712c;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            zzan.m16734i(outputStream, str);
            zzan.m16733h(outputStream, this.f20713d);
            zzan.m16733h(outputStream, this.f20714e);
            zzan.m16733h(outputStream, this.f20715f);
            zzan.m16733h(outputStream, this.f20716g);
            List<zzl> list = this.f20717h;
            if (list != null) {
                zzan.m16732g(outputStream, list.size());
                for (zzl zzlVar : list) {
                    zzan.m16734i(outputStream, zzlVar.m20195a());
                    zzan.m16734i(outputStream, zzlVar.m20196b());
                }
            } else {
                zzan.m16732g(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            zzag.m16526a("%s", e2.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    C7217v2(java.lang.String r14, com.google.android.gms.internal.ads.zzc r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f23918b
            long r3 = r15.f23919c
            long r5 = r15.f23920d
            long r7 = r15.f23921e
            long r9 = r15.f23922f
            java.util.List<com.google.android.gms.internal.ads.zzl> r0 = r15.f23924h
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f23923g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzl r11 = new com.google.android.gms.internal.ads.zzl
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7217v2.<init>(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }
}
