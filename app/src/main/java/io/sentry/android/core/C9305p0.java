package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC9342c4;
import io.sentry.C9403f5;
import io.sentry.C9456j1;
import io.sentry.C9473l4;
import io.sentry.C9480m4;
import io.sentry.C9484n1;
import io.sentry.C9624v0;
import io.sentry.C9659z4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9557t0;
import io.sentry.android.core.C9313t0;
import io.sentry.android.core.internal.util.C9283m;
import io.sentry.cache.C9362s;
import io.sentry.cache.C9363t;
import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9421d;
import io.sentry.protocol.C9506a;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9510c;
import io.sentry.protocol.C9512d;
import io.sentry.protocol.C9513e;
import io.sentry.protocol.C9517i;
import io.sentry.protocol.C9519k;
import io.sentry.protocol.C9520l;
import io.sentry.protocol.C9523o;
import io.sentry.protocol.C9530v;
import io.sentry.protocol.C9531w;
import io.sentry.protocol.C9532x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9609m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AnrV2EventProcessor.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.p0 */
/* loaded from: classes2.dex */
public final class C9305p0 implements InterfaceC9557t0 {

    /* renamed from: f */
    private final Context f36086f;

    /* renamed from: g */
    private final SentryAndroidOptions f36087g;

    /* renamed from: h */
    private final C9311s0 f36088h;

    /* renamed from: i */
    private final C9480m4 f36089i;

    public C9305p0(Context context, SentryAndroidOptions sentryAndroidOptions, C9311s0 c9311s0) {
        this.f36086f = context;
        this.f36087g = sentryAndroidOptions;
        this.f36088h = c9311s0;
        this.f36089i = new C9480m4(new C9659z4(sentryAndroidOptions));
    }

