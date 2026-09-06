package com.bumptech.glide.load.engine.p124b0;

import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: RuntimeCompat.java */
/* renamed from: com.bumptech.glide.load.engine.b0.b */
/* loaded from: classes.dex */
final class C5351b {

    /* compiled from: RuntimeCompat.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.b$a */
    class a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f13299a;

        a(Pattern pattern) {
            this.f13299a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f13299a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m10223a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m10224b(), availableProcessors) : availableProcessors;
    }

    /* renamed from: b */
    private static int m10224b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new a(Pattern.compile("cpu[0-9]+")));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("GlideRuntimeCompat", 6)) {
                    Log.e("GlideRuntimeCompat", "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
