package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zze implements ServiceConnection {

    /* renamed from: f */
    private final int f17852f;

    /* renamed from: g */
    final /* synthetic */ BaseGmsClient f17853g;

    public zze(BaseGmsClient baseGmsClient, int i2) {
        this.f17853g = baseGmsClient;
        this.f17852f = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        BaseGmsClient baseGmsClient = this.f17853g;
        if (iBinder == null) {
            BaseGmsClient.zzk(baseGmsClient, 16);
            return;
        }
        obj = baseGmsClient.zzq;
        synchronized (obj) {
            BaseGmsClient baseGmsClient2 = this.f17853g;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new C6394j(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }
        this.f17853g.zzl(0, null, this.f17852f);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f17853g.zzq;
        synchronized (obj) {
            this.f17853g.zzr = null;
        }
        Handler handler = this.f17853g.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f17852f, 1));
    }
}
