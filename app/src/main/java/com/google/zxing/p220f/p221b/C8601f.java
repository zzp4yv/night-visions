package com.google.zxing.p220f.p221b;

import com.google.zxing.p222g.C8603a;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: State.java */
/* renamed from: com.google.zxing.f.b.f */
/* loaded from: classes2.dex */
final class C8601f {

    /* renamed from: a */
    static final C8601f f32786a = new C8601f(AbstractC8602g.f32791a, 0, 0, 0);

    /* renamed from: b */
    private final int f32787b;

    /* renamed from: c */
    private final AbstractC8602g f32788c;

    /* renamed from: d */
    private final int f32789d;

    /* renamed from: e */
    private final int f32790e;

    private C8601f(AbstractC8602g abstractC8602g, int i2, int i3, int i4) {
        this.f32788c = abstractC8602g;
        this.f32787b = i2;
        this.f32789d = i3;
        this.f32790e = i4;
    }

    /* renamed from: a */
    C8601f m27269a(int i2) {
        AbstractC8602g abstractC8602g = this.f32788c;
        int i3 = this.f32787b;
        int i4 = this.f32790e;
        if (i3 == 4 || i3 == 2) {
            int i5 = C8599d.f32779b[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC8602g = abstractC8602g.m27278a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f32789d;
        C8601f c8601f = new C8601f(abstractC8602g, i3, i8 + 1, i4 + ((i8 == 0 || i8 == 31) ? 18 : i8 == 62 ? 9 : 8));
        return c8601f.f32789d == 2078 ? c8601f.m27270b(i2 + 1) : c8601f;
    }

    /* renamed from: b */
    C8601f m27270b(int i2) {
        int i3 = this.f32789d;
        return i3 == 0 ? this : new C8601f(this.f32788c.m27279b(i2 - i3, i3), this.f32787b, 0, this.f32790e);
    }

    /* renamed from: c */
    int m27271c() {
        return this.f32789d;
    }

    /* renamed from: d */
    int m27272d() {
        return this.f32790e;
    }

    /* renamed from: e */
    int m27273e() {
        return this.f32787b;
    }

    /* renamed from: f */
    boolean m27274f(C8601f c8601f) {
        int i2;
        int i3 = this.f32790e + (C8599d.f32779b[this.f32787b][c8601f.f32787b] >> 16);
        int i4 = c8601f.f32789d;
        if (i4 > 0 && ((i2 = this.f32789d) == 0 || i2 > i4)) {
            i3 += 10;
        }
        return i3 <= c8601f.f32790e;
    }

    /* renamed from: g */
    C8601f m27275g(int i2, int i3) {
        int i4 = this.f32790e;
        AbstractC8602g abstractC8602g = this.f32788c;
        int i5 = this.f32787b;
        if (i2 != i5) {
            int i6 = C8599d.f32779b[i5][i2];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            abstractC8602g = abstractC8602g.m27278a(i7, i8);
            i4 += i8;
        }
        int i9 = i2 == 2 ? 4 : 5;
        return new C8601f(abstractC8602g.m27278a(i3, i9), i2, 0, i4 + i9);
    }

    /* renamed from: h */
    C8601f m27276h(int i2, int i3) {
        AbstractC8602g abstractC8602g = this.f32788c;
        int i4 = this.f32787b;
        int i5 = i4 == 2 ? 4 : 5;
        return new C8601f(abstractC8602g.m27278a(C8599d.f32781d[i4][i2], i5).m27278a(i3, 5), this.f32787b, 0, this.f32790e + i5 + 5);
    }

    /* renamed from: i */
    C8603a m27277i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC8602g abstractC8602g = m27270b(bArr.length).f32788c; abstractC8602g != null; abstractC8602g = abstractC8602g.m27280d()) {
            linkedList.addFirst(abstractC8602g);
        }
        C8603a c8603a = new C8603a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((AbstractC8602g) it.next()).mo27252c(c8603a, bArr);
        }
        return c8603a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", C8599d.f32778a[this.f32787b], Integer.valueOf(this.f32790e), Integer.valueOf(this.f32789d));
    }
}
