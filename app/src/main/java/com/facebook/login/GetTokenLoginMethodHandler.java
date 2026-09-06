package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.C5608a0;
import com.facebook.EnumC5923w;
import com.facebook.FacebookException;
import com.facebook.internal.AbstractServiceConnectionC5655l0;
import com.facebook.internal.C5663p0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GetTokenLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: j */
    private C5766s f14704j;

    /* renamed from: k */
    private final String f14705k;

    /* renamed from: i */
    public static final C5724b f14703i = new C5724b(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C5723a();

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C5723a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        C5723a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }
    }

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    public static final class C5724b {
        private C5724b() {
        }

        public /* synthetic */ C5724b(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    public static final class C5725c implements C5663p0.a {

        /* renamed from: a */
        final /* synthetic */ Bundle f14706a;

        /* renamed from: b */
        final /* synthetic */ GetTokenLoginMethodHandler f14707b;

        /* renamed from: c */
        final /* synthetic */ LoginClient.Request f14708c;

        C5725c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f14706a = bundle;
            this.f14707b = getTokenLoginMethodHandler;
            this.f14708c = request;
        }

        @Override // com.facebook.internal.C5663p0.a
        /* renamed from: a */
        public void mo11259a(JSONObject jSONObject) {
            try {
                this.f14706a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID));
                this.f14707b.m11917s(this.f14708c, this.f14706a);
            } catch (JSONException e2) {
                this.f14707b.m12000d().m11938f(LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, this.f14707b.m12000d().m11945o(), "Caught exception", e2.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.C5663p0.a
        /* renamed from: b */
        public void mo11260b(FacebookException facebookException) {
            this.f14707b.m12000d().m11938f(LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, this.f14707b.m12000d().m11945o(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9768m.m32346f(loginClient, "loginClient");
        this.f14705k = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m11913t(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(getTokenLoginMethodHandler, "this$0");
        C9768m.m32346f(request, "$request");
        getTokenLoginMethodHandler.m11916q(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo11914b() {
        C5766s c5766s = this.f14704j;
        if (c5766s == null) {
            return;
        }
        c5766s.m11501b();
        c5766s.m11505g(null);
        this.f14704j = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14705k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(final LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        Context m11940i = m12000d().m11940i();
        if (m11940i == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11940i = C5608a0.m11284c();
        }
        C5766s c5766s = new C5766s(m11940i, request);
        this.f14704j = c5766s;
        if (C9768m.m32341a(c5766s == null ? null : Boolean.valueOf(c5766s.m11506h()), Boolean.FALSE)) {
            return 0;
        }
        m12000d().m11946r();
        AbstractServiceConnectionC5655l0.b bVar = new AbstractServiceConnectionC5655l0.b() { // from class: com.facebook.login.i
            @Override // com.facebook.internal.AbstractServiceConnectionC5655l0.b
            /* renamed from: a */
            public final void mo11507a(Bundle bundle) {
                GetTokenLoginMethodHandler.m11913t(GetTokenLoginMethodHandler.this, request, bundle);
            }
        };
        C5766s c5766s2 = this.f14704j;
        if (c5766s2 == null) {
            return 1;
        }
        c5766s2.m11505g(bVar);
        return 1;
    }

    /* renamed from: p */
    public final void m11915p(LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(request, "request");
        C9768m.m32346f(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            m11917s(request, bundle);
            return;
        }
        m12000d().m11946r();
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11532E(string2, new C5725c(bundle, this, request));
    }

    /* renamed from: q */
    public final void m11916q(LoginClient.Request request, Bundle bundle) {
        C9768m.m32346f(request, "request");
        C5766s c5766s = this.f14704j;
        if (c5766s != null) {
            c5766s.m11505g(null);
        }
        this.f14704j = null;
        m12000d().m11947s();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = C10784u.m38888j();
            }
            Set<String> m11967n = request.m11967n();
            if (m11967n == null) {
                m11967n = C10789w0.m38917d();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (m11967n.contains("openid")) {
                if (string == null || string.length() == 0) {
                    m12000d().m11932B();
                    return;
                }
            }
            if (stringArrayList.containsAll(m11967n)) {
                m11915p(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : m11967n) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m11998a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.m11975v(hashSet);
        }
        m12000d().m11932B();
    }

    /* renamed from: s */
    public final void m11917s(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result m11986d;
        C9768m.m32346f(request, "request");
        C9768m.m32346f(bundle, "result");
        try {
            LoginMethodHandler.C5739a c5739a = LoginMethodHandler.f14760f;
            m11986d = LoginClient.Result.f14746f.m11988b(request, c5739a.m12006a(bundle, EnumC5923w.FACEBOOK_APPLICATION_SERVICE, request.m11954a()), c5739a.m12008c(bundle, request.m11966m()));
        } catch (FacebookException e2) {
            m11986d = LoginClient.Result.C5734c.m11986d(LoginClient.Result.f14746f, m12000d().m11945o(), null, e2.getMessage(), null, 8, null);
        }
        m12000d().m11939g(m11986d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9768m.m32346f(parcel, "source");
        this.f14705k = "get_token";
    }
}
