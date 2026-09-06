package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzjc implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private volatile boolean f29345f;

    /* renamed from: g */
    private volatile zzeu f29346g;

    /* renamed from: h */
    final /* synthetic */ zzik f29347h;

    protected zzjc(zzik zzikVar) {
        this.f29347h = zzikVar;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m23377c(zzjc zzjcVar, boolean z) {
        zzjcVar.f29345f = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        Preconditions.m14367f("MeasurementServiceConnection.onConnectionFailed");
        zzet m23212C = this.f29347h.f28874a.m23212C();
        if (m23212C != null) {
            m23212C.m23140K().m23148b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f29345f = false;
            this.f29346g = null;
        }
        this.f29347h.mo22835g().m23201z(new RunnableC7759p6(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
        Preconditions.m14367f("MeasurementServiceConnection.onConnectionSuspended");
        this.f29347h.mo22836h().m23144O().m23147a("Service connection suspended");
        this.f29347h.mo22835g().m23201z(new RunnableC7768q6(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        Preconditions.m14367f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f29347h.mo22835g().m23201z(new RunnableC7741n6(this, this.f29346g.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f29346g = null;
                this.f29345f = false;
            }
        }
    }

    /* renamed from: a */
    public final void m23378a() {
        if (this.f29346g != null && (this.f29346g.isConnected() || this.f29346g.isConnecting())) {
            this.f29346g.disconnect();
        }
        this.f29346g = null;
    }

    /* renamed from: b */
    public final void m23379b(Intent intent) {
        zzjc zzjcVar;
        this.f29347h.mo22792d();
        Context mo22834f = this.f29347h.mo22834f();
        ConnectionTracker m14575b = ConnectionTracker.m14575b();
        synchronized (this) {
            if (this.f29345f) {
                this.f29347h.mo22836h().m23145P().m23147a("Connection attempt already in progress");
                return;
            }
            this.f29347h.mo22836h().m23145P().m23147a("Using local app measurement service");
            this.f29345f = true;
            zzjcVar = this.f29347h.f29338c;
            m14575b.m14580a(mo22834f, intent, zzjcVar, 129);
        }
    }

    /* renamed from: d */
    public final void m23380d() {
        this.f29347h.mo22792d();
        Context mo22834f = this.f29347h.mo22834f();
        synchronized (this) {
            if (this.f29345f) {
                this.f29347h.mo22836h().m23145P().m23147a("Connection attempt already in progress");
                return;
            }
            if (this.f29346g != null && (this.f29346g.isConnecting() || this.f29346g.isConnected())) {
                this.f29347h.mo22836h().m23145P().m23147a("Already awaiting connection attempt");
                return;
            }
            this.f29346g = new zzeu(mo22834f, Looper.getMainLooper(), this, this);
            this.f29347h.mo22836h().m23145P().m23147a("Connecting to remote service");
            this.f29345f = true;
            this.f29346g.checkAvailabilityAndConnect();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjc zzjcVar;
        Preconditions.m14367f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f29345f = false;
                this.f29347h.mo22836h().m23137H().m23147a("Service connected with null binder");
                return;
            }
            zzel zzelVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzelVar = queryLocalInterface instanceof zzel ? (zzel) queryLocalInterface : new zzen(iBinder);
                    this.f29347h.mo22836h().m23145P().m23147a("Bound to IMeasurementService interface");
                } else {
                    this.f29347h.mo22836h().m23137H().m23148b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f29347h.mo22836h().m23137H().m23147a("Service connect failed to get IMeasurementService");
            }
            if (zzelVar == null) {
                this.f29345f = false;
                try {
                    ConnectionTracker m14575b = ConnectionTracker.m14575b();
                    Context mo22834f = this.f29347h.mo22834f();
                    zzjcVar = this.f29347h.f29338c;
                    m14575b.m14581c(mo22834f, zzjcVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f29347h.mo22835g().m23201z(new RunnableC7732m6(this, zzelVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.m14367f("MeasurementServiceConnection.onServiceDisconnected");
        this.f29347h.mo22836h().m23144O().m23147a("Service disconnected");
        this.f29347h.mo22835g().m23201z(new RunnableC7750o6(this, componentName));
    }
}
