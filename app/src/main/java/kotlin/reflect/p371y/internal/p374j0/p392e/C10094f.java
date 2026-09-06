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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10096h;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.f */
/* loaded from: classes3.dex */
public final class C10094f extends AbstractC10716h implements InterfaceC10724p {

    /* renamed from: g */
    private static final C10094f f38768g;

    /* renamed from: h */
    public static InterfaceC10725q<C10094f> f38769h = new a();

    /* renamed from: i */
    private final AbstractC10712d f38770i;

    /* renamed from: j */
    private int f38771j;

    /* renamed from: k */
    private c f38772k;

    /* renamed from: l */
    private List<C10096h> f38773l;

    /* renamed from: m */
    private C10096h f38774m;

    /* renamed from: n */
    private d f38775n;

    /* renamed from: o */
    private byte f38776o;

    /* renamed from: p */
    private int f38777p;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$a */
    static class a extends AbstractC10710b<C10094f> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10094f mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10094f(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$b */
    public static final class b extends AbstractC10716h.b<C10094f, b> implements InterfaceC10724p {

        /* renamed from: g */
        private int f38778g;

        /* renamed from: h */
        private c f38779h = c.RETURNS_CONSTANT;

        /* renamed from: i */
        private List<C10096h> f38780i = Collections.emptyList();

        /* renamed from: j */
        private C10096h f38781j = C10096h.m34640F();

        /* renamed from: k */
        private d f38782k = d.AT_MOST_ONCE;

        private b() {
            m34603u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34601s() {
            return new b();
        }

        /* renamed from: t */
        private void m34602t() {
            if ((this.f38778g & 2) != 2) {
                this.f38780i = new ArrayList(this.f38780i);
                this.f38778g |= 2;
            }
        }

        /* renamed from: u */
        private void m34603u() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10094f.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.f> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10094f.f38769h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.f r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10094f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.f r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10094f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10094f.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.f$b");
        }

        /* renamed from: B */
        public b m34605B(c cVar) {
            cVar.getClass();
            this.f38778g |= 1;
            this.f38779h = cVar;
            return this;
        }

        /* renamed from: C */
        public b m34606C(d dVar) {
            dVar.getClass();
            this.f38778g |= 8;
            this.f38782k = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10094f mo34093c() {
            C10094f m34608q = m34608q();
            if (m34608q.isInitialized()) {
                return m34608q;
            }
            throw AbstractC10709a.a.m38257j(m34608q);
        }

        /* renamed from: q */
        public C10094f m34608q() {
            C10094f c10094f = new C10094f(this);
            int i2 = this.f38778g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10094f.f38772k = this.f38779h;
            if ((this.f38778g & 2) == 2) {
                this.f38780i = Collections.unmodifiableList(this.f38780i);
                this.f38778g &= -3;
            }
            c10094f.f38773l = this.f38780i;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            c10094f.f38774m = this.f38781j;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            c10094f.f38775n = this.f38782k;
            c10094f.f38771j = i3;
            return c10094f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34601s().mo34096m(m34608q());
        }

        /* renamed from: v */
        public b m34610v(C10096h c10096h) {
            if ((this.f38778g & 4) != 4 || this.f38781j == C10096h.m34640F()) {
                this.f38781j = c10096h;
            } else {
                this.f38781j = C10096h.m34643T(this.f38781j).mo34096m(c10096h).m34682q();
            }
            this.f38778g |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10094f c10094f) {
            if (c10094f == C10094f.m34588z()) {
                return this;
            }
            if (c10094f.m34594F()) {
                m34605B(c10094f.m34591C());
            }
            if (!c10094f.f38773l.isEmpty()) {
                if (this.f38780i.isEmpty()) {
                    this.f38780i = c10094f.f38773l;
                    this.f38778g &= -3;
                } else {
                    m34602t();
                    this.f38780i.addAll(c10094f.f38773l);
                }
            }
            if (c10094f.m34593E()) {
                m34610v(c10094f.m34598y());
            }
            if (c10094f.m34595G()) {
                m34606C(c10094f.m34592D());
            }
            m38392n(m38391l().m38286f(c10094f.f38770i));
            return this;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$c */
    public enum c implements C10717i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* renamed from: i */
        private static C10717i.b<c> f38786i = new a();

        /* renamed from: k */
        private final int f38788k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.f$c$a */
        static class a implements C10717i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m34612g(i2);
            }
        }

        c(int i2, int i3) {
            this.f38788k = i3;
        }

        /* renamed from: g */
        public static c m34612g(int i2) {
            if (i2 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i2 == 1) {
                return CALLS;
            }
            if (i2 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38788k;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$d */
    public enum d implements C10717i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* renamed from: i */
        private static C10717i.b<d> f38792i = new a();

        /* renamed from: k */
        private final int f38794k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.f$d$a */
        static class a implements C10717i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo34236a(int i2) {
                return d.m34614g(i2);
            }
        }

        d(int i2, int i3) {
            this.f38794k = i3;
        }

        /* renamed from: g */
        public static d m34614g(int i2) {
            if (i2 == 0) {
                return AT_MOST_ONCE;
            }
            if (i2 == 1) {
                return EXACTLY_ONCE;
            }
            if (i2 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38794k;
        }
    }

    static {
        C10094f c10094f = new C10094f(true);
        f38768g = c10094f;
        c10094f.m34578H();
    }

    /* renamed from: H */
    private void m34578H() {
        this.f38772k = c.RETURNS_CONSTANT;
        this.f38773l = Collections.emptyList();
        this.f38774m = C10096h.m34640F();
        this.f38775n = d.AT_MOST_ONCE;
    }

    /* renamed from: I */
    public static b m34579I() {
        return b.m34601s();
    }

    /* renamed from: J */
    public static b m34580J(C10094f c10094f) {
        return m34579I().mo34096m(c10094f);
    }

    /* renamed from: z */
    public static C10094f m34588z() {
        return f38768g;
    }

    /* renamed from: A */
    public C10096h m34589A(int i2) {
        return this.f38773l.get(i2);
    }

    /* renamed from: B */
    public int m34590B() {
        return this.f38773l.size();
    }

    /* renamed from: C */
    public c m34591C() {
        return this.f38772k;
    }

    /* renamed from: D */
    public d m34592D() {
        return this.f38775n;
    }

    /* renamed from: E */
    public boolean m34593E() {
        return (this.f38771j & 2) == 2;
    }

    /* renamed from: F */
    public boolean m34594F() {
        return (this.f38771j & 1) == 1;
    }

    /* renamed from: G */
    public boolean m34595G() {
        return (this.f38771j & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34579I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34580J(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38777p;
        if (i2 != -1) {
            return i2;
        }
        int m38182h = (this.f38771j & 1) == 1 ? CodedOutputStream.m38182h(1, this.f38772k.mo34235f()) + 0 : 0;
        for (int i3 = 0; i3 < this.f38773l.size(); i3++) {
            m38182h += CodedOutputStream.m38193s(2, this.f38773l.get(i3));
        }
        if ((this.f38771j & 2) == 2) {
            m38182h += CodedOutputStream.m38193s(3, this.f38774m);
        }
        if ((this.f38771j & 4) == 4) {
            m38182h += CodedOutputStream.m38182h(4, this.f38775n.mo34235f());
        }
        int size = m38182h + this.f38770i.size();
        this.f38777p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10094f> mo34080g() {
        return f38769h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        if ((this.f38771j & 1) == 1) {
            codedOutputStream.m38209S(1, this.f38772k.mo34235f());
        }
        for (int i2 = 0; i2 < this.f38773l.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38773l.get(i2));
        }
        if ((this.f38771j & 2) == 2) {
            codedOutputStream.m38220d0(3, this.f38774m);
        }
        if ((this.f38771j & 4) == 4) {
            codedOutputStream.m38209S(4, this.f38775n.mo34235f());
        }
        codedOutputStream.m38225i0(this.f38770i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38776o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34590B(); i2++) {
            if (!m34589A(i2).isInitialized()) {
                this.f38776o = (byte) 0;
                return false;
            }
        }
        if (!m34593E() || m34598y().isInitialized()) {
            this.f38776o = (byte) 1;
            return true;
        }
        this.f38776o = (byte) 0;
        return false;
    }

    /* renamed from: y */
    public C10096h m34598y() {
        return this.f38774m;
    }

    private C10094f(AbstractC10716h.b bVar) {
        super(bVar);
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        this.f38770i = bVar.m38391l();
    }

    private C10094f(boolean z) {
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        this.f38770i = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10094f(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        m34578H();
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
                            int m38334n = c10713e.m38334n();
                            c m34612g = c.m34612g(m38334n);
                            if (m34612g == null) {
                                m38173J.m38231o0(m38320K);
                                m38173J.m38231o0(m38334n);
                            } else {
                                this.f38771j |= 1;
                                this.f38772k = m34612g;
                            }
                        } else if (m38320K == 18) {
                            if ((i2 & 2) != 2) {
                                this.f38773l = new ArrayList();
                                i2 |= 2;
                            }
                            this.f38773l.add(c10713e.m38341u(C10096h.f38805h, c10714f));
                        } else if (m38320K == 26) {
                            C10096h.b mo34077d = (this.f38771j & 2) == 2 ? this.f38774m.mo34077d() : null;
                            C10096h c10096h = (C10096h) c10713e.m38341u(C10096h.f38805h, c10714f);
                            this.f38774m = c10096h;
                            if (mo34077d != null) {
                                mo34077d.mo34096m(c10096h);
                                this.f38774m = mo34077d.m34682q();
                            }
                            this.f38771j |= 2;
                        } else if (m38320K != 32) {
                            if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                            }
                        } else {
                            int m38334n2 = c10713e.m38334n();
                            d m34614g = d.m34614g(m38334n2);
                            if (m34614g == null) {
                                m38173J.m38231o0(m38320K);
                                m38173J.m38231o0(m38334n2);
                            } else {
                                this.f38771j |= 4;
                                this.f38775n = m34614g;
                            }
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i2 & 2) == 2) {
                        this.f38773l = Collections.unmodifiableList(this.f38773l);
                    }
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38770i = m38280w.m38299e();
                        throw th2;
                    }
                    this.f38770i = m38280w.m38299e();
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
            this.f38773l = Collections.unmodifiableList(this.f38773l);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38770i = m38280w.m38299e();
            throw th3;
        }
        this.f38770i = m38280w.m38299e();
        mo38389m();
    }
}
