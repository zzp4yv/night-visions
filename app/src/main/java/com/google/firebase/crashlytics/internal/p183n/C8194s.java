package com.google.firebase.crashlytics.internal.p183n;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* renamed from: com.google.firebase.crashlytics.h.n.s */
/* loaded from: classes2.dex */
class C8194s {

    /* renamed from: a */
    private static final AtomicLong f30963a = new AtomicLong(0);

    /* renamed from: b */
    private static String f30964b;

    C8194s(C8176i0 c8176i0) {
        byte[] bArr = new byte[10];
        m25328e(bArr);
        m25327d(bArr);
        m25326c(bArr);
        String m25355z = C8195t.m25355z(c8176i0.mo25261a().mo25270c());
        String m25349t = C8195t.m25349t(bArr);
        Locale locale = Locale.US;
        f30964b = String.format(locale, "%s%s%s%s", m25349t.substring(0, 12), m25349t.substring(12, 16), m25349t.subSequence(16, 20), m25355z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m25324a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m25325b(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m25326c(byte[] bArr) {
        byte[] m25325b = m25325b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m25325b[0];
        bArr[9] = m25325b[1];
    }

    /* renamed from: d */
    private void m25327d(byte[] bArr) {
        byte[] m25325b = m25325b(f30963a.incrementAndGet());
        bArr[6] = m25325b[0];
        bArr[7] = m25325b[1];
    }

    /* renamed from: e */
    private void m25328e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m25324a = m25324a(time / 1000);
        bArr[0] = m25324a[0];
        bArr[1] = m25324a[1];
        bArr[2] = m25324a[2];
        bArr[3] = m25324a[3];
        byte[] m25325b = m25325b(time % 1000);
        bArr[4] = m25325b[0];
        bArr[5] = m25325b[1];
    }

    public String toString() {
        return f30964b;
    }
}
