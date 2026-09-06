package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.a */
/* loaded from: classes2.dex */
final class C7440a extends zzx.AbstractRunnableC7600a {

    /* renamed from: j */
    private final /* synthetic */ String f27679j;

    /* renamed from: k */
    private final /* synthetic */ String f27680k;

    /* renamed from: l */
    private final /* synthetic */ Context f27681l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f27682m;

    /* renamed from: n */
    private final /* synthetic */ zzx f27683n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7440a(zzx zzxVar, String str, String str2, Context context, Bundle bundle) {
        super(zzxVar);
        this.f27683n = zzxVar;
        this.f27679j = str;
        this.f27680k = str2;
        this.f27681l = context;
        this.f27682m = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: RemoteException -> 0x009e, TryCatch #0 {RemoteException -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:6:0x002a, B:11:0x003f, B:13:0x0052, B:16:0x005e, B:18:0x006c, B:22:0x0081), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: RemoteException -> 0x009e, TryCatch #0 {RemoteException -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:6:0x002a, B:11:0x003f, B:13:0x0052, B:16:0x005e, B:18:0x006c, B:22:0x0081), top: B:2:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo20969a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzx r2 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.os.RemoteException -> L9e
            r3.<init>()     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx.m22579g(r2, r3)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx r2 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            java.lang.String r3 = r14.f27679j     // Catch: android.os.RemoteException -> L9e
            java.lang.String r4 = r14.f27680k     // Catch: android.os.RemoteException -> L9e
            boolean r2 = com.google.android.gms.internal.measurement.zzx.m22588y(r2, r3, r4)     // Catch: android.os.RemoteException -> L9e
            r3 = 0
            if (r2 == 0) goto L27
            java.lang.String r3 = r14.f27680k     // Catch: android.os.RemoteException -> L9e
            java.lang.String r2 = r14.f27679j     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx r4 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            java.lang.String r4 = com.google.android.gms.internal.measurement.zzx.m22589z(r4)     // Catch: android.os.RemoteException -> L9e
            r10 = r2
            r11 = r3
            r9 = r4
            goto L2a
        L27:
            r9 = r3
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.f27681l     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx.m22565H(r2)     // Catch: android.os.RemoteException -> L9e
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.zzx.m22574X()     // Catch: android.os.RemoteException -> L9e
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L9e
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = 0
            goto L3f
        L3e:
            r2 = 1
        L3f:
            com.google.android.gms.internal.measurement.zzx r3 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            android.content.Context r4 = r14.f27681l     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzm r4 = r3.m22603b(r4, r2)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx.m22576c(r3, r4)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx r3 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzm r3 = com.google.android.gms.internal.measurement.zzx.m22564F(r3)     // Catch: android.os.RemoteException -> L9e
            if (r3 != 0) goto L5e
            com.google.android.gms.internal.measurement.zzx r2 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            java.lang.String r2 = com.google.android.gms.internal.measurement.zzx.m22589z(r2)     // Catch: android.os.RemoteException -> L9e
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch: android.os.RemoteException -> L9e
            return
        L5e:
            android.content.Context r3 = r14.f27681l     // Catch: android.os.RemoteException -> L9e
            int r3 = com.google.android.gms.internal.measurement.zzx.m22567K(r3)     // Catch: android.os.RemoteException -> L9e
            android.content.Context r4 = r14.f27681l     // Catch: android.os.RemoteException -> L9e
            int r4 = com.google.android.gms.internal.measurement.zzx.m22569O(r4)     // Catch: android.os.RemoteException -> L9e
            if (r2 == 0) goto L77
            int r2 = java.lang.Math.max(r3, r4)     // Catch: android.os.RemoteException -> L9e
            if (r4 >= r3) goto L74
            r3 = 1
            goto L75
        L74:
            r3 = 0
        L75:
            r8 = r3
            goto L81
        L77:
            if (r3 <= 0) goto L7a
            r4 = r3
        L7a:
            if (r3 <= 0) goto L7e
            r2 = 1
            goto L7f
        L7e:
            r2 = 0
        L7f:
            r8 = r2
            r2 = r4
        L81:
            com.google.android.gms.internal.measurement.zzv r13 = new com.google.android.gms.internal.measurement.zzv     // Catch: android.os.RemoteException -> L9e
            r4 = 18202(0x471a, double:8.993E-320)
            long r6 = (long) r2     // Catch: android.os.RemoteException -> L9e
            android.os.Bundle r12 = r14.f27682m     // Catch: android.os.RemoteException -> L9e
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzx r2 = r14.f27683n     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzm r2 = com.google.android.gms.internal.measurement.zzx.m22564F(r2)     // Catch: android.os.RemoteException -> L9e
            android.content.Context r3 = r14.f27681l     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.m14708E0(r3)     // Catch: android.os.RemoteException -> L9e
            long r4 = r14.f28412f     // Catch: android.os.RemoteException -> L9e
            r2.initialize(r3, r13, r4)     // Catch: android.os.RemoteException -> L9e
            return
        L9e:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzx r3 = r14.f27683n
            com.google.android.gms.internal.measurement.zzx.m22582n(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7440a.mo20969a():void");
    }
}
