package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* renamed from: com.google.android.gms.internal.ads.ub */
/* loaded from: classes2.dex */
final class C7189ub {

    /* renamed from: a */
    @VisibleForTesting
    private static Boolean f20627a;

    private C7189ub() {
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m15926a(WebView webView, String str) {
        if (PlatformVersion.m14642f() && m15927b(webView)) {
            webView.evaluateJavascript(str, null);
        } else {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m15927b(WebView webView) {
        boolean booleanValue;
        synchronized (C7189ub.class) {
            if (f20627a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f20627a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f20627a = Boolean.FALSE;
                }
            }
            booleanValue = f20627a.booleanValue();
        }
        return booleanValue;
    }
}
