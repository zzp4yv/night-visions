package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.C0311u;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import okhttp3.internal.p454ws.WebSocketProtocol;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
public class zzbha extends WebViewClient implements zzbii {

    /* renamed from: a */
    private static final String[] f23020a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f23021b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private View.OnAttachStateChangeListener f23022A;

    /* renamed from: c */
    protected zzbgz f23023c;

    /* renamed from: d */
    private final zzwj f23024d;

    /* renamed from: e */
    private final HashMap<String, List<zzaho<? super zzbgz>>> f23025e;

    /* renamed from: f */
    private final Object f23026f;

    /* renamed from: g */
    private zzxr f23027g;

    /* renamed from: h */
    private com.google.android.gms.ads.internal.overlay.zzo f23028h;

    /* renamed from: i */
    private zzbij f23029i;

    /* renamed from: j */
    private zzbik f23030j;

    /* renamed from: k */
    private zzagv f23031k;

    /* renamed from: l */
    private zzagx f23032l;

    /* renamed from: m */
    private zzbil f23033m;

    /* renamed from: n */
    private boolean f23034n;

    /* renamed from: o */
    private boolean f23035o;

    /* renamed from: p */
    private boolean f23036p;

    /* renamed from: q */
    private boolean f23037q;

    /* renamed from: r */
    private com.google.android.gms.ads.internal.overlay.zzu f23038r;

    /* renamed from: s */
    private final zzaqa f23039s;

    /* renamed from: t */
    private com.google.android.gms.ads.internal.zzb f23040t;

    /* renamed from: u */
    private zzapr f23041u;

    /* renamed from: v */
    protected zzavb f23042v;

    /* renamed from: w */
    private boolean f23043w;

    /* renamed from: x */
    private boolean f23044x;

    /* renamed from: y */
    private int f23045y;

    /* renamed from: z */
    private boolean f23046z;

    public zzbha(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        this(zzbgzVar, zzwjVar, z, new zzaqa(zzbgzVar, zzbgzVar.mo14904d0(), new zzacf(zzbgzVar.getContext())), null);
    }

    /* renamed from: B */
    private final void m17665B() {
        if (this.f23022A == null) {
            return;
        }
        this.f23023c.getView().removeOnAttachStateChangeListener(this.f23022A);
    }

    /* renamed from: C */
    private final void m17666C() {
        zzbij zzbijVar = this.f23029i;
        if (zzbijVar != null && ((this.f23043w && this.f23045y <= 0) || this.f23044x)) {
            zzbijVar.zzae(!this.f23044x);
            this.f23029i = null;
        }
        this.f23023c.mo14881I();
    }

