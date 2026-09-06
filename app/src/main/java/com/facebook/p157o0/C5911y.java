package com.facebook.p157o0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import cm.aptoide.p092pt.account.AccountAnalytics;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5626g0;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5651j0;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.p159l0.C5812f;
import com.facebook.p157o0.p159l0.C5814h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import p024c.p076q.p077a.C0997a;

/* compiled from: AppEventQueue.kt */
/* renamed from: com.facebook.o0.y */
/* loaded from: classes.dex */
public final class C5911y {

    /* renamed from: f */
    private static ScheduledFuture<?> f15549f;

    /* renamed from: a */
    public static final C5911y f15544a = new C5911y();

    /* renamed from: b */
    private static final String f15545b = C5911y.class.getName();

    /* renamed from: c */
    private static final int f15546c = 100;

    /* renamed from: d */
    private static volatile C5909w f15547d = new C5909w();

    /* renamed from: e */
    private static final ScheduledExecutorService f15548e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g */
    private static final Runnable f15550g = new Runnable() { // from class: com.facebook.o0.d
        @Override // java.lang.Runnable
        public final void run() {
            C5911y.m12861i();
        }
    };

    private C5911y() {
    }

    /* renamed from: a */
    public static final void m12853a(final C5895t c5895t, final C5908v c5908v) {
        C9768m.m32346f(c5895t, "accessTokenAppId");
        C9768m.m32346f(c5908v, "appEvent");
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5911y.m12854b(C5895t.this, c5908v);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12854b(C5895t c5895t, C5908v c5908v) {
        C9768m.m32346f(c5895t, "$accessTokenAppId");
        C9768m.m32346f(c5908v, "$appEvent");
        f15547d.m12846a(c5895t, c5908v);
        if (C5780a0.f14908a.m12170d() != C5780a0.b.EXPLICIT_ONLY && f15547d.m12849d() > f15546c) {
            m12860h(EnumC5786d0.EVENT_THRESHOLD);
        } else if (f15549f == null) {
            f15549f = f15548e.schedule(f15550g, 15L, TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    public static final GraphRequest m12855c(final C5895t c5895t, final C5796i0 c5796i0, boolean z, final C5790f0 c5790f0) {
        C9768m.m32346f(c5895t, "accessTokenAppId");
        C9768m.m32346f(c5796i0, "appEvents");
        C9768m.m32346f(c5790f0, "flushState");
        String m12760b = c5895t.m12760b();
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5637c0 m11428o = C5639d0.m11428o(m12760b, false);
        GraphRequest.C5599c c5599c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("%s/activities", Arrays.copyOf(new Object[]{m12760b}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        final GraphRequest m11222A = c5599c.m11222A(null, format, null, null);
        m11222A.m11174E(true);
        Bundle m11186t = m11222A.m11186t();
        if (m11186t == null) {
            m11186t = new Bundle();
        }
        m11186t.putString("access_token", c5895t.m12759a());
        String m12252d = C5792g0.f14949a.m12252d();
        if (m12252d != null) {
            m11186t.putString("device_token", m12252d);
        }
        String m12211i = C5782b0.f14915a.m12211i();
        if (m12211i != null) {
            m11186t.putString("install_referrer", m12211i);
        }
        m11222A.m11177H(m11186t);
        boolean m11410n = m11428o != null ? m11428o.m11410n() : false;
        C5608a0 c5608a0 = C5608a0.f14199a;
        int m12261e = c5796i0.m12261e(m11222A, C5608a0.m11284c(), m11410n, z);
        if (m12261e == 0) {
            return null;
        }
        c5790f0.m12237c(c5790f0.m12235a() + m12261e);
        m11222A.m11173D(new GraphRequest.InterfaceC5598b() { // from class: com.facebook.o0.f
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5911y.m12856d(C5895t.this, m11222A, c5796i0, c5790f0, c5620d0);
            }
        });
        return m11222A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12856d(C5895t c5895t, GraphRequest graphRequest, C5796i0 c5796i0, C5790f0 c5790f0, C5620d0 c5620d0) {
        C9768m.m32346f(c5895t, "$accessTokenAppId");
        C9768m.m32346f(graphRequest, "$postRequest");
        C9768m.m32346f(c5796i0, "$appEvents");
        C9768m.m32346f(c5790f0, "$flushState");
        C9768m.m32346f(c5620d0, "response");
        m12863k(c5895t, graphRequest, c5620d0, c5796i0, c5790f0);
    }

    /* renamed from: e */
    public static final List<GraphRequest> m12857e(C5909w c5909w, C5790f0 c5790f0) {
        C9768m.m32346f(c5909w, "appEventCollection");
        C9768m.m32346f(c5790f0, "flushResults");
        C5608a0 c5608a0 = C5608a0.f14199a;
        boolean m11298q = C5608a0.m11298q(C5608a0.m11284c());
        ArrayList arrayList = new ArrayList();
        for (C5895t c5895t : c5909w.m12850f()) {
            C5796i0 m12848c = c5909w.m12848c(c5895t);
            if (m12848c == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            GraphRequest m12855c = m12855c(c5895t, m12848c, m11298q, c5790f0);
            if (m12855c != null) {
                arrayList.add(m12855c);
                if (C5812f.f15023a.m12313e()) {
                    C5814h c5814h = C5814h.f15048a;
                    C5814h.m12340l(m12855c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final void m12858f(final EnumC5786d0 enumC5786d0) {
        C9768m.m32346f(enumC5786d0, "reason");
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.g
            @Override // java.lang.Runnable
            public final void run() {
                C5911y.m12859g(EnumC5786d0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m12859g(EnumC5786d0 enumC5786d0) {
        C9768m.m32346f(enumC5786d0, "$reason");
        m12860h(enumC5786d0);
    }

    /* renamed from: h */
    public static final void m12860h(EnumC5786d0 enumC5786d0) {
        C9768m.m32346f(enumC5786d0, "reason");
        C5910x c5910x = C5910x.f15541a;
        f15547d.m12847b(C5910x.m12851a());
        try {
            C5790f0 m12873u = m12873u(enumC5786d0, f15547d);
            if (m12873u != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", m12873u.m12235a());
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", m12873u.m12236b());
                C5608a0 c5608a0 = C5608a0.f14199a;
                C0997a.m6341b(C5608a0.m11284c()).m6344d(intent);
            }
        } catch (Exception e2) {
            Log.w(f15545b, "Caught unexpected exception while flushing app events: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12861i() {
        f15549f = null;
        if (C5780a0.f14908a.m12170d() != C5780a0.b.EXPLICIT_ONLY) {
            m12860h(EnumC5786d0.TIMER);
        }
    }

    /* renamed from: j */
    public static final Set<C5895t> m12862j() {
        return f15547d.m12850f();
    }

    /* renamed from: k */
    public static final void m12863k(final C5895t c5895t, GraphRequest graphRequest, C5620d0 c5620d0, final C5796i0 c5796i0, C5790f0 c5790f0) {
        String str;
        String str2;
        C9768m.m32346f(c5895t, "accessTokenAppId");
        C9768m.m32346f(graphRequest, "request");
        C9768m.m32346f(c5620d0, "response");
        C9768m.m32346f(c5796i0, "appEvents");
        C9768m.m32346f(c5790f0, "flushState");
        FacebookRequestError m11338b = c5620d0.m11338b();
        EnumC5788e0 enumC5788e0 = EnumC5788e0.SUCCESS;
        if (m11338b == null) {
            str = AccountAnalytics.SUCCESS;
        } else if (m11338b.m11140b() == -1) {
            enumC5788e0 = EnumC5788e0.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{c5620d0.toString(), m11338b.toString()}, 2));
            C9768m.m32345e(str, "java.lang.String.format(format, *args)");
            enumC5788e0 = EnumC5788e0.SERVER_ERROR;
        }
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11306y(EnumC5626g0.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) graphRequest.m11188v()).toString(2);
                C9768m.m32345e(str2, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            C5651j0.a aVar = C5651j0.f14429a;
            EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
            String str3 = f15545b;
            C9768m.m32345e(str3, "TAG");
            aVar.m11455c(enumC5626g0, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.m11183p()), str, str2);
        }
        c5796i0.m12258b(m11338b != null);
        EnumC5788e0 enumC5788e02 = EnumC5788e0.NO_CONNECTIVITY;
        if (enumC5788e0 == enumC5788e02) {
            C5608a0 c5608a02 = C5608a0.f14199a;
            C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C5911y.m12864l(C5895t.this, c5796i0);
                }
            });
        }
        if (enumC5788e0 == EnumC5788e0.SUCCESS || c5790f0.m12236b() == enumC5788e02) {
            return;
        }
        c5790f0.m12238d(enumC5788e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12864l(C5895t c5895t, C5796i0 c5796i0) {
        C9768m.m32346f(c5895t, "$accessTokenAppId");
        C9768m.m32346f(c5796i0, "$appEvents");
        C5912z c5912z = C5912z.f15551a;
        C5912z.m12874a(c5895t, c5796i0);
    }

    /* renamed from: s */
    public static final void m12871s() {
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.c
            @Override // java.lang.Runnable
            public final void run() {
                C5911y.m12872t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m12872t() {
        C5912z c5912z = C5912z.f15551a;
        C5912z.m12875b(f15547d);
        f15547d = new C5909w();
    }

    /* renamed from: u */
    public static final C5790f0 m12873u(EnumC5786d0 enumC5786d0, C5909w c5909w) {
        C9768m.m32346f(enumC5786d0, "reason");
        C9768m.m32346f(c5909w, "appEventCollection");
        C5790f0 c5790f0 = new C5790f0();
        List<GraphRequest> m12857e = m12857e(c5909w, c5790f0);
        if (!(!m12857e.isEmpty())) {
            return null;
        }
        C5651j0.a aVar = C5651j0.f14429a;
        EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
        String str = f15545b;
        C9768m.m32345e(str, "TAG");
        aVar.m11455c(enumC5626g0, str, "Flushing %d events due to %s.", Integer.valueOf(c5790f0.m12235a()), enumC5786d0.toString());
        Iterator<GraphRequest> it = m12857e.iterator();
        while (it.hasNext()) {
            it.next().m11179j();
        }
        return c5790f0;
    }
}
