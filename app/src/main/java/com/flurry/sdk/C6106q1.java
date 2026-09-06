package com.flurry.sdk;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.flurry.sdk.C6088o1;
import com.flurry.sdk.C6149v3;
import java.util.HashMap;
import java.util.Map;
import p241e.p252d.p253a.EnumC8745d;

/* renamed from: com.flurry.sdk.q1 */
/* loaded from: classes2.dex */
public final class C6106q1 {

    /* renamed from: a */
    private static C6106q1 f16277a;

    /* renamed from: b */
    private C6088o1.b f16278b;

    /* renamed from: c */
    C6070m1 f16279c;

    /* renamed from: e */
    public boolean f16281e = false;

    /* renamed from: f */
    long f16282f = 0;

    /* renamed from: g */
    long f16283g = 0;

    /* renamed from: h */
    int f16284h = 0;

    /* renamed from: i */
    boolean f16285i = false;

    /* renamed from: d */
    Map<String, C6070m1> f16280d = new HashMap();

    /* renamed from: com.flurry.sdk.q1$a */
    final class a implements C6088o1.b {

        /* renamed from: com.flurry.sdk.q1$a$a, reason: collision with other inner class name */
        final class ViewTreeObserverOnGlobalLayoutListenerC11425a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f */
            final /* synthetic */ Activity f16287f;

