package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d;

/* compiled from: RopeByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s */
/* loaded from: classes3.dex */
class C10727s extends AbstractC10712d {

    /* renamed from: g */
    private static final int[] f41330g;

    /* renamed from: h */
    private final int f41331h;

    /* renamed from: i */
    private final AbstractC10712d f41332i;

    /* renamed from: j */
    private final AbstractC10712d f41333j;

    /* renamed from: k */
    private final int f41334k;

    /* renamed from: l */
    private final int f41335l;

    /* renamed from: m */
    private int f41336m;

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b */
    private static class b {

        /* renamed from: a */
        private final Stack<AbstractC10712d> f41337a;

        private b() {
            this.f41337a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public AbstractC10712d m38443b(AbstractC10712d abstractC10712d, AbstractC10712d abstractC10712d2) {
            m38444c(abstractC10712d);
            m38444c(abstractC10712d2);
            AbstractC10712d pop = this.f41337a.pop();
            while (!this.f41337a.isEmpty()) {
                pop = new C10727s(this.f41337a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m38444c(AbstractC10712d abstractC10712d) {
            if (abstractC10712d.mo38289s()) {
                m38446e(abstractC10712d);
                return;
            }
            if (abstractC10712d instanceof C10727s) {
                C10727s c10727s = (C10727s) abstractC10712d;
                m38444c(c10727s.f41332i);
                m38444c(c10727s.f41333j);
            } else {
                String valueOf = String.valueOf(abstractC10712d.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        private int m38445d(int i2) {
            int binarySearch = Arrays.binarySearch(C10727s.f41330g, i2);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m38446e(AbstractC10712d abstractC10712d) {
            int m38445d = m38445d(abstractC10712d.size());
            int i2 = C10727s.f41330g[m38445d + 1];
            if (this.f41337a.isEmpty() || this.f41337a.peek().size() >= i2) {
                this.f41337a.push(abstractC10712d);
                return;
            }
            int i3 = C10727s.f41330g[m38445d];
            AbstractC10712d pop = this.f41337a.pop();
            while (true) {
                if (this.f41337a.isEmpty() || this.f41337a.peek().size() >= i3) {
                    break;
                } else {
                    pop = new C10727s(this.f41337a.pop(), pop);
                }
            }
            C10727s c10727s = new C10727s(pop, abstractC10712d);
            while (!this.f41337a.isEmpty()) {
                if (this.f41337a.peek().size() >= C10727s.f41330g[m38445d(c10727s.size()) + 1]) {
                    break;
                } else {
                    c10727s = new C10727s(this.f41337a.pop(), c10727s);
                }
            }
            this.f41337a.push(c10727s);
        }
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$c */
    private static class c implements Iterator<C10722n> {

        /* renamed from: f */
        private final Stack<C10727s> f41338f;

        /* renamed from: g */
        private C10722n f41339g;

        /* renamed from: b */
        private C10722n m38447b(AbstractC10712d abstractC10712d) {
            while (abstractC10712d instanceof C10727s) {
                C10727s c10727s = (C10727s) abstractC10712d;
                this.f41338f.push(c10727s);
                abstractC10712d = c10727s.f41332i;
            }
            return (C10722n) abstractC10712d;
        }

        /* renamed from: c */
        private C10722n m38448c() {
            while (!this.f41338f.isEmpty()) {
                C10722n m38447b = m38447b(this.f41338f.pop().f41333j);
                if (!m38447b.isEmpty()) {
                    return m38447b;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C10722n next() {
            C10722n c10722n = this.f41339g;
            if (c10722n == null) {
                throw new NoSuchElementException();
            }
            this.f41339g = m38448c();
            return c10722n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41339g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(AbstractC10712d abstractC10712d) {
            this.f41338f = new Stack<>();
            this.f41339g = m38447b(abstractC10712d);
        }
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$d */
    private class d implements AbstractC10712d.a {

        /* renamed from: f */
        private final c f41340f;

        /* renamed from: g */
        private AbstractC10712d.a f41341g;

        /* renamed from: h */
        int f41342h;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo38274f());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d.a
        /* renamed from: f */
        public byte mo38274f() {
            if (!this.f41341g.hasNext()) {
                this.f41341g = this.f41340f.next().iterator();
            }
            this.f41342h--;
            return this.f41341g.mo38274f();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41342h > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(C10727s.this);
            this.f41340f = cVar;
            this.f41341g = cVar.next().iterator();
            this.f41342h = C10727s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        f41330g = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = f41330g;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            i5++;
        }
    }

    /* renamed from: O */
    static AbstractC10712d m38439O(AbstractC10712d abstractC10712d, AbstractC10712d abstractC10712d2) {
        C10727s c10727s = abstractC10712d instanceof C10727s ? (C10727s) abstractC10712d : null;
        if (abstractC10712d2.size() == 0) {
            return abstractC10712d;
        }
        if (abstractC10712d.size() != 0) {
            int size = abstractC10712d.size() + abstractC10712d2.size();
            if (size < 128) {
                return m38440P(abstractC10712d, abstractC10712d2);
            }
            if (c10727s != null && c10727s.f41333j.size() + abstractC10712d2.size() < 128) {
                abstractC10712d2 = new C10727s(c10727s.f41332i, m38440P(c10727s.f41333j, abstractC10712d2));
            } else {
                if (c10727s == null || c10727s.f41332i.mo38288r() <= c10727s.f41333j.mo38288r() || c10727s.mo38288r() <= abstractC10712d2.mo38288r()) {
                    return size >= f41330g[Math.max(abstractC10712d.mo38288r(), abstractC10712d2.mo38288r()) + 1] ? new C10727s(abstractC10712d, abstractC10712d2) : new b().m38443b(abstractC10712d, abstractC10712d2);
                }
                abstractC10712d2 = new C10727s(c10727s.f41332i, new C10727s(c10727s.f41333j, abstractC10712d2));
            }
        }
        return abstractC10712d2;
    }

    /* renamed from: P */
    private static C10722n m38440P(AbstractC10712d abstractC10712d, AbstractC10712d abstractC10712d2) {
        int size = abstractC10712d.size();
        int size2 = abstractC10712d2.size();
        byte[] bArr = new byte[size + size2];
        abstractC10712d.m38287o(bArr, 0, 0, size);
        abstractC10712d2.m38287o(bArr, 0, size, size2);
        return new C10722n(bArr);
    }

    /* renamed from: R */
    private boolean m38441R(AbstractC10712d abstractC10712d) {
        c cVar = new c(this);
        C10722n next = cVar.next();
        c cVar2 = new c(abstractC10712d);
        C10722n next2 = cVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = next.size() - i2;
            int size2 = next2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? next.m38434L(next2, i3, min) : next2.m38434L(next, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f41331h;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = cVar.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: C */
    public String mo38282C(String str) throws UnsupportedEncodingException {
        return new String(m38281A(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: F */
    void mo38285F(OutputStream outputStream, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        int i5 = this.f41334k;
        if (i4 <= i5) {
            this.f41332i.mo38285F(outputStream, i2, i3);
        } else {
            if (i2 >= i5) {
                this.f41333j.mo38285F(outputStream, i2 - i5, i3);
                return;
            }
            int i6 = i5 - i2;
            this.f41332i.mo38285F(outputStream, i2, i6);
            this.f41333j.mo38285F(outputStream, 0, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int mo38294z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10712d)) {
            return false;
        }
        AbstractC10712d abstractC10712d = (AbstractC10712d) obj;
        if (this.f41331h != abstractC10712d.size()) {
            return false;
        }
        if (this.f41331h == 0) {
            return true;
        }
        if (this.f41336m == 0 || (mo38294z = abstractC10712d.mo38294z()) == 0 || this.f41336m == mo38294z) {
            return m38441R(abstractC10712d);
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f41336m;
        if (i2 == 0) {
            int i3 = this.f41331h;
            i2 = mo38292x(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f41336m = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: q */
    protected void mo38271q(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.f41334k;
        if (i5 <= i6) {
            this.f41332i.mo38271q(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.f41333j.mo38271q(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.f41332i.mo38271q(bArr, i2, i3, i7);
            this.f41333j.mo38271q(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: r */
    protected int mo38288r() {
        return this.f41335l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: s */
    protected boolean mo38289s() {
        return this.f41331h >= f41330g[this.f41335l];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    public int size() {
        return this.f41331h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: t */
    public boolean mo38290t() {
        int mo38293y = this.f41332i.mo38293y(0, 0, this.f41334k);
        AbstractC10712d abstractC10712d = this.f41333j;
        return abstractC10712d.mo38293y(mo38293y, 0, abstractC10712d.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d, java.lang.Iterable
    /* renamed from: u */
    public AbstractC10712d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: v */
    public C10713e mo38291v() {
        return C10713e.m38308g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: x */
    protected int mo38292x(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f41334k;
        if (i5 <= i6) {
            return this.f41332i.mo38292x(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f41333j.mo38292x(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f41333j.mo38292x(this.f41332i.mo38292x(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: y */
    protected int mo38293y(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f41334k;
        if (i5 <= i6) {
            return this.f41332i.mo38293y(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f41333j.mo38293y(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f41333j.mo38293y(this.f41332i.mo38293y(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: z */
    protected int mo38294z() {
        return this.f41336m;
    }

    private C10727s(AbstractC10712d abstractC10712d, AbstractC10712d abstractC10712d2) {
        this.f41336m = 0;
        this.f41332i = abstractC10712d;
        this.f41333j = abstractC10712d2;
        int size = abstractC10712d.size();
        this.f41334k = size;
        this.f41331h = size + abstractC10712d2.size();
        this.f41335l = Math.max(abstractC10712d.mo38288r(), abstractC10712d2.mo38288r()) + 1;
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$e */
    private class e extends InputStream {

        /* renamed from: f */
        private c f41344f;

        /* renamed from: g */
        private C10722n f41345g;

        /* renamed from: h */
        private int f41346h;

        /* renamed from: i */
        private int f41347i;

        /* renamed from: j */
        private int f41348j;

        /* renamed from: k */
        private int f41349k;

        public e() {
            m38452b();
        }

        /* renamed from: a */
        private void m38451a() {
            if (this.f41345g != null) {
                int i2 = this.f41347i;
                int i3 = this.f41346h;
                if (i2 == i3) {
                    this.f41348j += i3;
                    this.f41347i = 0;
                    if (!this.f41344f.hasNext()) {
                        this.f41345g = null;
                        this.f41346h = 0;
                    } else {
                        C10722n next = this.f41344f.next();
                        this.f41345g = next;
                        this.f41346h = next.size();
                    }
                }
            }
        }

        /* renamed from: b */
        private void m38452b() {
            c cVar = new c(C10727s.this);
            this.f41344f = cVar;
            C10722n next = cVar.next();
            this.f41345g = next;
            this.f41346h = next.size();
            this.f41347i = 0;
            this.f41348j = 0;
        }

        /* renamed from: c */
        private int m38453c(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                m38451a();
                if (this.f41345g != null) {
                    int min = Math.min(this.f41346h - this.f41347i, i4);
                    if (bArr != null) {
                        this.f41345g.m38287o(bArr, this.f41347i, i2, min);
                        i2 += min;
                    }
                    this.f41347i += min;
                    i4 -= min;
                } else if (i4 == i3) {
                    return -1;
                }
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C10727s.this.size() - (this.f41348j + this.f41347i);
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f41349k = this.f41348j + this.f41347i;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            return m38453c(bArr, i2, i3);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m38452b();
            m38453c(null, 0, this.f41349k);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > 2147483647L) {
                j2 = 2147483647L;
            }
            return m38453c(null, 0, (int) j2);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m38451a();
            C10722n c10722n = this.f41345g;
            if (c10722n == null) {
                return -1;
            }
            int i2 = this.f41347i;
            this.f41347i = i2 + 1;
            return c10722n.mo38269G(i2) & 255;
        }
    }
}
