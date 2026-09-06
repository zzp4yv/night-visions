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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.h */
/* loaded from: classes3.dex */
public final class C10096h extends AbstractC10716h implements InterfaceC10724p {

    /* renamed from: g */
    private static final C10096h f38804g;

    /* renamed from: h */
    public static InterfaceC10725q<C10096h> f38805h = new a();

    /* renamed from: i */
    private final AbstractC10712d f38806i;

    /* renamed from: j */
    private int f38807j;

    /* renamed from: k */
    private int f38808k;

    /* renamed from: l */
    private int f38809l;

    /* renamed from: m */
    private c f38810m;

    /* renamed from: n */
    private C10105q f38811n;

    /* renamed from: o */
    private int f38812o;

    /* renamed from: p */
    private List<C10096h> f38813p;

    /* renamed from: q */
    private List<C10096h> f38814q;

    /* renamed from: r */
    private byte f38815r;

    /* renamed from: s */
    private int f38816s;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.h$a */
    static class a extends AbstractC10710b<C10096h> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10096h mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10096h(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.h$b */
    public static final class b extends AbstractC10716h.b<C10096h, b> implements InterfaceC10724p {

        /* renamed from: g */
        private int f38817g;

        /* renamed from: h */
        private int f38818h;

        /* renamed from: i */
        private int f38819i;

        /* renamed from: l */
        private int f38822l;

        /* renamed from: j */
        private c f38820j = c.TRUE;

        /* renamed from: k */
        private C10105q f38821k = C10105q.m35022Y();

        /* renamed from: m */
        private List<C10096h> f38823m = Collections.emptyList();

        /* renamed from: n */
        private List<C10096h> f38824n = Collections.emptyList();

        private b() {
            m34674v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34671s() {
            return new b();
        }

        /* renamed from: t */
        private void m34672t() {
            if ((this.f38817g & 32) != 32) {
                this.f38823m = new ArrayList(this.f38823m);
                this.f38817g |= 32;
            }
        }

        /* renamed from: u */
        private void m34673u() {
            if ((this.f38817g & 64) != 64) {
                this.f38824n = new ArrayList(this.f38824n);
                this.f38817g |= 64;
            }
        }

        /* renamed from: v */
        private void m34674v() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10096h.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.h> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10096h.f38805h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.h r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10096h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.h r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10096h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10096h.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.h$b");
        }

        /* renamed from: B */
        public b m34676B(C10105q c10105q) {
            if ((this.f38817g & 8) != 8 || this.f38821k == C10105q.m35022Y()) {
                this.f38821k = c10105q;
            } else {
                this.f38821k = C10105q.m35025z0(this.f38821k).mo34096m(c10105q).m35110u();
            }
            this.f38817g |= 8;
            return this;
        }

        /* renamed from: C */
        public b m34677C(c cVar) {
            cVar.getClass();
            this.f38817g |= 4;
            this.f38820j = cVar;
            return this;
        }

        /* renamed from: D */
        public b m34678D(int i2) {
            this.f38817g |= 1;
            this.f38818h = i2;
            return this;
        }

        /* renamed from: E */
        public b m34679E(int i2) {
            this.f38817g |= 16;
            this.f38822l = i2;
            return this;
        }

        /* renamed from: F */
        public b m34680F(int i2) {
            this.f38817g |= 2;
            this.f38819i = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10096h mo34093c() {
            C10096h m34682q = m34682q();
            if (m34682q.isInitialized()) {
                return m34682q;
            }
            throw AbstractC10709a.a.m38257j(m34682q);
        }

        /* renamed from: q */
        public C10096h m34682q() {
            C10096h c10096h = new C10096h(this);
            int i2 = this.f38817g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10096h.f38808k = this.f38818h;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10096h.f38809l = this.f38819i;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10096h.f38810m = this.f38820j;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10096h.f38811n = this.f38821k;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            c10096h.f38812o = this.f38822l;
            if ((this.f38817g & 32) == 32) {
                this.f38823m = Collections.unmodifiableList(this.f38823m);
                this.f38817g &= -33;
            }
            c10096h.f38813p = this.f38823m;
            if ((this.f38817g & 64) == 64) {
                this.f38824n = Collections.unmodifiableList(this.f38824n);
                this.f38817g &= -65;
            }
            c10096h.f38814q = this.f38824n;
            c10096h.f38807j = i3;
            return c10096h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34671s().mo34096m(m34682q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10096h c10096h) {
            if (c10096h == C10096h.m34640F()) {
                return this;
            }
            if (c10096h.m34663N()) {
                m34678D(c10096h.m34656G());
            }
            if (c10096h.m34666Q()) {
                m34680F(c10096h.m34661L());
            }
            if (c10096h.m34662M()) {
                m34677C(c10096h.m34655E());
            }
            if (c10096h.m34664O()) {
                m34676B(c10096h.m34657H());
            }
            if (c10096h.m34665P()) {
                m34679E(c10096h.m34658I());
            }
            if (!c10096h.f38813p.isEmpty()) {
                if (this.f38823m.isEmpty()) {
                    this.f38823m = c10096h.f38813p;
                    this.f38817g &= -33;
                } else {
                    m34672t();
                    this.f38823m.addAll(c10096h.f38813p);
                }
            }
            if (!c10096h.f38814q.isEmpty()) {
                if (this.f38824n.isEmpty()) {
                    this.f38824n = c10096h.f38814q;
                    this.f38817g &= -65;
                } else {
                    m34673u();
                    this.f38824n.addAll(c10096h.f38814q);
                }
            }
            m38392n(m38391l().m38286f(c10096h.f38806i));
            return this;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.h$c */
    public enum c implements C10717i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* renamed from: i */
        private static C10717i.b<c> f38828i = new a();

        /* renamed from: k */
        private final int f38830k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.h$c$a */
        static class a implements C10717i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m34685g(i2);
            }
        }

        c(int i2, int i3) {
            this.f38830k = i3;
        }

        /* renamed from: g */
        public static c m34685g(int i2) {
            if (i2 == 0) {
                return TRUE;
            }
            if (i2 == 1) {
                return FALSE;
            }
            if (i2 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38830k;
        }
    }

    static {
        C10096h c10096h = new C10096h(true);
        f38804g = c10096h;
        c10096h.m34641R();
    }

    /* renamed from: F */
    public static C10096h m34640F() {
        return f38804g;
    }

    /* renamed from: R */
    private void m34641R() {
        this.f38808k = 0;
        this.f38809l = 0;
        this.f38810m = c.TRUE;
        this.f38811n = C10105q.m35022Y();
        this.f38812o = 0;
        this.f38813p = Collections.emptyList();
        this.f38814q = Collections.emptyList();
    }

    /* renamed from: S */
    public static b m34642S() {
        return b.m34671s();
    }

    /* renamed from: T */
    public static b m34643T(C10096h c10096h) {
        return m34642S().mo34096m(c10096h);
    }

    /* renamed from: C */
    public C10096h m34653C(int i2) {
        return this.f38813p.get(i2);
    }

    /* renamed from: D */
    public int m34654D() {
        return this.f38813p.size();
    }

    /* renamed from: E */
    public c m34655E() {
        return this.f38810m;
    }

    /* renamed from: G */
    public int m34656G() {
        return this.f38808k;
    }

    /* renamed from: H */
    public C10105q m34657H() {
        return this.f38811n;
    }

    /* renamed from: I */
    public int m34658I() {
        return this.f38812o;
    }

    /* renamed from: J */
    public C10096h m34659J(int i2) {
        return this.f38814q.get(i2);
    }

    /* renamed from: K */
    public int m34660K() {
        return this.f38814q.size();
    }

    /* renamed from: L */
    public int m34661L() {
        return this.f38809l;
    }

    /* renamed from: M */
    public boolean m34662M() {
        return (this.f38807j & 4) == 4;
    }

    /* renamed from: N */
    public boolean m34663N() {
        return (this.f38807j & 1) == 1;
    }

    /* renamed from: O */
    public boolean m34664O() {
        return (this.f38807j & 8) == 8;
    }

    /* renamed from: P */
    public boolean m34665P() {
        return (this.f38807j & 16) == 16;
    }

    /* renamed from: Q */
    public boolean m34666Q() {
        return (this.f38807j & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34642S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34643T(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38816s;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f38807j & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38808k) + 0 : 0;
        if ((this.f38807j & 2) == 2) {
            m38189o += CodedOutputStream.m38189o(2, this.f38809l);
        }
        if ((this.f38807j & 4) == 4) {
            m38189o += CodedOutputStream.m38182h(3, this.f38810m.mo34235f());
        }
        if ((this.f38807j & 8) == 8) {
            m38189o += CodedOutputStream.m38193s(4, this.f38811n);
        }
        if ((this.f38807j & 16) == 16) {
            m38189o += CodedOutputStream.m38189o(5, this.f38812o);
        }
        for (int i3 = 0; i3 < this.f38813p.size(); i3++) {
            m38189o += CodedOutputStream.m38193s(6, this.f38813p.get(i3));
        }
        for (int i4 = 0; i4 < this.f38814q.size(); i4++) {
            m38189o += CodedOutputStream.m38193s(7, this.f38814q.get(i4));
        }
        int size = m38189o + this.f38806i.size();
        this.f38816s = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10096h> mo34080g() {
        return f38805h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        if ((this.f38807j & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38808k);
        }
        if ((this.f38807j & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f38809l);
        }
        if ((this.f38807j & 4) == 4) {
            codedOutputStream.m38209S(3, this.f38810m.mo34235f());
        }
        if ((this.f38807j & 8) == 8) {
            codedOutputStream.m38220d0(4, this.f38811n);
        }
        if ((this.f38807j & 16) == 16) {
            codedOutputStream.m38217a0(5, this.f38812o);
        }
        for (int i2 = 0; i2 < this.f38813p.size(); i2++) {
            codedOutputStream.m38220d0(6, this.f38813p.get(i2));
        }
        for (int i3 = 0; i3 < this.f38814q.size(); i3++) {
            codedOutputStream.m38220d0(7, this.f38814q.get(i3));
        }
        codedOutputStream.m38225i0(this.f38806i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38815r;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (m34664O() && !m34657H().isInitialized()) {
            this.f38815r = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34654D(); i2++) {
            if (!m34653C(i2).isInitialized()) {
                this.f38815r = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m34660K(); i3++) {
            if (!m34659J(i3).isInitialized()) {
                this.f38815r = (byte) 0;
                return false;
            }
        }
        this.f38815r = (byte) 1;
        return true;
    }

    private C10096h(AbstractC10716h.b bVar) {
        super(bVar);
        this.f38815r = (byte) -1;
        this.f38816s = -1;
        this.f38806i = bVar.m38391l();
    }

    private C10096h(boolean z) {
        this.f38815r = (byte) -1;
        this.f38816s = -1;
        this.f38806i = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10096h(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38815r = (byte) -1;
        this.f38816s = -1;
        m34641R();
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
                            this.f38807j |= 1;
                            this.f38808k = c10713e.m38339s();
                        } else if (m38320K == 16) {
                            this.f38807j |= 2;
                            this.f38809l = c10713e.m38339s();
                        } else if (m38320K == 24) {
                            int m38334n = c10713e.m38334n();
                            c m34685g = c.m34685g(m38334n);
                            if (m34685g == null) {
                                m38173J.m38231o0(m38320K);
                                m38173J.m38231o0(m38334n);
                            } else {
                                this.f38807j |= 4;
                                this.f38810m = m34685g;
                            }
                        } else if (m38320K == 34) {
                            C10105q.c mo34077d = (this.f38807j & 8) == 8 ? this.f38811n.mo34077d() : null;
                            C10105q c10105q = (C10105q) c10713e.m38341u(C10105q.f38985i, c10714f);
                            this.f38811n = c10105q;
                            if (mo34077d != null) {
                                mo34077d.mo34096m(c10105q);
                                this.f38811n = mo34077d.m35110u();
                            }
                            this.f38807j |= 8;
                        } else if (m38320K == 40) {
                            this.f38807j |= 16;
                            this.f38812o = c10713e.m38339s();
                        } else if (m38320K == 50) {
                            if ((i2 & 32) != 32) {
                                this.f38813p = new ArrayList();
                                i2 |= 32;
                            }
                            this.f38813p.add(c10713e.m38341u(f38805h, c10714f));
                        } else if (m38320K != 58) {
                            if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                            }
                        } else {
                            if ((i2 & 64) != 64) {
                                this.f38814q = new ArrayList();
                                i2 |= 64;
                            }
                            this.f38814q.add(c10713e.m38341u(f38805h, c10714f));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.m38253i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                if ((i2 & 32) == 32) {
                    this.f38813p = Collections.unmodifiableList(this.f38813p);
                }
                if ((i2 & 64) == 64) {
                    this.f38814q = Collections.unmodifiableList(this.f38814q);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38806i = m38280w.m38299e();
                    throw th2;
                }
                this.f38806i = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 32) == 32) {
            this.f38813p = Collections.unmodifiableList(this.f38813p);
        }
        if ((i2 & 64) == 64) {
            this.f38814q = Collections.unmodifiableList(this.f38814q);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38806i = m38280w.m38299e();
            throw th3;
        }
        this.f38806i = m38280w.m38299e();
        mo38389m();
    }
}
