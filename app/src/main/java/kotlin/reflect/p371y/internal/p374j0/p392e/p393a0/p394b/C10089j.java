package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import kotlin.jvm.internal.C9768m;

/* compiled from: utfEncoding.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.j */
/* loaded from: classes3.dex */
public final class C10089j {
    /* renamed from: a */
    public static final byte[] m34269a(String[] strArr) {
        C9768m.m32346f(strArr, "strings");
        int i2 = 0;
        for (String str : strArr) {
            i2 += str.length();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i4 = 0;
            while (i4 < length) {
                bArr[i3] = (byte) str2.charAt(i4);
                i4++;
                i3++;
            }
        }
        return bArr;
    }
}
