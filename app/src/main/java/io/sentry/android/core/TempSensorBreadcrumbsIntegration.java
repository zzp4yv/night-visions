package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.C9438i2;
import io.sentry.C9484n1;
import io.sentry.C9624v0;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TempSensorBreadcrumbsIntegration implements Integration, Closeable, SensorEventListener {

    /* renamed from: f */
    private final Context f35844f;

    /* renamed from: g */
    private InterfaceC9625v1 f35845g;

    /* renamed from: h */
    private SentryAndroidOptions f35846h;

    /* renamed from: i */
    SensorManager f35847i;

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.f35844f = (Context) C9613q.m31802c(context, "Context is required");
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        this.f35845g = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35846h = sentryAndroidOptions;
        InterfaceC9637w1 logger = sentryAndroidOptions.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f35846h.isEnableSystemEventBreadcrumbs()));
        if (this.f35846h.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f35844f.getSystemService("sensor");
                this.f35847i = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f35847i.registerListener(this, defaultSensor, 3);
                        c9647x4.getLogger().mo30214c(enumC9554s4, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                        mo30003a();
                    } else {
                        this.f35846h.getLogger().mo30214c(EnumC9554s4.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f35846h.getLogger().mo30214c(EnumC9554s4.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th) {
                c9647x4.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SensorManager sensorManager = this.f35847i;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f35847i = null;
            SentryAndroidOptions sentryAndroidOptions = this.f35846h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f35845g == null) {
            return;
        }
        C9624v0 c9624v0 = new C9624v0();
        c9624v0.m31844p("system");
        c9624v0.m31840l("device.event");
        c9624v0.m31841m("action", "TYPE_AMBIENT_TEMPERATURE");
        c9624v0.m31841m("accuracy", Integer.valueOf(sensorEvent.accuracy));
        c9624v0.m31841m("timestamp", Long.valueOf(sensorEvent.timestamp));
        c9624v0.m31842n(EnumC9554s4.INFO);
        c9624v0.m31841m("degree", Float.valueOf(sensorEvent.values[0]));
        C9484n1 c9484n1 = new C9484n1();
        c9484n1.m31079j("android:sensorEvent", sensorEvent);
        this.f35845g.mo31153n(c9624v0, c9484n1);
    }
}
