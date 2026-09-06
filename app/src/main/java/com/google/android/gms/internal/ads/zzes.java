package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzes extends zzfk {
    public zzes(zzdy zzdyVar, String str, String str2, zzbp.zza.C11431zza c11431zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11431zza, i2, 24);
    }

    /* renamed from: c */
    private final void m19935c() {
        AdvertisingIdClient m19900D = this.f26089g.m19900D();
        if (m19900D == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = m19900D.getInfo();
            String m19921e = zzef.m19921e(info.getId());
            if (m19921e != null) {
                synchronized (this.f26092j) {
                    this.f26092j.m18055C(m19921e);
                    this.f26092j.m18076X(info.isLimitAdTrackingEnabled());
                    this.f26092j.m18073T(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (this.f26089g.m19912v()) {
            m19935c();
            return;
        }
        synchronized (this.f26092j) {
            this.f26092j.m18055C((String) this.f26093k.invoke(null, this.f26089g.m19901a()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: b */
    public final Void call() throws Exception {
        if (this.f26089g.m19902b()) {
            return super.call();
        }
        if (!this.f26089g.m19912v()) {
            return null;
        }
        m19935c();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfk, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
