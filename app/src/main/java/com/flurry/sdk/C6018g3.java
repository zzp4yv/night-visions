package com.flurry.sdk;

import com.flurry.sdk.InterfaceC6009f3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.g3 */
/* loaded from: classes2.dex */
public final class C6018g3 implements InterfaceC6009f3 {

    /* renamed from: k */
    private static final Set<String> f15913k = new HashSet();

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: a */
    public final void mo13043a() {
    }

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: b */
    public final InterfaceC6009f3.a mo13044b(InterfaceC6144u6 interfaceC6144u6) {
        if (!interfaceC6144u6.mo12961a().equals(EnumC6128s6.ORIGIN_ATTRIBUTE)) {
            return InterfaceC6009f3.f15851a;
        }
        String str = ((C5984c6) interfaceC6144u6.mo13298f()).f15738b;
        Set<String> set = f15913k;
        if (set.size() < 10 || set.contains(str)) {
            set.add(str);
            return InterfaceC6009f3.f15851a;
        }
        C5988d1.m13042o("OriginAttributeDropRule", "MaxOrigins exceeded: " + set.size());
        return InterfaceC6009f3.f15859i;
    }
}
