package com.google.zxing.p225i;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Code128Writer.java */
/* renamed from: com.google.zxing.i.d */
/* loaded from: classes2.dex */
public final class C8624d extends AbstractC8634n {

    /* compiled from: Code128Writer.java */
    /* renamed from: com.google.zxing.i.d$a */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: f */
    private static int m27381f(CharSequence charSequence, int i2, int i3) {
        a m27382g;
        a m27382g2;
        char charAt;
        a m27382g3 = m27382g(charSequence, i2);
        a aVar = a.ONE_DIGIT;
        if (m27382g3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (m27382g3 == aVar2) {
            return (i2 >= charSequence.length() || ((charAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i3 == 99) {
            return 99;
        }
        if (i3 != 100) {
            if (m27382g3 == a.FNC_1) {
                m27382g3 = m27382g(charSequence, i2 + 1);
            }
            return m27382g3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (m27382g3 == aVar3 || (m27382g = m27382g(charSequence, i2 + 2)) == aVar2 || m27382g == aVar) {
            return 100;
        }
        if (m27382g == aVar3) {
            return m27382g(charSequence, i2 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i4 = i2 + 4;
        while (true) {
            m27382g2 = m27382g(charSequence, i4);
            if (m27382g2 != a.TWO_DIGITS) {
                break;
            }
            i4 += 2;
        }
        return m27382g2 == a.ONE_DIGIT ? 100 : 99;
    }

    /* renamed from: g */
    private static a m27382g(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i3);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.google.zxing.p225i.AbstractC8634n, com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (enumC8587a == EnumC8587a.CODE_128) {
            return super.mo27243a(str, enumC8587a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC8587a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8634n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            int i8 = 103;
            if (i4 >= length) {
                int[][] iArr = C8623c.f32869a;
                arrayList.add(iArr[i5 % 103]);
                arrayList.add(iArr[106]);
                int i9 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i10 : iArr2) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i2 += AbstractC8634n.m27388b(zArr, i2, (int[]) it.next(), true);
                }
                return zArr;
            }
            int m27381f = m27381f(str, i4, i6);
            int i11 = 100;
            if (m27381f == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        i11 = 102;
                        break;
                    case 242:
                        i11 = 97;
                        break;
                    case 243:
                        i11 = 96;
                        break;
                    case 244:
                        if (i6 == 101) {
                            i11 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i6 != 100) {
                            if (i6 != 101) {
                                i11 = Integer.parseInt(str.substring(i4, i4 + 2));
                                i4++;
                                break;
                            } else {
                                i11 = str.charAt(i4) - ' ';
                                if (i11 < 0) {
                                    i11 += 96;
                                    break;
                                }
                            }
                        } else {
                            i11 = str.charAt(i4) - ' ';
                            break;
                        }
                        break;
                }
                i4++;
            } else {
                if (i6 != 0) {
                    i8 = m27381f;
                } else if (m27381f == 100) {
                    i8 = 104;
                } else if (m27381f != 101) {
                    i8 = 105;
                }
                i11 = i8;
                i6 = m27381f;
            }
            arrayList.add(C8623c.f32869a[i11]);
            i5 += i11 * i7;
            if (i4 != 0) {
                i7++;
            }
        }
    }
}
