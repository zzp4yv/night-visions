package com.flurry.sdk;

/* renamed from: com.flurry.sdk.u2 */
/* loaded from: classes2.dex */
final class C6140u2 extends AbstractC5981c3 implements InterfaceC6164x2 {

    /* renamed from: com.flurry.sdk.u2$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6144u6 f16404h;

        a(InterfaceC6144u6 interfaceC6144u6) {
            this.f16404h = interfaceC6144u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6140u2.this.m13002w(this.f16404h);
        }
    }

    C6140u2(InterfaceC6164x2 interfaceC6164x2) {
        super("BufferModule", interfaceC6164x2);
    }

    @Override // com.flurry.sdk.AbstractC5981c3
    /* renamed from: b */
    protected final void mo12956b(InterfaceC6144u6 interfaceC6144u6) {
        mo13007m(new a(interfaceC6144u6));
    }
}
