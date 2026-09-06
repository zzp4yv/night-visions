package com.google.zxing.p225i;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.Map;

/* compiled from: EAN13Writer.java */
/* renamed from: com.google.zxing.i.j */
/* loaded from: classes2.dex */
public final class C8630j extends AbstractC8637q {
    @Override // com.google.zxing.p225i.AbstractC8634n, com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (enumC8587a == EnumC8587a.EAN_13) {
            return super.mo27243a(str, enumC8587a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(enumC8587a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8634n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC8636p.m27392b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC8636p.m27391a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i2 = C8629i.f32879f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int m27388b = AbstractC8634n.m27388b(zArr, 0, AbstractC8636p.f32884a, true) + 0;
        for (int i3 = 1; i3 <= 6; i3++) {
            int digit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                digit += 10;
            }
            m27388b += AbstractC8634n.m27388b(zArr, m27388b, AbstractC8636p.f32888e[digit], false);
        }
        int m27388b2 = m27388b + AbstractC8634n.m27388b(zArr, m27388b, AbstractC8636p.f32885b, false);
        for (int i4 = 7; i4 <= 12; i4++) {
            m27388b2 += AbstractC8634n.m27388b(zArr, m27388b2, AbstractC8636p.f32887d[Character.digit(str.charAt(i4), 10)], true);
        }
        AbstractC8634n.m27388b(zArr, m27388b2, AbstractC8636p.f32884a, true);
        return zArr;
    }
}
