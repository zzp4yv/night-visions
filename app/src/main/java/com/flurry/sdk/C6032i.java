package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.i */
/* loaded from: classes2.dex */
public final class C6032i {

    /* renamed from: a */
    public final boolean f15962a;

    /* renamed from: b */
    public final byte[] f15963b;

    /* renamed from: c */
    public final byte[] f15964c;

    /* renamed from: d */
    public final int f15965d;

    /* renamed from: com.flurry.sdk.i$a */
    static class a implements InterfaceC6147v1<C6032i> {

        /* renamed from: com.flurry.sdk.i$a$a, reason: collision with other inner class name */
        final class C11420a extends DataOutputStream {
            C11420a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.i$a$b */
        final class b extends DataInputStream {
            b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6147v1
        /* renamed from: a */
        public final /* synthetic */ void mo13095a(OutputStream outputStream, C6032i c6032i) throws IOException {
            C6032i c6032i2 = c6032i;
            if (outputStream == null || c6032i2 == null) {
                return;
            }
            C11420a c11420a = new C11420a(outputStream);
            c11420a.writeBoolean(c6032i2.f15962a);
            byte[] bArr = c6032i2.f15963b;
            if (bArr == null) {
                c11420a.writeInt(0);
            } else {
                c11420a.writeInt(bArr.length);
                c11420a.write(c6032i2.f15963b);
            }
            byte[] bArr2 = c6032i2.f15964c;
            if (bArr2 == null) {
                c11420a.writeInt(0);
            } else {
                c11420a.writeInt(bArr2.length);
                c11420a.write(c6032i2.f15964c);
            }
            c11420a.writeInt(c6032i2.f15965d);
            c11420a.flush();
        }

        @Override // com.flurry.sdk.InterfaceC6147v1
        /* renamed from: b */
        public final /* synthetic */ C6032i mo13096b(InputStream inputStream) throws IOException {
            byte[] bArr;
            byte[] bArr2 = null;
            if (inputStream == null) {
                return null;
            }
            b bVar = new b(inputStream);
            boolean readBoolean = bVar.readBoolean();
            int readInt = bVar.readInt();
            if (readInt > 0) {
                bArr = new byte[readInt];
                bVar.read(bArr, 0, readInt);
            } else {
                bArr = null;
            }
            int readInt2 = bVar.readInt();
            if (readInt2 > 0) {
                bArr2 = new byte[readInt2];
                bVar.read(bArr2, 0, readInt2);
            }
            return new C6032i(bArr2, bArr, readBoolean, bVar.readInt());
        }
    }

    C6032i(byte[] bArr, byte[] bArr2, boolean z, int i2) {
        this.f15963b = bArr2;
        this.f15964c = bArr;
        this.f15962a = z;
        this.f15965d = i2;
    }
}
