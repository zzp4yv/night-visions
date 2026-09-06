package p353j.p354g0;

import kotlin.jvm.internal.C9768m;
import p353j.C9670f;
import p353j.C9677i;

/* compiled from: ByteString.kt */
/* renamed from: j.g0.b */
/* loaded from: classes3.dex */
public final class C9674b {

    /* renamed from: a */
    private static final char[] f37050a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0068, code lost:
    
        return -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m32078c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.p354g0.C9674b.m32078c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m32079d(C9677i c9677i, C9670f c9670f, int i2, int i3) {
        C9768m.m32346f(c9677i, "$this$commonWrite");
        C9768m.m32346f(c9670f, "buffer");
        c9670f.write(c9677i.m32098y(), i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m32080e(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: f */
    public static final char[] m32081f() {
        return f37050a;
    }
}
