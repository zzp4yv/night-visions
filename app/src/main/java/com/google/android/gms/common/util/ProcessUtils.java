package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ProcessUtils {

    /* renamed from: a */
    private static String f17991a;

    /* renamed from: b */
    private static int f17992b;

    private ProcessUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m14653a() {
        BufferedReader bufferedReader;
        if (f17991a == null) {
            int i2 = f17992b;
            if (i2 == 0) {
                i2 = Process.myPid();
                f17992b = i2;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i2 > 0) {
                try {
                    String str2 = "/proc/" + i2 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader.readLine();
                            Preconditions.m14372k(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            IOUtils.m14630a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                IOUtils.m14630a(bufferedReader);
            }
            f17991a = str;
        }
        return f17991a;
    }
}
