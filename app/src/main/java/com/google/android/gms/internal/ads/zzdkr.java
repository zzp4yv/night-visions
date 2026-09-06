package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzdkr {
    /* renamed from: a */
    private static BigInteger m19558a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: b */
    public static KeyPair m19559b(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator m19569b = zzdkx.f25636h.m19569b("EC");
        m19569b.initialize(eCParameterSpec);
        return m19569b.generateKeyPair();
    }

    /* renamed from: c */
    public static ECPrivateKey m19560c(zzdkt zzdktVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzdkx.f25637i.m19569b("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m19562e(zzdktVar)));
    }

    /* renamed from: d */
    public static ECPublicKey m19561d(zzdkt zzdktVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec m19562e = m19562e(zzdktVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m19565h(eCPoint, m19562e.getCurve());
        return (ECPublicKey) zzdkx.f25637i.m19569b("EC").generatePublic(new ECPublicKeySpec(eCPoint, m19562e));
    }

    /* renamed from: e */
    public static ECParameterSpec m19562e(zzdkt zzdktVar) throws NoSuchAlgorithmException {
        int i2 = C6985ot.f20213b[zzdktVar.ordinal()];
        if (i2 == 1) {
            return m19563f("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 == 2) {
            return m19563f("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (i2 == 3) {
            return m19563f("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        String valueOf = String.valueOf(zzdktVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("curve not implemented:");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: f */
    private static ECParameterSpec m19563f(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: g */
    static void m19564g(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        m19565h(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* renamed from: h */
    static void m19565h(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger m19558a = m19558a(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(m19558a) != -1) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(m19558a) != -1) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(m19558a).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(m19558a))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: i */
    public static byte[] m19566i(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        m19565h(eCPoint, eCPrivateKey.getParams().getCurve());
        ECParameterSpec params = eCPrivateKey.getParams();
        params.getCurve();
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, params));
        KeyAgreement m19569b = zzdkx.f25635g.m19569b("ECDH");
        m19569b.init(eCPrivateKey);
        try {
            m19569b.doPhase(generatePublic, true);
            byte[] generateSecret = m19569b.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m19558a(curve)) != -1) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger m19558a = m19558a(curve);
            BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(m19558a);
            if (m19558a.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger mod2 = mod.mod(m19558a);
            BigInteger bigInteger2 = null;
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (m19558a.testBit(0) && m19558a.testBit(1)) {
                    bigInteger2 = mod2.modPow(m19558a.add(BigInteger.ONE).shiftRight(2), m19558a);
                } else if (m19558a.testBit(0) && !m19558a.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = m19558a.subtract(bigInteger2).shiftRight(1);
                    int i2 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(m19558a);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, m19558a);
                        BigInteger bigInteger4 = BigInteger.ONE;
                        if (modPow.add(bigInteger4).equals(m19558a)) {
                            BigInteger shiftRight2 = m19558a.add(bigInteger4).shiftRight(1);
                            BigInteger bigInteger5 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(m19558a).multiply(mod3)).mod(m19558a);
                                BigInteger mod4 = multiply.add(multiply).mod(m19558a);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger5.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(m19558a);
                                    bigInteger4 = bigInteger2.multiply(mod4).add(bigInteger5).mod(m19558a);
                                    bigInteger5 = mod5;
                                } else {
                                    bigInteger4 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger5;
                        } else {
                            if (!modPow.equals(bigInteger4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigInteger2 = bigInteger2.add(bigInteger4);
                            i2++;
                            if (i2 == 128 && !m19558a.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(m19558a).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger3 = bigInteger2;
            }
            if (true != bigInteger3.testBit(0)) {
                m19558a.subtract(bigInteger3).mod(m19558a);
            }
            return generateSecret;
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }

    /* renamed from: j */
    public static int m19567j(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (m19558a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }
}
