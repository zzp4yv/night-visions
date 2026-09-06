package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.InterfaceC8166d0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* renamed from: com.google.firebase.crashlytics.h.t.g */
/* loaded from: classes2.dex */
public class C8277g {

    /* renamed from: a */
    private final InterfaceC8166d0 f31621a;

    C8277g(InterfaceC8166d0 interfaceC8166d0) {
        this.f31621a = interfaceC8166d0;
    }

    /* renamed from: a */
    private static InterfaceC8278h m26065a(int i2) {
        if (i2 == 3) {
            return new C8282l();
        }
        C8146h.m25176f().m25179d("Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
        return new C8272b();
    }

    /* renamed from: b */
    public C8274d m26066b(JSONObject jSONObject) throws JSONException {
        return m26065a(jSONObject.getInt("settings_version")).mo26036a(this.f31621a, jSONObject);
    }
}
