package com.flurry.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.s4 */
/* loaded from: classes2.dex */
public final class C6126s4 implements InterfaceC6013f7<C6113r> {
    C6126s4() {
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6113r c6113r) {
        C6113r c6113r2 = c6113r;
        String str = c6113r2.f16297a;
        String str2 = c6113r2.f16298b;
        if ((str == null || str.isEmpty()) && (str2 == null || str2.isEmpty())) {
            C5988d1.m13030c(2, "LocaleFrame", "Locale is empty, do not send the frame.");
        } else {
            C6071m2.m13180a().m13181b(new C6173y3(new C6181z3(str, str2)));
        }
        C5988d1.m13030c(4, "LocaleObserver", "Locale language: " + c6113r2.f16297a + ". Locale country: " + c6113r2.f16298b);
    }
}
