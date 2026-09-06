package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mr */
/* loaded from: classes2.dex */
final class C6909mr extends zzdbt<zzdbj, zzdig, zzdgh> {
    public C6909mr() {
        super(zzdbj.class, zzdig.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdig zzdigVar) throws GeneralSecurityException {
        zzdig zzdigVar2 = zzdigVar;
        zzdlx.m19578b(zzdigVar2.m19539x(), 0);
        if (zzdigVar2.m19538B().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdgh zzdghVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdig zzdigVar) throws GeneralSecurityException {
        return new zzdma(zzdigVar.m19538B().m19603c());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    protected final /* synthetic */ zzdig mo15147n(zzdgh zzdghVar) throws GeneralSecurityException {
        return (zzdig) ((zzdob) zzdig.m19532C().m19541v(0).m19540u(zzdmr.m19596D(zzdlo.m19575c(32))).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdig mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdig.m19534E(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdgh mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.m19380y(zzdmrVar);
    }
}
