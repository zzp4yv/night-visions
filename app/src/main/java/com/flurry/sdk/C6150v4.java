package com.flurry.sdk;

import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.v4 */
/* loaded from: classes2.dex */
public final class C6150v4 implements InterfaceC6013f7<C6161x> {

    /* renamed from: a */
    private String f16451a;

    C6150v4() {
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6161x c6161x) {
        C6161x c6161x2 = c6161x;
        String str = c6161x2.f16504a;
        boolean z = c6161x2.f16505b;
        if (str == null || str.equals(this.f16451a) || !z) {
            return;
        }
        C6015g0.m13065a();
        C6015g0.m13068f("Log Notification Frame", Collections.emptyMap());
        this.f16451a = str;
        C6071m2.m13180a().m13181b(new C6183z5(new C5966a6(str, z)));
    }
}
