package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: classes2.dex */
final class RunnableC6330d0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C6328c0 f17402f;

    RunnableC6330d0(C6328c0 c6328c0) {
        this.f17402f = c6328c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        client = this.f17402f.f17399a.f17356g;
        client.disconnect();
    }
}
