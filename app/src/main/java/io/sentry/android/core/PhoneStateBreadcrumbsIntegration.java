package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.C9438i2;
import io.sentry.C9624v0;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9287q;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Context f35823f;

    /* renamed from: g */
    private SentryAndroidOptions f35824g;

    /* renamed from: h */
    C9224a f35825h;

    /* renamed from: i */
    private TelephonyManager f35826i;

    /* renamed from: io.sentry.android.core.PhoneStateBreadcrumbsIntegration$a */
    static final class C9224a extends PhoneStateListener {

        /* renamed from: a */
        private final InterfaceC9625v1 f35827a;

        C9224a(InterfaceC9625v1 interfaceC9625v1) {
            this.f35827a = interfaceC9625v1;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i2, String str) {
            if (i2 == 1) {
                C9624v0 c9624v0 = new C9624v0();
                c9624v0.m31844p("system");
                c9624v0.m31840l("device.event");
                c9624v0.m31841m("action", "CALL_STATE_RINGING");
                c9624v0.m31843o("Device ringing");
                c9624v0.m31842n(EnumC9554s4.INFO);
                this.f35827a.mo31148i(c9624v0);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f35823f = (Context) C9613q.m31802c(context, "Context is required");
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35824g = sentryAndroidOptions;
        InterfaceC9637w1 logger = sentryAndroidOptions.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f35824g.isEnableSystemEventBreadcrumbs()));
        if (this.f35824g.isEnableSystemEventBreadcrumbs() && C9287q.m30298a(this.f35823f, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f35823f.getSystemService("phone");
            this.f35826i = telephonyManager;
            if (telephonyManager == null) {
                this.f35824g.getLogger().mo30214c(EnumC9554s4.INFO, "TelephonyManager is not available", new Object[0]);
                return;
            }
            try {
                C9224a c9224a = new C9224a(interfaceC9625v1);
                this.f35825h = c9224a;
                this.f35826i.listen(c9224a, 32);
                c9647x4.getLogger().mo30214c(enumC9554s4, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } catch (Throwable th) {
                this.f35824g.getLogger().mo30212a(EnumC9554s4.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C9224a c9224a;
        TelephonyManager telephonyManager = this.f35826i;
        if (telephonyManager == null || (c9224a = this.f35825h) == null) {
            return;
        }
        telephonyManager.listen(c9224a, 0);
        this.f35825h = null;
        SentryAndroidOptions sentryAndroidOptions = this.f35824g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }
}
