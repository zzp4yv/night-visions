package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzdj {

    /* renamed from: a */
    private static Cipher f25583a;

    /* renamed from: b */
    private static final Object f25584b = new Object();

    /* renamed from: c */
    private static final Object f25585c = new Object();

    /* renamed from: d */
    private final SecureRandom f25586d = null;

    public zzdj(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    private static Cipher m19542a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f25585c) {
            if (f25583a == null) {
                f25583a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f25583a;
        }
        return cipher;
    }

    /* renamed from: b */
    public final byte[] m19543b(byte[] bArr, String str) throws zzdk {
        byte[] doFinal;
        if (bArr.length != 16) {
            throw new zzdk(this);
        }
        try {
            byte[] m18757b = zzcg.m18757b(str, false);
            if (m18757b.length <= 16) {
                throw new zzdk(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(m18757b.length);
            allocate.put(m18757b);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[m18757b.length - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f25584b) {
                m19542a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = m19542a().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e2) {
            throw new zzdk(this, e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new zzdk(this, e3);
        } catch (InvalidKeyException e4) {
            throw new zzdk(this, e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new zzdk(this, e5);
        } catch (BadPaddingException e6) {
            throw new zzdk(this, e6);
        } catch (IllegalBlockSizeException e7) {
            throw new zzdk(this, e7);
        } catch (NoSuchPaddingException e8) {
            throw new zzdk(this, e8);
        }
    }

    /* renamed from: c */
    public final byte[] m19544c(String str) throws zzdk {
        try {
            byte[] m18757b = zzcg.m18757b(str, false);
            if (m18757b.length != 32) {
                throw new zzdk(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(m18757b, 4, 16).get(bArr);
            for (int i2 = 0; i2 < 16; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e2) {
            throw new zzdk(this, e2);
        }
    }

    /* renamed from: d */
    public final String m19545d(byte[] bArr, byte[] bArr2) throws zzdk {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new zzdk(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f25584b) {
                m19542a().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m19542a().doFinal(bArr2);
                iv = m19542a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length];
            allocate.get(bArr3);
            return zzcg.m18756a(bArr3, false);
        } catch (InvalidKeyException e2) {
            throw new zzdk(this, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new zzdk(this, e3);
        } catch (BadPaddingException e4) {
            throw new zzdk(this, e4);
        } catch (IllegalBlockSizeException e5) {
            throw new zzdk(this, e5);
        } catch (NoSuchPaddingException e6) {
            throw new zzdk(this, e6);
        }
    }
}
