package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.h3 */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6700h3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ zzapo f19036f;

    DialogInterfaceOnClickListenerC6700h3(zzapo zzapoVar) {
        this.f19036f = zzapoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        Intent m16836h = this.f19036f.m16836h();
        zzk.zzlg();
        context = this.f19036f.f22224d;
        zzaxi.m17155i(context, m16836h);
    }
}
