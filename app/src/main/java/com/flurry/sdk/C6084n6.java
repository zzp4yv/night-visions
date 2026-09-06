package com.flurry.sdk;

import com.flurry.sdk.C5986d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.n6 */
/* loaded from: classes2.dex */
public final class C6084n6 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f16177b = 3;

    /* renamed from: c */
    public final int f16178c = 328;

    /* renamed from: d */
    public final String f16179d;

    /* renamed from: e */
    public final int f16180e;

    /* renamed from: f */
    public final boolean f16181f;

    /* renamed from: g */
    public final C5986d.d f16182g;

    public C6084n6(String str, int i2, boolean z, C5986d.d dVar) {
        this.f16179d = str;
        this.f16180e = i2;
        this.f16181f = z;
        this.f16182g = dVar;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.agent.version", this.f16178c);
        mo12963a.put("fl.agent.platform", this.f16177b);
        mo12963a.put("fl.apikey", this.f16179d);
        mo12963a.put("fl.agent.report.key", this.f16180e);
        mo12963a.put("fl.background.session.metrics", this.f16181f);
        mo12963a.put("fl.play.service.availability", this.f16182g.f15764o);
        return mo12963a;
    }
}
