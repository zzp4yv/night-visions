package com.flurry.sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.flurry.sdk.x6 */
/* loaded from: classes2.dex */
public final class C6168x6 {
    /* renamed from: a */
    public static boolean m13371a(C6160w6 c6160w6) {
        return new File(c6160w6.f16502a, c6160w6.f16503b).delete();
    }

    /* renamed from: b */
    public static boolean m13372b(C6160w6 c6160w6, C6160w6 c6160w62) {
        FileChannel fileChannel;
        File file;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            File file2 = new File(c6160w6.f16502a, c6160w6.f16503b);
            file = new File(c6160w62.f16502a, c6160w62.f16503b);
            file.getParentFile().mkdirs();
            file.delete();
            channel = new FileInputStream(file2).getChannel();
        } catch (Exception e2) {
            e = e2;
            fileChannel = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(file).getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            C5980c2.m12990f(channel);
            C5980c2.m12990f(fileChannel2);
            return true;
        } catch (Exception e3) {
            e = e3;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            try {
                C5988d1.m13030c(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                C5980c2.m12990f(fileChannel2);
                C5980c2.m12990f(fileChannel);
                return false;
            } catch (Throwable th2) {
                th = th2;
                C5980c2.m12990f(fileChannel2);
                C5980c2.m12990f(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            FileChannel fileChannel4 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel4;
            C5980c2.m12990f(fileChannel2);
            C5980c2.m12990f(fileChannel);
            throw th;
        }
    }

    /* renamed from: c */
    public static boolean m13373c(File file, File file2) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            file2.getParentFile().mkdirs();
            file2.delete();
            file2.createNewFile();
            channel = new FileInputStream(file).getChannel();
        } catch (Exception e2) {
            e = e2;
            fileChannel = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(file2).getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            C5980c2.m12990f(channel);
            C5980c2.m12990f(fileChannel2);
            return true;
        } catch (Exception e3) {
            e = e3;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            try {
                C5988d1.m13030c(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                C5980c2.m12990f(fileChannel2);
                C5980c2.m12990f(fileChannel);
                return false;
            } catch (Throwable th2) {
                th = th2;
                C5980c2.m12990f(fileChannel2);
                C5980c2.m12990f(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            FileChannel fileChannel4 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel4;
            C5980c2.m12990f(fileChannel2);
            C5980c2.m12990f(fileChannel);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m13374d(C6160w6 c6160w6, C6160w6 c6160w62) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3 = null;
        try {
            File file = new File(c6160w6.f16502a, c6160w6.f16503b);
            FileChannel channel = new FileInputStream(new File(c6160w62.f16502a, c6160w62.f16503b)).getChannel();
            try {
                fileChannel3 = new FileOutputStream(file, true).getChannel();
                fileChannel3.transferFrom(channel, fileChannel3.size(), channel.size());
                C5980c2.m12990f(channel);
                C5980c2.m12990f(fileChannel3);
                return true;
            } catch (Exception unused) {
                FileChannel fileChannel4 = fileChannel3;
                fileChannel3 = channel;
                fileChannel2 = fileChannel4;
                C5980c2.m12990f(fileChannel3);
                C5980c2.m12990f(fileChannel2);
                return false;
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel5 = fileChannel3;
                fileChannel3 = channel;
                fileChannel = fileChannel5;
                C5980c2.m12990f(fileChannel3);
                C5980c2.m12990f(fileChannel);
                throw th;
            }
        } catch (Exception unused2) {
            fileChannel2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }
}
