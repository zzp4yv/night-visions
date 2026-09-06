package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p353j.C9669e0;
import p353j.C9670f;
import p353j.C9677i;
import p353j.InterfaceC9667d0;

/* compiled from: Relay.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 E2\u00020\u0001:\u0002EFB5\b\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R\u0019\u0010+\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u000bR\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u00109\u001a\u0002028F@\u0006¢\u0006\u0006\u001a\u0004\b9\u00106R\u0019\u0010:\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006G"}, m32267d2 = {"Lokhttp3/internal/cache2/Relay;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/i;", "prefix", HttpUrl.FRAGMENT_ENCODE_SET, "upstreamSize", "metadataSize", "Lkotlin/u;", "writeHeader", "(Lj/i;JJ)V", "writeMetadata", "(J)V", "commit", "metadata", "()Lj/i;", "Lj/d0;", "newSource", "()Lj/d0;", "Lj/i;", "bufferMaxSize", "J", "getBufferMaxSize", "()J", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", HttpUrl.FRAGMENT_ENCODE_SET, "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "upstream", "Lj/d0;", "getUpstream", "setUpstream", "(Lj/d0;)V", "Lj/f;", "buffer", "Lj/f;", "getBuffer", "()Lj/f;", "upstreamPos", "getUpstreamPos", "setUpstreamPos", HttpUrl.FRAGMENT_ENCODE_SET, "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "isClosed", "upstreamBuffer", "getUpstreamBuffer", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "<init>", "(Ljava/io/RandomAccessFile;Lj/d0;JLj/i;J)V", "Companion", "RelaySource", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Relay {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C9677i PREFIX_CLEAN;
    public static final C9677i PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C9670f buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C9677i metadata;
    private int sourceCount;
    private InterfaceC9667d0 upstream;
    private final C9670f upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: Relay.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, m32267d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/File;", "file", "Lj/d0;", "upstream", "Lj/i;", "metadata", HttpUrl.FRAGMENT_ENCODE_SET, "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lj/d0;Lj/i;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lj/i;", "PREFIX_DIRTY", HttpUrl.FRAGMENT_ENCODE_SET, "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final Relay edit(File file, InterfaceC9667d0 upstream, C9677i metadata, long bufferMaxSize) throws IOException {
            C9768m.m32346f(file, "file");
            C9768m.m32346f(upstream, "upstream");
            C9768m.m32346f(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            C9768m.m32346f(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            C9768m.m32345e(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C9670f c9670f = new C9670f();
            fileOperator.read(0L, c9670f, Relay.FILE_HEADER_SIZE);
            C9677i c9677i = Relay.PREFIX_CLEAN;
            if (!C9768m.m32341a(c9670f.mo32058u(c9677i.m32093P()), c9677i)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = c9670f.readLong();
            long readLong2 = c9670f.readLong();
            C9670f c9670f2 = new C9670f();
            fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, c9670f2, readLong2);
            return new Relay(randomAccessFile, null, readLong, c9670f2.mo32003D0(), 0L, null);
        }

        public /* synthetic */ Companion(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0016"}, m32267d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lj/d0;", "Lj/f;", "sink", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "read", "(Lj/f;J)J", "Lj/e0;", "timeout", "()Lj/e0;", "Lkotlin/u;", "close", "()V", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "Lj/e0;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public final class RelaySource implements InterfaceC9667d0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C9669e0 timeout = new C9669e0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            C9768m.m32343c(file);
            FileChannel channel = file.getChannel();
            C9768m.m32345e(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay.this.setSourceCount(r2.getSourceCount() - 1);
                if (Relay.this.getSourceCount() == 0) {
                    RandomAccessFile file = Relay.this.getFile();
                    Relay.this.setFile(null);
                    randomAccessFile = file;
                }
                C10742u c10742u = C10742u.f41439a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            r10 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.C9768m.m32343c(r2);
            r2.read(r19.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r10);
            r19.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
        
            r0 = r19.this$0.getUpstream();
            kotlin.jvm.internal.C9768m.m32343c(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
        
            if (r14 != (-1)) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
        
            if (r0 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
        
            r0.notifyAll();
            r0 = kotlin.C10742u.f41439a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
        
            r11 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().m32044j(r20, 0, r11);
            r19.sourcePos += r11;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.C9768m.m32343c(r13);
            r13.write(r19.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
        
            r19.this$0.getBuffer().write(r19.this$0.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x014c, code lost:
        
            if (r19.this$0.getBuffer().size() <= r19.this$0.getBufferMaxSize()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
        
            r19.this$0.getBuffer().skip(r19.this$0.getBuffer().size() - r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0168, code lost:
        
            r0 = r19.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r14);
            r0 = kotlin.C10742u.f41439a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0175, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0177, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0178, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x017f, code lost:
        
            if (r0 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0181, code lost:
        
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0184, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x018d, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0194, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0197, code lost:
        
            monitor-enter(r19.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r3 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        
            if (r3 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01a8, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01a9, code lost:
        
            r3.notifyAll();
            r3 = kotlin.C10742u.f41439a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01af, code lost:
        
            throw r0;
         */
        @Override // p353j.InterfaceC9667d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(p353j.C9670f r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(j.f, long):long");
        }

        @Override // p353j.InterfaceC9667d0
        /* renamed from: timeout, reason: from getter */
        public C9669e0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        C9677i.a aVar = C9677i.f37052g;
        PREFIX_CLEAN = aVar.m32103d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.m32103d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC9667d0 interfaceC9667d0, long j2, C9677i c9677i, long j3) {
        this.file = randomAccessFile;
        this.upstream = interfaceC9667d0;
        this.upstreamPos = j2;
        this.metadata = c9677i;
        this.bufferMaxSize = j3;
        this.upstreamBuffer = new C9670f();
        this.complete = this.upstream == null;
        this.buffer = new C9670f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C9677i prefix, long upstreamSize, long metadataSize) throws IOException {
        C9670f c9670f = new C9670f();
        c9670f.mo32023U0(prefix);
        c9670f.m32018Q0(upstreamSize);
        c9670f.m32018Q0(metadataSize);
        if (!(c9670f.size() == FILE_HEADER_SIZE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        C9768m.m32343c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C9768m.m32345e(channel, "file!!.channel");
        new FileOperator(channel).write(0L, c9670f, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long upstreamSize) throws IOException {
        C9670f c9670f = new C9670f();
        c9670f.mo32023U0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        C9768m.m32343c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        C9768m.m32345e(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, c9670f, this.metadata.m32093P());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        C9768m.m32343c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.m32093P());
        RandomAccessFile randomAccessFile2 = this.file;
        C9768m.m32343c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            C10742u c10742u = C10742u.f41439a;
        }
        InterfaceC9667d0 interfaceC9667d0 = this.upstream;
        if (interfaceC9667d0 != null) {
            Util.closeQuietly(interfaceC9667d0);
        }
        this.upstream = null;
    }

    public final C9670f getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final InterfaceC9667d0 getUpstream() {
        return this.upstream;
    }

    public final C9670f getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* renamed from: metadata, reason: from getter */
    public final C9677i getMetadata() {
        return this.metadata;
    }

    public final InterfaceC9667d0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i2) {
        this.sourceCount = i2;
    }

    public final void setUpstream(InterfaceC9667d0 interfaceC9667d0) {
        this.upstream = interfaceC9667d0;
    }

    public final void setUpstreamPos(long j2) {
        this.upstreamPos = j2;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC9667d0 interfaceC9667d0, long j2, C9677i c9677i, long j3, C9756g c9756g) {
        this(randomAccessFile, interfaceC9667d0, j2, c9677i, j3);
    }
}
