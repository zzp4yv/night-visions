package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.InterfaceC0052c;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C5608a0;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.InterfaceC5925y;
import com.facebook.InterfaceC5926z;
import com.facebook.Profile;
import com.facebook.internal.C5665q0;
import com.facebook.internal.C5671t;
import com.facebook.internal.C5700v;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.C10742u;
import kotlin.collections.C10749c0;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import p024c.p038c.p039b.C0858b;

/* compiled from: LoginManager.kt */
/* renamed from: com.facebook.login.x */
/* loaded from: classes2.dex */
public class C5771x {

    /* renamed from: a */
    public static final b f14858a;

    /* renamed from: b */
    private static final Set<String> f14859b;

    /* renamed from: c */
    private static final String f14860c;

    /* renamed from: d */
    private static volatile C5771x f14861d;

    /* renamed from: g */
    private final SharedPreferences f14864g;

    /* renamed from: i */
    private String f14866i;

    /* renamed from: j */
    private boolean f14867j;

    /* renamed from: l */
    private boolean f14869l;

    /* renamed from: m */
    private boolean f14870m;

    /* renamed from: e */
    private EnumC5767t f14862e = EnumC5767t.NATIVE_WITH_FALLBACK;

    /* renamed from: f */
    private EnumC5765r f14863f = EnumC5765r.FRIENDS;

    /* renamed from: h */
    private String f14865h = "rerequest";

    /* renamed from: k */
    private EnumC5773z f14868k = EnumC5773z.FACEBOOK;

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$a */
    private static final class a implements InterfaceC5750c0 {

        /* renamed from: a */
        private final Activity f14871a;

        public a(Activity activity) {
            C9768m.m32346f(activity, "activity");
            this.f14871a = activity;
        }

        @Override // com.facebook.login.InterfaceC5750c0
        /* renamed from: a */
        public Activity mo12046a() {
            return this.f14871a;
        }

        @Override // com.facebook.login.InterfaceC5750c0
        public void startActivityForResult(Intent intent, int i2) {
            C9768m.m32346f(intent, "intent");
            mo12046a().startActivityForResult(intent, i2);
        }
    }

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final Set<String> m12124d() {
            Set<String> m38922i;
            m38922i = C10789w0.m38922i("ads_management", "create_event", "rsvp_event");
            return m38922i;
        }

        /* renamed from: b */
        public final C5772y m12125b(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            List m38586R;
            List m38586R2;
            C9768m.m32346f(request, "request");
            C9768m.m32346f(accessToken, "newToken");
            Set<String> m11967n = request.m11967n();
            m38586R = C10749c0.m38586R(accessToken.m11091j());
            Set m38572H0 = C10749c0.m38572H0(m38586R);
            if (request.m11972s()) {
                m38572H0.retainAll(m11967n);
            }
            m38586R2 = C10749c0.m38586R(m11967n);
            Set m38572H02 = C10749c0.m38572H0(m38586R2);
            m38572H02.removeAll(m38572H0);
            return new C5772y(accessToken, authenticationToken, m38572H0, m38572H02);
        }

        /* renamed from: c */
        public C5771x m12126c() {
            if (C5771x.f14861d == null) {
                synchronized (this) {
                    b bVar = C5771x.f14858a;
                    C5771x.f14861d = new C5771x();
                    C10742u c10742u = C10742u.f41439a;
                }
            }
            C5771x c5771x = C5771x.f14861d;
            if (c5771x != null) {
                return c5771x;
            }
            C9768m.m32363w("instance");
            throw null;
        }

