package com.flurry.sdk;

/* renamed from: com.flurry.sdk.a5 */
/* loaded from: classes2.dex */
public final class C5965a5 implements InterfaceC6013f7<C6024h0> {
    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6024h0 c6024h0) {
        C6024h0 c6024h02 = c6024h0;
        C5988d1.m13030c(3, "SessionPropertyObserver", "Log session property frame");
        if (c6024h02 == null) {
            C5988d1.m13030c(2, "SessionPropertiesFrame", "Session property data is null, do not send the frame.");
        } else {
            C6071m2.m13180a().m13181b(new C6037i4(new C6046j4(C6037i4.m13114h(c6024h02))));
        }
    }
}
