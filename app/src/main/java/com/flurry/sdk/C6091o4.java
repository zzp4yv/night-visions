package com.flurry.sdk;

import p241e.p252d.p253a.AbstractC8742a;

/* renamed from: com.flurry.sdk.o4 */
/* loaded from: classes2.dex */
public final class C6091o4 implements InterfaceC6013f7<AbstractC8742a> {
    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(AbstractC8742a abstractC8742a) {
        AbstractC8742a abstractC8742a2 = abstractC8742a;
        if (abstractC8742a2 == null) {
            C5988d1.m13041n("ConsentFrame", "Consent is null, do not send the frame.");
        } else {
            C6071m2.m13180a().m13181b(new C6065l5(new C6074m5(abstractC8742a2.m27925b(), abstractC8742a2.m27924a())));
        }
    }
}
