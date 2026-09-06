package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class zzaqo extends zzfn implements zzaqn {
    /* renamed from: h7 */
    public static zzaqn m16879h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzaqn ? (zzaqn) queryLocalInterface : new zzaqp(iBinder);
    }
}
