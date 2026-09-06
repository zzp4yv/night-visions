package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kr */
/* loaded from: classes2.dex */
final class C6835kr extends zzdbt<zzdbj, zzdhe, zzdhg> {
    public C6835kr() {
        super(zzdbj.class, zzdhe.class, zzdhg.class, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
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
    protected final /* synthetic */ void mo15144j(zzdhe zzdheVar) throws GeneralSecurityException {
        zzdlx.m19578b(zzdheVar.m19498x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdhg zzdhgVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdhe zzdheVar) throws GeneralSecurityException {
        String m19504x = zzdheVar.m19497C().m19504x();
        return zzdbx.m19192a(m19504x).m19191b(m19504x);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdhe mo15147n(zzdhg zzdhgVar) throws GeneralSecurityException {
        return (zzdhe) ((zzdob) zzdhe.m19492D().m19499u(zzdhgVar).m19500v(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdhe mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdhe.m19494F(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdhg mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdhg.m19501A(zzdmrVar);
    }
}
