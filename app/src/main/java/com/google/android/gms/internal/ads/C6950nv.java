package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nv */
/* loaded from: classes2.dex */
final class C6950nv extends AbstractC6839kv {
    private C6950nv() {
        super();
    }

    /* renamed from: f */
    private static <E> zzdoj<E> m15600f(Object obj, long j2) {
        return (zzdoj) C6693gx.m15190L(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: a */
    final <L> List<L> mo15441a(Object obj, long j2) {
        zzdoj m15600f = m15600f(obj, j2);
        if (m15600f.mo16107m0()) {
            return m15600f;
        }
        int size = m15600f.size();
        zzdoj mo14989N = m15600f.mo14989N(size == 0 ? 10 : size << 1);
        C6693gx.m15205g(obj, j2, mo14989N);
        return mo14989N;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: b */
    final <E> void mo15442b(Object obj, Object obj2, long j2) {
        zzdoj m15600f = m15600f(obj, j2);
        zzdoj m15600f2 = m15600f(obj2, j2);
        int size = m15600f.size();
        int size2 = m15600f2.size();
        if (size > 0 && size2 > 0) {
            if (!m15600f.mo16107m0()) {
                m15600f = m15600f.mo14989N(size2 + size);
            }
            m15600f.addAll(m15600f2);
        }
        if (size > 0) {
            m15600f2 = m15600f;
        }
        C6693gx.m15205g(obj, j2, m15600f2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: e */
    final void mo15443e(Object obj, long j2) {
        m15600f(obj, j2).mo16108x0();
    }
}
