package com.google.zxing.p225i;

import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.InterfaceC8594e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.Map;

/* compiled from: UPCAWriter.java */
/* renamed from: com.google.zxing.i.o */
/* loaded from: classes2.dex */
public final class C8635o implements InterfaceC8594e {

    /* renamed from: a */
    private final C8630j f32883a = new C8630j();

    @Override // com.google.zxing.InterfaceC8594e
    /* renamed from: a */
    public C8604b mo27243a(String str, EnumC8587a enumC8587a, int i2, int i3, Map<EnumC8589c, ?> map) throws WriterException {
        if (enumC8587a == EnumC8587a.UPC_A) {
            return this.f32883a.mo27243a("0".concat(String.valueOf(str)), EnumC8587a.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC8587a)));
    }
}
