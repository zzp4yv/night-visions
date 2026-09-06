package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bw */
/* loaded from: classes2.dex */
final class C6507bw<T> implements InterfaceC6877lw<T> {

    /* renamed from: a */
    private final zzdpk f18366a;

    /* renamed from: b */
    private final AbstractC6545cx<?, ?> f18367b;

    /* renamed from: c */
    private final boolean f18368c;

    /* renamed from: d */
    private final AbstractC7245vu<?> f18369d;

    private C6507bw(AbstractC6545cx<?, ?> abstractC6545cx, AbstractC7245vu<?> abstractC7245vu, zzdpk zzdpkVar) {
        this.f18367b = abstractC6545cx;
        this.f18368c = abstractC7245vu.mo15964h(zzdpkVar);
        this.f18369d = abstractC7245vu;
        this.f18366a = zzdpkVar;
    }

    /* renamed from: k */
    static <T> C6507bw<T> m14953k(AbstractC6545cx<?, ?> abstractC6545cx, AbstractC7245vu<?> abstractC7245vu, zzdpk zzdpkVar) {
        return new C6507bw<>(abstractC6545cx, abstractC7245vu, zzdpkVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: a */
    public final void mo14821a(T t, T t2) {
        C6951nw.m15638h(this.f18367b, t, t2);
        if (this.f18368c) {
            C6951nw.m15636f(this.f18369d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: b */
    public final boolean mo14822b(T t, T t2) {
        if (!this.f18367b.mo15005j(t).equals(this.f18367b.mo15005j(t2))) {
            return false;
        }
        if (this.f18368c) {
            return this.f18369d.mo15965i(t).equals(this.f18369d.mo15965i(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: c */
    public final T mo14823c() {
        return (T) this.f18366a.mo19726d().mo19733a1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: d */
    public final int mo14824d(T t) {
        int hashCode = this.f18367b.mo15005j(t).hashCode();
        return this.f18368c ? (hashCode * 53) + this.f18369d.mo15965i(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: e */
    public final void mo14825e(T t, InterfaceC7211ux interfaceC7211ux) throws IOException {
        Iterator<Map.Entry<?, Object>> m16124e = this.f18369d.mo15965i(t).m16124e();
        while (m16124e.hasNext()) {
            Map.Entry<?, Object> next = m16124e.next();
            zzdnu zzdnuVar = (zzdnu) next.getKey();
            if (zzdnuVar.m19709s() != zzdrn.MESSAGE || zzdnuVar.m19710t() || zzdnuVar.m19711w()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C6765iv) {
                interfaceC7211ux.mo15860G(zzdnuVar.m19706i(), ((C6765iv) next).m15352a().m19762a());
            } else {
                interfaceC7211ux.mo15860G(zzdnuVar.m19706i(), next.getValue());
            }
        }
        AbstractC6545cx<?, ?> abstractC6545cx = this.f18367b;
        abstractC6545cx.mo15011p(abstractC6545cx.mo15005j(t), interfaceC7211ux);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: f */
    public final void mo14826f(T t) {
        this.f18367b.mo15002g(t);
        this.f18369d.mo15963g(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[EDGE_INSN: B:27:0x00a8->B:28:0x00a8 BREAK  A[LOOP:1: B:13:0x0062->B:21:0x0062], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14827g(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.C6505bu r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdob r0 = (com.google.android.gms.internal.ads.zzdob) r0
            com.google.android.gms.internal.ads.zzdqu r1 = r0.zzhhd
            com.google.android.gms.internal.ads.zzdqu r2 = com.google.android.gms.internal.ads.zzdqu.m19782f()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzdqu r1 = com.google.android.gms.internal.ads.zzdqu.m19784i()
            r0.zzhhd = r1
        L11:
            com.google.android.gms.internal.ads.zzdob$zzc r10 = (com.google.android.gms.internal.ads.zzdob.zzc) r10
            com.google.android.gms.internal.ads.yu<java.lang.Object> r0 = r10.zzhhj
            boolean r0 = r0.m16122c()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.yu<java.lang.Object> r0 = r10.zzhhj
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.yu r0 = (com.google.android.gms.internal.ads.C7356yu) r0
            r10.zzhhj = r0
        L25:
            r10 = 0
            r0 = r10
        L27:
            if (r12 >= r13) goto Lb3
            int r4 = com.google.android.gms.internal.ads.C6468au.m14773h(r11, r12, r14)
            int r2 = r14.f18356a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L60
            r12 = r2 & 7
            if (r12 != r3) goto L5b
            com.google.android.gms.internal.ads.vu<?> r12 = r9.f18369d
            com.google.android.gms.internal.ads.zzdno r0 = r14.f18359d
            com.google.android.gms.internal.ads.zzdpk r3 = r9.f18366a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo15958b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            if (r0 != 0) goto L52
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.C6468au.m14768c(r2, r3, r4, r5, r6, r7)
            goto L27
        L52:
            com.google.android.gms.internal.ads.C6692gw.m15176b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L5b:
            int r12 = com.google.android.gms.internal.ads.C6468au.m14766a(r2, r11, r4, r13, r14)
            goto L27
        L60:
            r12 = 0
            r2 = r10
        L62:
            if (r4 >= r13) goto La8
            int r4 = com.google.android.gms.internal.ads.C6468au.m14773h(r11, r4, r14)
            int r5 = r14.f18356a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L8a
            r8 = 3
            if (r6 == r8) goto L74
            goto L9f
        L74:
            if (r0 != 0) goto L81
            if (r7 != r3) goto L9f
            int r4 = com.google.android.gms.internal.ads.C6468au.m14778m(r11, r4, r14)
            java.lang.Object r2 = r14.f18358c
            com.google.android.gms.internal.ads.zzdmr r2 = (com.google.android.gms.internal.ads.zzdmr) r2
            goto L62
        L81:
            com.google.android.gms.internal.ads.C6692gw.m15176b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L8a:
            if (r7 != 0) goto L9f
            int r4 = com.google.android.gms.internal.ads.C6468au.m14773h(r11, r4, r14)
            int r12 = r14.f18356a
            com.google.android.gms.internal.ads.vu<?> r0 = r9.f18369d
            com.google.android.gms.internal.ads.zzdno r5 = r14.f18359d
            com.google.android.gms.internal.ads.zzdpk r6 = r9.f18366a
            java.lang.Object r0 = r0.mo15958b(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            goto L62
        L9f:
            r6 = 12
            if (r5 == r6) goto La8
            int r4 = com.google.android.gms.internal.ads.C6468au.m14766a(r5, r11, r4, r13, r14)
            goto L62
        La8:
            if (r2 == 0) goto Lb0
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m19791k(r12, r2)
        Lb0:
            r12 = r4
            goto L27
        Lb3:
            if (r12 != r13) goto Lb6
            return
        Lb6:
            com.google.android.gms.internal.ads.zzdok r10 = com.google.android.gms.internal.ads.zzdok.m19756g()
            goto Lbc
        Lbb:
            throw r10
        Lbc:
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6507bw.mo14827g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: h */
    public final void mo14828h(T t, InterfaceC6840kw interfaceC6840kw, zzdno zzdnoVar) throws IOException {
        boolean z;
        AbstractC6545cx<?, ?> abstractC6545cx = this.f18367b;
        AbstractC7245vu<?> abstractC7245vu = this.f18369d;
        Object mo15006k = abstractC6545cx.mo15006k(t);
        C7356yu<?> mo15966j = abstractC7245vu.mo15966j(t);
        do {
            try {
                if (interfaceC6840kw.mo15456N() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = interfaceC6840kw.getTag();
                if (tag == 11) {
                    int i2 = 0;
                    Object obj = null;
                    zzdmr zzdmrVar = null;
                    while (interfaceC6840kw.mo15456N() != Integer.MAX_VALUE) {
                        int tag2 = interfaceC6840kw.getTag();
                        if (tag2 == 16) {
                            i2 = interfaceC6840kw.mo15464V();
                            obj = abstractC7245vu.mo15958b(zzdnoVar, this.f18366a, i2);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                abstractC7245vu.mo15961e(interfaceC6840kw, obj, zzdnoVar, mo15966j);
                            } else {
                                zzdmrVar = interfaceC6840kw.mo15462T();
                            }
                        } else if (!interfaceC6840kw.mo15461S()) {
                            break;
                        }
                    }
                    if (interfaceC6840kw.getTag() != 12) {
                        throw zzdok.m19754e();
                    }
                    if (zzdmrVar != null) {
                        if (obj != null) {
                            abstractC7245vu.mo15960d(zzdmrVar, obj, zzdnoVar, mo15966j);
                        } else {
                            abstractC6545cx.mo14997b(mo15006k, i2, zzdmrVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object mo15958b = abstractC7245vu.mo15958b(zzdnoVar, this.f18366a, tag >>> 3);
                    if (mo15958b != null) {
                        abstractC7245vu.mo15961e(interfaceC6840kw, mo15958b, zzdnoVar, mo15966j);
                    } else {
                        z = abstractC6545cx.m15001f(mo15006k, interfaceC6840kw);
                    }
                } else {
                    z = interfaceC6840kw.mo15461S();
                }
                z = true;
            } finally {
                abstractC6545cx.mo15013r(t, mo15006k);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: i */
    public final int mo14829i(T t) {
        AbstractC6545cx<?, ?> abstractC6545cx = this.f18367b;
        int mo15007l = abstractC6545cx.mo15007l(abstractC6545cx.mo15005j(t)) + 0;
        return this.f18368c ? mo15007l + this.f18369d.mo15965i(t).m16128o() : mo15007l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: j */
    public final boolean mo14830j(T t) {
        return this.f18369d.mo15965i(t).m16123d();
    }
}
