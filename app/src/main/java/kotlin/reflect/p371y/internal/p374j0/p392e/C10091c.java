package kotlin.reflect.p371y.internal.p374j0.p392e;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10717i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10111w;
import okhttp3.internal.http2.Http2;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.c */
/* loaded from: classes3.dex */
public final class C10091c extends AbstractC10716h.d<C10091c> implements InterfaceC10724p {

    /* renamed from: h */
    private static final C10091c f38676h;

    /* renamed from: i */
    public static InterfaceC10725q<C10091c> f38677i = new a();

    /* renamed from: A */
    private List<C10106r> f38678A;

    /* renamed from: B */
    private List<C10095g> f38679B;

    /* renamed from: C */
    private List<Integer> f38680C;

    /* renamed from: D */
    private int f38681D;

    /* renamed from: E */
    private int f38682E;

    /* renamed from: F */
    private C10105q f38683F;

    /* renamed from: G */
    private int f38684G;

    /* renamed from: H */
    private List<Integer> f38685H;

    /* renamed from: I */
    private int f38686I;

    /* renamed from: J */
    private List<C10105q> f38687J;

    /* renamed from: K */
    private List<Integer> f38688K;

    /* renamed from: L */
    private int f38689L;

    /* renamed from: M */
    private C10108t f38690M;

    /* renamed from: N */
    private List<Integer> f38691N;

    /* renamed from: O */
    private C10111w f38692O;

    /* renamed from: P */
    private byte f38693P;

    /* renamed from: Q */
    private int f38694Q;

    /* renamed from: j */
    private final AbstractC10712d f38695j;

    /* renamed from: k */
    private int f38696k;

    /* renamed from: l */
    private int f38697l;

    /* renamed from: m */
    private int f38698m;

    /* renamed from: n */
    private int f38699n;

    /* renamed from: o */
    private List<C10107s> f38700o;

    /* renamed from: p */
    private List<C10105q> f38701p;

    /* renamed from: q */
    private List<Integer> f38702q;

    /* renamed from: r */
    private int f38703r;

    /* renamed from: s */
    private List<Integer> f38704s;

    /* renamed from: t */
    private int f38705t;

    /* renamed from: u */
    private List<C10105q> f38706u;

    /* renamed from: v */
    private List<Integer> f38707v;

    /* renamed from: w */
    private int f38708w;

    /* renamed from: x */
    private List<C10092d> f38709x;

    /* renamed from: y */
    private List<C10097i> f38710y;

