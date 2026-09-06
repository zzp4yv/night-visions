package p323h.p324a.p329z.p344j;

/* compiled from: OpenHashSet.java */
/* renamed from: h.a.z.j.e */
/* loaded from: classes2.dex */
public final class C9147e<T> {

    /* renamed from: a */
    final float f35282a;

    /* renamed from: b */
    int f35283b;

    /* renamed from: c */
    int f35284c;

    /* renamed from: d */
    int f35285d;

    /* renamed from: e */
    T[] f35286e;

    public C9147e() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m29395c(int i2) {
        int i3 = i2 * (-1640531527);
        return i3 ^ (i3 >>> 16);
    }

    /* renamed from: a */
    public boolean m29396a(T t) {
        T t2;
        T[] tArr = this.f35286e;
        int i2 = this.f35283b;
        int m29395c = m29395c(t.hashCode()) & i2;
        T t3 = tArr[m29395c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                m29395c = (m29395c + 1) & i2;
                t2 = tArr[m29395c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[m29395c] = t;
        int i3 = this.f35284c + 1;
        this.f35284c = i3;
        if (i3 >= this.f35285d) {
            m29398d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m29397b() {
        return this.f35286e;
    }

    /* renamed from: d */
    void m29398d() {
        T[] tArr = this.f35286e;
        int length = tArr.length;
        int i2 = length << 1;
        int i3 = i2 - 1;
        T[] tArr2 = (T[]) new Object[i2];
        int i4 = this.f35284c;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                this.f35283b = i3;
                this.f35285d = (int) (i2 * this.f35282a);
                this.f35286e = tArr2;
                return;
            }
            do {
                length--;
            } while (tArr[length] == null);
            int m29395c = m29395c(tArr[length].hashCode()) & i3;
            if (tArr2[m29395c] != null) {
                do {
                    m29395c = (m29395c + 1) & i3;
                } while (tArr2[m29395c] != null);
            }
            tArr2[m29395c] = tArr[length];
            i4 = i5;
        }
    }

    /* renamed from: e */
    public boolean m29399e(T t) {
        T t2;
        T[] tArr = this.f35286e;
        int i2 = this.f35283b;
        int m29395c = m29395c(t.hashCode()) & i2;
        T t3 = tArr[m29395c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m29400f(m29395c, tArr, i2);
        }
        do {
            m29395c = (m29395c + 1) & i2;
            t2 = tArr[m29395c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m29400f(m29395c, tArr, i2);
    }

    /* renamed from: f */
    boolean m29400f(int i2, T[] tArr, int i3) {
        int i4;
        T t;
        this.f35284c--;
        while (true) {
            int i5 = i2 + 1;
            while (true) {
                i4 = i5 & i3;
                t = tArr[i4];
                if (t == null) {
                    tArr[i2] = null;
                    return true;
                }
                int m29395c = m29395c(t.hashCode()) & i3;
                if (i2 > i4) {
                    if (i2 >= m29395c && m29395c > i4) {
                        break;
                    }
                    i5 = i4 + 1;
                } else if (i2 < m29395c && m29395c <= i4) {
                    i5 = i4 + 1;
                }
            }
            tArr[i2] = t;
            i2 = i4;
        }
    }

    public C9147e(int i2, float f2) {
        this.f35282a = f2;
        int m29401a = C9148f.m29401a(i2);
        this.f35283b = m29401a - 1;
        this.f35285d = (int) (f2 * m29401a);
        this.f35286e = (T[]) new Object[m29401a];
    }
}
