package p353j;

import kotlin.jvm.internal.C9768m;

/* compiled from: Okio.kt */
/* renamed from: j.e */
/* loaded from: classes3.dex */
final class C9668e implements InterfaceC9663b0 {
    @Override // p353j.InterfaceC9663b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p353j.InterfaceC9663b0, java.io.Flushable
    public void flush() {
    }

    @Override // p353j.InterfaceC9663b0
    public C9669e0 timeout() {
        return C9669e0.NONE;
    }

    @Override // p353j.InterfaceC9663b0
    public void write(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "source");
        c9670f.skip(j2);
    }
}
