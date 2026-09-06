package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.C9438i2;
import io.sentry.C9484n1;
import io.sentry.C9624v0;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9281k;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Context f35810f;

    /* renamed from: g */
    private final C9311s0 f35811g;

    /* renamed from: h */
    private final InterfaceC9637w1 f35812h;

    /* renamed from: i */
    C9223b f35813i;

    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$a */
    static class C9222a {

        /* renamed from: a */
        final int f35814a;

        /* renamed from: b */
        final int f35815b;

        /* renamed from: c */
        final int f35816c;

        /* renamed from: d */
        final boolean f35817d;

        /* renamed from: e */
        final String f35818e;

        @SuppressLint({"NewApi", "ObsoleteSdkInt"})
        C9222a(NetworkCapabilities networkCapabilities, C9311s0 c9311s0) {
            C9613q.m31802c(networkCapabilities, "NetworkCapabilities is required");
            C9613q.m31802c(c9311s0, "BuildInfoProvider is required");
            this.f35814a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f35815b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = c9311s0.m30406d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f35816c = signalStrength > -100 ? signalStrength : 0;
            this.f35817d = networkCapabilities.hasTransport(4);
            String m30283d = C9281k.m30283d(networkCapabilities, c9311s0);
            this.f35818e = m30283d == null ? HttpUrl.FRAGMENT_ENCODE_SET : m30283d;
        }

        /* renamed from: a */
        boolean m30132a(C9222a c9222a) {
            if (this.f35817d == c9222a.f35817d && this.f35818e.equals(c9222a.f35818e)) {
                int i2 = this.f35816c;
                int i3 = c9222a.f35816c;
                if (-5 <= i2 - i3 && i2 - i3 <= 5) {
                    int i4 = this.f35814a;
                    int i5 = c9222a.f35814a;
                    if (-1000 <= i4 - i5 && i4 - i5 <= 1000) {
                        int i6 = this.f35815b;
                        int i7 = c9222a.f35815b;
                        if (-1000 <= i6 - i7 && i6 - i7 <= 1000) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$b */
    static final class C9223b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final InterfaceC9625v1 f35819a;

        /* renamed from: b */
        final C9311s0 f35820b;

        /* renamed from: c */
        Network f35821c = null;

        /* renamed from: d */
        NetworkCapabilities f35822d = null;

        C9223b(InterfaceC9625v1 interfaceC9625v1, C9311s0 c9311s0) {
            this.f35819a = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required");
            this.f35820b = (C9311s0) C9613q.m31802c(c9311s0, "BuildInfoProvider is required");
        }

        /* renamed from: a */
        private C9624v0 m30133a(String str) {
            C9624v0 c9624v0 = new C9624v0();
            c9624v0.m31844p("system");
            c9624v0.m31840l("network.event");
            c9624v0.m31841m("action", str);
            c9624v0.m31842n(EnumC9554s4.INFO);
            return c9624v0;
        }

        /* renamed from: b */
        private C9222a m30134b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            if (networkCapabilities == null) {
                return new C9222a(networkCapabilities2, this.f35820b);
            }
            C9222a c9222a = new C9222a(networkCapabilities, this.f35820b);
            C9222a c9222a2 = new C9222a(networkCapabilities2, this.f35820b);
            if (c9222a2.m30132a(c9222a)) {
                return null;
            }
            return c9222a2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f35821c)) {
                return;
            }
            this.f35819a.mo31148i(m30133a("NETWORK_AVAILABLE"));
            this.f35821c = network;
            this.f35822d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C9222a m30134b;
            if (network.equals(this.f35821c) && (m30134b = m30134b(this.f35822d, networkCapabilities)) != null) {
                this.f35822d = networkCapabilities;
                C9624v0 m30133a = m30133a("NETWORK_CAPABILITIES_CHANGED");
                m30133a.m31841m("download_bandwidth", Integer.valueOf(m30134b.f35814a));
                m30133a.m31841m("upload_bandwidth", Integer.valueOf(m30134b.f35815b));
                m30133a.m31841m("vpn_active", Boolean.valueOf(m30134b.f35817d));
                m30133a.m31841m("network_type", m30134b.f35818e);
                int i2 = m30134b.f35816c;
                if (i2 != 0) {
                    m30133a.m31841m("signal_strength", Integer.valueOf(i2));
                }
                C9484n1 c9484n1 = new C9484n1();
                c9484n1.m31079j("android:networkCapabilities", m30134b);
                this.f35819a.mo31153n(m30133a, c9484n1);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.f35821c)) {
                this.f35819a.mo31148i(m30133a("NETWORK_LOST"));
                this.f35821c = null;
                this.f35822d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, C9311s0 c9311s0, InterfaceC9637w1 interfaceC9637w1) {
        this.f35810f = (Context) C9613q.m31802c(context, "Context is required");
        this.f35811g = (C9311s0) C9613q.m31802c(c9311s0, "BuildInfoProvider is required");
        this.f35812h = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "ILogger is required");
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        InterfaceC9637w1 interfaceC9637w1 = this.f35812h;
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        interfaceC9637w1.mo30214c(enumC9554s4, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f35811g.m30406d() < 21) {
                this.f35813i = null;
                this.f35812h.mo30214c(enumC9554s4, "NetworkBreadcrumbsIntegration requires Android 5+", new Object[0]);
                return;
            }
            C9223b c9223b = new C9223b(interfaceC9625v1, this.f35811g);
            this.f35813i = c9223b;
            if (C9281k.m30285f(this.f35810f, this.f35812h, this.f35811g, c9223b)) {
                this.f35812h.mo30214c(enumC9554s4, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } else {
                this.f35813i = null;
                this.f35812h.mo30214c(enumC9554s4, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C9223b c9223b = this.f35813i;
        if (c9223b != null) {
            C9281k.m30286g(this.f35810f, this.f35812h, this.f35811g, c9223b);
            this.f35812h.mo30214c(EnumC9554s4.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f35813i = null;
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }
}
