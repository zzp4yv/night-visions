package okhttp3.internal.p454ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlin.p429io.C10523a;
import okhttp3.HttpUrl;
import p353j.C9670f;
import p353j.C9677i;
import p353j.C9678j;
import p353j.InterfaceC9663b0;

/* compiled from: MessageDeflater.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m32267d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lj/f;", "Lj/i;", "suffix", HttpUrl.FRAGMENT_ENCODE_SET, "endsWith", "(Lj/f;Lj/i;)Z", "buffer", "Lkotlin/u;", "deflate", "(Lj/f;)V", "close", "()V", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "noContextTakeover", "Z", "Lj/j;", "deflaterSink", "Lj/j;", "deflatedBytes", "Lj/f;", "<init>", "(Z)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable {
    private final C9670f deflatedBytes;
    private final Deflater deflater;
    private final C9678j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C9670f c9670f = new C9670f();
        this.deflatedBytes = c9670f;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C9678j((InterfaceC9663b0) c9670f, deflater);
    }

    private final boolean endsWith(C9670f c9670f, C9677i c9677i) {
        return c9670f.mo32059v0(c9670f.size() - c9677i.m32093P(), c9677i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(C9670f buffer) throws IOException {
        C9677i c9677i;
        C9768m.m32346f(buffer, "buffer");
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        C9670f c9670f = this.deflatedBytes;
        c9677i = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(c9670f, c9677i)) {
            long size = this.deflatedBytes.size() - 4;
            C9670f.a m31995J = C9670f.m31995J(this.deflatedBytes, null, 1, null);
            try {
                m31995J.m32065c(size);
                C10523a.m37638a(m31995J, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C9670f c9670f2 = this.deflatedBytes;
        buffer.write(c9670f2, c9670f2.size());
    }
}
