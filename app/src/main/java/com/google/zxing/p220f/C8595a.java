package com.google.zxing.p220f;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.p220f.p221b.C8596a;
import com.google.zxing.p220f.p221b.C8598c;
import com.google.zxing.p222g.C8604b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter.java */
/* renamed from: com.google.zxing.f.a */
/* loaded from: classes2.dex */
public final class C8595a implements InterfaceC8594e {
    /* renamed from: b */
    private static C8604b m27244b(String str, EnumC8587a enumC8587a, int i2, int i3, Charset charset, int i4, int i5) {
        if (enumC8587a == EnumC8587a.AZTEC) {
            return m27245c(C8598c.m27256d(str.getBytes(charset), i4, i5), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC8587a)));
    }

    /* renamed from: c */
    private static C8604b m27245c(C8596a c8596a, int i2, int i3) {
        C8604b m27246a = c8596a.m27246a();
        if (m27246a == null) {
            throw new IllegalStateException();
        }
        int m27297h = m27246a.m27297h();
        int m27296g = m27246a.m27296g();
        int max = Math.max(i2, m27297h);
        int max2 = Math.max(i3, m27296g);
        int min = Math.min(max / m27297h, max2 / m27296g);
        int i4 = (max - (m27297h * min)) / 2;
        int i5 = (max2 - (m27296g * min)) / 2;
        C8604b c8604b = new C8604b(max, max2);
        int i6 = 0;
        while (i6 < m27296g) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < m27297h) {
                if (m27246a.m27295f(i8, i6)) {
                    c8604b.m27299j(i7, i5, min, min);
                }
                i8++;
                i7 += min;
            }
            i6++;
            i5 += min;
        }
        return c8604b;
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) {
        Charset charset;
        int i4;
        int i5;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (map != null) {
            EnumC8589c enumC8589c = EnumC8589c.CHARACTER_SET;
            if (map.containsKey(enumC8589c)) {
                charset2 = Charset.forName(map.get(enumC8589c).toString());
            }
            EnumC8589c enumC8589c2 = EnumC8589c.ERROR_CORRECTION;
            int parseInt = map.containsKey(enumC8589c2) ? Integer.parseInt(map.get(enumC8589c2).toString()) : 33;
            EnumC8589c enumC8589c3 = EnumC8589c.AZTEC_LAYERS;
            if (map.containsKey(enumC8589c3)) {
                charset = charset2;
                i4 = parseInt;
                i5 = Integer.parseInt(map.get(enumC8589c3).toString());
                return m27244b(str, enumC8587a, i2, i3, charset, i4, i5);
            }
            charset = charset2;
            i4 = parseInt;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i5 = 0;
        return m27244b(str, enumC8587a, i2, i3, charset, i4, i5);
    }
}
