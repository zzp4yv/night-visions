package com.facebook.internal.p148t0.p149l;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.C5608a0;
import com.facebook.internal.p148t0.C5680i;
import com.facebook.internal.p148t0.C5682k;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: ANRDetector.kt */
/* renamed from: com.facebook.internal.t0.l.d */
/* loaded from: classes2.dex */
public final class C5686d {

    /* renamed from: a */
    public static final C5686d f14594a = new C5686d();

    /* renamed from: b */
    private static final int f14595b = Process.myUid();

    /* renamed from: c */
    private static final ScheduledExecutorService f14596c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d */
    private static String f14597d = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: e */
    private static final Runnable f14598e = new Runnable() { // from class: com.facebook.internal.t0.l.a
        @Override // java.lang.Runnable
        public final void run() {
            C5686d.m11762a();
        }
    };

    private C5686d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m11762a() {
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            Object systemService = C5608a0.m11284c().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            m11763b((ActivityManager) systemService);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final void m11763b(ActivityManager activityManager) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return;
        }
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f14595b) {
                Thread thread = Looper.getMainLooper().getThread();
                C9768m.m32345e(thread, "getMainLooper().thread");
                C5682k c5682k = C5682k.f14590a;
                String m11745d = C5682k.m11745d(thread);
                if (!C9768m.m32341a(m11745d, f14597d) && C5682k.m11749h(thread)) {
                    f14597d = m11745d;
                    C5680i.a aVar = C5680i.a.f14579a;
                    C5680i.a.m11727a(processErrorStateInfo.shortMsg, m11745d).m11726g();
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m11765d() {
        f14596c.scheduleWithFixedDelay(f14598e, 0L, 500, TimeUnit.MILLISECONDS);
    }
}
