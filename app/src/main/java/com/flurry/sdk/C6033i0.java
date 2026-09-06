package com.flurry.sdk;

/* renamed from: com.flurry.sdk.i0 */
/* loaded from: classes2.dex */
public final class C6033i0 extends C5994d7<C6024h0> {

    /* renamed from: p */
    private C6077n f15968p;

    /* renamed from: q */
    private C5987d0 f15969q;

    /* renamed from: r */
    private C6086o f15970r;

    /* renamed from: s */
    private InterfaceC6013f7<C5978c0> f15971s;

    /* renamed from: t */
    private InterfaceC6013f7<C6077n> f15972t;

    /* renamed from: com.flurry.sdk.i0$a */
    final class a implements InterfaceC6013f7<C5978c0> {

        /* renamed from: com.flurry.sdk.i0$a$a, reason: collision with other inner class name */
        final class C11421a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ C5978c0 f15974h;

            C11421a(C5978c0 c5978c0) {
                this.f15974h = c5978c0;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6033i0.this.m13048t(this.f15974h.f15707e.equals(EnumC5997e0.SESSION_START) ? new C6024h0(true, C6033i0.this.f15968p) : new C6024h0(false, C6033i0.this.f15968p));
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C5978c0 c5978c0) {
            C6033i0.this.mo13007m(new C11421a(c5978c0));
        }
    }

    /* renamed from: com.flurry.sdk.i0$b */
    final class b implements InterfaceC6013f7<C6077n> {

        /* renamed from: com.flurry.sdk.i0$b$a */
        final class a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ C6077n f15977h;

            a(C6077n c6077n) {
                this.f15977h = c6077n;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C5988d1.m13030c(3, "SessionPropertyProvider", "Receive instant app data");
                C6033i0.this.f15968p = this.f15977h;
            }
        }

        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6077n c6077n) {
            C6033i0.this.mo13007m(new a(c6077n));
        }
    }

    public C6033i0(C5987d0 c5987d0, C6086o c6086o) {
        super("SessionPropertyProvider");
        this.f15971s = new a();
        this.f15972t = new b();
        this.f15969q = c5987d0;
        c5987d0.mo13050v(this.f15971s);
        this.f15970r = c6086o;
        c6086o.mo13050v(this.f15972t);
    }
}
