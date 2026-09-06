package com.google.zxing.p228k.p230c;

/* compiled from: MaskUtil.java */
/* renamed from: com.google.zxing.k.c.d */
/* loaded from: classes2.dex */
final class C8655d {
    /* renamed from: a */
    static int m27481a(C8653b c8653b) {
        return m27482b(c8653b, true) + m27482b(c8653b, false);
    }

    /* renamed from: b */
    private static int m27482b(C8653b c8653b, boolean z) {
        int m27455d = z ? c8653b.m27455d() : c8653b.m27456e();
        int m27456e = z ? c8653b.m27456e() : c8653b.m27455d();
        byte[][] m27454c = c8653b.m27454c();
        int i2 = 0;
        for (int i3 = 0; i3 < m27455d; i3++) {
            byte b2 = -1;
            int i4 = 0;
            for (int i5 = 0; i5 < m27456e; i5++) {
                byte b3 = z ? m27454c[i3][i5] : m27454c[i5][i3];
                if (b3 == b2) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i2 += (i4 - 5) + 3;
                    }
                    b2 = b3;
                    i4 = 1;
                }
            }
            if (i4 >= 5) {
                i2 += (i4 - 5) + 3;
            }
        }
        return i2;
    }

    /* renamed from: c */
    static int m27483c(C8653b c8653b) {
        byte[][] m27454c = c8653b.m27454c();
        int m27456e = c8653b.m27456e();
        int m27455d = c8653b.m27455d();
        int i2 = 0;
        for (int i3 = 0; i3 < m27455d - 1; i3++) {
            byte[] bArr = m27454c[i3];
            int i4 = 0;
            while (i4 < m27456e - 1) {
                byte b2 = bArr[i4];
                int i5 = i4 + 1;
                if (b2 == bArr[i5]) {
                    int i6 = i3 + 1;
                    if (b2 == m27454c[i6][i4] && b2 == m27454c[i6][i5]) {
                        i2++;
                    }
                }
                i4 = i5;
            }
        }
        return i2 * 3;
    }

    /* renamed from: d */
    static int m27484d(C8653b c8653b) {
        byte[][] m27454c = c8653b.m27454c();
        int m27456e = c8653b.m27456e();
        int m27455d = c8653b.m27455d();
        int i2 = 0;
        for (int i3 = 0; i3 < m27455d; i3++) {
            for (int i4 = 0; i4 < m27456e; i4++) {
                byte[] bArr = m27454c[i3];
                int i5 = i4 + 6;
                if (i5 < m27456e && bArr[i4] == 1 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1 && bArr[i4 + 3] == 1 && bArr[i4 + 4] == 1 && bArr[i4 + 5] == 0 && bArr[i5] == 1 && (m27487g(bArr, i4 - 4, i4) || m27487g(bArr, i4 + 7, i4 + 11))) {
                    i2++;
                }
                int i6 = i3 + 6;
                if (i6 < m27455d && m27454c[i3][i4] == 1 && m27454c[i3 + 1][i4] == 0 && m27454c[i3 + 2][i4] == 1 && m27454c[i3 + 3][i4] == 1 && m27454c[i3 + 4][i4] == 1 && m27454c[i3 + 5][i4] == 0 && m27454c[i6][i4] == 1 && (m27488h(m27454c, i4, i3 - 4, i3) || m27488h(m27454c, i4, i3 + 7, i3 + 11))) {
                    i2++;
                }
            }
        }
        return i2 * 40;
    }

    /* renamed from: e */
    static int m27485e(C8653b c8653b) {
        byte[][] m27454c = c8653b.m27454c();
        int m27456e = c8653b.m27456e();
        int m27455d = c8653b.m27455d();
        int i2 = 0;
        for (int i3 = 0; i3 < m27455d; i3++) {
            byte[] bArr = m27454c[i3];
            for (int i4 = 0; i4 < m27456e; i4++) {
                if (bArr[i4] == 1) {
                    i2++;
                }
            }
        }
        int m27455d2 = c8653b.m27455d() * c8653b.m27456e();
        return ((Math.abs((i2 << 1) - m27455d2) * 10) / m27455d2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean m27486f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L3a;
                case 1: goto L3b;
                case 2: goto L37;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L26;
                case 6: goto L1d;
                case 7: goto L14;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L14:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L24
        L1d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L24:
            r1 = r1 & r0
            goto L3d
        L26:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3d
        L2e:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L3a
        L33:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3d
        L37:
            int r1 = r2 % 3
            goto L3d
        L3a:
            int r3 = r3 + r2
        L3b:
            r1 = r3 & 1
        L3d:
            if (r1 != 0) goto L40
            return r0
        L40:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p228k.p230c.C8655d.m27486f(int, int, int):boolean");
    }

    /* renamed from: g */
    private static boolean m27487g(byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m27488h(byte[][] bArr, int i2, int i3, int i4) {
        int min = Math.min(i4, bArr.length);
        for (int max = Math.max(i3, 0); max < min; max++) {
            if (bArr[max][i2] == 1) {
                return false;
            }
        }
        return true;
    }
}
