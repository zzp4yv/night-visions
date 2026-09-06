package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.c */
/* loaded from: classes2.dex */
final class ServiceConnectionC6296c implements ServiceConnection {

    /* renamed from: f */
    int f17154f;

    /* renamed from: g */
    final Messenger f17155g;

    /* renamed from: h */
    C6305l f17156h;

    /* renamed from: i */
    final Queue<AbstractC6306m<?>> f17157i;

    /* renamed from: j */
    final SparseArray<AbstractC6306m<?>> f17158j;

    /* renamed from: k */
    final /* synthetic */ zze f17159k;

    private ServiceConnectionC6296c(zze zzeVar) {
        this.f17159k = zzeVar;
        this.f17154f = 0;
        this.f17155g = new Messenger(new com.google.android.gms.internal.cloudmessaging.zze(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.cloudmessaging.f

            /* renamed from: f */
            private final ServiceConnectionC6296c f17161f;

            {
                this.f17161f = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f17161f.m13768d(message);
            }
        }));
        this.f17157i = new ArrayDeque();
        this.f17158j = new SparseArray<>();
    }

    /* renamed from: a */
    final void m13765a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f17159k.f17188c;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.g

            /* renamed from: f */
            private final ServiceConnectionC6296c f17162f;

            {
                this.f17162f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6306m<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC6296c serviceConnectionC6296c = this.f17162f;
                while (true) {
                    synchronized (serviceConnectionC6296c) {
                        if (serviceConnectionC6296c.f17154f != 2) {
                            return;
                        }
                        if (serviceConnectionC6296c.f17157i.isEmpty()) {
                            serviceConnectionC6296c.m13770f();
                            return;
                        }
                        poll = serviceConnectionC6296c.f17157i.poll();
                        serviceConnectionC6296c.f17158j.put(poll.f17170a, poll);
                        scheduledExecutorService2 = serviceConnectionC6296c.f17159k.f17188c;
                        scheduledExecutorService2.schedule(new Runnable(serviceConnectionC6296c, poll) { // from class: com.google.android.gms.cloudmessaging.i

                            /* renamed from: f */
                            private final ServiceConnectionC6296c f17165f;

                            /* renamed from: g */
                            private final AbstractC6306m f17166g;

                            {
                                this.f17165f = serviceConnectionC6296c;
                                this.f17166g = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f17165f.m13766b(this.f17166g.f17170a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    context = serviceConnectionC6296c.f17159k.f17187b;
                    Messenger messenger = serviceConnectionC6296c.f17155g;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f17172c;
                    obtain.arg1 = poll.f17170a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo13773d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f17173d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC6296c.f17156h.m13774a(obtain);
                    } catch (RemoteException e2) {
                        serviceConnectionC6296c.m13767c(2, e2.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: b */
    final synchronized void m13766b(int i2) {
        AbstractC6306m<?> abstractC6306m = this.f17158j.get(i2);
        if (abstractC6306m != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f17158j.remove(i2);
            abstractC6306m.m13775b(new zzp(3, "Timed out waiting for response"));
            m13770f();
        }
    }

    /* renamed from: c */
    final synchronized void m13767c(int i2, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.f17154f;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                this.f17154f = 4;
                return;
            } else {
                if (i3 == 4) {
                    return;
                }
                int i4 = this.f17154f;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f17154f = 4;
        ConnectionTracker m14575b = ConnectionTracker.m14575b();
        context = this.f17159k.f17187b;
        m14575b.m14581c(context, this);
        zzp zzpVar = new zzp(i2, str);
        Iterator<AbstractC6306m<?>> it = this.f17157i.iterator();
        while (it.hasNext()) {
            it.next().m13775b(zzpVar);
        }
        this.f17157i.clear();
        for (int i5 = 0; i5 < this.f17158j.size(); i5++) {
            this.f17158j.valueAt(i5).m13775b(zzpVar);
        }
        this.f17158j.clear();
    }

    /* renamed from: d */
    final boolean m13768d(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            AbstractC6306m<?> abstractC6306m = this.f17158j.get(i2);
            if (abstractC6306m == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i2);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.f17158j.remove(i2);
            m13770f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC6306m.m13775b(new zzp(4, "Not supported by GmsCore"));
            } else {
                abstractC6306m.mo13772a(data);
            }
            return true;
        }
    }

    /* renamed from: e */
    final synchronized boolean m13769e(AbstractC6306m<?> abstractC6306m) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i2 = this.f17154f;
        if (i2 == 0) {
            this.f17157i.add(abstractC6306m);
            Preconditions.m14375n(this.f17154f == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f17154f = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            ConnectionTracker m14575b = ConnectionTracker.m14575b();
            context = this.f17159k.f17187b;
            if (m14575b.m14580a(context, intent, this, 1)) {
                scheduledExecutorService = this.f17159k.f17188c;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.e

                    /* renamed from: f */
                    private final ServiceConnectionC6296c f17160f;

                    {
                        this.f17160f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17160f.m13771g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m13767c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i2 == 1) {
            this.f17157i.add(abstractC6306m);
            return true;
        }
        if (i2 == 2) {
            this.f17157i.add(abstractC6306m);
            m13765a();
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            int i3 = this.f17154f;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    /* renamed from: f */
    final synchronized void m13770f() {
        Context context;
        if (this.f17154f == 2 && this.f17157i.isEmpty() && this.f17158j.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f17154f = 3;
            ConnectionTracker m14575b = ConnectionTracker.m14575b();
            context = this.f17159k.f17187b;
            m14575b.m14581c(context, this);
        }
    }

    /* renamed from: g */
    final synchronized void m13771g() {
        if (this.f17154f == 1) {
            m13767c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f17159k.f17188c;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: com.google.android.gms.cloudmessaging.h

            /* renamed from: f */
            private final ServiceConnectionC6296c f17163f;

            /* renamed from: g */
            private final IBinder f17164g;

            {
                this.f17163f = this;
                this.f17164g = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6296c serviceConnectionC6296c = this.f17163f;
                IBinder iBinder2 = this.f17164g;
                synchronized (serviceConnectionC6296c) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC6296c.m13767c(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC6296c.f17156h = new C6305l(iBinder2);
                            serviceConnectionC6296c.f17154f = 2;
                            serviceConnectionC6296c.m13765a();
                        } catch (RemoteException e2) {
                            serviceConnectionC6296c.m13767c(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f17159k.f17188c;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.j

            /* renamed from: f */
            private final ServiceConnectionC6296c f17167f;

            {
                this.f17167f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17167f.m13767c(2, "Service disconnected");
            }
        });
    }
}
