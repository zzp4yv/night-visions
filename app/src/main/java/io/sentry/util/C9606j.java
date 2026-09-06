package io.sentry.util;

import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import java.util.Properties;

/* compiled from: DebugMetaPropertiesApplier.java */
/* renamed from: io.sentry.util.j */
/* loaded from: classes2.dex */
public final class C9606j {

    /* renamed from: a */
    public static String f36929a = "sentry-debug-meta.properties";

    /* renamed from: a */
    private static void m31770a(C9647x4 c9647x4, Properties properties) {
        if (c9647x4.getBundleIds().isEmpty()) {
            String property = properties.getProperty("io.sentry.bundle-ids");
            c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "Bundle IDs found: %s", property);
            if (property != null) {
                for (String str : property.split(",", -1)) {
                    c9647x4.addBundleId(str);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m31771b(C9647x4 c9647x4, Properties properties) {
        if (c9647x4.getProguardUuid() == null) {
            String m31773d = m31773d(properties);
            c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "Proguard UUID found: %s", m31773d);
            c9647x4.setProguardUuid(m31773d);
        }
    }

    /* renamed from: c */
    public static void m31772c(C9647x4 c9647x4, Properties properties) {
        if (properties != null) {
            m31771b(c9647x4, properties);
            m31770a(c9647x4, properties);
        }
    }

    /* renamed from: d */
    public static String m31773d(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
