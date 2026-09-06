package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {

    /* renamed from: g */
    @SafeParcelable.Field
    private String f29443g;

    /* renamed from: h */
    @SafeParcelable.Field
    private DataHolder f29444h;

    /* renamed from: i */
    @SafeParcelable.Field
    private ParcelFileDescriptor f29445i;

    /* renamed from: j */
    @SafeParcelable.Field
    private long f29446j;

    /* renamed from: k */
    @SafeParcelable.Field
    private byte[] f29447k;

    /* renamed from: l */
    private byte[] f29448l;

    /* renamed from: m */
    private File f29449m;

    /* renamed from: f */
    private static final String f29442f = SafeBrowsingData.class.getSimpleName();
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.f29443g = str;
        this.f29444h = dataHolder;
        this.f29445i = parcelFileDescriptor;
        this.f29446j = j2;
        this.f29447k = bArr;
    }

    /* renamed from: i0 */
    private final FileOutputStream m23594i0() {
        Throwable th;
        File file;
        File file2 = this.f29449m;
        if (file2 == null) {
            return null;
        }
        try {
            file = File.createTempFile("xlb", ".tmp", file2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f29445i = ParcelFileDescriptor.open(file, 268435456);
                if (file != null) {
                    file.delete();
                }
                return fileOutputStream;
            } catch (IOException unused) {
                if (file != null) {
                    file.delete();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (file != null) {
                    file.delete();
                }
                throw th;
            }
        } catch (IOException unused2) {
            file = null;
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
    }

    /* renamed from: p0 */
    private static void m23595p0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: W */
    public long m23596W() {
        return this.f29446j;
    }

    /* renamed from: Y */
    public String m23597Y() {
        return this.f29443g;
    }

    /* renamed from: e0 */
    public byte[] m23598e0() {
        return this.f29447k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f29445i
            r1 = 1
            if (r0 != 0) goto L31
            byte[] r0 = r3.f29448l
            if (r0 == 0) goto L31
            java.io.FileOutputStream r0 = r3.m23594i0()
            if (r0 == 0) goto L31
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f29448l     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            int r2 = r2.length     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            byte[] r2 = r3.f29448l     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.write(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            m23595p0(r0)
            r0 = 1
            goto L32
        L29:
            r4 = move-exception
            m23595p0(r0)
            throw r4
        L2e:
            m23595p0(r0)
        L31:
            r0 = 0
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r5 = r5 | r1
        L36:
            com.google.android.gms.safetynet.zzj.m23604a(r3, r4, r5)
            r4 = 0
            r3.f29445i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }

    /* renamed from: y */
    public DataHolder m23599y() {
        return this.f29444h;
    }

    /* renamed from: z */
    public ParcelFileDescriptor m23600z() {
        return this.f29445i;
    }
}
