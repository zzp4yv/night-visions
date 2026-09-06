package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.or */
/* loaded from: classes2.dex */
final class C6983or extends zzdbt<zzdbq, zzdfx, zzdgh> {
    public C6983or() {
        super(zzdbq.class, zzdfx.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdfx zzdfxVar) throws GeneralSecurityException {
        zzdfx zzdfxVar2 = zzdfxVar;
        zzdlx.m19578b(zzdfxVar2.m19367x(), 0);
        C7131sr.m15851d(zzdfxVar2.m19366E());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdgh zzdghVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    protected final /* synthetic */ zzdbq mo15146l(zzdfx zzdfxVar) throws GeneralSecurityException {
        zzdfx zzdfxVar2 = zzdfxVar;
        zzdft m19366E = zzdfxVar2.m19366E();
        zzdfz m19334x = m19366E.m19334x();
        return new zzdkc(zzdkr.m19561d(C7131sr.m15848a(m19334x.m19375y()), zzdfxVar2.m19364C().m19603c(), zzdfxVar2.m19365D().m19603c()), m19334x.m19376z().m19603c(), C7131sr.m15850c(m19334x.m19374x()), C7131sr.m15849b(m19366E.m19336z()), new C7205ur(m19366E.m19335y().m19328x()));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdfx mo15147n(zzdgh zzdghVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdfx mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdfx.m19361M(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdgh mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.m19380y(zzdmrVar);
    }
}
