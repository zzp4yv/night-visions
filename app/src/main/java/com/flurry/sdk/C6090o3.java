package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.DigestOutputStream;

/* renamed from: com.flurry.sdk.o3 */
/* loaded from: classes2.dex */
public final class C6090o3 {
    /* renamed from: a */
    public final synchronized byte[] m13226a(InterfaceC6144u6 interfaceC6144u6) {
        byte[] bArr;
        DataOutputStream dataOutputStream;
        bArr = null;
        try {
            C5993d6 c5993d6 = new C5993d6();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(640);
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, c5993d6);
            dataOutputStream = new DataOutputStream(digestOutputStream);
            try {
                C5988d1.m13030c(3, "FrameSerializer", "Adding frame " + interfaceC6144u6.mo12961a() + " payload " + interfaceC6144u6.mo13296d());
                dataOutputStream.writeByte(interfaceC6144u6.mo13297e());
                int i2 = interfaceC6144u6.mo12961a().f16372T;
                byte[] bArr2 = {(byte) (i2 >> 16), (byte) (i2 >> 8), (byte) (i2 >> 0), 0};
                for (int i3 = 0; i3 < 3; i3++) {
                    dataOutputStream.write(bArr2[i3]);
                }
                dataOutputStream.writeLong(interfaceC6144u6.mo13295c());
                dataOutputStream.writeLong(interfaceC6144u6.mo13294b());
                byte[] bytes = interfaceC6144u6.mo13296d().getBytes("UTF-8");
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                if (interfaceC6144u6.mo13299g()) {
                    digestOutputStream.on(false);
                    dataOutputStream.writeInt(c5993d6.m13046a());
                }
                dataOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                try {
                    C5988d1.m13031d(3, "FrameSerializer", "Error when generating report", th);
                    return bArr;
                } finally {
                    C5980c2.m12990f(dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
        return bArr;
    }
}
