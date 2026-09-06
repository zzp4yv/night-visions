package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzkl {
    /* renamed from: a */
    public static String m20136a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: b */
    public static boolean m20137b(String str) {
        return m20136a(str).equals("audio");
    }

    /* renamed from: c */
    public static boolean m20138c(String str) {
        return "audio/ac3".equals(str) || "audio/eac3".equals(str);
    }
}
