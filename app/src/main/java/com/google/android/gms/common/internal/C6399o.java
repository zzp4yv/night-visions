package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes2.dex */
final class C6399o extends GmsClientSupervisor {

    /* renamed from: f */
    private final HashMap f17830f = new HashMap();

    /* renamed from: g */
    private final Context f17831g;

    /* renamed from: h */
    private volatile Handler f17832h;

    /* renamed from: i */
    private final C6398n f17833i;

    /* renamed from: j */
    private final ConnectionTracker f17834j;

    /* renamed from: k */
    private final long f17835k;

    /* renamed from: l */
    private final long f17836l;

    C6399o(Context context, Looper looper) {
        C6398n c6398n = new C6398n(this, null);
        this.f17833i = c6398n;
        this.f17831g = context.getApplicationContext();
        this.f17832h = new com.google.android.gms.internal.common.zzi(looper, c6398n);
        this.f17834j = ConnectionTracker.m14575b();
        this.f17835k = 5000L;
        this.f17836l = LocalNotificationSyncManager.FIVE_MINUTES;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: d */
    protected final void mo14342d(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.m14373l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17830f) {
            ServiceConnectionC6397m serviceConnectionC6397m = (ServiceConnectionC6397m) this.f17830f.get(zznVar);
            if (serviceConnectionC6397m == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zznVar.toString());
            }
            if (!serviceConnectionC6397m.m14415h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zznVar.toString());
            }
            serviceConnectionC6397m.m14413f(serviceConnection, str);
            if (serviceConnectionC6397m.m14416i()) {
                this.f17832h.sendMessageDelayed(this.f17832h.obtainMessage(0, zznVar), this.f17835k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: f */
    protected final boolean mo14344f(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m14417j;
        Preconditions.m14373l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17830f) {
            ServiceConnectionC6397m serviceConnectionC6397m = (ServiceConnectionC6397m) this.f17830f.get(zznVar);
            if (serviceConnectionC6397m == null) {
                serviceConnectionC6397m = new ServiceConnectionC6397m(this, zznVar);
                serviceConnectionC6397m.m14411d(serviceConnection, serviceConnection, str);
                serviceConnectionC6397m.m14412e(str, executor);
                this.f17830f.put(zznVar, serviceConnectionC6397m);
            } else {
                this.f17832h.removeMessages(0, zznVar);
                if (serviceConnectionC6397m.m14415h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zznVar.toString());
                }
                serviceConnectionC6397m.m14411d(serviceConnection, serviceConnection, str);
                int m14408a = serviceConnectionC6397m.m14408a();
                if (m14408a == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC6397m.m14409b(), serviceConnectionC6397m.m14410c());
                } else if (m14408a == 2) {
                    serviceConnectionC6397m.m14412e(str, executor);
                }
            }
            m14417j = serviceConnectionC6397m.m14417j();
        }
        return m14417j;
    }
}
