package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mv */
/* loaded from: classes2.dex */
final class C6913mv extends AbstractC6839kv {

    /* renamed from: c */
    private static final Class<?> f19942c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C6913mv() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static <L> List<L> m15572f(Object obj, long j2, int i2) {
        zzdos zzdosVar;
        List<L> m15573g = m15573g(obj, j2);
        if (m15573g.isEmpty()) {
            List<L> zzdosVar2 = m15573g instanceof zzdot ? new zzdos(i2) : ((m15573g instanceof InterfaceC6655fw) && (m15573g instanceof zzdoj)) ? ((zzdoj) m15573g).mo14989N(i2) : new ArrayList<>(i2);
            C6693gx.m15205g(obj, j2, zzdosVar2);
            return zzdosVar2;
        }
        if (f19942c.isAssignableFrom(m15573g.getClass())) {
            ArrayList arrayList = new ArrayList(m15573g.size() + i2);
            arrayList.addAll(m15573g);
            C6693gx.m15205g(obj, j2, arrayList);
            zzdosVar = arrayList;
        } else {
            if (!(m15573g instanceof zzdqw)) {
                if (!(m15573g instanceof InterfaceC6655fw) || !(m15573g instanceof zzdoj)) {
                    return m15573g;
                }
                zzdoj zzdojVar = (zzdoj) m15573g;
                if (zzdojVar.mo16107m0()) {
                    return m15573g;
                }
                zzdoj mo14989N = zzdojVar.mo14989N(m15573g.size() + i2);
                C6693gx.m15205g(obj, j2, mo14989N);
                return mo14989N;
            }
            zzdos zzdosVar3 = new zzdos(m15573g.size() + i2);
            zzdosVar3.addAll((zzdqw) m15573g);
            C6693gx.m15205g(obj, j2, zzdosVar3);
            zzdosVar = zzdosVar3;
        }
        return zzdosVar;
    }

    /* renamed from: g */
    private static <E> List<E> m15573g(Object obj, long j2) {
        return (List) C6693gx.m15190L(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: a */
    final <L> List<L> mo15441a(Object obj, long j2) {
        return m15572f(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: b */
    final <E> void mo15442b(Object obj, Object obj2, long j2) {
        List m15573g = m15573g(obj2, j2);
        List m15572f = m15572f(obj, j2, m15573g.size());
        int size = m15572f.size();
        int size2 = m15573g.size();
        if (size > 0 && size2 > 0) {
            m15572f.addAll(m15573g);
        }
        if (size > 0) {
            m15573g = m15572f;
        }
        C6693gx.m15205g(obj, j2, m15573g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6839kv
    /* renamed from: e */
    final void mo15443e(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) C6693gx.m15190L(obj, j2);
        if (list instanceof zzdot) {
            unmodifiableList = ((zzdot) list).mo19766H();
        } else {
            if (f19942c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6655fw) && (list instanceof zzdoj)) {
                zzdoj zzdojVar = (zzdoj) list;
                if (zzdojVar.mo16107m0()) {
                    zzdojVar.mo16108x0();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C6693gx.m15205g(obj, j2, unmodifiableList);
    }
}
