package com.flurry.sdk;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.y5 */
/* loaded from: classes2.dex */
public final class C6175y5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f16526b;

    /* renamed from: c */
    public boolean f16527c;

    /* renamed from: d */
    public boolean f16528d;

    /* renamed from: e */
    public final Location f16529e;

    public C6175y5(int i2, boolean z, boolean z2, Location location) {
        this.f16526b = i2;
        this.f16527c = z;
        this.f16528d = z2;
        this.f16529e = location;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        Location location;
        double d2;
        double d3;
        boolean z;
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.report.location.enabled", this.f16527c);
        if (this.f16527c) {
            mo12963a.put("fl.location.permission.status", this.f16528d);
            if (this.f16528d && (location = this.f16529e) != null) {
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                double d4 = 0.0d;
                if (i2 >= 26) {
                    d4 = location.getVerticalAccuracyMeters();
                    double bearingAccuracyDegrees = this.f16529e.getBearingAccuracyDegrees();
                    double speedAccuracyMetersPerSecond = this.f16529e.getSpeedAccuracyMetersPerSecond();
                    boolean hasBearingAccuracy = this.f16529e.hasBearingAccuracy();
                    z = this.f16529e.hasSpeedAccuracy();
                    d3 = speedAccuracyMetersPerSecond;
                    d2 = bearingAccuracyDegrees;
                    z2 = hasBearingAccuracy;
                } else {
                    d2 = 0.0d;
                    d3 = 0.0d;
                    z = false;
                }
                mo12963a.put("fl.precision.value", this.f16526b);
                mo12963a.put("fl.latitude.value", this.f16529e.getLatitude());
                mo12963a.put("fl.longitude.value", this.f16529e.getLongitude());
                mo12963a.put("fl.horizontal.accuracy.value", this.f16529e.getAccuracy());
                mo12963a.put("fl.time.epoch.value", this.f16529e.getTime());
                if (i2 >= 17) {
                    mo12963a.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(this.f16529e.getElapsedRealtimeNanos()));
                }
                mo12963a.put("fl.altitude.value", this.f16529e.getAltitude());
                mo12963a.put("fl.vertical.accuracy.value", d4);
                mo12963a.put("fl.bearing.value", this.f16529e.getBearing());
                mo12963a.put("fl.speed.value", this.f16529e.getSpeed());
                mo12963a.put("fl.bearing.accuracy.available", z2);
                mo12963a.put("fl.speed.accuracy.available", z);
                mo12963a.put("fl.bearing.accuracy.degrees", d2);
                mo12963a.put("fl.speed.accuracy.meters.per.sec", d3);
            }
        }
        return mo12963a;
    }
}
