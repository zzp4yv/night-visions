package com.bumptech.glide.load.p127m.p128o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C5336e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ThumbnailStreamOpener.java */
/* renamed from: com.bumptech.glide.load.m.o.e */
/* loaded from: classes.dex */
class C5415e {

    /* renamed from: a */
    private static final C5411a f13598a = new C5411a();

    /* renamed from: b */
    private final C5411a f13599b;

    /* renamed from: c */
    private final InterfaceC5414d f13600c;

    /* renamed from: d */
    private final InterfaceC5377b f13601d;

    /* renamed from: e */
    private final ContentResolver f13602e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f13603f;

    C5415e(List<ImageHeaderParser> list, InterfaceC5414d interfaceC5414d, InterfaceC5377b interfaceC5377b, ContentResolver contentResolver) {
        this(list, f13598a, interfaceC5414d, interfaceC5377b, contentResolver);
    }

    /* renamed from: b */
    private String m10504b(Uri uri) {
        Cursor mo10503a = this.f13600c.mo10503a(uri);
        if (mo10503a != null) {
            try {
                if (mo10503a.moveToFirst()) {
                    return mo10503a.getString(0);
                }
            } finally {
                mo10503a.close();
            }
        }
        if (mo10503a != null) {
        }
        return null;
    }

    /* renamed from: c */
    private boolean m10505c(File file) {
        return this.f13599b.m10491a(file) && 0 < this.f13599b.m10493c(file);
    }

    /* renamed from: a */
    int m10506a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f13602e.openInputStream(uri);
                int m10156a = C5336e.m10156a(this.f13603f, inputStream, this.f13601d);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m10156a;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* renamed from: d */
    public InputStream m10507d(Uri uri) throws FileNotFoundException {
        String m10504b = m10504b(uri);
        if (TextUtils.isEmpty(m10504b)) {
            return null;
        }
        File m10492b = this.f13599b.m10492b(m10504b);
        if (!m10505c(m10492b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m10492b);
        try {
            return this.f13602e.openInputStream(fromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e2));
        }
    }

    C5415e(List<ImageHeaderParser> list, C5411a c5411a, InterfaceC5414d interfaceC5414d, InterfaceC5377b interfaceC5377b, ContentResolver contentResolver) {
        this.f13599b = c5411a;
        this.f13600c = interfaceC5414d;
        this.f13601d = interfaceC5377b;
        this.f13602e = contentResolver;
        this.f13603f = list;
    }
}
