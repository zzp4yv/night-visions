package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C9332b1;
import io.sentry.C9339c1;
import io.sentry.C9652y3;
import io.sentry.C9658z3;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9627v3;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.cache.C9237b;
import io.sentry.android.core.internal.debugmeta.C9255a;
import io.sentry.android.core.internal.gestures.C9260e;
import io.sentry.android.core.internal.modules.C9267a;
import io.sentry.android.core.internal.util.C9278h;
import io.sentry.android.core.internal.util.C9290t;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.C9362s;
import io.sentry.cache.C9363t;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.transport.C9583t;
import io.sentry.util.C9611o;
import io.sentry.util.C9613q;
import java.io.File;
import java.util.ArrayList;

/* compiled from: AndroidOptionsInitializer.java */
/* renamed from: io.sentry.android.core.k0 */
/* loaded from: classes2.dex */
final class C9295k0 {
    /* renamed from: a */
    private static String m30325a(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    /* renamed from: b */
    private static void m30326b(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    /* renamed from: c */
    static void m30327c(SentryAndroidOptions sentryAndroidOptions, Context context, C9311s0 c9311s0, C9232b1 c9232b1, C9245f0 c9245f0) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C9583t)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C9237b(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C9332b1(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9317v0(context, c9311s0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9246f1(sentryAndroidOptions, c9245f0));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c9311s0));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9305p0(context, sentryAndroidOptions, c9311s0));
        sentryAndroidOptions.setTransportGate(new C9301n0(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new C9299m0(context, sentryAndroidOptions, c9311s0, new C9290t(context, sentryAndroidOptions, c9311s0)));
        sentryAndroidOptions.setModulesLoader(new C9267a(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new C9255a(context, sentryAndroidOptions.getLogger()));
        boolean m30152b = c9232b1.m30152b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean m30152b2 = c9232b1.m30152b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C9260e(m30152b));
            if (m30152b2 && c9232b1.m30152b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && m30152b2 && c9232b1.m30152b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(C9278h.m30273e());
        if (sentryAndroidOptions.getCollectors().isEmpty()) {
            sentryAndroidOptions.addCollector(new C9293j0());
            sentryAndroidOptions.addCollector(new C9248g0(sentryAndroidOptions.getLogger(), c9311s0));
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C9339c1(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new C9363t(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new C9362s(sentryAndroidOptions));
        }
    }

    /* renamed from: d */
    static void m30328d(Context context, final SentryAndroidOptions sentryAndroidOptions, C9311s0 c9311s0, C9232b1 c9232b1, C9245f0 c9245f0, boolean z, boolean z2) {
        C9611o c9611o = new C9611o(new C9611o.a() { // from class: io.sentry.android.core.s
            @Override // io.sentry.util.C9611o.a
            /* renamed from: a */
            public final Object mo30402a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(C9237b.m30157P(SentryAndroidOptions.this));
                return valueOf;
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C9652y3(new InterfaceC9627v3() { // from class: io.sentry.android.core.q
            @Override // io.sentry.InterfaceC9627v3
            /* renamed from: a */
            public final String mo30388a() {
                String cacheDirPath;
                cacheDirPath = SentryAndroidOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        }), c9611o));
        sentryAndroidOptions.addIntegration(new NdkIntegration(m30329e(c9311s0) ? c9232b1.m30153c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger()) : null));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m30120b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C9658z3(new InterfaceC9627v3() { // from class: io.sentry.android.core.r
            @Override // io.sentry.InterfaceC9627v3
            /* renamed from: a */
            public final String mo30388a() {
                String outboxPath;
                outboxPath = SentryAndroidOptions.this.getOutboxPath();
                return outboxPath;
            }
        }), c9611o));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(C9303o0.m30353a(context, c9311s0));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c9311s0, c9245f0));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, c9232b1));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c9311s0, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }

    /* renamed from: e */
    private static boolean m30329e(C9311s0 c9311s0) {
        return c9311s0.m30406d() >= 16;
    }

    /* renamed from: i */
    static void m30333i(SentryAndroidOptions sentryAndroidOptions, Context context, InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) {
        C9613q.m31802c(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        C9613q.m31802c(sentryAndroidOptions, "The options object is required.");
        C9613q.m31802c(interfaceC9637w1, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(interfaceC9637w1);
        sentryAndroidOptions.setDateProvider(new C9252h1());
        C9240d1.m30164a(context, sentryAndroidOptions, c9311s0);
        m30326b(context, sentryAndroidOptions);
        m30334j(sentryAndroidOptions, context, c9311s0);
    }

    /* renamed from: j */
    private static void m30334j(SentryAndroidOptions sentryAndroidOptions, Context context, C9311s0 c9311s0) {
        PackageInfo m30418j = C9313t0.m30418j(context, sentryAndroidOptions.getLogger(), c9311s0);
        if (m30418j != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(m30325a(m30418j, C9313t0.m30419k(m30418j, c9311s0)));
            }
            String str = m30418j.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(C9229a1.m30148a(context));
            } catch (RuntimeException e2) {
                sentryAndroidOptions.getLogger().mo30213b(EnumC9554s4.ERROR, "Could not generate distinct Id.", e2);
            }
        }
    }
}
