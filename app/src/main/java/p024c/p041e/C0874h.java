package p024c.p041e;

/* compiled from: SparseArrayCompat.java */
/* renamed from: c.e.h */
/* loaded from: classes.dex */
public class C0874h<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f5759f = new Object();

    /* renamed from: g */
    private boolean f5760g;

    /* renamed from: h */
    private int[] f5761h;

    /* renamed from: i */
    private Object[] f5762i;

    /* renamed from: j */
    private int f5763j;

    public C0874h() {
        this(10);
    }

    /* renamed from: f */
    private void m5478f() {
        int i2 = this.f5763j;
        int[] iArr = this.f5761h;
        Object[] objArr = this.f5762i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f5759f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f5760g = false;
        this.f5763j = i3;
    }

    /* renamed from: b */
    public void m5479b(int i2, E e2) {
        int i3 = this.f5763j;
        if (i3 != 0 && i2 <= this.f5761h[i3 - 1]) {
            m5486k(i2, e2);
            return;
        }
        if (this.f5760g && i3 >= this.f5761h.length) {
            m5478f();
        }
        int i4 = this.f5763j;
        if (i4 >= this.f5761h.length) {
            int m5432e = C0869c.m5432e(i4 + 1);
            int[] iArr = new int[m5432e];
            Object[] objArr = new Object[m5432e];
            int[] iArr2 = this.f5761h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5762i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5761h = iArr;
            this.f5762i = objArr;
        }
        this.f5761h[i4] = i2;
        this.f5762i[i4] = e2;
        this.f5763j = i4 + 1;
    }

    /* renamed from: d */
    public void m5480d() {
        int i2 = this.f5763j;
        Object[] objArr = this.f5762i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f5763j = 0;
        this.f5760g = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0874h<E> clone() {
        try {
            C0874h<E> c0874h = (C0874h) super.clone();
            c0874h.f5761h = (int[]) this.f5761h.clone();
            c0874h.f5762i = (Object[]) this.f5762i.clone();
            return c0874h;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: g */
    public E m5482g(int i2) {
        return m5483h(i2, null);
    }

    /* renamed from: h */
    public E m5483h(int i2, E e2) {
        int m5428a = C0869c.m5428a(this.f5761h, this.f5763j, i2);
        if (m5428a >= 0) {
            Object[] objArr = this.f5762i;
            if (objArr[m5428a] != f5759f) {
                return (E) objArr[m5428a];
            }
        }
        return e2;
    }

    /* renamed from: i */
    public int m5484i(E e2) {
        if (this.f5760g) {
            m5478f();
        }
        for (int i2 = 0; i2 < this.f5763j; i2++) {
            if (this.f5762i[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public int m5485j(int i2) {
        if (this.f5760g) {
            m5478f();
        }
        return this.f5761h[i2];
    }

    /* renamed from: k */
    public void m5486k(int i2, E e2) {
        int m5428a = C0869c.m5428a(this.f5761h, this.f5763j, i2);
        if (m5428a >= 0) {
            this.f5762i[m5428a] = e2;
            return;
        }
        int i3 = m5428a ^ (-1);
        int i4 = this.f5763j;
        if (i3 < i4) {
            Object[] objArr = this.f5762i;
            if (objArr[i3] == f5759f) {
                this.f5761h[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f5760g && i4 >= this.f5761h.length) {
            m5478f();
            i3 = C0869c.m5428a(this.f5761h, this.f5763j, i2) ^ (-1);
        }
        int i5 = this.f5763j;
        if (i5 >= this.f5761h.length) {
            int m5432e = C0869c.m5432e(i5 + 1);
            int[] iArr = new int[m5432e];
            Object[] objArr2 = new Object[m5432e];
            int[] iArr2 = this.f5761h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5762i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5761h = iArr;
            this.f5762i = objArr2;
        }
        int i6 = this.f5763j;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f5761h;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f5762i;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f5763j - i3);
        }
        this.f5761h[i3] = i2;
        this.f5762i[i3] = e2;
        this.f5763j++;
    }

    /* renamed from: l */
    public int m5487l() {
        if (this.f5760g) {
            m5478f();
        }
        return this.f5763j;
    }

    /* renamed from: m */
    public E m5488m(int i2) {
        if (this.f5760g) {
            m5478f();
        }
        return (E) this.f5762i[i2];
    }

    public String toString() {
        if (m5487l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5763j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5763j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m5485j(i2));
            sb.append('=');
            E m5488m = m5488m(i2);
            if (m5488m != this) {
                sb.append(m5488m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0874h(int i2) {
        this.f5760g = false;
        if (i2 == 0) {
            this.f5761h = C0869c.f5721a;
            this.f5762i = C0869c.f5723c;
        } else {
            int m5432e = C0869c.m5432e(i2);
            this.f5761h = new int[m5432e];
            this.f5762i = new Object[m5432e];
        }
    }
}
