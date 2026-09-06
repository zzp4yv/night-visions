package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.flurry.sdk.u */
/* loaded from: classes2.dex */
public final class C6137u extends C5994d7<C6129t> {

    /* renamed from: p */
    public boolean f16392p;

    /* renamed from: q */
    private boolean f16393q;

    /* renamed from: r */
    private boolean f16394r;

    /* renamed from: s */
    private Location f16395s;

    /* renamed from: t */
    private C6031h7 f16396t;

    /* renamed from: u */
    protected InterfaceC6013f7<C6040i7> f16397u;

    /* renamed from: com.flurry.sdk.u$a */
    final class a implements InterfaceC6013f7<C6040i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6040i7 c6040i7) {
            C6137u.this.f16394r = c6040i7.f16000b == EnumC6022g7.FOREGROUND;
            if (C6137u.this.f16394r) {
                C6137u.this.m13317F();
            }
        }
    }

    /* renamed from: com.flurry.sdk.u$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f16399h;

        b(InterfaceC6013f7 interfaceC6013f7) {
            this.f16399h = interfaceC6013f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            Location m13314x = C6137u.this.m13314x();
            if (m13314x != null) {
                C6137u.this.f16395s = m13314x;
            }
            this.f16399h.mo12962a(new C6129t(C6137u.this.f16392p, C6137u.this.f16393q, C6137u.this.f16395s));
        }
    }

    public C6137u(C6031h7 c6031h7) {
        super("LocationProvider");
        this.f16392p = true;
        this.f16393q = false;
        this.f16394r = false;
        a aVar = new a();
        this.f16397u = aVar;
        this.f16396t = c6031h7;
        c6031h7.mo13050v(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: x */
    public Location m13314x() {
        if (this.f16392p && this.f16394r) {
            if (!C6089o2.m13225a("android.permission.ACCESS_FINE_LOCATION") && !C6089o2.m13225a("android.permission.ACCESS_COARSE_LOCATION")) {
                this.f16393q = false;
                return null;
            }
            String str = C6089o2.m13225a("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
            this.f16393q = true;
            LocationManager locationManager = (LocationManager) C5969b0.m12964a().getSystemService("location");
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
        }
        return null;
    }

    /* renamed from: F */
    public final void m13317F() {
        Location m13314x = m13314x();
        if (m13314x != null) {
            this.f16395s = m13314x;
        }
        m13048t(new C6129t(this.f16392p, this.f16393q, this.f16395s));
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<C6129t> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
        mo13007m(new b(interfaceC6013f7));
    }
}
