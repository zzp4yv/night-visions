package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzauq implements zzavb {

    /* renamed from: a */
    private static List<Future<Void>> f22528a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f22529b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final zzdsj f22530c;

    /* renamed from: d */
    private final LinkedHashMap<String, zzdsp> f22531d;

    /* renamed from: g */
    private final Context f22534g;

    /* renamed from: h */
    private final zzavd f22535h;

    /* renamed from: i */
    private boolean f22536i;

    /* renamed from: j */
    private final zzauy f22537j;

    /* renamed from: k */
    private final C6516c4 f22538k;

    /* renamed from: e */
    private final List<String> f22532e = new ArrayList();

    /* renamed from: f */
    private final List<String> f22533f = new ArrayList();

    /* renamed from: l */
    private final Object f22539l = new Object();

    /* renamed from: m */
    private HashSet<String> f22540m = new HashSet<>();

    /* renamed from: n */
    private boolean f22541n = false;

    /* renamed from: o */
    private boolean f22542o = false;

    /* renamed from: p */
    private boolean f22543p = false;

    public zzauq(Context context, zzbai zzbaiVar, zzauy zzauyVar, String str, zzavd zzavdVar) {
        Preconditions.m14373l(zzauyVar, "SafeBrowsing config is not present.");
        this.f22534g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22531d = new LinkedHashMap<>();
        this.f22535h = zzavdVar;
        this.f22537j = zzauyVar;
        Iterator<String> it = zzauyVar.f22549j.iterator();
        while (it.hasNext()) {
            this.f22540m.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f22540m.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzdsj zzdsjVar = new zzdsj();
        zzdsjVar.f25896c = 8;
        zzdsjVar.f25898e = str;
        zzdsjVar.f25899f = str;
        zzdsk zzdskVar = new zzdsk();
        zzdsjVar.f25901h = zzdskVar;
        zzdskVar.f25914c = this.f22537j.f22545f;
        zzdsq zzdsqVar = new zzdsq();
        zzdsqVar.f25936c = zzbaiVar.f22750f;
        zzdsqVar.f25938e = Boolean.valueOf(Wrappers.m14674a(this.f22534g).m14672f());
        long m13825b = GoogleApiAvailabilityLight.m13823h().m13825b(this.f22534g);
        if (m13825b > 0) {
            zzdsqVar.f25937d = Long.valueOf(m13825b);
        }
        zzdsjVar.f25911r = zzdsqVar;
        this.f22530c = zzdsjVar;
        this.f22538k = new C6516c4(this.f22534g, this.f22537j.f22552m, this);
    }

    /* renamed from: m */
    private final zzdsp m16965m(String str) {
        zzdsp zzdspVar;
        synchronized (this.f22539l) {
            zzdspVar = this.f22531d.get(str);
        }
        return zzdspVar;
    }

    /* renamed from: n */
    static final /* synthetic */ Void m16966n(String str) {
        return null;
    }

    /* renamed from: p */
    private final zzbbh<Void> m16967p() {
        zzbbh<Void> m17367d;
        boolean z = this.f22536i;
        if (!((z && this.f22537j.f22551l) || (this.f22543p && this.f22537j.f22550k) || (!z && this.f22537j.f22548i))) {
            return zzbar.m17378o(null);
        }
        synchronized (this.f22539l) {
            this.f22530c.f25902i = new zzdsp[this.f22531d.size()];
            this.f22531d.values().toArray(this.f22530c.f25902i);
            this.f22530c.f25912s = (String[]) this.f22532e.toArray(new String[0]);
            this.f22530c.f25913t = (String[]) this.f22533f.toArray(new String[0]);
            if (zzava.m16983a()) {
                zzdsj zzdsjVar = this.f22530c;
                String str = zzdsjVar.f25898e;
                String str2 = zzdsjVar.f25903j;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzdsp zzdspVar : this.f22530c.f25902i) {
                    sb2.append("    [");
                    sb2.append(zzdspVar.f25935l.length);
                    sb2.append("] ");
                    sb2.append(zzdspVar.f25928e);
                }
                zzava.m16984b(sb2.toString());
            }
            zzbbh<String> m17257a = new zzayu(this.f22534g).m17257a(1, this.f22537j.f22546g, null, zzdrw.m19824b(this.f22530c));
            if (zzava.m16983a()) {
                m17257a.mo14748k(new RunnableC6479b4(this), zzaxg.f22651a);
            }
            m17367d = zzbar.m17367d(m17257a, C7329y3.f21095a, zzbbm.f22758b);
        }
        return m17367d;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: a */
    public final void mo16969a(String str, Map<String, String> map, int i2) {
        synchronized (this.f22539l) {
            if (i2 == 3) {
                this.f22543p = true;
            }
            if (this.f22531d.containsKey(str)) {
                if (i2 == 3) {
                    this.f22531d.get(str).f25934k = Integer.valueOf(i2);
                }
                return;
            }
            zzdsp zzdspVar = new zzdsp();
            zzdspVar.f25934k = Integer.valueOf(i2);
            zzdspVar.f25927d = Integer.valueOf(this.f22531d.size());
            zzdspVar.f25928e = str;
            zzdspVar.f25929f = new zzdsm();
            if (this.f22540m.size() > 0 && map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        String key = entry.getKey() != null ? entry.getKey() : HttpUrl.FRAGMENT_ENCODE_SET;
                        String value = entry.getValue() != null ? entry.getValue() : HttpUrl.FRAGMENT_ENCODE_SET;
                        if (this.f22540m.contains(key.toLowerCase(Locale.ENGLISH))) {
                            zzdsl zzdslVar = new zzdsl();
                            zzdslVar.f25916d = key.getBytes("UTF-8");
                            zzdslVar.f25917e = value.getBytes("UTF-8");
                            arrayList.add(zzdslVar);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        zzava.m16984b("Cannot convert string to bytes, skip header.");
                    }
                }
                zzdsl[] zzdslVarArr = new zzdsl[arrayList.size()];
                arrayList.toArray(zzdslVarArr);
                zzdspVar.f25929f.f25919d = zzdslVarArr;
            }
            this.f22531d.put(str, zzdspVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: b */
    public final void mo16970b(String str) {
        synchronized (this.f22539l) {
            this.f22530c.f25903j = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: c */
    public final void mo16971c() {
        synchronized (this.f22539l) {
            zzbbh<Map<String, String>> mo16980a = this.f22535h.mo16980a(this.f22534g, this.f22531d.keySet());
            zzbal zzbalVar = new zzbal(this) { // from class: com.google.android.gms.internal.ads.x3

                /* renamed from: a */
                private final zzauq f20934a;

                {
                    this.f20934a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.f20934a.m16979o((Map) obj);
                }
            };
            Executor executor = zzbbm.f22758b;
            zzbbh m17366c = zzbar.m17366c(mo16980a, zzbalVar, executor);
            zzbbh m17365b = zzbar.m17365b(m17366c, 10L, TimeUnit.SECONDS, f22529b);
            zzbar.m17369f(m17366c, new C6442a4(this, m17365b), executor);
            f22528a.add(m17365b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: d */
    public final String[] mo16972d(String[] strArr) {
        return (String[]) this.f22538k.m14963a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: e */
    public final void mo16973e() {
        this.f22541n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: f */
    public final void mo16974f(View view) {
        if (this.f22537j.f22547h && !this.f22542o) {
            zzk.zzlg();
            Bitmap m17142a0 = zzaxi.m17142a0(view);
            if (m17142a0 == null) {
                zzava.m16984b("Failed to capture the webview bitmap.");
            } else {
                this.f22542o = true;
                zzaxi.m17134O(new RunnableC7366z3(this, m17142a0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: g */
    public final boolean mo16975g() {
        return PlatformVersion.m14642f() && this.f22537j.f22547h && !this.f22542o;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: h */
    public final zzauy mo16976h() {
        return this.f22537j;
    }

    /* renamed from: k */
    final void m16977k(String str) {
        synchronized (this.f22539l) {
            this.f22532e.add(str);
        }
    }

    /* renamed from: l */
    final void m16978l(String str) {
        synchronized (this.f22539l) {
            this.f22533f.add(str);
        }
    }

    /* renamed from: o */
    final /* synthetic */ zzbbh m16979o(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f22539l) {
                            int length = optJSONArray.length();
                            zzdsp m16965m = m16965m(str);
                            if (m16965m == null) {
                                String valueOf = String.valueOf(str);
                                zzava.m16984b(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                m16965m.f25935l = new String[length];
                                for (int i2 = 0; i2 < length; i2++) {
                                    m16965m.f25935l[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                this.f22536i = (length > 0) | this.f22536i;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21854q3)).booleanValue()) {
                    zzbad.m17346b("Failed to get SafeBrowsing metadata", e2);
                }
                return zzbar.m17375l(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f22536i) {
            synchronized (this.f22539l) {
                this.f22530c.f25896c = 9;
            }
        }
        return m16967p();
    }
}
