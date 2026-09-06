package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.iid.p195w.InterfaceC8342a;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p209u.C8522h;
import com.google.firebase.p209u.InterfaceC8523i;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    static class C8319a implements InterfaceC8342a {

        /* renamed from: a */
        final FirebaseInstanceId f31717a;

        public C8319a(FirebaseInstanceId firebaseInstanceId) {
            this.f31717a = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8342a
        /* renamed from: a */
        public String mo26197a() {
            return this.f31717a.m26187o();
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8342a
        /* renamed from: b */
        public Task<String> mo26198b() {
            String m26187o = this.f31717a.m26187o();
            return m26187o != null ? Tasks.m23663e(m26187o) : this.f31717a.m26186k().mo23643f(C8336q.f31753a);
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8342a
        /* renamed from: c */
        public void mo26199c(InterfaceC8342a.a aVar) {
            this.f31717a.m26180a(aVar);
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(InterfaceC8093p interfaceC8093p) {
        return new FirebaseInstanceId((C8372j) interfaceC8093p.mo24973a(C8372j.class), interfaceC8093p.mo24975c(InterfaceC8523i.class), interfaceC8093p.mo24975c(InterfaceC8459j.class), (InterfaceC8352i) interfaceC8093p.mo24973a(InterfaceC8352i.class));
    }

    static final /* synthetic */ InterfaceC8342a lambda$getComponents$1$Registrar(InterfaceC8093p interfaceC8093p) {
        return new C8319a((FirebaseInstanceId) interfaceC8093p.mo24973a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(FirebaseInstanceId.class).m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25058i(InterfaceC8523i.class)).m25006b(C8099v.m25058i(InterfaceC8459j.class)).m25006b(C8099v.m25060k(InterfaceC8352i.class)).m25010f(C8334o.f31751a).m25007c().m25008d(), C8091n.m24986c(InterfaceC8342a.class).m25006b(C8099v.m25060k(FirebaseInstanceId.class)).m25010f(C8335p.f31752a).m25008d(), C8522h.m26903a("fire-iid", "21.1.0"));
    }
}
