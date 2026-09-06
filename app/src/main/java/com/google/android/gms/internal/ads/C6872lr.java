package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.lr */
/* loaded from: classes2.dex */
final class C6872lr extends zzdbt<zzdbj, zzdhi, zzdhk> {
    public C6872lr() {
        super(zzdbj.class, zzdhi.class, zzdhk.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdhi zzdhiVar) throws GeneralSecurityException {
        zzdlx.m19578b(zzdhiVar.m19513x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdhk zzdhkVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdhi zzdhiVar) throws GeneralSecurityException {
        zzdhi zzdhiVar2 = zzdhiVar;
        String m19519x = zzdhiVar2.m19512C().m19519x();
        return new zzdcs(zzdhiVar2.m19512C().m19520y(), zzdbx.m19192a(m19519x).m19191b(m19519x));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdhi mo15147n(zzdhk zzdhkVar) throws GeneralSecurityException {
        return (zzdhi) ((zzdob) zzdhi.m19507D().m19514u(zzdhkVar).m19515v(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdhi mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdhi.m19509F(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdhk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdhk.m19517B(zzdmrVar);
    }
}
