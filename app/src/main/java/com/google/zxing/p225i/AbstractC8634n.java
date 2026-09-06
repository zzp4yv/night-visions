package com.google.zxing.p225i;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.Map;

/* compiled from: OneDimensionalCodeWriter.java */
/* renamed from: com.google.zxing.i.n */
/* loaded from: classes2.dex */
public abstract class AbstractC8634n implements InterfaceC8594e {
    /* renamed from: b */
    protected static int m27388b(boolean[] zArr, int i2, int[] iArr, boolean z) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z;
                i5++;
                i2++;
            }
            i3 += i4;
            z = !z;
        }
        return i3;
    }

    /* renamed from: e */
    private static C8604b m27389e(boolean[] zArr, int i2, int i3, int i4) {
        int length = zArr.length;
        int i5 = i4 + length;
        int max = Math.max(i2, i5);
        int max2 = Math.max(1, i3);
        int i6 = max / i5;
        int i7 = (max - (length * i6)) / 2;
        C8604b c8604b = new C8604b(max, max2);
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                c8604b.m27299j(i7, 0, i6, max2);
            }
            i8++;
            i7 += i6;
        }
        return c8604b;
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        }
        int mo27390d = mo27390d();
        if (map != null) {
            EnumC8589c enumC8589c = EnumC8589c.MARGIN;
            if (map.containsKey(enumC8589c)) {
                mo27390d = Integer.parseInt(map.get(enumC8589c).toString());
            }
        }
        return m27389e(mo27380c(str), i2, i3, mo27390d);
    }

    /* renamed from: c */
    public abstract boolean[] mo27380c(String str);

    /* renamed from: d */
    public int mo27390d() {
        return 10;
    }
}
