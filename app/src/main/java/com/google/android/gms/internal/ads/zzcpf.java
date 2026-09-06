package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpf {

    /* renamed from: a */
    private final zzclc f24848a;

    /* renamed from: b */
    private final Map<String, zzcpk> f24849b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<String, List<zzcpk>> f24850c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Executor f24851d;

    /* renamed from: e */
    private final Context f24852e;

    public zzcpf(zzclc zzclcVar, Executor executor, Context context) {
        this.f24848a = zzclcVar;
        this.f24851d = executor;
        this.f24852e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void m18911f() {
        JSONArray optJSONArray;
        JSONObject m17043f = zzk.zzlk().m17061r().mo17103q().m17043f();
        if (m17043f != null) {
            try {
                JSONArray optJSONArray2 = m17043f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString("ad_unit_id", HttpUrl.FRAGMENT_ENCODE_SET);
                        String optString2 = jSONObject.optString("format", HttpUrl.FRAGMENT_ENCODE_SET);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, HttpUrl.FRAGMENT_ENCODE_SET));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                            String optString3 = optJSONArray3.optString(i4, HttpUrl.FRAGMENT_ENCODE_SET);
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = arrayList3.get(i5);
                                            i5++;
                                            String str = (String) obj;
                                            m18912g(str);
                                            zzcpk zzcpkVar = this.f24849b.get(str);
                                            if (zzcpkVar != null) {
                                                arrayList2.add(new zzcpk(str, optString2, bundle, zzcpkVar.f24859d));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString)) {
                            this.f24850c.put(optString, arrayList);
                        }
                    }
                }
            } catch (JSONException e2) {
                zzawz.m17081l("Malformed config loading JSON.", e2);
            }
        }
    }

    /* renamed from: a */
    public final void m18907a() {
        zzk.zzlk().m17061r().mo17107u(new Runnable(this) { // from class: com.google.android.gms.internal.ads.um

            /* renamed from: f */
            private final zzcpf f20644f;

            {
                this.f20644f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20644f.m18910e();
            }
        });
        this.f24851d.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vm

            /* renamed from: f */
            private final zzcpf f20747f;

            {
                this.f20747f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20747f.m18909d();
            }
        });
    }

    /* renamed from: b */
    public final Map<String, List<zzcpk>> m18908b() {
        return this.f24850c;
    }

    /* renamed from: e */
    final /* synthetic */ void m18910e() {
        this.f24851d.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wm

            /* renamed from: f */
            private final zzcpf f20860f;

            {
                this.f20860f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20860f.m18911f();
            }
        });
    }

    /* renamed from: g */
    public final void m18912g(String str) {
        if (TextUtils.isEmpty(str) || this.f24849b.containsKey(str)) {
            return;
        }
        try {
            this.f24849b.put(str, new zzcpk(str, HttpUrl.FRAGMENT_ENCODE_SET, new Bundle(), this.f24848a.m18868d(str)));
        } catch (RemoteException unused) {
        }
    }
}
