package com.google.zxing.p226j;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import com.google.zxing.p226j.p227b.C8644d;
import com.google.zxing.p226j.p227b.C8645e;
import com.google.zxing.p226j.p227b.EnumC8643c;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer.java */
/* renamed from: com.google.zxing.j.a */
/* loaded from: classes2.dex */
public final class C8640a implements InterfaceC8594e {
    /* renamed from: b */
    private static C8604b m27394b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        C8604b c8604b = new C8604b(bArr[0].length + i3, bArr.length + i3);
        c8604b.m27293d();
        int m27296g = (c8604b.m27296g() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    c8604b.m27298i(i5 + i2, m27296g);
                }
            }
            i4++;
            m27296g--;
        }
        return c8604b;
    }

    /* renamed from: c */
    private static C8604b m27395c(C8645e c8645e, String str, int i2, int i3, int i4, int i5) throws WriterException {
        boolean z;
        c8645e.m27412e(str, i2);
        byte[][] m27398b = c8645e.m27413f().m27398b(1, 4);
        if ((i4 > i3) != (m27398b[0].length < m27398b.length)) {
            m27398b = m27396d(m27398b);
            z = true;
        } else {
            z = false;
        }
        int length = i3 / m27398b[0].length;
        int length2 = i4 / m27398b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m27394b(m27398b, i5);
        }
        byte[][] m27398b2 = c8645e.m27413f().m27398b(length, length << 2);
        if (z) {
            m27398b2 = m27396d(m27398b2);
        }
        return m27394b(m27398b2, i5);
    }

    /* renamed from: d */
    private static byte[][] m27396d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        int i4;
        int i5;
        if (enumC8587a != EnumC8587a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC8587a)));
        }
        C8645e c8645e = new C8645e();
        if (map != null) {
            EnumC8589c enumC8589c = EnumC8589c.PDF417_COMPACT;
            if (map.containsKey(enumC8589c)) {
                c8645e.m27414h(Boolean.valueOf(map.get(enumC8589c).toString()).booleanValue());
            }
            EnumC8589c enumC8589c2 = EnumC8589c.PDF417_COMPACTION;
            if (map.containsKey(enumC8589c2)) {
                c8645e.m27415i(EnumC8643c.valueOf(map.get(enumC8589c2).toString()));
            }
            EnumC8589c enumC8589c3 = EnumC8589c.PDF417_DIMENSIONS;
            if (map.containsKey(enumC8589c3)) {
                C8644d c8644d = (C8644d) map.get(enumC8589c3);
                c8645e.m27416j(c8644d.m27403a(), c8644d.m27405c(), c8644d.m27404b(), c8644d.m27406d());
            }
            EnumC8589c enumC8589c4 = EnumC8589c.MARGIN;
            int parseInt = map.containsKey(enumC8589c4) ? Integer.parseInt(map.get(enumC8589c4).toString()) : 30;
            EnumC8589c enumC8589c5 = EnumC8589c.ERROR_CORRECTION;
            int parseInt2 = map.containsKey(enumC8589c5) ? Integer.parseInt(map.get(enumC8589c5).toString()) : 2;
            EnumC8589c enumC8589c6 = EnumC8589c.CHARACTER_SET;
            if (map.containsKey(enumC8589c6)) {
                c8645e.m27417k(Charset.forName(map.get(enumC8589c6).toString()));
            }
            i5 = parseInt;
            i4 = parseInt2;
        } else {
            i4 = 2;
            i5 = 30;
        }
        return m27395c(c8645e, str, i4, i2, i3, i5);
    }
}
