package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import java.util.Arrays;
import java.util.List;

/* compiled from: ManifestMetadataReader.java */
/* renamed from: io.sentry.android.core.d1 */
/* loaded from: classes2.dex */
final class C9240d1 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0224 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025b A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b2 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m30164a(android.content.Context r11, io.sentry.android.core.SentryAndroidOptions r12, io.sentry.android.core.C9311s0 r13) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C9240d1.m30164a(android.content.Context, io.sentry.android.core.SentryAndroidOptions, io.sentry.android.core.s0):void");
    }

    /* renamed from: b */
    private static Bundle m30165b(Context context, InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) throws PackageManager.NameNotFoundException {
        if (c9311s0 == null) {
            c9311s0 = new C9311s0(interfaceC9637w1);
        }
        return C9313t0.m30409a(context, 128L, c9311s0).metaData;
    }

    /* renamed from: c */
    static boolean m30166c(Context context, InterfaceC9637w1 interfaceC9637w1) {
        C9613q.m31802c(context, "The application context is required.");
        try {
            Bundle m30165b = m30165b(context, interfaceC9637w1, null);
            r1 = m30165b != null ? m30167d(m30165b, interfaceC9637w1, "io.sentry.auto-init", true) : true;
            interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        return r1;
    }

    /* renamed from: d */
    private static boolean m30167d(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    /* renamed from: e */
    private static Boolean m30168e(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str, Boolean bool) {
        if (bundle.getSerializable(str) == null) {
            interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s used default %s", str, bool);
            return bool;
        }
        boolean z = bundle.getBoolean(str, bool != null);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    private static Double m30169f(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    /* renamed from: g */
    private static List<String> m30170g(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str) {
        String string = bundle.getString(str);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* renamed from: h */
    private static long m30171h(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str, long j2) {
        long j3 = bundle.getInt(str, (int) j2);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, Long.valueOf(j3));
        return j3;
    }

    /* renamed from: i */
    private static String m30172i(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, string);
        return string;
    }

    /* renamed from: j */
    private static String m30173j(Bundle bundle, InterfaceC9637w1 interfaceC9637w1, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
