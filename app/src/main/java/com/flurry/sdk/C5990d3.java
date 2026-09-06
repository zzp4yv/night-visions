package com.flurry.sdk;

import com.flurry.sdk.InterfaceC6009f3;

/* renamed from: com.flurry.sdk.d3 */
/* loaded from: classes2.dex */
public final class C5990d3 implements InterfaceC6009f3 {

    /* renamed from: k */
    private int f15790k = 0;

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: a */
    public final void mo13043a() {
        this.f15790k = 0;
    }

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: b */
    public final InterfaceC6009f3.a mo13044b(InterfaceC6144u6 interfaceC6144u6) {
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.FLUSH_FRAME)) {
            return new InterfaceC6009f3.a(InterfaceC6009f3.b.DO_NOT_DROP, new C5982c4(new C5991d4(this.f15790k)));
        }
        if (!interfaceC6144u6.mo12961a().equals(EnumC6128s6.ANALYTICS_ERROR)) {
            return InterfaceC6009f3.f15851a;
        }
        if (EnumC6103p7.UNCAUGHT_EXCEPTION_ID.f16268i.equals(((C6133t3) interfaceC6144u6.mo13298f()).f16379c)) {
            return InterfaceC6009f3.f15851a;
        }
        int i2 = this.f15790k;
        this.f15790k = i2 + 1;
        return i2 >= 50 ? InterfaceC6009f3.f15858h : InterfaceC6009f3.f15851a;
    }
}
