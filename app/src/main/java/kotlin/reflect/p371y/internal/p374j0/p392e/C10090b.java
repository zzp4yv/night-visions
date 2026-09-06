package kotlin.reflect.p371y.internal.p374j0.p392e;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10710b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10713e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10717i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.b */
/* loaded from: classes3.dex */
public final class C10090b extends AbstractC10716h implements InterfaceC10724p {

    /* renamed from: g */
    private static final C10090b f38609g;

    /* renamed from: h */
    public static InterfaceC10725q<C10090b> f38610h = new a();

    /* renamed from: i */
    private final AbstractC10712d f38611i;

    /* renamed from: j */
    private int f38612j;

    /* renamed from: k */
    private int f38613k;

    /* renamed from: l */
    private List<b> f38614l;

    /* renamed from: m */
    private byte f38615m;

    /* renamed from: n */
    private int f38616n;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.b$a */
    static class a extends AbstractC10710b<C10090b> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10090b mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10090b(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.b$b */
    public static final class b extends AbstractC10716h implements InterfaceC10724p {

        /* renamed from: g */
        private static final b f38617g;

        /* renamed from: h */
        public static InterfaceC10725q<b> f38618h = new a();

        /* renamed from: i */
        private final AbstractC10712d f38619i;

        /* renamed from: j */
        private int f38620j;

        /* renamed from: k */
        private int f38621k;

        /* renamed from: l */
        private c f38622l;

        /* renamed from: m */
        private byte f38623m;

        /* renamed from: n */
        private int f38624n;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.b$b$a */
        static class a extends AbstractC10710b<b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
                return new b(c10713e, c10714f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.b$b$b, reason: collision with other inner class name */
        public static final class C11506b extends AbstractC10716h.b<b, C11506b> implements InterfaceC10724p {

            /* renamed from: g */
            private int f38625g;

            /* renamed from: h */
            private int f38626h;

            /* renamed from: i */
            private c f38627i = c.m34317L();

            private C11506b() {
                m34304t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static C11506b m34303s() {
                return new C11506b();
            }

            /* renamed from: t */
            private void m34304t() {
            }

            /* renamed from: A */
            public C11506b m34305A(int i2) {
                this.f38625g |= 1;
                this.f38626h = i2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b mo34093c() {
                b m34307q = m34307q();
                if (m34307q.isInitialized()) {
                    return m34307q;
                }
                throw AbstractC10709a.a.m38257j(m34307q);
            }

            /* renamed from: q */
            public b m34307q() {
                b bVar = new b(this);
                int i2 = this.f38625g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                bVar.f38621k = this.f38626h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.f38622l = this.f38627i;
                bVar.f38620j = i3;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C11506b mo34095k() {
                return m34303s().mo34096m(m34307q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C11506b mo34096m(b bVar) {
                if (bVar == b.m34294v()) {
                    return this;
                }
                if (bVar.m34299y()) {
                    m34305A(bVar.m34297w());
                }
                if (bVar.m34300z()) {
                    m34311w(bVar.m34298x());
                }
                m38392n(m38391l().m38286f(bVar.f38619i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.C11506b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.b$b> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.f38618h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.b$b r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mo34096m(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m38252a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.f0.y.e.j0.e.b$b r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mo34096m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.C11506b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.b$b$b");
            }

            /* renamed from: w */
            public C11506b m34311w(c cVar) {
                if ((this.f38625g & 2) != 2 || this.f38627i == c.m34317L()) {
                    this.f38627i = cVar;
                } else {
                    this.f38627i = c.m34320g0(this.f38627i).mo34096m(cVar).m34371q();
                }
                this.f38625g |= 2;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f38617g = bVar;
            bVar.m34287A();
        }

        /* renamed from: A */
        private void m34287A() {
            this.f38621k = 0;
            this.f38622l = c.m34317L();
        }

        /* renamed from: B */
        public static C11506b m34288B() {
            return C11506b.m34303s();
        }

        /* renamed from: C */
        public static C11506b m34289C(b bVar) {
            return m34288B().mo34096m(bVar);
        }

        /* renamed from: v */
        public static b m34294v() {
            return f38617g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C11506b mo34079f() {
            return m34288B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C11506b mo34077d() {
            return m34289C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38624n;
            if (i2 != -1) {
                return i2;
            }
            int m38189o = (this.f38620j & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f38621k) : 0;
            if ((this.f38620j & 2) == 2) {
                m38189o += CodedOutputStream.m38193s(2, this.f38622l);
            }
            int size = m38189o + this.f38619i.size();
            this.f38624n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
        /* renamed from: g */
        public InterfaceC10725q<b> mo34080g() {
            return f38618h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f38620j & 1) == 1) {
                codedOutputStream.m38217a0(1, this.f38621k);
            }
            if ((this.f38620j & 2) == 2) {
                codedOutputStream.m38220d0(2, this.f38622l);
            }
            codedOutputStream.m38225i0(this.f38619i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
        public final boolean isInitialized() {
            byte b2 = this.f38623m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!m34299y()) {
                this.f38623m = (byte) 0;
                return false;
            }
            if (!m34300z()) {
                this.f38623m = (byte) 0;
                return false;
            }
            if (m34298x().isInitialized()) {
                this.f38623m = (byte) 1;
                return true;
            }
            this.f38623m = (byte) 0;
            return false;
        }

        /* renamed from: w */
        public int m34297w() {
            return this.f38621k;
        }

        /* renamed from: x */
        public c m34298x() {
            return this.f38622l;
        }

        /* renamed from: y */
        public boolean m34299y() {
            return (this.f38620j & 1) == 1;
        }

        /* renamed from: z */
        public boolean m34300z() {
            return (this.f38620j & 2) == 2;
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.b$b$c */
        public static final class c extends AbstractC10716h implements InterfaceC10724p {

            /* renamed from: g */
            private static final c f38628g;

            /* renamed from: h */
            public static InterfaceC10725q<c> f38629h = new a();

            /* renamed from: i */
            private final AbstractC10712d f38630i;

            /* renamed from: j */
            private int f38631j;

            /* renamed from: k */
            private EnumC11508c f38632k;

            /* renamed from: l */
            private long f38633l;

            /* renamed from: m */
            private float f38634m;

            /* renamed from: n */
            private double f38635n;

            /* renamed from: o */
            private int f38636o;

            /* renamed from: p */
            private int f38637p;

            /* renamed from: q */
            private int f38638q;

            /* renamed from: r */
            private C10090b f38639r;

            /* renamed from: s */
            private List<c> f38640s;

            /* renamed from: t */
            private int f38641t;

            /* renamed from: u */
            private int f38642u;

            /* renamed from: v */
            private byte f38643v;

            /* renamed from: w */
            private int f38644w;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.b$b$c$a */
            static class a extends AbstractC10710b<c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
                    return new c(c10713e, c10714f);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.b$b$c$b, reason: collision with other inner class name */
            public static final class C11507b extends AbstractC10716h.b<c, C11507b> implements InterfaceC10724p {

                /* renamed from: g */
                private int f38645g;

                /* renamed from: i */
                private long f38647i;

                /* renamed from: j */
                private float f38648j;

                /* renamed from: k */
                private double f38649k;

                /* renamed from: l */
                private int f38650l;

                /* renamed from: m */
                private int f38651m;

                /* renamed from: n */
                private int f38652n;

                /* renamed from: q */
                private int f38655q;

                /* renamed from: r */
                private int f38656r;

                /* renamed from: h */
                private EnumC11508c f38646h = EnumC11508c.BYTE;

                /* renamed from: o */
                private C10090b f38653o = C10090b.m34278z();

                /* renamed from: p */
                private List<c> f38654p = Collections.emptyList();

                private C11507b() {
                    m34359u();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: s */
                public static C11507b m34357s() {
                    return new C11507b();
                }

                /* renamed from: t */
                private void m34358t() {
                    if ((this.f38645g & 256) != 256) {
                        this.f38654p = new ArrayList(this.f38654p);
                        this.f38645g |= 256;
                    }
                }

                /* renamed from: u */
                private void m34359u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.c.C11507b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.b$b$c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.c.f38629h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.f0.y.e.j0.e.b$b$c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.mo34096m(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m38252a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.f0.y.e.j0.e.b$b$c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.mo34096m(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.b.c.C11507b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.b$b$c$b");
                }

                /* renamed from: B */
                public C11507b m34361B(int i2) {
                    this.f38645g |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.f38655q = i2;
                    return this;
                }

                /* renamed from: C */
                public C11507b m34362C(int i2) {
                    this.f38645g |= 32;
                    this.f38651m = i2;
                    return this;
                }

                /* renamed from: D */
                public C11507b m34363D(double d2) {
                    this.f38645g |= 8;
                    this.f38649k = d2;
                    return this;
                }

                /* renamed from: E */
                public C11507b m34364E(int i2) {
                    this.f38645g |= 64;
                    this.f38652n = i2;
                    return this;
                }

                /* renamed from: F */
                public C11507b m34365F(int i2) {
                    this.f38645g |= 1024;
                    this.f38656r = i2;
                    return this;
                }

                /* renamed from: G */
                public C11507b m34366G(float f2) {
                    this.f38645g |= 4;
                    this.f38648j = f2;
                    return this;
                }

                /* renamed from: H */
                public C11507b m34367H(long j2) {
                    this.f38645g |= 2;
                    this.f38647i = j2;
                    return this;
                }

                /* renamed from: I */
                public C11507b m34368I(int i2) {
                    this.f38645g |= 16;
                    this.f38650l = i2;
                    return this;
                }

                /* renamed from: J */
                public C11507b m34369J(EnumC11508c enumC11508c) {
                    enumC11508c.getClass();
                    this.f38645g |= 1;
                    this.f38646h = enumC11508c;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public c mo34093c() {
                    c m34371q = m34371q();
                    if (m34371q.isInitialized()) {
                        return m34371q;
                    }
                    throw AbstractC10709a.a.m38257j(m34371q);
                }

                /* renamed from: q */
                public c m34371q() {
                    c cVar = new c(this);
                    int i2 = this.f38645g;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    cVar.f38632k = this.f38646h;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.f38633l = this.f38647i;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.f38634m = this.f38648j;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.f38635n = this.f38649k;
                    if ((i2 & 16) == 16) {
                        i3 |= 16;
                    }
                    cVar.f38636o = this.f38650l;
                    if ((i2 & 32) == 32) {
                        i3 |= 32;
                    }
                    cVar.f38637p = this.f38651m;
                    if ((i2 & 64) == 64) {
                        i3 |= 64;
                    }
                    cVar.f38638q = this.f38652n;
                    if ((i2 & 128) == 128) {
                        i3 |= 128;
                    }
                    cVar.f38639r = this.f38653o;
                    if ((this.f38645g & 256) == 256) {
                        this.f38654p = Collections.unmodifiableList(this.f38654p);
                        this.f38645g &= -257;
                    }
                    cVar.f38640s = this.f38654p;
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        i3 |= 256;
                    }
                    cVar.f38641t = this.f38655q;
                    if ((i2 & 1024) == 1024) {
                        i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    cVar.f38642u = this.f38656r;
                    cVar.f38631j = i3;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C11507b mo34095k() {
                    return m34357s().mo34096m(m34371q());
                }

                /* renamed from: v */
                public C11507b m34373v(C10090b c10090b) {
                    if ((this.f38645g & 128) != 128 || this.f38653o == C10090b.m34278z()) {
                        this.f38653o = c10090b;
                    } else {
                        this.f38653o = C10090b.m34272E(this.f38653o).mo34096m(c10090b).m34383q();
                    }
                    this.f38645g |= 128;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C11507b mo34096m(c cVar) {
                    if (cVar == c.m34317L()) {
                        return this;
                    }
                    if (cVar.m34352d0()) {
                        m34369J(cVar.m34342S());
                    }
                    if (cVar.m34350b0()) {
                        m34367H(cVar.m34340Q());
                    }
                    if (cVar.m34349a0()) {
                        m34366G(cVar.m34339P());
                    }
                    if (cVar.m34346X()) {
                        m34363D(cVar.m34336M());
                    }
                    if (cVar.m34351c0()) {
                        m34368I(cVar.m34341R());
                    }
                    if (cVar.m34345V()) {
                        m34362C(cVar.m34335K());
                    }
                    if (cVar.m34347Y()) {
                        m34364E(cVar.m34337N());
                    }
                    if (cVar.m34343T()) {
                        m34373v(cVar.m34330F());
                    }
                    if (!cVar.f38640s.isEmpty()) {
                        if (this.f38654p.isEmpty()) {
                            this.f38654p = cVar.f38640s;
                            this.f38645g &= -257;
                        } else {
                            m34358t();
                            this.f38654p.addAll(cVar.f38640s);
                        }
                    }
                    if (cVar.m34344U()) {
                        m34361B(cVar.m34331G());
                    }
                    if (cVar.m34348Z()) {
                        m34365F(cVar.m34338O());
                    }
                    m38392n(m38391l().m38286f(cVar.f38630i));
                    return this;
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC11508c implements C10717i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* renamed from: s */
                private static C10717i.b<EnumC11508c> f38670s = new a();

                /* renamed from: u */
                private final int f38672u;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.f0.y.e.j0.e.b$b$c$c$a */
                static class a implements C10717i.b<EnumC11508c> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC11508c mo34236a(int i2) {
                        return EnumC11508c.m34375g(i2);
                    }
                }

                EnumC11508c(int i2, int i3) {
                    this.f38672u = i3;
                }

                /* renamed from: g */
                public static EnumC11508c m34375g(int i2) {
                    switch (i2) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
                /* renamed from: f */
                public final int mo34235f() {
                    return this.f38672u;
                }
            }

            static {
                c cVar = new c(true);
                f38628g = cVar;
                cVar.m34318e0();
            }

            /* renamed from: L */
            public static c m34317L() {
                return f38628g;
            }

            /* renamed from: e0 */
            private void m34318e0() {
                this.f38632k = EnumC11508c.BYTE;
                this.f38633l = 0L;
                this.f38634m = 0.0f;
                this.f38635n = 0.0d;
                this.f38636o = 0;
                this.f38637p = 0;
                this.f38638q = 0;
                this.f38639r = C10090b.m34278z();
                this.f38640s = Collections.emptyList();
                this.f38641t = 0;
                this.f38642u = 0;
            }

            /* renamed from: f0 */
            public static C11507b m34319f0() {
                return C11507b.m34357s();
            }

            /* renamed from: g0 */
            public static C11507b m34320g0(c cVar) {
                return m34319f0().mo34096m(cVar);
            }

            /* renamed from: F */
            public C10090b m34330F() {
                return this.f38639r;
            }

            /* renamed from: G */
            public int m34331G() {
                return this.f38641t;
            }

            /* renamed from: H */
            public c m34332H(int i2) {
                return this.f38640s.get(i2);
            }

            /* renamed from: I */
            public int m34333I() {
                return this.f38640s.size();
            }

            /* renamed from: J */
            public List<c> m34334J() {
                return this.f38640s;
            }

            /* renamed from: K */
            public int m34335K() {
                return this.f38637p;
            }

            /* renamed from: M */
            public double m34336M() {
                return this.f38635n;
            }

            /* renamed from: N */
            public int m34337N() {
                return this.f38638q;
            }

            /* renamed from: O */
            public int m34338O() {
                return this.f38642u;
            }

            /* renamed from: P */
            public float m34339P() {
                return this.f38634m;
            }

            /* renamed from: Q */
            public long m34340Q() {
                return this.f38633l;
            }

            /* renamed from: R */
            public int m34341R() {
                return this.f38636o;
            }

            /* renamed from: S */
            public EnumC11508c m34342S() {
                return this.f38632k;
            }

            /* renamed from: T */
            public boolean m34343T() {
                return (this.f38631j & 128) == 128;
            }

            /* renamed from: U */
            public boolean m34344U() {
                return (this.f38631j & 256) == 256;
            }

            /* renamed from: V */
            public boolean m34345V() {
                return (this.f38631j & 32) == 32;
            }

            /* renamed from: X */
            public boolean m34346X() {
                return (this.f38631j & 8) == 8;
            }

            /* renamed from: Y */
            public boolean m34347Y() {
                return (this.f38631j & 64) == 64;
            }

            /* renamed from: Z */
            public boolean m34348Z() {
                return (this.f38631j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
            }

            /* renamed from: a0 */
            public boolean m34349a0() {
                return (this.f38631j & 4) == 4;
            }

            /* renamed from: b0 */
            public boolean m34350b0() {
                return (this.f38631j & 2) == 2;
            }

            /* renamed from: c0 */
            public boolean m34351c0() {
                return (this.f38631j & 16) == 16;
            }

            /* renamed from: d0 */
            public boolean m34352d0() {
                return (this.f38631j & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            /* renamed from: e */
            public int mo34078e() {
                int i2 = this.f38644w;
                if (i2 != -1) {
                    return i2;
                }
                int m38182h = (this.f38631j & 1) == 1 ? CodedOutputStream.m38182h(1, this.f38632k.mo34235f()) + 0 : 0;
                if ((this.f38631j & 2) == 2) {
                    m38182h += CodedOutputStream.m38165A(2, this.f38633l);
                }
                if ((this.f38631j & 4) == 4) {
                    m38182h += CodedOutputStream.m38186l(3, this.f38634m);
                }
                if ((this.f38631j & 8) == 8) {
                    m38182h += CodedOutputStream.m38180f(4, this.f38635n);
                }
                if ((this.f38631j & 16) == 16) {
                    m38182h += CodedOutputStream.m38189o(5, this.f38636o);
                }
                if ((this.f38631j & 32) == 32) {
                    m38182h += CodedOutputStream.m38189o(6, this.f38637p);
                }
                if ((this.f38631j & 64) == 64) {
                    m38182h += CodedOutputStream.m38189o(7, this.f38638q);
                }
                if ((this.f38631j & 128) == 128) {
                    m38182h += CodedOutputStream.m38193s(8, this.f38639r);
                }
                for (int i3 = 0; i3 < this.f38640s.size(); i3++) {
                    m38182h += CodedOutputStream.m38193s(9, this.f38640s.get(i3));
                }
                if ((this.f38631j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    m38182h += CodedOutputStream.m38189o(10, this.f38642u);
                }
                if ((this.f38631j & 256) == 256) {
                    m38182h += CodedOutputStream.m38189o(11, this.f38641t);
                }
                int size = m38182h + this.f38630i.size();
                this.f38644w = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            /* renamed from: g */
            public InterfaceC10725q<c> mo34080g() {
                return f38629h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            /* renamed from: h */
            public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
                mo34078e();
                if ((this.f38631j & 1) == 1) {
                    codedOutputStream.m38209S(1, this.f38632k.mo34235f());
                }
                if ((this.f38631j & 2) == 2) {
                    codedOutputStream.m38236t0(2, this.f38633l);
                }
                if ((this.f38631j & 4) == 4) {
                    codedOutputStream.m38213W(3, this.f38634m);
                }
                if ((this.f38631j & 8) == 8) {
                    codedOutputStream.m38207Q(4, this.f38635n);
                }
                if ((this.f38631j & 16) == 16) {
                    codedOutputStream.m38217a0(5, this.f38636o);
                }
                if ((this.f38631j & 32) == 32) {
                    codedOutputStream.m38217a0(6, this.f38637p);
                }
                if ((this.f38631j & 64) == 64) {
                    codedOutputStream.m38217a0(7, this.f38638q);
                }
                if ((this.f38631j & 128) == 128) {
                    codedOutputStream.m38220d0(8, this.f38639r);
                }
                for (int i2 = 0; i2 < this.f38640s.size(); i2++) {
                    codedOutputStream.m38220d0(9, this.f38640s.get(i2));
                }
                if ((this.f38631j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    codedOutputStream.m38217a0(10, this.f38642u);
                }
                if ((this.f38631j & 256) == 256) {
                    codedOutputStream.m38217a0(11, this.f38641t);
                }
                codedOutputStream.m38225i0(this.f38630i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            /* renamed from: h0, reason: merged with bridge method [inline-methods] */
            public C11507b mo34079f() {
                return m34319f0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public C11507b mo34077d() {
                return m34320g0(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
            public final boolean isInitialized() {
                byte b2 = this.f38643v;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (m34343T() && !m34330F().isInitialized()) {
                    this.f38643v = (byte) 0;
                    return false;
                }
                for (int i2 = 0; i2 < m34333I(); i2++) {
                    if (!m34332H(i2).isInitialized()) {
                        this.f38643v = (byte) 0;
                        return false;
                    }
                }
                this.f38643v = (byte) 1;
                return true;
            }

            private c(AbstractC10716h.b bVar) {
                super(bVar);
                this.f38643v = (byte) -1;
                this.f38644w = -1;
                this.f38630i = bVar.m38391l();
            }

            private c(boolean z) {
                this.f38643v = (byte) -1;
                this.f38644w = -1;
                this.f38630i = AbstractC10712d.f41263f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
                this.f38643v = (byte) -1;
                this.f38644w = -1;
                m34318e0();
                AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
                CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
                boolean z = false;
                int i2 = 0;
                while (true) {
                    ?? r5 = 256;
                    if (!z) {
                        try {
                            try {
                                int m38320K = c10713e.m38320K();
                                switch (m38320K) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        int m38334n = c10713e.m38334n();
                                        EnumC11508c m34375g = EnumC11508c.m34375g(m38334n);
                                        if (m34375g == null) {
                                            m38173J.m38231o0(m38320K);
                                            m38173J.m38231o0(m38334n);
                                        } else {
                                            this.f38631j |= 1;
                                            this.f38632k = m34375g;
                                        }
                                    case 16:
                                        this.f38631j |= 2;
                                        this.f38633l = c10713e.m38317H();
                                    case 29:
                                        this.f38631j |= 4;
                                        this.f38634m = c10713e.m38337q();
                                    case 33:
                                        this.f38631j |= 8;
                                        this.f38635n = c10713e.m38333m();
                                    case 40:
                                        this.f38631j |= 16;
                                        this.f38636o = c10713e.m38339s();
                                    case 48:
                                        this.f38631j |= 32;
                                        this.f38637p = c10713e.m38339s();
                                    case 56:
                                        this.f38631j |= 64;
                                        this.f38638q = c10713e.m38339s();
                                    case 66:
                                        c mo34077d = (this.f38631j & 128) == 128 ? this.f38639r.mo34077d() : null;
                                        C10090b c10090b = (C10090b) c10713e.m38341u(C10090b.f38610h, c10714f);
                                        this.f38639r = c10090b;
                                        if (mo34077d != null) {
                                            mo34077d.mo34096m(c10090b);
                                            this.f38639r = mo34077d.m34383q();
                                        }
                                        this.f38631j |= 128;
                                    case 74:
                                        if ((i2 & 256) != 256) {
                                            this.f38640s = new ArrayList();
                                            i2 |= 256;
                                        }
                                        this.f38640s.add(c10713e.m38341u(f38629h, c10714f));
                                    case 80:
                                        this.f38631j |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                        this.f38642u = c10713e.m38339s();
                                    case 88:
                                        this.f38631j |= 256;
                                        this.f38641t = c10713e.m38339s();
                                    default:
                                        r5 = mo38390p(c10713e, m38173J, c10714f, m38320K);
                                        if (r5 == 0) {
                                            z = true;
                                        }
                                }
                            } catch (InvalidProtocolBufferException e2) {
                                throw e2.m38253i(this);
                            } catch (IOException e3) {
                                throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                            }
                        } catch (Throwable th) {
                            if ((i2 & 256) == r5) {
                                this.f38640s = Collections.unmodifiableList(this.f38640s);
                            }
                            try {
                                m38173J.m38201I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f38630i = m38280w.m38299e();
                                throw th2;
                            }
                            this.f38630i = m38280w.m38299e();
                            mo38389m();
                            throw th;
                        }
                    } else {
                        if ((i2 & 256) == 256) {
                            this.f38640s = Collections.unmodifiableList(this.f38640s);
                        }
                        try {
                            m38173J.m38201I();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f38630i = m38280w.m38299e();
                            throw th3;
                        }
                        this.f38630i = m38280w.m38299e();
                        mo38389m();
                        return;
                    }
                }
            }
        }

        private b(AbstractC10716h.b bVar) {
            super(bVar);
            this.f38623m = (byte) -1;
            this.f38624n = -1;
            this.f38619i = bVar.m38391l();
        }

        private b(boolean z) {
            this.f38623m = (byte) -1;
            this.f38624n = -1;
            this.f38619i = AbstractC10712d.f41263f;
        }

        private b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            this.f38623m = (byte) -1;
            this.f38624n = -1;
            m34287A();
            AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
            CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int m38320K = c10713e.m38320K();
                            if (m38320K != 0) {
                                if (m38320K == 8) {
                                    this.f38620j |= 1;
                                    this.f38621k = c10713e.m38339s();
                                } else if (m38320K != 18) {
                                    if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                    }
                                } else {
                                    c.C11507b mo34077d = (this.f38620j & 2) == 2 ? this.f38622l.mo34077d() : null;
                                    c cVar = (c) c10713e.m38341u(c.f38629h, c10714f);
                                    this.f38622l = cVar;
                                    if (mo34077d != null) {
                                        mo34077d.mo34096m(cVar);
                                        this.f38622l = mo34077d.m34371q();
                                    }
                                    this.f38620j |= 2;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.m38253i(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                    }
                } catch (Throwable th) {
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38619i = m38280w.m38299e();
                        throw th2;
                    }
                    this.f38619i = m38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                m38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38619i = m38280w.m38299e();
                throw th3;
            }
            this.f38619i = m38280w.m38299e();
            mo38389m();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.b$c */
    public static final class c extends AbstractC10716h.b<C10090b, c> implements InterfaceC10724p {

        /* renamed from: g */
        private int f38673g;

        /* renamed from: h */
        private int f38674h;

        /* renamed from: i */
        private List<b> f38675i = Collections.emptyList();

        private c() {
            m34380u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static c m34378s() {
            return new c();
        }

        /* renamed from: t */
        private void m34379t() {
            if ((this.f38673g & 2) != 2) {
                this.f38675i = new ArrayList(this.f38675i);
                this.f38673g |= 2;
            }
        }

        /* renamed from: u */
        private void m34380u() {
        }

        /* renamed from: A */
        public c m34381A(int i2) {
            this.f38673g |= 1;
            this.f38674h = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10090b mo34093c() {
            C10090b m34383q = m34383q();
            if (m34383q.isInitialized()) {
                return m34383q;
            }
            throw AbstractC10709a.a.m38257j(m34383q);
        }

        /* renamed from: q */
        public C10090b m34383q() {
            C10090b c10090b = new C10090b(this);
            int i2 = (this.f38673g & 1) != 1 ? 0 : 1;
            c10090b.f38613k = this.f38674h;
            if ((this.f38673g & 2) == 2) {
                this.f38675i = Collections.unmodifiableList(this.f38675i);
                this.f38673g &= -3;
            }
            c10090b.f38614l = this.f38675i;
            c10090b.f38612j = i2;
            return c10090b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public c mo34095k() {
            return m34378s().mo34096m(m34383q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo34096m(C10090b c10090b) {
            if (c10090b == C10090b.m34278z()) {
                return this;
            }
            if (c10090b.m34280B()) {
                m34381A(c10090b.m34279A());
            }
            if (!c10090b.f38614l.isEmpty()) {
                if (this.f38675i.isEmpty()) {
                    this.f38675i = c10090b.f38614l;
                    this.f38673g &= -3;
                } else {
                    m34379t();
                    this.f38675i.addAll(c10090b.f38614l);
                }
            }
            m38392n(m38391l().m38286f(c10090b.f38611i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.c mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.b> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.f38610h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.b r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.mo34096m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m38252a()     // Catch: java.lang.Throwable -> Lf
                kotlin.f0.y.e.j0.e.b r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10090b) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo34096m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10090b.c.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.b$c");
        }
    }

    static {
        C10090b c10090b = new C10090b(true);
        f38609g = c10090b;
        c10090b.m34270C();
    }

    /* renamed from: C */
    private void m34270C() {
        this.f38613k = 0;
        this.f38614l = Collections.emptyList();
    }

    /* renamed from: D */
    public static c m34271D() {
        return c.m34378s();
    }

    /* renamed from: E */
    public static c m34272E(C10090b c10090b) {
        return m34271D().mo34096m(c10090b);
    }

    /* renamed from: z */
    public static C10090b m34278z() {
        return f38609g;
    }

    /* renamed from: A */
    public int m34279A() {
        return this.f38613k;
    }

    /* renamed from: B */
    public boolean m34280B() {
        return (this.f38612j & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public c mo34079f() {
        return m34271D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public c mo34077d() {
        return m34272E(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38616n;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f38612j & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38613k) + 0 : 0;
        for (int i3 = 0; i3 < this.f38614l.size(); i3++) {
            m38189o += CodedOutputStream.m38193s(2, this.f38614l.get(i3));
        }
        int size = m38189o + this.f38611i.size();
        this.f38616n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10090b> mo34080g() {
        return f38610h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        if ((this.f38612j & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38613k);
        }
        for (int i2 = 0; i2 < this.f38614l.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38614l.get(i2));
        }
        codedOutputStream.m38225i0(this.f38611i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38615m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m34280B()) {
            this.f38615m = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34284x(); i2++) {
            if (!m34283w(i2).isInitialized()) {
                this.f38615m = (byte) 0;
                return false;
            }
        }
        this.f38615m = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public b m34283w(int i2) {
        return this.f38614l.get(i2);
    }

    /* renamed from: x */
    public int m34284x() {
        return this.f38614l.size();
    }

    /* renamed from: y */
    public List<b> m34285y() {
        return this.f38614l;
    }

    private C10090b(AbstractC10716h.b bVar) {
        super(bVar);
        this.f38615m = (byte) -1;
        this.f38616n = -1;
        this.f38611i = bVar.m38391l();
    }

    private C10090b(boolean z) {
        this.f38615m = (byte) -1;
        this.f38616n = -1;
        this.f38611i = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10090b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38615m = (byte) -1;
        this.f38616n = -1;
        m34270C();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int m38320K = c10713e.m38320K();
                    if (m38320K != 0) {
                        if (m38320K == 8) {
                            this.f38612j |= 1;
                            this.f38613k = c10713e.m38339s();
                        } else if (m38320K != 18) {
                            if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                            }
                        } else {
                            if ((i2 & 2) != 2) {
                                this.f38614l = new ArrayList();
                                i2 |= 2;
                            }
                            this.f38614l.add(c10713e.m38341u(b.f38618h, c10714f));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i2 & 2) == 2) {
                        this.f38614l = Collections.unmodifiableList(this.f38614l);
                    }
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38611i = m38280w.m38299e();
                        throw th2;
                    }
                    this.f38611i = m38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2.m38253i(this);
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
            }
        }
        if ((i2 & 2) == 2) {
            this.f38614l = Collections.unmodifiableList(this.f38614l);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38611i = m38280w.m38299e();
            throw th3;
        }
        this.f38611i = m38280w.m38299e();
        mo38389m();
    }
}
