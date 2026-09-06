package com.flurry.sdk;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.g */
/* loaded from: classes2.dex */
public final class C6014g {

    /* renamed from: a */
    String f15883a;

    /* renamed from: b */
    final Set<String> f15884b;

    /* renamed from: com.flurry.sdk.g$a */
    final class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".flurryagent.");
        }
    }

    C6014g() {
        HashSet hashSet = new HashSet();
        hashSet.add(HttpUrl.FRAGMENT_ENCODE_SET);
        hashSet.add(null);
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        this.f15884b = Collections.unmodifiableSet(hashSet);
        this.f15883a = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: a */
    static String m13062a() {
        DataInputStream dataInputStream;
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".flurryb.");
        String str = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (1 == dataInputStream.readInt()) {
                    str = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C5988d1.m13031d(6, "DeviceIdProvider", "Error when loading deviceId", th);
                    return str;
                } finally {
                    C5980c2.m12990f(dataInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
        return str;
    }

    /* renamed from: b */
    static void m13063b(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".flurryb.");
        if (C5971b2.m12968b(fileStreamPath)) {
            DataOutputStream dataOutputStream2 = null;
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(fileStreamPath));
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeUTF(str);
                C5980c2.m12990f(dataOutputStream);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                try {
                    C5988d1.m13031d(6, "DeviceIdProvider", "Error when saving deviceId", th);
                } finally {
                    C5980c2.m12990f(dataOutputStream2);
                }
            }
        }
    }

    /* renamed from: c */
    final String m13064c() {
        String[] list;
        DataInputStream dataInputStream;
        File filesDir = C5969b0.m12964a().getFilesDir();
        String str = null;
        if (filesDir != null && (list = filesDir.list(new a())) != null && list.length != 0) {
            File fileStreamPath = C5969b0.m12964a().getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                            dataInputStream.readUTF();
                            str = dataInputStream.readUTF();
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C5988d1.m13031d(6, "DeviceIdProvider", "Error when loading deviceId", th);
                            return str;
                        } finally {
                            C5980c2.m12990f(dataInputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
                return str;
            }
        }
        return null;
    }
}
