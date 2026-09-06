package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.m0 */
/* loaded from: classes2.dex */
final class C6882m0 implements zzaho<zzbgz> {
    C6882m0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        zzbgz zzbgzVar2 = zzbgzVar;
        WindowManager windowManager = (WindowManager) zzbgzVar2.getContext().getSystemService("window");
        zzk.zzlg();
        DisplayMetrics m17143b = zzaxi.m17143b(windowManager);
        int i2 = m17143b.widthPixels;
        int i3 = m17143b.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzbgzVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i2));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i3));
        zzbgzVar2.mo14940y("locationReady", hashMap);
        zzbad.m17353i("GET LOCATION COMPILED");
    }
}
