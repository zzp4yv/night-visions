package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.w3 */
/* loaded from: classes2.dex */
final /* synthetic */ class C7255w3 implements zzbaf {

    /* renamed from: a */
    static final zzbaf f20826a = new C7255w3();

    private C7255w3() {
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    /* renamed from: a */
    public final Object mo15160a(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof zzatz ? (zzatz) queryLocalInterface : new zzaua(iBinder);
    }
}
