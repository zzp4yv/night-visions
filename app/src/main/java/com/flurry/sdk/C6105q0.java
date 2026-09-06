package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.flurry.sdk.q0 */
/* loaded from: classes2.dex */
public final class C6105q0 {

    /* renamed from: a */
    String f16272a;

    /* renamed from: b */
    byte[] f16273b;

    /* renamed from: com.flurry.sdk.q0$a */
    static class a implements InterfaceC6171y1<C6105q0> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<C6105q0> mo13122a(int i2) {
            return new b(i2);
        }
    }

    /* renamed from: com.flurry.sdk.q0$b */
    public static class b implements InterfaceC6147v1<C6105q0> {

        /* renamed from: a */
        private int f16274a;

        /* renamed from: com.flurry.sdk.q0$b$a */
        final class a extends DataOutputStream {
            a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.q0$b$b, reason: collision with other inner class name */
        final class C11424b extends DataInputStream {
            C11424b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        public b(int i2) {
            this.f16274a = 1;
            this.f16274a = i2;
        }

        @Override // com.flurry.sdk.InterfaceC6147v1
        /* renamed from: a */
        public final /* synthetic */ void mo13095a(OutputStream outputStream, C6105q0 c6105q0) throws IOException {
            C6105q0 c6105q02 = c6105q0;
            if (outputStream == null || c6105q02 == null) {
                return;
            }
            a aVar = new a(outputStream);
            int length = c6105q02.f16273b.length;
            if (this.f16274a == 1) {
                aVar.writeShort(length);
            } else {
                aVar.writeInt(length);
            }
            aVar.write(c6105q02.f16273b);
            aVar.writeShort(0);
            aVar.flush();
        }

        @Override // com.flurry.sdk.InterfaceC6147v1
        /* renamed from: b */
        public final /* synthetic */ C6105q0 mo13096b(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C11424b c11424b = new C11424b(inputStream);
            C6105q0 c6105q0 = new C6105q0((byte) 0);
            int readShort = this.f16274a == 1 ? c11424b.readShort() : c11424b.readInt();
            if (readShort == 0) {
                return null;
            }
            byte[] bArr = new byte[readShort];
            c6105q0.f16273b = bArr;
            c11424b.readFully(bArr);
            c11424b.readUnsignedShort();
            return c6105q0;
        }
    }

    /* synthetic */ C6105q0(byte b2) {
        this();
    }

    /* renamed from: a */
    public static String m13264a(String str) {
        return ".yflurrydatasenderblock.".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public static C5985c7<C6105q0> m13265b(String str) {
        return new C5985c7<>(C5969b0.m12964a().getFileStreamPath(m13264a(str)), ".yflurrydatasenderblock.", 2, new a());
    }

    private C6105q0() {
        this.f16272a = null;
        this.f16273b = null;
    }

    public C6105q0(byte[] bArr) {
        this.f16272a = null;
        this.f16273b = null;
        this.f16272a = UUID.randomUUID().toString();
        this.f16273b = bArr;
    }
}
