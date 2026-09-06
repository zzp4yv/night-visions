package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.vr */
/* loaded from: classes2.dex */
final class C7242vr extends zzdbt<zzdby, zzdgl, zzdgn> {
    public C7242vr() {
        super(zzdby.class, zzdgl.class, zzdgn.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    /* renamed from: r */
    private static void m15956r(zzdgp zzdgpVar) throws GeneralSecurityException {
        if (zzdgpVar.m19406y() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i2 = C7279wr.f20868a[zzdgpVar.m19405x().ordinal()];
        if (i2 == 1) {
            if (zzdgpVar.m19406y() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i2 == 2) {
            if (zzdgpVar.m19406y() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i2 != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzdgpVar.m19406y() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
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
    protected final /* synthetic */ void mo15144j(zzdgl zzdglVar) throws GeneralSecurityException {
        zzdgl zzdglVar2 = zzdglVar;
        zzdlx.m19578b(zzdglVar2.m19394x(), 0);
        if (zzdglVar2.m19392C().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m15956r(zzdglVar2.m19393D());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdgn zzdgnVar) throws GeneralSecurityException {
        zzdgn zzdgnVar2 = zzdgnVar;
        if (zzdgnVar2.m19401x() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m15956r(zzdgnVar2.m19402y());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdby mo15146l(zzdgl zzdglVar) throws GeneralSecurityException {
        zzdgl zzdglVar2 = zzdglVar;
        zzdgj m19405x = zzdglVar2.m19393D().m19405x();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdglVar2.m19392C().m19603c(), "HMAC");
        int m19406y = zzdglVar2.m19393D().m19406y();
        int i2 = C7279wr.f20868a[m19405x.ordinal()];
        if (i2 == 1) {
            return new zzdll("HMACSHA1", secretKeySpec, m19406y);
        }
        if (i2 == 2) {
            return new zzdll("HMACSHA256", secretKeySpec, m19406y);
        }
        if (i2 == 3) {
            return new zzdll("HMACSHA512", secretKeySpec, m19406y);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdgl mo15147n(zzdgn zzdgnVar) throws GeneralSecurityException {
        zzdgn zzdgnVar2 = zzdgnVar;
        return (zzdgl) ((zzdob) zzdgl.m19384E().m19397w(0).m19396v(zzdgnVar2.m19402y()).m19395u(zzdmr.m19596D(zzdlo.m19575c(zzdgnVar2.m19401x()))).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdgl mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdgl.m19388I(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdgn mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgn.m19399B(zzdmrVar);
    }
}
