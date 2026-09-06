package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.db */
/* loaded from: classes2.dex */
final class C6560db implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC6486bb f18512a;

    C6560db(ViewTreeObserverOnGlobalLayoutListenerC6486bb viewTreeObserverOnGlobalLayoutListenerC6486bb) {
        this.f18512a = viewTreeObserverOnGlobalLayoutListenerC6486bb;
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
                synchronized (this.f18512a) {
                    i2 = this.f18512a.f18275I;
                    if (i2 != parseInt) {
                        this.f18512a.f18275I = parseInt;
                        this.f18512a.requestLayout();
                    }
                }
            } catch (Exception e2) {
                zzbad.m17348d("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
