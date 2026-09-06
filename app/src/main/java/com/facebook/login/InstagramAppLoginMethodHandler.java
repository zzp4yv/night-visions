package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C5608a0;
import com.facebook.EnumC5923w;
import com.facebook.internal.C5653k0;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: InstagramAppLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: k */
    private final String f14710k;

    /* renamed from: l */
    private final EnumC5923w f14711l;

    /* renamed from: j */
    public static final C5727b f14709j = new C5727b(null);
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C5726a();

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    public static final class C5726a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        C5726a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int i2) {
            return new InstagramAppLoginMethodHandler[i2];
        }
    }

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$b */
    public static final class C5727b {
        private C5727b() {
        }

        public /* synthetic */ C5727b(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9768m.m32346f(loginClient, "loginClient");
        this.f14710k = "instagram_login";
        this.f14711l = EnumC5923w.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14710k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        LoginClient.C5737c c5737c = LoginClient.f14714f;
        String m11995a = c5737c.m11995a();
        C5653k0 c5653k0 = C5653k0.f14437a;
        Context m11940i = m12000d().m11940i();
        if (m11940i == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11940i = C5608a0.m11284c();
        }
        String m11954a = request.m11954a();
        Set<String> m11967n = request.m11967n();
        boolean m11972s = request.m11972s();
        boolean m11969p = request.m11969p();
        EnumC5765r m11960g = request.m11960g();
        if (m11960g == null) {
            m11960g = EnumC5765r.NONE;
        }
        Intent m11467i = C5653k0.m11467i(m11940i, m11954a, m11967n, m11995a, m11972s, m11969p, m11960g, m11999c(request.m11955b()), request.m11956c(), request.m11965l(), request.m11968o(), request.m11970q(), request.m11979z());
        m11998a("e2e", m11995a);
        return m12016B(m11467i, c5737c.m11996b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* renamed from: s */
    public EnumC5923w mo11920s() {
        return this.f14711l;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        super.writeToParcel(parcel, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9768m.m32346f(parcel, "source");
        this.f14710k = "instagram_login";
        this.f14711l = EnumC5923w.INSTAGRAM_APPLICATION_WEB;
    }
}
