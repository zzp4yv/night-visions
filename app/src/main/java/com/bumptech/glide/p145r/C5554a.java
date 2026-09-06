package com.bumptech.glide.p145r;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* renamed from: com.bumptech.glide.r.a */
/* loaded from: classes.dex */
public final class C5554a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f14022a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.r.a$b */
    static final class b {

        /* renamed from: a */
        final int f14025a;

        /* renamed from: b */
        final int f14026b;

        /* renamed from: c */
        final byte[] f14027c;

        b(byte[] bArr, int i2, int i3) {
            this.f14027c = bArr;
            this.f14025a = i2;
            this.f14026b = i3;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m11014a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    private static b m11015b(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: c */
    public static byte[] m11016c(ByteBuffer byteBuffer) {
        b m11015b = m11015b(byteBuffer);
        if (m11015b != null && m11015b.f14025a == 0 && m11015b.f14026b == m11015b.f14027c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: d */
    public static void m11017d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: e */
    public static InputStream m11018e(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.r.a$a */
    private static class a extends InputStream {

        /* renamed from: f */
        private final ByteBuffer f14023f;

        /* renamed from: g */
        private int f14024g = -1;

        a(ByteBuffer byteBuffer) {
            this.f14023f = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f14023f.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f14024g = this.f14023f.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f14023f.hasRemaining()) {
                return this.f14023f.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i2 = this.f14024g;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f14023f.position(i2);
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            if (!this.f14023f.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j2, available());
            this.f14023f.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (!this.f14023f.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i3, available());
            this.f14023f.get(bArr, i2, min);
            return min;
        }
    }
}
