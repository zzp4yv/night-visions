package com.google.zxing.p225i;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.Map;

/* compiled from: UPCEWriter.java */
/* renamed from: com.google.zxing.i.s */
/* loaded from: classes2.dex */
public final class C8639s extends AbstractC8637q {
    @Override // com.google.zxing.p225i.AbstractC8634n, com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (enumC8587a == EnumC8587a.UPC_E) {
            return super.mo27243a(str, enumC8587a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(enumC8587a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8634n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC8636p.m27392b(C8638r.m27393c(str));
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC8636p.m27391a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i2 = C8638r.f32890g[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int m27388b = AbstractC8634n.m27388b(zArr, 0, AbstractC8636p.f32884a, true) + 0;
        for (int i3 = 1; i3 <= 6; i3++) {
            int digit2 = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                digit2 += 10;
            }
            m27388b += AbstractC8634n.m27388b(zArr, m27388b, AbstractC8636p.f32888e[digit2], false);
        }
        AbstractC8634n.m27388b(zArr, m27388b, AbstractC8636p.f32886c, false);
        return zArr;
    }
}
