package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.y2 */
/* loaded from: classes2.dex */
final class C7328y2 extends FilterInputStream {

    /* renamed from: f */
    private final long f21092f;

    /* renamed from: g */
    private long f21093g;

    C7328y2(InputStream inputStream, long j2) {
        super(inputStream);
        this.f21092f = j2;
    }

    /* renamed from: a */
    final long m16052a() {
        return this.f21092f - this.f21093g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f21093g++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = super.read(bArr, i2, i3);
        if (read != -1) {
            this.f21093g += read;
        }
        return read;
    }
}
