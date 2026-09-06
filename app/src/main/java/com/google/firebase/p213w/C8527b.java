package com.google.firebase.p213w;

import com.google.firebase.components.C8091n;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.components.InterfaceC8096s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* renamed from: com.google.firebase.w.b */
/* loaded from: classes2.dex */
public class C8527b implements InterfaceC8096s {
    /* renamed from: b */
    static /* synthetic */ Object m26907b(String str, C8091n c8091n, InterfaceC8093p interfaceC8093p) {
        try {
            C8528c.m26909b(str);
            return c8091n.m24994f().mo24937a(interfaceC8093p);
        } finally {
            C8528c.m26908a();
        }
    }

    @Override // com.google.firebase.components.InterfaceC8096s
    /* renamed from: a */
    public List<C8091n<?>> mo24983a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C8091n<?> c8091n : componentRegistrar.getComponents()) {
            final String m24995g = c8091n.m24995g();
            if (m24995g != null) {
                c8091n = c8091n.m25001r(new InterfaceC8095r() { // from class: com.google.firebase.w.a
                    @Override // com.google.firebase.components.InterfaceC8095r
                    /* renamed from: a */
                    public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                        return C8527b.m26907b(m24995g, c8091n, interfaceC8093p);
                    }
                });
            }
            arrayList.add(c8091n);
        }
        return arrayList;
    }
}
