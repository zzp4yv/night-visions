package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzaru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzarw();

    /* renamed from: f */
    @SafeParcelable.Field
    private ParcelFileDescriptor f22408f;

    /* renamed from: g */
    private Parcelable f22409g = null;

    /* renamed from: h */
    private boolean f22410h = true;

    @SafeParcelable.Constructor
    public zzaru(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f22408f = parcelFileDescriptor;
    }

    /* renamed from: W */
    private final ParcelFileDescriptor m16898W() {
        if (this.f22408f == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f22409g.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f22408f = m16899z(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f22408f;
    }

    /* renamed from: z */
    private final <T> ParcelFileDescriptor m16899z(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        try {
            createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
        }
        try {
            new Thread(new RunnableC7070r3(this, autoCloseOutputStream, bArr)).start();
            return createPipe[0];
        } catch (IOException e3) {
            e = e3;
            zzbad.m17347c("Error transporting the ad response", e);
            zzk.zzlk().m17052e(e, "LargeParcelTeleporter.pipeData.2");
            IOUtils.m14630a(autoCloseOutputStream);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        m16898W();
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 2, this.f22408f, i2, false);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    /* renamed from: y */
    public final <T extends SafeParcelable> T m16900y(Parcelable.Creator<T> creator) {
        if (this.f22410h) {
            if (this.f22408f == null) {
                zzbad.m17351g("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f22408f));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.m14630a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f22409g = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f22410h = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e2) {
                    zzbad.m17347c("Could not read from parcel file descriptor", e2);
                    IOUtils.m14630a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.m14630a(dataInputStream);
                throw th2;
            }
        }
        return (T) this.f22409g;
    }
}
