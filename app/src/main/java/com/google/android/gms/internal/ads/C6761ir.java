package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ir */
/* loaded from: classes2.dex */
final class C6761ir extends zzdbt<zzdbj, zzdet, zzdev> {
    public C6761ir() {
        super(zzdbj.class, zzdet.class, zzdev.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
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
    protected final /* synthetic */ void mo15144j(zzdet zzdetVar) throws GeneralSecurityException {
        zzdet zzdetVar2 = zzdetVar;
        zzdlx.m19578b(zzdetVar2.m19304x(), 0);
        zzdlx.m19577a(zzdetVar2.m19303C().size());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdev zzdevVar) throws GeneralSecurityException {
        zzdlx.m19577a(zzdevVar.m19309x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    protected final /* synthetic */ zzdbj mo15146l(zzdet zzdetVar) throws GeneralSecurityException {
        return new zzdjm(zzdetVar.m19303C().m19603c());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    protected final /* synthetic */ zzdet mo15147n(zzdev zzdevVar) throws GeneralSecurityException {
        return (zzdet) ((zzdob) zzdet.m19298D().m19305u(zzdmr.m19596D(zzdlo.m19575c(zzdevVar.m19309x()))).m19306v(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdet mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdet.m19297B(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdev mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdev.m19307y(zzdmrVar);
    }
}
