package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C6206c;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.p209u.C8522h;
import java.util.Arrays;
import java.util.List;
import p241e.p254e.p256b.p257a.InterfaceC8757g;
import p241e.p254e.p256b.p257a.p258i.C8845u;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    static /* synthetic */ InterfaceC8757g lambda$getComponents$0(InterfaceC8093p interfaceC8093p) {
        C8845u.m28178f((Context) interfaceC8093p.mo24973a(Context.class));
        return C8845u.m28176c().m28180g(C6206c.f16584f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(InterfaceC8757g.class).m25011h(LIBRARY_NAME).m25006b(C8099v.m25060k(Context.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.datatransport.a
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                return TransportRegistrar.lambda$getComponents$0(interfaceC8093p);
            }
        }).m25008d(), C8522h.m26903a(LIBRARY_NAME, "18.1.8"));
    }
}
