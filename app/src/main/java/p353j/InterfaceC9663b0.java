package p353j;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
/* renamed from: j.b0 */
/* loaded from: classes3.dex */
public interface InterfaceC9663b0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    C9669e0 timeout();

    void write(C9670f c9670f, long j2) throws IOException;
}
