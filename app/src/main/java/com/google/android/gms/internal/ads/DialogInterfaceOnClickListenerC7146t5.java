package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.t5 */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC7146t5 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ RunnableC7109s5 f20558f;

    DialogInterfaceOnClickListenerC7146t5(RunnableC7109s5 runnableC7109s5) {
        this.f20558f = runnableC7109s5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzk.zzlg();
        zzaxi.m17157j(this.f20558f.f20499f, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
