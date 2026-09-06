package com.bumptech.glide.p145r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* renamed from: com.bumptech.glide.r.c */
/* loaded from: classes.dex */
public final class C5556c extends FilterInputStream {

    /* renamed from: f */
    private final long f14029f;

    /* renamed from: g */
    private int f14030g;

    private C5556c(InputStream inputStream, long j2) {
        super(inputStream);
        this.f14029f = j2;
    }

    /* renamed from: a */
    private int m11019a(int i2) throws IOException {
        if (i2 >= 0) {
            this.f14030g += i2;
        } else if (this.f14029f - this.f14030g > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f14029f + ", but read: " + this.f14030g);
        }
        return i2;
    }

    /* renamed from: b */
    public static InputStream m11020b(InputStream inputStream, long j2) {
        return new C5556c(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f14029f - this.f14030g, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m11019a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        return m11019a(super.read(bArr, i2, i3));
    }
}
