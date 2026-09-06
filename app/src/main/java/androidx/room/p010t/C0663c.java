package androidx.room.p010t;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.AbstractC0651j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1011e;

/* compiled from: DBUtil.java */
/* renamed from: androidx.room.t.c */
/* loaded from: classes.dex */
public class C0663c {
    /* renamed from: a */
    public static void m4674a(InterfaceC1008b interfaceC1008b) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo6460u0 = interfaceC1008b.mo6460u0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo6460u0.moveToNext()) {
            try {
                arrayList.add(mo6460u0.getString(0));
            } catch (Throwable th) {
                mo6460u0.close();
                throw th;
            }
        }
        mo6460u0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC1008b.mo6461v("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m4675b(AbstractC0651j abstractC0651j, InterfaceC1011e interfaceC1011e, boolean z, CancellationSignal cancellationSignal) {
        Cursor query = abstractC0651j.query(interfaceC1011e, cancellationSignal);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C0662b.m4672a(abstractWindowedCursor) : query;
    }

    /* renamed from: c */
    public static int m4676c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i2 = allocate.getInt();
            channel.close();
            return i2;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
