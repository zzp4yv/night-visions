package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p181l.C8152c;
import com.google.firebase.crashlytics.internal.p181l.C8153d;
import com.google.firebase.crashlytics.internal.p181l.C8154e;
import com.google.firebase.crashlytics.internal.p181l.C8155f;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8150a;
import com.google.firebase.crashlytics.internal.p182m.C8158c;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8156a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8157b;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AnalyticsDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.e */
/* loaded from: classes2.dex */
public class C8136e {

    /* renamed from: a */
    private final InterfaceC8462a<InterfaceC8062a> f30835a;

    /* renamed from: b */
    private volatile InterfaceC8150a f30836b;

    /* renamed from: c */
    private volatile InterfaceC8157b f30837c;

    /* renamed from: d */
    private final List<InterfaceC8156a> f30838d;

    public C8136e(InterfaceC8462a<InterfaceC8062a> interfaceC8462a) {
        this(interfaceC8462a, new C8158c(), new C8155f());
    }

    /* renamed from: c */
    private void m25137c() {
        this.f30835a.mo25084a(new InterfaceC8462a.a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.p205s.InterfaceC8462a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8463b interfaceC8463b) {
                C8136e.this.m25146i(interfaceC8463b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25144e(String str, Bundle bundle) {
        this.f30836b.mo25135a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25145g(InterfaceC8156a interfaceC8156a) {
        synchronized (this) {
            if (this.f30837c instanceof C8158c) {
                this.f30838d.add(interfaceC8156a);
            }
            this.f30837c.mo25136a(interfaceC8156a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25146i(InterfaceC8463b interfaceC8463b) {
        C8146h.m25176f().m25177b("AnalyticsConnector now available.");
        InterfaceC8062a interfaceC8062a = (InterfaceC8062a) interfaceC8463b.get();
        C8154e c8154e = new C8154e(interfaceC8062a);
        C8137f c8137f = new C8137f();
        if (m25141j(interfaceC8062a, c8137f) == null) {
            C8146h.m25176f().m25185k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C8146h.m25176f().m25177b("Registered Firebase Analytics listener.");
        C8153d c8153d = new C8153d();
        C8152c c8152c = new C8152c(c8154e, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<InterfaceC8156a> it = this.f30838d.iterator();
            while (it.hasNext()) {
                c8153d.mo25136a(it.next());
            }
            c8137f.m25149d(c8153d);
            c8137f.m25150e(c8152c);
            this.f30837c = c8153d;
            this.f30836b = c8152c;
        }
    }

    /* renamed from: j */
    private static InterfaceC8062a.a m25141j(InterfaceC8062a interfaceC8062a, C8137f c8137f) {
        InterfaceC8062a.a mo24951b = interfaceC8062a.mo24951b("clx", c8137f);
        if (mo24951b == null) {
            C8146h.m25176f().m25177b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo24951b = interfaceC8062a.mo24951b("crash", c8137f);
            if (mo24951b != null) {
                C8146h.m25176f().m25185k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo24951b;
    }

    /* renamed from: a */
    public InterfaceC8150a m25142a() {
        return new InterfaceC8150a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8150a
            /* renamed from: a */
            public final void mo25135a(String str, Bundle bundle) {
                C8136e.this.m25144e(str, bundle);
            }
        };
    }

    /* renamed from: b */
    public InterfaceC8157b m25143b() {
        return new InterfaceC8157b() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8157b
            /* renamed from: a */
            public final void mo25136a(InterfaceC8156a interfaceC8156a) {
                C8136e.this.m25145g(interfaceC8156a);
            }
        };
    }

    public C8136e(InterfaceC8462a<InterfaceC8062a> interfaceC8462a, InterfaceC8157b interfaceC8157b, InterfaceC8150a interfaceC8150a) {
        this.f30835a = interfaceC8462a;
        this.f30837c = interfaceC8157b;
        this.f30838d = new ArrayList();
        this.f30836b = interfaceC8150a;
        m25137c();
    }
}
