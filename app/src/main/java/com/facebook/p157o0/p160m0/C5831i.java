package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C5608a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5664q;
import com.facebook.p157o0.p160m0.C5835m;
import com.facebook.p157o0.p165q0.C5869g;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CodelessManager.kt */
/* renamed from: com.facebook.o0.m0.i */
/* loaded from: classes.dex */
public final class C5831i {

    /* renamed from: c */
    private static SensorManager f15176c;

    /* renamed from: d */
    private static C5834l f15177d;

    /* renamed from: e */
    private static String f15178e;

    /* renamed from: h */
    private static volatile boolean f15181h;

    /* renamed from: a */
    public static final C5831i f15174a = new C5831i();

    /* renamed from: b */
    private static final C5835m f15175b = new C5835m();

    /* renamed from: f */
    private static final AtomicBoolean f15179f = new AtomicBoolean(true);

    /* renamed from: g */
    private static final AtomicBoolean f15180g = new AtomicBoolean(false);

    private C5831i() {
    }

    /* renamed from: a */
    private final void m12379a(final String str) {
        if (f15181h) {
            return;
        }
        f15181h = true;
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5831i.m12380b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12380b(String str) {
        Bundle bundle = new Bundle();
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5664q m11628e = C5664q.f14488a.m11628e(C5608a0.m11284c());
        JSONArray jSONArray = new JSONArray();
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONArray.put(str2);
        if ((m11628e == null ? null : m11628e.m11618h()) != null) {
            jSONArray.put(m11628e.m11618h());
        } else {
            jSONArray.put(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        jSONArray.put("0");
        C5869g c5869g = C5869g.f15370a;
        jSONArray.put(C5869g.m12629f() ? "1" : "0");
        C5663p0 c5663p0 = C5663p0.f14478a;
        Locale m11602y = C5663p0.m11602y();
        jSONArray.put(m11602y.getLanguage() + '_' + ((Object) m11602y.getCountry()));
        String jSONArray2 = jSONArray.toString();
        C9768m.m32345e(jSONArray2, "extInfoArray.toString()");
        bundle.putString("device_session_id", m12383e());
        bundle.putString("extinfo", jSONArray2);
        GraphRequest.C5599c c5599c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
        C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
        JSONObject m11339c = c5599c.m11223B(null, format, bundle, null).m11179j().m11339c();
        AtomicBoolean atomicBoolean = f15180g;
        atomicBoolean.set(m11339c != null && m11339c.optBoolean("is_app_indexing_enabled", false));
        if (atomicBoolean.get()) {
            C5834l c5834l = f15177d;
            if (c5834l != null) {
                c5834l.m12428h();
            }
        } else {
            f15178e = null;
        }
        f15181h = false;
    }

    /* renamed from: c */
    public static final void m12381c() {
        f15179f.set(false);
    }

    /* renamed from: d */
    public static final void m12382d() {
        f15179f.set(true);
    }

    /* renamed from: e */
    public static final String m12383e() {
        if (f15178e == null) {
            f15178e = UUID.randomUUID().toString();
        }
        String str = f15178e;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: f */
    public static final boolean m12384f() {
        return f15180g.get();
    }

    /* renamed from: g */
    private final boolean m12385g() {
        return false;
    }

    /* renamed from: j */
    public static final void m12388j(Activity activity) {
        C9768m.m32346f(activity, "activity");
        C5832j.f15182a.m12403a().m12401e(activity);
    }

    /* renamed from: k */
    public static final void m12389k(Activity activity) {
        C9768m.m32346f(activity, "activity");
        if (f15179f.get()) {
            C5832j.f15182a.m12403a().m12402h(activity);
            C5834l c5834l = f15177d;
            if (c5834l != null) {
                c5834l.m12429l();
            }
            SensorManager sensorManager = f15176c;
            if (sensorManager == null) {
                return;
            }
            sensorManager.unregisterListener(f15175b);
        }
    }

    /* renamed from: l */
    public static final void m12390l(Activity activity) {
        C9768m.m32346f(activity, "activity");
        if (f15179f.get()) {
            C5832j.f15182a.m12403a().m12400d(activity);
            Context applicationContext = activity.getApplicationContext();
            C5608a0 c5608a0 = C5608a0.f14199a;
            final String m11285d = C5608a0.m11285d();
            C5639d0 c5639d0 = C5639d0.f14392a;
            final C5637c0 m11417c = C5639d0.m11417c(m11285d);
            if (C9768m.m32341a(m11417c == null ? null : Boolean.valueOf(m11417c.m11398b()), Boolean.TRUE) || f15174a.m12385g()) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                f15176c = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                C5834l c5834l = new C5834l(activity);
                f15177d = c5834l;
                C5835m c5835m = f15175b;
                c5835m.m12434a(new C5835m.b() { // from class: com.facebook.o0.m0.c
                    @Override // com.facebook.p157o0.p160m0.C5835m.b
                    /* renamed from: a */
                    public final void mo12370a() {
                        C5831i.m12391m(C5637c0.this, m11285d);
                    }
                });
                sensorManager.registerListener(c5835m, defaultSensor, 2);
                if (m11417c != null && m11417c.m11398b()) {
                    c5834l.m12428h();
                }
            }
            C5831i c5831i = f15174a;
            if (!c5831i.m12385g() || f15180g.get()) {
                return;
            }
            c5831i.m12379a(m11285d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12391m(C5637c0 c5637c0, String str) {
        C9768m.m32346f(str, "$appId");
        boolean z = c5637c0 != null && c5637c0.m11398b();
        C5608a0 c5608a0 = C5608a0.f14199a;
        boolean z2 = C5608a0.m11291j();
        if (z && z2) {
            f15174a.m12379a(str);
        }
    }

    /* renamed from: n */
    public static final void m12392n(boolean z) {
        f15180g.set(z);
    }
}
