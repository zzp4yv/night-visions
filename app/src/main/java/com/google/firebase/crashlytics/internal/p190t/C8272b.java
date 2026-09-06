package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.p183n.InterfaceC8166d0;
import com.google.firebase.crashlytics.internal.p190t.C8274d;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.t.b */
/* loaded from: classes2.dex */
class C8272b implements InterfaceC8278h {
    C8272b() {
    }

    /* renamed from: b */
    static C8274d m26035b(InterfaceC8166d0 interfaceC8166d0) {
        return new C8274d(3600000 + interfaceC8166d0.mo25232a(), new C8274d.b(8, 4), new C8274d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8278h
    /* renamed from: a */
    public C8274d mo26036a(InterfaceC8166d0 interfaceC8166d0, JSONObject jSONObject) {
        return m26035b(interfaceC8166d0);
    }
}
