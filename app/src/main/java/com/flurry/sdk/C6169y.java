package com.flurry.sdk;

/* renamed from: com.flurry.sdk.y */
/* loaded from: classes2.dex */
public final class C6169y extends C5994d7<C6161x> {

    /* renamed from: p */
    public String f16517p;

    /* renamed from: q */
    public boolean f16518q;

    /* renamed from: r */
    private C6031h7 f16519r;

    /* renamed from: s */
    protected InterfaceC6013f7<C6040i7> f16520s;

    /* renamed from: com.flurry.sdk.y$a */
    final class a implements InterfaceC6013f7<C6040i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6040i7 c6040i7) {
            C6169y c6169y = C6169y.this;
            c6169y.m13048t(new C6161x(c6169y.f16517p, C6169y.this.f16518q));
        }
    }

    /* renamed from: com.flurry.sdk.y$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f16522h;

        /* renamed from: i */
        final /* synthetic */ C6161x f16523i;

        b(InterfaceC6013f7 interfaceC6013f7, C6161x c6161x) {
            this.f16522h = interfaceC6013f7;
            this.f16523i = c6161x;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            this.f16522h.mo12962a(this.f16523i);
        }
    }

    public C6169y(C6031h7 c6031h7) {
        super("NotificationProvider");
        this.f16518q = false;
        a aVar = new a();
        this.f16520s = aVar;
        this.f16519r = c6031h7;
        c6031h7.mo13050v(aVar);
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<C6161x> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
        mo13007m(new b(interfaceC6013f7, new C6161x(this.f16517p, this.f16518q)));
    }
}
