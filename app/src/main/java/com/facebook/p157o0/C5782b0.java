package com.facebook.p157o0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C5608a0;
import com.facebook.EnumC5626g0;
import com.facebook.FacebookException;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5635b0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5645g0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5665q0;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.C5782b0;
import com.facebook.p157o0.p164p0.C5860b;
import com.facebook.p157o0.p164p0.C5861c;
import com.facebook.p157o0.p165q0.C5868f;
import com.facebook.p157o0.p167s0.C5892c;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10742u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;

/* compiled from: AppEventsLoggerImpl.kt */
/* renamed from: com.facebook.o0.b0 */
/* loaded from: classes.dex */
public final class C5782b0 {

    /* renamed from: a */
    public static final a f14915a = new a(null);

    /* renamed from: b */
    private static final String f14916b;

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f14917c;

    /* renamed from: d */
    private static C5780a0.b f14918d;

    /* renamed from: e */
    private static final Object f14919e;

    /* renamed from: f */
    private static String f14920f;

    /* renamed from: g */
    private static boolean f14921g;

    /* renamed from: h */
    private static String f14922h;

    /* renamed from: i */
    private final String f14923i;

    /* renamed from: j */
    private C5895t f14924j;

    /* compiled from: AppEventsLoggerImpl.kt */
    /* renamed from: com.facebook.o0.b0$a */
    public static final class a {

        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: com.facebook.o0.b0$a$a, reason: collision with other inner class name */
        public static final class C11412a implements C5645g0.a {
            C11412a() {
            }

