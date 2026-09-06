package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzha;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes2.dex */
final class C7524o extends zzx.AbstractRunnableC7600a {

    /* renamed from: j */
    private final /* synthetic */ zzha f27855j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27856k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7524o(zzx zzxVar, zzha zzhaVar) {
        super(zzxVar);
        this.f27856k = zzxVar;
        this.f27855j = zzhaVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void mo20969a() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.measurement.zzx r1 = r4.f27856k
            java.util.List r1 = com.google.android.gms.internal.measurement.zzx.m22568N(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            com.google.android.gms.measurement.internal.zzha r1 = r4.f27855j
            com.google.android.gms.internal.measurement.zzx r2 = r4.f27856k
            java.util.List r2 = com.google.android.gms.internal.measurement.zzx.m22568N(r2)
            java.lang.Object r2 = r2.get(r0)
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.first
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzx r0 = r4.f27856k
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzx.m22589z(r0)
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r0, r1)
            return
        L2f:
            int r0 = r0 + 1
            goto L1
        L32:
            com.google.android.gms.internal.measurement.zzx$b r0 = new com.google.android.gms.internal.measurement.zzx$b
            com.google.android.gms.measurement.internal.zzha r1 = r4.f27855j
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzx r1 = r4.f27856k
            java.util.List r1 = com.google.android.gms.internal.measurement.zzx.m22568N(r1)
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.measurement.internal.zzha r3 = r4.f27855j
            r2.<init>(r3, r0)
            r1.add(r2)
            com.google.android.gms.internal.measurement.zzx r1 = r4.f27856k
            com.google.android.gms.internal.measurement.zzm r1 = com.google.android.gms.internal.measurement.zzx.m22564F(r1)
            r1.registerOnMeasurementEventListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7524o.mo20969a():void");
    }
}
