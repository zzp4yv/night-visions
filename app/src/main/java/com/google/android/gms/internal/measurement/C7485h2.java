package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* loaded from: classes2.dex */
final class C7485h2<T extends zzey<T>> {

    /* renamed from: a */
    private static final C7485h2 f27755a = new C7485h2(true);

    /* renamed from: b */
    final C7564u3<T, Object> f27756b;

    /* renamed from: c */
    private boolean f27757c;

    /* renamed from: d */
    private boolean f27758d;

    private C7485h2() {
        this.f27756b = C7564u3.m21419b(16);
    }

    /* renamed from: a */
    public static int m21106a(zzey<?> zzeyVar, Object obj) {
        zzim mo22251b = zzeyVar.mo22251b();
        int mo22250a = zzeyVar.mo22250a();
        if (!zzeyVar.mo22253d()) {
            return m21107b(mo22251b, mo22250a, obj);
        }
        int i2 = 0;
        if (zzeyVar.mo22254e()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += m21113i(mo22251b, it.next());
            }
            return zzen.m22191g0(mo22250a) + i2 + zzen.m22169D0(i2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i2 += m21107b(mo22251b, mo22250a, it2.next());
        }
        return i2;
    }

    /* renamed from: b */
    static int m21107b(zzim zzimVar, int i2, Object obj) {
        int m22191g0 = zzen.m22191g0(i2);
        if (zzimVar == zzim.f28186o) {
            zzff.m22292g((zzgo) obj);
            m22191g0 <<= 1;
        }
        return m22191g0 + m21113i(zzimVar, obj);
    }

    /* renamed from: c */
    public static <T extends zzey<T>> C7485h2<T> m21108c() {
        return f27755a;
    }

    /* renamed from: d */
    private final Object m21109d(T t) {
        Object obj = this.f27756b.get(t);
        if (!(obj instanceof zzfp)) {
            return obj;
        }
        return zzfp.m22304e();
    }