    /* renamed from: A */
    private void m30355A(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30582J() == null) {
            abstractC9342c4.m30597Y((String) C9362s.m30646v(this.f36087g, "release.json", String.class));
        }
    }

    /* renamed from: B */
    private void m30356B(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30583K() == null) {
            abstractC9342c4.m30598Z((C9520l) C9363t.m30669q(this.f36087g, "request.json", C9520l.class));
        }
    }

    /* renamed from: C */
    private void m30357C(AbstractC9342c4 abstractC9342c4) {
        Map map = (Map) C9363t.m30669q(this.f36087g, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9342c4.m30586N() == null) {
            abstractC9342c4.m30602d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9342c4.m30586N().containsKey(entry.getKey())) {
                abstractC9342c4.m30601c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: D */
    private void m30358D(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30584L() == null) {
            abstractC9342c4.m30599a0((C9523o) C9362s.m30646v(this.f36087g, "sdk-version.json", C9523o.class));
        }
    }

    /* renamed from: E */
    private void m30359E(AbstractC9342c4 abstractC9342c4) {
        try {
            C9313t0.a m30424p = C9313t0.m30424p(this.f36086f, this.f36087g.getLogger(), this.f36088h);
            if (m30424p != null) {
                for (Map.Entry<String, String> entry : m30424p.m30426a().entrySet()) {
                    abstractC9342c4.m30601c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting side loaded info.", th);
        }
    }

    /* renamed from: F */
    private void m30360F(C9473l4 c9473l4) {
        m30374m(c9473l4);
        m30359E(c9473l4);
    }

    /* renamed from: G */
    private void m30361G(C9473l4 c9473l4) {
        C9403f5 c9403f5 = (C9403f5) C9363t.m30669q(this.f36087g, "trace.json", C9403f5.class);
        if (c9473l4.m30575C().m31234e() != null || c9403f5 == null || c9403f5.m30800h() == null || c9403f5.m30803k() == null) {
            return;
        }
        c9473l4.m30575C().m31242n(c9403f5);
    }

    /* renamed from: H */
    private void m30362H(C9473l4 c9473l4) {
        String str = (String) C9363t.m30669q(this.f36087g, "transaction.json", String.class);
        if (c9473l4.m31005t0() == null) {
            c9473l4.m30998E0(str);
        }
    }

    /* renamed from: I */
    private void m30363I(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30589Q() == null) {
            abstractC9342c4.m30603e0((C9507a0) C9363t.m30669q(this.f36087g, "user.json", C9507a0.class));
        }
    }

    /* renamed from: a */
    private void m30364a(C9473l4 c9473l4, Object obj) {
        m30355A(c9473l4);
        m30381t(c9473l4);
        m30380s(c9473l4);
        m30378q(c9473l4);
        m30358D(c9473l4);
        m30375n(c9473l4, obj);
        m30386y(c9473l4);
    }

    /* renamed from: c */
    private void m30365c(C9473l4 c9473l4) {
        m30356B(c9473l4);
        m30363I(c9473l4);
        m30357C(c9473l4);
        m30376o(c9473l4);
        m30383v(c9473l4);
        m30377p(c9473l4);
        m30362H(c9473l4);
        m30384w(c9473l4);
        m30385x(c9473l4);
        m30361G(c9473l4);
    }

    /* renamed from: d */
    private C9531w m30366d(List<C9531w> list) {
        if (list == null) {
            return null;
        }
        for (C9531w c9531w : list) {
            String m31517m = c9531w.m31517m();
            if (m31517m != null && m31517m.equals("main")) {
                return c9531w;
            }
        }
        return null;
    }

    /* renamed from: f */
    private C9507a0 m30367f() {
        C9507a0 c9507a0 = new C9507a0();
        c9507a0.m31219n(m30369h());
        return c9507a0;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    private C9513e m30368g() {
        C9513e c9513e = new C9513e();
        if (this.f36087g.isSendDefaultPii()) {
            c9513e.m31330g0(C9313t0.m30412d(this.f36086f, this.f36088h));
        }
        c9513e.m31326c0(Build.MANUFACTURER);
        c9513e.m31314Q(Build.BRAND);
        c9513e.m31319V(C9313t0.m30414f(this.f36087g.getLogger()));
        c9513e.m31328e0(Build.MODEL);
        c9513e.m31329f0(Build.ID);
        c9513e.m31310M(C9313t0.m30411c(this.f36088h));
        ActivityManager.MemoryInfo m30416h = C9313t0.m30416h(this.f36086f, this.f36087g.getLogger());
        if (m30416h != null) {
            c9513e.m31327d0(m30370i(m30416h));
        }
        c9513e.m31339p0(this.f36088h.m30408f());
        DisplayMetrics m30413e = C9313t0.m30413e(this.f36086f, this.f36087g.getLogger());
        if (m30413e != null) {
            c9513e.m31338o0(Integer.valueOf(m30413e.widthPixels));
            c9513e.m31337n0(Integer.valueOf(m30413e.heightPixels));
            c9513e.m31335l0(Float.valueOf(m30413e.density));
            c9513e.m31336m0(Integer.valueOf(m30413e.densityDpi));
        }
        if (c9513e.m31307J() == null) {
            c9513e.m31322Y(m30369h());
        }
        List<Integer> m30290c = C9283m.m30288a().m30290c();
        if (!m30290c.isEmpty()) {
            c9513e.m31334k0(Double.valueOf(((Integer) Collections.max(m30290c)).doubleValue()));
            c9513e.m31333j0(Integer.valueOf(m30290c.size()));
        }
        return c9513e;
    }

    /* renamed from: h */
    private String m30369h() {
        try {
            return C9229a1.m30148a(this.f36086f);
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    private Long m30370i(ActivityManager.MemoryInfo memoryInfo) {
        return this.f36088h.m30406d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: j */
    private C9519k m30371j() {
        C9519k c9519k = new C9519k();
        c9519k.m31391j("Android");
        c9519k.m31394m(Build.VERSION.RELEASE);
        c9519k.m31389h(Build.DISPLAY);
        try {
            c9519k.m31390i(C9313t0.m30415g(this.f36087g.getLogger()));
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting OperatingSystem.", th);
        }
        return c9519k;
    }

    /* renamed from: k */
    private boolean m30372k(Object obj) {
        if (obj instanceof InterfaceC9419b) {
            return "anr_background".equals(((InterfaceC9419b) obj).mo30104f());
        }
        return false;
    }

    /* renamed from: l */
    private void m30373l(AbstractC9342c4 abstractC9342c4) {
        String str;
        C9519k m31232c = abstractC9342c4.m30575C().m31232c();
        abstractC9342c4.m30575C().m31239k(m30371j());
        if (m31232c != null) {
            String m31388g = m31232c.m31388g();
            if (m31388g == null || m31388g.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + m31388g.trim().toLowerCase(Locale.ROOT);
            }
            abstractC9342c4.m30575C().put(str, m31232c);
        }
    }

    /* renamed from: m */
    private void m30374m(AbstractC9342c4 abstractC9342c4) {
        if (this.f36087g.isSendDefaultPii()) {
            if (abstractC9342c4.m30589Q() == null) {
                C9507a0 c9507a0 = new C9507a0();
                c9507a0.m31220o("{{auto}}");
                abstractC9342c4.m30603e0(c9507a0);
            } else if (abstractC9342c4.m30589Q().m31217l() == null) {
                abstractC9342c4.m30589Q().m31220o("{{auto}}");
            }
        }
        C9507a0 m30589Q = abstractC9342c4.m30589Q();
        if (m30589Q == null) {
            abstractC9342c4.m30603e0(m30367f());
        } else if (m30589Q.m31216k() == null) {
            m30589Q.m31219n(m30369h());
        }
    }

    /* renamed from: n */
    private void m30375n(AbstractC9342c4 abstractC9342c4, Object obj) {
        C9506a m31230a = abstractC9342c4.m30575C().m31230a();
        if (m31230a == null) {
            m31230a = new C9506a();
        }
        m31230a.m31198m(C9313t0.m30410b(this.f36086f, this.f36087g.getLogger()));
        m31230a.m31201p(Boolean.valueOf(!m30372k(obj)));
        PackageInfo m30418j = C9313t0.m30418j(this.f36086f, this.f36087g.getLogger(), this.f36088h);
        if (m30418j != null) {
            m31230a.m31197l(m30418j.packageName);
        }
        String m30582J = abstractC9342c4.m30582J() != null ? abstractC9342c4.m30582J() : (String) C9362s.m30646v(this.f36087g, "release.json", String.class);
        if (m30582J != null) {
            try {
                String substring = m30582J.substring(m30582J.indexOf(64) + 1, m30582J.indexOf(43));
                String substring2 = m30582J.substring(m30582J.indexOf(43) + 1);
                m31230a.m31200o(substring);
                m31230a.m31196k(substring2);
            } catch (Throwable unused) {
                this.f36087g.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to parse release from scope cache: %s", m30582J);
            }
        }
        abstractC9342c4.m30575C().m31235f(m31230a);
    }

    /* renamed from: o */
    private void m30376o(AbstractC9342c4 abstractC9342c4) {
        List list = (List) C9363t.m30670r(this.f36087g, "breadcrumbs.json", List.class, new C9624v0.a());
        if (list == null) {
            return;
        }
        if (abstractC9342c4.m30574B() == null) {
            abstractC9342c4.m30590R(new ArrayList(list));
        } else {
            abstractC9342c4.m30574B().addAll(list);
        }
    }

    /* renamed from: p */
    private void m30377p(AbstractC9342c4 abstractC9342c4) {
        C9510c c9510c = (C9510c) C9363t.m30669q(this.f36087g, "contexts.json", C9510c.class);
        if (c9510c == null) {
            return;
        }
        C9510c m30575C = abstractC9342c4.m30575C();
        for (Map.Entry<String, Object> entry : new C9510c(c9510c).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof C9403f5)) {
                if (!m30575C.containsKey(entry.getKey())) {
                    m30575C.put(entry.getKey(), value);
                }
            }
        }
    }

    /* renamed from: q */
    private void m30378q(AbstractC9342c4 abstractC9342c4) {
        C9512d m30576D = abstractC9342c4.m30576D();
        if (m30576D == null) {
            m30576D = new C9512d();
        }
        if (m30576D.m31268c() == null) {
            m30576D.m31269d(new ArrayList());
        }
        List<DebugImage> m31268c = m30576D.m31268c();
        if (m31268c != null) {
            String str = (String) C9362s.m30646v(this.f36087g, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                m31268c.add(debugImage);
            }
            abstractC9342c4.m30591S(m30576D);
        }
    }

    /* renamed from: r */
    private void m30379r(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30575C().m31231b() == null) {
            abstractC9342c4.m30575C().m31237i(m30368g());
        }
    }

    /* renamed from: s */
    private void m30380s(AbstractC9342c4 abstractC9342c4) {
        String str;
        if (abstractC9342c4.m30577E() == null) {
            abstractC9342c4.m30592T((String) C9362s.m30646v(this.f36087g, "dist.json", String.class));
        }
        if (abstractC9342c4.m30577E() != null || (str = (String) C9362s.m30646v(this.f36087g, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC9342c4.m30592T(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f36087g.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    /* renamed from: t */
    private void m30381t(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30578F() == null) {
            String str = (String) C9362s.m30646v(this.f36087g, "environment.json", String.class);
            if (str == null) {
                str = this.f36087g.getEnvironment();
            }
            abstractC9342c4.m30593U(str);
        }
    }

    /* renamed from: u */
    private void m30382u(C9473l4 c9473l4, Object obj) {
        C9517i c9517i = new C9517i();
        if (((InterfaceC9421d) obj).mo30109a()) {
            c9517i.m31372j("AppExitInfo");
        } else {
            c9517i.m31372j("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (m30372k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        C9531w m30366d = m30366d(c9473l4.m31004s0());
        if (m30366d == null) {
            m30366d = new C9531w();
            m30366d.m31529y(new C9530v());
        }
        c9473l4.m31009x0(this.f36089i.m31067e(m30366d, c9517i, applicationNotResponding));
    }

    /* renamed from: v */
    private void m30383v(AbstractC9342c4 abstractC9342c4) {
        Map map = (Map) C9363t.m30669q(this.f36087g, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9342c4.m30580H() == null) {
            abstractC9342c4.m30595W(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9342c4.m30580H().containsKey(entry.getKey())) {
                abstractC9342c4.m30580H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: w */
    private void m30384w(C9473l4 c9473l4) {
        List<String> list = (List) C9363t.m30669q(this.f36087g, "fingerprint.json", List.class);
        if (c9473l4.m31001p0() == null) {
            c9473l4.m31010y0(list);
        }
    }

    /* renamed from: x */
    private void m30385x(C9473l4 c9473l4) {
        EnumC9554s4 enumC9554s4 = (EnumC9554s4) C9363t.m30669q(this.f36087g, "level.json", EnumC9554s4.class);
        if (c9473l4.m31002q0() == null) {
            c9473l4.m31011z0(enumC9554s4);
        }
    }

    /* renamed from: y */
    private void m30386y(AbstractC9342c4 abstractC9342c4) {
        Map map = (Map) C9362s.m30646v(this.f36087g, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9342c4.m30586N() == null) {
            abstractC9342c4.m30602d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9342c4.m30586N().containsKey(entry.getKey())) {
                abstractC9342c4.m30601c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: z */
    private void m30387z(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30581I() == null) {
            abstractC9342c4.m30596X("java");
        }
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        Object m31780c = C9609m.m31780c(c9484n1);
        if (!(m31780c instanceof InterfaceC9421d)) {
            this.f36087g.getLogger().mo30214c(EnumC9554s4.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c9473l4;
        }
        m30382u(c9473l4, m31780c);
        m30387z(c9473l4);
        m30373l(c9473l4);
        m30379r(c9473l4);
        if (!((InterfaceC9421d) m31780c).mo30109a()) {
            this.f36087g.getLogger().mo30214c(EnumC9554s4.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c9473l4;
        }
        m30365c(c9473l4);
        m30364a(c9473l4, m31780c);
        m30360F(c9473l4);
        return c9473l4;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public /* synthetic */ C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        return C9456j1.m30876a(this, c9532x, c9484n1);
    }
}
