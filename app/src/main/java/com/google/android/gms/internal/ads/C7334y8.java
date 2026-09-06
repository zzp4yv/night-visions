package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y8 */
/* loaded from: classes2.dex */
final class C7334y8 implements zzgh {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f21108a;

    C7334y8(zzbdq zzbdqVar) {
        this.f21108a = zzbdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: a */
    public final void mo15364a(boolean z, int i2) {
        int i3;
        i3 = this.f21108a.f22906w;
        if (i3 != i2) {
            this.f21108a.f22906w = i2;
            if (i2 == 4) {
                this.f21108a.m17519R();
            } else {
                if (i2 != 5) {
                    return;
                }
                this.f21108a.m17515N();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: b */
    public final void mo15365b(zzgd zzgdVar) {
        this.f21108a.m17514L("PlayerError", zzgdVar.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: c */
    public final void mo15366c() {
    }
}
