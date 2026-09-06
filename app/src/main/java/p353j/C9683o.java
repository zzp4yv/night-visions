package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C9768m;

/* compiled from: InflaterSource.kt */
/* renamed from: j.o */
/* loaded from: classes3.dex */
public final class C9683o implements InterfaceC9667d0 {

    /* renamed from: f */
    private int f37065f;

    /* renamed from: g */
    private boolean f37066g;

    /* renamed from: h */
    private final InterfaceC9676h f37067h;

    /* renamed from: i */
    private final Inflater f37068i;

    public C9683o(InterfaceC9676h interfaceC9676h, Inflater inflater) {
        C9768m.m32346f(interfaceC9676h, "source");
        C9768m.m32346f(inflater, "inflater");
        this.f37067h = interfaceC9676h;
        this.f37068i = inflater;
    }

    /* renamed from: c */
    private final void m32114c() {
        int i2 = this.f37065f;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f37068i.getRemaining();
        this.f37065f -= remaining;
        this.f37067h.skip(remaining);
    }

    /* renamed from: a */
    public final long m32115a(C9670f c9670f, long j2) throws IOException {
        C9768m.m32346f(c9670f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f37066g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            C9693y m32054q0 = c9670f.m32054q0(1);
            int min = (int) Math.min(j2, 8192 - m32054q0.f37093d);
            m32116b();
            int inflate = this.f37068i.inflate(m32054q0.f37091b, m32054q0.f37093d, min);
            m32114c();
            if (inflate > 0) {
                m32054q0.f37093d += inflate;
                long j3 = inflate;
                c9670f.m32038f0(c9670f.size() + j3);
                return j3;
            }
            if (m32054q0.f37092c == m32054q0.f37093d) {
                c9670f.f37038f = m32054q0.m32162b();
                C9694z.m32169b(m32054q0);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: b */
    public final boolean m32116b() throws IOException {
        if (!this.f37068i.needsInput()) {
            return false;
        }
        if (this.f37067h.mo32019R()) {
            return true;
        }
        C9693y c9693y = this.f37067h.mo32042i().f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37093d;
        int i3 = c9693y.f37092c;
        int i4 = i2 - i3;
        this.f37065f = i4;
        this.f37068i.setInput(c9693y.f37091b, i3, i4);
        return false;
    }

    @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37066g) {
            return;
        }
        this.f37068i.end();
        this.f37066g = true;
        this.f37067h.close();
    }

    @Override // p353j.InterfaceC9667d0
    public long read(C9670f c9670f, long j2) throws IOException {
        C9768m.m32346f(c9670f, "sink");
        do {
            long m32115a = m32115a(c9670f, j2);
            if (m32115a > 0) {
                return m32115a;
            }
            if (this.f37068i.finished() || this.f37068i.needsDictionary()) {
                return -1L;
            }
        } while (!this.f37067h.mo32019R());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p353j.InterfaceC9667d0
    public C9669e0 timeout() {
        return this.f37067h.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9683o(InterfaceC9667d0 interfaceC9667d0, Inflater inflater) {
        this(C9685q.m32120d(interfaceC9667d0), inflater);
        C9768m.m32346f(interfaceC9667d0, "source");
        C9768m.m32346f(inflater, "inflater");
    }
}
