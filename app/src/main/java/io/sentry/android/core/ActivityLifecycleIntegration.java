package io.sentry.android.core;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.AbstractC9402f4;
import io.sentry.C9387d3;
import io.sentry.C9438i2;
import io.sentry.C9477m1;
import io.sentry.C9484n1;
import io.sentry.C9548r5;
import io.sentry.C9553s3;
import io.sentry.C9562t5;
import io.sentry.C9624v0;
import io.sentry.C9647x4;
import io.sentry.EnumC9414h2;
import io.sentry.EnumC9460j5;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9386d2;
import io.sentry.InterfaceC9393e2;
import io.sentry.InterfaceC9555s5;
import io.sentry.InterfaceC9560t3;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9626v2;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9280j;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC9286p;
import io.sentry.protocol.EnumC9534z;
import io.sentry.util.C9613q;
import io.sentry.util.C9622v;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.VisibleForTesting;

/* loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f35751f;

    /* renamed from: g */
    private final C9311s0 f35752g;

    /* renamed from: h */
    private InterfaceC9625v1 f35753h;

    /* renamed from: i */
    private SentryAndroidOptions f35754i;

    /* renamed from: l */
    private boolean f35757l;

    /* renamed from: n */
    private final boolean f35759n;

    /* renamed from: p */
    private InterfaceC9386d2 f35761p;

    /* renamed from: w */
    private final C9245f0 f35768w;

    /* renamed from: j */
    private boolean f35755j = false;

    /* renamed from: k */
    private boolean f35756k = false;

    /* renamed from: m */
    private boolean f35758m = false;

    /* renamed from: o */
    private C9477m1 f35760o = null;

    /* renamed from: q */
    private final WeakHashMap<Activity, InterfaceC9386d2> f35762q = new WeakHashMap<>();

    /* renamed from: r */
    private final WeakHashMap<Activity, InterfaceC9386d2> f35763r = new WeakHashMap<>();

    /* renamed from: s */
    private AbstractC9402f4 f35764s = C9251h0.m30209a();

    /* renamed from: t */
    private final Handler f35765t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private Future<?> f35766u = null;

    /* renamed from: v */
    private final WeakHashMap<Activity, InterfaceC9393e2> f35767v = new WeakHashMap<>();

    public ActivityLifecycleIntegration(Application application, C9311s0 c9311s0, C9245f0 c9245f0) {
        Application application2 = (Application) C9613q.m31802c(application, "Application is required");
        this.f35751f = application2;
        this.f35752g = (C9311s0) C9613q.m31802c(c9311s0, "BuildInfoProvider is required");
        this.f35768w = (C9245f0) C9613q.m31802c(c9245f0, "ActivityFramesTracker is required");
        if (c9311s0.m30406d() >= 29) {
            this.f35757l = true;
        }
        this.f35759n = C9313t0.m30421m(application2);
    }

    /* renamed from: A */
    private String m30056A(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* renamed from: B */
    private String m30057B(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    /* renamed from: D */
    private String m30058D(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m30093m0(InterfaceC9386d2 interfaceC9386d2, InterfaceC9386d2 interfaceC9386d22) {
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions == null || interfaceC9386d22 == null) {
            m30080m(interfaceC9386d22);
            return;
        }
        AbstractC9402f4 mo30210a = sentryAndroidOptions.getDateProvider().mo30210a();
        long millis = TimeUnit.NANOSECONDS.toMillis(mo30210a.mo30788k(interfaceC9386d22.mo30531q()));
        Long valueOf = Long.valueOf(millis);
        InterfaceC9626v2.a aVar = InterfaceC9626v2.a.MILLISECOND;
        interfaceC9386d22.mo30522h("time_to_initial_display", valueOf, aVar);
        if (interfaceC9386d2 != null && interfaceC9386d2.mo30516b()) {
            interfaceC9386d2.mo30517c(mo30210a);
            interfaceC9386d22.mo30522h("time_to_full_display", Long.valueOf(millis), aVar);
        }
        m30082p(interfaceC9386d22, mo30210a);
    }

    /* renamed from: F0 */
    private void m30060F0(Bundle bundle) {
        if (this.f35758m) {
            return;
        }
        C9307q0.m30389e().m30398j(bundle == null);
    }

    /* renamed from: G0 */
    private void m30061G0(InterfaceC9386d2 interfaceC9386d2) {
        if (interfaceC9386d2 != null) {
            interfaceC9386d2.mo30527m().m30805m("auto.ui.activity");
        }
    }

    /* renamed from: H */
    private String m30062H(InterfaceC9386d2 interfaceC9386d2) {
        String description = interfaceC9386d2.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return interfaceC9386d2.getDescription() + " - Deadline Exceeded";
    }

    /* renamed from: I */
    private String m30063I(String str) {
        return str + " full display";
    }

    /* renamed from: J */
    private String m30064J(String str) {
        return str + " initial display";
    }

    /* renamed from: J0 */
    private void m30065J0(Activity activity) {
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f35753h == null || m30069N(activity)) {
            return;
        }
        boolean z = this.f35755j;
        if (!z) {
            this.f35767v.put(activity, C9387d3.m30717r());
            C9622v.m31827e(this.f35753h);
            return;
        }
        if (z) {
            m30067K0();
            final String m30056A = m30056A(activity);
            AbstractC9402f4 m30393d = this.f35759n ? C9307q0.m30389e().m30393d() : null;
            Boolean m30394f = C9307q0.m30389e().m30394f();
            C9562t5 c9562t5 = new C9562t5();
            if (this.f35754i.isEnableActivityLifecycleTracingAutoFinish()) {
                c9562t5.m31656k(this.f35754i.getIdleTimeout());
                c9562t5.m30858d(true);
            }
            c9562t5.m31659n(true);
            c9562t5.m31658m(new InterfaceC9555s5() { // from class: io.sentry.android.core.p
                @Override // io.sentry.InterfaceC9555s5
                /* renamed from: a */
                public final void mo30354a(InterfaceC9393e2 interfaceC9393e2) {
                    ActivityLifecycleIntegration.this.m30094p0(weakReference, m30056A, interfaceC9393e2);
                }
            });
            AbstractC9402f4 abstractC9402f4 = (this.f35758m || m30393d == null || m30394f == null) ? this.f35764s : m30393d;
            c9562t5.m31657l(abstractC9402f4);
            final InterfaceC9393e2 mo31151l = this.f35753h.mo31151l(new C9548r5(m30056A, EnumC9534z.COMPONENT, "ui.load"), c9562t5);
            m30061G0(mo31151l);
            if (!this.f35758m && m30393d != null && m30394f != null) {
                InterfaceC9386d2 mo30520f = mo31151l.mo30520f(m30058D(m30394f.booleanValue()), m30057B(m30394f.booleanValue()), m30393d, EnumC9414h2.SENTRY);
                this.f35761p = mo30520f;
                m30061G0(mo30520f);
                m30078k();
            }
            String m30064J = m30064J(m30056A);
            EnumC9414h2 enumC9414h2 = EnumC9414h2.SENTRY;
            final InterfaceC9386d2 mo30520f2 = mo31151l.mo30520f("ui.load.initial_display", m30064J, abstractC9402f4, enumC9414h2);
            this.f35762q.put(activity, mo30520f2);
            m30061G0(mo30520f2);
            if (this.f35756k && this.f35760o != null && this.f35754i != null) {
                final InterfaceC9386d2 mo30520f3 = mo31151l.mo30520f("ui.load.full_display", m30063I(m30056A), abstractC9402f4, enumC9414h2);
                m30061G0(mo30520f3);
                try {
                    this.f35763r.put(activity, mo30520f3);
                    this.f35766u = this.f35754i.getExecutorService().mo30030b(new Runnable() { // from class: io.sentry.android.core.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.m30095t0(mo30520f3, mo30520f2);
                        }
                    }, 30000L);
                } catch (RejectedExecutionException e2) {
                    this.f35754i.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e2);
                }
            }
            this.f35753h.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.android.core.j
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    ActivityLifecycleIntegration.this.m30096y0(mo31151l, c9553s3);
                }
            });
            this.f35767v.put(activity, mo31151l);
        }
    }

    /* renamed from: K */
    private boolean m30066K(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    /* renamed from: K0 */
    private void m30067K0() {
        for (Map.Entry<Activity, InterfaceC9393e2> entry : this.f35767v.entrySet()) {
            m30087z(entry.getValue(), this.f35762q.get(entry.getKey()), this.f35763r.get(entry.getKey()));
        }
    }

    /* renamed from: M0 */
    private void m30068M0(Activity activity, boolean z) {
        if (this.f35755j && z) {
            m30087z(this.f35767v.get(activity), null, null);
        }
    }

    /* renamed from: N */
    private boolean m30069N(Activity activity) {
        return this.f35767v.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30088T(C9553s3 c9553s3, InterfaceC9393e2 interfaceC9393e2, InterfaceC9393e2 interfaceC9393e22) {
        if (interfaceC9393e22 == null) {
            c9553s3.m31613z(interfaceC9393e2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC9393e2.getName());
        }
    }

    /* renamed from: W */
    static /* synthetic */ void m30071W(InterfaceC9393e2 interfaceC9393e2, C9553s3 c9553s3, InterfaceC9393e2 interfaceC9393e22) {
        if (interfaceC9393e22 == interfaceC9393e2) {
            c9553s3.m31594e();
        }
    }

    /* renamed from: b */
    private void m30074b(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions == null || this.f35753h == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        C9624v0 c9624v0 = new C9624v0();
        c9624v0.m31844p("navigation");
        c9624v0.m31841m("state", str);
        c9624v0.m31841m("screen", m30056A(activity));
        c9624v0.m31840l("ui.lifecycle");
        c9624v0.m31842n(EnumC9554s4.INFO);
        C9484n1 c9484n1 = new C9484n1();
        c9484n1.m31079j("android:activity", activity);
        this.f35753h.mo31153n(c9624v0, c9484n1);
    }

    /* renamed from: f */
    private void m30076f() {
        Future<?> future = this.f35766u;
        if (future != null) {
            future.cancel(false);
            this.f35766u = null;
        }
    }

    /* renamed from: k */
    private void m30078k() {
        AbstractC9402f4 m30390a = C9307q0.m30389e().m30390a();
        if (!this.f35755j || m30390a == null) {
            return;
        }
        m30082p(this.f35761p, m30390a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m30095t0(InterfaceC9386d2 interfaceC9386d2, InterfaceC9386d2 interfaceC9386d22) {
        if (interfaceC9386d2 == null || interfaceC9386d2.mo30516b()) {
            return;
        }
        interfaceC9386d2.mo30524j(m30062H(interfaceC9386d2));
        AbstractC9402f4 mo30528n = interfaceC9386d22 != null ? interfaceC9386d22.mo30528n() : null;
        if (mo30528n == null) {
            mo30528n = interfaceC9386d2.mo30531q();
        }
        m30084x(interfaceC9386d2, mo30528n, EnumC9460j5.DEADLINE_EXCEEDED);
    }

    /* renamed from: m */
    private void m30080m(InterfaceC9386d2 interfaceC9386d2) {
        if (interfaceC9386d2 == null || interfaceC9386d2.mo30516b()) {
            return;
        }
        interfaceC9386d2.mo30521g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30094p0(WeakReference weakReference, String str, InterfaceC9393e2 interfaceC9393e2) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.f35768w.m30194n(activity, interfaceC9393e2.mo30525k());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    /* renamed from: p */
    private void m30082p(InterfaceC9386d2 interfaceC9386d2, AbstractC9402f4 abstractC9402f4) {
        m30084x(interfaceC9386d2, abstractC9402f4, null);
    }

    /* renamed from: x */
    private void m30084x(InterfaceC9386d2 interfaceC9386d2, AbstractC9402f4 abstractC9402f4, EnumC9460j5 enumC9460j5) {
        if (interfaceC9386d2 == null || interfaceC9386d2.mo30516b()) {
            return;
        }
        if (enumC9460j5 == null) {
            enumC9460j5 = interfaceC9386d2.getStatus() != null ? interfaceC9386d2.getStatus() : EnumC9460j5.OK;
        }
        interfaceC9386d2.mo30529o(enumC9460j5, abstractC9402f4);
    }

    /* renamed from: y */
    private void m30086y(InterfaceC9386d2 interfaceC9386d2, EnumC9460j5 enumC9460j5) {
        if (interfaceC9386d2 == null || interfaceC9386d2.mo30516b()) {
            return;
        }
        interfaceC9386d2.mo30518d(enumC9460j5);
    }

    /* renamed from: z */
    private void m30087z(final InterfaceC9393e2 interfaceC9393e2, InterfaceC9386d2 interfaceC9386d2, InterfaceC9386d2 interfaceC9386d22) {
        if (interfaceC9393e2 == null || interfaceC9393e2.mo30516b()) {
            return;
        }
        m30086y(interfaceC9386d2, EnumC9460j5.DEADLINE_EXCEEDED);
        m30083q0(interfaceC9386d22, interfaceC9386d2);
        m30076f();
        EnumC9460j5 status = interfaceC9393e2.getStatus();
        if (status == null) {
            status = EnumC9460j5.OK;
        }
        interfaceC9393e2.mo30518d(status);
        InterfaceC9625v1 interfaceC9625v1 = this.f35753h;
        if (interfaceC9625v1 != null) {
            interfaceC9625v1.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.android.core.o
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    ActivityLifecycleIntegration.this.m30089Z(interfaceC9393e2, c9553s3);
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        this.f35754i = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35753h = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required");
        InterfaceC9637w1 logger = this.f35754i.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f35754i.isEnableActivityLifecycleBreadcrumbs()));
        this.f35755j = m30066K(this.f35754i);
        this.f35760o = this.f35754i.getFullyDisplayedReporter();
        this.f35756k = this.f35754i.isEnableTimeToFullDisplayTracing();
        this.f35751f.registerActivityLifecycleCallbacks(this);
        this.f35754i.getLogger().mo30214c(enumC9554s4, "ActivityLifecycleIntegration installed.", new Object[0]);
        mo30003a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35751f.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f35768w.m30195p();
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m30096y0(final C9553s3 c9553s3, final InterfaceC9393e2 interfaceC9393e2) {
        c9553s3.m31589D(new C9553s3.c() { // from class: io.sentry.android.core.g
            @Override // io.sentry.C9553s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9393e2 interfaceC9393e22) {
                ActivityLifecycleIntegration.this.m30088T(c9553s3, interfaceC9393e2, interfaceC9393e22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m30089Z(final C9553s3 c9553s3, final InterfaceC9393e2 interfaceC9393e2) {
        c9553s3.m31589D(new C9553s3.c() { // from class: io.sentry.android.core.i
            @Override // io.sentry.C9553s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9393e2 interfaceC9393e22) {
                ActivityLifecycleIntegration.m30071W(InterfaceC9393e2.this, c9553s3, interfaceC9393e22);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m30060F0(bundle);
        m30074b(activity, "created");
        if (this.f35753h != null) {
            final String m30279a = C9280j.m30279a(activity);
            this.f35753h.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.android.core.m
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    c9553s3.m31612y(m30279a);
                }
            });
        }
        m30065J0(activity);
        final InterfaceC9386d2 interfaceC9386d2 = this.f35763r.get(activity);
        this.f35758m = true;
        C9477m1 c9477m1 = this.f35760o;
        if (c9477m1 != null) {
            c9477m1.m31015b(new C9477m1.a() { // from class: io.sentry.android.core.l
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        if (this.f35755j || this.f35754i.isEnableActivityLifecycleBreadcrumbs()) {
            m30074b(activity, "destroyed");
            m30086y(this.f35761p, EnumC9460j5.CANCELLED);
            InterfaceC9386d2 interfaceC9386d2 = this.f35762q.get(activity);
            InterfaceC9386d2 interfaceC9386d22 = this.f35763r.get(activity);
            m30086y(interfaceC9386d2, EnumC9460j5.DEADLINE_EXCEEDED);
            m30083q0(interfaceC9386d22, interfaceC9386d2);
            m30076f();
            m30068M0(activity, true);
            this.f35761p = null;
            this.f35762q.remove(activity);
            this.f35763r.remove(activity);
        }
        this.f35767v.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        if (!this.f35757l) {
            InterfaceC9625v1 interfaceC9625v1 = this.f35753h;
            if (interfaceC9625v1 == null) {
                this.f35764s = C9251h0.m30209a();
            } else {
                this.f35764s = interfaceC9625v1.mo31156q().getDateProvider().mo30210a();
            }
        }
        m30074b(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.f35757l) {
            InterfaceC9625v1 interfaceC9625v1 = this.f35753h;
            if (interfaceC9625v1 == null) {
                this.f35764s = C9251h0.m30209a();
            } else {
                this.f35764s = interfaceC9625v1.mo31156q().getDateProvider().mo30210a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"NewApi"})
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f35755j) {
            AbstractC9402f4 m30393d = C9307q0.m30389e().m30393d();
            AbstractC9402f4 m30390a = C9307q0.m30389e().m30390a();
            if (m30393d != null && m30390a == null) {
                C9307q0.m30389e().m30395g();
            }
            m30078k();
            final InterfaceC9386d2 interfaceC9386d2 = this.f35762q.get(activity);
            final InterfaceC9386d2 interfaceC9386d22 = this.f35763r.get(activity);
            View findViewById = activity.findViewById(R.id.content);
            if (this.f35752g.m30406d() < 16 || findViewById == null) {
                this.f35765t.post(new Runnable() { // from class: io.sentry.android.core.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.m30093m0(interfaceC9386d22, interfaceC9386d2);
                    }
                });
            } else {
                ViewTreeObserverOnDrawListenerC9286p.m30296e(findViewById, new Runnable() { // from class: io.sentry.android.core.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.m30091f0(interfaceC9386d22, interfaceC9386d2);
                    }
                }, this.f35752g);
            }
        }
        m30074b(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m30074b(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (this.f35755j) {
            this.f35768w.m30188a(activity);
        }
        m30074b(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        m30074b(activity, "stopped");
    }
}
