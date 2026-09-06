package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes2.dex */
final class RunnableC6335g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zaak f17408f;

    RunnableC6335g(zaak zaakVar) {
        this.f17408f = zaakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        googleApiAvailabilityLight = this.f17408f.f17488d;
        context = this.f17408f.f17487c;
        googleApiAvailabilityLight.m13824a(context);
    }
}
