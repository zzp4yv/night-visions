package io.sentry;

import io.sentry.C9459j4;
import io.sentry.clientreport.C9365b;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.util.C9608l;
import io.sentry.util.C9610n;
import io.sentry.util.C9613q;
import io.sentry.vendor.C9630a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeItem.java */
@ApiStatus.Internal
/* renamed from: io.sentry.j4 */
/* loaded from: classes2.dex */
public final class C9459j4 {

    /* renamed from: a */
    private static final Charset f36389a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C9466k4 f36390b;

    /* renamed from: c */
    private final Callable<byte[]> f36391c;

    /* renamed from: d */
    private byte[] f36392d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SentryEnvelopeItem.java */
    /* renamed from: io.sentry.j4$a */
    static class a {

        /* renamed from: a */
        private byte[] f36393a;

        /* renamed from: b */
        private final Callable<byte[]> f36394b;

        public a(Callable<byte[]> callable) {
            this.f36394b = callable;
        }

        /* renamed from: b */
        private static byte[] m30911b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        /* renamed from: a */
        public byte[] m30912a() throws Exception {
            Callable<byte[]> callable;
            if (this.f36393a == null && (callable = this.f36394b) != null) {
                this.f36393a = callable.call();
            }
            return m30911b(this.f36393a);
        }
    }

    C9459j4(C9466k4 c9466k4, byte[] bArr) {
        this.f36390b = (C9466k4) C9613q.m31802c(c9466k4, "SentryEnvelopeItemHeader is required.");
        this.f36392d = bArr;
        this.f36391c = null;
    }

