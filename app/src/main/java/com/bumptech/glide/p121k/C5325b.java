package com.bumptech.glide.p121k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* renamed from: com.bumptech.glide.k.b */
/* loaded from: classes.dex */
class C5325b implements Closeable {

    /* renamed from: f */
    private final InputStream f13158f;

    /* renamed from: g */
    private final Charset f13159g;

    /* renamed from: h */
    private byte[] f13160h;

    /* renamed from: i */
    private int f13161i;

    /* renamed from: j */
    private int f13162j;

    /* compiled from: StrictLineReader.java */
    /* renamed from: com.bumptech.glide.k.b$a */
    class a extends ByteArrayOutputStream {
        a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, C5325b.this.f13159g.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public C5325b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m10100b() throws IOException {
        InputStream inputStream = this.f13158f;
        byte[] bArr = this.f13160h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f13161i = 0;
        this.f13162j = read;
    }

    /* renamed from: c */
    public boolean m10101c() {
        return this.f13162j == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f13158f) {
            if (this.f13160h != null) {
                this.f13160h = null;
                this.f13158f.close();
            }
        }
    }

    /* renamed from: d */
    public String m10102d() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.f13158f) {
            if (this.f13160h == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f13161i >= this.f13162j) {
                m10100b();
            }
            for (int i4 = this.f13161i; i4 != this.f13162j; i4++) {
                byte[] bArr2 = this.f13160h;
                if (bArr2[i4] == 10) {
                    if (i4 != this.f13161i) {
                        i3 = i4 - 1;
                        if (bArr2[i3] == 13) {
                            byte[] bArr3 = this.f13160h;
                            int i5 = this.f13161i;
                            String str = new String(bArr3, i5, i3 - i5, this.f13159g.name());
                            this.f13161i = i4 + 1;
                            return str;
                        }
                    }
                    i3 = i4;
                    byte[] bArr32 = this.f13160h;
                    int i52 = this.f13161i;
                    String str2 = new String(bArr32, i52, i3 - i52, this.f13159g.name());
                    this.f13161i = i4 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f13162j - this.f13161i) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.f13160h;
                int i6 = this.f13161i;
                aVar.write(bArr4, i6, this.f13162j - i6);
                this.f13162j = -1;
                m10100b();
                i2 = this.f13161i;
                while (i2 != this.f13162j) {
                    bArr = this.f13160h;
                    if (bArr[i2] == 10) {
                        break loop1;
                    }
                    i2++;
                }
            }
            int i7 = this.f13161i;
            if (i2 != i7) {
                aVar.write(bArr, i7, i2 - i7);
            }
            this.f13161i = i2 + 1;
            return aVar.toString();
        }
    }

    public C5325b(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C5326c.f13164a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f13158f = inputStream;
        this.f13159g = charset;
        this.f13160h = new byte[i2];
    }
}
