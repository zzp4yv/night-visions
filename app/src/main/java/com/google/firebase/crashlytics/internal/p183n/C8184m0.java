package com.google.firebase.crashlytics.internal.p183n;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeSessionFileGzipper.java */
/* renamed from: com.google.firebase.crashlytics.h.n.m0 */
/* loaded from: classes2.dex */
class C8184m0 {
    /* renamed from: a */
    private static void m25276a(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        C8195t.m25336g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C8195t.m25336g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    static void m25277b(File file, List<InterfaceC8182l0> list) {
        for (InterfaceC8182l0 interfaceC8182l0 : list) {
            InputStream inputStream = null;
            try {
                inputStream = interfaceC8182l0.mo25252b();
                if (inputStream != null) {
                    m25276a(inputStream, new File(file, interfaceC8182l0.mo25251a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C8195t.m25336g(null);
                throw th;
            }
            C8195t.m25336g(inputStream);
        }
    }
}
