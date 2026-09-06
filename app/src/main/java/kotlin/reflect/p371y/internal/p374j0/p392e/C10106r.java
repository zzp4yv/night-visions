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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.r */
/* loaded from: classes3.dex */
public final class C10106r extends AbstractC10716h.d<C10106r> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10106r f39039h;

    /* renamed from: i */
    public static InterfaceC10725q<C10106r> f39040i = new a();

    /* renamed from: j */
    private final AbstractC10712d f39041j;

    /* renamed from: k */
    private int f39042k;

    /* renamed from: l */
    private int f39043l;

    /* renamed from: m */
    private int f39044m;

    /* renamed from: n */
    private List<C10107s> f39045n;

    /* renamed from: o */
    private C10105q f39046o;

    /* renamed from: p */
    private int f39047p;

    /* renamed from: q */
    private C10105q f39048q;

    /* renamed from: r */
    private int f39049r;

    /* renamed from: s */
    private List<C10090b> f39050s;

    /* renamed from: t */
    private List<Integer> f39051t;

    /* renamed from: u */
    private byte f39052u;

    /* renamed from: v */
    private int f39053v;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.r$a */
    static class a extends AbstractC10710b<C10106r> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10106r mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10106r(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.r$b */
    public static final class b extends AbstractC10716h.c<C10106r, b> implements InterfaceC10724p {

        /* renamed from: i */
        private int f39054i;

        /* renamed from: k */
        private int f39056k;

        /* renamed from: n */
        private int f39059n;

        /* renamed from: p */
        private int f39061p;

        /* renamed from: j */
        private int f39055j = 6;

        /* renamed from: l */
        private List<C10107s> f39057l = Collections.emptyList();

        /* renamed from: m */
        private C10105q f39058m = C10105q.m35022Y();

        /* renamed from: o */
        private C10105q f39060o = C10105q.m35022Y();

        /* renamed from: q */
        private List<C10090b> f39062q = Collections.emptyList();

        /* renamed from: r */
        private List<Integer> f39063r = Collections.emptyList();

        private b() {
            m35157D();
        }

        /* renamed from: A */
        private void m35154A() {
            if ((this.f39054i & 128) != 128) {
                this.f39062q = new ArrayList(this.f39062q);
                this.f39054i |= 128;
            }
        }

        /* renamed from: B */
        private void m35155B() {
            if ((this.f39054i & 4) != 4) {
                this.f39057l = new ArrayList(this.f39057l);
                this.f39054i |= 4;
            }
        }

        /* renamed from: C */
        private void m35156C() {
            if ((this.f39054i & 256) != 256) {
                this.f39063r = new ArrayList(this.f39063r);
                this.f39054i |= 256;
            }
        }

        /* renamed from: D */
        private void m35157D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m35159w() {
            return new b();
        }

        /* renamed from: E */
        public b m35160E(C10105q c10105q) {
            if ((this.f39054i & 32) != 32 || this.f39060o == C10105q.m35022Y()) {
                this.f39060o = c10105q;
            } else {
                this.f39060o = C10105q.m35025z0(this.f39060o).mo34096m(c10105q).m35110u();
            }
            this.f39054i |= 32;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10106r c10106r) {
            if (c10106r == C10106r.m35126R()) {
                return this;
            }
            if (c10106r.m35147g0()) {
                m35165J(c10106r.m35137V());
            }
            if (c10106r.m35148h0()) {
                m35166K(c10106r.m35138X());
            }
            if (!c10106r.f39045n.isEmpty()) {
                if (this.f39057l.isEmpty()) {
                    this.f39057l = c10106r.f39045n;
                    this.f39054i &= -5;
                } else {
                    m35155B();
                    this.f39057l.addAll(c10106r.f39045n);
                }
            }
            if (c10106r.m35149i0()) {
                m35163H(c10106r.m35142b0());
            }
            if (c10106r.m35150j0()) {
                m35167L(c10106r.m35143c0());
            }
            if (c10106r.m35145e0()) {
                m35160E(c10106r.m35135T());
            }
            if (c10106r.m35146f0()) {
                m35164I(c10106r.m35136U());
            }
            if (!c10106r.f39050s.isEmpty()) {
                if (this.f39062q.isEmpty()) {
                    this.f39062q = c10106r.f39050s;
                    this.f39054i &= -129;
                } else {
                    m35154A();
                    this.f39062q.addAll(c10106r.f39050s);
                }
            }
            if (!c10106r.f39051t.isEmpty()) {
                if (this.f39063r.isEmpty()) {
                    this.f39063r = c10106r.f39051t;
                    this.f39054i &= -257;
                } else {
                    m35156C();
                    this.f39063r.addAll(c10106r.f39051t);
                }
            }
            m38396r(c10106r);
            m38392n(m38391l().m38286f(c10106r.f39041j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10106r.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.r> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10106r.f39040i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.r r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10106r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.r r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10106r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10106r.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.r$b");
        }

        /* renamed from: H */
        public b m35163H(C10105q c10105q) {
            if ((this.f39054i & 8) != 8 || this.f39058m == C10105q.m35022Y()) {
                this.f39058m = c10105q;
            } else {
                this.f39058m = C10105q.m35025z0(this.f39058m).mo34096m(c10105q).m35110u();
            }
            this.f39054i |= 8;
            return this;
        }

        /* renamed from: I */
        public b m35164I(int i2) {
            this.f39054i |= 64;
            this.f39061p = i2;
            return this;
        }

        /* renamed from: J */
        public b m35165J(int i2) {
            this.f39054i |= 1;
            this.f39055j = i2;
            return this;
        }

        /* renamed from: K */
        public b m35166K(int i2) {
            this.f39054i |= 2;
            this.f39056k = i2;
            return this;
        }

        /* renamed from: L */
        public b m35167L(int i2) {
            this.f39054i |= 16;
            this.f39059n = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10106r mo34093c() {
            C10106r m35169u = m35169u();
            if (m35169u.isInitialized()) {
                return m35169u;
            }
            throw AbstractC10709a.a.m38257j(m35169u);
        }

        /* renamed from: u */
        public C10106r m35169u() {
            C10106r c10106r = new C10106r(this);
            int i2 = this.f39054i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10106r.f39043l = this.f39055j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10106r.f39044m = this.f39056k;
            if ((this.f39054i & 4) == 4) {
                this.f39057l = Collections.unmodifiableList(this.f39057l);
                this.f39054i &= -5;
            }
            c10106r.f39045n = this.f39057l;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            c10106r.f39046o = this.f39058m;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            c10106r.f39047p = this.f39059n;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            c10106r.f39048q = this.f39060o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            c10106r.f39049r = this.f39061p;
            if ((this.f39054i & 128) == 128) {
                this.f39062q = Collections.unmodifiableList(this.f39062q);
                this.f39054i &= -129;
            }
            c10106r.f39050s = this.f39062q;
            if ((this.f39054i & 256) == 256) {
                this.f39063r = Collections.unmodifiableList(this.f39063r);
                this.f39054i &= -257;
            }
            c10106r.f39051t = this.f39063r;
            c10106r.f39042k = i3;
            return c10106r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35159w().mo34096m(m35169u());
        }
    }

    static {
        C10106r c10106r = new C10106r(true);
        f39039h = c10106r;
        c10106r.m35127k0();
    }

    /* renamed from: R */
    public static C10106r m35126R() {
        return f39039h;
    }

    /* renamed from: k0 */
    private void m35127k0() {
        this.f39043l = 6;
        this.f39044m = 0;
        this.f39045n = Collections.emptyList();
        this.f39046o = C10105q.m35022Y();
        this.f39047p = 0;
        this.f39048q = C10105q.m35022Y();
        this.f39049r = 0;
        this.f39050s = Collections.emptyList();
        this.f39051t = Collections.emptyList();
    }

    /* renamed from: l0 */
    public static b m35128l0() {
        return b.m35159w();
    }

    /* renamed from: m0 */
    public static b m35129m0(C10106r c10106r) {
        return m35128l0().mo34096m(c10106r);
    }

    /* renamed from: o0 */
    public static C10106r m35130o0(InputStream inputStream, C10714f c10714f) throws IOException {
        return f39040i.mo38261c(inputStream, c10714f);
    }

    /* renamed from: O */
    public C10090b m35131O(int i2) {
        return this.f39050s.get(i2);
    }

    /* renamed from: P */
    public int m35132P() {
        return this.f39050s.size();
    }

    /* renamed from: Q */
    public List<C10090b> m35133Q() {
        return this.f39050s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C10106r mo34461b() {
        return f39039h;
    }

    /* renamed from: T */
    public C10105q m35135T() {
        return this.f39048q;
    }

    /* renamed from: U */
    public int m35136U() {
        return this.f39049r;
    }

    /* renamed from: V */
    public int m35137V() {
        return this.f39043l;
    }

    /* renamed from: X */
    public int m35138X() {
        return this.f39044m;
    }

    /* renamed from: Y */
    public C10107s m35139Y(int i2) {
        return this.f39045n.get(i2);
    }

    /* renamed from: Z */
    public int m35140Z() {
        return this.f39045n.size();
    }

    /* renamed from: a0 */
    public List<C10107s> m35141a0() {
        return this.f39045n;
    }

    /* renamed from: b0 */
    public C10105q m35142b0() {
        return this.f39046o;
    }

    /* renamed from: c0 */
    public int m35143c0() {
        return this.f39047p;
    }

    /* renamed from: d0 */
    public List<Integer> m35144d0() {
        return this.f39051t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39053v;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f39042k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f39043l) + 0 : 0;
        if ((this.f39042k & 2) == 2) {
            m38189o += CodedOutputStream.m38189o(2, this.f39044m);
        }
        for (int i3 = 0; i3 < this.f39045n.size(); i3++) {
            m38189o += CodedOutputStream.m38193s(3, this.f39045n.get(i3));
        }
        if ((this.f39042k & 4) == 4) {
            m38189o += CodedOutputStream.m38193s(4, this.f39046o);
        }
        if ((this.f39042k & 8) == 8) {
            m38189o += CodedOutputStream.m38189o(5, this.f39047p);
        }
        if ((this.f39042k & 16) == 16) {
            m38189o += CodedOutputStream.m38193s(6, this.f39048q);
        }
        if ((this.f39042k & 32) == 32) {
            m38189o += CodedOutputStream.m38189o(7, this.f39049r);
        }
        for (int i4 = 0; i4 < this.f39050s.size(); i4++) {
            m38189o += CodedOutputStream.m38193s(8, this.f39050s.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f39051t.size(); i6++) {
            i5 += CodedOutputStream.m38190p(this.f39051t.get(i6).intValue());
        }
        int size = m38189o + i5 + (m35144d0().size() * 2) + m38400t() + this.f39041j.size();
        this.f39053v = size;
        return size;
    }

    /* renamed from: e0 */
    public boolean m35145e0() {
        return (this.f39042k & 16) == 16;
    }

    /* renamed from: f0 */
    public boolean m35146f0() {
        return (this.f39042k & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10106r> mo34080g() {
        return f39040i;
    }

    /* renamed from: g0 */
    public boolean m35147g0() {
        return (this.f39042k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        if ((this.f39042k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f39043l);
        }
        if ((this.f39042k & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f39044m);
        }
        for (int i2 = 0; i2 < this.f39045n.size(); i2++) {
            codedOutputStream.m38220d0(3, this.f39045n.get(i2));
        }
        if ((this.f39042k & 4) == 4) {
            codedOutputStream.m38220d0(4, this.f39046o);
        }
        if ((this.f39042k & 8) == 8) {
            codedOutputStream.m38217a0(5, this.f39047p);
        }
        if ((this.f39042k & 16) == 16) {
            codedOutputStream.m38220d0(6, this.f39048q);
        }
        if ((this.f39042k & 32) == 32) {
            codedOutputStream.m38217a0(7, this.f39049r);
        }
        for (int i3 = 0; i3 < this.f39050s.size(); i3++) {
            codedOutputStream.m38220d0(8, this.f39050s.get(i3));
        }
        for (int i4 = 0; i4 < this.f39051t.size(); i4++) {
            codedOutputStream.m38217a0(31, this.f39051t.get(i4).intValue());
        }
        m38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f39041j);
    }

    /* renamed from: h0 */
    public boolean m35148h0() {
        return (this.f39042k & 2) == 2;
    }

    /* renamed from: i0 */
    public boolean m35149i0() {
        return (this.f39042k & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f39052u;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m35148h0()) {
            this.f39052u = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m35140Z(); i2++) {
            if (!m35139Y(i2).isInitialized()) {
                this.f39052u = (byte) 0;
                return false;
            }
        }
        if (m35149i0() && !m35142b0().isInitialized()) {
            this.f39052u = (byte) 0;
            return false;
        }
        if (m35145e0() && !m35135T().isInitialized()) {
            this.f39052u = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < m35132P(); i3++) {
            if (!m35131O(i3).isInitialized()) {
                this.f39052u = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f39052u = (byte) 1;
            return true;
        }
        this.f39052u = (byte) 0;
        return false;
    }

    /* renamed from: j0 */
    public boolean m35150j0() {
        return (this.f39042k & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35128l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35129m0(this);
    }

    private C10106r(AbstractC10716h.c<C10106r, ?> cVar) {
        super(cVar);
        this.f39052u = (byte) -1;
        this.f39053v = -1;
        this.f39041j = cVar.m38391l();
    }

    private C10106r(boolean z) {
        this.f39052u = (byte) -1;
        this.f39053v = -1;
        this.f39041j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C10106r(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        C10105q.c mo34077d;
        this.f39052u = (byte) -1;
        this.f39053v = -1;
        m35127k0();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int m38320K = c10713e.m38320K();
                            switch (m38320K) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f39042k |= 1;
                                    this.f39043l = c10713e.m38339s();
                                case 16:
                                    this.f39042k |= 2;
                                    this.f39044m = c10713e.m38339s();
                                case 26:
                                    if ((i2 & 4) != 4) {
                                        this.f39045n = new ArrayList();
                                        i2 |= 4;
                                    }
                                    this.f39045n.add(c10713e.m38341u(C10107s.f39065i, c10714f));
                                case 34:
                                    mo34077d = (this.f39042k & 4) == 4 ? this.f39046o.mo34077d() : null;
                                    C10105q c10105q = (C10105q) c10713e.m38341u(C10105q.f38985i, c10714f);
                                    this.f39046o = c10105q;
                                    if (mo34077d != null) {
                                        mo34077d.mo34096m(c10105q);
                                        this.f39046o = mo34077d.m35110u();
                                    }
                                    this.f39042k |= 4;
                                case 40:
                                    this.f39042k |= 8;
                                    this.f39047p = c10713e.m38339s();
                                case 50:
                                    mo34077d = (this.f39042k & 16) == 16 ? this.f39048q.mo34077d() : null;
                                    C10105q c10105q2 = (C10105q) c10713e.m38341u(C10105q.f38985i, c10714f);
                                    this.f39048q = c10105q2;
                                    if (mo34077d != null) {
                                        mo34077d.mo34096m(c10105q2);
                                        this.f39048q = mo34077d.m35110u();
                                    }
                                    this.f39042k |= 16;
                                case 56:
                                    this.f39042k |= 32;
                                    this.f39049r = c10713e.m38339s();
                                case 66:
                                    if ((i2 & 128) != 128) {
                                        this.f39050s = new ArrayList();
                                        i2 |= 128;
                                    }
                                    this.f39050s.add(c10713e.m38341u(C10090b.f38610h, c10714f));
                                case 248:
                                    if ((i2 & 256) != 256) {
                                        this.f39051t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.f39051t.add(Integer.valueOf(c10713e.m38339s()));
                                case 250:
                                    int m38330j = c10713e.m38330j(c10713e.m38311A());
                                    if ((i2 & 256) != 256 && c10713e.m38327e() > 0) {
                                        this.f39051t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    while (c10713e.m38327e() > 0) {
                                        this.f39051t.add(Integer.valueOf(c10713e.m38339s()));
                                    }
                                    c10713e.m38329i(m38330j);
                                    break;
                                default:
                                    r5 = mo38390p(c10713e, m38173J, c10714f, m38320K);
                                    if (r5 == 0) {
                                        z = true;
                                    }
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).m38253i(this);
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        throw e3.m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 4) == 4) {
                        this.f39045n = Collections.unmodifiableList(this.f39045n);
                    }
                    if ((i2 & 128) == r5) {
                        this.f39050s = Collections.unmodifiableList(this.f39050s);
                    }
                    if ((i2 & 256) == 256) {
                        this.f39051t = Collections.unmodifiableList(this.f39051t);
                    }
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f39041j = m38280w.m38299e();
                        throw th2;
                    }
                    this.f39041j = m38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } else {
                if ((i2 & 4) == 4) {
                    this.f39045n = Collections.unmodifiableList(this.f39045n);
                }
                if ((i2 & 128) == 128) {
                    this.f39050s = Collections.unmodifiableList(this.f39050s);
                }
                if ((i2 & 256) == 256) {
                    this.f39051t = Collections.unmodifiableList(this.f39051t);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f39041j = m38280w.m38299e();
                    throw th3;
                }
                this.f39041j = m38280w.m38299e();
                mo38389m();
                return;
            }
        }
    }
}
