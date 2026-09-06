package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.a5 */
/* loaded from: classes2.dex */
final class C6443a5 extends zzawv {

    /* renamed from: a */
    private Context f18081a;

    C6443a5(Context context) {
        this.f18081a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f18081a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            zzbad.m17347c("Fail to get isAdIdFakeForDebugLogging", e2);
            z = false;
        }
        zzazx.m17331l(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzbad.m17353i(sb.toString());
    }
}