    /* renamed from: e */
    private static Object m21110e(Object obj) {
        if (obj instanceof zzgt) {
            return ((zzgt) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfp) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfi) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L4;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m21111g(com.google.android.gms.internal.measurement.zzim r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzff.m22289d(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C7479g2.f27730a
            com.google.android.gms.internal.measurement.zzip r2 = r2.m22342g()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgo
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfp
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfi
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzdu
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7485h2.m21111g(com.google.android.gms.internal.measurement.zzim, java.lang.Object):void");
    }

    /* renamed from: h */
    private static <T extends zzey<T>> boolean m21112h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo22252c() == zzip.MESSAGE) {
            if (key.mo22253d()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzgo) it.next()).mo22267b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzgo)) {
                    if (value instanceof zzfp) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzgo) value).mo22267b()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    private static int m21113i(zzim zzimVar, Object obj) {
        switch (C7479g2.f27731b[zzimVar.ordinal()]) {
            case 1:
                return zzen.m22209z(((Double) obj).doubleValue());
            case 2:
                return zzen.m22162A(((Float) obj).floatValue());
            case 3:
                return zzen.m22188d0(((Long) obj).longValue());
            case 4:
                return zzen.m22193i0(((Long) obj).longValue());
            case 5:
                return zzen.m22194k0(((Integer) obj).intValue());
            case 6:
                return zzen.m22201r0(((Long) obj).longValue());
            case 7:
                return zzen.m22206w0(((Integer) obj).intValue());
            case 8:
                return zzen.m22178L(((Boolean) obj).booleanValue());
            case 9:
                return zzen.m22182V((zzgo) obj);
            case 10:
                return obj instanceof zzfp ? zzen.m22187d((zzfp) obj) : zzen.m22176J((zzgo) obj);
            case 11:
                return obj instanceof zzdu ? zzen.m22175I((zzdu) obj) : zzen.m22177K((String) obj);
            case 12:
                return obj instanceof zzdu ? zzen.m22175I((zzdu) obj) : zzen.m22179M((byte[]) obj);
            case 13:
                return zzen.m22198o0(((Integer) obj).intValue());
            case 14:
                return zzen.m22210z0(((Integer) obj).intValue());
            case 15:
                return zzen.m22205v0(((Long) obj).longValue());
            case 16:
                return zzen.m22202s0(((Integer) obj).intValue());
            case 17:
                return zzen.m22197n0(((Long) obj).longValue());
            case 18:
                return obj instanceof zzfi ? zzen.m22165B0(((zzfi) obj).mo21566a()) : zzen.m22165B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: k */
    private final void m21114k(T t, Object obj) {
        if (!t.mo22253d()) {
            m21111g(t.mo22251b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                m21111g(t.mo22251b(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzfp) {
            this.f27758d = true;
        }
        this.f27756b.put(t, obj);
    }

    /* renamed from: l */
    private final void m21115l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfp) {
            value = zzfp.m22304e();
        }
        if (key.mo22253d()) {
            Object m21109d = m21109d(key);
            if (m21109d == null) {
                m21109d = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m21109d).add(m21110e(it.next()));
            }
            this.f27756b.put(key, m21109d);
            return;
        }
        if (key.mo22252c() != zzip.MESSAGE) {
            this.f27756b.put(key, m21110e(value));
            return;
        }
        Object m21109d2 = m21109d(key);
        if (m21109d2 == null) {
            this.f27756b.put(key, m21110e(value));
        } else {
            this.f27756b.put(key, m21109d2 instanceof zzgt ? key.mo22256z((zzgt) m21109d2, (zzgt) value) : key.mo22255o(((zzgo) m21109d2).mo22269e(), (zzgo) value).mo22283y());
        }
    }

    /* renamed from: m */
    private static int m21116m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.mo22252c() != zzip.MESSAGE || key.mo22253d() || key.mo22254e()) ? m21106a(key, value) : value instanceof zzfp ? zzen.m22168D(entry.getKey().mo22250a(), (zzfp) value) : zzen.m22170E(entry.getKey().mo22250a(), (zzgo) value);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C7485h2 c7485h2 = new C7485h2();
        for (int i2 = 0; i2 < this.f27756b.m21431k(); i2++) {
            Map.Entry<T, Object> m21429i = this.f27756b.m21429i(i2);
            c7485h2.m21114k(m21429i.getKey(), m21429i.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f27756b.m21432n()) {
            c7485h2.m21114k(entry.getKey(), entry.getValue());
        }
        c7485h2.f27758d = this.f27758d;
        return c7485h2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7485h2) {
            return this.f27756b.equals(((C7485h2) obj).f27756b);
        }
        return false;
    }

    /* renamed from: f */
    public final void m21117f(C7485h2<T> c7485h2) {
        for (int i2 = 0; i2 < c7485h2.f27756b.m21431k(); i2++) {
            m21115l(c7485h2.f27756b.m21429i(i2));
        }
        Iterator<Map.Entry<T, Object>> it = c7485h2.f27756b.m21432n().iterator();
        while (it.hasNext()) {
            m21115l(it.next());
        }
    }

    public final int hashCode() {
        return this.f27756b.hashCode();
    }

    /* renamed from: j */
    public final void m21118j() {
        if (this.f27757c) {
            return;
        }
        this.f27756b.mo21407e();
        this.f27757c = true;
    }

    /* renamed from: n */
    public final boolean m21119n() {
        return this.f27757c;
    }

    /* renamed from: o */
    public final Iterator<Map.Entry<T, Object>> m21120o() {
        return this.f27758d ? new C7539q2(this.f27756b.entrySet().iterator()) : this.f27756b.entrySet().iterator();
    }

    /* renamed from: p */
    final Iterator<Map.Entry<T, Object>> m21121p() {
        return this.f27758d ? new C7539q2(this.f27756b.m21433p().iterator()) : this.f27756b.m21433p().iterator();
    }

    /* renamed from: q */
    public final boolean m21122q() {
        for (int i2 = 0; i2 < this.f27756b.m21431k(); i2++) {
            if (!m21112h(this.f27756b.m21429i(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f27756b.m21432n().iterator();
        while (it.hasNext()) {
            if (!m21112h(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final int m21123r() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27756b.m21431k(); i3++) {
            i2 += m21116m(this.f27756b.m21429i(i3));
        }
        Iterator<Map.Entry<T, Object>> it = this.f27756b.m21432n().iterator();
        while (it.hasNext()) {
            i2 += m21116m(it.next());
        }
        return i2;
    }

    private C7485h2(boolean z) {
        this(C7564u3.m21419b(0));
        m21118j();
    }

    private C7485h2(C7564u3<T, Object> c7564u3) {
        this.f27756b = c7564u3;
        m21118j();
    }
}
