package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.aa */
/* loaded from: classes2.dex */
final class RunnableC6448aa implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18097f;

    /* renamed from: g */
    private final /* synthetic */ String f18098g;

    /* renamed from: h */
    private final /* synthetic */ int f18099h;

    /* renamed from: i */
    private final /* synthetic */ int f18100i = 0;

    /* renamed from: j */
    private final /* synthetic */ boolean f18101j;

    /* renamed from: k */
    private final /* synthetic */ int f18102k;

    /* renamed from: l */
    private final /* synthetic */ int f18103l;

    /* renamed from: m */
    private final /* synthetic */ zzbft f18104m;

    RunnableC6448aa(zzbft zzbftVar, String str, String str2, int i2, int i3, boolean z, int i4, int i5) {
        this.f18104m = zzbftVar;
        this.f18097f = str;
        this.f18098g = str2;
        this.f18099h = i2;
        this.f18101j = z;
        this.f18102k = i4;
        this.f18103l = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f18097f);
        hashMap.put("cachedSrc", this.f18098g);
        hashMap.put("bytesLoaded", Integer.toString(this.f18099h));
        hashMap.put("totalBytes", Integer.toString(this.f18100i));
        hashMap.put("cacheReady", this.f18101j ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f18102k));
        hashMap.put("playerPreparedCount", Integer.toString(this.f18103l));
        this.f18104m.m17626r("onPrecacheEvent", hashMap);
    }
}
