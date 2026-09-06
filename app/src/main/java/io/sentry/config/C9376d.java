package io.sentry.config;

import io.sentry.util.C9621u;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: EnvironmentVariablePropertiesProvider.java */
/* renamed from: io.sentry.config.d */
/* loaded from: classes2.dex */
final class C9376d implements InterfaceC9379g {
    C9376d() {
    }

    /* renamed from: h */
    private String m30709h(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: a */
    public Map<String, String> mo30701a(String str) {
        String m31821e;
        String str2 = m30709h(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (m31821e = C9621u.m31821e(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), m31821e);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: b */
    public String mo30702b(String str) {
        return C9621u.m31821e(System.getenv(m30709h(str)), "\"");
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: c */
    public /* synthetic */ Boolean mo30703c(String str) {
        return C9378f.m30711a(this, str);
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: d */
    public /* synthetic */ Long mo30704d(String str) {
        return C9378f.m30714d(this, str);
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: e */
    public /* synthetic */ Double mo30705e(String str) {
        return C9378f.m30712b(this, str);
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: f */
    public /* synthetic */ String mo30706f(String str, String str2) {
        return C9378f.m30715e(this, str, str2);
    }

    @Override // io.sentry.config.InterfaceC9379g
    /* renamed from: g */
    public /* synthetic */ List mo30707g(String str) {
        return C9378f.m30713c(this, str);
    }
}
