package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5923w;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import com.facebook.login.LoginClient;
import com.facebook.p157o0.C5792g0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginMethodHandler.kt */
/* loaded from: classes2.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: f */
    public static final C5739a f14760f = new C5739a(null);

    /* renamed from: g */
    private Map<String, String> f14761g;

    /* renamed from: h */
    public LoginClient f14762h;

    /* compiled from: LoginMethodHandler.kt */
    /* renamed from: com.facebook.login.LoginMethodHandler$a */
    public static final class C5739a {
        private C5739a() {
        }

        public /* synthetic */ C5739a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AccessToken m12006a(Bundle bundle, EnumC5923w enumC5923w, String str) {
            String string;
            C9768m.m32346f(bundle, "bundle");
            C9768m.m32346f(str, "applicationId");
            C5663p0 c5663p0 = C5663p0.f14478a;
            Date m11597v = C5663p0.m11597v(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date m11597v2 = C5663p0.m11597v(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new AccessToken(string2, str, string, stringArrayList, null, null, enumC5923w, m11597v, new Date(), m11597v2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.AccessToken m12007b(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, com.facebook.EnumC5923w r22, java.lang.String r23) throws com.facebook.FacebookException {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginMethodHandler.C5739a.m12007b(java.util.Collection, android.os.Bundle, com.facebook.w, java.lang.String):com.facebook.AccessToken");
        }

        /* renamed from: c */
        public final AuthenticationToken m12008c(Bundle bundle, String str) throws FacebookException {
            C9768m.m32346f(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e2) {
                            throw new FacebookException(e2.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        public final AuthenticationToken m12009d(Bundle bundle, String str) throws FacebookException {
            C9768m.m32346f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e2) {
                            throw new FacebookException(e2.getMessage(), e2);
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: e */
        public final String m12010e(String str) throws FacebookException {
            List m37582v0;
            Object[] array;
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        m37582v0 = C10514v.m37582v0(str, new String[]{"."}, false, 0, 6, null);
                        array = m37582v0.toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        byte[] decode = Base64.decode(strArr[1], 0);
                        C9768m.m32345e(decode, "data");
                        String string = new JSONObject(new String(decode, Charsets.f40651b)).getString(TimeLineFollowFragment.BundleKeys.USER_ID);
                        C9768m.m32345e(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new FacebookException("Failed to retrieve user_id from signed_request");
                }
            }
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        C9768m.m32346f(loginClient, "loginClient");
        m12005m(loginClient);
    }

    /* renamed from: a */
    protected void m11998a(String str, Object obj) {
        if (this.f14761g == null) {
            this.f14761g = new HashMap();
        }
        Map<String, String> map = this.f14761g;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    /* renamed from: b */
    public void mo11914b() {
    }

    /* renamed from: c */
    protected String m11999c(String str) {
        C9768m.m32346f(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo11848f());
            mo11851l(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", C9768m.m32354n("Error creating client state json: ", e2.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        C9768m.m32345e(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    /* renamed from: d */
    public final LoginClient m12000d() {
        LoginClient loginClient = this.f14762h;
        if (loginClient != null) {
            return loginClient;
        }
        C9768m.m32363w("loginClient");
        throw null;
    }

    /* renamed from: e */
    public final Map<String, String> m12001e() {
        return this.f14761g;
    }

    /* renamed from: f */
    public abstract String mo11848f();

    /* renamed from: g */
    protected String mo11849g() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        C5608a0 c5608a0 = C5608a0.f14199a;
        sb.append(C5608a0.m11285d());
        sb.append("://authorize/");
        return sb.toString();
    }

    /* renamed from: h */
    protected void m12002h(String str) {
        LoginClient.Request m11945o = m12000d().m11945o();
        String m11954a = m11945o == null ? null : m11945o.m11954a();
        if (m11954a == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11954a = C5608a0.m11285d();
        }
        C5792g0 c5792g0 = new C5792g0(m12000d().m11940i(), m11954a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, m11954a);
        c5792g0.m12246h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* renamed from: i */
    public boolean mo12003i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo11850j(int i2, int i3, Intent intent) {
        return false;
    }

    /* renamed from: k */
    protected Bundle m12004k(LoginClient.Request request, Bundle bundle) throws FacebookException {
        GraphRequest m12042a;
        C9768m.m32346f(request, "request");
        C9768m.m32346f(bundle, "values");
        String string = bundle.getString("code");
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11557a0(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            m12042a = null;
        } else {
            C5748b0 c5748b0 = C5748b0.f14789a;
            String mo11849g = mo11849g();
            String m11959f = request.m11959f();
            if (m11959f == null) {
                m11959f = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            m12042a = C5748b0.m12042a(string, mo11849g, m11959f);
        }
        if (m12042a == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        C5620d0 m11179j = m12042a.m11179j();
        FacebookRequestError m11338b = m11179j.m11338b();
        if (m11338b != null) {
            throw new FacebookServiceException(m11338b, m11338b.m11141c());
        }
        try {
            JSONObject m11339c = m11179j.m11339c();
            String string2 = m11339c != null ? m11339c.getString("access_token") : null;
            if (m11339c == null || C5663p0.m11557a0(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (m11339c.has("id_token")) {
                bundle.putString("id_token", m11339c.getString("id_token"));
            }
            return bundle;
        } catch (JSONException e2) {
            throw new FacebookException(C9768m.m32354n("Fail to process code exchange response: ", e2.getMessage()));
        }
    }

    /* renamed from: l */
    public void mo11851l(JSONObject jSONObject) throws JSONException {
        C9768m.m32346f(jSONObject, "param");
    }

    /* renamed from: m */
    public final void m12005m(LoginClient loginClient) {
        C9768m.m32346f(loginClient, "<set-?>");
        this.f14762h = loginClient;
    }

    /* renamed from: n */
    public boolean mo11923n() {
        return false;
    }

    /* renamed from: o */
    public abstract int mo11852o(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11538H0(parcel, this.f14761g);
    }

    protected LoginMethodHandler(Parcel parcel) {
        C9768m.m32346f(parcel, "source");
        C5663p0 c5663p0 = C5663p0.f14478a;
        Map<String, String> m11595t0 = C5663p0.m11595t0(parcel);
        this.f14761g = m11595t0 == null ? null : C10777q0.m38809u(m11595t0);
    }
}
