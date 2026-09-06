package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.pa */
/* loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC7003pa implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f20290f;

    DialogInterfaceOnCancelListenerC7003pa(JsPromptResult jsPromptResult) {
        this.f20290f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f20290f.cancel();
    }
}
