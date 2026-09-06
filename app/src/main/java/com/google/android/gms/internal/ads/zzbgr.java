package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;

@zzard
@TargetApi(11)
/* loaded from: classes2.dex */
public final class zzbgr extends WebChromeClient {

    /* renamed from: a */
    private final zzbgz f23018a;

    public zzbgr(zzbgz zzbgzVar) {
        this.f23018a = zzbgzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Context m17663a(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            return webView.getContext();
        }
        zzbgz zzbgzVar = (zzbgz) webView;
        Activity mo14897a = zzbgzVar.mo14897a();
        return mo14897a != null ? mo14897a : zzbgzVar.getContext();
    }

    /* renamed from: b */
    private final boolean m17664b(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzbgz zzbgzVar;
        com.google.android.gms.ads.internal.zzb mo17693o;
        try {
            zzbgzVar = this.f23018a;
        } catch (WindowManager.BadTokenException e2) {
            zzbad.m17348d("Fail to display Dialog.", e2);
        }
        if (zzbgzVar != null && zzbgzVar.mo14926p() != null && this.f23018a.mo14926p().mo17693o() != null && (mo17693o = this.f23018a.mo14926p().mo17693o()) != null && !mo17693o.zzkx()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            mo17693o.zzbk(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC7077ra(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC7040qa(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC7003pa(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC6966oa(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC6929na(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC6892ma(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            zzbad.m17353i("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzd mo14918k0 = ((zzbgz) webView).mo14918k0();
        if (mo14918k0 == null) {
            zzbad.m17353i("Tried to close an AdWebView not associated with an overlay.");
        } else {
            mo14918k0.close();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = C7114sa.f20515a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            zzbad.m17351g(sb2);
        } else if (i2 == 2) {
            zzbad.m17353i(sb2);
        } else if (i2 == 3 || i2 == 4) {
            zzbad.m17352h(sb2);
        } else if (i2 != 5) {
            zzbad.m17352h(sb2);
        } else {
            zzbad.m17349e(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f23018a.mo14941z() != null) {
            webView2.setWebViewClient(this.f23018a.mo14941z());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 != 0) {
            if (j3 == 0) {
                j2 = Math.min(j2 + Math.min(131072L, j5), 1048576L);
            } else if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        } else if (j3 > j5 || j3 > 1048576) {
            j3 = 0;
        }
        quotaUpdater.updateQuota(j3);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzk.zzlg();
            if (!zzaxi.m17152f0(this.f23018a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzk.zzlg();
                if (!zzaxi.m17152f0(this.f23018a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzd mo14918k0 = this.f23018a.mo14918k0();
        if (mo14918k0 == null) {
            zzbad.m17353i("Could not get ad overlay when hiding custom view.");
        } else {
            mo14918k0.zzte();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m17664b(m17663a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.m14644h()) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21701S0)).booleanValue()) {
                zzbgz zzbgzVar = this.f23018a;
                if (zzbgzVar == null || zzbgzVar.mo14926p() == null || this.f23018a.mo14926p().mo17692n() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] mo16972d = this.f23018a.mo14926p().mo17692n().mo16972d(permissionRequest.getResources());
                if (mo16972d.length > 0) {
                    permissionRequest.grant(mo16972d);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzd mo14918k0 = this.f23018a.mo14918k0();
        if (mo14918k0 == null) {
            zzbad.m17353i("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            mo14918k0.zza(view, customViewCallback);
            mo14918k0.setRequestedOrientation(i2);
        }
    }
}
