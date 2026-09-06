package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.p092pt.root.execution.Command;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcau {

    /* renamed from: a */
    private final Context f23978a;

    /* renamed from: b */
    private final zzcan f23979b;

    /* renamed from: c */
    private final zzdh f23980c;

    /* renamed from: d */
    private final zzbai f23981d;

    /* renamed from: e */
    private final com.google.android.gms.ads.internal.zza f23982e;

    /* renamed from: f */
    private final zzwj f23983f;

    /* renamed from: g */
    private final Executor f23984g;

    /* renamed from: h */
    private final zzady f23985h;

    /* renamed from: i */
    private final zzcbi f23986i;

    /* renamed from: j */
    private final ScheduledExecutorService f23987j;

    public zzcau(Context context, zzcan zzcanVar, zzdh zzdhVar, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar, Executor executor, zzcxv zzcxvVar, zzcbi zzcbiVar, ScheduledExecutorService scheduledExecutorService) {
        this.f23978a = context;
        this.f23979b = zzcanVar;
        this.f23980c = zzdhVar;
        this.f23981d = zzbaiVar;
        this.f23982e = zzaVar;
        this.f23983f = zzwjVar;
        this.f23984g = executor;
        this.f23985h = zzcxvVar.f25298i;
        this.f23986i = zzcbiVar;
        this.f23987j = scheduledExecutorService;
    }

    /* renamed from: b */
    private static <T> zzbbh<T> m18623b(zzbbh<T> zzbbhVar, T t) {
        final Object obj = null;
        return zzbar.m17368e(zzbbhVar, Exception.class, new zzbal(obj) { // from class: com.google.android.gms.internal.ads.rg

            /* renamed from: a */
            private final Object f20449a;

            {
                this.f20449a = obj;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj2) {
                Object obj3 = this.f20449a;
                zzawz.m17081l("Error during loading assets.", (Exception) obj2);
                return zzbar.m17378o(obj3);
            }
        }, zzbbm.f22758b);
    }

    /* renamed from: c */
    private final zzbbh<List<zzadw>> m18624c(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzbar.m17378o(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(m18625d(jSONArray.optJSONObject(i2), z));
        }
        return zzbar.m17367d(zzbar.m17376m(arrayList), C6935ng.f20087a, this.f23984g);
    }

    /* renamed from: d */
    private final zzbbh<zzadw> m18625d(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzbar.m17378o(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzbar.m17378o(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzbar.m17378o(new zzadw(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m18626e(jSONObject.optBoolean("require"), zzbar.m17367d(this.f23979b.m18621d(optString, optDouble, optBoolean), new zzbam(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.og

            /* renamed from: a */
            private final String f20189a;

            /* renamed from: b */
            private final double f20190b;

            /* renamed from: c */
            private final int f20191c;

            /* renamed from: d */
            private final int f20192d;

            {
                this.f20189a = optString;
                this.f20190b = optDouble;
                this.f20191c = optInt;
                this.f20192d = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                String str = this.f20189a;
                return new zzadw(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f20190b, this.f20191c, this.f20192d);
            }
        }, this.f23984g), null);
    }

    /* renamed from: e */
    private static <T> zzbbh<T> m18626e(boolean z, final zzbbh<T> zzbbhVar, T t) {
        return z ? zzbar.m17366c(zzbbhVar, new zzbal(zzbbhVar) { // from class: com.google.android.gms.internal.ads.tg

            /* renamed from: a */
            private final zzbbh f20570a;

            {
                this.f20570a = zzbbhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return obj != null ? this.f20570a : zzbar.m17375l(new zzcmw("Retrieve required value in native ad response failed.", 0));
            }
        }, zzbbm.f22758b) : m18623b(zzbbhVar, null);
    }

    /* renamed from: j */
    private static Integer m18627j(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static List<zzabj> m18628k(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            zzabj m18630m = m18630m(optJSONArray.optJSONObject(i2));
            if (m18630m != null) {
                arrayList.add(m18630m);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static zzabj m18629l(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m18630m(optJSONObject);
    }

    /* renamed from: m */
    private static zzabj m18630m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzabj(optString, optString2);
    }

    /* renamed from: a */
    final /* synthetic */ zzadt m18631a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(Command.CommandHandler.TEXT);
        Integer m18627j = m18627j(jSONObject, "bg_color");
        Integer m18627j2 = m18627j(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzadt(optString, list, m18627j, m18627j2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f23985h.f21965j, optBoolean);
    }

    /* renamed from: f */
    final /* synthetic */ zzbbh m18632f(String str, Object obj) throws Exception {
        zzk.zzlh();
        zzbgz m17703b = zzbhf.m17703b(this.f23978a, zzbin.m17735b(), "native-omid", false, false, this.f23980c, this.f23981d, null, null, this.f23982e, this.f23983f);
        final zzbbq m17382e = zzbbq.m17382e(m17703b);
        m17703b.mo14926p().mo17687i(new zzbij(m17382e) { // from class: com.google.android.gms.internal.ads.ug

            /* renamed from: a */
            private final zzbbq f20631a;

            {
                this.f20631a = m17382e;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.f20631a.m17383f();
            }
        });
        m17703b.loadData(str, "text/html", "UTF-8");
        return m17382e;
    }

    /* renamed from: g */
    public final zzbbh<zzadw> m18633g(JSONObject jSONObject, String str) {
        return m18625d(jSONObject.optJSONObject(str), this.f23985h.f21962g);
    }

    /* renamed from: h */
    public final zzbbh<List<zzadw>> m18634h(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        zzady zzadyVar = this.f23985h;
        return m18624c(optJSONArray, zzadyVar.f21962g, zzadyVar.f21964i);
    }

    /* renamed from: i */
    public final zzbbh<zzadt> m18635i(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzbar.m17378o(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m18626e(optJSONObject.optBoolean("require"), zzbar.m17367d(m18624c(optJSONArray, false, true), new zzbam(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.pg

            /* renamed from: a */
            private final zzcau f20296a;

            /* renamed from: b */
            private final JSONObject f20297b;

            {
                this.f20296a = this;
                this.f20297b = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                return this.f20296a.m18631a(this.f20297b, (List) obj);
            }
        }, this.f23984g), null);
    }

    /* renamed from: n */
    public final zzbbh<zzbgz> m18636n(JSONObject jSONObject) {
        JSONObject m17263e = zzazc.m17263e(jSONObject, "html_containers", "instream");
        if (m17263e != null) {
            return m18626e(m17263e.optBoolean("require"), this.f23986i.m18644g(m17263e.optString("base_url"), m17263e.optString("html")), null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzbar.m17378o(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return m18623b(zzbar.m17365b(this.f23986i.m18643f(optJSONObject), ((Integer) zzyt.m20848e().m16421c(zzacu.f21661L2)).intValue(), TimeUnit.SECONDS, this.f23987j), null);
        }
        zzbad.m17353i("Required field 'vast_xml' is missing");
        return zzbar.m17378o(null);
    }
}
