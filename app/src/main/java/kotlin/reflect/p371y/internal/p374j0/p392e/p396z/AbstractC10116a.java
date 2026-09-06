package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10768m;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: BinaryVersion.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10116a {

    /* renamed from: a */
    public static final a f39183a = new a(null);

    /* renamed from: b */
    private final int[] f39184b;

    /* renamed from: c */
    private final int f39185c;

    /* renamed from: d */
    private final int f39186d;

    /* renamed from: e */
    private final int f39187e;

    /* renamed from: f */
    private final List<Integer> f39188f;

    /* compiled from: BinaryVersion.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.z.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public AbstractC10116a(int... iArr) {
        Integer m38722B;
        Integer m38722B2;
        Integer m38722B3;
        List<Integer> m38888j;
        List<Integer> m38701b;
        C9768m.m32346f(iArr, "numbers");
        this.f39184b = iArr;
        m38722B = C10770n.m38722B(iArr, 0);
        this.f39185c = m38722B != null ? m38722B.intValue() : -1;
        m38722B2 = C10770n.m38722B(iArr, 1);
        this.f39186d = m38722B2 != null ? m38722B2.intValue() : -1;
        m38722B3 = C10770n.m38722B(iArr, 2);
        this.f39187e = m38722B3 != null ? m38722B3.intValue() : -1;
        if (iArr.length <= 3) {
            m38888j = C10784u.m38888j();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            m38701b = C10768m.m38701b(iArr);
            m38888j = C10749c0.m38569E0(m38701b.subList(3, iArr.length));
        }
        this.f39188f = m38888j;
    }

    /* renamed from: a */
    public final int m35358a() {
        return this.f39185c;
    }

    /* renamed from: b */
    public final int m35359b() {
        return this.f39186d;
    }

    /* renamed from: c */
    public final boolean m35360c(int i2, int i3, int i4) {
        int i5 = this.f39185c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        int i6 = this.f39186d;
        if (i6 > i3) {
            return true;
        }
        return i6 >= i3 && this.f39187e >= i4;
    }

    /* renamed from: d */
    public final boolean m35361d(AbstractC10116a abstractC10116a) {
        C9768m.m32346f(abstractC10116a, "version");
        return m35360c(abstractC10116a.f39185c, abstractC10116a.f39186d, abstractC10116a.f39187e);
    }

    /* renamed from: e */
    public final boolean m35362e(int i2, int i3, int i4) {
        int i5 = this.f39185c;
        if (i5 < i2) {
            return true;
        }
        if (i5 > i2) {
            return false;
        }
        int i6 = this.f39186d;
        if (i6 < i3) {
            return true;
        }
        return i6 <= i3 && this.f39187e <= i4;
    }

    public boolean equals(Object obj) {
        if (obj != null && C9768m.m32341a(getClass(), obj.getClass())) {
            AbstractC10116a abstractC10116a = (AbstractC10116a) obj;
            if (this.f39185c == abstractC10116a.f39185c && this.f39186d == abstractC10116a.f39186d && this.f39187e == abstractC10116a.f39187e && C9768m.m32341a(this.f39188f, abstractC10116a.f39188f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    protected final boolean m35363f(AbstractC10116a abstractC10116a) {
        C9768m.m32346f(abstractC10116a, "ourVersion");
        int i2 = this.f39185c;
        if (i2 == 0) {
            if (abstractC10116a.f39185c == 0 && this.f39186d == abstractC10116a.f39186d) {
                return true;
            }
        } else if (i2 == abstractC10116a.f39185c && this.f39186d <= abstractC10116a.f39186d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] m35364g() {
        return this.f39184b;
    }

    public int hashCode() {
        int i2 = this.f39185c;
        int i3 = i2 + (i2 * 31) + this.f39186d;
        int i4 = i3 + (i3 * 31) + this.f39187e;
        return i4 + (i4 * 31) + this.f39188f.hashCode();
    }

    public String toString() {
        String m38599e0;
        int[] m35364g = m35364g();
        ArrayList arrayList = new ArrayList();
        int length = m35364g.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = m35364g[i2];
            if (!(i3 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        m38599e0 = C10749c0.m38599e0(arrayList, ".", null, null, 0, null, null, 62, null);
        return m38599e0;
    }
}
