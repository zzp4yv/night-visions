package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes2.dex */
final class ServiceConnectionC6397m implements ServiceConnection, zzs {

    /* renamed from: f */
    private final Map f17822f = new HashMap();

    /* renamed from: g */
    private int f17823g = 2;

    /* renamed from: h */
    private boolean f17824h;

    /* renamed from: i */
    private IBinder f17825i;

    /* renamed from: j */
    private final zzn f17826j;

    /* renamed from: k */
    private ComponentName f17827k;

    /* renamed from: l */
    final /* synthetic */ C6399o f17828l;

    public ServiceConnectionC6397m(C6399o c6399o, zzn zznVar) {
        this.f17828l = c6399o;
        this.f17826j = zznVar;
    }

    /* renamed from: a */
    public final int m14408a() {
        return this.f17823g;
    }

    /* renamed from: b */
    public final ComponentName m14409b() {
        return this.f17827k;
    }

    /* renamed from: c */
    public final IBinder m14410c() {
        return this.f17825i;
    }

    /* renamed from: d */
    public final void m14411d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f17822f.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m14412e(String str, Executor executor) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j2;
        this.f17823g = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.m14651o()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C6399o c6399o = this.f17828l;
            connectionTracker = c6399o.f17834j;
            context = c6399o.f17831g;
            zzn zznVar = this.f17826j;
            context2 = c6399o.f17831g;
            boolean m14582d = connectionTracker.m14582d(context, str, zznVar.m14509c(context2), this, this.f17826j.m14507a(), executor);
            this.f17824h = m14582d;
            if (m14582d) {
                handler = this.f17828l.f17832h;
                Message obtainMessage = handler.obtainMessage(1, this.f17826j);
                handler2 = this.f17828l.f17832h;
                j2 = this.f17828l.f17836l;
                handler2.sendMessageDelayed(obtainMessage, j2);
            } else {
                this.f17823g = 2;
                try {
                    C6399o c6399o2 = this.f17828l;
                    connectionTracker2 = c6399o2.f17834j;
                    context3 = c6399o2.f17831g;
                    connectionTracker2.m14581c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m14413f(ServiceConnection serviceConnection, String str) {
        this.f17822f.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m14414g(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        handler = this.f17828l.f17832h;
        handler.removeMessages(1, this.f17826j);
        C6399o c6399o = this.f17828l;
        connectionTracker = c6399o.f17834j;
        context = c6399o.f17831g;
        connectionTracker.m14581c(context, this);
        this.f17824h = false;
        this.f17823g = 2;
    }

    /* renamed from: h */
    public final boolean m14415h(ServiceConnection serviceConnection) {
        return this.f17822f.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m14416i() {
        return this.f17822f.isEmpty();
    }

    /* renamed from: j */
    public final boolean m14417j() {
        return this.f17824h;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f17828l.f17830f;
        synchronized (hashMap) {
            handler = this.f17828l.f17832h;
            handler.removeMessages(1, this.f17826j);
            this.f17825i = iBinder;
            this.f17827k = componentName;
            Iterator it = this.f17822f.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f17823g = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f17828l.f17830f;
        synchronized (hashMap) {
            handler = this.f17828l.f17832h;
            handler.removeMessages(1, this.f17826j);
            this.f17825i = null;
            this.f17827k = componentName;
            Iterator it = this.f17822f.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f17823g = 2;
        }
    }
}
