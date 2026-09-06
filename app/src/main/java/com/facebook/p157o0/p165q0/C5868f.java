package com.facebook.p157o0.p165q0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C5608a0;
import com.facebook.EnumC5626g0;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.p158k0.C5802c;
import com.facebook.p157o0.p160m0.C5831i;
import com.facebook.p157o0.p163o0.C5855k;
import com.facebook.p157o0.p169u0.C5905h;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10742u;
import kotlin.jvm.internal.C9768m;

/* compiled from: ActivityLifecycleTracker.kt */
/* renamed from: com.facebook.o0.q0.f */
/* loaded from: classes2.dex */
public final class C5868f {

    /* renamed from: a */
    public static final C5868f f15358a = new C5868f();

    /* renamed from: b */
    private static final String f15359b;

    /* renamed from: c */
    private static final ScheduledExecutorService f15360c;

    /* renamed from: d */
    private static volatile ScheduledFuture<?> f15361d;

    /* renamed from: e */
    private static final Object f15362e;

    /* renamed from: f */
    private static final AtomicInteger f15363f;

    /* renamed from: g */
    private static volatile C5875m f15364g;

    /* renamed from: h */
    private static final AtomicBoolean f15365h;

    /* renamed from: i */
    private static String f15366i;

    /* renamed from: j */
    private static long f15367j;

    /* renamed from: k */
    private static int f15368k;

