package kotlin.reflect.p371y.internal.p425k0;

/* compiled from: IntTree.java */
/* renamed from: kotlin.f0.y.e.k0.c */
/* loaded from: classes3.dex */
final class C10457c<V> {

    /* renamed from: a */
    static final C10457c<Object> f40510a = new C10457c<>();

    /* renamed from: b */
    private final long f40511b;

    /* renamed from: c */
    private final V f40512c;

    /* renamed from: d */
    private final C10457c<V> f40513d;

    /* renamed from: e */
    private final C10457c<V> f40514e;

    /* renamed from: f */
    private final int f40515f;

    private C10457c() {
        this.f40515f = 0;
        this.f40511b = 0L;
        this.f40512c = null;
        this.f40513d = null;
        this.f40514e = null;
    }

    /* renamed from: c */
    private static <V> C10457c<V> m37251c(long j2, V v, C10457c<V> c10457c, C10457c<V> c10457c2) {
        int i2 = ((C10457c) c10457c).f40515f;
        int i3 = ((C10457c) c10457c2).f40515f;
        if (i2 + i3 > 1) {
            if (i2 >= i3 * 5) {
                C10457c<V> c10457c3 = ((C10457c) c10457c).f40513d;
                C10457c<V> c10457c4 = ((C10457c) c10457c).f40514e;
                if (((C10457c) c10457c4).f40515f < ((C10457c) c10457c3).f40515f * 2) {
                    long j3 = ((C10457c) c10457c).f40511b;
                    return new C10457c<>(j3 + j2, ((C10457c) c10457c).f40512c, c10457c3, new C10457c(-j3, v, c10457c4.m37253e(((C10457c) c10457c4).f40511b + j3), c10457c2));
                }
                C10457c<V> c10457c5 = ((C10457c) c10457c4).f40513d;
                C10457c<V> c10457c6 = ((C10457c) c10457c4).f40514e;
                long j4 = ((C10457c) c10457c4).f40511b;
                long j5 = ((C10457c) c10457c).f40511b + j4 + j2;
                V v2 = ((C10457c) c10457c4).f40512c;
                C10457c c10457c7 = new C10457c(-j4, ((C10457c) c10457c).f40512c, c10457c3, c10457c5.m37253e(((C10457c) c10457c5).f40511b + j4));
                long j6 = ((C10457c) c10457c).f40511b;
                long j7 = ((C10457c) c10457c4).f40511b;
                return new C10457c<>(j5, v2, c10457c7, new C10457c((-j6) - j7, v, c10457c6.m37253e(((C10457c) c10457c6).f40511b + j7 + j6), c10457c2));
            }
            if (i3 >= i2 * 5) {
                C10457c<V> c10457c8 = ((C10457c) c10457c2).f40513d;
                C10457c<V> c10457c9 = ((C10457c) c10457c2).f40514e;
                if (((C10457c) c10457c8).f40515f < ((C10457c) c10457c9).f40515f * 2) {
                    long j8 = ((C10457c) c10457c2).f40511b;
                    return new C10457c<>(j8 + j2, ((C10457c) c10457c2).f40512c, new C10457c(-j8, v, c10457c, c10457c8.m37253e(((C10457c) c10457c8).f40511b + j8)), c10457c9);
                }
                C10457c<V> c10457c10 = ((C10457c) c10457c8).f40513d;
                C10457c<V> c10457c11 = ((C10457c) c10457c8).f40514e;
                long j9 = ((C10457c) c10457c8).f40511b;
                long j10 = ((C10457c) c10457c2).f40511b;
                long j11 = j9 + j10 + j2;
                V v3 = ((C10457c) c10457c8).f40512c;
                C10457c c10457c12 = new C10457c((-j10) - j9, v, c10457c, c10457c10.m37253e(((C10457c) c10457c10).f40511b + j9 + j10));
                long j12 = ((C10457c) c10457c8).f40511b;
                return new C10457c<>(j11, v3, c10457c12, new C10457c(-j12, ((C10457c) c10457c2).f40512c, c10457c11.m37253e(((C10457c) c10457c11).f40511b + j12), c10457c9));
            }
        }
        return new C10457c<>(j2, v, c10457c, c10457c2);
    }

    /* renamed from: d */
    private C10457c<V> m37252d(C10457c<V> c10457c, C10457c<V> c10457c2) {
        return (c10457c == this.f40513d && c10457c2 == this.f40514e) ? this : m37251c(this.f40511b, this.f40512c, c10457c, c10457c2);
    }

    /* renamed from: e */
    private C10457c<V> m37253e(long j2) {
        return (this.f40515f == 0 || j2 == this.f40511b) ? this : new C10457c<>(j2, this.f40512c, this.f40513d, this.f40514e);
    }

    /* renamed from: a */
    V m37254a(long j2) {
        if (this.f40515f == 0) {
            return null;
        }
        long j3 = this.f40511b;
        return j2 < j3 ? this.f40513d.m37254a(j2 - j3) : j2 > j3 ? this.f40514e.m37254a(j2 - j3) : this.f40512c;
    }

    /* renamed from: b */
    C10457c<V> m37255b(long j2, V v) {
        if (this.f40515f == 0) {
            return new C10457c<>(j2, v, this, this);
        }
        long j3 = this.f40511b;
        return j2 < j3 ? m37252d(this.f40513d.m37255b(j2 - j3, v), this.f40514e) : j2 > j3 ? m37252d(this.f40513d, this.f40514e.m37255b(j2 - j3, v)) : v == this.f40512c ? this : new C10457c<>(j2, v, this.f40513d, this.f40514e);
    }

    private C10457c(long j2, V v, C10457c<V> c10457c, C10457c<V> c10457c2) {
        this.f40511b = j2;
        this.f40512c = v;
        this.f40513d = c10457c;
        this.f40514e = c10457c2;
        this.f40515f = c10457c.f40515f + 1 + c10457c2.f40515f;
    }
}
