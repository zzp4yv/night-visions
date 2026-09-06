package p353j;

import java.io.IOException;
import kotlin.jvm.internal.C9768m;

/* compiled from: ForwardingSource.kt */
/* renamed from: j.l */
/* loaded from: classes3.dex */
public abstract class AbstractC9680l implements InterfaceC9667d0 {
    private final InterfaceC9667d0 delegate;

    public AbstractC9680l(InterfaceC9667d0 interfaceC9667d0) {
        C9768m.m32346f(interfaceC9667d0, "delegate");
        this.delegate = interfaceC9667d0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC9667d0 m41052deprecated_delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC9667d0 delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9667d0
    public long read(C9670f c9670f, long j2) throws IOException {
        C9768m.m32346f(c9670f, "sink");
        return this.delegate.read(c9670f, j2);
    }

    @Override // p353j.InterfaceC9667d0
    public C9669e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
