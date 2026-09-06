package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f4 */
/* loaded from: classes2.dex */
public final class C6010f4 extends AbstractC6111q6 {

    /* renamed from: b */
    public final EnumC6006f0 f15875b;

    /* renamed from: c */
    public final long f15876c;

    /* renamed from: d */
    public final long f15877d;

    /* renamed from: e */
    public final long f15878e;

    /* renamed from: f */
    public final EnumC5997e0 f15879f;

    /* renamed from: g */
    public final boolean f15880g;

    public C6010f4(C5978c0 c5978c0) {
        this.f15875b = c5978c0.f15703a;
        this.f15876c = c5978c0.f15704b;
        this.f15877d = c5978c0.f15705c;
        this.f15878e = c5978c0.f15706d;
        this.f15879f = c5978c0.f15707e;
        this.f15880g = c5978c0.f15708f;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.session.timestamp", this.f15876c);
        mo12963a.put("fl.initial.timestamp", this.f15877d);
        mo12963a.put("fl.continue.session.millis", this.f15878e);
        mo12963a.put("fl.session.state", this.f15875b.f15845j);
        mo12963a.put("fl.session.event", this.f15879f.name());
        mo12963a.put("fl.session.manual", this.f15880g);
        return mo12963a;
    }
}
