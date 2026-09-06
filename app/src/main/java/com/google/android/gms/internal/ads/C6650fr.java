package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fr */
/* loaded from: classes2.dex */
final class C6650fr extends zzdbt<zzdbj, zzddr, zzddt> {
    public C6650fr() throws GeneralSecurityException {
        super(zzdbj.class, zzddr.class, zzddt.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzdcf.m19215j(new C6687gr());
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
    protected final /* synthetic */ void mo15144j(zzddr zzddrVar) throws GeneralSecurityException {
        zzdlx.m19578b(zzddrVar.m19240x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzddt zzddtVar) throws GeneralSecurityException {
        zzdlx.m19577a(zzddtVar.m19246x().m19269x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzddr zzddrVar) throws GeneralSecurityException {
        zzddr zzddrVar2 = zzddrVar;
        return new zzdkw((zzdlk) zzdcf.m19213h("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddrVar2.m19238E(), zzdlk.class), (zzdby) zzdcf.m19213h("type.googleapis.com/google.crypto.tink.HmacKey", zzddrVar2.m19239F(), zzdby.class), zzddrVar2.m19239F().m19393D().m19406y());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzddr mo15147n(zzddt zzddtVar) throws GeneralSecurityException {
        zzddt zzddtVar2 = zzddtVar;
        zzdeb zzdebVar = (zzdeb) zzdcf.m19210e("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddtVar2.m19246x());
        return (zzddr) ((zzdob) zzddr.m19233G().m19241u(zzdebVar).m19242v((zzdgl) zzdcf.m19210e("type.googleapis.com/google.crypto.tink.HmacKey", zzddtVar2.m19247y())).m19243w(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzddr mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzddr.m19235I(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzddt mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzddt.m19244A(zzdmrVar);
    }
}
