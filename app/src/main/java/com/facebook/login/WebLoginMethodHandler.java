package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.account.view.LoginActivity;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.facebook.AccessToken;
import com.facebook.C5608a0;
import com.facebook.EnumC5923w;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C5663p0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: WebLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: i */
    public static final C5740a f14764i = new C5740a(null);

    /* renamed from: j */
    private String f14765j;

    /* compiled from: WebLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebLoginMethodHandler$a */
    public static final class C5740a {
        private C5740a() {
        }

        public /* synthetic */ C5740a(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9768m.m32346f(loginClient, "loginClient");
    }

    /* renamed from: t */
    private final String m12022t() {
        Context m11940i = m12000d().m11940i();
        if (m11940i == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11940i = C5608a0.m11284c();
        }
        return m11940i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: v */
    private final void m12023v(String str) {
        Context m11940i = m12000d().m11940i();
        if (m11940i == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11940i = C5608a0.m11284c();
        }
        m11940i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: p */
    protected Bundle m12024p(Bundle bundle, LoginClient.Request request) {
        C9768m.m32346f(bundle, "parameters");
        C9768m.m32346f(request, "request");
        bundle.putString("redirect_uri", mo11849g());
        if (request.m11971r()) {
            bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, request.m11954a());
        } else {
            bundle.putString("client_id", request.m11954a());
        }
        bundle.putString("e2e", LoginClient.f14714f.m11995a());
        if (request.m11971r()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.m11967n().contains("openid")) {
                bundle.putString("nonce", request.m11966m());
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.m11957d());
        EnumC5763p m11958e = request.m11958e();
        bundle.putString("code_challenge_method", m11958e == null ? null : m11958e.name());
        bundle.putString("return_scopes", "true");
        bundle.putString(LoginActivity.AUTH_TYPE, request.m11956c());
        bundle.putString("login_behavior", request.m11963j().name());
        C5608a0 c5608a0 = C5608a0.f14199a;
        bundle.putString("sdk", C9768m.m32354n("android-", C5608a0.m11300s()));
        if (mo11853r() != null) {
            bundle.putString("sso", mo11853r());
        }
        bundle.putString("cct_prefetching", C5608a0.f14215q ? "1" : "0");
        if (request.m11970q()) {
            bundle.putString("fx_app", request.m11964k().toString());
        }
        if (request.m11979z()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.m11965l() != null) {
            bundle.putString("messenger_page_id", request.m11965l());
            bundle.putString("reset_messenger_state", request.m11968o() ? "1" : "0");
        }
        return bundle;
    }

    /* renamed from: q */
    protected Bundle m12025q(LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        Bundle bundle = new Bundle();
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (!C5663p0.m11559b0(request.m11967n())) {
            String join = TextUtils.join(",", request.m11967n());
            bundle.putString("scope", join);
            m11998a("scope", join);
        }
        EnumC5765r m11960g = request.m11960g();
        if (m11960g == null) {
            m11960g = EnumC5765r.NONE;
        }
        bundle.putString("default_audience", m11960g.m12057k());
        bundle.putString("state", m11999c(request.m11955b()));
        AccessToken m11105e = AccessToken.f14054f.m11105e();
        String m11093l = m11105e == null ? null : m11105e.m11093l();
        if (m11093l == null || !C9768m.m32341a(m11093l, m12022t())) {
            ActivityC0468d m11940i = m12000d().m11940i();
            if (m11940i != null) {
                C5663p0.m11568g(m11940i);
            }
            m11998a("access_token", "0");
        } else {
            bundle.putString("access_token", m11093l);
            m11998a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        C5608a0 c5608a0 = C5608a0.f14199a;
        bundle.putString("ies", C5608a0.m11288g() ? "1" : "0");
        return bundle;
    }

    /* renamed from: r */
    protected String mo11853r() {
        return null;
    }

    /* renamed from: s */
    public abstract EnumC5923w mo11854s();

    /* renamed from: u */
    public void m12026u(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result m11989c;
        C9768m.m32346f(request, "request");
        LoginClient m12000d = m12000d();
        this.f14765j = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f14765j = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.C5739a c5739a = LoginMethodHandler.f14760f;
                AccessToken m12007b = c5739a.m12007b(request.m11967n(), bundle, mo11854s(), request.m11954a());
                m11989c = LoginClient.Result.f14746f.m11988b(m12000d.m11945o(), m12007b, c5739a.m12009d(bundle, request.m11966m()));
                if (m12000d.m11940i() != null) {
                    try {
                        CookieSyncManager.createInstance(m12000d.m11940i()).sync();
                    } catch (Exception unused) {
                    }
                    if (m12007b != null) {
                        m12023v(m12007b.m11093l());
                    }
                }
            } catch (FacebookException e2) {
                m11989c = LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, m12000d.m11945o(), null, e2.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            m11989c = LoginClient.Result.f14746f.m11987a(m12000d.m11945o(), "User canceled log in.");
        } else {
            this.f14765j = null;
            String message = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = String.valueOf(requestError.m11140b());
                message = requestError.toString();
            } else {
                str = null;
            }
            m11989c = LoginClient.Result.f14746f.m11989c(m12000d.m11945o(), null, message, str);
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (!C5663p0.m11557a0(this.f14765j)) {
            m12002h(this.f14765j);
        }
        m12000d.m11939g(m11989c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9768m.m32346f(parcel, "source");
    }
}
