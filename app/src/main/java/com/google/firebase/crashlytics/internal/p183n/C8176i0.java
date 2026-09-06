package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.InterfaceC8178j0;
import com.google.firebase.installations.InterfaceC8352i;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: IdManager.java */
/* renamed from: com.google.firebase.crashlytics.h.n.i0 */
/* loaded from: classes2.dex */
public class C8176i0 implements InterfaceC8178j0 {

    /* renamed from: a */
    private static final Pattern f30920a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b */
    private static final String f30921b = Pattern.quote("/");

    /* renamed from: c */
    private final C8180k0 f30922c;

    /* renamed from: d */
    private final Context f30923d;

    /* renamed from: e */
    private final String f30924e;

    /* renamed from: f */
    private final InterfaceC8352i f30925f;

    /* renamed from: g */
    private final C8168e0 f30926g;

    /* renamed from: h */
    private InterfaceC8178j0.a f30927h;

    public C8176i0(Context context, String str, InterfaceC8352i interfaceC8352i, C8168e0 c8168e0) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f30923d = context;
        this.f30924e = str;
        this.f30925f = interfaceC8352i;
        this.f30926g = c8168e0;
        this.f30922c = new C8180k0();
    }

    /* renamed from: b */
    private synchronized String m25254b(String str, SharedPreferences sharedPreferences) {
        String m25256e;
        m25256e = m25256e(UUID.randomUUID().toString());
        C8146h.m25176f().m25183i("Created new Crashlytics installation ID: " + m25256e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m25256e).putString("firebase.installation.id", str).apply();
        return m25256e;
    }

    /* renamed from: c */
    static String m25255c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    private static String m25256e(String str) {
        if (str == null) {
            return null;
        }
        return f30920a.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m25257k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m25258l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m25259m(String str) {
        return str.replaceAll(f30921b, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: n */
    private boolean m25260n() {
        InterfaceC8178j0.a aVar = this.f30927h;
        return aVar == null || (aVar.mo25271d() == null && this.f30926g.m25239d());
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8178j0
    /* renamed from: a */
    public synchronized InterfaceC8178j0.a mo25261a() {
        if (!m25260n()) {
            return this.f30927h;
        }
        C8146h.m25176f().m25183i("Determining Crashlytics installation ID...");
        SharedPreferences m25346q = C8195t.m25346q(this.f30923d);
        String string = m25346q.getString("firebase.installation.id", null);
        C8146h.m25176f().m25183i("Cached Firebase Installation ID: " + string);
        if (this.f30926g.m25239d()) {
            String m25262d = m25262d();
            C8146h.m25176f().m25183i("Fetched Firebase Installation ID: " + m25262d);
            if (m25262d == null) {
                m25262d = string == null ? m25255c() : string;
            }
            if (m25262d.equals(string)) {
                this.f30927h = InterfaceC8178j0.a.m25268a(m25258l(m25346q), m25262d);
            } else {
                this.f30927h = InterfaceC8178j0.a.m25268a(m25254b(m25262d, m25346q), m25262d);
            }
        } else if (m25257k(string)) {
            this.f30927h = InterfaceC8178j0.a.m25269b(m25258l(m25346q));
        } else {
            this.f30927h = InterfaceC8178j0.a.m25269b(m25254b(m25255c(), m25346q));
        }
        C8146h.m25176f().m25183i("Install IDs: " + this.f30927h);
        return this.f30927h;
    }

    /* renamed from: d */
    public String m25262d() {
        try {
            return (String) C8192q0.m25312a(this.f30925f.getId());
        } catch (Exception e2) {
            C8146h.m25176f().m25186l("Failed to retrieve Firebase Installation ID.", e2);
            return null;
        }
    }

    /* renamed from: f */
    public String m25263f() {
        return this.f30924e;
    }

    /* renamed from: g */
    public String m25264g() {
        return this.f30922c.m25273a(this.f30923d);
    }

    /* renamed from: h */
    public String m25265h() {
        return String.format(Locale.US, "%s/%s", m25259m(Build.MANUFACTURER), m25259m(Build.MODEL));
    }

    /* renamed from: i */
    public String m25266i() {
        return m25259m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m25267j() {
        return m25259m(Build.VERSION.RELEASE);
    }
}