    /* renamed from: D */
    private static WebResourceResponse m17667D() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21707T0)).booleanValue()) {
            return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        com.google.android.gms.ads.internal.zzk.zzlg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return com.google.android.gms.internal.ads.zzaxi.m17133M(r2);
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse m17668J(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.m17668J(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* renamed from: K */
    private final void m17669K(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21720V1)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    zzk.zzlg().m17180l(context, this.f23023c.mo14899b().f22750f, "gmob-apps", bundle, true);
                }
            }
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            bundle.putString("host", str4);
            zzk.zzlg().m17180l(context, this.f23023c.mo14899b().f22750f, "gmob-apps", bundle, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m17670q(View view, zzavb zzavbVar, int i2) {
        if (!zzavbVar.mo16975g() || i2 <= 0) {
            return;
        }
        zzavbVar.mo16974f(view);
        if (zzavbVar.mo16975g()) {
            zzaxi.f22654a.postDelayed(new RunnableC7188ua(this, view, zzavbVar, i2), 100L);
        }
    }

    /* renamed from: r */
    private final void m17671r(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzapr zzaprVar = this.f23041u;
        boolean m16841k = zzaprVar != null ? zzaprVar.m16841k() : false;
        zzk.zzlf();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.f23023c.getContext(), adOverlayInfoParcel, !m16841k);
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzcVar = adOverlayInfoParcel.zzdkl) != null) {
                str = zzcVar.url;
            }
            zzavbVar.mo16970b(str);
        }
    }

    /* renamed from: A */
    public final ViewTreeObserver.OnScrollChangedListener m17673A() {
        synchronized (this.f23026f) {
        }
        return null;
    }

    /* renamed from: E */
    public final void m17674E(boolean z) {
        this.f23034n = z;
    }

    /* renamed from: F */
    public final void m17675F(boolean z) {
        this.f23046z = z;
    }

    /* renamed from: G */
    public final void m17676G(String str, zzaho<? super zzbgz> zzahoVar) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> list = this.f23025e.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzahoVar);
        }
    }

    /* renamed from: H */
    public final void m17677H(boolean z, int i2) {
        zzxr zzxrVar = (!this.f23023c.mo14921m() || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f23028h;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, zzoVar, zzuVar, zzbgzVar, z, i2, zzbgzVar.mo14899b()));
    }

    /* renamed from: I */
    protected final WebResourceResponse m17678I(String str, Map<String, String> map) {
        zzvs m20672d;
        try {
            String m17021c = zzavx.m17021c(str, this.f23023c.getContext(), this.f23046z);
            if (!m17021c.equals(str)) {
                return m17668J(m17021c, map);
            }
            zzvv m20678y = zzvv.m20678y(str);
            if (m20678y != null && (m20672d = zzk.zzlm().m20672d(m20678y)) != null && m20672d.m20675y()) {
                return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, m20672d.m20676z());
            }
            if (!zzazx.m17324a()) {
                return null;
            }
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21648J1)).booleanValue()) {
                return m17668J(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewClient.interceptRequest");
            return m17667D();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: a */
    public final void mo17679a(Uri uri) {
        String path = uri.getPath();
        List<zzaho<? super zzbgz>> list = this.f23025e.get(path);
        if (list == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(valueOf);
            zzawz.m17082m(sb.toString());
            return;
        }
        zzk.zzlg();
        Map<String, String> m17139X = zzaxi.m17139X(uri);
        if (zzbad.m17345a(2)) {
            String valueOf2 = String.valueOf(path);
            zzawz.m17082m(valueOf2.length() != 0 ? "Received GMSG: ".concat(valueOf2) : new String("Received GMSG: "));
            for (String str : m17139X.keySet()) {
                String str2 = m17139X.get(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
                sb2.append("  ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                zzawz.m17082m(sb2.toString());
            }
        }
        Iterator<zzaho<? super zzbgz>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo14739a(this.f23023c, m17139X);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: b */
    public final void mo17680b(boolean z) {
        synchronized (this.f23026f) {
            this.f23036p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: c */
    public final void mo17681c(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar, boolean z, zzahp zzahpVar, com.google.android.gms.ads.internal.zzb zzbVar, zzaqc zzaqcVar, zzavb zzavbVar) {
        if (zzbVar == null) {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.f23023c.getContext(), zzavbVar, null);
        }
        this.f23041u = new zzapr(this.f23023c, zzaqcVar);
        this.f23042v = zzavbVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21764c1)).booleanValue()) {
            m17697v("/adMetadata", new zzagu(zzagvVar));
        }
        m17697v("/appEvent", new zzagw(zzagxVar));
        m17697v("/backButton", zzagz.f22026j);
        m17697v("/refresh", zzagz.f22027k);
        m17697v("/canOpenURLs", zzagz.f22017a);
        m17697v("/canOpenIntents", zzagz.f22018b);
        m17697v("/click", zzagz.f22019c);
        m17697v("/close", zzagz.f22020d);
        m17697v("/customClose", zzagz.f22021e);
        m17697v("/instrument", zzagz.f22030n);
        m17697v("/delayPageLoaded", zzagz.f22032p);
        m17697v("/delayPageClosed", zzagz.f22033q);
        m17697v("/getLocationInfo", zzagz.f22034r);
        m17697v("/httpTrack", zzagz.f22022f);
        m17697v("/log", zzagz.f22023g);
        m17697v("/mraid", new zzahr(zzbVar, this.f23041u, zzaqcVar));
        m17697v("/mraidLoaded", this.f23039s);
        m17697v("/open", new zzahs(zzbVar, this.f23041u));
        m17697v("/precache", new zzbgc());
        m17697v("/touch", zzagz.f22025i);
        m17697v("/video", zzagz.f22028l);
        m17697v("/videoMeta", zzagz.f22029m);
        if (zzk.zzme().m17002D(this.f23023c.getContext())) {
            m17697v("/logScionEvent", new zzahq(this.f23023c.getContext()));
        }
        this.f23027g = zzxrVar;
        this.f23028h = zzoVar;
        this.f23031k = zzagvVar;
        this.f23032l = zzagxVar;
        this.f23038r = zzuVar;
        this.f23040t = zzbVar;
        this.f23034n = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: d */
    public final void mo17682d() {
        synchronized (this.f23026f) {
            this.f23034n = false;
            this.f23035o = true;
            zzbbm.f22757a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ta

                /* renamed from: f */
                private final zzbha f20563f;

                {
                    this.f20563f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbha zzbhaVar = this.f20563f;
                    zzbhaVar.f23023c.mo14876C();
                    com.google.android.gms.ads.internal.overlay.zzd mo14918k0 = zzbhaVar.f23023c.mo14918k0();
                    if (mo14918k0 != null) {
                        mo14918k0.zzth();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: e */
    public final void mo17683e() {
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            WebView webView = this.f23023c.getWebView();
            if (C0311u.m2101N(webView)) {
                m17670q(webView, zzavbVar, 10);
                return;
            }
            m17665B();
            this.f23022A = new ViewOnAttachStateChangeListenerC7225va(this, zzavbVar);
            this.f23023c.getView().addOnAttachStateChangeListener(this.f23022A);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: f */
    public final void mo17684f() {
        synchronized (this.f23026f) {
            this.f23037q = true;
        }
        this.f23045y++;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: g */
    public final void mo17685g(int i2, int i3) {
        zzapr zzaprVar = this.f23041u;
        if (zzaprVar != null) {
            zzaprVar.m16840j(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: h */
    public final void mo17686h() {
        this.f23045y--;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: i */
    public final void mo17687i(zzbij zzbijVar) {
        this.f23029i = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: j */
    public final void mo17688j(zzbik zzbikVar) {
        this.f23030j = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: k */
    public final void mo17689k() {
        this.f23044x = true;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: l */
    public final void mo17690l(int i2, int i3, boolean z) {
        this.f23039s.m16861h(i2, i3);
        zzapr zzaprVar = this.f23041u;
        if (zzaprVar != null) {
            zzaprVar.m16838h(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: m */
    public final boolean mo17691m() {
        boolean z;
        synchronized (this.f23026f) {
            z = this.f23035o;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: n */
    public final zzavb mo17692n() {
        return this.f23042v;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: o */
    public final com.google.android.gms.ads.internal.zzb mo17693o() {
        return this.f23040t;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawz.m17082m(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo17679a(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f23026f) {
            if (this.f23023c.mo14919l()) {
                zzawz.m17082m("Blank page loaded, 1...");
                this.f23023c.mo14924n0();
                return;
            }
            this.f23043w = true;
            zzbik zzbikVar = this.f23030j;
            if (zzbikVar != null) {
                zzbikVar.mo14762a();
                this.f23030j = null;
            }
            m17666C();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        String valueOf;
        if (i2 < 0) {
            int i3 = (-i2) - 1;
            String[] strArr = f23020a;
            if (i3 < strArr.length) {
                valueOf = strArr[i3];
                m17669K(this.f23023c.getContext(), "http_err", valueOf, str2);
                super.onReceivedError(webView, i2, str, str2);
            }
        }
        valueOf = String.valueOf(i2);
        m17669K(this.f23023c.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String valueOf;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f23021b;
                if (primaryError < strArr.length) {
                    valueOf = strArr[primaryError];
                    Context context = this.f23023c.getContext();
                    zzk.zzli();
                    m17669K(context, "ssl_err", valueOf, sslError.getUrl());
                }
            }
            valueOf = String.valueOf(primaryError);
            Context context2 = this.f23023c.getContext();
            zzk.zzli();
            m17669K(context2, "ssl_err", valueOf, sslError.getUrl());
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f23023c.mo14936w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: p */
    public final void m17694p() {
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            zzavbVar.mo16971c();
            this.f23042v = null;
        }
        m17665B();
        synchronized (this.f23026f) {
            this.f23025e.clear();
            this.f23027g = null;
            this.f23028h = null;
            this.f23029i = null;
            this.f23030j = null;
            this.f23031k = null;
            this.f23032l = null;
            this.f23034n = false;
            this.f23035o = false;
            this.f23036p = false;
            this.f23037q = false;
            this.f23038r = null;
            this.f23033m = null;
            zzapr zzaprVar = this.f23041u;
            if (zzaprVar != null) {
                zzaprVar.m16842l(true);
                this.f23041u = null;
            }
        }
    }

    /* renamed from: s */
    public final void m17695s(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean mo14921m = this.f23023c.mo14921m();
        m17671r(new AdOverlayInfoParcel(zzcVar, (!mo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null, mo14921m ? null : this.f23028h, this.f23038r, this.f23023c.mo14899b()));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m17678I(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawz.m17082m(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo17679a(parse);
        } else {
            if (this.f23034n && webView == this.f23023c.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                    zzxr zzxrVar = this.f23027g;
                    if (zzxrVar != null) {
                        zzxrVar.onAdClicked();
                        zzavb zzavbVar = this.f23042v;
                        if (zzavbVar != null) {
                            zzavbVar.mo16970b(str);
                        }
                        this.f23027g = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f23023c.getWebView().willNotDraw()) {
                String valueOf2 = String.valueOf(str);
                zzbad.m17353i(valueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    zzdh mo14903d = this.f23023c.mo14903d();
                    if (mo14903d != null && mo14903d.m19454e(parse)) {
                        parse = mo14903d.m19452a(parse, this.f23023c.getContext(), this.f23023c.getView(), this.f23023c.mo14897a());
                    }
                } catch (zzdi unused) {
                    String valueOf3 = String.valueOf(str);
                    zzbad.m17353i(valueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf3) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.f23040t;
                if (zzbVar == null || zzbVar.zzkx()) {
                    m17695s(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.f23040t.zzbk(str);
                }
            }
        }
        return true;
    }

    /* renamed from: u */
    public final void m17696u(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> list = this.f23025e.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzaho<? super zzbgz> zzahoVar : list) {
                if (predicate.mo14652a(zzahoVar)) {
                    arrayList.add(zzahoVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: v */
    public final void m17697v(String str, zzaho<? super zzbgz> zzahoVar) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> list = this.f23025e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f23025e.put(str, list);
            }
            list.add(zzahoVar);
        }
    }

    /* renamed from: w */
    public final void m17698w(boolean z, int i2, String str) {
        boolean mo14921m = this.f23023c.mo14921m();
        zzxr zzxrVar = (!mo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        C7262wa c7262wa = mo14921m ? null : new C7262wa(this.f23023c, this.f23028h);
        zzagv zzagvVar = this.f23031k;
        zzagx zzagxVar = this.f23032l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, c7262wa, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, zzbgzVar.mo14899b()));
    }

    /* renamed from: x */
    public final void m17699x(boolean z, int i2, String str, String str2) {
        boolean mo14921m = this.f23023c.mo14921m();
        zzxr zzxrVar = (!mo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        C7262wa c7262wa = mo14921m ? null : new C7262wa(this.f23023c, this.f23028h);
        zzagv zzagvVar = this.f23031k;
        zzagx zzagxVar = this.f23032l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, c7262wa, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, str2, zzbgzVar.mo14899b()));
    }

    /* renamed from: y */
    public final boolean m17700y() {
        boolean z;
        synchronized (this.f23026f) {
            z = this.f23036p;
        }
        return z;
    }

    /* renamed from: z */
    public final ViewTreeObserver.OnGlobalLayoutListener m17701z() {
        synchronized (this.f23026f) {
        }
        return null;
    }

    @VisibleForTesting
    private zzbha(zzbgz zzbgzVar, zzwj zzwjVar, boolean z, zzaqa zzaqaVar, zzapr zzaprVar) {
        this.f23025e = new HashMap<>();
        this.f23026f = new Object();
        this.f23034n = false;
        this.f23024d = zzwjVar;
        this.f23023c = zzbgzVar;
        this.f23035o = z;
        this.f23039s = zzaqaVar;
        this.f23041u = null;
    }
}
