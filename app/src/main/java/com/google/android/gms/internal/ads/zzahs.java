package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import java.net.URISyntaxException;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzahs<T extends zzbhx & zzbhy & zzbic & zzbif & zzbih> implements zzaho<T> {

    /* renamed from: a */
    private final com.google.android.gms.ads.internal.zzb f22040a;

    /* renamed from: b */
    private final zzapr f22041b;

    public zzahs(com.google.android.gms.ads.internal.zzb zzbVar, zzapr zzaprVar) {
        this.f22040a = zzbVar;
        this.f22041b = zzaprVar;
    }

    @VisibleForTesting
    /* renamed from: b */
    static String m16568b(Context context, zzdh zzdhVar, String str, View view, Activity activity) {
        if (zzdhVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (zzdhVar.m19456g(parse)) {
                parse = zzdhVar.m19452a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzdi unused) {
            return str;
        } catch (Exception e2) {
            zzk.zzlk().m17052e(e2, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: c */
    private static boolean m16569c(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: d */
    private static int m16570d(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzk.zzli();
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            zzk.zzli();
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzk.zzli().mo17205s();
        }
        return -1;
    }

    /* renamed from: e */
    private final void m16571e(boolean z) {
        zzapr zzaprVar = this.f22041b;
        if (zzaprVar != null) {
            zzaprVar.m16842l(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(Object obj, Map map) {
        zzbhx zzbhxVar = (zzbhx) obj;
        String m17021c = zzavx.m17021c((String) map.get("u"), zzbhxVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzbad.m17353i("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.f22040a;
        if (zzbVar != null && !zzbVar.zzkx()) {
            this.f22040a.zzbk(m17021c);
            return;
        }
        if ("expand".equalsIgnoreCase(str)) {
            if (((zzbhy) zzbhxVar).mo14921m()) {
                zzbad.m17353i("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m16571e(false);
                ((zzbic) zzbhxVar).mo14875B(m16569c(map), m16570d(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            m16571e(false);
            if (m17021c != null) {
                ((zzbic) zzbhxVar).mo14910g0(m16569c(map), m16570d(map), m17021c);
                return;
            } else {
                ((zzbic) zzbhxVar).mo14937w0(m16569c(map), m16570d(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m16571e(true);
            if (TextUtils.isEmpty(m17021c)) {
                zzbad.m17353i("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbic) zzbhxVar).mo14884L(new com.google.android.gms.ads.internal.overlay.zzc(new zzaht(zzbhxVar.getContext(), ((zzbif) zzbhxVar).mo14903d(), ((zzbih) zzbhxVar).getView()).m16576d(map)));
                return;
            } catch (ActivityNotFoundException e2) {
                zzbad.m17353i(e2.getMessage());
                return;
            }
        }
        m16571e(true);
        String str2 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent = Intent.parseUri(str2, 0);
            } catch (URISyntaxException e3) {
                String valueOf = String.valueOf(str2);
                zzbad.m17347c(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e3);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            String uri = data.toString();
            if (!TextUtils.isEmpty(uri)) {
                try {
                    uri = m16568b(zzbhxVar.getContext(), ((zzbif) zzbhxVar).mo14903d(), uri, ((zzbih) zzbhxVar).getView(), zzbhxVar.mo14897a());
                } catch (Exception e4) {
                    zzbad.m17347c("Error occurred while adding signals.", e4);
                    zzk.zzlk().m17052e(e4, "OpenGmsgHandler.onGmsg");
                }
                try {
                    data = Uri.parse(uri);
                } catch (Exception e5) {
                    String valueOf2 = String.valueOf(uri);
                    zzbad.m17347c(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e5);
                    zzk.zzlk().m17052e(e5, "OpenGmsgHandler.onGmsg");
                }
            }
            intent.setData(data);
        }
        if (intent != null) {
            ((zzbic) zzbhxVar).mo14884L(new com.google.android.gms.ads.internal.overlay.zzc(intent));
            return;
        }
        if (!TextUtils.isEmpty(m17021c)) {
            m17021c = m16568b(zzbhxVar.getContext(), ((zzbif) zzbhxVar).mo14903d(), m17021c, ((zzbih) zzbhxVar).getView(), zzbhxVar.mo14897a());
        }
        ((zzbic) zzbhxVar).mo14884L(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), m17021c, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }
}
