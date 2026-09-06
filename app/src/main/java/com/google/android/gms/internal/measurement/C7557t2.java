package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes2.dex */
final class C7557t2 extends AbstractC7551s2 {
    private C7557t2() {
        super();
    }

    /* renamed from: f */
    private static <E> zzfl<E> m21406f(Object obj, long j2) {
        return (zzfl) C7505k4.m21179F(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: b */
    final <L> List<L> mo21400b(Object obj, long j2) {
        zzfl m21406f = m21406f(obj, j2);
        if (m21406f.mo21145a()) {
            return m21406f;
        }
        int size = m21406f.size();
        zzfl mo20982d = m21406f.mo20982d(size == 0 ? 10 : size << 1);
        C7505k4.m21198j(obj, j2, mo20982d);
        return mo20982d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: c */
    final <E> void mo21401c(Object obj, Object obj2, long j2) {
        zzfl m21406f = m21406f(obj, j2);
        zzfl m21406f2 = m21406f(obj2, j2);
        int size = m21406f.size();
        int size2 = m21406f2.size();
        if (size > 0 && size2 > 0) {
            if (!m21406f.mo21145a()) {
                m21406f = m21406f.mo20982d(size2 + size);
            }
            m21406f.addAll(m21406f2);
        }
        if (size > 0) {
            m21406f2 = m21406f;
        }
        C7505k4.m21198j(obj, j2, m21406f2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: e */
    final void mo21402e(Object obj, long j2) {
        m21406f(obj, j2).mo21144I();
    }
}
