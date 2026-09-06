package com.google.zxing;

import com.google.zxing.p220f.C8595a;
import com.google.zxing.p222g.C8604b;
import com.google.zxing.p223h.C8606a;
import com.google.zxing.p225i.C8622b;
import com.google.zxing.p225i.C8624d;
import com.google.zxing.p225i.C8626f;
import com.google.zxing.p225i.C8628h;
import com.google.zxing.p225i.C8630j;
import com.google.zxing.p225i.C8631k;
import com.google.zxing.p225i.C8632l;
import com.google.zxing.p225i.C8635o;
import com.google.zxing.p225i.C8639s;
import com.google.zxing.p226j.C8640a;
import com.google.zxing.p228k.C8648a;
import java.util.Map;

/* compiled from: MultiFormatWriter.java */
/* renamed from: com.google.zxing.d */
/* loaded from: classes2.dex */
public final class C8593d implements InterfaceC8594e {

    /* compiled from: MultiFormatWriter.java */
    /* renamed from: com.google.zxing.d$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32769a;

        static {
            int[] iArr = new int[EnumC8587a.values().length];
            f32769a = iArr;
            try {
                iArr[EnumC8587a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32769a[EnumC8587a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32769a[EnumC8587a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32769a[EnumC8587a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32769a[EnumC8587a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32769a[EnumC8587a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32769a[EnumC8587a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32769a[EnumC8587a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32769a[EnumC8587a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32769a[EnumC8587a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32769a[EnumC8587a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32769a[EnumC8587a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32769a[EnumC8587a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        InterfaceC8594e c8631k;
        switch (a.f32769a[enumC8587a.ordinal()]) {
            case 1:
                c8631k = new C8631k();
                break;
            case 2:
                c8631k = new C8639s();
                break;
            case 3:
                c8631k = new C8630j();
                break;
            case 4:
                c8631k = new C8635o();
                break;
            case 5:
                c8631k = new C8648a();
                break;
            case 6:
                c8631k = new C8626f();
                break;
            case 7:
                c8631k = new C8628h();
                break;
            case 8:
                c8631k = new C8624d();
                break;
            case 9:
                c8631k = new C8632l();
                break;
            case 10:
                c8631k = new C8640a();
                break;
            case 11:
                c8631k = new C8622b();
                break;
            case 12:
                c8631k = new C8606a();
                break;
            case 13:
                c8631k = new C8595a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC8587a)));
        }
        return c8631k.mo27243a(str, enumC8587a, i2, i3, map);
    }
}
