package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdcs implements zzdbj {

    /* renamed from: a */
    private static final byte[] f25483a = new byte[0];

    /* renamed from: b */
    private final zzdgw f25484b;

    /* renamed from: c */
    private final zzdbj f25485c;

    public zzdcs(zzdgw zzdgwVar, zzdbj zzdbjVar) {
        this.f25484b = zzdgwVar;
        this.f25485c = zzdbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] mo19587g = zzdcf.m19219n(this.f25484b).mo19587g();
        byte[] mo15598a = this.f25485c.mo15598a(mo19587g, f25483a);
        byte[] mo15598a2 = ((zzdbj) zzdcf.m19214i(this.f25484b.m19426x(), mo19587g, zzdbj.class)).mo15598a(bArr, bArr2);
        return ByteBuffer.allocate(mo15598a.length + 4 + mo15598a2.length).putInt(mo15598a.length).put(mo15598a).put(mo15598a2).array();
    }
}
