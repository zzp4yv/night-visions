package com.flurry.sdk;

/* renamed from: com.flurry.sdk.t5 */
/* loaded from: classes2.dex */
public final class C6135t5 extends AbstractC6120r6 {
    private C6135t5(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    public static C6135t5 m13308h() {
        long m13257f = C6098p2.m13257f("frame.counter", 0L) + 1;
        C6098p2.m13254c("frame.counter", m13257f);
        return new C6135t5(new C6143u5(m13257f));
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.FRAME_COUNTER;
    }
}
