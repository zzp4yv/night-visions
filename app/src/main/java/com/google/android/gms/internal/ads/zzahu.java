package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzahu implements zzaho<Object> {

    /* renamed from: a */
    private final Object f22045a = new Object();

    /* renamed from: b */
    private final Map<String, zzahw> f22046b = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f22045a) {
            zzahw remove = this.f22046b.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                zzbad.m17353i(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else {
                if (str5 == null) {
                    remove.mo15332a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zzawz.m17083n()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzawz.m17082m(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.mo15332a(jSONObject);
                } catch (JSONException e2) {
                    remove.onFailure(e2.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final <EngineT extends zzakg> zzbbh<JSONObject> m16577b(EngineT enginet, String str, JSONObject jSONObject) {
        zzbbr zzbbrVar = new zzbbr();
        zzk.zzlg();
        String m17158j0 = zzaxi.m17158j0();
        m16578c(m17158j0, new C6919n0(this, zzbbrVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, m17158j0);
            jSONObject2.put("args", jSONObject);
            enginet.mo14895Y(str, jSONObject2);
        } catch (Exception e2) {
            zzbbrVar.m17386c(e2);
        }
        return zzbbrVar;
    }

    /* renamed from: c */
    public final void m16578c(String str, zzahw zzahwVar) {
        synchronized (this.f22045a) {
            this.f22046b.put(str, zzahwVar);
        }
    }
}
