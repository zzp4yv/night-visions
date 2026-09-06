package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vx */
/* loaded from: classes2.dex */
final class C7248vx implements Cloneable {

    /* renamed from: f */
    private zzdrs<?, ?> f20760f;

    /* renamed from: g */
    private Object f20761g;

    /* renamed from: h */
    private List<Object> f20762h = new ArrayList();

    C7248vx() {
    }

    /* renamed from: b */
    private final byte[] m15968b() throws IOException {
        byte[] bArr = new byte[m15971f()];
        m15970d(zzdrp.m19796e(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C7248vx clone() {
        C7248vx c7248vx = new C7248vx();
        try {
            c7248vx.f20760f = this.f20760f;
            List<Object> list = this.f20762h;
            if (list == null) {
                c7248vx.f20762h = null;
            } else {
                c7248vx.f20762h.addAll(list);
            }
            Object obj = this.f20761g;
            if (obj != null) {
                if (obj instanceof zzdrw) {
                    c7248vx.f20761g = (zzdrw) ((zzdrw) obj).clone();
                } else if (obj instanceof byte[]) {
                    c7248vx.f20761g = ((byte[]) obj).clone();
                } else {
                    int i2 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        c7248vx.f20761g = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (obj instanceof boolean[]) {
                        c7248vx.f20761g = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        c7248vx.f20761g = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        c7248vx.f20761g = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        c7248vx.f20761g = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        c7248vx.f20761g = ((double[]) obj).clone();
                    } else if (obj instanceof zzdrw[]) {
                        zzdrw[] zzdrwVarArr = (zzdrw[]) obj;
                        zzdrw[] zzdrwVarArr2 = new zzdrw[zzdrwVarArr.length];
                        c7248vx.f20761g = zzdrwVarArr2;
                        while (i2 < zzdrwVarArr.length) {
                            zzdrwVarArr2[i2] = (zzdrw) zzdrwVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
            }
            return c7248vx;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    final void m15970d(zzdrp zzdrpVar) throws IOException {
        if (this.f20761g != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f20762h.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7248vx)) {
            return false;
        }
        C7248vx c7248vx = (C7248vx) obj;
        if (this.f20761g == null || c7248vx.f20761g == null) {
            List<Object> list2 = this.f20762h;
            if (list2 != null && (list = c7248vx.f20762h) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m15968b(), c7248vx.m15968b());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzdrs<?, ?> zzdrsVar = this.f20760f;
        if (zzdrsVar != c7248vx.f20760f) {
            return false;
        }
        if (!zzdrsVar.f25845a.isArray()) {
            return this.f20761g.equals(c7248vx.f20761g);
        }
        Object obj2 = this.f20761g;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) c7248vx.f20761g) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) c7248vx.f20761g) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) c7248vx.f20761g) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) c7248vx.f20761g) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) c7248vx.f20761g) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) c7248vx.f20761g) : Arrays.deepEquals((Object[]) obj2, (Object[]) c7248vx.f20761g);
    }

    /* renamed from: f */
    final int m15971f() {
        if (this.f20761g != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f20762h.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m15968b()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
