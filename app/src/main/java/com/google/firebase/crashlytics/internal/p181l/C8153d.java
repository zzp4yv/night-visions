package com.google.firebase.crashlytics.internal.p181l;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8156a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8157b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* renamed from: com.google.firebase.crashlytics.h.l.d */
/* loaded from: classes2.dex */
public class C8153d implements InterfaceC8151b, InterfaceC8157b {

    /* renamed from: a */
    private InterfaceC8156a f30871a;

    /* renamed from: b */
    private static String m25196b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8151b
    /* renamed from: J0 */
    public void mo25195J0(String str, Bundle bundle) {
        InterfaceC8156a interfaceC8156a = this.f30871a;
        if (interfaceC8156a != null) {
            try {
                interfaceC8156a.mo25197a("$A$:" + m25196b(str, bundle));
            } catch (JSONException unused) {
                C8146h.m25176f().m25185k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8157b
    /* renamed from: a */
    public void mo25136a(InterfaceC8156a interfaceC8156a) {
        this.f30871a = interfaceC8156a;
        C8146h.m25176f().m25177b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