        /* renamed from: e */
        public final boolean m12127e(String str) {
            if (str != null) {
                return C10513u.m37511E(str, "publish", false, 2, null) || C10513u.m37511E(str, "manage", false, 2, null) || C5771x.f14859b.contains(str);
            }
            return false;
        }
    }

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$c */
    private static final class c {

        /* renamed from: a */
        public static final c f14872a = new c();

        /* renamed from: b */
        private static C5770w f14873b;

        private c() {
        }

        /* renamed from: a */
        public final synchronized C5770w m12128a(Context context) {
            if (context == null) {
                C5608a0 c5608a0 = C5608a0.f14199a;
                context = C5608a0.m11284c();
            }
            if (context == null) {
                return null;
            }
            if (f14873b == null) {
                C5608a0 c5608a02 = C5608a0.f14199a;
                f14873b = new C5770w(context, C5608a0.m11285d());
            }
            return f14873b;
        }
    }

    static {
        b bVar = new b(null);
        f14858a = bVar;
        f14859b = bVar.m12124d();
        String cls = C5771x.class.toString();
        C9768m.m32345e(cls, "LoginManager::class.java.toString()");
        f14860c = cls;
    }

    public C5771x() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences sharedPreferences = C5608a0.m11284c().getSharedPreferences("com.facebook.loginManager", 0);
        C9768m.m32345e(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f14864g = sharedPreferences;
        if (C5608a0.f14215q) {
            C5700v c5700v = C5700v.f14626a;
            if (C5700v.m11803a() != null) {
                C0858b.m5392a(C5608a0.m11284c(), "com.android.chrome", new C5764q());
                C0858b.m5393b(C5608a0.m11284c(), C5608a0.m11284c().getPackageName());
            }
        }
    }

    /* renamed from: e */
    private final void m12102e(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z, InterfaceC5926z<C5772y> interfaceC5926z) {
        if (accessToken != null) {
            AccessToken.f14054f.m11108h(accessToken);
            Profile.f14188f.m11256a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.f14071f.m11113a(authenticationToken);
        }
        if (interfaceC5926z != null) {
            C5772y m12125b = (accessToken == null || request == null) ? null : f14858a.m12125b(request, accessToken, authenticationToken);
            if (z || (m12125b != null && m12125b.m12130b().isEmpty())) {
                interfaceC5926z.onCancel();
                return;
            }
            if (facebookException != null) {
                interfaceC5926z.onError(facebookException);
            } else {
                if (accessToken == null || m12125b == null) {
                    return;
                }
                m12111t(true);
                interfaceC5926z.onSuccess(m12125b);
            }
        }
    }

    /* renamed from: g */
    public static C5771x m12103g() {
        return f14858a.m12126c();
    }

    /* renamed from: j */
    private final void m12106j(Context context, LoginClient.Result.EnumC5732a enumC5732a, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        C5770w m12128a = c.f14872a.m12128a(context);
        if (m12128a == null) {
            return;
        }
        if (request == null) {
            C5770w.m12089k(m12128a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : "0");
        m12128a.m12094f(request.m11955b(), hashMap, enumC5732a, map, exc, request.m11970q() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* renamed from: n */
    private final void m12107n(Context context, LoginClient.Request request) {
        C5770w m12128a = c.f14872a.m12128a(context);
        if (m12128a == null || request == null) {
            return;
        }
        m12128a.m12095i(request, request.m11970q() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static /* synthetic */ boolean m12108p(C5771x c5771x, int i2, Intent intent, InterfaceC5926z interfaceC5926z, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i3 & 4) != 0) {
            interfaceC5926z = null;
        }
        return c5771x.m12121o(i2, intent, interfaceC5926z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m12109r(C5771x c5771x, InterfaceC5926z interfaceC5926z, int i2, Intent intent) {
        C9768m.m32346f(c5771x, "this$0");
        return c5771x.m12121o(i2, intent, interfaceC5926z);
    }

    /* renamed from: s */
    private final boolean m12110s(Intent intent) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5608a0.m11284c().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: t */
    private final void m12111t(boolean z) {
        SharedPreferences.Editor edit = this.f14864g.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: u */
    private final void m12112u(InterfaceC5750c0 interfaceC5750c0, LoginClient.Request request) throws FacebookException {
        m12107n(interfaceC5750c0.mo12046a(), request);
        C5671t.f14540a.m11711c(C5671t.c.Login.m11713k(), new C5671t.a() { // from class: com.facebook.login.m
            @Override // com.facebook.internal.C5671t.a
            /* renamed from: a */
            public final boolean mo11707a(int i2, Intent intent) {
                boolean m12113v;
                m12113v = C5771x.m12113v(C5771x.this, i2, intent);
                return m12113v;
            }
        });
        if (m12114w(interfaceC5750c0, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m12106j(interfaceC5750c0.mo12046a(), LoginClient.Result.EnumC5732a.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final boolean m12113v(C5771x c5771x, int i2, Intent intent) {
        C9768m.m32346f(c5771x, "this$0");
        return m12108p(c5771x, i2, intent, null, 4, null);
    }

    /* renamed from: w */
    private final boolean m12114w(InterfaceC5750c0 interfaceC5750c0, LoginClient.Request request) {
        Intent m12117f = m12117f(request);
        if (!m12110s(m12117f)) {
            return false;
        }
        try {
            interfaceC5750c0.startActivityForResult(m12117f, LoginClient.f14714f.m11996b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: x */
    private final void m12115x(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (f14858a.m12127e(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    /* renamed from: d */
    protected LoginClient.Request m12116d(C5768u c5768u) {
        String m12065a;
        Set m38574I0;
        C9768m.m32346f(c5768u, "loginConfig");
        EnumC5763p enumC5763p = EnumC5763p.S256;
        try {
            C5748b0 c5748b0 = C5748b0.f14789a;
            m12065a = C5748b0.m12043b(c5768u.m12065a(), enumC5763p);
        } catch (FacebookException unused) {
            enumC5763p = EnumC5763p.PLAIN;
            m12065a = c5768u.m12065a();
        }
        String str = m12065a;
        EnumC5767t enumC5767t = this.f14862e;
        m38574I0 = C10749c0.m38574I0(c5768u.m12067c());
        EnumC5765r enumC5765r = this.f14863f;
        String str2 = this.f14865h;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11285d = C5608a0.m11285d();
        String uuid = UUID.randomUUID().toString();
        C9768m.m32345e(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(enumC5767t, m38574I0, enumC5765r, str2, m11285d, uuid, this.f14868k, c5768u.m12066b(), c5768u.m12065a(), str, enumC5763p);
        request.m11976w(AccessToken.f14054f.m11107g());
        request.m11974u(this.f14866i);
        request.m11977x(this.f14867j);
        request.m11973t(this.f14869l);
        request.m11978y(this.f14870m);
        return request;
    }

    /* renamed from: f */
    protected Intent m12117f(LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        Intent intent = new Intent();
        C5608a0 c5608a0 = C5608a0.f14199a;
        intent.setClass(C5608a0.m11284c(), FacebookActivity.class);
        intent.setAction(request.m11963j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: k */
    public final void m12118k(Activity activity, C5768u c5768u) {
        C9768m.m32346f(activity, "activity");
        C9768m.m32346f(c5768u, "loginConfig");
        if (activity instanceof InterfaceC0052c) {
            Log.w(f14860c, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        m12112u(new a(activity), m12116d(c5768u));
    }

    /* renamed from: l */
    public final void m12119l(Activity activity, Collection<String> collection) {
        C9768m.m32346f(activity, "activity");
        m12115x(collection);
        m12118k(activity, new C5768u(collection, null, 2, null));
    }

    /* renamed from: m */
    public void m12120m() {
        AccessToken.f14054f.m11108h(null);
        AuthenticationToken.f14071f.m11113a(null);
        Profile.f14188f.m11258c(null);
        m12111t(false);
    }

    /* renamed from: o */
    public boolean m12121o(int i2, Intent intent, InterfaceC5926z<C5772y> interfaceC5926z) {
        LoginClient.Result.EnumC5732a enumC5732a;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        boolean z;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.EnumC5732a enumC5732a2 = LoginClient.Result.EnumC5732a.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                request = result.f14752l;
                LoginClient.Result.EnumC5732a enumC5732a3 = result.f14747g;
                if (i2 != -1) {
                    if (i2 != 0) {
                        accessToken = null;
                        authenticationToken2 = null;
                    } else {
                        accessToken = null;
                        authenticationToken2 = null;
                        z2 = true;
                    }
                } else if (enumC5732a3 == LoginClient.Result.EnumC5732a.SUCCESS) {
                    accessToken = result.f14748h;
                    authenticationToken2 = result.f14749i;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.f14750j);
                    accessToken = null;
                }
                map = result.f14753m;
                z = z2;
                authenticationToken = authenticationToken2;
                enumC5732a = enumC5732a3;
            }
            enumC5732a = enumC5732a2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        } else {
            if (i2 == 0) {
                enumC5732a = LoginClient.Result.EnumC5732a.CANCEL;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z = true;
            }
            enumC5732a = enumC5732a2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request2 = request;
        m12106j(null, enumC5732a, map, facebookException2, true, request2);
        m12102e(accessToken, authenticationToken, request2, facebookException2, z, interfaceC5926z);
        return true;
    }

    /* renamed from: q */
    public final void m12122q(InterfaceC5925y interfaceC5925y, final InterfaceC5926z<C5772y> interfaceC5926z) {
        if (!(interfaceC5925y instanceof C5671t)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C5671t) interfaceC5925y).m11706b(C5671t.c.Login.m11713k(), new C5671t.a() { // from class: com.facebook.login.n
            @Override // com.facebook.internal.C5671t.a
            /* renamed from: a */
            public final boolean mo11707a(int i2, Intent intent) {
                boolean m12109r;
                m12109r = C5771x.m12109r(C5771x.this, interfaceC5926z, i2, intent);
                return m12109r;
            }
        });
    }
}