            ViewTreeObserverOnGlobalLayoutListenerC11425a(Activity activity) {
                this.f16287f = activity;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C6070m1 c6070m1;
                this.f16287f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C6106q1 c6106q1 = C6106q1.this;
                if (!c6106q1.f16281e || (c6070m1 = c6106q1.f16279c) == null) {
                    return;
                }
                double nanoTime = System.nanoTime() - C6106q1.this.f16282f;
                Double.isNaN(nanoTime);
                c6070m1.f16131h = (long) (nanoTime / 1000000.0d);
                C5988d1.m13030c(3, "ScreenTimeMonitor", "Start timed event for activity: " + C6106q1.this.f16279c.f16125b);
                C6070m1 c6070m12 = C6106q1.this.f16279c;
                if (c6070m12.f16129f) {
                    return;
                }
                C5988d1.m13030c(4, "ActivityScreenData", "Start timed activity event: " + c6070m12.f16125b);
                C5959a m12944v = C5959a.m12944v();
                String str = c6070m12.f16124a;
                C6149v3.a aVar = C6149v3.a.PERFORMANCE;
                String str2 = c6070m12.f16126c;
                if (str2 != null) {
                    c6070m12.f16128e.put("fl.previous.screen", str2);
                }
                c6070m12.f16128e.put("fl.current.screen", c6070m12.f16125b);
                c6070m12.f16128e.put("fl.resume.time", Long.toString(c6070m12.f16130g));
                c6070m12.f16128e.put("fl.layout.time", Long.toString(c6070m12.f16131h));
                Map<String, String> map = c6070m12.f16128e;
                if (C5980c2.m12991g(16)) {
                    m12944v.m12947t(str, aVar, map, true, true);
                } else {
                    EnumC8745d enumC8745d = EnumC8745d.kFlurryEventFailed;
                }
                c6070m12.f16129f = true;
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.C6088o1.b
        /* renamed from: a */
        public final void mo13202a() {
            C6106q1.this.f16282f = System.nanoTime();
        }

        @Override // com.flurry.sdk.C6088o1.b
        /* renamed from: b */
        public final void mo13203b(Activity activity) {
            C5988d1.m13030c(3, "ScreenTimeMonitor", "onActivityStarted for activity: " + activity.toString());
            C6106q1 c6106q1 = C6106q1.this;
            C6070m1 c6070m1 = c6106q1.f16279c;
            c6106q1.f16279c = new C6070m1(activity.getClass().getSimpleName(), c6070m1 == null ? null : c6070m1.f16125b);
            C6106q1.this.f16280d.put(activity.toString(), C6106q1.this.f16279c);
            C6106q1 c6106q12 = C6106q1.this;
            int i2 = c6106q12.f16284h + 1;
            c6106q12.f16284h = i2;
            if (i2 == 1 && !c6106q12.f16285i) {
                C5988d1.m13030c(3, "ScreenTimeMonitor", "onForeground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                C6106q1 c6106q13 = C6106q1.this;
                double d2 = nanoTime - c6106q13.f16283g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                c6106q13.f16283g = nanoTime;
                c6106q13.f16282f = nanoTime;
                if (c6106q13.f16281e) {
                    C6106q1.m13267b("fl.background.time", activity.getClass().getSimpleName(), j2);
                }
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11425a(activity));
        }

        @Override // com.flurry.sdk.C6088o1.b
        /* renamed from: c */
        public final void mo13204c(Activity activity) {
            C6070m1 remove = C6106q1.this.f16280d.remove(activity.toString());
            C6106q1.this.f16285i = activity.isChangingConfigurations();
            C6106q1 c6106q1 = C6106q1.this;
            int i2 = c6106q1.f16284h - 1;
            c6106q1.f16284h = i2;
            if (i2 == 0 && !c6106q1.f16285i) {
                C5988d1.m13030c(3, "ScreenTimeMonitor", "onBackground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                C6106q1 c6106q12 = C6106q1.this;
                double d2 = nanoTime - c6106q12.f16283g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                c6106q12.f16283g = nanoTime;
                if (c6106q12.f16281e) {
                    C6106q1.m13267b("fl.foreground.time", activity.getClass().getSimpleName(), j2);
                }
            }
            if (!C6106q1.this.f16281e || remove == null) {
                return;
            }
            C5988d1.m13030c(3, "ScreenTimeMonitor", "End timed event: " + remove.f16125b);
            if (remove.f16129f) {
                C5988d1.m13030c(4, "ActivityScreenData", "End timed activity event: " + remove.f16125b);
                C5959a m12944v = C5959a.m12944v();
                String str = remove.f16124a;
                C6149v3.a aVar = C6149v3.a.PERFORMANCE;
                double nanoTime2 = System.nanoTime() - remove.f16127d;
                Double.isNaN(nanoTime2);
                remove.f16128e.put("fl.duration", Long.toString((long) (nanoTime2 / 1000000.0d)));
                Map<String, String> map = remove.f16128e;
                if (C5980c2.m12991g(16)) {
                    m12944v.m12947t(str, aVar, map, true, false);
                } else {
                    EnumC8745d enumC8745d = EnumC8745d.kFlurryEventFailed;
                }
                remove.f16129f = false;
            }
        }

        @Override // com.flurry.sdk.C6088o1.b
        /* renamed from: d */
        public final void mo13205d(Activity activity) {
            C6070m1 c6070m1;
            C6106q1 c6106q1 = C6106q1.this;
            if (!c6106q1.f16281e || (c6070m1 = c6106q1.f16279c) == null) {
                return;
            }
            double nanoTime = System.nanoTime() - C6106q1.this.f16282f;
            Double.isNaN(nanoTime);
            c6070m1.f16130g = (long) (nanoTime / 1000000.0d);
        }
    }

    private C6106q1() {
    }

    /* renamed from: a */
    public static synchronized C6106q1 m13266a() {
        C6106q1 c6106q1;
        synchronized (C6106q1.class) {
            if (f16277a == null) {
                f16277a = new C6106q1();
            }
            c6106q1 = f16277a;
        }
        return c6106q1;
    }

    /* renamed from: b */
    static /* synthetic */ void m13267b(String str, String str2, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.current.screen", str2);
        hashMap.put(str, Long.toString(j2));
        C5959a.m12944v().m12946s("Flurry.ForegroundTime", C6149v3.a.PERFORMANCE, hashMap);
    }

    /* renamed from: c */
    public final void m13268c() {
        if (this.f16278b != null) {
            return;
        }
        C5988d1.m13030c(3, "ScreenTimeMonitor", "Register Screen Time metrics.");
        long nanoTime = System.nanoTime();
        this.f16283g = nanoTime;
        this.f16282f = nanoTime;
        this.f16278b = new a();
        C6088o1.m13222a().m13224c(this.f16278b);
    }
}
