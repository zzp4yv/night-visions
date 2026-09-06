package p241e.p252d.p253a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.C5959a;
import com.flurry.sdk.C5959a.a;
import com.flurry.sdk.C5959a.b;
import com.flurry.sdk.C5959a.c;
import com.flurry.sdk.C5959a.d;
import com.flurry.sdk.C5959a.e;
import com.flurry.sdk.C5959a.g;
import com.flurry.sdk.C5959a.h;
import com.flurry.sdk.C5959a.j;
import com.flurry.sdk.C5969b0;
import com.flurry.sdk.C5980c2;
import com.flurry.sdk.C5988d1;
import com.flurry.sdk.C6004e7;
import com.flurry.sdk.C6051k0;
import com.flurry.sdk.C6071m2;
import com.flurry.sdk.C6158w4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: e.d.a.b */
/* loaded from: classes2.dex */
public final class C8743b {

    /* renamed from: e.d.a.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: j */
        private AbstractC8742a f33377j;

        /* renamed from: a */
        private InterfaceC8744c f33368a = null;

        /* renamed from: b */
        private boolean f33369b = false;

        /* renamed from: c */
        private int f33370c = 5;

        /* renamed from: d */
        private long f33371d = 10000;

        /* renamed from: e */
        private boolean f33372e = true;

        /* renamed from: f */
        private boolean f33373f = true;

        /* renamed from: g */
        private boolean f33374g = false;

        /* renamed from: h */
        private int f33375h = C8747f.f33389a;

        /* renamed from: i */
        private List<InterfaceC8746e> f33376i = new ArrayList();

        /* renamed from: k */
        private boolean f33378k = false;

        /* renamed from: l */
        private boolean f33379l = false;

