package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.AbstractC0051b;
import androidx.fragment.app.Fragment;
import com.facebook.C5608a0;
import com.facebook.EnumC5923w;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C5659n0;
import com.facebook.internal.C5663p0;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import kotlin.C10742u;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;

/* compiled from: NativeAppLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: i */
    private final EnumC5923w f14763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9768m.m32346f(loginClient, "loginClient");
        this.f14763i = EnumC5923w.FACEBOOK_APPLICATION_WEB;
    }

    /* renamed from: p */
    private final void m12011p(LoginClient.Result result) {
        if (result != null) {
            m12000d().m11939g(result);
        } else {
            m12000d().m11932B();
        }
    }

    /* renamed from: w */
    private final boolean m12012w(Intent intent) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        C9768m.m32345e(C5608a0.m11284c().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    /* renamed from: y */
    private final void m12014y(final LoginClient.Request request, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            if (!C5663p0.m11557a0(bundle.getString("code"))) {
                C5608a0 c5608a0 = C5608a0.f14199a;
                C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.login.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.m12015z(NativeAppLoginMethodHandler.this, request, bundle);
                    }
                });
                return;
            }
        }
        m12021v(request, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m12015z(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(nativeAppLoginMethodHandler, "this$0");
        C9768m.m32346f(request, "$request");
        C9768m.m32346f(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.m12021v(request, nativeAppLoginMethodHandler.m12004k(request, bundle));
        } catch (FacebookServiceException e2) {
            FacebookRequestError requestError = e2.getRequestError();
            nativeAppLoginMethodHandler.m12020u(request, requestError.m11142d(), requestError.m11141c(), String.valueOf(requestError.m11140b()));
        } catch (FacebookException e3) {
            nativeAppLoginMethodHandler.m12020u(request, null, e3.getMessage(), null);
        }
    }

    /* renamed from: B */
    protected boolean m12016B(Intent intent, int i2) {
        AbstractC0051b<Intent> m12080g;
        if (intent == null || !m12012w(intent)) {
            return false;
        }
        Fragment m11942k = m12000d().m11942k();
        C10742u c10742u = null;
        C5769v c5769v = m11942k instanceof C5769v ? (C5769v) m11942k : null;
        if (c5769v != null && (m12080g = c5769v.m12080g()) != null) {
            m12080g.m172a(intent);
            c10742u = C10742u.f41439a;
        }
        return c10742u != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo11850j(int i2, int i3, Intent intent) {
        LoginClient.Request m11945o = m12000d().m11945o();
        if (intent == null) {
            m12011p(LoginClient.Result.f14746f.m11987a(m11945o, "Operation canceled"));
        } else if (i3 == 0) {
            m12019t(m11945o, intent);
        } else if (i3 != -1) {
            m12011p(LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, m11945o, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                m12011p(LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, m11945o, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String m12017q = m12017q(extras);
            Object obj = extras.get("error_code");
            String obj2 = obj == null ? null : obj.toString();
            String m12018r = m12018r(extras);
            String string = extras.getString("e2e");
            C5663p0 c5663p0 = C5663p0.f14478a;
            if (!C5663p0.m11557a0(string)) {
                m12002h(string);
            }
            if (m12017q == null && obj2 == null && m12018r == null && m11945o != null) {
                m12014y(m11945o, extras);
            } else {
                m12020u(m11945o, m12017q, m12018r, obj2);
            }
        }
        return true;
    }

    /* renamed from: q */
    protected String m12017q(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_type");
    }

    /* renamed from: r */
    protected String m12018r(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    /* renamed from: s */
    public EnumC5923w mo11920s() {
        return this.f14763i;
    }

    /* renamed from: t */
    protected void m12019t(LoginClient.Request request, Intent intent) {
        Object obj;
        C9768m.m32346f(intent, "data");
        Bundle extras = intent.getExtras();
        String m12017q = m12017q(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        C5659n0 c5659n0 = C5659n0.f14464a;
        if (C9768m.m32341a(C5659n0.m11512c(), str)) {
            m12011p(LoginClient.Result.f14746f.m11989c(request, m12017q, m12018r(extras), str));
        } else {
            m12011p(LoginClient.Result.f14746f.m11987a(request, m12017q));
        }
    }

    /* renamed from: u */
    protected void m12020u(LoginClient.Request request, String str, String str2, String str3) {
        boolean m38577K;
        boolean m38577K2;
        if (str != null && C9768m.m32341a(str, "logged_out")) {
            CustomTabLoginMethodHandler.C5715b c5715b = CustomTabLoginMethodHandler.f14668k;
            CustomTabLoginMethodHandler.f14669l = true;
            m12011p(null);
            return;
        }
        C5659n0 c5659n0 = C5659n0.f14464a;
        m38577K = C10749c0.m38577K(C5659n0.m11513d(), str);
        if (m38577K) {
            m12011p(null);
            return;
        }
        m38577K2 = C10749c0.m38577K(C5659n0.m11514e(), str);
        if (m38577K2) {
            m12011p(LoginClient.Result.f14746f.m11987a(request, null));
        } else {
            m12011p(LoginClient.Result.f14746f.m11989c(request, str, str2, str3));
        }
    }

    /* renamed from: v */
    protected void m12021v(LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(request, "request");
        C9768m.m32346f(bundle, "extras");
        try {
            LoginMethodHandler.C5739a c5739a = LoginMethodHandler.f14760f;
            m12011p(LoginClient.Result.f14746f.m11988b(request, c5739a.m12007b(request.m11967n(), bundle, mo11920s(), request.m11954a()), c5739a.m12009d(bundle, request.m11966m())));
        } catch (FacebookException e2) {
            m12011p(LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, request, null, e2.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9768m.m32346f(parcel, "source");
        this.f14763i = EnumC5923w.FACEBOOK_APPLICATION_WEB;
    }
}
