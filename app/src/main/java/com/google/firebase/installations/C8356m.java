package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator.java */
/* renamed from: com.google.firebase.installations.m */
/* loaded from: classes2.dex */
public class C8356m {

    /* renamed from: a */
    private static final byte f31813a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f31814b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m26287b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m26288c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m26289a() {
        byte[] m26288c = m26288c(UUID.randomUUID(), new byte[17]);
        m26288c[16] = m26288c[0];
        m26288c[0] = (byte) ((f31814b & m26288c[0]) | f31813a);
        return m26287b(m26288c);
    }
}
