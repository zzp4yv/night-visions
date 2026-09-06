package com.flurry.sdk;

import com.flurry.sdk.C6080n2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.z4 */
/* loaded from: classes2.dex */
public final class C6182z4 implements InterfaceC6013f7<C5996e> {
    C6182z4() {
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C5996e c5996e) {
        C5996e c5996e2 = c5996e;
        if (c5996e2 == null) {
            C5988d1.m13030c(2, "SessionInfoFrame", "Session info data is null, do not send the frame.");
        } else {
            C6078n0.m13190a();
            int i2 = C6080n2.a.AGENT_REPORT_TYPE_MAIN_DEVICE.f16174j;
            C6077n c6077n = c5996e2.f15805d;
            if (c6077n != null && c6077n.f16150a) {
                i2 = C6080n2.a.AGENT_REPORT_TYPE_INSTANT_APP.f16174j;
            }
            C6071m2.m13180a().m13181b(new C6075m6(new C6084n6(c5996e2.f15802a, i2, c5996e2.f15803b, c5996e2.f15804c)));
        }
        C5988d1.m13030c(4, "SessionInfoObserver", "SessionInfoData".concat(String.valueOf(c5996e2)));
    }
}
