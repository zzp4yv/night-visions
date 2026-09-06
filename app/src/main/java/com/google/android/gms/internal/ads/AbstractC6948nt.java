package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* loaded from: classes2.dex */
abstract class AbstractC6948nt implements zzdbj {

    /* renamed from: a */
    private final AbstractC6911mt f20105a;

    /* renamed from: b */
    private final AbstractC6911mt f20106b;

    public AbstractC6948nt(byte[] bArr) throws InvalidKeyException {
        this.f20105a = mo15599b(bArr, 1);
        this.f20106b = mo15599b(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.f20105a.mo15515f()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f20105a.mo15515f() + 16);
        if (allocate.remaining() < bArr.length + this.f20105a.mo15515f() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.f20105a.m15564c(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.f20105a.mo15515f()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f20106b.m15565h(bArr3, 0).get(bArr4);
        int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int remaining = allocate.remaining();
        int i2 = remaining % 16;
        int i3 = (i2 == 0 ? remaining : (remaining + 16) - i2) + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr2);
        order.position(length);
        order.put(allocate);
        order.position(i3);
        order.putLong(bArr2.length);
        order.putLong(remaining);
        byte[] m15750c = C7022pt.m15750c(bArr4, order.array());
        allocate.limit(allocate.limit() + 16);
        allocate.put(m15750c);
        return allocate.array();
    }

    /* renamed from: b */
    abstract AbstractC6911mt mo15599b(byte[] bArr, int i2) throws InvalidKeyException;
}
