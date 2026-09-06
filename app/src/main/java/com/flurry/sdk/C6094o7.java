package com.flurry.sdk;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.o7 */
/* loaded from: classes2.dex */
public final class C6094o7 {
    /* renamed from: a */
    public static Map<String, String> m13230a() {
        HashMap hashMap = new HashMap();
        m13231b(hashMap);
        m13232c(hashMap);
        m13234e(hashMap);
        m13237h(hashMap);
        m13238i(hashMap);
        m13233d(hashMap);
        m13235f(hashMap);
        m13236g(hashMap);
        return hashMap;
    }

    /* renamed from: b */
    private static void m13231b(Map<String, String> map) {
        try {
            map.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e2) {
            C5988d1.m13031d(6, "CrashParameterCollector", "Error retrieving max memory", e2);
        }
    }

    /* renamed from: c */
    private static void m13232c(Map<String, String> map) {
        try {
            Debug.getMemoryInfo(new Debug.MemoryInfo());
            map.put("mem.pss", Long.toString(r0.getTotalPss() * 1024));
        } catch (RuntimeException e2) {
            C5988d1.m13031d(6, "CrashParameterCollector", "Error retrieving pss memory", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r7 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r7 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10.put("mem.virt.max", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r10.put("mem.virt", r1);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13233d(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6094o7.m13233d(java.util.Map):void");
    }

    /* renamed from: e */
    private static void m13234e(Map<String, String> map) {
        map.put("application.state", Integer.toString(C6004e7.m13055a().f15830j.m13094y().f15931j));
    }

    /* renamed from: f */
    private static void m13235f(Map<String, String> map) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        map.put("disk.size.free", Long.toString((i2 >= 18 ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks()) * (i2 >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())));
    }

    /* renamed from: g */
    private static void m13236g(Map<String, String> map) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        map.put("disk.size.total", Long.toString((i2 >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * (i2 >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())));
    }

    /* renamed from: h */
    private static void m13237h(Map<String, String> map) {
        map.put("net.status", Integer.toString(C6004e7.m13055a().f15823c.m13358T().ordinal()));
    }

    /* renamed from: i */
    private static void m13238i(Map<String, String> map) {
        map.put("orientation", Integer.toString(C6004e7.m13055a().f15824d.f16270q));
    }
}
