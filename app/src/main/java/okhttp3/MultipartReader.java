package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import okhttp3.internal.http1.HeadersReader;
import p353j.C9669e0;
import p353j.C9670f;
import p353j.C9677i;
import p353j.C9685q;
import p353j.C9688t;
import p353j.InterfaceC9667d0;
import p353j.InterfaceC9676h;

/* compiled from: MultipartReader.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0018\u00010\fR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u00020\u00198\u0007@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006)"}, m32267d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, "maxResult", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "Lkotlin/u;", "close", "()V", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Lj/h;", "source", "Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "noMoreParts", "Z", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "partCount", "I", HttpUrl.FRAGMENT_ENCODE_SET, "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "Lj/i;", "dashDashBoundary", "Lj/i;", "crlfDashDashBoundary", "<init>", "(Lj/h;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C9688t afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C9677i crlfDashDashBoundary;
    private PartSource currentPart;
    private final C9677i dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC9676h source;

    /* compiled from: MultipartReader.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lokhttp3/MultipartReader$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/t;", "afterBoundaryOptions", "Lj/t;", "getAfterBoundaryOptions", "()Lj/t;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final C9688t getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0019\u0010\n\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000f"}, m32267d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lkotlin/u;", "close", "()V", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lj/h;", "body", "Lj/h;", "()Lj/h;", "<init>", "(Lokhttp3/Headers;Lj/h;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Part implements Closeable {
        private final InterfaceC9676h body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC9676h interfaceC9676h) {
            C9768m.m32346f(headers, "headers");
            C9768m.m32346f(interfaceC9676h, "body");
            this.headers = headers;
            this.body = interfaceC9676h;
        }

        /* renamed from: body, reason: from getter */
        public final InterfaceC9676h getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0011"}, m32267d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lj/d0;", "Lkotlin/u;", "close", "()V", "Lj/f;", "sink", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "read", "(Lj/f;J)J", "Lj/e0;", "timeout", "()Lj/e0;", "Lj/e0;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private final class PartSource implements InterfaceC9667d0 {
        private final C9669e0 timeout = new C9669e0();

        public PartSource() {
        }

        @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C9768m.m32341a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // p353j.InterfaceC9667d0
        public long read(C9670f sink, long byteCount) {
            C9768m.m32346f(sink, "sink");
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!C9768m.m32341a(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            C9669e0 timeout = MultipartReader.this.source.getTimeout();
            C9669e0 c9669e0 = this.timeout;
            long timeoutNanos = timeout.timeoutNanos();
            long m31994a = C9669e0.Companion.m31994a(c9669e0.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(m31994a, timeUnit);
            if (!timeout.hasDeadline()) {
                if (c9669e0.hasDeadline()) {
                    timeout.deadlineNanoTime(c9669e0.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(byteCount);
                    long read = currentPartBytesRemaining == 0 ? -1L : MultipartReader.this.source.read(sink, currentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (c9669e0.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (c9669e0.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (c9669e0.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), c9669e0.deadlineNanoTime()));
            }
            try {
                long currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(byteCount);
                long read2 = currentPartBytesRemaining2 == 0 ? -1L : MultipartReader.this.source.read(sink, currentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (c9669e0.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th2) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (c9669e0.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // p353j.InterfaceC9667d0
        /* renamed from: timeout, reason: from getter */
        public C9669e0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        C9688t.a aVar = C9688t.f37072g;
        C9677i.a aVar2 = C9677i.f37052g;
        afterBoundaryOptions = aVar.m32153d(aVar2.m32103d("\r\n"), aVar2.m32103d("--"), aVar2.m32103d(" "), aVar2.m32103d("\t"));
    }

    public MultipartReader(InterfaceC9676h interfaceC9676h, String str) throws IOException {
        C9768m.m32346f(interfaceC9676h, "source");
        C9768m.m32346f(str, "boundary");
        this.source = interfaceC9676h;
        this.boundary = str;
        this.dashDashBoundary = new C9670f().mo32055r0("--").mo32055r0(str).mo32003D0();
        this.crlfDashDashBoundary = new C9670f().mo32055r0("\r\n--").mo32055r0(str).mo32003D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) {
        this.source.mo32041g1(this.crlfDashDashBoundary.m32093P());
        long mo32016P = this.source.mo32042i().mo32016P(this.crlfDashDashBoundary);
        return mo32016P == -1 ? Math.min(maxResult, (this.source.mo32042i().size() - this.crlfDashDashBoundary.m32093P()) + 1) : Math.min(maxResult, mo32016P);
    }

    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.mo32059v0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.m32093P());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.m32093P());
        }
        boolean z = false;
        while (true) {
            int mo32053p1 = this.source.mo32053p1(afterBoundaryOptions);
            if (mo32053p1 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (mo32053p1 == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, C9685q.m32120d(partSource));
            }
            if (mo32053p1 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (mo32053p1 == 2 || mo32053p1 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C9768m.m32346f(r3, r0)
            j.h r0 = r3.getBodySource()
            okhttp3.MediaType r3 = r3.get$contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
