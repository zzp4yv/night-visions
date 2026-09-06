package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.nr */
/* loaded from: classes2.dex */
final class C6946nr extends zzdbt<zzdbp, zzdfv, zzdfr> implements zzdbs<zzdbp> {
    public C6946nr() {
        super(zzdbp.class, zzdfv.class, zzdfr.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdfv zzdfvVar) throws GeneralSecurityException {
        zzdfv zzdfvVar2 = zzdfvVar;
        zzdlx.m19578b(zzdfvVar2.m19348x(), 0);
        C7131sr.m15851d(zzdfvVar2.m19347E().m19366E());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdfr zzdfrVar) throws GeneralSecurityException {
        C7131sr.m15851d(zzdfrVar.m19331x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbp mo15146l(zzdfv zzdfvVar) throws GeneralSecurityException {
        zzdfv zzdfvVar2 = zzdfvVar;
        zzdft m19366E = zzdfvVar2.m19347E().m19366E();
        zzdfz m19334x = m19366E.m19334x();
        return new zzdkb(zzdkr.m19560c(C7131sr.m15848a(m19334x.m19375y()), zzdfvVar2.m19346D().m19603c()), m19334x.m19376z().m19603c(), C7131sr.m15850c(m19334x.m19374x()), C7131sr.m15849b(m19366E.m19336z()), new C7205ur(m19366E.m19335y().m19328x()));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdfv mo15147n(zzdfr zzdfrVar) throws GeneralSecurityException {
        zzdfr zzdfrVar2 = zzdfrVar;
        KeyPair m19559b = zzdkr.m19559b(zzdkr.m19562e(C7131sr.m15848a(zzdfrVar2.m19331x().m19334x().m19375y())));
        ECPublicKey eCPublicKey = (ECPublicKey) m19559b.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) m19559b.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (zzdfv) ((zzdob) zzdfv.m19340F().m19351w(0).m19349u((zzdfx) ((zzdob) zzdfx.m19354F().m19368A(0).m19371w(zzdfrVar2.m19331x()).m19369u(zzdmr.m19596D(w.getAffineX().toByteArray())).m19370v(zzdmr.m19596D(w.getAffineY().toByteArray())).mo19736p0())).m19350v(zzdmr.m19596D(eCPrivateKey.getS().toByteArray())).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdfv mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdfv.m19342H(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdfr mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdfr.m19330z(zzdmrVar);
    }
}
