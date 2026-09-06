package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.cu */
/* loaded from: classes2.dex */
final class C6542cu extends AbstractC7355yt<Boolean> implements zzdoj<Boolean>, InterfaceC6655fw, RandomAccess {

    /* renamed from: g */
    private static final C6542cu f18468g;

    /* renamed from: h */
    private boolean[] f18469h;

    /* renamed from: i */
    private int f18470i;

    static {
        C6542cu c6542cu = new C6542cu(new boolean[0], 0);
        f18468g = c6542cu;
        c6542cu.mo16108x0();
    }

    C6542cu() {
        this(new boolean[10], 0);
    }

    /* renamed from: g */
    private final void m14986g(int i2) {
        if (i2 < 0 || i2 >= this.f18470i) {
            throw new IndexOutOfBoundsException(m14987h(i2));
        }
    }

    /* renamed from: h */
    private final String m14987h(int i2) {
        int i3 = this.f18470i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m14988i(int i2, boolean z) {
        int i3;
        m16106c();
        if (i2 < 0 || i2 > (i3 = this.f18470i)) {
            throw new IndexOutOfBoundsException(m14987h(i2));
        }
        boolean[] zArr = this.f18469h;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f18469h, i2, zArr2, i2 + 1, this.f18470i - i2);
            this.f18469h = zArr2;
        }
        this.f18469h[i2] = z;
        this.f18470i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj<Boolean> mo14989N(int i2) {
        if (i2 >= this.f18470i) {
            return new C6542cu(Arrays.copyOf(this.f18469h, i2), this.f18470i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m14988i(i2, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7355yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m16106c();
        zzdod.m19740a(collection);
        if (!(collection instanceof C6542cu)) {
            return super.addAll(collection);
        }
        C6542cu c6542cu = (C6542cu) collection;
        int i2 = c6542cu.f18470i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f18470i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f18469h;
        if (i4 > zArr.length) {
            this.f18469h = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(c6542cu.f18469h, 0, this.f18469h, this.f18470i, c6542cu.f18470i);
        this.f18470i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7355yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6542cu)) {
            return super.equals(obj);
        }
        C6542cu c6542cu = (C6542cu) obj;
        if (this.f18470i != c6542cu.f18470i) {
            return false;
        }
        boolean[] zArr = c6542cu.f18469h;
        for (int i2 = 0; i2 < this.f18470i; i2++) {
            if (this.f18469h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m14990f(boolean z) {
        m14988i(this.f18470i, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m14986g(i2);
        return Boolean.valueOf(this.f18469h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7355yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f18470i; i3++) {
            i2 = (i2 * 31) + zzdod.m19747h(this.f18469h[i3]);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7355yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m16106c();
        for (int i2 = 0; i2 < this.f18470i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f18469h[i2]))) {
                boolean[] zArr = this.f18469h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f18470i - i2) - 1);
                this.f18470i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        m16106c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f18469h;
        System.arraycopy(zArr, i3, zArr, i2, this.f18470i - i3);
        this.f18470i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m16106c();
        m14986g(i2);
        boolean[] zArr = this.f18469h;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18470i;
    }

    private C6542cu(boolean[] zArr, int i2) {
        this.f18469h = zArr;
        this.f18470i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        m14986g(i2);
        boolean[] zArr = this.f18469h;
        boolean z = zArr[i2];
        if (i2 < this.f18470i - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f18470i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
