package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkn;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public class zzfx implements InterfaceC7784s4 {

    /* renamed from: a */
    private static volatile zzfx f29271a;

    /* renamed from: A */
    private long f29272A;

    /* renamed from: B */
    private volatile Boolean f29273B;

    /* renamed from: C */
    @VisibleForTesting
    private Boolean f29274C;

    /* renamed from: D */
    @VisibleForTesting
    private Boolean f29275D;

    /* renamed from: E */
    private int f29276E;

    /* renamed from: G */
    private final long f29278G;

    /* renamed from: b */
    private final Context f29279b;

    /* renamed from: c */
    private final String f29280c;

    /* renamed from: d */
    private final String f29281d;

    /* renamed from: e */
    private final String f29282e;

    /* renamed from: f */
    private final boolean f29283f;

    /* renamed from: g */
    private final zzw f29284g;

    /* renamed from: h */
    private final zzx f29285h;

    /* renamed from: i */
    private final C7774r3 f29286i;

    /* renamed from: j */
    private final zzet f29287j;

    /* renamed from: k */
    private final zzfu f29288k;

    /* renamed from: l */
    private final zzjl f29289l;

    /* renamed from: m */
    private final zzkk f29290m;

    /* renamed from: n */
    private final zzer f29291n;

    /* renamed from: o */
    private final Clock f29292o;

    /* renamed from: p */
    private final zzif f29293p;

    /* renamed from: q */
    private final zzhc f29294q;

    /* renamed from: r */
    private final zzb f29295r;

    /* renamed from: s */
    private final zzia f29296s;

    /* renamed from: t */
    private zzep f29297t;

    /* renamed from: u */
    private zzik f29298u;

    /* renamed from: v */
    private zzah f29299v;

    /* renamed from: w */
    private zzeq f29300w;

    /* renamed from: x */
    private zzfm f29301x;

    /* renamed from: z */
    private Boolean f29303z;

    /* renamed from: y */
    private boolean f29302y = false;

    /* renamed from: F */
    private AtomicInteger f29277F = new AtomicInteger(0);

    private zzfx(zzgz zzgzVar) {
        Bundle bundle;
        boolean z = false;
        Preconditions.m14372k(zzgzVar);
        zzw zzwVar = new zzw(zzgzVar.f29313a);
        this.f29284g = zzwVar;
        zzap.m23024e(zzwVar);
        Context context = zzgzVar.f29313a;
        this.f29279b = context;
        this.f29280c = zzgzVar.f29314b;
        this.f29281d = zzgzVar.f29315c;
        this.f29282e = zzgzVar.f29316d;
        this.f29283f = zzgzVar.f29320h;
        this.f29273B = zzgzVar.f29317e;
        com.google.android.gms.internal.measurement.zzv zzvVar = zzgzVar.f29319g;
        if (zzvVar != null && (bundle = zzvVar.f28395l) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f29274C = (Boolean) obj;
            }
            Object obj2 = zzvVar.f28395l.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f29275D = (Boolean) obj2;
            }
        }
        zzcl.m22110h(context);
        Clock m14620c = DefaultClock.m14620c();
        this.f29292o = m14620c;
        this.f29278G = m14620c.mo14608a();
        this.f29285h = new zzx(this);
        C7774r3 c7774r3 = new C7774r3(this);
        c7774r3.m22808q();
        this.f29286i = c7774r3;
        zzet zzetVar = new zzet(this);
        zzetVar.m22808q();
        this.f29287j = zzetVar;
        zzkk zzkkVar = new zzkk(this);
        zzkkVar.m22808q();
        this.f29290m = zzkkVar;
        zzer zzerVar = new zzer(this);
        zzerVar.m22808q();
        this.f29291n = zzerVar;
        this.f29295r = new zzb(this);
        zzif zzifVar = new zzif(this);
        zzifVar.m22858y();
        this.f29293p = zzifVar;
        zzhc zzhcVar = new zzhc(this);
        zzhcVar.m22858y();
        this.f29294q = zzhcVar;
        zzjl zzjlVar = new zzjl(this);
        zzjlVar.m22858y();
        this.f29289l = zzjlVar;
        zzia zziaVar = new zzia(this);
        zziaVar.m22808q();
        this.f29296s = zziaVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.m22808q();
        this.f29288k = zzfuVar;
        com.google.android.gms.internal.measurement.zzv zzvVar2 = zzgzVar.f29319g;
        if (zzvVar2 != null && zzvVar2.f28390g != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzhc m23216H = m23216H();
            if (m23216H.mo22834f().getApplicationContext() instanceof Application) {
                Application application = (Application) m23216H.mo22834f().getApplicationContext();
                if (m23216H.f29321c == null) {
                    m23216H.f29321c = new C7722l5(m23216H, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(m23216H.f29321c);
                    application.registerActivityLifecycleCallbacks(m23216H.f29321c);
                    m23216H.mo22836h().m23145P().m23147a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo22836h().m23140K().m23147a("Application context is not an Application");
        }
        zzfuVar.m23201z(new RunnableC7837y3(this, zzgzVar));
    }

    /* renamed from: A */
    private static void m23202A(AbstractC7766q4 abstractC7766q4) {
        if (abstractC7766q4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC7766q4.m22811t()) {
            return;
        }
        String valueOf = String.valueOf(abstractC7766q4.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static zzfx m23203a(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        Bundle bundle;
        if (zzvVar != null && (zzvVar.f28393j == null || zzvVar.f28394k == null)) {
            zzvVar = new com.google.android.gms.internal.measurement.zzv(zzvVar.f28389f, zzvVar.f28390g, zzvVar.f28391h, zzvVar.f28392i, null, null, zzvVar.f28395l);
        }
        Preconditions.m14372k(context);
        Preconditions.m14372k(context.getApplicationContext());
        if (f29271a == null) {
            synchronized (zzfx.class) {
                if (f29271a == null) {
                    f29271a = new zzfx(new zzgz(context, zzvVar));
                }
            }
        } else if (zzvVar != null && (bundle = zzvVar.f28395l) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            f29271a.m23234n(zzvVar.f28395l.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f29271a;
    }

    @VisibleForTesting
    /* renamed from: b */
    public static zzfx m23204b(Context context, String str, String str2, Bundle bundle) {
        return m23203a(context, new com.google.android.gms.internal.measurement.zzv(0L, 0L, true, null, null, null, bundle));
    }

    /* renamed from: k */
    private static void m23206k(C7775r4 c7775r4) {
        if (c7775r4 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m23207l(zzgz zzgzVar) {
        String concat;
        zzev zzevVar;
        mo22835g().mo22792d();
        zzx.m23562z();
        zzah zzahVar = new zzah(this);
        zzahVar.m22808q();
        this.f29299v = zzahVar;
        zzeq zzeqVar = new zzeq(this, zzgzVar.f29318f);
        zzeqVar.m22858y();
        this.f29300w = zzeqVar;
        zzep zzepVar = new zzep(this);
        zzepVar.m22858y();
        this.f29297t = zzepVar;
        zzik zzikVar = new zzik(this);
        zzikVar.m22858y();
        this.f29298u = zzikVar;
        this.f29290m.m22809r();
        this.f29286i.m22809r();
        this.f29301x = new zzfm(this);
        this.f29300w.m22859z();
        mo22836h().m23143N().m23148b("App measurement is starting up, version", Long.valueOf(this.f29285h.m23565C()));
        mo22836h().m23143N().m23147a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m23110C = zzeqVar.m23110C();
        if (TextUtils.isEmpty(this.f29280c)) {
            if (m23217I().m23550v0(m23110C)) {
                zzevVar = mo22836h().m23143N();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzev m23143N = mo22836h().m23143N();
                String valueOf = String.valueOf(m23110C);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzevVar = m23143N;
            }
            zzevVar.m23147a(concat);
        }
        mo22836h().m23144O().m23147a("Debug-level message logging enabled");
        if (this.f29276E != this.f29277F.get()) {
            mo22836h().m23137H().m23149c("Not all components initialized", Integer.valueOf(this.f29276E), Integer.valueOf(this.f29277F.get()));
        }
        this.f29302y = true;
    }

    /* renamed from: w */
    private final zzia m23208w() {
        m23202A(this.f29296s);
        return this.f29296s;
    }

    /* renamed from: x */
    private final void m23209x() {
        if (!this.f29302y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: z */
    private static void m23210z(AbstractC7800u2 abstractC7800u2) {
        if (abstractC7800u2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC7800u2.m22856w()) {
            return;
        }
        String valueOf = String.valueOf(abstractC7800u2.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: B */
    public final C7774r3 m23211B() {
        m23206k(this.f29286i);
        return this.f29286i;
    }

    /* renamed from: C */
    public final zzet m23212C() {
        zzet zzetVar = this.f29287j;
        if (zzetVar == null || !zzetVar.m22811t()) {
            return null;
        }
        return this.f29287j;
    }

    /* renamed from: D */
    public final zzjl m23213D() {
        m23210z(this.f29289l);
        return this.f29289l;
    }

    /* renamed from: E */
    public final zzfm m23214E() {
        return this.f29301x;
    }

    /* renamed from: F */
    final zzfu m23215F() {
        return this.f29288k;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: G */
    public final zzw mo22832G() {
        return this.f29284g;
    }

    /* renamed from: H */
    public final zzhc m23216H() {
        m23210z(this.f29294q);
        return this.f29294q;
    }

    /* renamed from: I */
    public final zzkk m23217I() {
        m23206k(this.f29290m);
        return this.f29290m;
    }

    /* renamed from: J */
    public final zzer m23218J() {
        m23206k(this.f29291n);
        return this.f29291n;
    }

    /* renamed from: K */
    public final zzep m23219K() {
        m23210z(this.f29297t);
        return this.f29297t;
    }

    /* renamed from: L */
    public final boolean m23220L() {
        return TextUtils.isEmpty(this.f29280c);
    }

    /* renamed from: M */
    public final String m23221M() {
        return this.f29280c;
    }

    /* renamed from: N */
    public final String m23222N() {
        return this.f29281d;
    }

    /* renamed from: O */
    public final String m23223O() {
        return this.f29282e;
    }

    /* renamed from: P */
    public final boolean m23224P() {
        return this.f29283f;
    }

    /* renamed from: Q */
    public final zzif m23225Q() {
        m23210z(this.f29293p);
        return this.f29293p;
    }

    /* renamed from: R */
    public final zzik m23226R() {
        m23210z(this.f29298u);
        return this.f29298u;
    }

    /* renamed from: S */
    public final zzah m23227S() {
        m23202A(this.f29299v);
        return this.f29299v;
    }

    /* renamed from: T */
    public final zzeq m23228T() {
        m23210z(this.f29300w);
        return this.f29300w;
    }

    /* renamed from: U */
    public final zzb m23229U() {
        zzb zzbVar = this.f29295r;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: c */
    protected final void m23230c() {
        mo22835g().mo22792d();
        if (m23211B().f28853f.m23155a() == 0) {
            m23211B().f28853f.m23156b(this.f29292o.mo14608a());
        }
        if (Long.valueOf(m23211B().f28858k.m23155a()).longValue() == 0) {
            mo22836h().m23145P().m23148b("Persisting first open", Long.valueOf(this.f29278G));
            m23211B().f28858k.m23156b(this.f29278G);
        }
        if (m23241u()) {
            if (!TextUtils.isEmpty(m23228T().m23111D()) || !TextUtils.isEmpty(m23228T().m23112E())) {
                m23217I();
                if (zzkk.m23506d0(m23228T().m23111D(), m23211B().m22819E(), m23228T().m23112E(), m23211B().m22820F())) {
                    mo22836h().m23143N().m23147a("Rechecking which service to use due to a GMP App Id change");
                    m23211B().m22822I();
                    m23219K().m23105I();
                    this.f29298u.m23376b0();
                    this.f29298u.m23374Z();
                    m23211B().f28858k.m23156b(this.f29278G);
                    m23211B().f28860m.m23160b(null);
                }
                m23211B().m22815A(m23228T().m23111D());
                m23211B().m22817C(m23228T().m23112E());
            }
            m23216H().m23278O(m23211B().f28860m.m23159a());
            if (zzkb.m22447b() && this.f29285h.m23587r(zzap.f29128X0) && !m23217I().m23524D0() && !TextUtils.isEmpty(m23211B().f28850C.m23159a())) {
                mo22836h().m23140K().m23147a("Remote config removed with active feature rollouts");
                m23211B().f28850C.m23160b(null);
            }
            if (!TextUtils.isEmpty(m23228T().m23111D()) || !TextUtils.isEmpty(m23228T().m23112E())) {
                boolean m23236p = m23236p();
                if (!m23211B().m22826M() && !this.f29285h.m23570I()) {
                    m23211B().m22818D(!m23236p);
                }
                if (m23236p) {
                    m23216H().m23296h0();
                }
                C7625a7 c7625a7 = m23213D().f29350d;
                if (c7625a7.f28551b.mo22841n().m23578R(c7625a7.f28551b.mo22795q().m23110C()) && zzkn.m22461b() && c7625a7.f28551b.mo22841n().m23564B(c7625a7.f28551b.mo22795q().m23110C(), zzap.f29144g0)) {
                    c7625a7.f28551b.mo22792d();
                    if (c7625a7.f28551b.mo22840m().m22829x(c7625a7.f28551b.mo22837j().mo14608a())) {
                        c7625a7.f28551b.mo22840m().f28866s.m23157a(true);
                        if (Build.VERSION.SDK_INT >= 16) {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (runningAppProcessInfo.importance == 100) {
                                c7625a7.f28551b.mo22836h().m23145P().m23147a("Detected application was in foreground");
                                c7625a7.m22701c(c7625a7.f28551b.mo22837j().mo14608a(), false);
                            }
                        }
                    }
                }
                m23226R().m23367S(new AtomicReference<>());
            }
        } else if (m23236p()) {
            if (!m23217I().m23548s0("android.permission.INTERNET")) {
                mo22836h().m23137H().m23147a("App is missing INTERNET permission");
            }
            if (!m23217I().m23548s0("android.permission.ACCESS_NETWORK_STATE")) {
                mo22836h().m23137H().m23147a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.m14674a(this.f29279b).m14672f() && !this.f29285h.m23583Y()) {
                if (!zzfn.m23169b(this.f29279b)) {
                    mo22836h().m23137H().m23147a("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzkk.m23500U(this.f29279b, false)) {
                    mo22836h().m23137H().m23147a("AppMeasurementService not registered/enabled");
                }
            }
            mo22836h().m23137H().m23147a("Uploading is not possible. App measurement disabled");
        }
        m23211B().f28868u.m23157a(this.f29285h.m23587r(zzap.f29168s0));
        m23211B().f28869v.m23157a(this.f29285h.m23587r(zzap.f29170t0));
    }

    /* renamed from: d */
    final void m23231d(AbstractC7800u2 abstractC7800u2) {
        this.f29276E++;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: f */
    public final Context mo22834f() {
        return this.f29279b;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: g */
    public final zzfu mo22835g() {
        m23202A(this.f29288k);
        return this.f29288k;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: h */
    public final zzet mo22836h() {
        m23202A(this.f29287j);
        return this.f29287j;
    }

    /* renamed from: i */
    final void m23232i(AbstractC7766q4 abstractC7766q4) {
        this.f29276E++;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: j */
    public final Clock mo22837j() {
        return this.f29292o;
    }

    /* renamed from: m */
    final /* synthetic */ void m23233m(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            mo22836h().m23140K().m23149c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        m23211B().f28848A.m23157a(true);
        if (bArr.length == 0) {
            mo22836h().m23144O().m23147a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString(DeepLinkIntentReceiver.DEEP_LINK, HttpUrl.FRAGMENT_ENCODE_SET);
            String optString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                mo22836h().m23144O().m23147a("Deferred Deep Link is empty.");
                return;
            }
            zzkk m23217I = m23217I();
            m23217I.mo22790b();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = m23217I.mo22834f().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                mo22836h().m23140K().m23149c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f29294q.m23281S("auto", "_cmp", bundle);
            zzkk m23217I2 = m23217I();
            if (TextUtils.isEmpty(optString) || !m23217I2.m23538Z(optString, optDouble)) {
                return;
            }
            m23217I2.mo22834f().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e2) {
            mo22836h().m23137H().m23148b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    /* renamed from: n */
    final void m23234n(boolean z) {
        this.f29273B = Boolean.valueOf(z);
    }

    /* renamed from: o */
    public final boolean m23235o() {
        return this.f29273B != null && this.f29273B.booleanValue();
    }

    /* renamed from: p */
    public final boolean m23236p() {
        boolean z;
        mo22835g().mo22792d();
        m23209x();
        if (!this.f29285h.m23587r(zzap.f29156m0)) {
            if (this.f29285h.m23570I()) {
                return false;
            }
            Boolean m23571J = this.f29285h.m23571J();
            if (m23571J != null) {
                z = m23571J.booleanValue();
            } else {
                z = !GoogleServices.m14023d();
                if (z && this.f29273B != null && zzap.f29146h0.m23095a(null).booleanValue()) {
                    z = this.f29273B.booleanValue();
                }
            }
            return m23211B().m22816B(z);
        }
        if (this.f29285h.m23570I()) {
            return false;
        }
        Boolean bool = this.f29275D;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean m22823J = m23211B().m22823J();
        if (m22823J != null) {
            return m22823J.booleanValue();
        }
        Boolean m23571J2 = this.f29285h.m23571J();
        if (m23571J2 != null) {
            return m23571J2.booleanValue();
        }
        Boolean bool2 = this.f29274C;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (GoogleServices.m14023d()) {
            return false;
        }
        if (!this.f29285h.m23587r(zzap.f29146h0) || this.f29273B == null) {
            return true;
        }
        return this.f29273B.booleanValue();
    }

    /* renamed from: q */
    final long m23237q() {
        Long valueOf = Long.valueOf(m23211B().f28858k.m23155a());
        return valueOf.longValue() == 0 ? this.f29278G : Math.min(this.f29278G, valueOf.longValue());
    }

    /* renamed from: r */
    final void m23238r() {
    }

    /* renamed from: s */
    final void m23239s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: t */
    final void m23240t() {
        this.f29277F.incrementAndGet();
    }

    /* renamed from: u */
    protected final boolean m23241u() {
        m23209x();
        mo22835g().mo22792d();
        Boolean bool = this.f29303z;
        if (bool == null || this.f29272A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f29292o.mo14609b() - this.f29272A) > 1000)) {
            this.f29272A = this.f29292o.mo14609b();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(m23217I().m23548s0("android.permission.INTERNET") && m23217I().m23548s0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.m14674a(this.f29279b).m14672f() || this.f29285h.m23583Y() || (zzfn.m23169b(this.f29279b) && zzkk.m23500U(this.f29279b, false))));
            this.f29303z = valueOf;
            if (valueOf.booleanValue()) {
                if (!m23217I().m23547r0(m23228T().m23111D(), m23228T().m23112E()) && TextUtils.isEmpty(m23228T().m23112E())) {
                    z = false;
                }
                this.f29303z = Boolean.valueOf(z);
            }
        }
        return this.f29303z.booleanValue();
    }

    /* renamed from: v */
    public final void m23242v() {
        mo22835g().mo22792d();
        m23202A(m23208w());
        String m23110C = m23228T().m23110C();
        Pair<String, Boolean> m22827v = m23211B().m22827v(m23110C);
        if (!this.f29285h.m23573L().booleanValue() || ((Boolean) m22827v.second).booleanValue() || TextUtils.isEmpty((CharSequence) m22827v.first)) {
            mo22836h().m23144O().m23147a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!m23208w().m23326x()) {
            mo22836h().m23140K().m23147a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        URL m23526H = m23217I().m23526H(m23228T().mo22841n().m23565C(), m23110C, (String) m22827v.first, m23211B().f28849B.m23155a() - 1);
        zzia m23208w = m23208w();
        InterfaceC7749o5 interfaceC7749o5 = new InterfaceC7749o5(this) { // from class: com.google.android.gms.measurement.internal.a4

            /* renamed from: a */
            private final zzfx f28544a;

            {
                this.f28544a = this;
            }

            @Override // com.google.android.gms.measurement.internal.InterfaceC7749o5
            /* renamed from: a */
            public final void mo22698a(String str, int i2, Throwable th, byte[] bArr, Map map) {
                this.f28544a.m23233m(str, i2, th, bArr, map);
            }
        };
        m23208w.mo22792d();
        m23208w.m22807p();
        Preconditions.m14372k(m23526H);
        Preconditions.m14372k(interfaceC7749o5);
        m23208w.mo22835g().m23197C(new RunnableC7776r5(m23208w, m23110C, m23526H, null, null, interfaceC7749o5));
    }

    /* renamed from: y */
    public final zzx m23243y() {
        return this.f29285h;
    }
}
