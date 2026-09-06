package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8078b0;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.concurrent.C8129y;
import com.google.firebase.p200o.p201a.InterfaceC8441a;
import com.google.firebase.p200o.p201a.InterfaceC8442b;
import com.google.firebase.p204r.C8457h;
import com.google.firebase.p204r.InterfaceC8458i;
import com.google.firebase.p209u.C8522h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    static /* synthetic */ InterfaceC8352i lambda$getComponents$0(InterfaceC8093p interfaceC8093p) {
        return new C8351h((C8372j) interfaceC8093p.mo24973a(C8372j.class), interfaceC8093p.mo24975c(InterfaceC8458i.class), (ExecutorService) interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8441a.class, ExecutorService.class)), C8129y.m25126a((Executor) interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8442b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(InterfaceC8352i.class).m25011h(LIBRARY_NAME).m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25058i(InterfaceC8458i.class)).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8441a.class, ExecutorService.class))).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8442b.class, Executor.class))).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.installations.e
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC8093p);
            }
        }).m25008d(), C8457h.m26692a(), C8522h.m26903a(LIBRARY_NAME, "17.2.0"));
    }
}
