package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb */
/* loaded from: classes2.dex */
final class C7041qb implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC6967ob f20385a;

    C7041qb(ViewTreeObserverOnGlobalLayoutListenerC6967ob viewTreeObserverOnGlobalLayoutListenerC6967ob) {
        this.f20385a = viewTreeObserverOnGlobalLayoutListenerC6967ob;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        int i2;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f20385a) {
                    i2 = this.f20385a.f20153G;
                    if (i2 != parseInt) {
                        this.f20385a.f20153G = parseInt;
                        this.f20385a.requestLayout();
                    }
                }
            } catch (Exception e2) {
                zzbad.m17348d("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
