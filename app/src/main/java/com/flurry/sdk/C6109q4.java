package com.flurry.sdk;

import android.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.q4 */
/* loaded from: classes2.dex */
public final class C6109q4 implements InterfaceC6013f7<C6059l> {
    C6109q4() {
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6059l c6059l) {
        C6059l c6059l2 = c6059l;
        boolean z = c6059l2.f16102b;
        Map<EnumC6068m, String> m13171a = c6059l2.m13171a();
        if (m13171a == null || m13171a.size() == 0) {
            C5988d1.m13030c(2, "ReportedIDFrame", "Reported ids is empty, do not send the frame.");
        } else {
            C6071m2.m13180a().m13181b(new C6039i6(new C6048j6(m13171a, z)));
        }
        Map<EnumC6068m, String> m13171a2 = c6059l2.m13171a();
        HashMap hashMap = new HashMap();
        for (Map.Entry<EnumC6068m, String> entry : m13171a2.entrySet()) {
            if (entry.getKey().equals(EnumC6068m.AndroidInstallationId)) {
                hashMap.put(entry.getKey().name(), C5980c2.m12987c(Base64.decode(entry.getValue(), 2)).toUpperCase(Locale.getDefault()));
            } else {
                hashMap.put(entry.getKey().name(), entry.getValue());
            }
        }
        C6015g0.m13065a();
        C6015g0.m13068f("Reported Ids", hashMap);
        C5988d1.m13030c(4, "IdObserver", "IdProvider" + c6059l2.m13171a());
    }
}
