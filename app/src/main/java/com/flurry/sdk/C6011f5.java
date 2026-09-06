package com.flurry.sdk;

/* renamed from: com.flurry.sdk.f5 */
/* loaded from: classes2.dex */
public final class C6011f5 extends AbstractC6120r6 {

    /* renamed from: e */
    private static int f15881e;

    private C6011f5(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    public static void m13061h(int i2) {
        if (i2 == 0 || f15881e == i2) {
            return;
        }
        f15881e = i2;
        C6071m2.m13180a().m13181b(new C6011f5(new C6020g5(i2)));
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.APP_ORIENTATION;
    }
}
