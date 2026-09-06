package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* loaded from: classes2.dex */
final class C7563u2 extends AbstractC7551s2 {

    /* renamed from: c */
    private static final Class<?> f27902c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C7563u2() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static <L> List<L> m21416f(Object obj, long j2, int i2) {
        zzfw zzfwVar;
        List<L> m21417g = m21417g(obj, j2);
        if (m21417g.isEmpty()) {
            List<L> zzfwVar2 = m21417g instanceof zzfv ? new zzfw(i2) : ((m21417g instanceof InterfaceC7516m3) && (m21417g instanceof zzfl)) ? ((zzfl) m21417g).mo20982d(i2) : new ArrayList<>(i2);
            C7505k4.m21198j(obj, j2, zzfwVar2);
            return zzfwVar2;
        }
        if (f27902c.isAssignableFrom(m21417g.getClass())) {
            ArrayList arrayList = new ArrayList(m21417g.size() + i2);
            arrayList.addAll(m21417g);
            C7505k4.m21198j(obj, j2, arrayList);
            zzfwVar = arrayList;
        } else {
            if (!(m21417g instanceof zzia)) {
                if (!(m21417g instanceof InterfaceC7516m3) || !(m21417g instanceof zzfl)) {
                    return m21417g;
                }
                zzfl zzflVar = (zzfl) m21417g;
                if (zzflVar.mo21145a()) {
                    return m21417g;
                }
                zzfl mo20982d = zzflVar.mo20982d(m21417g.size() + i2);
                C7505k4.m21198j(obj, j2, mo20982d);
                return mo20982d;
            }
            zzfw zzfwVar3 = new zzfw(m21417g.size() + i2);
            zzfwVar3.addAll((zzia) m21417g);
            C7505k4.m21198j(obj, j2, zzfwVar3);
            zzfwVar = zzfwVar3;
        }
        return zzfwVar;
    }

    /* renamed from: g */
    private static <E> List<E> m21417g(Object obj, long j2) {
        return (List) C7505k4.m21179F(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: b */
    final <L> List<L> mo21400b(Object obj, long j2) {
        return m21416f(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: c */
    final <E> void mo21401c(Object obj, Object obj2, long j2) {
        List m21417g = m21417g(obj2, j2);
        List m21416f = m21416f(obj, j2, m21417g.size());
        int size = m21416f.size();
        int size2 = m21417g.size();
        if (size > 0 && size2 > 0) {
            m21416f.addAll(m21417g);
        }
        if (size > 0) {
            m21417g = m21416f;
        }
        C7505k4.m21198j(obj, j2, m21417g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7551s2
    /* renamed from: e */
    final void mo21402e(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) C7505k4.m21179F(obj, j2);
        if (list instanceof zzfv) {
            unmodifiableList = ((zzfv) list).mo22313y0();
        } else {
            if (f27902c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC7516m3) && (list instanceof zzfl)) {
                zzfl zzflVar = (zzfl) list;
                if (zzflVar.mo21145a()) {
                    zzflVar.mo21144I();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C7505k4.m21198j(obj, j2, unmodifiableList);
    }
}
