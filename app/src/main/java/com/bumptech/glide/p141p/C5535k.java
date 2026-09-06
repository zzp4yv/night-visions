package com.bumptech.glide.p141p;

/* compiled from: ThumbnailRequestCoordinator.java */
/* renamed from: com.bumptech.glide.p.k */
/* loaded from: classes.dex */
public class C5535k implements InterfaceC5529e, InterfaceC5528d {

    /* renamed from: f */
    private final InterfaceC5529e f13986f;

    /* renamed from: g */
    private InterfaceC5528d f13987g;

    /* renamed from: h */
    private InterfaceC5528d f13988h;

    /* renamed from: i */
    private boolean f13989i;

    C5535k() {
        this(null);
    }

    /* renamed from: n */
    private boolean m10972n() {
        InterfaceC5529e interfaceC5529e = this.f13986f;
        return interfaceC5529e == null || interfaceC5529e.mo10938m(this);
    }

    /* renamed from: o */
    private boolean m10973o() {
        InterfaceC5529e interfaceC5529e = this.f13986f;
        return interfaceC5529e == null || interfaceC5529e.mo10932g(this);
    }

    /* renamed from: p */
    private boolean m10974p() {
        InterfaceC5529e interfaceC5529e = this.f13986f;
        return interfaceC5529e == null || interfaceC5529e.mo10935j(this);
    }

    /* renamed from: q */
    private boolean m10975q() {
        InterfaceC5529e interfaceC5529e = this.f13986f;
        return interfaceC5529e != null && interfaceC5529e.mo10927b();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: a */
    public void mo10926a(InterfaceC5528d interfaceC5528d) {
        InterfaceC5529e interfaceC5529e;
        if (interfaceC5528d.equals(this.f13987g) && (interfaceC5529e = this.f13986f) != null) {
            interfaceC5529e.mo10926a(this);
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: b */
    public boolean mo10927b() {
        return m10975q() || mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: c */
    public void mo10928c() {
        this.f13987g.mo10928c();
        this.f13988h.mo10928c();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    public void clear() {
        this.f13989i = false;
        this.f13988h.clear();
        this.f13987g.clear();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: d */
    public void mo10929d() {
        this.f13989i = true;
        if (!this.f13987g.mo10937l() && !this.f13988h.isRunning()) {
            this.f13988h.mo10929d();
        }
        if (!this.f13989i || this.f13987g.isRunning()) {
            return;
        }
        this.f13987g.mo10929d();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: e */
    public boolean mo10930e(InterfaceC5528d interfaceC5528d) {
        if (!(interfaceC5528d instanceof C5535k)) {
            return false;
        }
        C5535k c5535k = (C5535k) interfaceC5528d;
        InterfaceC5528d interfaceC5528d2 = this.f13987g;
        if (interfaceC5528d2 == null) {
            if (c5535k.f13987g != null) {
                return false;
            }
        } else if (!interfaceC5528d2.mo10930e(c5535k.f13987g)) {
            return false;
        }
        InterfaceC5528d interfaceC5528d3 = this.f13988h;
        InterfaceC5528d interfaceC5528d4 = c5535k.f13988h;
        if (interfaceC5528d3 == null) {
            if (interfaceC5528d4 != null) {
                return false;
            }
        } else if (!interfaceC5528d3.mo10930e(interfaceC5528d4)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: f */
    public boolean mo10931f() {
        return this.f13987g.mo10931f() || this.f13988h.mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: g */
    public boolean mo10932g(InterfaceC5528d interfaceC5528d) {
        return m10973o() && interfaceC5528d.equals(this.f13987g) && !mo10927b();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: h */
    public boolean mo10933h() {
        return this.f13987g.mo10933h();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: i */
    public boolean mo10934i() {
        return this.f13987g.mo10934i();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    public boolean isRunning() {
        return this.f13987g.isRunning();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: j */
    public boolean mo10935j(InterfaceC5528d interfaceC5528d) {
        return m10974p() && (interfaceC5528d.equals(this.f13987g) || !this.f13987g.mo10931f());
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: k */
    public void mo10936k(InterfaceC5528d interfaceC5528d) {
        if (interfaceC5528d.equals(this.f13988h)) {
            return;
        }
        InterfaceC5529e interfaceC5529e = this.f13986f;
        if (interfaceC5529e != null) {
            interfaceC5529e.mo10936k(this);
        }
        if (this.f13988h.mo10937l()) {
            return;
        }
        this.f13988h.clear();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5528d
    /* renamed from: l */
    public boolean mo10937l() {
        return this.f13987g.mo10937l() || this.f13988h.mo10937l();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5529e
    /* renamed from: m */
    public boolean mo10938m(InterfaceC5528d interfaceC5528d) {
        return m10972n() && interfaceC5528d.equals(this.f13987g);
    }

    /* renamed from: r */
    public void m10976r(InterfaceC5528d interfaceC5528d, InterfaceC5528d interfaceC5528d2) {
        this.f13987g = interfaceC5528d;
        this.f13988h = interfaceC5528d2;
    }

    public C5535k(InterfaceC5529e interfaceC5529e) {
        this.f13986f = interfaceC5529e;
    }
}
