package com.google.zxing.p223h;

import com.google.zxing.C8588b;
import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.p222g.C8604b;
import com.google.zxing.p223h.p224b.C8611e;
import com.google.zxing.p223h.p224b.C8615i;
import com.google.zxing.p223h.p224b.C8616j;
import com.google.zxing.p223h.p224b.C8617k;
import com.google.zxing.p223h.p224b.EnumC8618l;
import com.google.zxing.p228k.p230c.C8653b;
import java.util.Map;

/* compiled from: DataMatrixWriter.java */
/* renamed from: com.google.zxing.h.a */
/* loaded from: classes2.dex */
public final class C8606a implements InterfaceC8594e {
    /* renamed from: b */
    private static C8604b m27303b(C8653b c8653b, int i2, int i3) {
        C8604b c8604b;
        int m27456e = c8653b.m27456e();
        int m27455d = c8653b.m27455d();
        int max = Math.max(i2, m27456e);
        int max2 = Math.max(i3, m27455d);
        int min = Math.min(max / m27456e, max2 / m27455d);
        int i4 = (max - (m27456e * min)) / 2;
        int i5 = (max2 - (m27455d * min)) / 2;
        if (i3 < m27455d || i2 < m27456e) {
            c8604b = new C8604b(m27456e, m27455d);
            i4 = 0;
            i5 = 0;
        } else {
            c8604b = new C8604b(i2, i3);
        }
        c8604b.m27293d();
        int i6 = 0;
        while (i6 < m27455d) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < m27456e) {
                if (c8653b.m27453b(i8, i6) == 1) {
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

    /* renamed from: c */
    private static C8604b m27304c(C8611e c8611e, C8617k c8617k, int i2, int i3) {
        int m27376h = c8617k.m27376h();
        int m27375g = c8617k.m27375g();
        C8653b c8653b = new C8653b(c8617k.m27378j(), c8617k.m27377i());
        int i4 = 0;
        for (int i5 = 0; i5 < m27375g; i5++) {
            if (i5 % c8617k.f32854g == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < c8617k.m27378j(); i7++) {
                    c8653b.m27458g(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < m27376h; i9++) {
                if (i9 % c8617k.f32853f == 0) {
                    c8653b.m27458g(i8, i4, true);
                    i8++;
                }
                c8653b.m27458g(i8, i4, c8611e.m27326e(i9, i5));
                i8++;
                int i10 = c8617k.f32853f;
                if (i9 % i10 == i10 - 1) {
                    c8653b.m27458g(i8, i4, i5 % 2 == 0);
                    i8++;
                }
            }
            i4++;
            int i11 = c8617k.f32854g;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < c8617k.m27378j(); i13++) {
                    c8653b.m27458g(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return m27303b(c8653b, i2, i3);
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) {
        C8588b c8588b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC8587a != EnumC8587a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC8587a)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        }
        EnumC8618l enumC8618l = EnumC8618l.FORCE_NONE;
        C8588b c8588b2 = null;
        if (map != null) {
            EnumC8618l enumC8618l2 = (EnumC8618l) map.get(EnumC8589c.DATA_MATRIX_SHAPE);
            if (enumC8618l2 != null) {
                enumC8618l = enumC8618l2;
            }
            C8588b c8588b3 = (C8588b) map.get(EnumC8589c.MIN_SIZE);
            if (c8588b3 == null) {
                c8588b3 = null;
            }
            c8588b = (C8588b) map.get(EnumC8589c.MAX_SIZE);
            if (c8588b == null) {
                c8588b = null;
            }
            c8588b2 = c8588b3;
        } else {
            c8588b = null;
        }
        String m27355b = C8616j.m27355b(str, enumC8618l, c8588b2, c8588b);
        C8617k m27371l = C8617k.m27371l(m27355b.length(), enumC8618l, c8588b2, c8588b, true);
        C8611e c8611e = new C8611e(C8615i.m27353c(m27355b, m27371l), m27371l.m27376h(), m27371l.m27375g());
        c8611e.m27327h();
        return m27304c(c8611e, m27371l, i2, i3);
    }
}