    /* renamed from: l */
    private static WeakReference<Activity> f15369l;

    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: com.facebook.o0.q0.f$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9768m.m32346f(activity, "activity");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityCreated");
            C5869g c5869g = C5869g.f15370a;
            C5869g.m12624a();
            C5868f c5868f = C5868f.f15358a;
            C5868f.m12614p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C9768m.m32346f(activity, "activity");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityDestroyed");
            C5868f.f15358a.m12616r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9768m.m32346f(activity, "activity");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityPaused");
            C5869g c5869g = C5869g.f15370a;
            C5869g.m12624a();
            C5868f.f15358a.m12617s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C9768m.m32346f(activity, "activity");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityResumed");
            C5869g c5869g = C5869g.f15370a;
            C5869g.m12624a();
            C5868f c5868f = C5868f.f15358a;
            C5868f.m12620v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C9768m.m32346f(activity, "activity");
            C9768m.m32346f(bundle, "outState");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9768m.m32346f(activity, "activity");
            C5868f c5868f = C5868f.f15358a;
            C5868f.f15368k++;
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9768m.m32346f(activity, "activity");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5868f.f15359b, "onActivityStopped");
            C5780a0.f14908a.m12174h();
            C5868f c5868f = C5868f.f15358a;
            C5868f.f15368k--;
        }
    }

    static {
        String canonicalName = C5868f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f15359b = canonicalName;
        f15360c = Executors.newSingleThreadScheduledExecutor();
        f15362e = new Object();
        f15363f = new AtomicInteger(0);
        f15365h = new AtomicBoolean(false);
    }

    private C5868f() {
    }

    /* renamed from: f */
    private final void m12604f() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f15362e) {
            if (f15361d != null && (scheduledFuture = f15361d) != null) {
                scheduledFuture.cancel(false);
            }
            f15361d = null;
            C10742u c10742u = C10742u.f41439a;
        }
    }

    /* renamed from: g */
    public static final Activity m12605g() {
        WeakReference<Activity> weakReference = f15369l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: h */
    public static final UUID m12606h() {
        C5875m c5875m;
        if (f15364g == null || (c5875m = f15364g) == null) {
            return null;
        }
        return c5875m.m12653d();
    }

    /* renamed from: i */
    private final int m12607i() {
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5637c0 m11417c = C5639d0.m11417c(C5608a0.m11285d());
        if (m11417c != null) {
            return m11417c.m11407k();
        }
        C5872j c5872j = C5872j.f15382a;
        return C5872j.m12642a();
    }

    /* renamed from: j */
    public static final boolean m12608j() {
        return f15368k == 0;
    }

    /* renamed from: p */
    public static final void m12614p(Activity activity) {
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.c
            @Override // java.lang.Runnable
            public final void run() {
                C5868f.m12615q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m12615q() {
        if (f15364g == null) {
            f15364g = C5875m.f15393a.m12664b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m12616r(Activity activity) {
        C5831i c5831i = C5831i.f15174a;
        C5831i.m12388j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m12617s(Activity activity) {
        AtomicInteger atomicInteger = f15363f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f15359b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m12604f();
        final long currentTimeMillis = System.currentTimeMillis();
        C5663p0 c5663p0 = C5663p0.f14478a;
        final String m11590r = C5663p0.m11590r(activity);
        C5831i c5831i = C5831i.f15174a;
        C5831i.m12389k(activity);
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5868f.m12618t(currentTimeMillis, m11590r);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m12618t(final long j2, final String str) {
        C9768m.m32346f(str, "$activityName");
        if (f15364g == null) {
            f15364g = new C5875m(Long.valueOf(j2), null, null, 4, null);
        }
        C5875m c5875m = f15364g;
        if (c5875m != null) {
            c5875m.m12660k(Long.valueOf(j2));
        }
        if (f15363f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: com.facebook.o0.q0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C5868f.m12619u(j2, str);
                }
            };
            synchronized (f15362e) {
                f15361d = f15360c.schedule(runnable, f15358a.m12607i(), TimeUnit.SECONDS);
                C10742u c10742u = C10742u.f41439a;
            }
        }
        long j3 = f15367j;
        long j4 = j3 > 0 ? (j2 - j3) / 1000 : 0L;
        C5871i c5871i = C5871i.f15376a;
        C5871i.m12637e(str, j4);
        C5875m c5875m2 = f15364g;
        if (c5875m2 == null) {
            return;
        }
        c5875m2.m12662m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m12619u(long j2, String str) {
        C9768m.m32346f(str, "$activityName");
        if (f15364g == null) {
            f15364g = new C5875m(Long.valueOf(j2), null, null, 4, null);
        }
        if (f15363f.get() <= 0) {
            C5876n c5876n = C5876n.f15400a;
            C5876n.m12669e(str, f15364g, f15366i);
            C5875m.f15393a.m12663a();
            f15364g = null;
        }
        synchronized (f15362e) {
            f15361d = null;
            C10742u c10742u = C10742u.f41439a;
        }
    }

    /* renamed from: v */
    public static final void m12620v(Activity activity) {
        C9768m.m32346f(activity, "activity");
        C5868f c5868f = f15358a;
        f15369l = new WeakReference<>(activity);
        f15363f.incrementAndGet();
        c5868f.m12604f();
        final long currentTimeMillis = System.currentTimeMillis();
        f15367j = currentTimeMillis;
        C5663p0 c5663p0 = C5663p0.f14478a;
        final String m11590r = C5663p0.m11590r(activity);
        C5831i c5831i = C5831i.f15174a;
        C5831i.m12390l(activity);
        C5802c c5802c = C5802c.f14978a;
        C5802c.m12274d(activity);
        C5905h c5905h = C5905h.f15513a;
        C5905h.m12807h(activity);
        C5855k c5855k = C5855k.f15323a;
        C5855k.m12565b();
        final Context applicationContext = activity.getApplicationContext();
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5868f.m12621w(currentTimeMillis, m11590r, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m12621w(long j2, String str, Context context) {
        C5875m c5875m;
        C9768m.m32346f(str, "$activityName");
        C5875m c5875m2 = f15364g;
        Long m12654e = c5875m2 == null ? null : c5875m2.m12654e();
        if (f15364g == null) {
            f15364g = new C5875m(Long.valueOf(j2), null, null, 4, null);
            C5876n c5876n = C5876n.f15400a;
            String str2 = f15366i;
            C9768m.m32345e(context, "appContext");
            C5876n.m12667c(str, null, str2, context);
        } else if (m12654e != null) {
            long longValue = j2 - m12654e.longValue();
            if (longValue > f15358a.m12607i() * 1000) {
                C5876n c5876n2 = C5876n.f15400a;
                C5876n.m12669e(str, f15364g, f15366i);
                String str3 = f15366i;
                C9768m.m32345e(context, "appContext");
                C5876n.m12667c(str, null, str3, context);
                f15364g = new C5875m(Long.valueOf(j2), null, null, 4, null);
            } else if (longValue > 1000 && (c5875m = f15364g) != null) {
                c5875m.m12657h();
            }
        }
        C5875m c5875m3 = f15364g;
        if (c5875m3 != null) {
            c5875m3.m12660k(Long.valueOf(j2));
        }
        C5875m c5875m4 = f15364g;
        if (c5875m4 == null) {
            return;
        }
        c5875m4.m12662m();
    }

    /* renamed from: x */
    public static final void m12622x(Application application, String str) {
        C9768m.m32346f(application, "application");
        if (f15365h.compareAndSet(false, true)) {
            C5633a0 c5633a0 = C5633a0.f14313a;
            C5633a0.m11372a(C5633a0.b.CodelessEvents, new C5633a0.a() { // from class: com.facebook.o0.q0.d
                @Override // com.facebook.internal.C5633a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5868f.m12623y(z);
                }
            });
            f15366i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m12623y(boolean z) {
        if (z) {
            C5831i c5831i = C5831i.f15174a;
            C5831i.m12382d();
        } else {
            C5831i c5831i2 = C5831i.f15174a;
            C5831i.m12381c();
        }
    }
}
