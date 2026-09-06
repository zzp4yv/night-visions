package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xj */
/* loaded from: classes2.dex */
final /* synthetic */ class CallableC7308xj implements Callable {

    /* renamed from: f */
    private final zzcja f20975f;

    private CallableC7308xj(zzcja zzcjaVar) {
        this.f20975f = zzcjaVar;
    }

    /* renamed from: a */
    static Callable m16044a(zzcja zzcjaVar) {
        return new CallableC7308xj(zzcjaVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f20975f.getWritableDatabase();
    }
}
