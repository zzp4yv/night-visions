package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes2.dex */
final class HandlerC6395k extends com.google.android.gms.internal.common.zzi {

    /* renamed from: a */
    final /* synthetic */ BaseGmsClient f17821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6395k(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f17821a = baseGmsClient;
    }

    /* renamed from: a */
    private static final void m14406a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.mo14403b();
        zzcVar.m14505e();
    }

    /* renamed from: b */
    private static final boolean m14407b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.f17821a.zzd.get() != message.arg1) {
            if (m14407b(message)) {
                m14406a(message);
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.f17821a.enableLocalFallback()) || message.what == 5)) && !this.f17821a.isConnecting()) {
            m14406a(message);
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.f17821a.zzB = new ConnectionResult(message.arg2);
            if (BaseGmsClient.zzo(this.f17821a)) {
                BaseGmsClient baseGmsClient = this.f17821a;
                z = baseGmsClient.zzC;
                if (!z) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.f17821a;
            connectionResult2 = baseGmsClient2.zzB;
            ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new ConnectionResult(8);
            this.f17821a.zzc.mo13980a(connectionResult3);
            this.f17821a.onConnectionFailed(connectionResult3);
            return;
        }
        if (i3 == 5) {
            BaseGmsClient baseGmsClient3 = this.f17821a;
            connectionResult = baseGmsClient3.zzB;
            ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new ConnectionResult(8);
            this.f17821a.zzc.mo13980a(connectionResult4);
            this.f17821a.onConnectionFailed(connectionResult4);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f17821a.zzc.mo13980a(connectionResult5);
            this.f17821a.onConnectionFailed(connectionResult5);
            return;
        }
        if (i3 == 6) {
            this.f17821a.zzp(5, null);
            BaseGmsClient baseGmsClient4 = this.f17821a;
            baseConnectionCallbacks = baseGmsClient4.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = baseGmsClient4.zzw;
                baseConnectionCallbacks2.mo14284H(message.arg2);
            }
            this.f17821a.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.f17821a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.f17821a.isConnected()) {
            m14406a(message);
            return;
        }
        if (m14407b(message)) {
            ((zzc) message.obj).m14503c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
