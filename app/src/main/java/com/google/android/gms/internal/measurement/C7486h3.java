package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h3 */
/* loaded from: classes2.dex */
final class C7486h3<T> implements InterfaceC7534p3<T> {

    /* renamed from: a */
    private final zzgo f27759a;

    /* renamed from: b */
    private final AbstractC7487h4<?, ?> f27760b;

    /* renamed from: c */
    private final boolean f27761c;

    /* renamed from: d */
    private final AbstractC7461d2<?> f27762d;

    private C7486h3(AbstractC7487h4<?, ?> abstractC7487h4, AbstractC7461d2<?> abstractC7461d2, zzgo zzgoVar) {
        this.f27760b = abstractC7487h4;
        this.f27761c = abstractC7461d2.mo21038h(zzgoVar);
        this.f27762d = abstractC7461d2;
        this.f27759a = zzgoVar;
    }

    /* renamed from: k */
    static <T> C7486h3<T> m21124k(AbstractC7487h4<?, ?> abstractC7487h4, AbstractC7461d2<?> abstractC7461d2, zzgo zzgoVar) {
        return new C7486h3<>(abstractC7487h4, abstractC7461d2, zzgoVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: a */
    public final T mo21095a() {
        return (T) this.f27759a.mo22270f().mo22282x();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: b */
    public final int mo21096b(T t) {
        AbstractC7487h4<?, ?> abstractC7487h4 = this.f27760b;
        int mo21142r = abstractC7487h4.mo21142r(abstractC7487h4.mo21135k(t)) + 0;
        return this.f27761c ? mo21142r + this.f27762d.mo21032b(t).m21123r() : mo21142r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: c */
    public final int mo21097c(T t) {
        int hashCode = this.f27760b.mo21135k(t).hashCode();
        return this.f27761c ? (hashCode * 53) + this.f27762d.mo21032b(t).hashCode() : hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo21098d(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.C7514m1 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfd r0 = (com.google.android.gms.internal.measurement.zzfd) r0
            com.google.android.gms.internal.measurement.zzhy r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzhy r2 = com.google.android.gms.internal.measurement.zzhy.m22330a()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhy r1 = com.google.android.gms.internal.measurement.zzhy.m22333g()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzfd$zzd r10 = (com.google.android.gms.internal.measurement.zzfd.zzd) r10
            r10.m22284B()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.C7496j1.m21157i(r11, r12, r14)
            int r2 = r14.f27837a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.d2<?> r12 = r9.f27762d
            com.google.android.gms.internal.measurement.zzeq r0 = r14.f27840d
            com.google.android.gms.internal.measurement.zzgo r3 = r9.f27759a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo21033c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.C7496j1.m21151c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.C7510l3.m21234a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.C7496j1.m21149a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.C7496j1.m21157i(r11, r4, r14)
            int r5 = r14.f27837a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.C7496j1.m21165q(r11, r4, r14)
            java.lang.Object r2 = r14.f27839c
            com.google.android.gms.internal.measurement.zzdu r2 = (com.google.android.gms.internal.measurement.zzdu) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.C7510l3.m21234a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.C7496j1.m21157i(r11, r4, r14)
            int r12 = r14.f27837a
            com.google.android.gms.internal.measurement.d2<?> r0 = r9.f27762d
            com.google.android.gms.internal.measurement.zzeq r5 = r14.f27840d
            com.google.android.gms.internal.measurement.zzgo r6 = r9.f27759a
            java.lang.Object r0 = r0.mo21033c(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.C7496j1.m21149a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m22334c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfo r10 = com.google.android.gms.internal.measurement.zzfo.m22302g()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7486h3.mo21098d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.m1):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: e */
    public final boolean mo21099e(T t) {
        return this.f27762d.mo21032b(t).m21122q();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: f */
    public final void mo21100f(T t) {
        this.f27760b.mo21141q(t);
        this.f27762d.mo21040j(t);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: g */
    public final boolean mo21101g(T t, T t2) {
        if (!this.f27760b.mo21135k(t).equals(this.f27760b.mo21135k(t2))) {
            return false;
        }
        if (this.f27761c) {
            return this.f27762d.mo21032b(t).equals(this.f27762d.mo21032b(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: h */
    public final void mo21102h(T t, InterfaceC7589y4 interfaceC7589y4) throws IOException {
        Iterator<Map.Entry<?, Object>> m21120o = this.f27762d.mo21032b(t).m21120o();
        while (m21120o.hasNext()) {
            Map.Entry<?, Object> next = m21120o.next();
            zzey zzeyVar = (zzey) next.getKey();
            if (zzeyVar.mo22252c() != zzip.MESSAGE || zzeyVar.mo22253d() || zzeyVar.mo22254e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C7527o2) {
                interfaceC7589y4.mo21008f(zzeyVar.mo22250a(), ((C7527o2) next).m21265a().m22309d());
            } else {
                interfaceC7589y4.mo21008f(zzeyVar.mo22250a(), next.getValue());
            }
        }
        AbstractC7487h4<?, ?> abstractC7487h4 = this.f27760b;
        abstractC7487h4.mo21137m(abstractC7487h4.mo21135k(t), interfaceC7589y4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: i */
    public final void mo21103i(T t, InterfaceC7540q3 interfaceC7540q3, zzeq zzeqVar) throws IOException {
        boolean z;
        AbstractC7487h4<?, ?> abstractC7487h4 = this.f27760b;
        AbstractC7461d2<?> abstractC7461d2 = this.f27762d;
        Object mo21139o = abstractC7487h4.mo21139o(t);
        C7485h2<?> mo21039i = abstractC7461d2.mo21039i(t);
        do {
            try {
                if (interfaceC7540q3.mo21306a() == Integer.MAX_VALUE) {
                    return;
                }
                int mo21307b = interfaceC7540q3.mo21307b();
                if (mo21307b == 11) {
                    int i2 = 0;
                    Object obj = null;
                    zzdu zzduVar = null;
                    while (interfaceC7540q3.mo21306a() != Integer.MAX_VALUE) {
                        int mo21307b2 = interfaceC7540q3.mo21307b();
                        if (mo21307b2 == 16) {
                            i2 = interfaceC7540q3.mo21321p();
                            obj = abstractC7461d2.mo21033c(zzeqVar, this.f27759a, i2);
                        } else if (mo21307b2 == 26) {
                            if (obj != null) {
                                abstractC7461d2.mo21036f(interfaceC7540q3, obj, zzeqVar, mo21039i);
                            } else {
                                zzduVar = interfaceC7540q3.mo21311f();
                            }
                        } else if (!interfaceC7540q3.mo21308c()) {
                            break;
                        }
                    }
                    if (interfaceC7540q3.mo21307b() != 12) {
                        throw zzfo.m22300e();
                    }
                    if (zzduVar != null) {
                        if (obj != null) {
                            abstractC7461d2.mo21035e(zzduVar, obj, zzeqVar, mo21039i);
                        } else {
                            abstractC7487h4.mo21129e(mo21139o, i2, zzduVar);
                        }
                    }
                } else if ((mo21307b & 7) == 2) {
                    Object mo21033c = abstractC7461d2.mo21033c(zzeqVar, this.f27759a, mo21307b >>> 3);
                    if (mo21033c != null) {
                        abstractC7461d2.mo21036f(interfaceC7540q3, mo21033c, zzeqVar, mo21039i);
                    } else {
                        z = abstractC7487h4.m21134j(mo21139o, interfaceC7540q3);
                    }
                } else {
                    z = interfaceC7540q3.mo21308c();
                }
                z = true;
            } finally {
                abstractC7487h4.mo21138n(t, mo21139o);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: j */
    public final void mo21104j(T t, T t2) {
        C7546r3.m21380o(this.f27760b, t, t2);
        if (this.f27761c) {
            C7546r3.m21378m(this.f27762d, t, t2);
        }
    }
}
