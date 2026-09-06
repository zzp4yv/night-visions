package com.bumptech.glide.p141p;

/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: com.bumptech.glide.p.b */
/* loaded from: classes.dex */
public final class C5526b implements InterfaceC5529e, InterfaceC5528d {

    /* renamed from: f */
    private final InterfaceC5529e f13935f;

    /* renamed from: g */
    private InterfaceC5528d f13936g;

    /* renamed from: h */
    private InterfaceC5528d f13937h;

    public C5526b(InterfaceC5529e interfaceC5529e) {
        this.f13935f = interfaceC5529e;
    }

    /* renamed from: n */
    private boolean m10921n(InterfaceC5528d interfaceC5528d) {
        return interfaceC5528d.equals(this.f13936g) || (this.f13936g.mo10933h() && interfaceC5528d.equals(this.f13937h));
    }

    /* renamed from: o */
    private boolean m10922o() {
        InterfaceC5529e interfaceC5529e = this.f13935f;
        return interfaceC5529e == null || interfaceC5529e.mo10938m(this);
    }

    /* renamed from: p */
    private boolean m10923p() {
        InterfaceC5529e interfaceC5529e = this.f13935f;
        return interfaceC5529e == null || interfaceC5529e.mo10932g(this);
    }

    /* renamed from: q */
    private boolean m10924q() {
        InterfaceC5529e interfaceC5529e = this.f13935f;
        return interfaceC5529e == null || interfaceC5529e.mo10935j(this);
    }

    /* renamed from: r */
    private boolean m10925r() {
        InterfaceC5529e interfaceC5529e = this.f13935f;
        return interfaceC5529e != null && interfaceC5529e.mo10927b();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: a */
    public void mo10926a(InterfaceC5528d interfaceC5528d) {
        if (!interfaceC5528d.equals(this.f13937h)) {
            if (this.f13937h.isRunning()) {
                return;
            }
            this.f13937h.mo10929d();
        } else {
            InterfaceC5529e interfaceC5529e = this.f13935f;
            if (interfaceC5529e != null) {
                interfaceC5529e.mo10926a(this);
            }
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: b */
    public boolean mo10927b() {
        return m10925r() || mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: c */
    public void mo10928c() {
        this.f13936g.mo10928c();
        this.f13937h.mo10928c();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    public void clear() {
        this.f13936g.clear();
        if (this.f13937h.isRunning()) {
            this.f13937h.clear();
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: d */
    public void mo10929d() {
        if (this.f13936g.isRunning()) {
            return;
        }
        this.f13936g.mo10929d();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: e */
    public boolean mo10930e(InterfaceC5528d interfaceC5528d) {
        if (!(interfaceC5528d instanceof C5526b)) {
            return false;
        }
        C5526b c5526b = (C5526b) interfaceC5528d;
        return this.f13936g.mo10930e(c5526b.f13936g) && this.f13937h.mo10930e(c5526b.f13937h);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: f */
    public boolean mo10931f() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: g */
    public boolean mo10932g(InterfaceC5528d interfaceC5528d) {
        return m10923p() && m10921n(interfaceC5528d);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: h */
    public boolean mo10933h() {
        return this.f13936g.mo10933h() && this.f13937h.mo10933h();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: i */
    public boolean mo10934i() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10934i();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    public boolean isRunning() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).isRunning();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: j */
    public boolean mo10935j(InterfaceC5528d interfaceC5528d) {
        return m10924q() && m10921n(interfaceC5528d);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: k */
    public void mo10936k(InterfaceC5528d interfaceC5528d) {
        InterfaceC5529e interfaceC5529e = this.f13935f;
        if (interfaceC5529e != null) {
            interfaceC5529e.mo10936k(this);
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: l */
    public boolean mo10937l() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10937l();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: m */
    public boolean mo10938m(InterfaceC5528d interfaceC5528d) {
        return m10922o() && m10921n(interfaceC5528d);
    }

    /* renamed from: s */
    public void m10939s(InterfaceC5528d interfaceC5528d, InterfaceC5528d interfaceC5528d2) {
        this.f13936g = interfaceC5528d;
        this.f13937h = interfaceC5528d2;
    }
}
