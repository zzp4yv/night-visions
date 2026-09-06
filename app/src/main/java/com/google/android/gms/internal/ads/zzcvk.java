package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcvk implements zzcva<zzcvj> {

    /* renamed from: a */
    private final zzbbl f25150a;

    /* renamed from: b */
    private final Context f25151b;

    public zzcvk(zzbbl zzbblVar, Context context) {
        this.f25150a = zzbblVar;
        this.f25151b = context;
    }

    /* renamed from: a */
    final /* synthetic */ zzcvj m19000a() throws Exception {
        int i2;
        boolean z;
        int i3;
        int i4;
        TelephonyManager telephonyManager = (TelephonyManager) this.f25151b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        zzk.zzlg();
        int i5 = -1;
        if (zzaxi.m17152f0(this.f25151b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f25151b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i5 = activeNetworkInfo.getType();
                i4 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i4 = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                i2 = i5;
                i3 = i4;
                z = connectivityManager.isActiveNetworkMetered();
            } else {
                i2 = i5;
                i3 = i4;
                z = false;
            }
        } else {
            i2 = -2;
            z = false;
            i3 = -1;
        }
        return new zzcvj(networkOperator, i2, networkType, phoneType, z, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcvj> mo14982b() {
        return this.f25150a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ep

            /* renamed from: f */
            private final zzcvk f18830f;

            {
                this.f18830f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18830f.m19000a();
            }
        });
    }
}
