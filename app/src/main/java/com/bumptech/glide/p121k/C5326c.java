package com.bumptech.glide.p121k;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* renamed from: com.bumptech.glide.k.c */
/* loaded from: classes.dex */
final class C5326c {

    /* renamed from: a */
    static final Charset f13164a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f13165b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m10103a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    static void m10104b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m10104b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
