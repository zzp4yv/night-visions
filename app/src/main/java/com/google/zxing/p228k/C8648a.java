package com.google.zxing.p228k;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import com.google.zxing.p228k.p229b.EnumC8649a;
import com.google.zxing.p228k.p230c.C8653b;
import com.google.zxing.p228k.p230c.C8654c;
import com.google.zxing.p228k.p230c.C8657f;
import java.util.Map;

/* compiled from: QRCodeWriter.java */
/* renamed from: com.google.zxing.k.a */
/* loaded from: classes2.dex */
public final class C8648a implements InterfaceC8594e {
    /* renamed from: b */
    private static C8604b m27434b(C8657f c8657f, int i2, int i3, int i4) {
        C8653b m27509a = c8657f.m27509a();
        if (m27509a == null) {
            throw new IllegalStateException();
        }
        int m27456e = m27509a.m27456e();
        int m27455d = m27509a.m27455d();
        int i5 = i4 << 1;
        int i6 = m27456e + i5;
        int i7 = i5 + m27455d;
        int max = Math.max(i2, i6);
        int max2 = Math.max(i3, i7);
        int min = Math.min(max / i6, max2 / i7);
        int i8 = (max - (m27456e * min)) / 2;
        int i9 = (max2 - (m27455d * min)) / 2;
        C8604b c8604b = new C8604b(max, max2);
        int i10 = 0;
        while (i10 < m27455d) {
            int i11 = i8;
            int i12 = 0;
            while (i12 < m27456e) {
                if (m27509a.m27453b(i12, i10) == 1) {
                    c8604b.m27299j(i11, i9, min, min);
                }
                i12++;
                i11 += min;
            }
            i10++;
            i9 += min;
        }
        return c8604b;
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC8587a != EnumC8587a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC8587a)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        EnumC8649a enumC8649a = EnumC8649a.L;
        int i4 = 4;
        if (map != null) {
            EnumC8589c enumC8589c = EnumC8589c.ERROR_CORRECTION;
            if (map.containsKey(enumC8589c)) {
                enumC8649a = EnumC8649a.valueOf(map.get(enumC8589c).toString());
            }
            EnumC8589c enumC8589c2 = EnumC8589c.MARGIN;
            if (map.containsKey(enumC8589c2)) {
                i4 = Integer.parseInt(map.get(enumC8589c2).toString());
            }
        }
        return m27434b(C8654c.m27472n(str, enumC8649a, map), i2, i3, i4);
    }
}
