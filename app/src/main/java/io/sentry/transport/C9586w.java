package io.sentry.transport;

import io.sentry.util.C9613q;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* compiled from: ProxyAuthenticator.java */
/* renamed from: io.sentry.transport.w */
/* loaded from: classes2.dex */
final class C9586w extends Authenticator {

    /* renamed from: a */
    private final String f36903a;

    /* renamed from: b */
    private final String f36904b;

    C9586w(String str, String str2) {
        this.f36903a = (String) C9613q.m31802c(str, "user is required");
        this.f36904b = (String) C9613q.m31802c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f36903a, this.f36904b.toCharArray());
        }
        return null;
    }
}
