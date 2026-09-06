package io.sentry.android.core;

import android.os.Build;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BuildInfoProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.s0 */
/* loaded from: classes2.dex */
public final class C9311s0 {

    /* renamed from: a */
    final InterfaceC9637w1 f36100a;

    public C9311s0(InterfaceC9637w1 interfaceC9637w1) {
        this.f36100a = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "The ILogger object is required.");
    }

    /* renamed from: a */
    public String m30403a() {
        return Build.TAGS;
    }

    /* renamed from: b */
    public String m30404b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: c */
    public String m30405c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public int m30406d() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: e */
    public String m30407e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public Boolean m30408f() {
        boolean z;
        try {
            if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
                String str = Build.FINGERPRINT;
                if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                    String str2 = Build.HARDWARE;
                    if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                        String str3 = Build.MODEL;
                        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                            String str4 = Build.PRODUCT;
                            if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                z = false;
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.f36100a.mo30213b(EnumC9554s4.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
