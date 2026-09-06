package com.flurry.sdk;

import com.flurry.sdk.InterfaceC6009f3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.h3 */
/* loaded from: classes2.dex */
public final class C6027h3 implements InterfaceC6009f3 {

    /* renamed from: k */
    protected static final Set<String> f15950k = new HashSet();

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: a */
    public final void mo13043a() {
        f15950k.clear();
    }

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: b */
    public final InterfaceC6009f3.a mo13044b(InterfaceC6144u6 interfaceC6144u6) {
        if (!interfaceC6144u6.mo12961a().equals(EnumC6128s6.SESSION_PROPERTIES_PARAMS)) {
            return InterfaceC6009f3.f15851a;
        }
        String str = ((C6028h4) interfaceC6144u6.mo13298f()).f15951b;
        Set<String> set = f15950k;
        if (set.size() < 10 || set.contains(str)) {
            set.add(str);
            return InterfaceC6009f3.f15851a;
        }
        C5988d1.m13042o("SessionPropertiesParamsDropRule", "MaxSessionPropertiesParams exceeded: 10");
        return InterfaceC6009f3.f15860j;
    }
}
