package kotlin.reflect.p371y.internal.p374j0.p422m.p423u;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;

/* compiled from: capitalizeDecapitalize.kt */
/* renamed from: kotlin.f0.y.e.j0.m.u.a */
/* loaded from: classes3.dex */
public final class C10452a {
    /* renamed from: a */
    public static final String m37224a(String str) {
        C9768m.m32346f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: b */
    public static final String m37225b(String str) {
        C9768m.m32346f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    /* renamed from: c */
    public static final String m37226c(String str, boolean z) {
        Integer num;
        C9768m.m32346f(str, "<this>");
        if ((str.length() == 0) || !m37227d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !m37227d(str, 1, z)) {
            if (z) {
                return m37225b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        Iterator<Integer> it = C10514v.m37550P(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!m37227d(str, num.intValue(), z)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return m37228e(str, z);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        C9768m.m32345e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(m37228e(substring2, z));
        String substring3 = str.substring(intValue);
        C9768m.m32345e(substring3, "this as java.lang.String).substring(startIndex)");
        sb.append(substring3);
        return sb.toString();
    }

    /* renamed from: d */
    private static final boolean m37227d(String str, int i2, boolean z) {
        char charAt = str.charAt(i2);
        return z ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    /* renamed from: e */
    private static final String m37228e(String str, boolean z) {
        if (z) {
            return m37229f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C9768m.m32345e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m37229f(String str) {
        C9768m.m32346f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "builder.toString()");
        return sb2;
    }
}
