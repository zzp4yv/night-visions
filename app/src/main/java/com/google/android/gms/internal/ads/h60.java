package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
abstract class h60<T> {

    /* renamed from: a */
    private static final zzzv f19063a = m15261e();

    h60() {
    }

    /* renamed from: e */
    private static zzzv m15261e() {
        try {
            Object newInstance = zzyh.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbad.m17353i("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return queryLocalInterface instanceof zzzv ? (zzzv) queryLocalInterface : new zzzx(iBinder);
        } catch (Exception unused) {
            zzbad.m17353i("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    /* renamed from: f */
    private final T m15262f() {
        zzzv zzzvVar = f19063a;
        if (zzzvVar == null) {
            zzbad.m17353i("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo14745a(zzzvVar);
        } catch (RemoteException e2) {
            zzbad.m17348d("Cannot invoke local loader using ClientApi class.", e2);
            return null;
        }
    }

    /* renamed from: g */
    private final T m15263g() {
        try {
            return mo14747d();
        } catch (RemoteException e2) {
            zzbad.m17348d("Cannot invoke remote loader.", e2);
            return null;
        }
    }

    /* renamed from: a */
    protected abstract T mo14745a(zzzv zzzvVar) throws RemoteException;

    /* renamed from: b */
    public final T m15264b(Context context, boolean z) {
        T m15262f;
        if (!z) {
            zzyt.m20844a();
            if (!zzazt.m17314s(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbad.m17349e("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.m14712a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m14713c(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        zzacu.m16423a(context);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21740Y3)).booleanValue()) {
            z = false;
        }
        if (z) {
            m15262f = m15262f();
            if (m15262f == null) {
                m15262f = m15263g();
            }
        } else {
            T m15263g = m15263g();
            int i2 = m15263g == null ? 1 : 0;
            if (i2 != 0) {
                if (zzyt.m20851h().nextInt(((Integer) zzyt.m20848e().m16421c(zzacu.f21741Y4)).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i2);
                    zzyt.m20844a().m17320d(context, zzyt.m20850g().f22750f, "gmob-apps", bundle, true);
                }
            }
            m15262f = m15263g == null ? m15262f() : m15263g;
        }
        return m15262f == null ? mo14746c() : m15262f;
    }

    /* renamed from: c */
    protected abstract T mo14746c();

    /* renamed from: d */
    protected abstract T mo14747d() throws RemoteException;
}
