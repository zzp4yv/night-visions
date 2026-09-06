package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10710b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10713e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10720l;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10726r;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.p */
/* loaded from: classes3.dex */
public final class C10104p extends AbstractC10716h implements InterfaceC10724p {

    /* renamed from: g */
    private static final C10104p f38976g;

    /* renamed from: h */
    public static InterfaceC10725q<C10104p> f38977h = new a();

    /* renamed from: i */
    private final AbstractC10712d f38978i;

    /* renamed from: j */
    private InterfaceC10721m f38979j;

    /* renamed from: k */
    private byte f38980k;

    /* renamed from: l */
    private int f38981l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.p$a */
    static class a extends AbstractC10710b<C10104p> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10104p mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10104p(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.p$b */
    public static final class b extends AbstractC10716h.b<C10104p, b> implements InterfaceC10724p {

        /* renamed from: g */
        private int f38982g;

        /* renamed from: h */
        private InterfaceC10721m f38983h = C10720l.f41323f;

        private b() {
            m34999u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34997s() {
            return new b();
        }

        /* renamed from: t */
        private void m34998t() {
            if ((this.f38982g & 1) != 1) {
                this.f38983h = new C10720l(this.f38983h);
                this.f38982g |= 1;
            }
        }

        /* renamed from: u */
        private void m34999u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10104p mo34093c() {
            C10104p m35001q = m35001q();
            if (m35001q.isInitialized()) {
                return m35001q;
            }
            throw AbstractC10709a.a.m38257j(m35001q);
        }

        /* renamed from: q */
        public C10104p m35001q() {
            C10104p c10104p = new C10104p(this);
            if ((this.f38982g & 1) == 1) {
                this.f38983h = this.f38983h.mo38431k();
                this.f38982g &= -2;
            }
            c10104p.f38979j = this.f38983h;
            return c10104p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34997s().mo34096m(m35001q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10104p c10104p) {
            if (c10104p == C10104p.m34987u()) {
                return this;
            }
            if (!c10104p.f38979j.isEmpty()) {
                if (this.f38983h.isEmpty()) {
                    this.f38983h = c10104p.f38979j;
                    this.f38982g &= -2;
                } else {
                    m34998t();
                    this.f38983h.addAll(c10104p.f38979j);
                }
            }
            m38392n(m38391l().m38286f(c10104p.f38978i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10104p.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.p> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10104p.f38977h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.p r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10104p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.p r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10104p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10104p.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.p$b");
        }
    }

    static {
        C10104p c10104p = new C10104p(true);
        f38976g = c10104p;
        c10104p.m34988x();
    }

    /* renamed from: u */
    public static C10104p m34987u() {
        return f38976g;
    }

    /* renamed from: x */
    private void m34988x() {
        this.f38979j = C10720l.f41323f;
    }

    /* renamed from: y */
    public static b m34989y() {
        return b.m34997s();
    }

    /* renamed from: z */
    public static b m34990z(C10104p c10104p) {
        return m34989y().mo34096m(c10104p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34989y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34990z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38981l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f38979j.size(); i4++) {
            i3 += CodedOutputStream.m38179e(this.f38979j.mo38425N0(i4));
        }
        int size = 0 + i3 + (m34994w().size() * 1) + this.f38978i.size();
        this.f38981l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10104p> mo34080g() {
        return f38977h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f38979j.size(); i2++) {
            codedOutputStream.m38205O(1, this.f38979j.mo38425N0(i2));
        }
        codedOutputStream.m38225i0(this.f38978i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38980k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f38980k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public String m34993v(int i2) {
        return this.f38979j.get(i2);
    }

    /* renamed from: w */
    public InterfaceC10726r m34994w() {
        return this.f38979j;
    }

    private C10104p(AbstractC10716h.b bVar) {
        super(bVar);
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        this.f38978i = bVar.m38391l();
    }

    private C10104p(boolean z) {
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        this.f38978i = AbstractC10712d.f41263f;
    }

    private C10104p(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        m34988x();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int m38320K = c10713e.m38320K();
                        if (m38320K != 0) {
                            if (m38320K != 10) {
                                if (!mo38390p(c10713e, m38173J, c10714f, m38320K)) {
                                }
                            } else {
                                AbstractC10712d m38332l = c10713e.m38332l();
                                if (!(z2 & true)) {
                                    this.f38979j = new C10720l();
                                    z2 |= true;
                                }
                                this.f38979j.mo38428h1(m38332l);
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
                if (z2 & true) {
                    this.f38979j = this.f38979j.mo38431k();
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38978i = m38280w.m38299e();
                    throw th2;
                }
                this.f38978i = m38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f38979j = this.f38979j.mo38431k();
        }
        try {
            m38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38978i = m38280w.m38299e();
            throw th3;
        }
        this.f38978i = m38280w.m38299e();
        mo38389m();
    }
}