        /* renamed from: a */
        public void m27933a(Context context, String str) {
            boolean z;
            if (C8743b.m27927b()) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("API key not specified");
                }
                C5969b0.m12965b(context);
                C6051k0.m13141a().f16042c = str;
                C5959a m12944v = C5959a.m12944v();
                InterfaceC8744c interfaceC8744c = this.f33368a;
                boolean z2 = this.f33369b;
                int i2 = this.f33370c;
                long j2 = this.f33371d;
                boolean z3 = this.f33372e;
                boolean z4 = this.f33373f;
                boolean z5 = this.f33374g;
                int i3 = this.f33375h;
                List<InterfaceC8746e> list = this.f33376i;
                AbstractC8742a abstractC8742a = this.f33377j;
                boolean z6 = this.f33378k;
                boolean z7 = this.f33379l;
                if (C5959a.f15620o.get()) {
                    C5988d1.m13041n("FlurryAgentImpl", "Invalid call to Init. Flurry is already initialized");
                    return;
                }
                C5988d1.m13041n("FlurryAgentImpl", "Initializing Flurry SDK");
                if (C5959a.f15620o.get()) {
                    C5988d1.m13041n("FlurryAgentImpl", "Invalid call to register. Flurry is already initialized");
                } else {
                    m12944v.f15622q = list;
                }
                C6071m2.m13180a();
                m12944v.mo13007m(m12944v.new b(context, list));
                C6158w4 m13369a = C6158w4.m13369a();
                C6004e7 m13055a = C6004e7.m13055a();
                if (m13055a != null) {
                    z = z6;
                    m13055a.f15822b.mo13050v(m13369a.f16491h);
                    m13055a.f15823c.mo13050v(m13369a.f16492i);
                    m13055a.f15824d.mo13050v(m13369a.f16489f);
                    m13055a.f15825e.mo13050v(m13369a.f16490g);
                    m13055a.f15826f.mo13050v(m13369a.f16495l);
                    m13055a.f15827g.mo13050v(m13369a.f16487d);
                    m13055a.f15828h.mo13050v(m13369a.f16488e);
                    m13055a.f15829i.mo13050v(m13369a.f16494k);
                    m13055a.f15830j.mo13050v(m13369a.f16485b);
                    m13055a.f15831k.mo13050v(m13369a.f16493j);
                    m13055a.f15832l.mo13050v(m13369a.f16486c);
                    m13055a.f15833m.mo13050v(m13369a.f16496m);
                    m13055a.f15835o.mo13050v(m13369a.f16497n);
                    m13055a.f15836p.mo13050v(m13369a.f16498o);
                    m13055a.f15837q.mo13050v(m13369a.f16499p);
                } else {
                    z = z6;
                }
                C6051k0.m13141a().m13144c();
                C6004e7.m13055a().f15830j.m13093a();
                C6004e7.m13055a().f15827g.f15702q = z3;
                if (abstractC8742a != null) {
                    C6004e7.m13055a().f15833m.m13178x(abstractC8742a);
                }
                if (z2) {
                    C5988d1.m13034g();
                } else {
                    C5988d1.m13028a();
                }
                C5988d1.m13029b(i2);
                m12944v.mo13007m(m12944v.new a(j2, interfaceC8744c));
                m12944v.mo13007m(m12944v.new g(z4, z5));
                m12944v.mo13007m(m12944v.new d(i3, context));
                m12944v.mo13007m(m12944v.new e(z));
                C5959a.f15620o.set(true);
                if (z7) {
                    C5988d1.m13041n("FlurryAgentImpl", "Force start session");
                    m12944v.m12949w(context.getApplicationContext());
                }
            }
        }

        /* renamed from: b */
        public a m27934b(boolean z) {
            this.f33372e = z;
            return this;
        }

        /* renamed from: c */
        public a m27935c(boolean z) {
            this.f33373f = z;
            return this;
        }

        /* renamed from: d */
        public a m27936d(boolean z) {
            this.f33369b = z;
            return this;
        }

        /* renamed from: e */
        public a m27937e(int i2) {
            this.f33375h = i2;
            return this;
        }
    }

    /* renamed from: e.d.a.b$b */
    public static class b {
        /* renamed from: a */
        public static void m27938a(String str, String str2) {
            if (C8743b.m27927b()) {
                C5959a m12944v = C5959a.m12944v();
                if (C5959a.f15620o.get()) {
                    m12944v.mo13007m(m12944v.new c(str, str2));
                } else {
                    C5988d1.m13041n("FlurryAgentImpl", "Invalid call to UserProperties.add. Flurry is not initialized");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m27927b() {
        if (C5980c2.m12991g(16)) {
            return true;
        }
        C5988d1.m13037j("FlurryAgent", String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
        return false;
    }

    /* renamed from: c */
    public static EnumC8745d m27928c(String str) {
        return !m27927b() ? EnumC8745d.kFlurryEventFailed : C5959a.m12944v().m12948u(str, Collections.emptyMap(), false, false);
    }

    /* renamed from: d */
    public static EnumC8745d m27929d(String str, Map<String, String> map) {
        EnumC8745d enumC8745d = EnumC8745d.kFlurryEventFailed;
        if (!m27927b()) {
            return enumC8745d;
        }
        if (str == null) {
            C5988d1.m13037j("FlurryAgent", "String eventId passed to logEvent was null.");
            return enumC8745d;
        }
        if (map == null) {
            C5988d1.m13039l("FlurryAgent", "String parameters passed to logEvent was null.");
        }
        return C5959a.m12944v().m12948u(str, map, false, false);
    }

    /* renamed from: e */
    public static void m27930e(Context context) {
        if (m27927b()) {
            C5959a m12944v = C5959a.m12944v();
            if (context instanceof Activity) {
                C5988d1.m13032e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
            } else if (C5959a.f15620o.get()) {
                m12944v.mo13007m(m12944v.new h());
            } else {
                C5988d1.m13041n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
            }
        }
    }

    /* renamed from: f */
    public static void m27931f(String str, String str2, Throwable th, Map<String, String> map) {
        if (m27927b()) {
            C5959a m12944v = C5959a.m12944v();
            if (!C5959a.f15620o.get()) {
                C5988d1.m13041n("FlurryAgentImpl", "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            m12944v.mo13007m(m12944v.new j(str, currentTimeMillis, str2, th, hashMap));
        }
    }

    /* renamed from: g */
    public static void m27932g(Context context) {
        if (m27927b()) {
            C5959a.m12944v().m12949w(context);
        }
    }
}
