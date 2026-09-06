package com.google.firebase.crashlytics.internal.p190t;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.C8200y;
import com.google.firebase.crashlytics.internal.p187q.C8257a;
import com.google.firebase.crashlytics.internal.p187q.C8258b;
import com.google.firebase.crashlytics.internal.p187q.C8259c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* renamed from: com.google.firebase.crashlytics.h.t.c */
/* loaded from: classes2.dex */
class C8273c implements InterfaceC8281k {

    /* renamed from: a */
    private final String f31591a;

    /* renamed from: b */
    private final C8258b f31592b;

    /* renamed from: c */
    private final C8146h f31593c;

    public C8273c(String str, C8258b c8258b) {
        this(str, c8258b, C8146h.m25176f());
    }

    /* renamed from: b */
    private C8257a m26037b(C8257a c8257a, C8280j c8280j) {
        m26038c(c8257a, "X-CRASHLYTICS-GOOGLE-APP-ID", c8280j.f31622a);
        m26038c(c8257a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m26038c(c8257a, "X-CRASHLYTICS-API-CLIENT-VERSION", C8200y.m25442i());
        m26038c(c8257a, "Accept", "application/json");
        m26038c(c8257a, "X-CRASHLYTICS-DEVICE-MODEL", c8280j.f31623b);
        m26038c(c8257a, "X-CRASHLYTICS-OS-BUILD-VERSION", c8280j.f31624c);
        m26038c(c8257a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c8280j.f31625d);
        m26038c(c8257a, "X-CRASHLYTICS-INSTALLATION-ID", c8280j.f31626e.mo25261a().mo25270c());
        return c8257a;
    }

    /* renamed from: c */
    private void m26038c(C8257a c8257a, String str, String str2) {
        if (str2 != null) {
            c8257a.m25952d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m26039e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            this.f31593c.m25186l("Failed to parse settings JSON from " + this.f31591a, e2);
            this.f31593c.m25185k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m26040f(C8280j c8280j) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c8280j.f31629h);
        hashMap.put("display_version", c8280j.f31628g);
        hashMap.put("source", Integer.toString(c8280j.f31630i));
        String str = c8280j.f31627f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8281k
    /* renamed from: a */
    public JSONObject mo26041a(C8280j c8280j, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> m26040f = m26040f(c8280j);
            C8257a m26037b = m26037b(m26042d(m26040f), c8280j);
            this.f31593c.m25177b("Requesting settings from " + this.f31591a);
            this.f31593c.m25183i("Settings query params were: " + m26040f);
            return m26043g(m26037b.m25951c());
        } catch (IOException e2) {
            this.f31593c.m25180e("Settings request failed.", e2);
            return null;
        }
    }

    /* renamed from: d */
    protected C8257a m26042d(Map<String, String> map) {
        return this.f31592b.m25953a(this.f31591a, map).m25952d("User-Agent", "Crashlytics Android SDK/" + C8200y.m25442i()).m25952d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m26043g(C8259c c8259c) {
        int m25955b = c8259c.m25955b();
        this.f31593c.m25183i("Settings response code was: " + m25955b);
        if (m26044h(m25955b)) {
            return m26039e(c8259c.m25954a());
        }
        this.f31593c.m25179d("Settings request failed; (status: " + m25955b + ") from " + this.f31591a);
        return null;
    }

    /* renamed from: h */
    boolean m26044h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    C8273c(String str, C8258b c8258b, C8146h c8146h) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f31593c = c8146h;
        this.f31592b = c8258b;
        this.f31591a = str;
    }
}
