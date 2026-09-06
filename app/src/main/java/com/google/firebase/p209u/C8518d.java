package com.google.firebase.p209u;

import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* renamed from: com.google.firebase.u.d */
/* loaded from: classes2.dex */
public class C8518d implements InterfaceC8523i {

    /* renamed from: a */
    private final String f32407a;

    /* renamed from: b */
    private final C8519e f32408b;

    C8518d(Set<AbstractC8521g> set, C8519e c8519e) {
        this.f32407a = m26897d(set);
        this.f32408b = c8519e;
    }

    /* renamed from: b */
    public static C8091n<InterfaceC8523i> m26895b() {
        return C8091n.m24986c(InterfaceC8523i.class).m25006b(C8099v.m25063n(AbstractC8521g.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.u.a
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                return C8518d.m26896c(interfaceC8093p);
            }
        }).m25008d();
    }

    /* renamed from: c */
    static /* synthetic */ InterfaceC8523i m26896c(InterfaceC8093p interfaceC8093p) {
        return new C8518d(interfaceC8093p.mo24979g(AbstractC8521g.class), C8519e.m26899a());
    }

    /* renamed from: d */
    private static String m26897d(Set<AbstractC8521g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC8521g> it = set.iterator();
        while (it.hasNext()) {
            AbstractC8521g next = it.next();
            sb.append(next.mo26893b());
            sb.append('/');
            sb.append(next.mo26894c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.p209u.InterfaceC8523i
    /* renamed from: a */
    public String mo26898a() {
        if (this.f32408b.m26900b().isEmpty()) {
            return this.f32407a;
        }
        return this.f32407a + ' ' + m26897d(this.f32408b.m26900b());
    }
}
