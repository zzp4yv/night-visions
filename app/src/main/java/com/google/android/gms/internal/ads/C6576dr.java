package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.dr */
/* loaded from: classes2.dex */
final class C6576dr implements zzdbk<zzdbj> {
    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: a */
    public final zzdcc<zzdbj> mo15077a() {
        return new zzdck();
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: b */
    public final zzdbs<zzdbj> mo15078b(String str, String str2, int i2) throws GeneralSecurityException {
        zzdbs<zzdbj> c6909mr;
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("aead")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        switch (str) {
            case "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key":
                c6909mr = new C6909mr();
                break;
            case "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key":
                c6909mr = new C6798jr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey":
                c6909mr = new C6650fr();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsAeadKey":
                c6909mr = new C6835kr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesEaxKey":
                c6909mr = new C6724hr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesGcmKey":
                c6909mr = new C6761ir();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey":
                c6909mr = new C6872lr();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
        }
        if (c6909mr.mo15142H0() >= i2) {
            return c6909mr;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
    }
}
