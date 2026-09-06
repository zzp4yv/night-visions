package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.messaging.y */
/* loaded from: classes2.dex */
final class C8436y {

    /* renamed from: a */
    private final String f32087a = Preconditions.m14369h("MESSAGE_DELIVERED", "evenType must be non-null");

    /* renamed from: b */
    private final Intent f32088b;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$a */
    static class a implements InterfaceC8294c<C8436y> {
        a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(C8436y c8436y, InterfaceC8295d interfaceC8295d) throws EncodingException, IOException {
            Intent m26667b = c8436y.m26667b();
            interfaceC8295d.mo26086e("ttl", C8399f0.m26529q(m26667b));
            interfaceC8295d.mo26087h("event", c8436y.m26666a());
            interfaceC8295d.mo26087h("instanceId", C8399f0.m26517e(m26667b));
            interfaceC8295d.mo26086e("priority", C8399f0.m26526n(m26667b));
            interfaceC8295d.mo26087h("packageName", C8399f0.m26525m());
            interfaceC8295d.mo26087h("sdkPlatform", "ANDROID");
            interfaceC8295d.mo26087h("messageType", C8399f0.m26523k(m26667b));
            String m26519g = C8399f0.m26519g(m26667b);
            if (m26519g != null) {
                interfaceC8295d.mo26087h("messageId", m26519g);
            }
            String m26528p = C8399f0.m26528p(m26667b);
            if (m26528p != null) {
                interfaceC8295d.mo26087h("topic", m26528p);
            }
            String m26514b = C8399f0.m26514b(m26667b);
            if (m26514b != null) {
                interfaceC8295d.mo26087h("collapseKey", m26514b);
            }
            if (C8399f0.m26520h(m26667b) != null) {
                interfaceC8295d.mo26087h("analyticsLabel", C8399f0.m26520h(m26667b));
            }
            if (C8399f0.m26516d(m26667b) != null) {
                interfaceC8295d.mo26087h("composerLabel", C8399f0.m26516d(m26667b));
            }
            String m26527o = C8399f0.m26527o(m26667b);
            if (m26527o != null) {
                interfaceC8295d.mo26087h("projectNumber", m26527o);
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$b */
    static final class b {

        /* renamed from: a */
        private final C8436y f32089a;

        b(C8436y c8436y) {
            this.f32089a = (C8436y) Preconditions.m14372k(c8436y);
        }

        /* renamed from: a */
        C8436y m26669a() {
            return this.f32089a;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$c */
    static final class c implements InterfaceC8294c<b> {
        c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(b bVar, InterfaceC8295d interfaceC8295d) throws EncodingException, IOException {
            interfaceC8295d.mo26087h("messaging_client_event", bVar.m26669a());
        }
    }

    C8436y(String str, Intent intent) {
        this.f32088b = (Intent) Preconditions.m14373l(intent, "intent must be non-null");
    }

    /* renamed from: a */
    String m26666a() {
        return this.f32087a;
    }

    /* renamed from: b */
    Intent m26667b() {
        return this.f32088b;
    }
}
