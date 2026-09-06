package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.facebook.C5608a0;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC5923w;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.C5643f0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5698u;
import com.facebook.internal.C5700v;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomTabLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: l */
    public static boolean f14669l;

    /* renamed from: m */
    private String f14670m;

    /* renamed from: n */
    private String f14671n;

    /* renamed from: o */
    private String f14672o;

    /* renamed from: p */
    private final String f14673p;

    /* renamed from: q */
    private final EnumC5923w f14674q;

    /* renamed from: k */
    public static final C5715b f14668k = new C5715b(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C5714a();

    /* compiled from: CustomTabLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static final class C5714a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        C5714a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }
    }

    /* compiled from: CustomTabLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$b */
    public static final class C5715b {
        private C5715b() {
        }

        public /* synthetic */ C5715b(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9768m.m32346f(loginClient, "loginClient");
        this.f14673p = "custom_tab";
        this.f14674q = EnumC5923w.CHROME_CUSTOM_TAB;
        C5663p0 c5663p0 = C5663p0.f14478a;
        this.f14671n = C5663p0.m11588q(20);
        f14669l = false;
        C5700v c5700v = C5700v.f14626a;
        this.f14672o = C5700v.m11805c(m11845x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m11842B(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(customTabLoginMethodHandler, "this$0");
        C9768m.m32346f(request, "$request");
        C9768m.m32346f(bundle, "$values");
        try {
            customTabLoginMethodHandler.m12026u(request, customTabLoginMethodHandler.m12004k(request, bundle), null);
        } catch (FacebookException e2) {
            customTabLoginMethodHandler.m12026u(request, null, e2);
        }
    }

    /* renamed from: C */
    private final boolean m11843C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return C9768m.m32341a(new JSONObject(string).getString("7_challenge"), this.f14671n);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: w */
    private final String m11844w() {
        String str = this.f14670m;
        if (str != null) {
            return str;
        }
        C5700v c5700v = C5700v.f14626a;
        String m11803a = C5700v.m11803a();
        this.f14670m = m11803a;
        return m11803a;
    }

    /* renamed from: x */
    private final String m11845x() {
        return super.mo11849g();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m11847z(java.lang.String r7, final com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Ld5
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.C10504l.m37450E(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.mo11849g()
            boolean r0 = kotlin.text.C10504l.m37450E(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Ld5
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.facebook.internal.p0 r0 = com.facebook.internal.C5663p0.f14478a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C5663p0.m11585o0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C5663p0.m11585o0(r7)
            r0.putAll(r7)
            boolean r7 = r6.m11843C(r0)
            if (r7 != 0) goto L41
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.m12026u(r8, r3, r7)
            return
        L41:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L5d:
            if (r1 != 0) goto L65
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L65:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L6f
            goto L74
        L6f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r2 = -1
        L75:
            com.facebook.internal.p0 r5 = com.facebook.internal.C5663p0.f14478a
            boolean r5 = com.facebook.internal.C5663p0.m11557a0(r7)
            if (r5 == 0) goto La0
            boolean r5 = com.facebook.internal.C5663p0.m11557a0(r1)
            if (r5 == 0) goto La0
            if (r2 != r4) goto La0
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L91
            super.m12026u(r8, r0, r3)
            return
        L91:
            com.facebook.a0 r7 = com.facebook.C5608a0.f14199a
            java.util.concurrent.Executor r7 = com.facebook.C5608a0.m11292k()
            com.facebook.login.a r1 = new com.facebook.login.a
            r1.<init>()
            r7.execute(r1)
            goto Ld5
        La0:
            if (r7 == 0) goto Lbb
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r7, r0)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r7, r0)
            if (r0 == 0) goto Lbb
        Lb2:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.m12026u(r8, r3, r7)
            goto Ld5
        Lbb:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto Lc8
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.m12026u(r8, r3, r7)
            goto Ld5
        Lc8:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r2, r7, r1)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r1)
            super.m12026u(r8, r3, r7)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m11847z(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14673p;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    protected String mo11849g() {
        return this.f14672o;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo11850j(int i2, int i3, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14119m, false)) {
            return super.mo11850j(i2, i3, intent);
        }
        if (i2 != 1) {
            return super.mo11850j(i2, i3, intent);
        }
        LoginClient.Request m11945o = m12000d().m11945o();
        if (m11945o == null) {
            return false;
        }
        if (i3 == -1) {
            m11847z(intent != null ? intent.getStringExtra(CustomTabMainActivity.f14116j) : null, m11945o);
            return true;
        }
        super.m12026u(m11945o, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: l */
    public void mo11851l(JSONObject jSONObject) throws JSONException {
        C9768m.m32346f(jSONObject, "param");
        jSONObject.put("7_challenge", this.f14671n);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        LoginClient m12000d = m12000d();
        if (mo11849g().length() == 0) {
            return 0;
        }
        Bundle m12024p = m12024p(m12025q(request), request);
        if (f14669l) {
            m12024p.putString("cct_over_app_switch", "1");
        }
        if (C5608a0.f14215q) {
            if (request.m11971r()) {
                C5764q.f14816f.m12055c(C5643f0.f14415c.m11434a("oauth", m12024p));
            } else {
                C5764q.f14816f.m12055c(C5698u.f14621a.m11800a("oauth", m12024p));
            }
        }
        ActivityC0468d m11940i = m12000d.m11940i();
        if (m11940i == null) {
            return 0;
        }
        Intent intent = new Intent(m11940i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f14113g, "oauth");
        intent.putExtra(CustomTabMainActivity.f14114h, m12024p);
        intent.putExtra(CustomTabMainActivity.f14115i, m11844w());
        intent.putExtra(CustomTabMainActivity.f14117k, request.m11964k().toString());
        Fragment m11942k = m12000d.m11942k();
        if (m11942k != null) {
            m11942k.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r */
    protected String mo11853r() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public EnumC5923w mo11854s() {
        return this.f14674q;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f14671n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9768m.m32346f(parcel, "source");
        this.f14673p = "custom_tab";
        this.f14674q = EnumC5923w.CHROME_CUSTOM_TAB;
        this.f14671n = parcel.readString();
        C5700v c5700v = C5700v.f14626a;
        this.f14672o = C5700v.m11805c(m11845x());
    }
}
