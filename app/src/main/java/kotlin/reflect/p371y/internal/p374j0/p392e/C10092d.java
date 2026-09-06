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
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.d */
/* loaded from: classes3.dex */
public final class C10092d extends AbstractC10716h.d<C10092d> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10092d f38747h;

    /* renamed from: i */
    public static InterfaceC10725q<C10092d> f38748i = new a();

    /* renamed from: j */
    private final AbstractC10712d f38749j;

    /* renamed from: k */
    private int f38750k;

    /* renamed from: l */
    private int f38751l;

    /* renamed from: m */
    private List<C10109u> f38752m;

    /* renamed from: n */
    private List<Integer> f38753n;

    /* renamed from: o */
    private byte f38754o;

    /* renamed from: p */
    private int f38755p;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.d$a */
    static class a extends AbstractC10710b<C10092d> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10092d mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10092d(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.d$b */
    public static final class b extends AbstractC10716h.c<C10092d, b> implements InterfaceC10724p {

        /* renamed from: i */
        private int f38756i;

        /* renamed from: j */
        private int f38757j = 6;

        /* renamed from: k */
        private List<C10109u> f38758k = Collections.emptyList();

        /* renamed from: l */
        private List<Integer> f38759l = Collections.emptyList();

        private b() {
            m34548C();
        }

        /* renamed from: A */
        private void m34546A() {
            if ((this.f38756i & 2) != 2) {
                this.f38758k = new ArrayList(this.f38758k);
                this.f38756i |= 2;
            }
        }

        /* renamed from: B */
        private void m34547B() {
            if ((this.f38756i & 4) != 4) {
                this.f38759l = new ArrayList(this.f38759l);
                this.f38756i |= 4;
            }
        }

        /* renamed from: C */
        private void m34548C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34550w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10092d c10092d) {
            if (c10092d == C10092d.m34532H()) {
                return this;
            }
            if (c10092d.m34542O()) {
                m34553F(c10092d.m34537J());
            }
            if (!c10092d.f38752m.isEmpty()) {
                if (this.f38758k.isEmpty()) {
                    this.f38758k = c10092d.f38752m;
                    this.f38756i &= -3;
                } else {
                    m34546A();
                    this.f38758k.addAll(c10092d.f38752m);
                }
            }
            if (!c10092d.f38753n.isEmpty()) {
                if (this.f38759l.isEmpty()) {
                    this.f38759l = c10092d.f38753n;
                    this.f38756i &= -5;
                } else {
                    m34547B();
                    this.f38759l.addAll(c10092d.f38753n);
                }
            }
            m38396r(c10092d);
            m38392n(m38391l().m38286f(c10092d.f38749j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10092d.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.d> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10092d.f38748i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.d r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10092d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.d r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10092d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10092d.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.d$b");
        }

        /* renamed from: F */
        public b m34553F(int i2) {
            this.f38756i |= 1;
            this.f38757j = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10092d mo34093c() {
            C10092d m34555u = m34555u();
            if (m34555u.isInitialized()) {
                return m34555u;
            }
            throw AbstractC10709a.a.m38257j(m34555u);
        }

        /* renamed from: u */
        public C10092d m34555u() {
            C10092d c10092d = new C10092d(this);
            int i2 = (this.f38756i & 1) != 1 ? 0 : 1;
            c10092d.f38751l = this.f38757j;
            if ((this.f38756i & 2) == 2) {
                this.f38758k = Collections.unmodifiableList(this.f38758k);
                this.f38756i &= -3;
            }
            c10092d.f38752m = this.f38758k;
            if ((this.f38756i & 4) == 4) {
                this.f38759l = Collections.unmodifiableList(this.f38759l);
                this.f38756i &= -5;
            }
            c10092d.f38753n = this.f38759l;
            c10092d.f38750k = i2;
            return c10092d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34550w().mo34096m(m34555u());
        }
    }

    static {
        C10092d c10092d = new C10092d(true);
        f38747h = c10092d;
        c10092d.m34533P();
    }

    /* renamed from: H */
    public static C10092d m34532H() {
        return f38747h;
    }

    /* renamed from: P */
    private void m34533P() {
        this.f38751l = 6;
        this.f38752m = Collections.emptyList();
        this.f38753n = Collections.emptyList();
    }

    /* renamed from: Q */
    public static b m34534Q() {
        return b.m34550w();
    }

    /* renamed from: R */
    public static b m34535R(C10092d c10092d) {
        return m34534Q().mo34096m(c10092d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C10092d mo34461b() {
        return f38747h;
    }

    /* renamed from: J */
    public int m34537J() {
        return this.f38751l;
    }

    /* renamed from: K */
    public C10109u m34538K(int i2) {
        return this.f38752m.get(i2);
    }

    /* renamed from: L */
    public int m34539L() {
        return this.f38752m.size();
    }

    /* renamed from: M */
    public List<C10109u> m34540M() {
        return this.f38752m;
    }

    /* renamed from: N */
    public List<Integer> m34541N() {
        return this.f38753n;
    }

    /* renamed from: O */
    public boolean m34542O() {
        return (this.f38750k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34534Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34535R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38755p;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f38750k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38751l) + 0 : 0;
        for (int i3 = 0; i3 < this.f38752m.size(); i3++) {
            m38189o += CodedOutputStream.m38193s(2, this.f38752m.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f38753n.size(); i5++) {
            i4 += CodedOutputStream.m38190p(this.f38753n.get(i5).intValue());
        }
        int size = m38189o + i4 + (m34541N().size() * 2) + m38400t() + this.f38749j.size();
        this.f38755p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10092d> mo34080g() {
        return f38748i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        if ((this.f38750k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38751l);
        }
        for (int i2 = 0; i2 < this.f38752m.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38752m.get(i2));
        }
        for (int i3 = 0; i3 < this.f38753n.size(); i3++) {
            codedOutputStream.m38217a0(31, this.f38753n.get(i3).intValue());
        }
        m38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38749j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38754o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34539L(); i2++) {
            if (!m34538K(i2).isInitialized()) {
                this.f38754o = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f38754o = (byte) 1;
            return true;
        }
        this.f38754o = (byte) 0;
        return false;
    }

    private C10092d(AbstractC10716h.c<C10092d, ?> cVar) {
        super(cVar);
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        this.f38749j = cVar.m38391l();
    }

    private C10092d(boolean z) {
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        this.f38749j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10092d(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        m34533P();
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
                                this.f38750k |= 1;
                                this.f38751l = c10713e.m38339s();
                            } else if (m38320K == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f38752m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f38752m.add(c10713e.m38341u(C10109u.f39102i, c10714f));
                            } else if (m38320K == 248) {
                                if ((i2 & 4) != 4) {
                                    this.f38753n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f38753n.add(Integer.valueOf(c10713e.m38339s()));
                            } else if (m38320K != 250) {
                                if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                }
                            } else {
                                int m38330j = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 4) != 4 && c10713e.m38327e() > 0) {
                                    this.f38753n = new ArrayList();
                                    i2 |= 4;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38753n.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j);
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
                if ((i2 & 2) == 2) {
                    this.f38752m = Collections.unmodifiableList(this.f38752m);
                }
                if ((i2 & 4) == 4) {
                    this.f38753n = Collections.unmodifiableList(this.f38753n);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38749j = m38280w.m38299e();
                    throw th2;
                }
                this.f38749j = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 2) == 2) {
            this.f38752m = Collections.unmodifiableList(this.f38752m);
        }
        if ((i2 & 4) == 4) {
            this.f38753n = Collections.unmodifiableList(this.f38753n);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38749j = m38280w.m38299e();
            throw th3;
        }
        this.f38749j = m38280w.m38299e();
        mo38389m();
    }
}
