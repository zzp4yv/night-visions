package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d;

/* compiled from: LiteralByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n */
/* loaded from: classes3.dex */
class C10722n extends AbstractC10712d {

    /* renamed from: g */
    protected final byte[] f41325g;

    /* renamed from: h */
    private int f41326h = 0;

    /* compiled from: LiteralByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n$b */
    private class b implements AbstractC10712d.a {

        /* renamed from: f */
        private int f41327f;

        /* renamed from: g */
        private final int f41328g;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo38274f());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d.a
        /* renamed from: f */
        public byte mo38274f() {
            try {
                byte[] bArr = C10722n.this.f41325g;
                int i2 = this.f41327f;
                this.f41327f = i2 + 1;
                return bArr[i2];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41327f < this.f41328g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f41327f = 0;
            this.f41328g = C10722n.this.size();
        }
    }

    C10722n(byte[] bArr) {
        this.f41325g = bArr;
    }

    /* renamed from: O */
    static int m38433O(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: C */
    public String mo38282C(String str) throws UnsupportedEncodingException {
        return new String(this.f41325g, mo38270M(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: F */
    void mo38285F(OutputStream outputStream, int i2, int i3) throws IOException {
        outputStream.write(this.f41325g, mo38270M() + i2, i3);
    }

    /* renamed from: G */
    public byte mo38269G(int i2) {
        return this.f41325g[i2];
    }

    /* renamed from: L */
    boolean m38434L(C10722n c10722n, int i2, int i3) {
        if (i3 > c10722n.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 + i3 > c10722n.size()) {
            int size2 = c10722n.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f41325g;
        byte[] bArr2 = c10722n.f41325g;
        int mo38270M = mo38270M() + i3;
        int mo38270M2 = mo38270M();
        int mo38270M3 = c10722n.mo38270M() + i2;
        while (mo38270M2 < mo38270M) {
            if (bArr[mo38270M2] != bArr2[mo38270M3]) {
                return false;
            }
            mo38270M2++;
            mo38270M3++;
        }
        return true;
    }

    /* renamed from: M */
    protected int mo38270M() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10712d) || size() != ((AbstractC10712d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C10722n) {
            return m38434L((C10722n) obj, 0, size());
        }
        if (obj instanceof C10727s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i2 = this.f41326h;
        if (i2 == 0) {
            int size = size();
            i2 = mo38292x(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f41326h = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: q */
    protected void mo38271q(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f41325g, i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: r */
    protected int mo38288r() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: s */
    protected boolean mo38289s() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    public int size() {
        return this.f41325g.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: t */
    public boolean mo38290t() {
        int mo38270M = mo38270M();
        return C10730v.m38490f(this.f41325g, mo38270M, size() + mo38270M);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d, java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC10712d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: v */
    public C10713e mo38291v() {
        return C10713e.m38309h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: x */
    protected int mo38292x(int i2, int i3, int i4) {
        return m38433O(i2, this.f41325g, mo38270M() + i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: y */
    protected int mo38293y(int i2, int i3, int i4) {
        int mo38270M = mo38270M() + i3;
        return C10730v.m38491g(i2, this.f41325g, mo38270M, i4 + mo38270M);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
    /* renamed from: z */
    protected int mo38294z() {
        return this.f41326h;
    }
}
