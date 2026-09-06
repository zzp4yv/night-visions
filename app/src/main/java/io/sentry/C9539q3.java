package io.sentry;

import io.sentry.util.C9613q;
import java.net.URI;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* compiled from: RequestDetailsResolver.java */
/* renamed from: io.sentry.q3 */
/* loaded from: classes2.dex */
final class C9539q3 {

    /* renamed from: a */
    private final C9647x4 f36795a;

    public C9539q3(C9647x4 c9647x4) {
        this.f36795a = (C9647x4) C9613q.m31802c(c9647x4, "options is required");
    }

    /* renamed from: a */
    C9500p3 m31554a() {
        String str;
        C9399f1 c9399f1 = new C9399f1(this.f36795a.getDsn());
        URI m30785c = c9399f1.m30785c();
        String uri = m30785c.resolve(m30785c.getPath() + "/envelope/").toString();
        String m30783a = c9399f1.m30783a();
        String m30784b = c9399f1.m30784b();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=7,sentry_client=");
        sb.append(this.f36795a.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(m30783a);
        if (m30784b == null || m30784b.length() <= 0) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ",sentry_secret=" + m30784b;
        }
        sb.append(str);
        String sb2 = sb.toString();
        String sentryClientName = this.f36795a.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb2);
        return new C9500p3(uri, hashMap);
    }
}
