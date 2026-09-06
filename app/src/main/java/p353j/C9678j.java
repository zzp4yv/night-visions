package p353j;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C9768m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* renamed from: j.j */
/* loaded from: classes3.dex */
public final class C9678j implements InterfaceC9663b0 {

    /* renamed from: f */
    private boolean f37056f;

    /* renamed from: g */
    private final InterfaceC9672g f37057g;

    /* renamed from: h */
    private final Deflater f37058h;

    public C9678j(InterfaceC9672g interfaceC9672g, Deflater deflater) {
        C9768m.m32346f(interfaceC9672g, "sink");
        C9768m.m32346f(deflater, "deflater");
        this.f37057g = interfaceC9672g;
        this.f37058h = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private final void m32106a(boolean z) {
        C9693y m32054q0;
        int deflate;
        C9670f mo32042i = this.f37057g.mo32042i();
        while (true) {
            m32054q0 = mo32042i.m32054q0(1);
            if (z) {
                Deflater deflater = this.f37058h;
                byte[] bArr = m32054q0.f37091b;
                int i2 = m32054q0.f37093d;
                deflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f37058h;
                byte[] bArr2 = m32054q0.f37091b;
                int i3 = m32054q0.f37093d;
                deflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (deflate > 0) {
                m32054q0.f37093d += deflate;
                mo32042i.m32038f0(mo32042i.size() + deflate);
                this.f37057g.mo32032c0();
            } else if (this.f37058h.needsInput()) {
                break;
            }
        }
        if (m32054q0.f37092c == m32054q0.f37093d) {
            mo32042i.f37038f = m32054q0.m32162b();
            C9694z.m32169b(m32054q0);
        }
    }

    /* renamed from: b */
    public final void m32107b() {
        this.f37058h.finish();
        m32106a(false);
    }

    @Override // p353j.InterfaceC9663b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37056f) {
            return;
        }
        Throwable th = null;
        try {
            m32107b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f37058h.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f37057g.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f37056f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p353j.InterfaceC9663b0, java.io.Flushable
    public void flush() throws IOException {
        m32106a(true);
        this.f37057g.flush();
    }

    @Override // p353j.InterfaceC9663b0
    public C9669e0 timeout() {
        return this.f37057g.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f37057g + ')';
    }

    @Override // p353j.InterfaceC9663b0
    public void write(C9670f c9670f, long j2) throws IOException {
        C9768m.m32346f(c9670f, "source");
        C9664c.m31982b(c9670f.size(), 0L, j2);
        while (j2 > 0) {
            C9693y c9693y = c9670f.f37038f;
            C9768m.m32343c(c9693y);
            int min = (int) Math.min(j2, c9693y.f37093d - c9693y.f37092c);
            this.f37058h.setInput(c9693y.f37091b, c9693y.f37092c, min);
            m32106a(false);
            long j3 = min;
            c9670f.m32038f0(c9670f.size() - j3);
            int i2 = c9693y.f37092c + min;
            c9693y.f37092c = i2;
            if (i2 == c9693y.f37093d) {
                c9670f.f37038f = c9693y.m32162b();
                C9694z.m32169b(c9693y);
            }
            j2 -= j3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9678j(InterfaceC9663b0 interfaceC9663b0, Deflater deflater) {
        this(C9685q.m32119c(interfaceC9663b0), deflater);
        C9768m.m32346f(interfaceC9663b0, "sink");
        C9768m.m32346f(deflater, "deflater");
    }
}
