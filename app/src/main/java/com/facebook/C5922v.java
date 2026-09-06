package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import cm.aptoide.p092pt.notification.PullingContentService;
import com.facebook.AccessToken;
import com.facebook.C5613c0;
import com.facebook.C5922v;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONObject;
import p024c.p076q.p077a.C0997a;

/* compiled from: AccessTokenManager.kt */
/* renamed from: com.facebook.v */
/* loaded from: classes.dex */
public final class C5922v {

    /* renamed from: a */
    public static final a f15573a = new a(null);

    /* renamed from: b */
    private static C5922v f15574b;

    /* renamed from: c */
    private final C0997a f15575c;

    /* renamed from: d */
    private final C5921u f15576d;

    /* renamed from: e */
    private AccessToken f15577e;

    /* renamed from: f */
    private final AtomicBoolean f15578f;

    /* renamed from: g */
    private Date f15579g;

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final GraphRequest m12920c(AccessToken accessToken, GraphRequest.InterfaceC5598b interfaceC5598b) {
            e m12922f = m12922f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", m12922f.mo12924a());
            bundle.putString("client_id", accessToken.m11084c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest m11236x = GraphRequest.f14159a.m11236x(accessToken, m12922f.mo12925b(), interfaceC5598b);
            m11236x.m11177H(bundle);
            m11236x.m11176G(EnumC5622e0.GET);
            return m11236x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final GraphRequest m12921d(AccessToken accessToken, GraphRequest.InterfaceC5598b interfaceC5598b) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest m11236x = GraphRequest.f14159a.m11236x(accessToken, "me/permissions", interfaceC5598b);
            m11236x.m11177H(bundle);
            m11236x.m11176G(EnumC5622e0.GET);
            return m11236x;
        }

        /* renamed from: f */
        private final e m12922f(AccessToken accessToken) {
            String m11089h = accessToken.m11089h();
            if (m11089h == null) {
                m11089h = "facebook";
            }
            return C9768m.m32341a(m11089h, "instagram") ? new c() : new b();
        }

        /* renamed from: e */
        public final C5922v m12923e() {
            C5922v c5922v;
            C5922v c5922v2 = C5922v.f15574b;
            if (c5922v2 != null) {
                return c5922v2;
            }
            synchronized (this) {
                c5922v = C5922v.f15574b;
                if (c5922v == null) {
                    C5608a0 c5608a0 = C5608a0.f14199a;
                    C0997a m6341b = C0997a.m6341b(C5608a0.m11284c());
                    C9768m.m32345e(m6341b, "getInstance(applicationContext)");
                    C5922v c5922v3 = new C5922v(m6341b, new C5921u());
                    a aVar = C5922v.f15573a;
                    C5922v.f15574b = c5922v3;
                    c5922v = c5922v3;
                }
            }
            return c5922v;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$b */
    public static final class b implements e {

        /* renamed from: a */
        private final String f15580a = "oauth/access_token";

        /* renamed from: b */
        private final String f15581b = "fb_extend_sso_token";

        @Override // com.facebook.C5922v.e
        /* renamed from: a */
        public String mo12924a() {
            return this.f15581b;
        }

        @Override // com.facebook.C5922v.e
        /* renamed from: b */
        public String mo12925b() {
            return this.f15580a;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$c */
    public static final class c implements e {

        /* renamed from: a */
        private final String f15582a = "refresh_access_token";

        /* renamed from: b */
        private final String f15583b = "ig_refresh_token";

        @Override // com.facebook.C5922v.e
        /* renamed from: a */
        public String mo12924a() {
            return this.f15583b;
        }

        @Override // com.facebook.C5922v.e
        /* renamed from: b */
        public String mo12925b() {
            return this.f15582a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$d */
    static final class d {

        /* renamed from: a */
        private String f15584a;

        /* renamed from: b */
        private int f15585b;

        /* renamed from: c */
        private int f15586c;

        /* renamed from: d */
        private Long f15587d;

        /* renamed from: e */
        private String f15588e;

        /* renamed from: a */
        public final String m12926a() {
            return this.f15584a;
        }

        /* renamed from: b */
        public final Long m12927b() {
            return this.f15587d;
        }

        /* renamed from: c */
        public final int m12928c() {
            return this.f15585b;
        }

        /* renamed from: d */
        public final int m12929d() {
            return this.f15586c;
        }

        /* renamed from: e */
        public final String m12930e() {
            return this.f15588e;
        }

        /* renamed from: f */
        public final void m12931f(String str) {
            this.f15584a = str;
        }

        /* renamed from: g */
        public final void m12932g(Long l) {
            this.f15587d = l;
        }

        /* renamed from: h */
        public final void m12933h(int i2) {
            this.f15585b = i2;
        }

        /* renamed from: i */
        public final void m12934i(int i2) {
            this.f15586c = i2;
        }

        /* renamed from: j */
        public final void m12935j(String str) {
            this.f15588e = str;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$e */
    public interface e {
        /* renamed from: a */
        String mo12924a();

        /* renamed from: b */
        String mo12925b();
    }

    public C5922v(C0997a c0997a, C5921u c5921u) {
        C9768m.m32346f(c0997a, "localBroadcastManager");
        C9768m.m32346f(c5921u, "accessTokenCache");
        this.f15575c = c0997a;
        this.f15576d = c5921u;
        this.f15578f = new AtomicBoolean(false);
        this.f15579g = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12903l(C5922v c5922v, AccessToken.InterfaceC5568a interfaceC5568a) {
        C9768m.m32346f(c5922v, "this$0");
        c5922v.m12904m(interfaceC5568a);
    }

    /* renamed from: m */
    private final void m12904m(final AccessToken.InterfaceC5568a interfaceC5568a) {
        final AccessToken m12914e = m12914e();
        if (m12914e == null) {
            if (interfaceC5568a == null) {
                return;
            }
            interfaceC5568a.m11097a(new FacebookException("No current access token to refresh"));
            return;
        }
        if (!this.f15578f.compareAndSet(false, true)) {
            if (interfaceC5568a == null) {
                return;
            }
            interfaceC5568a.m11097a(new FacebookException("Refresh already in progress"));
            return;
        }
        this.f15579g = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar = f15573a;
        C5613c0 c5613c0 = new C5613c0(aVar.m12921d(m12914e, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.d
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5922v.m12905n(atomicBoolean, hashSet, hashSet2, hashSet3, c5620d0);
            }
        }), aVar.m12920c(m12914e, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.b
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5922v.m12906o(C5922v.d.this, c5620d0);
            }
        }));
        c5613c0.m11323g(new C5613c0.a() { // from class: com.facebook.c
            @Override // com.facebook.C5613c0.a
            /* renamed from: a */
            public final void mo11312a(C5613c0 c5613c02) {
                C5922v.m12907p(C5922v.d.this, m12914e, interfaceC5568a, atomicBoolean, hashSet, hashSet2, hashSet3, this, c5613c02);
            }
        });
        c5613c0.m11326o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m12905n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C5620d0 c5620d0) {
        JSONArray optJSONArray;
        C9768m.m32346f(atomicBoolean, "$permissionsCallSucceeded");
        C9768m.m32346f(set, "$permissions");
        C9768m.m32346f(set2, "$declinedPermissions");
        C9768m.m32346f(set3, "$expiredPermissions");
        C9768m.m32346f(c5620d0, "response");
        JSONObject m11340d = c5620d0.m11340d();
        if (m11340d == null || (optJSONArray = m11340d.optJSONArray("data")) == null) {
            return;
        }
        atomicBoolean.set(true);
        int i2 = 0;
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String optString2 = optJSONObject.optString("status");
                C5663p0 c5663p0 = C5663p0.f14478a;
                if (!C5663p0.m11557a0(optString) && !C5663p0.m11557a0(optString2)) {
                    C9768m.m32345e(optString2, "status");
                    Locale locale = Locale.US;
                    C9768m.m32345e(locale, "US");
                    String lowerCase = optString2.toLowerCase(locale);
                    C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    C9768m.m32345e(lowerCase, "status");
                    int hashCode = lowerCase.hashCode();
                    if (hashCode == -1309235419) {
                        if (lowerCase.equals("expired")) {
                            set3.add(optString);
                        }
                        Log.w("AccessTokenManager", C9768m.m32354n("Unexpected status: ", lowerCase));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && lowerCase.equals("declined")) {
                            set2.add(optString);
                        }
                        Log.w("AccessTokenManager", C9768m.m32354n("Unexpected status: ", lowerCase));
                    } else {
                        if (lowerCase.equals("granted")) {
                            set.add(optString);
                        }
                        Log.w("AccessTokenManager", C9768m.m32354n("Unexpected status: ", lowerCase));
                    }
                }
            }
            if (i3 >= length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m12906o(d dVar, C5620d0 c5620d0) {
        C9768m.m32346f(dVar, "$refreshResult");
        C9768m.m32346f(c5620d0, "response");
        JSONObject m11340d = c5620d0.m11340d();
        if (m11340d == null) {
            return;
        }
        dVar.m12931f(m11340d.optString("access_token"));
        dVar.m12933h(m11340d.optInt("expires_at"));
        dVar.m12934i(m11340d.optInt("expires_in"));
        dVar.m12932g(Long.valueOf(m11340d.optLong("data_access_expiration_time")));
        dVar.m12935j(m11340d.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m12907p(d dVar, AccessToken accessToken, AccessToken.InterfaceC5568a interfaceC5568a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C5922v c5922v, C5613c0 c5613c0) {
        AccessToken accessToken2;
        C9768m.m32346f(dVar, "$refreshResult");
        C9768m.m32346f(atomicBoolean, "$permissionsCallSucceeded");
        C9768m.m32346f(set, "$permissions");
        C9768m.m32346f(set2, "$declinedPermissions");
        C9768m.m32346f(set3, "$expiredPermissions");
        C9768m.m32346f(c5922v, "this$0");
        C9768m.m32346f(c5613c0, "it");
        String m12926a = dVar.m12926a();
        int m12928c = dVar.m12928c();
        Long m12927b = dVar.m12927b();
        String m12930e = dVar.m12930e();
        try {
            a aVar = f15573a;
            if (aVar.m12923e().m12914e() != null) {
                AccessToken m12914e = aVar.m12923e().m12914e();
                if ((m12914e == null ? null : m12914e.m11094m()) == accessToken.m11094m()) {
                    if (!atomicBoolean.get() && m12926a == null && m12928c == 0) {
                        if (interfaceC5568a != null) {
                            interfaceC5568a.m11097a(new FacebookException("Failed to refresh access token"));
                        }
                        c5922v.f15578f.set(false);
                        return;
                    }
                    Date m11088g = accessToken.m11088g();
                    if (dVar.m12928c() != 0) {
                        m11088g = new Date(dVar.m12928c() * 1000);
                    } else if (dVar.m12929d() != 0) {
                        m11088g = new Date((dVar.m12929d() * 1000) + new Date().getTime());
                    }
                    Date date = m11088g;
                    if (m12926a == null) {
                        m12926a = accessToken.m11093l();
                    }
                    String str = m12926a;
                    String m11084c = accessToken.m11084c();
                    String m11094m = accessToken.m11094m();
                    Set m11091j = atomicBoolean.get() ? set : accessToken.m11091j();
                    Set m11086e = atomicBoolean.get() ? set2 : accessToken.m11086e();
                    Set m11087f = atomicBoolean.get() ? set3 : accessToken.m11087f();
                    EnumC5923w m11092k = accessToken.m11092k();
                    Date date2 = new Date();
                    Date date3 = m12927b != null ? new Date(m12927b.longValue() * 1000) : accessToken.m11085d();
                    if (m12930e == null) {
                        m12930e = accessToken.m11089h();
                    }
                    AccessToken accessToken3 = new AccessToken(str, m11084c, m11094m, m11091j, m11086e, m11087f, m11092k, date, date2, date3, m12930e);
                    try {
                        aVar.m12923e().m12917r(accessToken3);
                        c5922v.f15578f.set(false);
                        if (interfaceC5568a != null) {
                            interfaceC5568a.m11098b(accessToken3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken2 = accessToken3;
                        c5922v.f15578f.set(false);
                        if (interfaceC5568a != null && accessToken2 != null) {
                            interfaceC5568a.m11098b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC5568a != null) {
                interfaceC5568a.m11097a(new FacebookException("No current access token to refresh"));
            }
            c5922v.f15578f.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* renamed from: q */
    private final void m12908q(AccessToken accessToken, AccessToken accessToken2) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        Intent intent = new Intent(C5608a0.m11284c(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f15575c.m6344d(intent);
    }

    /* renamed from: s */
    private final void m12909s(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f15577e;
        this.f15577e = accessToken;
        this.f15578f.set(false);
        this.f15579g = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f15576d.m12895g(accessToken);
            } else {
                this.f15576d.m12893a();
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5608a0 c5608a0 = C5608a0.f14199a;
                C5663p0.m11568g(C5608a0.m11284c());
            }
        }
        C5663p0 c5663p02 = C5663p0.f14478a;
        if (C5663p0.m11560c(accessToken2, accessToken)) {
            return;
        }
        m12908q(accessToken2, accessToken);
        m12910t();
    }

    /* renamed from: t */
    private final void m12910t() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        AccessToken.C5570c c5570c = AccessToken.f14054f;
        AccessToken m11105e = c5570c.m11105e();
        AlarmManager alarmManager = (AlarmManager) m11284c.getSystemService("alarm");
        if (c5570c.m11107g()) {
            if ((m11105e == null ? null : m11105e.m11088g()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(m11284c, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, m11105e.m11088g().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(m11284c, 0, intent, 67108864) : PendingIntent.getBroadcast(m11284c, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    private final boolean m12911u() {
        AccessToken m12914e = m12914e();
        if (m12914e == null) {
            return false;
        }
        long time = new Date().getTime();
        return m12914e.m11092k().m12937k() && time - this.f15579g.getTime() > 3600000 && time - m12914e.m11090i().getTime() > PullingContentService.UPDATES_INTERVAL;
    }

    /* renamed from: c */
    public final void m12912c() {
        m12908q(m12914e(), m12914e());
    }

    /* renamed from: d */
    public final void m12913d() {
        if (m12911u()) {
            m12916k(null);
        }
    }

    /* renamed from: e */
    public final AccessToken m12914e() {
        return this.f15577e;
    }

    /* renamed from: j */
    public final boolean m12915j() {
        AccessToken m12894f = this.f15576d.m12894f();
        if (m12894f == null) {
            return false;
        }
        m12909s(m12894f, false);
        return true;
    }

    /* renamed from: k */
    public final void m12916k(final AccessToken.InterfaceC5568a interfaceC5568a) {
        if (C9768m.m32341a(Looper.getMainLooper(), Looper.myLooper())) {
            m12904m(interfaceC5568a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5922v.m12903l(C5922v.this, interfaceC5568a);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m12917r(AccessToken accessToken) {
        m12909s(accessToken, true);
    }
}
