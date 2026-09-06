package com.bumptech.glide.p145r;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream.java */
/* renamed from: com.bumptech.glide.r.d */
/* loaded from: classes.dex */
public class C5557d extends InputStream {

    /* renamed from: f */
    private static final Queue<C5557d> f14031f = C5564k.m11049f(0);

    /* renamed from: g */
    private InputStream f14032g;

    /* renamed from: h */
    private IOException f14033h;

    C5557d() {
    }

    /* renamed from: b */
    public static C5557d m11021b(InputStream inputStream) {
        C5557d poll;
        Queue<C5557d> queue = f14031f;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C5557d();
        }
        poll.m11024d(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException m11022a() {
        return this.f14033h;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f14032g.available();
    }

    /* renamed from: c */
    public void m11023c() {
        this.f14033h = null;
        this.f14032g = null;
        Queue<C5557d> queue = f14031f;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14032g.close();
    }

    /* renamed from: d */
    void m11024d(InputStream inputStream) {
        this.f14032g = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f14032g.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f14032g.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f14032g.read(bArr);
        } catch (IOException e2) {
            this.f14033h = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f14032g.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f14032g.skip(j2);
        } catch (IOException e2) {
            this.f14033h = e2;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f14032g.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f14033h = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f14032g.read();
        } catch (IOException e2) {
            this.f14033h = e2;
            return -1;
        }
    }
}
