package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C9465k3;
import io.sentry.C9643x0;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9544r1;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9608l;
import io.sentry.util.C9613q;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidCpuCollector.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.g0 */
/* loaded from: classes2.dex */
public final class C9248g0 implements InterfaceC9544r1 {

    /* renamed from: a */
    private long f35908a = 0;

    /* renamed from: b */
    private long f35909b = 0;

    /* renamed from: c */
    private long f35910c = 1;

    /* renamed from: d */
    private long f35911d = 1;

    /* renamed from: e */
    private final long f35912e = 1000000000;

    /* renamed from: f */
    private double f35913f;

    /* renamed from: g */
    private final File f35914g;

    /* renamed from: h */
    private final InterfaceC9637w1 f35915h;

    /* renamed from: i */
    private final C9311s0 f35916i;

    /* renamed from: j */
    private boolean f35917j;

    public C9248g0(InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) {
        double d2 = 1L;
        Double.isNaN(d2);
        this.f35913f = 1.0E9d / d2;
        this.f35914g = new File("/proc/self/stat");
        this.f35917j = false;
        this.f35915h = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "Logger is required.");
        this.f35916i = (C9311s0) C9613q.m31802c(c9311s0, "BuildInfoProvider is required.");
    }

    /* renamed from: b */
    private long m30202b() {
        String str;
        try {
            str = C9608l.m31777c(this.f35914g);
        } catch (IOException e2) {
            this.f35917j = false;
            this.f35915h.mo30213b(EnumC9554s4.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e2);
            str = null;
        }
        if (str != null) {
            String[] split = str.trim().split("[\n\t\r ]");
            try {
                double parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                double d2 = this.f35913f;
                Double.isNaN(parseLong);
                return (long) (parseLong * d2);
            } catch (NumberFormatException e3) {
                this.f35915h.mo30213b(EnumC9554s4.ERROR, "Error parsing /proc/self/stat file.", e3);
            }
        }
        return 0L;
    }

    @Override // io.sentry.InterfaceC9544r1
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo30203a(C9465k3 c9465k3) {
        if (this.f35916i.m30406d() < 21 || !this.f35917j) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j2 = elapsedRealtimeNanos - this.f35908a;
        this.f35908a = elapsedRealtimeNanos;
        long m30202b = m30202b();
        long j3 = m30202b - this.f35909b;
        this.f35909b = m30202b;
        double d2 = j3;
        double d3 = j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        long currentTimeMillis = System.currentTimeMillis();
        double d4 = this.f35911d;
        Double.isNaN(d4);
        c9465k3.m30914a(new C9643x0(currentTimeMillis, ((d2 / d3) / d4) * 100.0d));
    }

    @Override // io.sentry.InterfaceC9544r1
    @SuppressLint({"NewApi"})
    public void setup() {
        if (this.f35916i.m30406d() < 21) {
            this.f35917j = false;
            return;
        }
        this.f35917j = true;
        this.f35910c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f35911d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        double d2 = this.f35910c;
        Double.isNaN(d2);
        this.f35913f = 1.0E9d / d2;
        this.f35909b = m30202b();
    }
}
