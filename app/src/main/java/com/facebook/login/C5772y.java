package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.C9768m;

/* compiled from: LoginResult.kt */
/* renamed from: com.facebook.login.y */
/* loaded from: classes2.dex */
public final class C5772y {

    /* renamed from: a */
    private final AccessToken f14874a;

    /* renamed from: b */
    private final AuthenticationToken f14875b;

    /* renamed from: c */
    private final Set<String> f14876c;

    /* renamed from: d */
    private final Set<String> f14877d;

    public C5772y(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        C9768m.m32346f(accessToken, "accessToken");
        C9768m.m32346f(set, "recentlyGrantedPermissions");
        C9768m.m32346f(set2, "recentlyDeniedPermissions");
        this.f14874a = accessToken;
        this.f14875b = authenticationToken;
        this.f14876c = set;
        this.f14877d = set2;
    }

    /* renamed from: a */
    public final AccessToken m12129a() {
        return this.f14874a;
    }

    /* renamed from: b */
    public final Set<String> m12130b() {
        return this.f14876c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5772y)) {
            return false;
        }
        C5772y c5772y = (C5772y) obj;
        return C9768m.m32341a(this.f14874a, c5772y.f14874a) && C9768m.m32341a(this.f14875b, c5772y.f14875b) && C9768m.m32341a(this.f14876c, c5772y.f14876c) && C9768m.m32341a(this.f14877d, c5772y.f14877d);
    }

    public int hashCode() {
        int hashCode = this.f14874a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f14875b;
        return ((((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.f14876c.hashCode()) * 31) + this.f14877d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f14874a + ", authenticationToken=" + this.f14875b + ", recentlyGrantedPermissions=" + this.f14876c + ", recentlyDeniedPermissions=" + this.f14877d + ')';
    }
}
