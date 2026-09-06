package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.x4 */
/* loaded from: classes2.dex */
public final class C6166x4 implements InterfaceC6013f7<C6177z> {
    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6177z c6177z) {
        C6177z c6177z2 = c6177z;
        String str = c6177z2.f16530a;
        String str2 = c6177z2.f16531b;
        Map map = c6177z2.f16532c;
        if (map == null) {
            map = new HashMap();
        }
        map.put("fl.origin.attribute.version", str2);
        if (map.size() > 10) {
            int size = map.size();
            C5988d1.m13041n("OriginAttributeFrame", "MaxOriginParams exceeded: ".concat(String.valueOf(size)));
            map.clear();
            map.put("fl.parameter.limit.exceeded", String.valueOf(size));
        }
        C6071m2.m13180a().m13181b(new C5975b6(new C5984c6(str, map)));
        C5988d1.m13030c(4, "OriginAttributeObserver", "Origin attribute name: " + c6177z2.f16530a + ". Origin attribute version: " + c6177z2.f16531b + ". Origin attribute params: " + c6177z2.f16532c);
    }
}
