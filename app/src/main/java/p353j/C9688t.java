package p353j;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.C9756g;

/* compiled from: Options.kt */
/* renamed from: j.t */
/* loaded from: classes3.dex */
public final class C9688t extends AbstractList<C9677i> implements RandomAccess {

    /* renamed from: g */
    public static final a f37072g = new a(null);

    /* renamed from: h */
    private final C9677i[] f37073h;

    /* renamed from: i */
    private final int[] f37074i;

    /* compiled from: Options.kt */
    /* renamed from: j.t$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        private final void m32150a(long j2, C9670f c9670f, int i2, List<? extends C9677i> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            C9670f c9670f2;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (!(list.get(i10).m32093P() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C9677i c9677i = list.get(i3);
            C9677i c9677i2 = list.get(i4 - 1);
            if (i9 == c9677i.m32093P()) {
                int intValue = list2.get(i3).intValue();
                int i11 = i3 + 1;
                C9677i c9677i3 = list.get(i11);
                i5 = i11;
                i6 = intValue;
                c9677i = c9677i3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (c9677i.m32097x(i9) == c9677i2.m32097x(i9)) {
                int min = Math.min(c9677i.m32093P(), c9677i2.m32093P());
                int i12 = 0;
                for (int i13 = i9; i13 < min && c9677i.m32097x(i13) == c9677i2.m32097x(i13); i13++) {
                    i12++;
                }
                long m32152c = j2 + m32152c(c9670f) + 2 + i12 + 1;
                c9670f.writeInt(-i12);
                c9670f.writeInt(i6);
                int i14 = i9 + i12;
                while (i9 < i14) {
                    c9670f.writeInt(c9677i.m32097x(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (!(i14 == list.get(i5).m32093P())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c9670f.writeInt(list2.get(i5).intValue());
                    return;
                } else {
                    C9670f c9670f3 = new C9670f();
                    c9670f.writeInt(((int) (m32152c(c9670f3) + m32152c)) * (-1));
                    m32150a(m32152c, c9670f3, i14, list, i5, i4, list2);
                    c9670f.mo31999B0(c9670f3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i5 + 1; i16 < i4; i16++) {
                if (list.get(i16 - 1).m32097x(i9) != list.get(i16).m32097x(i9)) {
                    i15++;
                }
            }
            long m32152c2 = j2 + m32152c(c9670f) + 2 + (i15 * 2);
            c9670f.writeInt(i15);
            c9670f.writeInt(i6);
            for (int i17 = i5; i17 < i4; i17++) {
                byte m32097x = list.get(i17).m32097x(i9);
                if (i17 == i5 || m32097x != list.get(i17 - 1).m32097x(i9)) {
                    c9670f.writeInt(m32097x & 255);
                }
            }
            C9670f c9670f4 = new C9670f();
            while (i5 < i4) {
                byte m32097x2 = list.get(i5).m32097x(i9);
                int i18 = i5 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (m32097x2 != list.get(i19).m32097x(i9)) {
                            i7 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i7 && i9 + 1 == list.get(i5).m32093P()) {
                    c9670f.writeInt(list2.get(i5).intValue());
                    i8 = i7;
                    c9670f2 = c9670f4;
                } else {
                    c9670f.writeInt(((int) (m32152c2 + m32152c(c9670f4))) * (-1));
                    i8 = i7;
                    c9670f2 = c9670f4;
                    m32150a(m32152c2, c9670f4, i9 + 1, list, i5, i7, list2);
                }
                c9670f4 = c9670f2;
                i5 = i8;
            }
            c9670f.mo31999B0(c9670f4);
        }

        /* renamed from: b */
        static /* synthetic */ void m32151b(a aVar, long j2, C9670f c9670f, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            aVar.m32150a((i5 & 1) != 0 ? 0L : j2, c9670f, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        /* renamed from: c */
        private final long m32152c(C9670f c9670f) {
            return c9670f.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p353j.C9688t m32153d(p353j.C9677i... r17) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p353j.C9688t.a.m32153d(j.i[]):j.t");
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public /* synthetic */ C9688t(C9677i[] c9677iArr, int[] iArr, C9756g c9756g) {
        this(c9677iArr, iArr);
    }

    /* renamed from: r */
    public static final C9688t m32142r(C9677i... c9677iArr) {
        return f37072g.m32153d(c9677iArr);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: c */
    public int getF41452i() {
        return this.f37073h.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9677i) {
            return m32144f((C9677i) obj);
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ boolean m32144f(C9677i c9677i) {
        return super.contains(c9677i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9677i get(int i2) {
        return this.f37073h[i2];
    }

    /* renamed from: i */
    public final C9677i[] m32146i() {
        return this.f37073h;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9677i) {
            return m32148o((C9677i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9677i) {
            return m32149q((C9677i) obj);
        }
        return -1;
    }

    /* renamed from: n */
    public final int[] m32147n() {
        return this.f37074i;
    }

    /* renamed from: o */
    public /* bridge */ int m32148o(C9677i c9677i) {
        return super.indexOf(c9677i);
    }

    /* renamed from: q */
    public /* bridge */ int m32149q(C9677i c9677i) {
        return super.lastIndexOf(c9677i);
    }

    private C9688t(C9677i[] c9677iArr, int[] iArr) {
        this.f37073h = c9677iArr;
        this.f37074i = iArr;
    }
}
