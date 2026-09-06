package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ba */
/* loaded from: classes2.dex */
final class RunnableC6485ba implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18261f;

    /* renamed from: g */
    private final /* synthetic */ String f18262g;

    /* renamed from: h */
    private final /* synthetic */ long f18263h;

    /* renamed from: i */
    private final /* synthetic */ long f18264i;

    /* renamed from: j */
    private final /* synthetic */ boolean f18265j;

    /* renamed from: k */
    private final /* synthetic */ zzbft f18266k;

    RunnableC6485ba(zzbft zzbftVar, String str, String str2, long j2, long j3, boolean z) {
        this.f18266k = zzbftVar;
        this.f18261f = str;
        this.f18262g = str2;
        this.f18263h = j2;
        this.f18264i = j3;
        this.f18265j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f18261f);
        hashMap.put("cachedSrc", this.f18262g);
        hashMap.put("bufferedDuration", Long.toString(this.f18263h));
        hashMap.put("totalDuration", Long.toString(this.f18264i));
        hashMap.put("cacheReady", this.f18265j ? "1" : "0");
        this.f18266k.m17626r("onPrecacheEvent", hashMap);
    }
}
