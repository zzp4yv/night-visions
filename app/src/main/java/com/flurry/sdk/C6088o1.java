package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.flurry.sdk.o1 */
/* loaded from: classes2.dex */
public final class C6088o1 {

    /* renamed from: a */
    private static C6088o1 f16201a;

    /* renamed from: b */
    private Application.ActivityLifecycleCallbacks f16202b;

    /* renamed from: c */
    final List<b> f16203c = new ArrayList();

    /* renamed from: com.flurry.sdk.o1$a */
    final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C5988d1.m13030c(3, "PerformanceMonitor", "onActivityPaused for activity: " + activity.toString());
            Iterator<b> it = C6088o1.this.f16203c.iterator();
            while (it.hasNext()) {
                it.next().mo13202a();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C5988d1.m13030c(3, "PerformanceMonitor", "onActivityResumed for activity: " + activity.toString());
            Iterator<b> it = C6088o1.this.f16203c.iterator();
            while (it.hasNext()) {
                it.next().mo13205d(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C5988d1.m13030c(3, "PerformanceMonitor", "onActivityStarted for activity: " + activity.toString());
            Iterator<b> it = C6088o1.this.f16203c.iterator();
            while (it.hasNext()) {
                it.next().mo13203b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C5988d1.m13030c(3, "PerformanceMonitor", "onActivityStopped for activity: " + activity.toString());
            Iterator<b> it = C6088o1.this.f16203c.iterator();
            while (it.hasNext()) {
                it.next().mo13204c(activity);
            }
        }
    }

    /* renamed from: com.flurry.sdk.o1$b */
    public interface b {
        /* renamed from: a */
        void mo13202a();

        /* renamed from: b */
        void mo13203b(Activity activity);

        /* renamed from: c */
        void mo13204c(Activity activity);

        /* renamed from: d */
        void mo13205d(Activity activity);
    }

    private C6088o1() {
    }

    /* renamed from: a */
    public static synchronized C6088o1 m13222a() {
        C6088o1 c6088o1;
        synchronized (C6088o1.class) {
            if (f16201a == null) {
                f16201a = new C6088o1();
            }
            c6088o1 = f16201a;
        }
        return c6088o1;
    }

    /* renamed from: b */
    public final void m13223b(Context context, Cursor cursor) {
        if (this.f16202b == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                if (context instanceof Application) {
                    C6079n1.m13193a().m13199b(applicationContext, cursor);
                }
                C6106q1.m13266a().m13268c();
                a aVar = new a();
                this.f16202b = aVar;
                ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar);
            }
        }
    }

    /* renamed from: c */
    public final void m13224c(b bVar) {
        synchronized (this.f16203c) {
            this.f16203c.add(bVar);
        }
    }
}