    /* renamed from: a */
    private static void m30887a(long j2, long j3, String str) throws SentryEnvelopeException {
        if (j2 > j3) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: b */
    public static C9459j4 m30888b(final InterfaceC9340c2 interfaceC9340c2, final InterfaceC9637w1 interfaceC9637w1, final C9550s0 c9550s0, final long j2) {
        final a aVar = new a(new Callable() { // from class: io.sentry.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9459j4.m30893j(C9550s0.this, j2, interfaceC9340c2, interfaceC9637w1);
            }
        });
        return new C9459j4(new C9466k4(EnumC9547r4.Attachment, (Callable<Integer>) new Callable() { // from class: io.sentry.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C9459j4.a.this.m30912a().length);
                return valueOf;
            }
        }, c9550s0.m31577f(), c9550s0.m31578g(), c9550s0.m31575d()), (Callable<byte[]>) new Callable() { // from class: io.sentry.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m30912a;
                m30912a = C9459j4.a.this.m30912a();
                return m30912a;
            }
        });
    }

    /* renamed from: c */
    public static C9459j4 m30889c(final InterfaceC9340c2 interfaceC9340c2, final C9365b c9365b) throws IOException {
        C9613q.m31802c(interfaceC9340c2, "ISerializer is required.");
        C9613q.m31802c(c9365b, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9459j4.m30896m(InterfaceC9340c2.this, c9365b);
            }
        });
        return new C9459j4(new C9466k4(EnumC9547r4.resolve(c9365b), new Callable() { // from class: io.sentry.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C9459j4.a.this.m30912a().length);
                return valueOf;
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m30912a;
                m30912a = C9459j4.a.this.m30912a();
                return m30912a;
            }
        });
    }

    /* renamed from: d */
    public static C9459j4 m30890d(final InterfaceC9340c2 interfaceC9340c2, final AbstractC9342c4 abstractC9342c4) throws IOException {
        C9613q.m31802c(interfaceC9340c2, "ISerializer is required.");
        C9613q.m31802c(abstractC9342c4, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9459j4.m30899p(InterfaceC9340c2.this, abstractC9342c4);
            }
        });
        return new C9459j4(new C9466k4(EnumC9547r4.resolve(abstractC9342c4), new Callable() { // from class: io.sentry.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C9459j4.a.this.m30912a().length);
                return valueOf;
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m30912a;
                m30912a = C9459j4.a.this.m30912a();
                return m30912a;
            }
        });
    }

    /* renamed from: e */
    public static C9459j4 m30891e(final C9479m3 c9479m3, final long j2, final InterfaceC9340c2 interfaceC9340c2) throws SentryEnvelopeException {
        final File m31057A = c9479m3.m31057A();
        final a aVar = new a(new Callable() { // from class: io.sentry.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9459j4.m30902s(m31057A, j2, c9479m3, interfaceC9340c2);
            }
        });
        return new C9459j4(new C9466k4(EnumC9547r4.Profile, new Callable() { // from class: io.sentry.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C9459j4.a.this.m30912a().length);
                return valueOf;
            }
        }, "application-json", m31057A.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m30912a;
                m30912a = C9459j4.a.this.m30912a();
                return m30912a;
            }
        });
    }

    /* renamed from: f */
    public static C9459j4 m30892f(final InterfaceC9340c2 interfaceC9340c2, final C9389d5 c9389d5) throws IOException {
        C9613q.m31802c(interfaceC9340c2, "ISerializer is required.");
        C9613q.m31802c(c9389d5, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9459j4.m30905v(InterfaceC9340c2.this, c9389d5);
            }
        });
        return new C9459j4(new C9466k4(EnumC9547r4.Session, new Callable() { // from class: io.sentry.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C9459j4.a.this.m30912a().length);
                return valueOf;
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m30912a;
                m30912a = C9459j4.a.this.m30912a();
                return m30912a;
            }
        });
    }

    /* renamed from: j */
    static /* synthetic */ byte[] m30893j(C9550s0 c9550s0, long j2, InterfaceC9340c2 interfaceC9340c2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
        if (c9550s0.m31576e() != null) {
            byte[] m31576e = c9550s0.m31576e();
            m30887a(m31576e.length, j2, c9550s0.m31578g());
            return m31576e;
        }
        if (c9550s0.m31580i() != null) {
            byte[] m31796b = C9610n.m31796b(interfaceC9340c2, interfaceC9637w1, c9550s0.m31580i());
            if (m31796b != null) {
                m30887a(m31796b.length, j2, c9550s0.m31578g());
                return m31796b;
            }
        } else if (c9550s0.m31579h() != null) {
            return C9608l.m31776b(c9550s0.m31579h(), j2);
        }
        throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", c9550s0.m31578g()));
    }

    /* renamed from: m */
    static /* synthetic */ byte[] m30896m(InterfaceC9340c2 interfaceC9340c2, C9365b c9365b) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9340c2.mo30487a(c9365b, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: p */
    static /* synthetic */ byte[] m30899p(InterfaceC9340c2 interfaceC9340c2, AbstractC9342c4 abstractC9342c4) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9340c2.mo30487a(abstractC9342c4, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: s */
    static /* synthetic */ byte[] m30902s(File file, long j2, C9479m3 c9479m3, InterfaceC9340c2 interfaceC9340c2) throws Exception {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String m31853c = C9630a.m31853c(C9608l.m31776b(file.getPath(), j2), 3);
        if (m31853c.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        c9479m3.m31059E(m31853c);
        c9479m3.m31058D();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
                    try {
                        interfaceC9340c2.mo30487a(c9479m3, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e2.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: v */
    static /* synthetic */ byte[] m30905v(InterfaceC9340c2 interfaceC9340c2, C9389d5 c9389d5) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9340c2.mo30487a(c9389d5, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public C9365b m30908g(InterfaceC9340c2 interfaceC9340c2) throws Exception {
        C9466k4 c9466k4 = this.f36390b;
        if (c9466k4 == null || c9466k4.m30919b() != EnumC9547r4.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m30909h()), f36389a));
        try {
            C9365b c9365b = (C9365b) interfaceC9340c2.mo30489c(bufferedReader, C9365b.class);
            bufferedReader.close();
            return c9365b;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: h */
    public byte[] m30909h() throws Exception {
        Callable<byte[]> callable;
        if (this.f36392d == null && (callable = this.f36391c) != null) {
            this.f36392d = callable.call();
        }
        return this.f36392d;
    }

    /* renamed from: i */
    public C9466k4 m30910i() {
        return this.f36390b;
    }

    C9459j4(C9466k4 c9466k4, Callable<byte[]> callable) {
        this.f36390b = (C9466k4) C9613q.m31802c(c9466k4, "SentryEnvelopeItemHeader is required.");
        this.f36391c = (Callable) C9613q.m31802c(callable, "DataFactory is required.");
        this.f36392d = null;
    }
}
