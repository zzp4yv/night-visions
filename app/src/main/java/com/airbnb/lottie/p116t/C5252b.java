package com.airbnb.lottie.p116t;

import android.content.Context;
import cm.aptoide.p092pt.utils.MultiDexHelper;
import com.airbnb.lottie.C5154c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0955e;

/* compiled from: NetworkCache.java */
/* renamed from: com.airbnb.lottie.t.b */
/* loaded from: classes.dex */
class C5252b {

    /* renamed from: a */
    private final Context f12894a;

    /* renamed from: b */
    private final String f12895b;

    C5252b(Context context, String str) {
        this.f12894a = context.getApplicationContext();
        this.f12895b = str;
    }

    /* renamed from: b */
    private static String m9762b(String str, EnumC5251a enumC5251a, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET));
        sb.append(z ? enumC5251a.f12893i : enumC5251a.m9761g());
        return sb.toString();
    }

    /* renamed from: c */
    private File m9763c(String str) throws FileNotFoundException {
        File file = new File(this.f12894a.getCacheDir(), m9762b(str, EnumC5251a.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f12894a.getCacheDir(), m9762b(str, EnumC5251a.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    C0955e<EnumC5251a, InputStream> m9764a() {
        try {
            File m9763c = m9763c(this.f12895b);
            if (m9763c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m9763c);
            EnumC5251a enumC5251a = m9763c.getAbsolutePath().endsWith(MultiDexHelper.EXTRACTED_SUFFIX) ? EnumC5251a.Zip : EnumC5251a.Json;
            C5154c.m9392b("Cache hit for " + this.f12895b + " at " + m9763c.getAbsolutePath());
            return new C0955e<>(enumC5251a, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    void m9765d(EnumC5251a enumC5251a) {
        File file = new File(this.f12894a.getCacheDir(), m9762b(this.f12895b, enumC5251a, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
        boolean renameTo = file.renameTo(file2);
        C5154c.m9392b("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        C5154c.m9394d("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* renamed from: e */
    File m9766e(InputStream inputStream, EnumC5251a enumC5251a) throws IOException {
        File file = new File(this.f12894a.getCacheDir(), m9762b(this.f12895b, enumC5251a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
