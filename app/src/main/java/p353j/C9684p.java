package p353j;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C9768m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.p */
/* loaded from: classes3.dex */
final class C9684p implements InterfaceC9667d0 {

    /* renamed from: f */
    private final InputStream f37069f;

    /* renamed from: g */
    private final C9669e0 f37070g;

    public C9684p(InputStream inputStream, C9669e0 c9669e0) {
        C9768m.m32346f(inputStream, "input");
        C9768m.m32346f(c9669e0, "timeout");
        this.f37069f = inputStream;
        this.f37070g = c9669e0;
    }

    @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37069f.close();
    }

    @Override // p353j.InterfaceC9667d0
    public long read(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        try {
            this.f37070g.throwIfReached();
            C9693y m32054q0 = c9670f.m32054q0(1);
            int read = this.f37069f.read(m32054q0.f37091b, m32054q0.f37093d, (int) Math.min(j2, 8192 - m32054q0.f37093d));
            if (read != -1) {
                m32054q0.f37093d += read;
                long j3 = read;
                c9670f.m32038f0(c9670f.size() + j3);
                return j3;
            }
            if (m32054q0.f37092c != m32054q0.f37093d) {
                return -1L;
            }
            c9670f.f37038f = m32054q0.m32162b();
            C9694z.m32169b(m32054q0);
            return -1L;
        } catch (AssertionError e2) {
            if (C9685q.m32121e(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9667d0
    public C9669e0 timeout() {
        return this.f37070g;
    }

    public String toString() {
        return "source(" + this.f37069f + ')';
    }
}
