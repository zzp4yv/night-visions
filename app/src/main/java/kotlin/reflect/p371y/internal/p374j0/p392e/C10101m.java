package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10710b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10713e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10103o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10104p;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.m */
/* loaded from: classes3.dex */
public final class C10101m extends AbstractC10716h.d<C10101m> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10101m f38898h;

    /* renamed from: i */
    public static InterfaceC10725q<C10101m> f38899i = new a();

    /* renamed from: j */
    private final AbstractC10712d f38900j;

    /* renamed from: k */
    private int f38901k;

    /* renamed from: l */
    private C10104p f38902l;

    /* renamed from: m */
    private C10103o f38903m;

    /* renamed from: n */
    private C10100l f38904n;

    /* renamed from: o */
    private List<C10091c> f38905o;

    /* renamed from: p */
    private byte f38906p;

    /* renamed from: q */
    private int f38907q;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.m$a */
    static class a extends AbstractC10710b<C10101m> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10101m mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10101m(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.m$b */
    public static final class b extends AbstractC10716h.c<C10101m, b> implements InterfaceC10724p {

        /* renamed from: i */
        private int f38908i;

        /* renamed from: j */
        private C10104p f38909j = C10104p.m34987u();

        /* renamed from: k */
        private C10103o f38910k = C10103o.m34935u();

        /* renamed from: l */
        private C10100l f38911l = C10100l.m34782K();

        /* renamed from: m */
        private List<C10091c> f38912m = Collections.emptyList();

        private b() {
            m34843B();
        }

        /* renamed from: A */
        private void m34842A() {
            if ((this.f38908i & 8) != 8) {
                this.f38912m = new ArrayList(this.f38912m);
                this.f38908i |= 8;
            }
        }

        /* renamed from: B */
        private void m34843B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34845w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10101m c10101m) {
            if (c10101m == C10101m.m34824K()) {
                return this;
            }
            if (c10101m.m34838R()) {
                m34850G(c10101m.m34835O());
            }
            if (c10101m.m34837Q()) {
                m34849F(c10101m.m34834N());
            }
            if (c10101m.m34836P()) {
                m34848E(c10101m.m34833M());
            }
            if (!c10101m.f38905o.isEmpty()) {
                if (this.f38912m.isEmpty()) {
                    this.f38912m = c10101m.f38905o;
                    this.f38908i &= -9;
                } else {
                    m34842A();
                    this.f38912m.addAll(c10101m.f38905o);
                }
            }
            m38396r(c10101m);
            m38392n(m38391l().m38286f(c10101m.f38900j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10101m.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.m> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10101m.f38899i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.m r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10101m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.m r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10101m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10101m.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.m$b");
        }

        /* renamed from: E */
        public b m34848E(C10100l c10100l) {
            if ((this.f38908i & 4) != 4 || this.f38911l == C10100l.m34782K()) {
                this.f38911l = c10100l;
            } else {
                this.f38911l = C10100l.m34785c0(this.f38911l).mo34096m(c10100l).m34815u();
            }
            this.f38908i |= 4;
            return this;
        }

        /* renamed from: F */
        public b m34849F(C10103o c10103o) {
            if ((this.f38908i & 2) != 2 || this.f38910k == C10103o.m34935u()) {
                this.f38910k = c10103o;
            } else {
                this.f38910k = C10103o.m34938z(this.f38910k).mo34096m(c10103o).m34949q();
            }
            this.f38908i |= 2;
            return this;
        }

        /* renamed from: G */
        public b m34850G(C10104p c10104p) {
            if ((this.f38908i & 1) != 1 || this.f38909j == C10104p.m34987u()) {
                this.f38909j = c10104p;
            } else {
                this.f38909j = C10104p.m34990z(this.f38909j).mo34096m(c10104p).m35001q();
            }
            this.f38908i |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10101m mo34093c() {
            C10101m m34852u = m34852u();
            if (m34852u.isInitialized()) {
                return m34852u;
            }
            throw AbstractC10709a.a.m38257j(m34852u);
        }

        /* renamed from: u */
        public C10101m m34852u() {
            C10101m c10101m = new C10101m(this);
            int i2 = this.f38908i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10101m.f38902l = this.f38909j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10101m.f38903m = this.f38910k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10101m.f38904n = this.f38911l;
            if ((this.f38908i & 8) == 8) {
                this.f38912m = Collections.unmodifiableList(this.f38912m);
                this.f38908i &= -9;
            }
            c10101m.f38905o = this.f38912m;
            c10101m.f38901k = i3;
            return c10101m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34845w().mo34096m(m34852u());
        }
    }

    static {
        C10101m c10101m = new C10101m(true);
        f38898h = c10101m;
        c10101m.m34825S();
    }

    /* renamed from: K */
    public static C10101m m34824K() {
        return f38898h;
    }

    /* renamed from: S */
    private void m34825S() {
        this.f38902l = C10104p.m34987u();
        this.f38903m = C10103o.m34935u();
        this.f38904n = C10100l.m34782K();
        this.f38905o = Collections.emptyList();
    }

    /* renamed from: T */
    public static b m34826T() {
        return b.m34845w();
    }

    /* renamed from: U */
    public static b m34827U(C10101m c10101m) {
        return m34826T().mo34096m(c10101m);
    }

    /* renamed from: X */
    public static C10101m m34828X(InputStream inputStream, C10714f c10714f) throws IOException {
        return f38899i.mo38260a(inputStream, c10714f);
    }

    /* renamed from: H */
    public C10091c m34829H(int i2) {
        return this.f38905o.get(i2);
    }

    /* renamed from: I */
    public int m34830I() {
        return this.f38905o.size();
    }

    /* renamed from: J */
    public List<C10091c> m34831J() {
        return this.f38905o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C10101m mo34461b() {
        return f38898h;
    }

    /* renamed from: M */
    public C10100l m34833M() {
        return this.f38904n;
    }

    /* renamed from: N */
    public C10103o m34834N() {
        return this.f38903m;
    }

    /* renamed from: O */
    public C10104p m34835O() {
        return this.f38902l;
    }

    /* renamed from: P */
    public boolean m34836P() {
        return (this.f38901k & 4) == 4;
    }

    /* renamed from: Q */
    public boolean m34837Q() {
        return (this.f38901k & 2) == 2;
    }

    /* renamed from: R */
    public boolean m34838R() {
        return (this.f38901k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34826T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34827U(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38907q;
        if (i2 != -1) {
            return i2;
        }
        int m38193s = (this.f38901k & 1) == 1 ? CodedOutputStream.m38193s(1, this.f38902l) + 0 : 0;
        if ((this.f38901k & 2) == 2) {
            m38193s += CodedOutputStream.m38193s(2, this.f38903m);
        }
        if ((this.f38901k & 4) == 4) {
            m38193s += CodedOutputStream.m38193s(3, this.f38904n);
        }
        for (int i3 = 0; i3 < this.f38905o.size(); i3++) {
            m38193s += CodedOutputStream.m38193s(4, this.f38905o.get(i3));
        }
        int m38400t = m38193s + m38400t() + this.f38900j.size();
        this.f38907q = m38400t;
        return m38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10101m> mo34080g() {
        return f38899i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        if ((this.f38901k & 1) == 1) {
            codedOutputStream.m38220d0(1, this.f38902l);
        }
        if ((this.f38901k & 2) == 2) {
            codedOutputStream.m38220d0(2, this.f38903m);
        }
        if ((this.f38901k & 4) == 4) {
            codedOutputStream.m38220d0(3, this.f38904n);
        }
        for (int i2 = 0; i2 < this.f38905o.size(); i2++) {
            codedOutputStream.m38220d0(4, this.f38905o.get(i2));
        }
        m38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f38900j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38906p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (m34837Q() && !m34834N().isInitialized()) {
            this.f38906p = (byte) 0;
            return false;
        }
        if (m34836P() && !m34833M().isInitialized()) {
            this.f38906p = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34830I(); i2++) {
            if (!m34829H(i2).isInitialized()) {
                this.f38906p = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f38906p = (byte) 1;
            return true;
        }
        this.f38906p = (byte) 0;
        return false;
    }

    private C10101m(AbstractC10716h.c<C10101m, ?> cVar) {
        super(cVar);
        this.f38906p = (byte) -1;
        this.f38907q = -1;
        this.f38900j = cVar.m38391l();
    }

    private C10101m(boolean z) {
        this.f38906p = (byte) -1;
        this.f38907q = -1;
        this.f38900j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10101m(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38906p = (byte) -1;
        this.f38907q = -1;
        m34825S();
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
                            if (m38320K == 10) {
                                C10104p.b mo34077d = (this.f38901k & 1) == 1 ? this.f38902l.mo34077d() : null;
                                C10104p c10104p = (C10104p) c10713e.m38341u(C10104p.f38977h, c10714f);
                                this.f38902l = c10104p;
                                if (mo34077d != null) {
                                    mo34077d.mo34096m(c10104p);
                                    this.f38902l = mo34077d.m35001q();
                                }
                                this.f38901k |= 1;
                            } else if (m38320K == 18) {
                                C10103o.b mo34077d2 = (this.f38901k & 2) == 2 ? this.f38903m.mo34077d() : null;
                                C10103o c10103o = (C10103o) c10713e.m38341u(C10103o.f38950h, c10714f);
                                this.f38903m = c10103o;
                                if (mo34077d2 != null) {
                                    mo34077d2.mo34096m(c10103o);
                                    this.f38903m = mo34077d2.m34949q();
                                }
                                this.f38901k |= 2;
                            } else if (m38320K == 26) {
                                C10100l.b mo34077d3 = (this.f38901k & 4) == 4 ? this.f38904n.mo34077d() : null;
                                C10100l c10100l = (C10100l) c10713e.m38341u(C10100l.f38882i, c10714f);
                                this.f38904n = c10100l;
                                if (mo34077d3 != null) {
                                    mo34077d3.mo34096m(c10100l);
                                    this.f38904n = mo34077d3.m34815u();
                                }
                                this.f38901k |= 4;
                            } else if (m38320K != 34) {
                                if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                }
                            } else {
                                if ((i2 & 8) != 8) {
                                    this.f38905o = new ArrayList();
                                    i2 |= 8;
                                }
                                this.f38905o.add(c10713e.m38341u(C10091c.f38677i, c10714f));
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
                if ((i2 & 8) == 8) {
                    this.f38905o = Collections.unmodifiableList(this.f38905o);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38900j = m38280w.m38299e();
                    throw th2;
                }
                this.f38900j = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 8) == 8) {
            this.f38905o = Collections.unmodifiableList(this.f38905o);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38900j = m38280w.m38299e();
            throw th3;
        }
        this.f38900j = m38280w.m38299e();
        mo38389m();
    }
}