            @Override // com.facebook.internal.C5645g0.a
            /* renamed from: a */
            public void mo11440a(String str) {
                C5782b0.f14915a.m12215t(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m12199l(Context context, C5782b0 c5782b0) {
            C9768m.m32346f(context, "$context");
            C9768m.m32346f(c5782b0, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i3 |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
                if (i4 > 10) {
                    break;
                } else {
                    i2 = i4;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i3) {
                sharedPreferences.edit().putInt("kitsBitmask", i3).apply();
                c5782b0.m12192p("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final void m12200m() {
            synchronized (C5782b0.f14919e) {
                if (C5782b0.f14917c != null) {
                    return;
                }
                a aVar = C5782b0.f14915a;
                C5782b0.f14917c = new ScheduledThreadPoolExecutor(1);
                C10742u c10742u = C10742u.f41439a;
                RunnableC5795i runnableC5795i = new Runnable() { // from class: com.facebook.o0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5782b0.a.m12201n();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C5782b0.f14917c;
                if (scheduledThreadPoolExecutor == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutor.scheduleAtFixedRate(runnableC5795i, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m12201n() {
            HashSet<String> hashSet = new HashSet();
            C5911y c5911y = C5911y.f15544a;
            Iterator<C5895t> it = C5911y.m12862j().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m12760b());
            }
            for (String str : hashSet) {
                C5639d0 c5639d0 = C5639d0.f14392a;
                C5639d0.m11428o(str, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public final void m12204q(C5908v c5908v, C5895t c5895t) {
            C5911y c5911y = C5911y.f15544a;
            C5911y.m12853a(c5895t, c5908v);
            C5633a0 c5633a0 = C5633a0.f14313a;
            if (C5633a0.m11378g(C5633a0.b.OnDevicePostInstallEventProcessing)) {
                C5892c c5892c = C5892c.f15458a;
                if (C5892c.m12741b()) {
                    C5892c.m12744e(c5895t.m12760b(), c5908v);
                }
            }
            if (c5908v.m12836c() || C5782b0.f14921g) {
                return;
            }
            if (C9768m.m32341a(c5908v.m12838f(), "fb_mobile_activate_app")) {
                C5782b0.f14921g = true;
            } else {
                C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final void m12205r(String str) {
            C5651j0.f14429a.m11454b(EnumC5626g0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        /* renamed from: d */
        public final void m12206d(Application application, String str) {
            C9768m.m32346f(application, "application");
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (!C5608a0.m11304w()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            C5897u c5897u = C5897u.f15488a;
            C5897u.m12772c();
            C5798j0 c5798j0 = C5798j0.f14968a;
            C5798j0.m12265d();
            if (str == null) {
                str = C5608a0.m11285d();
            }
            C5608a0.m11271K(application, str);
            C5868f c5868f = C5868f.f15358a;
            C5868f.m12622x(application, str);
        }

        /* renamed from: e */
        public final void m12207e() {
            if (m12210h() != C5780a0.b.EXPLICIT_ONLY) {
                C5911y c5911y = C5911y.f15544a;
                C5911y.m12858f(EnumC5786d0.EAGER_FLUSHING_EVENT);
            }
        }

        /* renamed from: f */
        public final Executor m12208f() {
            if (C5782b0.f14917c == null) {
                m12200m();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C5782b0.f14917c;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: g */
        public final String m12209g(Context context) {
            C9768m.m32346f(context, "context");
            if (C5782b0.f14920f == null) {
                synchronized (C5782b0.f14919e) {
                    if (C5782b0.f14920f == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        a aVar = C5782b0.f14915a;
                        C5782b0.f14920f = sharedPreferences.getString("anonymousAppDeviceGUID", null);
                        if (C5782b0.f14920f == null) {
                            UUID randomUUID = UUID.randomUUID();
                            C9768m.m32345e(randomUUID, "randomUUID()");
                            C5782b0.f14920f = C9768m.m32354n("XZ", randomUUID);
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C5782b0.f14920f).apply();
                        }
                    }
                    C10742u c10742u = C10742u.f41439a;
                }
            }
            String str = C5782b0.f14920f;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: h */
        public final C5780a0.b m12210h() {
            C5780a0.b bVar;
            synchronized (C5782b0.f14919e) {
                bVar = C5782b0.f14918d;
            }
            return bVar;
        }

        /* renamed from: i */
        public final String m12211i() {
            C5645g0 c5645g0 = C5645g0.f14417a;
            C5645g0.m11438d(new C11412a());
            C5608a0 c5608a0 = C5608a0.f14199a;
            return C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        /* renamed from: j */
        public final String m12212j() {
            String str;
            synchronized (C5782b0.f14919e) {
                str = C5782b0.f14922h;
            }
            return str;
        }

        /* renamed from: k */
        public final void m12213k(final Context context, String str) {
            C9768m.m32346f(context, "context");
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5608a0.m11288g()) {
                final C5782b0 c5782b0 = new C5782b0(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C5782b0.f14917c;
                if (scheduledThreadPoolExecutor == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutor.execute(new Runnable() { // from class: com.facebook.o0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5782b0.a.m12199l(context, c5782b0);
                    }
                });
            }
        }

        /* renamed from: s */
        public final void m12214s() {
            C5911y c5911y = C5911y.f15544a;
            C5911y.m12871s();
        }

        /* renamed from: t */
        public final void m12215t(String str) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences sharedPreferences = C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = C5782b0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f14916b = canonicalName;
        f14918d = C5780a0.b.AUTO;
        f14919e = new Object();
    }

    public C5782b0(String str, String str2, AccessToken accessToken) {
        C9768m.m32346f(str, "activityName");
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        this.f14923i = str;
        accessToken = accessToken == null ? AccessToken.f14054f.m11105e() : accessToken;
        if (accessToken == null || accessToken.m11095n() || !(str2 == null || C9768m.m32341a(str2, accessToken.m11084c()))) {
            if (str2 == null) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5608a0 c5608a0 = C5608a0.f14199a;
                str2 = C5663p0.m11537H(C5608a0.m11284c());
            }
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.f14924j = new C5895t(null, str2);
        } else {
            this.f14924j = new C5895t(accessToken);
        }
        f14915a.m12200m();
    }

    /* renamed from: j */
    public final void m12186j() {
        C5911y c5911y = C5911y.f15544a;
        C5911y.m12858f(EnumC5786d0.EXPLICIT);
    }

    /* renamed from: k */
    public final void m12187k(String str) {
        m12189m(str, null);
    }

    /* renamed from: l */
    public final void m12188l(String str, double d2, Bundle bundle) {
        Double valueOf = Double.valueOf(d2);
        C5868f c5868f = C5868f.f15358a;
        m12190n(str, valueOf, bundle, false, C5868f.m12606h());
    }

    /* renamed from: m */
    public final void m12189m(String str, Bundle bundle) {
        C5868f c5868f = C5868f.f15358a;
        m12190n(str, null, bundle, false, C5868f.m12606h());
    }

    /* renamed from: n */
    public final void m12190n(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            C5635b0 c5635b0 = C5635b0.f14356a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5635b0.m11385b("app_events_killswitch", C5608a0.m11285d(), false)) {
                C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                C5860b c5860b = C5860b.f15339a;
                C5860b.m12590h(bundle, str);
                C5861c c5861c = C5861c.f15343a;
                C5861c.m12596e(bundle);
                String str2 = this.f14923i;
                C5868f c5868f = C5868f.f15358a;
                f14915a.m12204q(new C5908v(str2, str, d2, bundle, z, C5868f.m12608j(), uuid), this.f14924j);
            } catch (FacebookException e2) {
                C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (JSONException e3) {
                C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
            }
        }
    }

    /* renamed from: o */
    public final void m12191o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_is_suggested_event", "1");
        bundle.putString("_button_text", str2);
        m12189m(str, bundle);
    }

    /* renamed from: p */
    public final void m12192p(String str, Double d2, Bundle bundle) {
        C5868f c5868f = C5868f.f15358a;
        m12190n(str, d2, bundle, true, C5868f.m12606h());
    }

    /* renamed from: q */
    public final void m12193q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal == null || currency == null) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11575j0(f14916b, "purchaseAmount and currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        Double valueOf = Double.valueOf(bigDecimal.doubleValue());
        C5868f c5868f = C5868f.f15358a;
        m12190n(str, valueOf, bundle2, true, C5868f.m12606h());
    }

    /* renamed from: r */
    public final void m12194r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            f14915a.m12205r("purchaseAmount cannot be null");
            return;
        }
        if (currency == null) {
            f14915a.m12205r("currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        Double valueOf = Double.valueOf(bigDecimal.doubleValue());
        C5868f c5868f = C5868f.f15358a;
        m12190n("fb_mobile_purchase", valueOf, bundle2, z, C5868f.m12606h());
        f14915a.m12207e();
    }

    /* renamed from: s */
    public final void m12195s(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        m12194r(bigDecimal, currency, bundle, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5782b0(Context context, String str, AccessToken accessToken) {
        this(C5663p0.m11590r(context), str, accessToken);
        C5663p0 c5663p0 = C5663p0.f14478a;
    }
}
