package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* loaded from: classes2.dex */
public final class zaa {

    /* renamed from: a */
    private static final Api.ClientKey<SignInClientImpl> f29488a;

    /* renamed from: b */
    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> f29489b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f29490c;

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<SignInClientImpl, Object> f29491d;

    /* renamed from: e */
    private static final Scope f29492e;

    /* renamed from: f */
    private static final Scope f29493f;

    /* renamed from: g */
    public static final Api<SignInOptions> f29494g;

    /* renamed from: h */
    private static final Api<Object> f29495h;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        f29488a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        f29489b = clientKey2;
        C7856a c7856a = new C7856a();
        f29490c = c7856a;
        C7857b c7857b = new C7857b();
        f29491d = c7857b;
        f29492e = new Scope("profile");
        f29493f = new Scope("email");
        f29494g = new Api<>("SignIn.API", c7856a, clientKey);
        f29495h = new Api<>("SignIn.INTERNAL_API", c7857b, clientKey2);
    }
}
