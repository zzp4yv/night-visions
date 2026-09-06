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
/* renamed from: kotlin.f0.y.e.j0.e.e */
/* loaded from: classes3.dex */
public final class C10093e extends AbstractC10716h implements InterfaceC10724p {

    /* renamed from: g */
    private static final C10093e f38760g;

    /* renamed from: h */
    public static InterfaceC10725q<C10093e> f38761h = new a();

    /* renamed from: i */
    private final AbstractC10712d f38762i;

    /* renamed from: j */
    private List<C10094f> f38763j;

    /* renamed from: k */
    private byte f38764k;

    /* renamed from: l */
    private int f38765l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.e$a */
    static class a extends AbstractC10710b<C10093e> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10093e mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10093e(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.e$b */
    public static final class b extends AbstractC10716h.b<C10093e, b> implements InterfaceC10724p {

        /* renamed from: g */
        private int f38766g;

        /* renamed from: h */
        private List<C10094f> f38767h = Collections.emptyList();

        private b() {
            m34572u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34570s() {
            return new b();
        }

        /* renamed from: t */
        private void m34571t() {
            if ((this.f38766g & 1) != 1) {
                this.f38767h = new ArrayList(this.f38767h);
                this.f38766g |= 1;
            }
        }

        /* renamed from: u */
        private void m34572u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10093e mo34093c() {
            C10093e m34574q = m34574q();
            if (m34574q.isInitialized()) {
                return m34574q;
            }
            throw AbstractC10709a.a.m38257j(m34574q);
        }

        /* renamed from: q */
        public C10093e m34574q() {
            C10093e c10093e = new C10093e(this);
            if ((this.f38766g & 1) == 1) {
                this.f38767h = Collections.unmodifiableList(this.f38767h);
                this.f38766g &= -2;
            }
            c10093e.f38763j = this.f38767h;
            return c10093e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34570s().mo34096m(m34574q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10093e c10093e) {
            if (c10093e == C10093e.m34560u()) {
                return this;
            }
            if (!c10093e.f38763j.isEmpty()) {
                if (this.f38767h.isEmpty()) {
                    this.f38767h = c10093e.f38763j;
                    this.f38766g &= -2;
                } else {
                    m34571t();
                    this.f38767h.addAll(c10093e.f38763j);
                }
            }
            m38392n(m38391l().m38286f(c10093e.f38762i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10093e.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.e> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10093e.f38761h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.e r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10093e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.e r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10093e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10093e.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.e$b");
        }
    }

    static {
        C10093e c10093e = new C10093e(true);
        f38760g = c10093e;
        c10093e.m34561x();
    }

    /* renamed from: u */
    public static C10093e m34560u() {
        return f38760g;
    }

    /* renamed from: x */
    private void m34561x() {
        this.f38763j = Collections.emptyList();
    }

    /* renamed from: y */
    public static b m34562y() {
        return b.m34570s();
    }

    /* renamed from: z */
    public static b m34563z(C10093e c10093e) {
        return m34562y().mo34096m(c10093e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34562y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34563z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38765l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f38763j.size(); i4++) {
            i3 += CodedOutputStream.m38193s(1, this.f38763j.get(i4));
        }
        int size = i3 + this.f38762i.size();
        this.f38765l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10093e> mo34080g() {
        return f38761h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f38763j.size(); i2++) {
            codedOutputStream.m38220d0(1, this.f38763j.get(i2));
        }
        codedOutputStream.m38225i0(this.f38762i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38764k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34567w(); i2++) {
            if (!m34566v(i2).isInitialized()) {
                this.f38764k = (byte) 0;
                return false;
            }
        }
        this.f38764k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public C10094f m34566v(int i2) {
        return this.f38763j.get(i2);
    }

    /* renamed from: w */
    public int m34567w() {
        return this.f38763j.size();
    }

    private C10093e(AbstractC10716h.b bVar) {
        super(bVar);
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        this.f38762i = bVar.m38391l();
    }

    private C10093e(boolean z) {
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        this.f38762i = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10093e(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        m34561x();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m38320K = c10713e.m38320K();
                    if (m38320K != 0) {
                        if (m38320K != 10) {
                            if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f38763j = new ArrayList();
                                z2 |= true;
                            }
                            this.f38763j.add(c10713e.m38341u(C10094f.f38769h, c10714f));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f38763j = Collections.unmodifiableList(this.f38763j);
                    }
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38762i = m38280w.m38299e();
                        throw th2;
                    }
                    this.f38762i = m38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2.m38253i(this);
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
            }
        }
        if (z2 & true) {
            this.f38763j = Collections.unmodifiableList(this.f38763j);
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38762i = m38280w.m38299e();
            throw th3;
        }
        this.f38762i = m38280w.m38299e();
        mo38389m();
    }
}
