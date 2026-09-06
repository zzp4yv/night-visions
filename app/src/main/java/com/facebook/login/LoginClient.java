package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C5608a0;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.C5617d;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5665q0;
import com.facebook.internal.C5671t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginClient.kt */
/* loaded from: classes2.dex */
public class LoginClient implements Parcelable {

    /* renamed from: g */
    private LoginMethodHandler[] f14715g;

    /* renamed from: h */
    private int f14716h;

    /* renamed from: i */
    private Fragment f14717i;

    /* renamed from: j */
    private InterfaceC5738d f14718j;

    /* renamed from: k */
    private InterfaceC5735a f14719k;

    /* renamed from: l */
    private boolean f14720l;

    /* renamed from: m */
    private Request f14721m;

    /* renamed from: n */
    private Map<String, String> f14722n;

    /* renamed from: o */
    private Map<String, String> f14723o;

    /* renamed from: p */
    private C5770w f14724p;

    /* renamed from: q */
    private int f14725q;

    /* renamed from: r */
    private int f14726r;

    /* renamed from: f */
    public static final C5737c f14714f = new C5737c(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new C5736b();

    /* compiled from: LoginClient.kt */
    public static final class Result implements Parcelable {

        /* renamed from: g */
        public final EnumC5732a f14747g;

        /* renamed from: h */
        public final AccessToken f14748h;

        /* renamed from: i */
        public final AuthenticationToken f14749i;

        /* renamed from: j */
        public final String f14750j;

        /* renamed from: k */
        public final String f14751k;

        /* renamed from: l */
        public final Request f14752l;

        /* renamed from: m */
        public Map<String, String> f14753m;

        /* renamed from: n */
        public Map<String, String> f14754n;

        /* renamed from: f */
        public static final C5734c f14746f = new C5734c(null);
        public static final Parcelable.Creator<Result> CREATOR = new C5733b();

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public enum EnumC5732a {
            SUCCESS(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION),
            CANCEL("cancel"),
            ERROR("error");


            /* renamed from: j */
            private final String f14759j;

            EnumC5732a(String str) {
                this.f14759j = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static EnumC5732a[] valuesCustom() {
                EnumC5732a[] valuesCustom = values();
                return (EnumC5732a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            /* renamed from: k */
            public final String m11983k() {
                return this.f14759j;
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$b */
        public static final class C5733b implements Parcelable.Creator<Result> {
            C5733b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                C9768m.m32346f(parcel, "source");
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i2) {
                return new Result[i2];
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$c */
        public static final class C5734c {
            private C5734c() {
            }

            public /* synthetic */ C5734c(C9756g c9756g) {
                this();
            }

            /* renamed from: d */
            public static /* synthetic */ Result m11986d(C5734c c5734c, Request request, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                return c5734c.m11989c(request, str, str2, str3);
            }

            /* renamed from: a */
            public final Result m11987a(Request request, String str) {
                return new Result(request, EnumC5732a.CANCEL, null, str, null);
            }

            /* renamed from: b */
            public final Result m11988b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, EnumC5732a.SUCCESS, accessToken, authenticationToken, null, null);
            }

            /* renamed from: c */
            public final Result m11989c(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, EnumC5732a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            /* renamed from: e */
            public final Result m11990e(Request request, AccessToken accessToken) {
                C9768m.m32346f(accessToken, "token");
                return new Result(request, EnumC5732a.SUCCESS, accessToken, null, null);
            }
        }

        public /* synthetic */ Result(Parcel parcel, C9756g c9756g) {
            this(parcel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, EnumC5732a enumC5732a, AccessToken accessToken, String str, String str2) {
            this(request, enumC5732a, accessToken, null, str, str2);
            C9768m.m32346f(enumC5732a, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9768m.m32346f(parcel, "dest");
            parcel.writeString(this.f14747g.name());
            parcel.writeParcelable(this.f14748h, i2);
            parcel.writeParcelable(this.f14749i, i2);
            parcel.writeString(this.f14750j);
            parcel.writeString(this.f14751k);
            parcel.writeParcelable(this.f14752l, i2);
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11536G0(parcel, this.f14753m);
            C5663p0.m11536G0(parcel, this.f14754n);
        }

        public Result(Request request, EnumC5732a enumC5732a, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            C9768m.m32346f(enumC5732a, "code");
            this.f14752l = request;
            this.f14748h = accessToken;
            this.f14749i = authenticationToken;
            this.f14750j = str;
            this.f14747g = enumC5732a;
            this.f14751k = str2;
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.f14747g = EnumC5732a.valueOf(readString == null ? "error" : readString);
            this.f14748h = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f14749i = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f14750j = parcel.readString();
            this.f14751k = parcel.readString();
            this.f14752l = (Request) parcel.readParcelable(Request.class.getClassLoader());
            C5663p0 c5663p0 = C5663p0.f14478a;
            this.f14753m = C5663p0.m11591r0(parcel);
            this.f14754n = C5663p0.m11591r0(parcel);
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$a */
    public interface InterfaceC5735a {
        /* renamed from: a */
        void mo11991a();

        /* renamed from: b */
        void mo11992b();
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$b */
    public static final class C5736b implements Parcelable.Creator<LoginClient> {
        C5736b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$c */
    public static final class C5737c {
        private C5737c() {
        }

        public /* synthetic */ C5737c(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final String m11995a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            C9768m.m32345e(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        /* renamed from: b */
        public final int m11996b() {
            return C5671t.c.Login.m11713k();
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$d */
    public interface InterfaceC5738d {
        /* renamed from: a */
        void mo11997a(Result result);
    }

    public LoginClient(Fragment fragment) {
        C9768m.m32346f(fragment, "fragment");
        this.f14716h = -1;
        m11950w(fragment);
    }

    /* renamed from: a */
    private final void m11926a(String str, String str2, boolean z) {
        Map<String, String> map = this.f14722n;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f14722n == null) {
            this.f14722n = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* renamed from: h */
    private final void m11927h() {
        m11938f(Result.C5734c.m11986d(Result.f14746f, this.f14721m, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (kotlin.jvm.internal.C9768m.m32341a(r1, r2 == null ? null : r2.m11954a()) == false) goto L10;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.login.C5770w m11928n() {
        /*
            r3 = this;
            com.facebook.login.w r0 = r3.f14724p
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.m12090a()
            com.facebook.login.LoginClient$Request r2 = r3.f14721m
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.m11954a()
        L12:
            boolean r1 = kotlin.jvm.internal.C9768m.m32341a(r1, r2)
            if (r1 != 0) goto L3a
        L18:
            com.facebook.login.w r0 = new com.facebook.login.w
            androidx.fragment.app.d r1 = r3.m11940i()
            if (r1 != 0) goto L26
            com.facebook.a0 r1 = com.facebook.C5608a0.f14199a
            android.content.Context r1 = com.facebook.C5608a0.m11284c()
        L26:
            com.facebook.login.LoginClient$Request r2 = r3.f14721m
            if (r2 != 0) goto L31
            com.facebook.a0 r2 = com.facebook.C5608a0.f14199a
            java.lang.String r2 = com.facebook.C5608a0.m11285d()
            goto L35
        L31:
            java.lang.String r2 = r2.m11954a()
        L35:
            r0.<init>(r1, r2)
            r3.f14724p = r0
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.m11928n():com.facebook.login.w");
    }

    /* renamed from: p */
    private final void m11929p(String str, Result result, Map<String, String> map) {
        m11930q(str, result.f14747g.m11983k(), result.f14750j, result.f14751k, map);
    }

    /* renamed from: q */
    private final void m11930q(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.f14721m;
        if (request == null) {
            m11928n().m12096j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m11928n().m12091c(request.m11955b(), str, str2, str3, str4, map, request.m11970q() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    /* renamed from: t */
    private final void m11931t(Result result) {
        InterfaceC5738d interfaceC5738d = this.f14718j;
        if (interfaceC5738d == null) {
            return;
        }
        interfaceC5738d.mo11997a(result);
    }

    /* renamed from: B */
    public final void m11932B() {
        LoginMethodHandler m11941j = m11941j();
        if (m11941j != null) {
            m11930q(m11941j.mo11848f(), "skipped", null, null, m11941j.m12001e());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f14715g;
        while (loginMethodHandlerArr != null) {
            int i2 = this.f14716h;
            if (i2 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f14716h = i2 + 1;
            if (m11953z()) {
                return;
            }
        }
        if (this.f14721m != null) {
            m11927h();
        }
    }

    /* renamed from: C */
    public final void m11933C(Result result) {
        Result m11988b;
        C9768m.m32346f(result, "pendingResult");
        if (result.f14748h == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken m11105e = AccessToken.f14054f.m11105e();
        AccessToken accessToken = result.f14748h;
        if (m11105e != null) {
            try {
                if (C9768m.m32341a(m11105e.m11094m(), accessToken.m11094m())) {
                    m11988b = Result.f14746f.m11988b(this.f14721m, result.f14748h, result.f14749i);
                    m11938f(m11988b);
                }
            } catch (Exception e2) {
                m11938f(Result.C5734c.m11986d(Result.f14746f, this.f14721m, "Caught exception", e2.getMessage(), null, 8, null));
                return;
            }
        }
        m11988b = Result.C5734c.m11986d(Result.f14746f, this.f14721m, "User logged in as different Facebook user.", null, null, 8, null);
        m11938f(m11988b);
    }

    /* renamed from: b */
    public final void m11934b(Request request) {
        if (request == null) {
            return;
        }
        if (this.f14721m != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.f14054f.m11107g() || m11936d()) {
            this.f14721m = request;
            this.f14715g = m11943l(request);
            m11932B();
        }
    }

    /* renamed from: c */
    public final void m11935c() {
        LoginMethodHandler m11941j = m11941j();
        if (m11941j == null) {
            return;
        }
        m11941j.mo11914b();
    }

    /* renamed from: d */
    public final boolean m11936d() {
        if (this.f14720l) {
            return true;
        }
        if (m11937e("android.permission.INTERNET") == 0) {
            this.f14720l = true;
            return true;
        }
        ActivityC0468d m11940i = m11940i();
        m11938f(Result.C5734c.m11986d(Result.f14746f, this.f14721m, m11940i == null ? null : m11940i.getString(C5617d.f14260c), m11940i != null ? m11940i.getString(C5617d.f14259b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m11937e(String str) {
        C9768m.m32346f(str, "permission");
        ActivityC0468d m11940i = m11940i();
        if (m11940i == null) {
            return -1;
        }
        return m11940i.checkCallingOrSelfPermission(str);
    }

    /* renamed from: f */
    public final void m11938f(Result result) {
        C9768m.m32346f(result, "outcome");
        LoginMethodHandler m11941j = m11941j();
        if (m11941j != null) {
            m11929p(m11941j.mo11848f(), result, m11941j.m12001e());
        }
        Map<String, String> map = this.f14722n;
        if (map != null) {
            result.f14753m = map;
        }
        Map<String, String> map2 = this.f14723o;
        if (map2 != null) {
            result.f14754n = map2;
        }
        this.f14715g = null;
        this.f14716h = -1;
        this.f14721m = null;
        this.f14722n = null;
        this.f14725q = 0;
        this.f14726r = 0;
        m11931t(result);
    }

    /* renamed from: g */
    public final void m11939g(Result result) {
        C9768m.m32346f(result, "outcome");
        if (result.f14748h == null || !AccessToken.f14054f.m11107g()) {
            m11938f(result);
        } else {
            m11933C(result);
        }
    }

    /* renamed from: i */
    public final ActivityC0468d m11940i() {
        Fragment fragment = this.f14717i;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    /* renamed from: j */
    public final LoginMethodHandler m11941j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i2 = this.f14716h;
        if (i2 < 0 || (loginMethodHandlerArr = this.f14715g) == null) {
            return null;
        }
        return loginMethodHandlerArr[i2];
    }

    /* renamed from: k */
    public final Fragment m11942k() {
        return this.f14717i;
    }

    /* renamed from: l */
    public LoginMethodHandler[] m11943l(Request request) {
        C9768m.m32346f(request, "request");
        ArrayList arrayList = new ArrayList();
        EnumC5767t m11963j = request.m11963j();
        if (!request.m11971r()) {
            if (m11963j.m12061u()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C5608a0.f14217s && m11963j.m12063x()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!C5608a0.f14217s && m11963j.m12062v()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (m11963j.m12059k()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (m11963j.m12064y()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.m11971r() && m11963j.m12060q()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: m */
    public final boolean m11944m() {
        return this.f14721m != null && this.f14716h >= 0;
    }

    /* renamed from: o */
    public final Request m11945o() {
        return this.f14721m;
    }

    /* renamed from: r */
    public final void m11946r() {
        InterfaceC5735a interfaceC5735a = this.f14719k;
        if (interfaceC5735a == null) {
            return;
        }
        interfaceC5735a.mo11991a();
    }

    /* renamed from: s */
    public final void m11947s() {
        InterfaceC5735a interfaceC5735a = this.f14719k;
        if (interfaceC5735a == null) {
            return;
        }
        interfaceC5735a.mo11992b();
    }

    /* renamed from: u */
    public final boolean m11948u(int i2, int i3, Intent intent) {
        this.f14725q++;
        if (this.f14721m != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14119m, false)) {
                m11932B();
                return false;
            }
            LoginMethodHandler m11941j = m11941j();
            if (m11941j != null && (!m11941j.mo11923n() || intent != null || this.f14725q >= this.f14726r)) {
                return m11941j.mo11850j(i2, i3, intent);
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m11949v(InterfaceC5735a interfaceC5735a) {
        this.f14719k = interfaceC5735a;
    }

    /* renamed from: w */
    public final void m11950w(Fragment fragment) {
        if (this.f14717i != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.f14717i = fragment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        parcel.writeParcelableArray(this.f14715g, i2);
        parcel.writeInt(this.f14716h);
        parcel.writeParcelable(this.f14721m, i2);
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11536G0(parcel, this.f14722n);
        C5663p0.m11536G0(parcel, this.f14723o);
    }

    /* renamed from: x */
    public final void m11951x(InterfaceC5738d interfaceC5738d) {
        this.f14718j = interfaceC5738d;
    }

    /* renamed from: y */
    public final void m11952y(Request request) {
        if (m11944m()) {
            return;
        }
        m11934b(request);
    }

    /* renamed from: z */
    public final boolean m11953z() {
        LoginMethodHandler m11941j = m11941j();
        if (m11941j == null) {
            return false;
        }
        if (m11941j.mo12003i() && !m11936d()) {
            m11926a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.f14721m;
        if (request == null) {
            return false;
        }
        int mo11852o = m11941j.mo11852o(request);
        this.f14725q = 0;
        if (mo11852o > 0) {
            m11928n().m12093e(request.m11955b(), m11941j.mo11848f(), request.m11970q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f14726r = mo11852o;
        } else {
            m11928n().m12092d(request.m11955b(), m11941j.mo11848f(), request.m11970q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            m11926a("not_tried", m11941j.mo11848f(), true);
        }
        return mo11852o > 0;
    }

    public LoginClient(Parcel parcel) {
        C9768m.m32346f(parcel, "source");
        this.f14716h = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i2];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.m12005m(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i2++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.f14715g = (LoginMethodHandler[]) array;
            this.f14716h = parcel.readInt();
            this.f14721m = (Request) parcel.readParcelable(Request.class.getClassLoader());
            C5663p0 c5663p0 = C5663p0.f14478a;
            Map<String, String> m11591r0 = C5663p0.m11591r0(parcel);
            this.f14722n = m11591r0 == null ? null : C10777q0.m38809u(m11591r0);
            Map<String, String> m11591r02 = C5663p0.m11591r0(parcel);
            this.f14723o = m11591r02 != null ? C10777q0.m38809u(m11591r02) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* compiled from: LoginClient.kt */
    public static final class Request implements Parcelable {

        /* renamed from: g */
        private final EnumC5767t f14728g;

        /* renamed from: h */
        private Set<String> f14729h;

        /* renamed from: i */
        private final EnumC5765r f14730i;

        /* renamed from: j */
        private final String f14731j;

        /* renamed from: k */
        private String f14732k;

        /* renamed from: l */
        private boolean f14733l;

        /* renamed from: m */
        private String f14734m;

        /* renamed from: n */
        private String f14735n;

        /* renamed from: o */
        private String f14736o;

        /* renamed from: p */
        private String f14737p;

        /* renamed from: q */
        private boolean f14738q;

        /* renamed from: r */
        private final EnumC5773z f14739r;

        /* renamed from: s */
        private boolean f14740s;

        /* renamed from: t */
        private boolean f14741t;

        /* renamed from: u */
        private final String f14742u;

        /* renamed from: v */
        private final String f14743v;

        /* renamed from: w */
        private final String f14744w;

        /* renamed from: x */
        private final EnumC5763p f14745x;

        /* renamed from: f */
        public static final C5731b f14727f = new C5731b(null);
        public static final Parcelable.Creator<Request> CREATOR = new C5730a();

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Request$a */
        public static final class C5730a implements Parcelable.Creator<Request> {
            C5730a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                C9768m.m32346f(parcel, "source");
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i2) {
                return new Request[i2];
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Request$b */
        public static final class C5731b {
            private C5731b() {
            }

            public /* synthetic */ C5731b(C9756g c9756g) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, C9756g c9756g) {
            this(parcel);
        }

        public Request(EnumC5767t enumC5767t, Set<String> set, EnumC5765r enumC5765r, String str, String str2, String str3, EnumC5773z enumC5773z, String str4, String str5, String str6, EnumC5763p enumC5763p) {
            C9768m.m32346f(enumC5767t, "loginBehavior");
            C9768m.m32346f(enumC5765r, "defaultAudience");
            C9768m.m32346f(str, "authType");
            C9768m.m32346f(str2, "applicationId");
            C9768m.m32346f(str3, "authId");
            this.f14728g = enumC5767t;
            this.f14729h = set == null ? new HashSet<>() : set;
            this.f14730i = enumC5765r;
            this.f14735n = str;
            this.f14731j = str2;
            this.f14732k = str3;
            this.f14739r = enumC5773z == null ? EnumC5773z.FACEBOOK : enumC5773z;
            if (str4 != null) {
                if (!(str4.length() == 0)) {
                    this.f14742u = str4;
                    this.f14743v = str5;
                    this.f14744w = str6;
                    this.f14745x = enumC5763p;
                }
            }
            String uuid = UUID.randomUUID().toString();
            C9768m.m32345e(uuid, "randomUUID().toString()");
            this.f14742u = uuid;
            this.f14743v = str5;
            this.f14744w = str6;
            this.f14745x = enumC5763p;
        }

        /* renamed from: a */
        public final String m11954a() {
            return this.f14731j;
        }

        /* renamed from: b */
        public final String m11955b() {
            return this.f14732k;
        }

        /* renamed from: c */
        public final String m11956c() {
            return this.f14735n;
        }

        /* renamed from: d */
        public final String m11957d() {
            return this.f14744w;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final EnumC5763p m11958e() {
            return this.f14745x;
        }

        /* renamed from: f */
        public final String m11959f() {
            return this.f14743v;
        }

        /* renamed from: g */
        public final EnumC5765r m11960g() {
            return this.f14730i;
        }

        /* renamed from: h */
        public final String m11961h() {
            return this.f14736o;
        }

        /* renamed from: i */
        public final String m11962i() {
            return this.f14734m;
        }

        /* renamed from: j */
        public final EnumC5767t m11963j() {
            return this.f14728g;
        }

        /* renamed from: k */
        public final EnumC5773z m11964k() {
            return this.f14739r;
        }

        /* renamed from: l */
        public final String m11965l() {
            return this.f14737p;
        }

        /* renamed from: m */
        public final String m11966m() {
            return this.f14742u;
        }

        /* renamed from: n */
        public final Set<String> m11967n() {
            return this.f14729h;
        }

        /* renamed from: o */
        public final boolean m11968o() {
            return this.f14738q;
        }

        /* renamed from: p */
        public final boolean m11969p() {
            Iterator<String> it = this.f14729h.iterator();
            while (it.hasNext()) {
                if (C5771x.f14858a.m12127e(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q */
        public final boolean m11970q() {
            return this.f14740s;
        }

        /* renamed from: r */
        public final boolean m11971r() {
            return this.f14739r == EnumC5773z.INSTAGRAM;
        }

        /* renamed from: s */
        public final boolean m11972s() {
            return this.f14733l;
        }

        /* renamed from: t */
        public final void m11973t(boolean z) {
            this.f14740s = z;
        }

        /* renamed from: u */
        public final void m11974u(String str) {
            this.f14737p = str;
        }

        /* renamed from: v */
        public final void m11975v(Set<String> set) {
            C9768m.m32346f(set, "<set-?>");
            this.f14729h = set;
        }

        /* renamed from: w */
        public final void m11976w(boolean z) {
            this.f14733l = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9768m.m32346f(parcel, "dest");
            parcel.writeString(this.f14728g.name());
            parcel.writeStringList(new ArrayList(this.f14729h));
            parcel.writeString(this.f14730i.name());
            parcel.writeString(this.f14731j);
            parcel.writeString(this.f14732k);
            parcel.writeByte(this.f14733l ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14734m);
            parcel.writeString(this.f14735n);
            parcel.writeString(this.f14736o);
            parcel.writeString(this.f14737p);
            parcel.writeByte(this.f14738q ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14739r.name());
            parcel.writeByte(this.f14740s ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f14741t ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14742u);
            parcel.writeString(this.f14743v);
            parcel.writeString(this.f14744w);
            EnumC5763p enumC5763p = this.f14745x;
            parcel.writeString(enumC5763p == null ? null : enumC5763p.name());
        }

        /* renamed from: x */
        public final void m11977x(boolean z) {
            this.f14738q = z;
        }

        /* renamed from: y */
        public final void m11978y(boolean z) {
            this.f14741t = z;
        }

        /* renamed from: z */
        public final boolean m11979z() {
            return this.f14741t;
        }

        private Request(Parcel parcel) {
            EnumC5765r enumC5765r;
            EnumC5773z enumC5773z;
            C5665q0 c5665q0 = C5665q0.f14500a;
            this.f14728g = EnumC5767t.valueOf(C5665q0.m11643k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f14729h = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                enumC5765r = EnumC5765r.valueOf(readString);
            } else {
                enumC5765r = EnumC5765r.NONE;
            }
            this.f14730i = enumC5765r;
            this.f14731j = C5665q0.m11643k(parcel.readString(), "applicationId");
            this.f14732k = C5665q0.m11643k(parcel.readString(), "authId");
            this.f14733l = parcel.readByte() != 0;
            this.f14734m = parcel.readString();
            this.f14735n = C5665q0.m11643k(parcel.readString(), "authType");
            this.f14736o = parcel.readString();
            this.f14737p = parcel.readString();
            this.f14738q = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                enumC5773z = EnumC5773z.valueOf(readString2);
            } else {
                enumC5773z = EnumC5773z.FACEBOOK;
            }
            this.f14739r = enumC5773z;
            this.f14740s = parcel.readByte() != 0;
            this.f14741t = parcel.readByte() != 0;
            this.f14742u = C5665q0.m11643k(parcel.readString(), "nonce");
            this.f14743v = parcel.readString();
            this.f14744w = parcel.readString();
            String readString3 = parcel.readString();
            this.f14745x = readString3 == null ? null : EnumC5763p.valueOf(readString3);
        }
    }
}
