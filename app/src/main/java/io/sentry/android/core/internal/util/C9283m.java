package io.sentry.android.core.internal.util;

import io.sentry.util.C9608l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: CpuInfoUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.m */
/* loaded from: classes2.dex */
public final class C9283m {

    /* renamed from: a */
    private static final C9283m f35997a = new C9283m();

    /* renamed from: b */
    private final List<Integer> f35998b = new ArrayList();

    private C9283m() {
    }

    /* renamed from: a */
    public static C9283m m30288a() {
        return f35997a;
    }

    @VisibleForTesting
    /* renamed from: b */
    String m30289b() {
        return "/sys/devices/system/cpu";
    }

    /* renamed from: c */
    public synchronized List<Integer> m30290c() {
        if (!this.f35998b.isEmpty()) {
            return this.f35998b;
        }
        File[] listFiles = new File(m30289b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String m31777c = C9608l.m31777c(file2);
                        if (m31777c != null) {
                            this.f35998b.add(Integer.valueOf((int) (Long.parseLong(m31777c.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f35998b;
    }
}
