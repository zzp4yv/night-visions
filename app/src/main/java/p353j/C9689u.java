package p353j;

import java.io.OutputStream;
import kotlin.jvm.internal.C9768m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.u */
/* loaded from: classes3.dex */
final class C9689u implements InterfaceC9663b0 {

    /* renamed from: f */
    private final OutputStream f37075f;

    /* renamed from: g */
    private final C9669e0 f37076g;

    public C9689u(OutputStream outputStream, C9669e0 c9669e0) {
        C9768m.m32346f(outputStream, "out");
        C9768m.m32346f(c9669e0, "timeout");
        this.f37075f = outputStream;
        this.f37076g = c9669e0;
    }

    @Override // p353j.InterfaceC9663b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37075f.close();
    }

    @Override // p353j.InterfaceC9663b0, java.io.Flushable
    public void flush() {
        this.f37075f.flush();
    }

    @Override // p353j.InterfaceC9663b0
    public C9669e0 timeout() {
        return this.f37076g;
    }

    public String toString() {
        return "sink(" + this.f37075f + ')';
    }

    @Override // p353j.InterfaceC9663b0
    public void write(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "source");
        C9664c.m31982b(c9670f.size(), 0L, j2);
        while (j2 > 0) {
            this.f37076g.throwIfReached();
            C9693y c9693y = c9670f.f37038f;
            C9768m.m32343c(c9693y);
            int min = (int) Math.min(j2, c9693y.f37093d - c9693y.f37092c);
            this.f37075f.write(c9693y.f37091b, c9693y.f37092c, min);
            c9693y.f37092c += min;
            long j3 = min;
            j2 -= j3;
            c9670f.m32038f0(c9670f.size() - j3);
            if (c9693y.f37092c == c9693y.f37093d) {
                c9670f.f37038f = c9693y.m32162b();
                C9694z.m32169b(c9693y);
            }
        }
    }
}
