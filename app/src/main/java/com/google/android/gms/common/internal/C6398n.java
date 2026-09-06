package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes2.dex */
final class C6398n implements Handler.Callback {

    /* renamed from: f */
    final /* synthetic */ C6399o f17829f;

    /* synthetic */ C6398n(C6399o c6399o, zzp zzpVar) {
        this.f17829f = c6399o;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i2 = message.what;
        if (i2 == 0) {
            hashMap = this.f17829f.f17830f;
            synchronized (hashMap) {
                zzn zznVar = (zzn) message.obj;
                hashMap2 = this.f17829f.f17830f;
                ServiceConnectionC6397m serviceConnectionC6397m = (ServiceConnectionC6397m) hashMap2.get(zznVar);
                if (serviceConnectionC6397m != null && serviceConnectionC6397m.m14416i()) {
                    if (serviceConnectionC6397m.m14417j()) {
                        serviceConnectionC6397m.m14414g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f17829f.f17830f;
                    hashMap3.remove(zznVar);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        hashMap4 = this.f17829f.f17830f;
        synchronized (hashMap4) {
            zzn zznVar2 = (zzn) message.obj;
            hashMap5 = this.f17829f.f17830f;
            ServiceConnectionC6397m serviceConnectionC6397m2 = (ServiceConnectionC6397m) hashMap5.get(zznVar2);
            if (serviceConnectionC6397m2 != null && serviceConnectionC6397m2.m14408a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(zznVar2), new Exception());
                ComponentName m14409b = serviceConnectionC6397m2.m14409b();
                if (m14409b == null) {
                    m14409b = zznVar2.m14508b();
                }
                if (m14409b == null) {
                    String m14510d = zznVar2.m14510d();
                    Preconditions.m14372k(m14510d);
                    m14409b = new ComponentName(m14510d, "unknown");
                }
                serviceConnectionC6397m2.onServiceDisconnected(m14409b);
            }
        }
        return true;
    }
}
