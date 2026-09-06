package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC9402f4;
import io.sentry.C9214a4;
import io.sentry.C9439i3;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9279i;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: SentryAndroid.java */
/* renamed from: io.sentry.android.core.g1 */
/* loaded from: classes2.dex */
public final class C9249g1 {

    /* renamed from: a */
    private static final AbstractC9402f4 f35918a = C9251h0.m30209a();

    /* renamed from: b */
    private static final long f35919b = SystemClock.uptimeMillis();

    /* renamed from: a */
    private static void m30204a(C9647x4 c9647x4, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : c9647x4.getIntegrations()) {
            if (z && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z2 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
                c9647x4.getIntegrations().remove((Integration) arrayList2.get(i2));
            }
        }
        if (arrayList.size() > 1) {
            for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
                c9647x4.getIntegrations().remove((Integration) arrayList.get(i3));
            }
        }
    }

    /* renamed from: b */
    public static void m30205b(Context context, InterfaceC9637w1 interfaceC9637w1) {
        m30206c(context, interfaceC9637w1, new C9214a4.a() { // from class: io.sentry.android.core.c0
            @Override // io.sentry.C9214a4.a
            /* renamed from: a */
            public final void mo8271a(C9647x4 c9647x4) {
                C9249g1.m30207d((SentryAndroidOptions) c9647x4);
            }
        });
    }

    /* renamed from: c */
    public static synchronized void m30206c(final Context context, final InterfaceC9637w1 interfaceC9637w1, final C9214a4.a<SentryAndroidOptions> aVar) {
        synchronized (C9249g1.class) {
            C9307q0.m30389e().m30397i(f35919b, f35918a);
            try {
                try {
                    C9214a4.m30041k(C9439i3.m30847a(SentryAndroidOptions.class), new C9214a4.a() { // from class: io.sentry.android.core.b0
                        @Override // io.sentry.C9214a4.a
                        /* renamed from: a */
                        public final void mo8271a(C9647x4 c9647x4) {
                            C9249g1.m30208e(InterfaceC9637w1.this, context, aVar, (SentryAndroidOptions) c9647x4);
                        }
                    }, true);
                    InterfaceC9625v1 m30040j = C9214a4.m30040j();
                    if (m30040j.mo31156q().isEnableAutoSessionTracking() && C9313t0.m30421m(context)) {
                        m30040j.mo31148i(C9279i.m30278a("session.start"));
                        m30040j.startSession();
                    }
                } catch (InstantiationException e2) {
                    interfaceC9637w1.mo30213b(EnumC9554s4.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                } catch (InvocationTargetException e3) {
                    interfaceC9637w1.mo30213b(EnumC9554s4.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
                }
            } catch (IllegalAccessException e4) {
                interfaceC9637w1.mo30213b(EnumC9554s4.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            } catch (NoSuchMethodException e5) {
                interfaceC9637w1.mo30213b(EnumC9554s4.FATAL, "Fatal error during SentryAndroid.init(...)", e5);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e5);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m30207d(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* renamed from: e */
    static /* synthetic */ void m30208e(InterfaceC9637w1 interfaceC9637w1, Context context, C9214a4.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        C9232b1 c9232b1 = new C9232b1();
        boolean m30152b = c9232b1.m30152b("timber.log.Timber", sentryAndroidOptions);
        boolean z = c9232b1.m30152b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && c9232b1.m30152b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions);
        boolean z2 = m30152b && c9232b1.m30152b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        C9311s0 c9311s0 = new C9311s0(interfaceC9637w1);
        C9232b1 c9232b12 = new C9232b1();
        C9245f0 c9245f0 = new C9245f0(c9232b12, sentryAndroidOptions);
        C9295k0.m30333i(sentryAndroidOptions, context, interfaceC9637w1, c9311s0);
        C9295k0.m30328d(context, sentryAndroidOptions, c9311s0, c9232b12, c9245f0, z, z2);
        aVar.mo8271a(sentryAndroidOptions);
        C9295k0.m30327c(sentryAndroidOptions, context, c9311s0, c9232b12, c9245f0);
        m30204a(sentryAndroidOptions, z, z2);
    }
}
