package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.p184o.C8213l;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p210v.p211a.InterfaceC8524a;

/* compiled from: RemoteConfigDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.h.k */
/* loaded from: classes2.dex */
public class C8149k {

    /* renamed from: a */
    private final InterfaceC8462a<InterfaceC8524a> f30864a;

    public C8149k(InterfaceC8462a<InterfaceC8524a> interfaceC8462a) {
        this.f30864a = interfaceC8462a;
    }

    /* renamed from: a */
    static /* synthetic */ void m25193a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, InterfaceC8463b interfaceC8463b) {
        ((InterfaceC8524a) interfaceC8463b.get()).m26906a("firebase", crashlyticsRemoteConfigListener);
        C8146h.m25176f().m25177b("Registering RemoteConfig Rollouts subscriber");
    }

    /* renamed from: b */
    public void m25194b(C8213l c8213l) {
        if (c8213l == null) {
            C8146h.m25176f().m25185k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(c8213l);
            this.f30864a.mo25084a(new InterfaceC8462a.a() { // from class: com.google.firebase.crashlytics.h.c
                @Override // com.google.firebase.p205s.InterfaceC8462a.a
                /* renamed from: a */
                public final void mo24982a(InterfaceC8463b interfaceC8463b) {
                    C8149k.m25193a(CrashlyticsRemoteConfigListener.this, interfaceC8463b);
                }
            });
        }
    }
}
