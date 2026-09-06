package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6149v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p241e.p252d.p253a.EnumC8745d;

/* renamed from: com.flurry.sdk.u3 */
/* loaded from: classes2.dex */
public final class C6141u3 extends AbstractC6120r6 {

    /* renamed from: e */
    private static final AtomicInteger f16406e = new AtomicInteger(0);

    private C6141u3(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    public static EnumC8745d m13318h(String str, C6149v3.a aVar, Map<String, String> map, boolean z, boolean z2, long j2, long j3) {
        HashMap hashMap;
        if (map.size() > 10) {
            hashMap = new HashMap();
            hashMap.put("fl.parameter.limit.exceeded", String.valueOf(map.size()));
            map.clear();
        } else {
            hashMap = null;
        }
        C6071m2.m13180a().m13181b(new C6141u3(new C6149v3(C5980c2.m12986b(str), f16406e.incrementAndGet(), aVar, map, hashMap, new ArrayList(), z, z2, j2, j3)));
        return EnumC8745d.kFlurryEventRecorded;
    }

    /* renamed from: i */
    public static C6141u3 m13319i(String str, int i2, Map<String, String> map, Map<String, String> map2, long j2, long j3) {
        return new C6141u3(new C6149v3(str, i2, C6149v3.a.CUSTOM, map, map2, true, false, j2, SystemClock.elapsedRealtime(), j3));
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.ANALYTICS_EVENT;
    }
}
