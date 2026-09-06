package p353j;

import java.io.IOException;
import kotlin.jvm.internal.C9768m;

/* compiled from: ForwardingSink.kt */
/* renamed from: j.k */
/* loaded from: classes3.dex */
public abstract class AbstractC9679k implements InterfaceC9663b0 {
    private final InterfaceC9663b0 delegate;

    public AbstractC9679k(InterfaceC9663b0 interfaceC9663b0) {
        C9768m.m32346f(interfaceC9663b0, "delegate");
        this.delegate = interfaceC9663b0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC9663b0 m41051deprecated_delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9663b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC9663b0 delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9663b0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p353j.InterfaceC9663b0
    public C9669e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p353j.InterfaceC9663b0
    public void write(C9670f c9670f, long j2) throws IOException {
        C9768m.m32346f(c9670f, "source");
        this.delegate.write(c9670f, j2);
    }
}
