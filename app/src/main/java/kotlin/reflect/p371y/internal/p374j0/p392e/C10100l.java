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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10111w;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.l */
/* loaded from: classes3.dex */
public final class C10100l extends AbstractC10716h.d<C10100l> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10100l f38881h;

    /* renamed from: i */
    public static InterfaceC10725q<C10100l> f38882i = new a();

    /* renamed from: j */
    private final AbstractC10712d f38883j;

    /* renamed from: k */
    private int f38884k;

    /* renamed from: l */
    private List<C10097i> f38885l;

    /* renamed from: m */
    private List<C10102n> f38886m;

    /* renamed from: n */
    private List<C10106r> f38887n;

    /* renamed from: o */
    private C10108t f38888o;

    /* renamed from: p */
    private C10111w f38889p;

    /* renamed from: q */
    private byte f38890q;

    /* renamed from: r */
    private int f38891r;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.l$a */
    static class a extends AbstractC10710b<C10100l> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10100l mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10100l(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.l$b */
    public static final class b extends AbstractC10716h.c<C10100l, b> implements InterfaceC10724p {

        /* renamed from: i */
        private int f38892i;

        /* renamed from: j */
        private List<C10097i> f38893j = Collections.emptyList();

        /* renamed from: k */
        private List<C10102n> f38894k = Collections.emptyList();

        /* renamed from: l */
        private List<C10106r> f38895l = Collections.emptyList();

        /* renamed from: m */
        private C10108t f38896m = C10108t.m35225w();

        /* renamed from: n */
        private C10111w f38897n = C10111w.m35334u();

        private b() {
            m34807D();
        }

        /* renamed from: A */
        private void m34804A() {
            if ((this.f38892i & 1) != 1) {
                this.f38893j = new ArrayList(this.f38893j);
                this.f38892i |= 1;
            }
        }

        /* renamed from: B */
        private void m34805B() {
            if ((this.f38892i & 2) != 2) {
                this.f38894k = new ArrayList(this.f38894k);
                this.f38892i |= 2;
            }
        }

        /* renamed from: C */
        private void m34806C() {
            if ((this.f38892i & 4) != 4) {
                this.f38895l = new ArrayList(this.f38895l);
                this.f38892i |= 4;
            }
        }

        /* renamed from: D */
        private void m34807D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34809w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10100l c10100l) {
            if (c10100l == C10100l.m34782K()) {
                return this;
            }
            if (!c10100l.f38885l.isEmpty()) {
                if (this.f38893j.isEmpty()) {
                    this.f38893j = c10100l.f38885l;
                    this.f38892i &= -2;
                } else {
                    m34804A();
                    this.f38893j.addAll(c10100l.f38885l);
                }
            }
            if (!c10100l.f38886m.isEmpty()) {
                if (this.f38894k.isEmpty()) {
                    this.f38894k = c10100l.f38886m;
                    this.f38892i &= -3;
                } else {
                    m34805B();
                    this.f38894k.addAll(c10100l.f38886m);
                }
            }
            if (!c10100l.f38887n.isEmpty()) {
                if (this.f38895l.isEmpty()) {
                    this.f38895l = c10100l.f38887n;
                    this.f38892i &= -5;
                } else {
                    m34806C();
                    this.f38895l.addAll(c10100l.f38887n);
                }
            }
            if (c10100l.m34799Y()) {
                m34812G(c10100l.m34797V());
            }
            if (c10100l.m34800Z()) {
                m34813H(c10100l.m34798X());
            }
            m38396r(c10100l);
            m38392n(m38391l().m38286f(c10100l.f38883j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10100l.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.l> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10100l.f38882i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.l r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10100l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.l r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10100l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10100l.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.l$b");
        }

        /* renamed from: G */
        public b m34812G(C10108t c10108t) {
            if ((this.f38892i & 8) != 8 || this.f38896m == C10108t.m35225w()) {
                this.f38896m = c10108t;
            } else {
                this.f38896m = C10108t.m35219E(this.f38896m).mo34096m(c10108t).m35240q();
            }
            this.f38892i |= 8;
            return this;
        }

        /* renamed from: H */
        public b m34813H(C10111w c10111w) {
            if ((this.f38892i & 16) != 16 || this.f38897n == C10111w.m35334u()) {
                this.f38897n = c10111w;
            } else {
                this.f38897n = C10111w.m35337z(this.f38897n).mo34096m(c10111w).m35348q();
            }
            this.f38892i |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10100l mo34093c() {
            C10100l m34815u = m34815u();
            if (m34815u.isInitialized()) {
                return m34815u;
            }
            throw AbstractC10709a.a.m38257j(m34815u);
        }

        /* renamed from: u */
        public C10100l m34815u() {
            C10100l c10100l = new C10100l(this);
            int i2 = this.f38892i;
            if ((i2 & 1) == 1) {
                this.f38893j = Collections.unmodifiableList(this.f38893j);
                this.f38892i &= -2;
            }
            c10100l.f38885l = this.f38893j;
            if ((this.f38892i & 2) == 2) {
                this.f38894k = Collections.unmodifiableList(this.f38894k);
                this.f38892i &= -3;
            }
            c10100l.f38886m = this.f38894k;
            if ((this.f38892i & 4) == 4) {
                this.f38895l = Collections.unmodifiableList(this.f38895l);
                this.f38892i &= -5;
            }
            c10100l.f38887n = this.f38895l;
            int i3 = (i2 & 8) != 8 ? 0 : 1;
            c10100l.f38888o = this.f38896m;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            c10100l.f38889p = this.f38897n;
            c10100l.f38884k = i3;
            return c10100l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34809w().mo34096m(m34815u());
        }
    }

    static {
        C10100l c10100l = new C10100l(true);
        f38881h = c10100l;
        c10100l.m34783a0();
    }

    /* renamed from: K */
    public static C10100l m34782K() {
        return f38881h;
    }

    /* renamed from: a0 */
    private void m34783a0() {
        this.f38885l = Collections.emptyList();
        this.f38886m = Collections.emptyList();
        this.f38887n = Collections.emptyList();
        this.f38888o = C10108t.m35225w();
        this.f38889p = C10111w.m35334u();
    }

    /* renamed from: b0 */
    public static b m34784b0() {
        return b.m34809w();
    }

    /* renamed from: c0 */
    public static b m34785c0(C10100l c10100l) {
        return m34784b0().mo34096m(c10100l);
    }

    /* renamed from: e0 */
    public static C10100l m34786e0(InputStream inputStream, C10714f c10714f) throws IOException {
        return f38882i.mo38260a(inputStream, c10714f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C10100l mo34461b() {
        return f38881h;
    }

    /* renamed from: M */
    public C10097i m34788M(int i2) {
        return this.f38885l.get(i2);
    }

    /* renamed from: N */
    public int m34789N() {
        return this.f38885l.size();
    }

    /* renamed from: O */
    public List<C10097i> m34790O() {
        return this.f38885l;
    }

    /* renamed from: P */
    public C10102n m34791P(int i2) {
        return this.f38886m.get(i2);
    }

    /* renamed from: Q */
    public int m34792Q() {
        return this.f38886m.size();
    }

    /* renamed from: R */
    public List<C10102n> m34793R() {
        return this.f38886m;
    }

    /* renamed from: S */
    public C10106r m34794S(int i2) {
        return this.f38887n.get(i2);
    }

    /* renamed from: T */
    public int m34795T() {
        return this.f38887n.size();
    }

    /* renamed from: U */
    public List<C10106r> m34796U() {
        return this.f38887n;
    }

    /* renamed from: V */
    public C10108t m34797V() {
        return this.f38888o;
    }

    /* renamed from: X */
    public C10111w m34798X() {
        return this.f38889p;
    }

    /* renamed from: Y */
    public boolean m34799Y() {
        return (this.f38884k & 1) == 1;
    }

    /* renamed from: Z */
    public boolean m34800Z() {
        return (this.f38884k & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34784b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38891r;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f38885l.size(); i4++) {
            i3 += CodedOutputStream.m38193s(3, this.f38885l.get(i4));
        }
        for (int i5 = 0; i5 < this.f38886m.size(); i5++) {
            i3 += CodedOutputStream.m38193s(4, this.f38886m.get(i5));
        }
        for (int i6 = 0; i6 < this.f38887n.size(); i6++) {
            i3 += CodedOutputStream.m38193s(5, this.f38887n.get(i6));
        }
        if ((this.f38884k & 1) == 1) {
            i3 += CodedOutputStream.m38193s(30, this.f38888o);
        }
        if ((this.f38884k & 2) == 2) {
            i3 += CodedOutputStream.m38193s(32, this.f38889p);
        }
        int m38400t = i3 + m38400t() + this.f38883j.size();
        this.f38891r = m38400t;
        return m38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34785c0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10100l> mo34080g() {
        return f38882i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        for (int i2 = 0; i2 < this.f38885l.size(); i2++) {
            codedOutputStream.m38220d0(3, this.f38885l.get(i2));
        }
        for (int i3 = 0; i3 < this.f38886m.size(); i3++) {
            codedOutputStream.m38220d0(4, this.f38886m.get(i3));
        }
        for (int i4 = 0; i4 < this.f38887n.size(); i4++) {
            codedOutputStream.m38220d0(5, this.f38887n.get(i4));
        }
        if ((this.f38884k & 1) == 1) {
            codedOutputStream.m38220d0(30, this.f38888o);
        }
        if ((this.f38884k & 2) == 2) {
            codedOutputStream.m38220d0(32, this.f38889p);
        }
        m38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f38883j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38890q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34789N(); i2++) {
            if (!m34788M(i2).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m34792Q(); i3++) {
            if (!m34791P(i3).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m34795T(); i4++) {
            if (!m34794S(i4).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        if (m34799Y() && !m34797V().isInitialized()) {
            this.f38890q = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38890q = (byte) 1;
            return true;
        }
        this.f38890q = (byte) 0;
        return false;
    }

    private C10100l(AbstractC10716h.c<C10100l, ?> cVar) {
        super(cVar);
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        this.f38883j = cVar.m38391l();
    }

    private C10100l(boolean z) {
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        this.f38883j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10100l(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        m34783a0();
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
                            if (m38320K == 26) {
                                if ((i2 & 1) != 1) {
                                    this.f38885l = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f38885l.add(c10713e.m38341u(C10097i.f38832i, c10714f));
                            } else if (m38320K == 34) {
                                if ((i2 & 2) != 2) {
                                    this.f38886m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f38886m.add(c10713e.m38341u(C10102n.f38914i, c10714f));
                            } else if (m38320K != 42) {
                                if (m38320K == 242) {
                                    C10108t.b mo34077d = (this.f38884k & 1) == 1 ? this.f38888o.mo34077d() : null;
                                    C10108t c10108t = (C10108t) c10713e.m38341u(C10108t.f39091h, c10714f);
                                    this.f38888o = c10108t;
                                    if (mo34077d != null) {
                                        mo34077d.mo34096m(c10108t);
                                        this.f38888o = mo34077d.m35240q();
                                    }
                                    this.f38884k |= 1;
                                } else if (m38320K != 258) {
                                    if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                    }
                                } else {
                                    C10111w.b mo34077d2 = (this.f38884k & 2) == 2 ? this.f38889p.mo34077d() : null;
                                    C10111w c10111w = (C10111w) c10713e.m38341u(C10111w.f39152h, c10714f);
                                    this.f38889p = c10111w;
                                    if (mo34077d2 != null) {
                                        mo34077d2.mo34096m(c10111w);
                                        this.f38889p = mo34077d2.m35348q();
                                    }
                                    this.f38884k |= 2;
                                }
                            } else {
                                if ((i2 & 4) != 4) {
                                    this.f38887n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f38887n.add(c10713e.m38341u(C10106r.f39040i, c10714f));
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
                if ((i2 & 1) == 1) {
                    this.f38885l = Collections.unmodifiableList(this.f38885l);
                }
                if ((i2 & 2) == 2) {
                    this.f38886m = Collections.unmodifiableList(this.f38886m);
                }
                if ((i2 & 4) == 4) {
                    this.f38887n = Collections.unmodifiableList(this.f38887n);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38883j = m38280w.m38299e();
                    throw th2;
                }
                this.f38883j = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 1) == 1) {
            this.f38885l = Collections.unmodifiableList(this.f38885l);
        }
        if ((i2 & 2) == 2) {
            this.f38886m = Collections.unmodifiableList(this.f38886m);
        }
        if ((i2 & 4) == 4) {
            this.f38887n = Collections.unmodifiableList(this.f38887n);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38883j = m38280w.m38299e();
            throw th3;
        }
        this.f38883j = m38280w.m38299e();
        mo38389m();
    }
}
