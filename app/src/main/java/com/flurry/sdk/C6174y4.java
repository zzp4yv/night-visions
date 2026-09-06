package com.flurry.sdk;

/* renamed from: com.flurry.sdk.y4 */
/* loaded from: classes2.dex */
public final class C6174y4 implements InterfaceC6013f7<C5978c0> {
    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C5978c0 c5978c0) {
        C5978c0 c5978c02 = c5978c0;
        if (c5978c02 == null) {
            C5988d1.m13030c(2, "ReportingFrame", "Reporting data is null, do not send the frame.");
        } else {
            C6071m2.m13180a().m13181b(new C6001e4(new C6010f4(c5978c02)));
        }
    }
}
