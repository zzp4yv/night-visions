package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.z9 */
/* loaded from: classes2.dex */
final class RunnableC7372z9 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f21375f;

    /* renamed from: g */
    private final /* synthetic */ String f21376g;

    /* renamed from: h */
    private final /* synthetic */ int f21377h;

    /* renamed from: i */
    private final /* synthetic */ int f21378i;

    /* renamed from: j */
    private final /* synthetic */ boolean f21379j = false;

    /* renamed from: k */
    private final /* synthetic */ zzbft f21380k;

    RunnableC7372z9(zzbft zzbftVar, String str, String str2, int i2, int i3, boolean z) {
        this.f21380k = zzbftVar;
        this.f21375f = str;
        this.f21376g = str2;
        this.f21377h = i2;
        this.f21378i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f21375f);
        hashMap.put("cachedSrc", this.f21376g);
        hashMap.put("bytesLoaded", Integer.toString(this.f21377h));
        hashMap.put("totalBytes", Integer.toString(this.f21378i));
        hashMap.put("cacheReady", this.f21379j ? "1" : "0");
        this.f21380k.m17626r("onPrecacheEvent", hashMap);
    }
}