    /* renamed from: z */
    private List<C10102n> f38711z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$a */
    static class a extends AbstractC10710b<C10091c> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10091c mo34086b(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
            return new C10091c(c10713e, c10714f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$b */
    public static final class b extends AbstractC10716h.c<C10091c, b> implements InterfaceC10724p {

        /* renamed from: A */
        private int f38712A;

        /* renamed from: i */
        private int f38719i;

        /* renamed from: k */
        private int f38721k;

        /* renamed from: l */
        private int f38722l;

        /* renamed from: y */
        private int f38735y;

        /* renamed from: j */
        private int f38720j = 6;

        /* renamed from: m */
        private List<C10107s> f38723m = Collections.emptyList();

        /* renamed from: n */
        private List<C10105q> f38724n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f38725o = Collections.emptyList();

        /* renamed from: p */
        private List<Integer> f38726p = Collections.emptyList();

        /* renamed from: q */
        private List<C10105q> f38727q = Collections.emptyList();

        /* renamed from: r */
        private List<Integer> f38728r = Collections.emptyList();

        /* renamed from: s */
        private List<C10092d> f38729s = Collections.emptyList();

        /* renamed from: t */
        private List<C10097i> f38730t = Collections.emptyList();

        /* renamed from: u */
        private List<C10102n> f38731u = Collections.emptyList();

        /* renamed from: v */
        private List<C10106r> f38732v = Collections.emptyList();

        /* renamed from: w */
        private List<C10095g> f38733w = Collections.emptyList();

        /* renamed from: x */
        private List<Integer> f38734x = Collections.emptyList();

        /* renamed from: z */
        private C10105q f38736z = C10105q.m35022Y();

        /* renamed from: B */
        private List<Integer> f38713B = Collections.emptyList();

        /* renamed from: C */
        private List<C10105q> f38714C = Collections.emptyList();

        /* renamed from: D */
        private List<Integer> f38715D = Collections.emptyList();

        /* renamed from: E */
        private C10108t f38716E = C10108t.m35225w();

        /* renamed from: F */
        private List<Integer> f38717F = Collections.emptyList();

        /* renamed from: G */
        private C10111w f38718G = C10111w.m35334u();

        private b() {
            m34507Q();
        }

        /* renamed from: A */
        private void m34491A() {
            if ((this.f38719i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.f38729s = new ArrayList(this.f38729s);
                this.f38719i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        /* renamed from: B */
        private void m34492B() {
            if ((this.f38719i & 256) != 256) {
                this.f38728r = new ArrayList(this.f38728r);
                this.f38719i |= 256;
            }
        }

        /* renamed from: C */
        private void m34493C() {
            if ((this.f38719i & 128) != 128) {
                this.f38727q = new ArrayList(this.f38727q);
                this.f38719i |= 128;
            }
        }

        /* renamed from: D */
        private void m34494D() {
            if ((this.f38719i & 8192) != 8192) {
                this.f38733w = new ArrayList(this.f38733w);
                this.f38719i |= 8192;
            }
        }

        /* renamed from: E */
        private void m34495E() {
            if ((this.f38719i & 1024) != 1024) {
                this.f38730t = new ArrayList(this.f38730t);
                this.f38719i |= 1024;
            }
        }

        /* renamed from: F */
        private void m34496F() {
            if ((this.f38719i & 262144) != 262144) {
                this.f38713B = new ArrayList(this.f38713B);
                this.f38719i |= 262144;
            }
        }

        /* renamed from: G */
        private void m34497G() {
            if ((this.f38719i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                this.f38715D = new ArrayList(this.f38715D);
                this.f38719i |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            }
        }

        /* renamed from: H */
        private void m34498H() {
            if ((this.f38719i & 524288) != 524288) {
                this.f38714C = new ArrayList(this.f38714C);
                this.f38719i |= 524288;
            }
        }

        /* renamed from: I */
        private void m34499I() {
            if ((this.f38719i & 64) != 64) {
                this.f38726p = new ArrayList(this.f38726p);
                this.f38719i |= 64;
            }
        }

        /* renamed from: J */
        private void m34500J() {
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048) {
                this.f38731u = new ArrayList(this.f38731u);
                this.f38719i |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            }
        }

        /* renamed from: K */
        private void m34501K() {
            if ((this.f38719i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f38734x = new ArrayList(this.f38734x);
                this.f38719i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* renamed from: L */
        private void m34502L() {
            if ((this.f38719i & 32) != 32) {
                this.f38725o = new ArrayList(this.f38725o);
                this.f38719i |= 32;
            }
        }

        /* renamed from: M */
        private void m34503M() {
            if ((this.f38719i & 16) != 16) {
                this.f38724n = new ArrayList(this.f38724n);
                this.f38719i |= 16;
            }
        }

        /* renamed from: N */
        private void m34504N() {
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f38732v = new ArrayList(this.f38732v);
                this.f38719i |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: O */
        private void m34505O() {
            if ((this.f38719i & 8) != 8) {
                this.f38723m = new ArrayList(this.f38723m);
                this.f38719i |= 8;
            }
        }

        /* renamed from: P */
        private void m34506P() {
            if ((this.f38719i & 4194304) != 4194304) {
                this.f38717F = new ArrayList(this.f38717F);
                this.f38719i |= 4194304;
            }
        }

        /* renamed from: Q */
        private void m34507Q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34509w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10091c c10091c) {
            if (c10091c == C10091c.m34433z0()) {
                return this;
            }
            if (c10091c.m34473m1()) {
                m34516Z(c10091c.m34438E0());
            }
            if (c10091c.m34474n1()) {
                m34517a0(c10091c.m34439F0());
            }
            if (c10091c.m34472l1()) {
                m34515X(c10091c.m34478r0());
            }
            if (!c10091c.f38700o.isEmpty()) {
                if (this.f38723m.isEmpty()) {
                    this.f38723m = c10091c.f38700o;
                    this.f38719i &= -9;
                } else {
                    m34505O();
                    this.f38723m.addAll(c10091c.f38700o);
                }
            }
            if (!c10091c.f38701p.isEmpty()) {
                if (this.f38724n.isEmpty()) {
                    this.f38724n = c10091c.f38701p;
                    this.f38719i &= -17;
                } else {
                    m34503M();
                    this.f38724n.addAll(c10091c.f38701p);
                }
            }
            if (!c10091c.f38702q.isEmpty()) {
                if (this.f38725o.isEmpty()) {
                    this.f38725o = c10091c.f38702q;
                    this.f38719i &= -33;
                } else {
                    m34502L();
                    this.f38725o.addAll(c10091c.f38702q);
                }
            }
            if (!c10091c.f38704s.isEmpty()) {
                if (this.f38726p.isEmpty()) {
                    this.f38726p = c10091c.f38704s;
                    this.f38719i &= -65;
                } else {
                    m34499I();
                    this.f38726p.addAll(c10091c.f38704s);
                }
            }
            if (!c10091c.f38706u.isEmpty()) {
                if (this.f38727q.isEmpty()) {
                    this.f38727q = c10091c.f38706u;
                    this.f38719i &= -129;
                } else {
                    m34493C();
                    this.f38727q.addAll(c10091c.f38706u);
                }
            }
            if (!c10091c.f38707v.isEmpty()) {
                if (this.f38728r.isEmpty()) {
                    this.f38728r = c10091c.f38707v;
                    this.f38719i &= -257;
                } else {
                    m34492B();
                    this.f38728r.addAll(c10091c.f38707v);
                }
            }
            if (!c10091c.f38709x.isEmpty()) {
                if (this.f38729s.isEmpty()) {
                    this.f38729s = c10091c.f38709x;
                    this.f38719i &= -513;
                } else {
                    m34491A();
                    this.f38729s.addAll(c10091c.f38709x);
                }
            }
            if (!c10091c.f38710y.isEmpty()) {
                if (this.f38730t.isEmpty()) {
                    this.f38730t = c10091c.f38710y;
                    this.f38719i &= -1025;
                } else {
                    m34495E();
                    this.f38730t.addAll(c10091c.f38710y);
                }
            }
            if (!c10091c.f38711z.isEmpty()) {
                if (this.f38731u.isEmpty()) {
                    this.f38731u = c10091c.f38711z;
                    this.f38719i &= -2049;
                } else {
                    m34500J();
                    this.f38731u.addAll(c10091c.f38711z);
                }
            }
            if (!c10091c.f38678A.isEmpty()) {
                if (this.f38732v.isEmpty()) {
                    this.f38732v = c10091c.f38678A;
                    this.f38719i &= -4097;
                } else {
                    m34504N();
                    this.f38732v.addAll(c10091c.f38678A);
                }
            }
            if (!c10091c.f38679B.isEmpty()) {
                if (this.f38733w.isEmpty()) {
                    this.f38733w = c10091c.f38679B;
                    this.f38719i &= -8193;
                } else {
                    m34494D();
                    this.f38733w.addAll(c10091c.f38679B);
                }
            }
            if (!c10091c.f38680C.isEmpty()) {
                if (this.f38734x.isEmpty()) {
                    this.f38734x = c10091c.f38680C;
                    this.f38719i &= -16385;
                } else {
                    m34501K();
                    this.f38734x.addAll(c10091c.f38680C);
                }
            }
            if (c10091c.m34475o1()) {
                m34518b0(c10091c.m34443J0());
            }
            if (c10091c.m34476p1()) {
                m34512T(c10091c.m34444K0());
            }
            if (c10091c.m34477q1()) {
                m34519c0(c10091c.m34445L0());
            }
            if (!c10091c.f38685H.isEmpty()) {
                if (this.f38713B.isEmpty()) {
                    this.f38713B = c10091c.f38685H;
                    this.f38719i &= -262145;
                } else {
                    m34496F();
                    this.f38713B.addAll(c10091c.f38685H);
                }
            }
            if (!c10091c.f38687J.isEmpty()) {
                if (this.f38714C.isEmpty()) {
                    this.f38714C = c10091c.f38687J;
                    this.f38719i &= -524289;
                } else {
                    m34498H();
                    this.f38714C.addAll(c10091c.f38687J);
                }
            }
            if (!c10091c.f38688K.isEmpty()) {
                if (this.f38715D.isEmpty()) {
                    this.f38715D = c10091c.f38688K;
                    this.f38719i &= -1048577;
                } else {
                    m34497G();
                    this.f38715D.addAll(c10091c.f38688K);
                }
            }
            if (c10091c.m34479r1()) {
                m34513U(c10091c.m34469i1());
            }
            if (!c10091c.f38691N.isEmpty()) {
                if (this.f38717F.isEmpty()) {
                    this.f38717F = c10091c.f38691N;
                    this.f38719i &= -4194305;
                } else {
                    m34506P();
                    this.f38717F.addAll(c10091c.f38691N);
                }
            }
            if (c10091c.m34481s1()) {
                m34514V(c10091c.m34471k1());
            }
            m38396r(c10091c);
            m38392n(m38391l().m38286f(c10091c.f38695j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10091c.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10713e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10091c.f38677i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10091c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10091c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10091c.b.mo34092W(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.c$b");
        }

        /* renamed from: T */
        public b m34512T(C10105q c10105q) {
            if ((this.f38719i & 65536) != 65536 || this.f38736z == C10105q.m35022Y()) {
                this.f38736z = c10105q;
            } else {
                this.f38736z = C10105q.m35025z0(this.f38736z).mo34096m(c10105q).m35110u();
            }
            this.f38719i |= 65536;
            return this;
        }

        /* renamed from: U */
        public b m34513U(C10108t c10108t) {
            if ((this.f38719i & 2097152) != 2097152 || this.f38716E == C10108t.m35225w()) {
                this.f38716E = c10108t;
            } else {
                this.f38716E = C10108t.m35219E(this.f38716E).mo34096m(c10108t).m35240q();
            }
            this.f38719i |= 2097152;
            return this;
        }

        /* renamed from: V */
        public b m34514V(C10111w c10111w) {
            if ((this.f38719i & 8388608) != 8388608 || this.f38718G == C10111w.m35334u()) {
                this.f38718G = c10111w;
            } else {
                this.f38718G = C10111w.m35337z(this.f38718G).mo34096m(c10111w).m35348q();
            }
            this.f38719i |= 8388608;
            return this;
        }

        /* renamed from: X */
        public b m34515X(int i2) {
            this.f38719i |= 4;
            this.f38722l = i2;
            return this;
        }

        /* renamed from: Z */
        public b m34516Z(int i2) {
            this.f38719i |= 1;
            this.f38720j = i2;
            return this;
        }

        /* renamed from: a0 */
        public b m34517a0(int i2) {
            this.f38719i |= 2;
            this.f38721k = i2;
            return this;
        }

        /* renamed from: b0 */
        public b m34518b0(int i2) {
            this.f38719i |= 32768;
            this.f38735y = i2;
            return this;
        }

        /* renamed from: c0 */
        public b m34519c0(int i2) {
            this.f38719i |= 131072;
            this.f38712A = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10091c mo34093c() {
            C10091c m34521u = m34521u();
            if (m34521u.isInitialized()) {
                return m34521u;
            }
            throw AbstractC10709a.a.m38257j(m34521u);
        }

        /* renamed from: u */
        public C10091c m34521u() {
            C10091c c10091c = new C10091c(this);
            int i2 = this.f38719i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10091c.f38697l = this.f38720j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10091c.f38698m = this.f38721k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10091c.f38699n = this.f38722l;
            if ((this.f38719i & 8) == 8) {
                this.f38723m = Collections.unmodifiableList(this.f38723m);
                this.f38719i &= -9;
            }
            c10091c.f38700o = this.f38723m;
            if ((this.f38719i & 16) == 16) {
                this.f38724n = Collections.unmodifiableList(this.f38724n);
                this.f38719i &= -17;
            }
            c10091c.f38701p = this.f38724n;
            if ((this.f38719i & 32) == 32) {
                this.f38725o = Collections.unmodifiableList(this.f38725o);
                this.f38719i &= -33;
            }
            c10091c.f38702q = this.f38725o;
            if ((this.f38719i & 64) == 64) {
                this.f38726p = Collections.unmodifiableList(this.f38726p);
                this.f38719i &= -65;
            }
            c10091c.f38704s = this.f38726p;
            if ((this.f38719i & 128) == 128) {
                this.f38727q = Collections.unmodifiableList(this.f38727q);
                this.f38719i &= -129;
            }
            c10091c.f38706u = this.f38727q;
            if ((this.f38719i & 256) == 256) {
                this.f38728r = Collections.unmodifiableList(this.f38728r);
                this.f38719i &= -257;
            }
            c10091c.f38707v = this.f38728r;
            if ((this.f38719i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.f38729s = Collections.unmodifiableList(this.f38729s);
                this.f38719i &= -513;
            }
            c10091c.f38709x = this.f38729s;
            if ((this.f38719i & 1024) == 1024) {
                this.f38730t = Collections.unmodifiableList(this.f38730t);
                this.f38719i &= -1025;
            }
            c10091c.f38710y = this.f38730t;
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                this.f38731u = Collections.unmodifiableList(this.f38731u);
                this.f38719i &= -2049;
            }
            c10091c.f38711z = this.f38731u;
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f38732v = Collections.unmodifiableList(this.f38732v);
                this.f38719i &= -4097;
            }
            c10091c.f38678A = this.f38732v;
            if ((this.f38719i & 8192) == 8192) {
                this.f38733w = Collections.unmodifiableList(this.f38733w);
                this.f38719i &= -8193;
            }
            c10091c.f38679B = this.f38733w;
            if ((this.f38719i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f38734x = Collections.unmodifiableList(this.f38734x);
                this.f38719i &= -16385;
            }
            c10091c.f38680C = this.f38734x;
            if ((i2 & 32768) == 32768) {
                i3 |= 8;
            }
            c10091c.f38682E = this.f38735y;
            if ((i2 & 65536) == 65536) {
                i3 |= 16;
            }
            c10091c.f38683F = this.f38736z;
            if ((i2 & 131072) == 131072) {
                i3 |= 32;
            }
            c10091c.f38684G = this.f38712A;
            if ((this.f38719i & 262144) == 262144) {
                this.f38713B = Collections.unmodifiableList(this.f38713B);
                this.f38719i &= -262145;
            }
            c10091c.f38685H = this.f38713B;
            if ((this.f38719i & 524288) == 524288) {
                this.f38714C = Collections.unmodifiableList(this.f38714C);
                this.f38719i &= -524289;
            }
            c10091c.f38687J = this.f38714C;
            if ((this.f38719i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                this.f38715D = Collections.unmodifiableList(this.f38715D);
                this.f38719i &= -1048577;
            }
            c10091c.f38688K = this.f38715D;
            if ((i2 & 2097152) == 2097152) {
                i3 |= 64;
            }
            c10091c.f38690M = this.f38716E;
            if ((this.f38719i & 4194304) == 4194304) {
                this.f38717F = Collections.unmodifiableList(this.f38717F);
                this.f38719i &= -4194305;
            }
            c10091c.f38691N = this.f38717F;
            if ((i2 & 8388608) == 8388608) {
                i3 |= 128;
            }
            c10091c.f38692O = this.f38718G;
            c10091c.f38696k = i3;
            return c10091c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34509w().mo34096m(m34521u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$c */
    public enum c implements C10717i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* renamed from: m */
        private static C10717i.b<c> f38744m = new a();

        /* renamed from: o */
        private final int f38746o;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.c$c$a */
        static class a implements C10717i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m34523g(i2);
            }
        }

        c(int i2, int i3) {
            this.f38746o = i3;
        }

        /* renamed from: g */
        public static c m34523g(int i2) {
            switch (i2) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38746o;
        }
    }

    static {
        C10091c c10091c = new C10091c(true);
        f38676h = c10091c;
        c10091c.m34429t1();
    }

    /* renamed from: t1 */
    private void m34429t1() {
        this.f38697l = 6;
        this.f38698m = 0;
        this.f38699n = 0;
        this.f38700o = Collections.emptyList();
        this.f38701p = Collections.emptyList();
        this.f38702q = Collections.emptyList();
        this.f38704s = Collections.emptyList();
        this.f38706u = Collections.emptyList();
        this.f38707v = Collections.emptyList();
        this.f38709x = Collections.emptyList();
        this.f38710y = Collections.emptyList();
        this.f38711z = Collections.emptyList();
        this.f38678A = Collections.emptyList();
        this.f38679B = Collections.emptyList();
        this.f38680C = Collections.emptyList();
        this.f38682E = 0;
        this.f38683F = C10105q.m35022Y();
        this.f38684G = 0;
        this.f38685H = Collections.emptyList();
        this.f38687J = Collections.emptyList();
        this.f38688K = Collections.emptyList();
        this.f38690M = C10108t.m35225w();
        this.f38691N = Collections.emptyList();
        this.f38692O = C10111w.m35334u();
    }

    /* renamed from: u1 */
    public static b m34430u1() {
        return b.m34509w();
    }

    /* renamed from: v1 */
    public static b m34431v1(C10091c c10091c) {
        return m34430u1().mo34096m(c10091c);
    }

    /* renamed from: x1 */
    public static C10091c m34432x1(InputStream inputStream, C10714f c10714f) throws IOException {
        return f38677i.mo38260a(inputStream, c10714f);
    }

    /* renamed from: z0 */
    public static C10091c m34433z0() {
        return f38676h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C10091c mo34461b() {
        return f38676h;
    }

    /* renamed from: B0 */
    public C10095g m34435B0(int i2) {
        return this.f38679B.get(i2);
    }

    /* renamed from: C0 */
    public int m34436C0() {
        return this.f38679B.size();
    }

    /* renamed from: D0 */
    public List<C10095g> m34437D0() {
        return this.f38679B;
    }

    /* renamed from: E0 */
    public int m34438E0() {
        return this.f38697l;
    }

    /* renamed from: F0 */
    public int m34439F0() {
        return this.f38698m;
    }

    /* renamed from: G0 */
    public C10097i m34440G0(int i2) {
        return this.f38710y.get(i2);
    }

    /* renamed from: H0 */
    public int m34441H0() {
        return this.f38710y.size();
    }

    /* renamed from: I0 */
    public List<C10097i> m34442I0() {
        return this.f38710y;
    }

    /* renamed from: J0 */
    public int m34443J0() {
        return this.f38682E;
    }

    /* renamed from: K0 */
    public C10105q m34444K0() {
        return this.f38683F;
    }

    /* renamed from: L0 */
    public int m34445L0() {
        return this.f38684G;
    }

    /* renamed from: M0 */
    public int m34446M0() {
        return this.f38685H.size();
    }

    /* renamed from: N0 */
    public List<Integer> m34447N0() {
        return this.f38685H;
    }

    /* renamed from: O0 */
    public C10105q m34448O0(int i2) {
        return this.f38687J.get(i2);
    }

    /* renamed from: P0 */
    public int m34449P0() {
        return this.f38687J.size();
    }

    /* renamed from: Q0 */
    public int m34450Q0() {
        return this.f38688K.size();
    }

    /* renamed from: R0 */
    public List<Integer> m34451R0() {
        return this.f38688K;
    }

    /* renamed from: S0 */
    public List<C10105q> m34452S0() {
        return this.f38687J;
    }

    /* renamed from: T0 */
    public List<Integer> m34453T0() {
        return this.f38704s;
    }

    /* renamed from: U0 */
    public C10102n m34454U0(int i2) {
        return this.f38711z.get(i2);
    }

    /* renamed from: V0 */
    public int m34455V0() {
        return this.f38711z.size();
    }

    /* renamed from: W0 */
    public List<C10102n> m34456W0() {
        return this.f38711z;
    }

    /* renamed from: X0 */
    public List<Integer> m34457X0() {
        return this.f38680C;
    }

    /* renamed from: Y0 */
    public C10105q m34458Y0(int i2) {
        return this.f38701p.get(i2);
    }

    /* renamed from: Z0 */
    public int m34459Z0() {
        return this.f38701p.size();
    }

    /* renamed from: a1 */
    public List<Integer> m34460a1() {
        return this.f38702q;
    }

    /* renamed from: b1 */
    public List<C10105q> m34462b1() {
        return this.f38701p;
    }

    /* renamed from: c1 */
    public C10106r m34463c1(int i2) {
        return this.f38678A.get(i2);
    }

    /* renamed from: d1 */
    public int m34464d1() {
        return this.f38678A.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38694Q;
        if (i2 != -1) {
            return i2;
        }
        int m38189o = (this.f38696k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38697l) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f38702q.size(); i4++) {
            i3 += CodedOutputStream.m38190p(this.f38702q.get(i4).intValue());
        }
        int i5 = m38189o + i3;
        if (!m34460a1().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m38190p(i3);
        }
        this.f38703r = i3;
        if ((this.f38696k & 2) == 2) {
            i5 += CodedOutputStream.m38189o(3, this.f38698m);
        }
        if ((this.f38696k & 4) == 4) {
            i5 += CodedOutputStream.m38189o(4, this.f38699n);
        }
        for (int i6 = 0; i6 < this.f38700o.size(); i6++) {
            i5 += CodedOutputStream.m38193s(5, this.f38700o.get(i6));
        }
        for (int i7 = 0; i7 < this.f38701p.size(); i7++) {
            i5 += CodedOutputStream.m38193s(6, this.f38701p.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f38704s.size(); i9++) {
            i8 += CodedOutputStream.m38190p(this.f38704s.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!m34453T0().isEmpty()) {
            i10 = i10 + 1 + CodedOutputStream.m38190p(i8);
        }
        this.f38705t = i8;
        for (int i11 = 0; i11 < this.f38709x.size(); i11++) {
            i10 += CodedOutputStream.m38193s(8, this.f38709x.get(i11));
        }
        for (int i12 = 0; i12 < this.f38710y.size(); i12++) {
            i10 += CodedOutputStream.m38193s(9, this.f38710y.get(i12));
        }
        for (int i13 = 0; i13 < this.f38711z.size(); i13++) {
            i10 += CodedOutputStream.m38193s(10, this.f38711z.get(i13));
        }
        for (int i14 = 0; i14 < this.f38678A.size(); i14++) {
            i10 += CodedOutputStream.m38193s(11, this.f38678A.get(i14));
        }
        for (int i15 = 0; i15 < this.f38679B.size(); i15++) {
            i10 += CodedOutputStream.m38193s(13, this.f38679B.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f38680C.size(); i17++) {
            i16 += CodedOutputStream.m38190p(this.f38680C.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!m34457X0().isEmpty()) {
            i18 = i18 + 2 + CodedOutputStream.m38190p(i16);
        }
        this.f38681D = i16;
        if ((this.f38696k & 8) == 8) {
            i18 += CodedOutputStream.m38189o(17, this.f38682E);
        }
        if ((this.f38696k & 16) == 16) {
            i18 += CodedOutputStream.m38193s(18, this.f38683F);
        }
        if ((this.f38696k & 32) == 32) {
            i18 += CodedOutputStream.m38189o(19, this.f38684G);
        }
        for (int i19 = 0; i19 < this.f38706u.size(); i19++) {
            i18 += CodedOutputStream.m38193s(20, this.f38706u.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.f38707v.size(); i21++) {
            i20 += CodedOutputStream.m38190p(this.f38707v.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!m34487x0().isEmpty()) {
            i22 = i22 + 2 + CodedOutputStream.m38190p(i20);
        }
        this.f38708w = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.f38685H.size(); i24++) {
            i23 += CodedOutputStream.m38190p(this.f38685H.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!m34447N0().isEmpty()) {
            i25 = i25 + 2 + CodedOutputStream.m38190p(i23);
        }
        this.f38686I = i23;
        for (int i26 = 0; i26 < this.f38687J.size(); i26++) {
            i25 += CodedOutputStream.m38193s(23, this.f38687J.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f38688K.size(); i28++) {
            i27 += CodedOutputStream.m38190p(this.f38688K.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!m34451R0().isEmpty()) {
            i29 = i29 + 2 + CodedOutputStream.m38190p(i27);
        }
        this.f38689L = i27;
        if ((this.f38696k & 64) == 64) {
            i29 += CodedOutputStream.m38193s(30, this.f38690M);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.f38691N.size(); i31++) {
            i30 += CodedOutputStream.m38190p(this.f38691N.get(i31).intValue());
        }
        int size = i29 + i30 + (m34470j1().size() * 2);
        if ((this.f38696k & 128) == 128) {
            size += CodedOutputStream.m38193s(32, this.f38692O);
        }
        int m38400t = size + m38400t() + this.f38695j.size();
        this.f38694Q = m38400t;
        return m38400t;
    }

    /* renamed from: e1 */
    public List<C10106r> m34465e1() {
        return this.f38678A;
    }

    /* renamed from: f1 */
    public C10107s m34466f1(int i2) {
        return this.f38700o.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<C10091c> mo34080g() {
        return f38677i;
    }

    /* renamed from: g1 */
    public int m34467g1() {
        return this.f38700o.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10716h.d<MessageType>.a m38405y = m38405y();
        if ((this.f38696k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38697l);
        }
        if (m34460a1().size() > 0) {
            codedOutputStream.m38231o0(18);
            codedOutputStream.m38231o0(this.f38703r);
        }
        for (int i2 = 0; i2 < this.f38702q.size(); i2++) {
            codedOutputStream.m38218b0(this.f38702q.get(i2).intValue());
        }
        if ((this.f38696k & 2) == 2) {
            codedOutputStream.m38217a0(3, this.f38698m);
        }
        if ((this.f38696k & 4) == 4) {
            codedOutputStream.m38217a0(4, this.f38699n);
        }
        for (int i3 = 0; i3 < this.f38700o.size(); i3++) {
            codedOutputStream.m38220d0(5, this.f38700o.get(i3));
        }
        for (int i4 = 0; i4 < this.f38701p.size(); i4++) {
            codedOutputStream.m38220d0(6, this.f38701p.get(i4));
        }
        if (m34453T0().size() > 0) {
            codedOutputStream.m38231o0(58);
            codedOutputStream.m38231o0(this.f38705t);
        }
        for (int i5 = 0; i5 < this.f38704s.size(); i5++) {
            codedOutputStream.m38218b0(this.f38704s.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.f38709x.size(); i6++) {
            codedOutputStream.m38220d0(8, this.f38709x.get(i6));
        }
        for (int i7 = 0; i7 < this.f38710y.size(); i7++) {
            codedOutputStream.m38220d0(9, this.f38710y.get(i7));
        }
        for (int i8 = 0; i8 < this.f38711z.size(); i8++) {
            codedOutputStream.m38220d0(10, this.f38711z.get(i8));
        }
        for (int i9 = 0; i9 < this.f38678A.size(); i9++) {
            codedOutputStream.m38220d0(11, this.f38678A.get(i9));
        }
        for (int i10 = 0; i10 < this.f38679B.size(); i10++) {
            codedOutputStream.m38220d0(13, this.f38679B.get(i10));
        }
        if (m34457X0().size() > 0) {
            codedOutputStream.m38231o0(130);
            codedOutputStream.m38231o0(this.f38681D);
        }
        for (int i11 = 0; i11 < this.f38680C.size(); i11++) {
            codedOutputStream.m38218b0(this.f38680C.get(i11).intValue());
        }
        if ((this.f38696k & 8) == 8) {
            codedOutputStream.m38217a0(17, this.f38682E);
        }
        if ((this.f38696k & 16) == 16) {
            codedOutputStream.m38220d0(18, this.f38683F);
        }
        if ((this.f38696k & 32) == 32) {
            codedOutputStream.m38217a0(19, this.f38684G);
        }
        for (int i12 = 0; i12 < this.f38706u.size(); i12++) {
            codedOutputStream.m38220d0(20, this.f38706u.get(i12));
        }
        if (m34487x0().size() > 0) {
            codedOutputStream.m38231o0(170);
            codedOutputStream.m38231o0(this.f38708w);
        }
        for (int i13 = 0; i13 < this.f38707v.size(); i13++) {
            codedOutputStream.m38218b0(this.f38707v.get(i13).intValue());
        }
        if (m34447N0().size() > 0) {
            codedOutputStream.m38231o0(178);
            codedOutputStream.m38231o0(this.f38686I);
        }
        for (int i14 = 0; i14 < this.f38685H.size(); i14++) {
            codedOutputStream.m38218b0(this.f38685H.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.f38687J.size(); i15++) {
            codedOutputStream.m38220d0(23, this.f38687J.get(i15));
        }
        if (m34451R0().size() > 0) {
            codedOutputStream.m38231o0(194);
            codedOutputStream.m38231o0(this.f38689L);
        }
        for (int i16 = 0; i16 < this.f38688K.size(); i16++) {
            codedOutputStream.m38218b0(this.f38688K.get(i16).intValue());
        }
        if ((this.f38696k & 64) == 64) {
            codedOutputStream.m38220d0(30, this.f38690M);
        }
        for (int i17 = 0; i17 < this.f38691N.size(); i17++) {
            codedOutputStream.m38217a0(31, this.f38691N.get(i17).intValue());
        }
        if ((this.f38696k & 128) == 128) {
            codedOutputStream.m38220d0(32, this.f38692O);
        }
        m38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38695j);
    }

    /* renamed from: h1 */
    public List<C10107s> m34468h1() {
        return this.f38700o;
    }

    /* renamed from: i1 */
    public C10108t m34469i1() {
        return this.f38690M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10724p
    public final boolean isInitialized() {
        byte b2 = this.f38693P;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m34474n1()) {
            this.f38693P = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34467g1(); i2++) {
            if (!m34466f1(i2).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m34459Z0(); i3++) {
            if (!m34458Y0(i3).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m34485w0(); i4++) {
            if (!m34484v0(i4).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m34482t0(); i5++) {
            if (!m34480s0(i5).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < m34441H0(); i6++) {
            if (!m34440G0(i6).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < m34455V0(); i7++) {
            if (!m34454U0(i7).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < m34464d1(); i8++) {
            if (!m34463c1(i8).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < m34436C0(); i9++) {
            if (!m34435B0(i9).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        if (m34476p1() && !m34444K0().isInitialized()) {
            this.f38693P = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m34449P0(); i10++) {
            if (!m34448O0(i10).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        if (m34479r1() && !m34469i1().isInitialized()) {
            this.f38693P = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38693P = (byte) 1;
            return true;
        }
        this.f38693P = (byte) 0;
        return false;
    }

    /* renamed from: j1 */
    public List<Integer> m34470j1() {
        return this.f38691N;
    }

    /* renamed from: k1 */
    public C10111w m34471k1() {
        return this.f38692O;
    }

    /* renamed from: l1 */
    public boolean m34472l1() {
        return (this.f38696k & 4) == 4;
    }

    /* renamed from: m1 */
    public boolean m34473m1() {
        return (this.f38696k & 1) == 1;
    }

    /* renamed from: n1 */
    public boolean m34474n1() {
        return (this.f38696k & 2) == 2;
    }

    /* renamed from: o1 */
    public boolean m34475o1() {
        return (this.f38696k & 8) == 8;
    }

    /* renamed from: p1 */
    public boolean m34476p1() {
        return (this.f38696k & 16) == 16;
    }

    /* renamed from: q1 */
    public boolean m34477q1() {
        return (this.f38696k & 32) == 32;
    }

    /* renamed from: r0 */
    public int m34478r0() {
        return this.f38699n;
    }

    /* renamed from: r1 */
    public boolean m34479r1() {
        return (this.f38696k & 64) == 64;
    }

    /* renamed from: s0 */
    public C10092d m34480s0(int i2) {
        return this.f38709x.get(i2);
    }

    /* renamed from: s1 */
    public boolean m34481s1() {
        return (this.f38696k & 128) == 128;
    }

    /* renamed from: t0 */
    public int m34482t0() {
        return this.f38709x.size();
    }

    /* renamed from: u0 */
    public List<C10092d> m34483u0() {
        return this.f38709x;
    }

    /* renamed from: v0 */
    public C10105q m34484v0(int i2) {
        return this.f38706u.get(i2);
    }

    /* renamed from: w0 */
    public int m34485w0() {
        return this.f38706u.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34430u1();
    }

    /* renamed from: x0 */
    public List<Integer> m34487x0() {
        return this.f38707v;
    }

    /* renamed from: y0 */
    public List<C10105q> m34488y0() {
        return this.f38706u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34431v1(this);
    }

    private C10091c(AbstractC10716h.c<C10091c, ?> cVar) {
        super(cVar);
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        this.f38695j = cVar.m38391l();
    }

    private C10091c(boolean z) {
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        this.f38695j = AbstractC10712d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    private C10091c(C10713e c10713e, C10714f c10714f) throws InvalidProtocolBufferException {
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        m34429t1();
        AbstractC10712d.b m38280w = AbstractC10712d.m38280w();
        CodedOutputStream m38173J = CodedOutputStream.m38173J(m38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? r5 = 4194304;
            if (!z) {
                try {
                    try {
                        int m38320K = c10713e.m38320K();
                        switch (m38320K) {
                            case 0:
                                z = true;
                            case 8:
                                this.f38696k |= 1;
                                this.f38697l = c10713e.m38339s();
                            case 16:
                                if ((i2 & 32) != 32) {
                                    this.f38702q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f38702q.add(Integer.valueOf(c10713e.m38339s()));
                            case 18:
                                int m38330j = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 32) != 32 && c10713e.m38327e() > 0) {
                                    this.f38702q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38702q.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j);
                                break;
                            case 24:
                                this.f38696k |= 2;
                                this.f38698m = c10713e.m38339s();
                            case 32:
                                this.f38696k |= 4;
                                this.f38699n = c10713e.m38339s();
                            case 42:
                                if ((i2 & 8) != 8) {
                                    this.f38700o = new ArrayList();
                                    i2 |= 8;
                                }
                                this.f38700o.add(c10713e.m38341u(C10107s.f39065i, c10714f));
                            case 50:
                                if ((i2 & 16) != 16) {
                                    this.f38701p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f38701p.add(c10713e.m38341u(C10105q.f38985i, c10714f));
                            case 56:
                                if ((i2 & 64) != 64) {
                                    this.f38704s = new ArrayList();
                                    i2 |= 64;
                                }
                                this.f38704s.add(Integer.valueOf(c10713e.m38339s()));
                            case 58:
                                int m38330j2 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 64) != 64 && c10713e.m38327e() > 0) {
                                    this.f38704s = new ArrayList();
                                    i2 |= 64;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38704s.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j2);
                                break;
                            case 66:
                                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                    this.f38709x = new ArrayList();
                                    i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                this.f38709x.add(c10713e.m38341u(C10092d.f38748i, c10714f));
                            case 74:
                                if ((i2 & 1024) != 1024) {
                                    this.f38710y = new ArrayList();
                                    i2 |= 1024;
                                }
                                this.f38710y.add(c10713e.m38341u(C10097i.f38832i, c10714f));
                            case 82:
                                if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048) {
                                    this.f38711z = new ArrayList();
                                    i2 |= RecyclerView.AbstractC0599l.FLAG_MOVED;
                                }
                                this.f38711z.add(c10713e.m38341u(C10102n.f38914i, c10714f));
                            case 90:
                                if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                                    this.f38678A = new ArrayList();
                                    i2 |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                this.f38678A.add(c10713e.m38341u(C10106r.f39040i, c10714f));
                            case 106:
                                if ((i2 & 8192) != 8192) {
                                    this.f38679B = new ArrayList();
                                    i2 |= 8192;
                                }
                                this.f38679B.add(c10713e.m38341u(C10095g.f38796i, c10714f));
                            case 128:
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                    this.f38680C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                this.f38680C.add(Integer.valueOf(c10713e.m38339s()));
                            case 130:
                                int m38330j3 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 && c10713e.m38327e() > 0) {
                                    this.f38680C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38680C.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j3);
                                break;
                            case 136:
                                this.f38696k |= 8;
                                this.f38682E = c10713e.m38339s();
                            case 146:
                                C10105q.c mo34077d = (this.f38696k & 16) == 16 ? this.f38683F.mo34077d() : null;
                                C10105q c10105q = (C10105q) c10713e.m38341u(C10105q.f38985i, c10714f);
                                this.f38683F = c10105q;
                                if (mo34077d != null) {
                                    mo34077d.mo34096m(c10105q);
                                    this.f38683F = mo34077d.m35110u();
                                }
                                this.f38696k |= 16;
                            case 152:
                                this.f38696k |= 32;
                                this.f38684G = c10713e.m38339s();
                            case 162:
                                if ((i2 & 128) != 128) {
                                    this.f38706u = new ArrayList();
                                    i2 |= 128;
                                }
                                this.f38706u.add(c10713e.m38341u(C10105q.f38985i, c10714f));
                            case 168:
                                if ((i2 & 256) != 256) {
                                    this.f38707v = new ArrayList();
                                    i2 |= 256;
                                }
                                this.f38707v.add(Integer.valueOf(c10713e.m38339s()));
                            case 170:
                                int m38330j4 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 256) != 256 && c10713e.m38327e() > 0) {
                                    this.f38707v = new ArrayList();
                                    i2 |= 256;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38707v.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j4);
                                break;
                            case 176:
                                if ((i2 & 262144) != 262144) {
                                    this.f38685H = new ArrayList();
                                    i2 |= 262144;
                                }
                                this.f38685H.add(Integer.valueOf(c10713e.m38339s()));
                            case 178:
                                int m38330j5 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 262144) != 262144 && c10713e.m38327e() > 0) {
                                    this.f38685H = new ArrayList();
                                    i2 |= 262144;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38685H.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j5);
                                break;
                            case 186:
                                if ((i2 & 524288) != 524288) {
                                    this.f38687J = new ArrayList();
                                    i2 |= 524288;
                                }
                                this.f38687J.add(c10713e.m38341u(C10105q.f38985i, c10714f));
                            case 192:
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                                    this.f38688K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                this.f38688K.add(Integer.valueOf(c10713e.m38339s()));
                            case 194:
                                int m38330j6 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576 && c10713e.m38327e() > 0) {
                                    this.f38688K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38688K.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j6);
                                break;
                            case 242:
                                C10108t.b mo34077d2 = (this.f38696k & 64) == 64 ? this.f38690M.mo34077d() : null;
                                C10108t c10108t = (C10108t) c10713e.m38341u(C10108t.f39091h, c10714f);
                                this.f38690M = c10108t;
                                if (mo34077d2 != null) {
                                    mo34077d2.mo34096m(c10108t);
                                    this.f38690M = mo34077d2.m35240q();
                                }
                                this.f38696k |= 64;
                            case 248:
                                if ((i2 & 4194304) != 4194304) {
                                    this.f38691N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                this.f38691N.add(Integer.valueOf(c10713e.m38339s()));
                            case 250:
                                int m38330j7 = c10713e.m38330j(c10713e.m38311A());
                                if ((i2 & 4194304) != 4194304 && c10713e.m38327e() > 0) {
                                    this.f38691N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                while (c10713e.m38327e() > 0) {
                                    this.f38691N.add(Integer.valueOf(c10713e.m38339s()));
                                }
                                c10713e.m38329i(m38330j7);
                                break;
                            case 258:
                                C10111w.b mo34077d3 = (this.f38696k & 128) == 128 ? this.f38692O.mo34077d() : null;
                                C10111w c10111w = (C10111w) c10713e.m38341u(C10111w.f39152h, c10714f);
                                this.f38692O = c10111w;
                                if (mo34077d3 != null) {
                                    mo34077d3.mo34096m(c10111w);
                                    this.f38692O = mo34077d3.m35348q();
                                }
                                this.f38696k |= 128;
                            default:
                                r5 = mo38390p(c10713e, m38173J, c10714f, m38320K);
                                if (r5 != 0) {
                                }
                                z = true;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.m38253i(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.f38702q = Collections.unmodifiableList(this.f38702q);
                    }
                    if ((i2 & 8) == 8) {
                        this.f38700o = Collections.unmodifiableList(this.f38700o);
                    }
                    if ((i2 & 16) == 16) {
                        this.f38701p = Collections.unmodifiableList(this.f38701p);
                    }
                    if ((i2 & 64) == 64) {
                        this.f38704s = Collections.unmodifiableList(this.f38704s);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.f38709x = Collections.unmodifiableList(this.f38709x);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.f38710y = Collections.unmodifiableList(this.f38710y);
                    }
                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                        this.f38711z = Collections.unmodifiableList(this.f38711z);
                    }
                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f38678A = Collections.unmodifiableList(this.f38678A);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.f38679B = Collections.unmodifiableList(this.f38679B);
                    }
                    if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.f38680C = Collections.unmodifiableList(this.f38680C);
                    }
                    if ((i2 & 128) == 128) {
                        this.f38706u = Collections.unmodifiableList(this.f38706u);
                    }
                    if ((i2 & 256) == 256) {
                        this.f38707v = Collections.unmodifiableList(this.f38707v);
                    }
                    if ((i2 & 262144) == 262144) {
                        this.f38685H = Collections.unmodifiableList(this.f38685H);
                    }
                    if ((i2 & 524288) == 524288) {
                        this.f38687J = Collections.unmodifiableList(this.f38687J);
                    }
                    if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                        this.f38688K = Collections.unmodifiableList(this.f38688K);
                    }
                    if ((i2 & r5) == r5) {
                        this.f38691N = Collections.unmodifiableList(this.f38691N);
                    }
                    try {
                        m38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38695j = m38280w.m38299e();
                        throw th2;
                    }
                    this.f38695j = m38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.f38702q = Collections.unmodifiableList(this.f38702q);
                }
                if ((i2 & 8) == 8) {
                    this.f38700o = Collections.unmodifiableList(this.f38700o);
                }
                if ((i2 & 16) == 16) {
                    this.f38701p = Collections.unmodifiableList(this.f38701p);
                }
                if ((i2 & 64) == 64) {
                    this.f38704s = Collections.unmodifiableList(this.f38704s);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.f38709x = Collections.unmodifiableList(this.f38709x);
                }
                if ((i2 & 1024) == 1024) {
                    this.f38710y = Collections.unmodifiableList(this.f38710y);
                }
                if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                    this.f38711z = Collections.unmodifiableList(this.f38711z);
                }
                if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f38678A = Collections.unmodifiableList(this.f38678A);
                }
                if ((i2 & 8192) == 8192) {
                    this.f38679B = Collections.unmodifiableList(this.f38679B);
                }
                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f38680C = Collections.unmodifiableList(this.f38680C);
                }
                if ((i2 & 128) == 128) {
                    this.f38706u = Collections.unmodifiableList(this.f38706u);
                }
                if ((i2 & 256) == 256) {
                    this.f38707v = Collections.unmodifiableList(this.f38707v);
                }
                if ((i2 & 262144) == 262144) {
                    this.f38685H = Collections.unmodifiableList(this.f38685H);
                }
                if ((i2 & 524288) == 524288) {
                    this.f38687J = Collections.unmodifiableList(this.f38687J);
                }
                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                    this.f38688K = Collections.unmodifiableList(this.f38688K);
                }
                if ((i2 & 4194304) == 4194304) {
                    this.f38691N = Collections.unmodifiableList(this.f38691N);
                }
                try {
                    m38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f38695j = m38280w.m38299e();
                    throw th3;
                }
                this.f38695j = m38280w.m38299e();
                mo38389m();
                return;
            }
        }
    }
}
