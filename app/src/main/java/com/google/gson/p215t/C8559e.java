package com.google.gson.p215t;

/* compiled from: JavaVersion.java */
/* renamed from: com.google.gson.t.e */
/* loaded from: classes2.dex */
public final class C8559e {

    /* renamed from: a */
    private static final int f32540a = m27084a();

    /* renamed from: a */
    private static int m27084a() {
        return m27087d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m27085b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m27086c() {
        return f32540a;
    }

    /* renamed from: d */
    static int m27087d(String str) {
        int m27089f = m27089f(str);
        if (m27089f == -1) {
            m27089f = m27085b(str);
        }
        if (m27089f == -1) {
            return 6;
        }
        return m27089f;
    }

    /* renamed from: e */
    public static boolean m27088e() {
        return f32540a >= 9;
    }

    /* renamed from: f */
    private static int m27089f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
