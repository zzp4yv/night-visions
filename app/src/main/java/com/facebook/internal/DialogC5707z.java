package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.DialogC5667r0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog.kt */
/* renamed from: com.facebook.internal.z */
/* loaded from: classes2.dex */
public final class DialogC5707z extends DialogC5667r0 {

    /* renamed from: v */
    public static final a f14649v = new a(null);

    /* renamed from: w */
    private static final String f14650w = DialogC5707z.class.getName();

    /* renamed from: x */
    private boolean f14651x;

    /* compiled from: FacebookWebFallbackDialog.kt */
    /* renamed from: com.facebook.internal.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final DialogC5707z m11831a(Context context, String str, String str2) {
            C9768m.m32346f(context, "context");
            C9768m.m32346f(str, "url");
            C9768m.m32346f(str2, "expectedRedirectUrl");
            DialogC5667r0.b bVar = DialogC5667r0.f14506f;
            DialogC5667r0.m11667p(context);
            return new DialogC5707z(context, str, str2, null);
        }
    }

    private DialogC5707z(Context context, String str, String str2) {
        super(context, str);
        m11672A(str2);
    }

    public /* synthetic */ DialogC5707z(Context context, String str, String str2, C9756g c9756g) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m11829E(DialogC5707z dialogC5707z) {
        C9768m.m32346f(dialogC5707z, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.DialogC5667r0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView m11674o = m11674o();
        if (!m11676r() || m11675q() || m11674o == null || !m11674o.isShown()) {
            super.cancel();
        } else {
            if (this.f14651x) {
                return;
            }
            this.f14651x = true;
            m11674o.loadUrl(C9768m.m32354n("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC5707z.m11829E(DialogC5707z.this);
                }
            }, 1500L);
        }
    }

    @Override // com.facebook.internal.DialogC5667r0
    /* renamed from: w */
    public Bundle mo11677w(String str) {
        Uri parse = Uri.parse(str);
        C5663p0 c5663p0 = C5663p0.f14478a;
        Bundle m11585o0 = C5663p0.m11585o0(parse.getQuery());
        String string = m11585o0.getString("bridge_args");
        m11585o0.remove("bridge_args");
        if (!C5663p0.m11557a0(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                C5668s c5668s = C5668s.f14535a;
                m11585o0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C5668s.m11699a(jSONObject));
            } catch (JSONException e2) {
                C5663p0 c5663p02 = C5663p0.f14478a;
                C5663p0.m11577k0(f14650w, "Unable to parse bridge_args JSON", e2);
            }
        }
        String string2 = m11585o0.getString("method_results");
        m11585o0.remove("method_results");
        C5663p0 c5663p03 = C5663p0.f14478a;
        if (!C5663p0.m11557a0(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                C5668s c5668s2 = C5668s.f14535a;
                m11585o0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C5668s.m11699a(jSONObject2));
            } catch (JSONException e3) {
                C5663p0 c5663p04 = C5663p0.f14478a;
                C5663p0.m11577k0(f14650w, "Unable to parse bridge_args JSON", e3);
            }
        }
        m11585o0.remove("version");
        C5653k0 c5653k0 = C5653k0.f14437a;
        m11585o0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C5653k0.m11477s());
        return m11585o0;
    }
}
