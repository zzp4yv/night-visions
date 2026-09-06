package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uu */
/* loaded from: classes2.dex */
final class C7208uu {

    /* renamed from: a */
    private static final Class<?> f20657a = m15932a();

    /* renamed from: a */
    private static Class<?> m15932a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzdno m15933b() {
        if (f20657a != null) {
            try {
                return m15935d("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzdno.f25691c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.zzdno m15934c() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.ads.C7208uu.f20657a
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.zzdno r0 = m15935d(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzdno r0 = com.google.android.gms.internal.ads.zzdno.m19700b()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.ads.zzdno r0 = m15933b()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7208uu.m15934c():com.google.android.gms.internal.ads.zzdno");
    }

    /* renamed from: d */
    private static final zzdno m15935d(String str) throws Exception {
        return (zzdno) f20657a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
