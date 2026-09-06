package com.google.firebase.messaging;

import androidx.annotation.Keep;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.iid.p195w.InterfaceC8342a;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p203q.InterfaceC8449d;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p209u.C8522h;
import com.google.firebase.p209u.InterfaceC8523i;
import java.util.Arrays;
import java.util.List;
import p241e.p254e.p256b.p257a.AbstractC8753c;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.InterfaceC8756f;
import p241e.p254e.p256b.p257a.InterfaceC8757g;
import p241e.p254e.p256b.p257a.InterfaceC8758h;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    private static class C8382b<T> implements InterfaceC8756f<T> {
        private C8382b() {
        }

        @Override // p241e.p254e.p256b.p257a.InterfaceC8756f
        /* renamed from: a */
        public void mo26452a(AbstractC8753c<T> abstractC8753c) {
        }

        @Override // p241e.p254e.p256b.p257a.InterfaceC8756f
        /* renamed from: b */
        public void mo26453b(AbstractC8753c<T> abstractC8753c, InterfaceC8758h interfaceC8758h) {
            interfaceC8758h.mo26010a(null);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$c */
    public static class C8383c implements InterfaceC8757g {
        @Override // p241e.p254e.p256b.p257a.InterfaceC8757g
        /* renamed from: a */
        public <T> InterfaceC8756f<T> mo26454a(String str, Class<T> cls, C8752b c8752b, InterfaceC8755e<T, byte[]> interfaceC8755e) {
            return new C8382b();
        }
    }

    static InterfaceC8757g determineFactory(InterfaceC8757g interfaceC8757g) {
        if (interfaceC8757g == null) {
            return new C8383c();
        }
        try {
            interfaceC8757g.mo26454a("test", String.class, C8752b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON), C8434x.f32085a);
            return interfaceC8757g;
        } catch (IllegalArgumentException unused) {
            return new C8383c();
        }
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(InterfaceC8093p interfaceC8093p) {
        return new FirebaseMessaging((C8372j) interfaceC8093p.mo24973a(C8372j.class), (InterfaceC8342a) interfaceC8093p.mo24973a(InterfaceC8342a.class), interfaceC8093p.mo24975c(InterfaceC8523i.class), interfaceC8093p.mo24975c(InterfaceC8459j.class), (InterfaceC8352i) interfaceC8093p.mo24973a(InterfaceC8352i.class), determineFactory((InterfaceC8757g) interfaceC8093p.mo24973a(InterfaceC8757g.class)), (InterfaceC8449d) interfaceC8093p.mo24973a(InterfaceC8449d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(FirebaseMessaging.class).m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25057h(InterfaceC8342a.class)).m25006b(C8099v.m25058i(InterfaceC8523i.class)).m25006b(C8099v.m25058i(InterfaceC8459j.class)).m25006b(C8099v.m25057h(InterfaceC8757g.class)).m25006b(C8099v.m25060k(InterfaceC8352i.class)).m25006b(C8099v.m25060k(InterfaceC8449d.class)).m25010f(C8432w.f32083a).m25007c().m25008d(), C8522h.m26903a("fire-fcm", "20.1.7_1p"));
    }
}
