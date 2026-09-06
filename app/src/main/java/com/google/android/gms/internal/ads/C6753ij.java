package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ij */
/* loaded from: classes2.dex */
final class C6753ij {

    /* renamed from: a */
    private static boolean f19382a = false;

    /* renamed from: b */
    private static MessageDigest f19383b;

    /* renamed from: c */
    private static final Object f19384c = new Object();

    /* renamed from: d */
    private static final Object f19385d = new Object();

    /* renamed from: e */
    static CountDownLatch f19386e = new CountDownLatch(1);

    /* renamed from: a */
    private static zzbp.zza m15343a(zzbp.zza.zzd zzdVar) {
        zzbp.zza.C11431zza m18013k0 = zzbp.zza.m18013k0();
        m18013k0.m18067N(zzdVar.mo17879i());
        return (zzbp.zza) ((zzdob) m18013k0.mo19736p0());
    }

    /* renamed from: c */
    private static Vector<byte[]> m15345c(byte[] bArr, int i2) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i4, bArr.length - i4 > 255 ? i4 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    private static byte[] m15346d(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i2 = z ? 239 : 255;
        if (bArr.length > i2) {
            bArr = m15343a(zzbp.zza.zzd.PSN_ENCODE_SIZE_FAIL).mo19587g();
        }
        if (bArr.length < i2) {
            byte[] bArr2 = new byte[i2 - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2 + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2 + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(m15347e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (InterfaceC7014pl interfaceC7014pl : new zzcl().f24520N2) {
            interfaceC7014pl.mo14952a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzdmh(str.getBytes("UTF-8")).m19583a(bArr3);
        }
        return bArr3;
    }

    /* renamed from: e */
    public static byte[] m15347e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f19384c) {
            MessageDigest m15349g = m15349g();
            if (m15349g == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            m15349g.reset();
            m15349g.update(bArr);
            digest = f19383b.digest();
        }
        return digest;
    }

    /* renamed from: f */
    static void m15348f() {
        synchronized (f19385d) {
            if (!f19382a) {
                f19382a = true;
                new Thread(new RunnableC6606ek()).start();
            }
        }
    }

    /* renamed from: g */
    private static MessageDigest m15349g() {
        boolean z;
        MessageDigest messageDigest;
        m15348f();
        try {
            z = f19386e.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f19383b) != null) {
            return messageDigest;
        }
        return null;
    }

    /* renamed from: h */
    static String m15350h(zzbp.zza zzaVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] m15346d;
        byte[] mo19587g = zzaVar.mo19587g();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21871t2)).booleanValue()) {
            Vector<byte[]> m15345c = m15345c(mo19587g, 255);
            if (m15345c == null || m15345c.size() == 0) {
                m15346d = m15346d(m15343a(zzbp.zza.zzd.PSN_ENCODE_SIZE_FAIL).mo19587g(), str, true);
            } else {
                zzbp.zzg.zza m18215B = zzbp.zzg.m18215B();
                Iterator<byte[]> it = m15345c.iterator();
                while (it.hasNext()) {
                    m18215B.m18223v(zzdmr.m19596D(m15346d(it.next(), str, false)));
                }
                m18215B.m18224w(zzdmr.m19596D(m15347e(mo19587g)));
                m15346d = ((zzbp.zzg) ((zzdob) m18215B.mo19736p0())).mo19587g();
            }
        } else {
            if (C7064qy.f20415a == null) {
                throw new GeneralSecurityException();
            }
            m15346d = ((zzbp.zzg) ((zzdob) zzbp.zzg.m18215B().m18223v(zzdmr.m19596D(C7064qy.f20415a.mo15822a(mo19587g, str != null ? str.getBytes() : new byte[0]))).m18222u(zzbw.TINK_HYBRID).mo19736p0())).mo19587g();
        }
        return zzcg.m18756a(m15346d, true);
    }
}
