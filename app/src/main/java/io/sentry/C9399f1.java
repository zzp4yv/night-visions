package io.sentry;

import cm.aptoide.p092pt.dataprovider.BuildConfig;
import io.sentry.util.C9613q;
import java.net.URI;

/* compiled from: Dsn.java */
/* renamed from: io.sentry.f1 */
/* loaded from: classes2.dex */
final class C9399f1 {

    /* renamed from: a */
    private final String f36317a;

    /* renamed from: b */
    private final String f36318b;

    /* renamed from: c */
    private final String f36319c;

    /* renamed from: d */
    private final String f36320d;

    /* renamed from: e */
    private final URI f36321e;

    C9399f1(String str) throws IllegalArgumentException {
        try {
            C9613q.m31802c(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String scheme = normalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = normalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] split = userInfo.split(":", -1);
            String str2 = split[0];
            this.f36320d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f36319c = split.length > 1 ? split[1] : null;
            String path = normalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int lastIndexOf = path.lastIndexOf("/") + 1;
            String substring = path.substring(0, lastIndexOf);
            if (!substring.endsWith("/")) {
                substring = substring + "/";
            }
            this.f36318b = substring;
            String substring2 = path.substring(lastIndexOf);
            this.f36317a = substring2;
            if (substring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f36321e = new URI(scheme, null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    /* renamed from: a */
    public String m30783a() {
        return this.f36320d;
    }

    /* renamed from: b */
    public String m30784b() {
        return this.f36319c;
    }

    /* renamed from: c */
    URI m30785c() {
        return this.f36321e;
    }
}
