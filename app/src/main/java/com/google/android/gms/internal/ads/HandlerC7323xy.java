package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.xy */
/* loaded from: classes2.dex */
final class HandlerC7323xy extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C7286wy f20987a;

    HandlerC7323xy(C7286wy c7286wy) {
        this.f20987a = c7286wy;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f20987a.m15998m(message);
    }
}
