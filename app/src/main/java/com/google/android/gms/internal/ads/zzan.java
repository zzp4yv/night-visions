package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzan implements zzb {

    /* renamed from: a */
    private final Map<String, C7217v2> f22170a;

    /* renamed from: b */
    private long f22171b;

    /* renamed from: c */
    private final File f22172c;

    /* renamed from: d */
    private final int f22173d;

    public zzan(File file, int i2) {
        this.f22170a = new LinkedHashMap(16, 0.75f, true);
        this.f22171b = 0L;
        this.f22172c = file;
        this.f22173d = i2;
    }

    /* renamed from: b */
    private final synchronized void m16727b(String str) {
        boolean delete = m16741p(str).delete();
        m16728c(str);
        if (!delete) {
            zzag.m16526a("Could not delete cache entry for key=%s, filename=%s", str, m16740o(str));
        }
    }

    /* renamed from: c */
    private final void m16728c(String str) {
        C7217v2 remove = this.f22170a.remove(str);
        if (remove != null) {
            this.f22171b -= remove.f20710a;
        }
    }

    /* renamed from: d */
    private static int m16729d(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: e */
    private static InputStream m16730e(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: f */
    static String m16731f(C7328y2 c7328y2) throws IOException {
        return new String(m16736k(c7328y2, m16739n(c7328y2)), "UTF-8");
    }

    /* renamed from: g */
    static void m16732g(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write(i2 >>> 24);
    }

    /* renamed from: h */
    static void m16733h(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    /* renamed from: i */
    static void m16734i(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m16733h(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: j */
    private final void m16735j(String str, C7217v2 c7217v2) {
        if (this.f22170a.containsKey(str)) {
            this.f22171b += c7217v2.f20710a - this.f22170a.get(str).f20710a;
        } else {
            this.f22171b += c7217v2.f20710a;
        }
        this.f22170a.put(str, c7217v2);
    }

    /* renamed from: k */
    private static byte[] m16736k(C7328y2 c7328y2, long j2) throws IOException {
        long m16052a = c7328y2.m16052a();
        if (j2 >= 0 && j2 <= m16052a) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(c7328y2).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(m16052a);
        throw new IOException(sb.toString());
    }

    /* renamed from: l */
    static int m16737l(InputStream inputStream) throws IOException {
        return (m16729d(inputStream) << 24) | m16729d(inputStream) | 0 | (m16729d(inputStream) << 8) | (m16729d(inputStream) << 16);
    }

    /* renamed from: m */
    static List<zzl> m16738m(C7328y2 c7328y2) throws IOException {
        int m16737l = m16737l(c7328y2);
        if (m16737l < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(m16737l);
            throw new IOException(sb.toString());
        }
        List<zzl> emptyList = m16737l == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i2 = 0; i2 < m16737l; i2++) {
            emptyList.add(new zzl(m16731f(c7328y2).intern(), m16731f(c7328y2).intern()));
        }
        return emptyList;
    }

    /* renamed from: n */
    static long m16739n(InputStream inputStream) throws IOException {
        return (m16729d(inputStream) & 255) | 0 | ((m16729d(inputStream) & 255) << 8) | ((m16729d(inputStream) & 255) << 16) | ((m16729d(inputStream) & 255) << 24) | ((m16729d(inputStream) & 255) << 32) | ((m16729d(inputStream) & 255) << 40) | ((m16729d(inputStream) & 255) << 48) | ((255 & m16729d(inputStream)) << 56);
    }

    /* renamed from: o */
    private static String m16740o(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: p */
    private final File m16741p(String str) {
        return new File(this.f22172c, m16740o(str));
    }

    @Override // com.google.android.gms.internal.ads.zzb
    /* renamed from: a */
    public final synchronized void mo16742a() {
        long length;
        C7328y2 c7328y2;
        if (!this.f22172c.exists()) {
            if (!this.f22172c.mkdirs()) {
                zzag.m16527b("Unable to create cache dir %s", this.f22172c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f22172c.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                c7328y2 = new C7328y2(new BufferedInputStream(m16730e(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                C7217v2 m15951b = C7217v2.m15951b(c7328y2);
                m15951b.f20710a = length;
                m16735j(m15951b.f20711b, m15951b);
                c7328y2.close();
            } catch (Throwable th) {
                c7328y2.close();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    /* renamed from: u */
    public final synchronized zzc mo16743u(String str) {
        C7217v2 c7217v2 = this.f22170a.get(str);
        if (c7217v2 == null) {
            return null;
        }
        File m16741p = m16741p(str);
        try {
            C7328y2 c7328y2 = new C7328y2(new BufferedInputStream(m16730e(m16741p)), m16741p.length());
            try {
                C7217v2 m15951b = C7217v2.m15951b(c7328y2);
                if (!TextUtils.equals(str, m15951b.f20711b)) {
                    zzag.m16526a("%s: key=%s, found=%s", m16741p.getAbsolutePath(), str, m15951b.f20711b);
                    m16728c(str);
                    return null;
                }
                byte[] m16736k = m16736k(c7328y2, c7328y2.m16052a());
                zzc zzcVar = new zzc();
                zzcVar.f23917a = m16736k;
                zzcVar.f23918b = c7217v2.f20712c;
                zzcVar.f23919c = c7217v2.f20713d;
                zzcVar.f23920d = c7217v2.f20714e;
                zzcVar.f23921e = c7217v2.f20715f;
                zzcVar.f23922f = c7217v2.f20716g;
                List<zzl> list = c7217v2.f20717h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzl zzlVar : list) {
                    treeMap.put(zzlVar.m20195a(), zzlVar.m20196b());
                }
                zzcVar.f23923g = treeMap;
                zzcVar.f23924h = Collections.unmodifiableList(c7217v2.f20717h);
                return zzcVar;
            } finally {
                c7328y2.close();
            }
        } catch (IOException e2) {
            zzag.m16526a("%s: %s", m16741p.getAbsolutePath(), e2.toString());
            m16727b(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    /* renamed from: v */
    public final synchronized void mo16744v(String str, zzc zzcVar) {
        long j2;
        long j3 = this.f22171b;
        byte[] bArr = zzcVar.f23917a;
        long length = j3 + bArr.length;
        int i2 = this.f22173d;
        if (length <= i2 || bArr.length <= i2 * 0.9f) {
            File m16741p = m16741p(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m16741p));
                C7217v2 c7217v2 = new C7217v2(str, zzcVar);
                if (!c7217v2.m15952a(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    zzag.m16526a("Failed to write header for %s", m16741p.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(zzcVar.f23917a);
                bufferedOutputStream.close();
                c7217v2.f20710a = m16741p.length();
                m16735j(str, c7217v2);
                if (this.f22171b >= this.f22173d) {
                    if (zzag.f21996b) {
                        zzag.m16528c("Pruning old cache entries.", new Object[0]);
                    }
                    long j4 = this.f22171b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, C7217v2>> it = this.f22170a.entrySet().iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j2 = elapsedRealtime;
                            break;
                        }
                        C7217v2 value = it.next().getValue();
                        if (m16741p(value.f20711b).delete()) {
                            j2 = elapsedRealtime;
                            this.f22171b -= value.f20710a;
                        } else {
                            j2 = elapsedRealtime;
                            String str2 = value.f20711b;
                            zzag.m16526a("Could not delete cache entry for key=%s, filename=%s", str2, m16740o(str2));
                        }
                        it.remove();
                        i3++;
                        if (this.f22171b < this.f22173d * 0.9f) {
                            break;
                        } else {
                            elapsedRealtime = j2;
                        }
                    }
                    if (zzag.f21996b) {
                        zzag.m16528c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.f22171b - j4), Long.valueOf(SystemClock.elapsedRealtime() - j2));
                    }
                }
            } catch (IOException unused) {
                if (m16741p.delete()) {
                    return;
                }
                zzag.m16526a("Could not clean up file %s", m16741p.getAbsolutePath());
            }
        }
    }

    public zzan(File file) {
        this(file, 5242880);
    }
}
