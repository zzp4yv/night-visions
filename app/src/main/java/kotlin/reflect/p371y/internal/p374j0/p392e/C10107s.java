package kotlin.reflect.p371y.internal.p374j0.p392e;

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
/* renamed from: kotlin.f0.y.e.j0.e.s */
/* loaded from: classes3.dex */
public final class C10107s extends AbstractC10716h.d<C10107s> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10107s f39064h;

    /* renamed from: i */
    public static InterfaceC10725q<C10107s> f39065i = new a();

    /* renamed from: j */
    private final AbstractC10712d f39066j;

    /* renamed from: k */
    private int f39067k;

    /* renamed from: l */
    private int f39068l;

    /* renamed from: m */
    private int f39069m;

    /* renamed from: n */
    private boolean f39070n;

    /* renamed from: o */
    private c f39071o;

    /* renamed from: p */
    private List<C10105q> f39072p;

    /* renamed from: q */
    private List<Integer> f39073q;

    /* renamed from: r */
    private int f39074r;

    /* renamed from: s */
    private byte f39075s;

    /* renamed from: t */
    private int f39076t;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$a */
    static class a extends AbstractC10710b<C10107s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10107s mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10107s(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$b */
    public static final class b extends AbstractC10716h.c<C10107s, b> implements InterfaceC10724p {

        /* renamed from: i */
        private int f39077i;

        /* renamed from: j */
        private int f39078j;

        /* renamed from: k */
        private int f39079k;

        /* renamed from: l */
        private boolean f39080l;

        /* renamed from: m */
        private c f39081m = c.INV;

        /* renamed from: n */
        private List<C10105q> f39082n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f39083o = Collections.emptyList();

        private b() {
            m35203C();
        }

        /* renamed from: A */
        private void m35201A() {
            if ((this.f39077i & 32) != 32) {
                this.f39083o = new ArrayList(this.f39083o);
                this.f39077i |= 32;
            }
        }

        /* renamed from: B */
        private void m35202B() {
            if ((this.f39077i & 16) != 16) {
                this.f39082n = new ArrayList(this.f39082n);
                this.f39077i |= 16;
            }
        }

        /* renamed from: C */
        private void m35203C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m35205w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10107s c10107s) {
            if (c10107s == C10107s.m35181K()) {
                return this;
            }
            if (c10107s.m35194U()) {
                m35208F(c10107s.m35186M());
            }
            if (c10107s.m35195V()) {
                m35209G(c10107s.m35187N());
            }
            if (c10107s.m35196X()) {
                m35210H(c10107s.m35188O());
            }
            if (c10107s.m35197Y()) {
                m35211I(c10107s.m35193T());
            }
            if (!c10107s.f39072p.isEmpty()) {
                if (this.f39082n.isEmpty()) {
                    this.f39082n = c10107s.f39072p;
                    this.f39077i &= -17;
                } else {
                    m35202B();
                    this.f39082n.addAll(c10107s.f39072p);
                }
            }
            if (!c10107s.f39073q.isEmpty()) {
                if (this.f39083o.isEmpty()) {
                    this.f39083o = c10107s.f39073q;
                    this.f39077i &= -33;
                } else {
                    m35201A();
                    this.f39083o.addAll(c10107s.f39073q);
                }
            }
            m38396r(c10107s);
            m38392n(m38391l().m38286f(c10107s.f39066j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10107s.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.s> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10107s.f39065i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.s r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10107s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.s r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10107s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10107s.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.s$b");
        }

        /* renamed from: F */
        public b m35208F(int i2) {
            this.f39077i |= 1;
            this.f39078j = i2;
            return this;
        }

        /* renamed from: G */
        public b m35209G(int i2) {
            this.f39077i |= 2;
            this.f39079k = i2;
            return this;
        }

        /* renamed from: H */
        public b m35210H(boolean z) {
            this.f39077i |= 4;
            this.f39080l = z;
            return this;
        }

        /* renamed from: I */
        public b m35211I(c cVar) {
            cVar.getClass();
            this.f39077i |= 8;
            this.f39081m = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10107s mo34093c() {
            C10107s m35213u = m35213u();
            if (m35213u.isInitialized()) {
                return m35213u;
            }
            throw AbstractC10709a.a.m38257j(m35213u);
        }

        /* renamed from: u */
        public C10107s m35213u() {
            C10107s c10107s = new C10107s(this);
            int i2 = this.f39077i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10107s.f39068l = this.f39078j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10107s.f39069m = this.f39079k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10107s.f39070n = this.f39080l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10107s.f39071o = this.f39081m;
            if ((this.f39077i & 16) == 16) {
                this.f39082n = Collections.unmodifiableList(this.f39082n);
                this.f39077i &= -17;
            }
            c10107s.f39072p = this.f39082n;
            if ((this.f39077i & 32) == 32) {
                this.f39083o = Collections.unmodifiableList(this.f39083o);
                this.f39077i &= -33;
            }
            c10107s.f39073q = this.f39083o;
            c10107s.f39067k = i3;
            return c10107s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35205w().mo34096m(m35213u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$c */
    public enum c implements C10717i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* renamed from: i */
        private static C10717i.b<c> f39087i = new a();

        /* renamed from: k */
        private final int f39089k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.s$c$a */
        static class a implements C10717i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m35215g(i2);
            }
        }

        c(int i2, int i3) {
            this.f39089k = i3;
        }

        /* renamed from: g */
        public static c m35215g(int i2) {
            if (i2 == 0) {
                return IN;
            }
            if (i2 == 1) {
                return OUT;
            }
            if (i2 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f39089k;
        }
    }

    static {
        C10107s c10107s = new C10107s(true);
        f39064h = c10107s;
        c10107s.m35182Z();
    }

    /* renamed from: K */
    public static C10107s m35181K() {
        return f39064h;
    }

    /* renamed from: Z */
    private void m35182Z() {
        this.f39068l = 0;
        this.f39069m = 0;
        this.f39070n = false;
        this.f39071o = c.INV;
        this.f39072p = Collections.emptyList();
        this.f39073q = Collections.emptyList();
    }

    /* renamed from: a0 */
    public static b m35183a0() {
        return b.m35205w();
    }

    /* renamed from: b0 */
    public static b m35184b0(C10107s c10107s) {
        return m35183a0().mo34096m(c10107s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C10107s mo34461b() {
        return f39064h;
    }

    /* renamed from: M */
    public int m35186M() {
        return this.f39068l;
    }

    /* renamed from: N */
    public int m35187N() {
        return this.f39069m;
    }

    /* renamed from: O */
    public boolean m35188O() {
        return this.f39070n;
    }

    /* renamed from: P */
    public C10105q m35189P(int i2) {
        return this.f39072p.get(i2);
    }

    /* renamed from: Q */
    public int m35190Q() {
        return this.f39072p.size();
    }

    /* renamed from: R */
    public List<Integer> m35191R() {
        return this.f39073q;
    }

    /* renamed from: S */
    public List<C10105q> m35192S() {
        return this.f39072p;
    }

    /* renamed from: T */
    public c m35193T() {
        return this.f39071o;
    }

    /* renamed from: U */
    public boolean m35194U() {
        return (this.f39067k & 1) == 1;
    }

    /* renamed from: V */
    public boolean m35195V() {
        return (this.f39067k & 2) == 2;
    }

    /* renamed from: X */
    public boolean m35196X() {
        return (this.f39067k & 4) == 4;
    }

    /* renamed from: Y */
    public boolean m35197Y() {
        return (this.f39067k & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35183a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35184b0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39076t;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f39067k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f39068l) + 0 : 0;
        if ((this.f39067k & 2) == 2) {
            m38189o += CodedOutputStream.m38189o(2, this.f39069m);
        }
        if ((this.f39067k & 4) == 4) {
            m38189o += CodedOutputStream.m38175a(3, this.f39070n);
        }
        if ((this.f39067k & 8) == 8) {
            m38189o += CodedOutputStream.m38182h(4, this.f39071o.mo34235f());
        }
        for (int i3 = 0; i3 < this.f39072p.size(); i3++) {
            m38189o += CodedOutputStream.m38193s(5, this.f39072p.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f39073q.size(); i5++) {
            i4 += CodedOutputStream.m38190p(this.f39073q.get(i5).intValue());
        }
        int i6 = m38189o + i4;
        if (!m35191R().isEmpty()) {
            i6 = i6 + 1 + CodedOutputStream.m38190p(i4);
        }
        this.f39074r = i4;
        int m38400t = i6 + m38400t() + this.f39066j.size();
        this.f39076t = m38400t;
        return m38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10107s> mo34080g() {
        return f39065i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        if ((this.f39067k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f39068l);
        }
        if ((this.f39067k & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f39069m);
        }
        if ((this.f39067k & 4) == 4) {
            codedOutputStream.m38202L(3, this.f39070n);
        }
        if ((this.f39067k & 8) == 8) {
            codedOutputStream.m38209S(4, this.f39071o.mo34235f());
        }
        for (int i2 = 0; i2 < this.f39072p.size(); i2++) {
            codedOutputStream.m38220d0(5, this.f39072p.get(i2));
        }
        if (m35191R().size() > 0) {
            codedOutputStream.m38231o0(50);
            codedOutputStream.m38231o0(this.f39074r);
        }
        for (int i3 = 0; i3 < this.f39073q.size(); i3++) {
            codedOutputStream.m38218b0(this.f39073q.get(i3).intValue());
        }
        m38405y.m38406a(1000, codedOutputStream);
        codedOutputStream.m38225i0(this.f39066j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f39075s;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m35194U()) {
            this.f39075s = (byte) 0;
            return false;
        }
        if (!m35195V()) {
            this.f39075s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m35190Q(); i2++) {
            if (!m35189P(i2).isInitialized()) {
                this.f39075s = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f39075s = (byte) 1;
            return true;
        }
        this.f39075s = (byte) 0;
        return false;
    }

    private C10107s(AbstractC10716h.c<C10107s, ?> cVar) {
        super(cVar);
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        this.f39066j = cVar.m38391l();
    }

    private C10107s(boolean z) {
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        this.f39066j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10107s(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        m35182Z();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    try {
                        int m38320K = c10713e.m38320K();
                        if (m38320K != 0) {
                            if (m38320K == 8) {
                                this.f39067k |= 1;
                                this.f39068l = c10713e.m38339s();
                            } else if (m38320K == 16) {
                                this.f39067k |= 2;
                                this.f39069m = c10713e.m38339s();
                            } else if (m38320K == 24) {
                                this.f39067k |= 4;
                                this.f39070n = c10713e.m38331k();
                            } else if (m38320K == 32) {
                                int m38334n = c10713e.m38334n();
                                c m35215g = c.m35215g(m38334n);
                                if (m35215g == null) {
                                    m38173J.m38231o0(m38320K);
                                    m38173J.m38231o0(m38334n);
                                } else {
                                    this.f39067k |= 8;
                                    this.f39071o = m35215g;
                                }
                            } else if (m38320K == 42) {
                                if ((i2 & 16) != 16) {
                                    this.f39072p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f39072p.add(c10713e.m38341u(C10105q.f38985i, c10714f));
                            } else if (m38320K == 48) {
                                if ((i2 & 32) != 32) {
                                    this.f39073q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f39073q.add(Integer.valueOf(c10713e.m38339s()));
                            } else if (m38320K != 50) {
                                if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                }
                            } else {
                                int m38330j = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 32) != 32 && c10713e.m38327e() > 0) {
                                    this.f39073q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f39073q.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j);
                            }
                        }
                        z = true;
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).m38253i(this);
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw e3.m38253i(this);
                }
            } catch (Throwable th) {
                if ((i2 & 16) == 16) {
                    this.f39072p = Collections.unmodifiableList(this.f39072p);
                }
                if ((i2 & 32) == 32) {
                    this.f39073q = Collections.unmodifiableList(this.f39073q);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39066j = m38280w.m38299e();
                    throw th2;
                }
                this.f39066j = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 16) == 16) {
            this.f39072p = Collections.unmodifiableList(this.f39072p);
        }
        if ((i2 & 32) == 32) {
            this.f39073q = Collections.unmodifiableList(this.f39073q);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39066j = m38280w.m38299e();
            throw th3;
        }
        this.f39066j = m38280w.m38299e();
        mo38389m();
    }
}
