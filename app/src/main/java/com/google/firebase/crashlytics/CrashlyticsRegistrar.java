package com.google.firebase.crashlytics;

import com.google.firebase.C8372j;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.crashlytics.internal.InterfaceC8142d;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p209u.C8522h;
import com.google.firebase.p210v.p211a.InterfaceC8524a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        FirebaseSessionsDependencies.m26789a(SessionSubscriber.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C8138g m25133a(InterfaceC8093p interfaceC8093p) {
        return C8138g.m25151a((C8372j) interfaceC8093p.mo24973a(C8372j.class), (InterfaceC8352i) interfaceC8093p.mo24973a(InterfaceC8352i.class), interfaceC8093p.mo24981i(InterfaceC8142d.class), interfaceC8093p.mo24981i(InterfaceC8062a.class), interfaceC8093p.mo24981i(InterfaceC8524a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(C8138g.class).m25011h("fire-cls").m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25060k(InterfaceC8352i.class)).m25006b(C8099v.m25055a(InterfaceC8142d.class)).m25006b(C8099v.m25055a(InterfaceC8062a.class)).m25006b(C8099v.m25055a(InterfaceC8524a.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                C8138g m25133a;
                m25133a = CrashlyticsRegistrar.this.m25133a(interfaceC8093p);
                return m25133a;
            }
        }).m25009e().m25008d(), C8522h.m26903a("fire-cls", "18.6.1"));
    }
}
