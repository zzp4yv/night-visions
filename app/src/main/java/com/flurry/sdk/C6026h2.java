package com.flurry.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import p241e.p252d.p253a.InterfaceC8746e;

/* renamed from: com.flurry.sdk.h2 */
/* loaded from: classes2.dex */
public final class C6026h2 {

    /* renamed from: a */
    private static boolean f15948a;

    /* renamed from: b */
    private static boolean f15949b;

    /* renamed from: a */
    public static synchronized void m13088a() {
        synchronized (C6026h2.class) {
            if (f15948a) {
                return;
            }
            try {
                C6016g1.m13077c(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                C5988d1.m13030c(3, "FlurrySDK", "Ads module not available");
            }
            f15948a = true;
        }
    }

    /* renamed from: b */
    public static synchronized void m13089b(Context context) {
        synchronized (C6026h2.class) {
            C6016g1.m13078d(context);
        }
    }

    /* renamed from: c */
    public static synchronized void m13090c(List<InterfaceC8746e> list) {
        synchronized (C6026h2.class) {
            if (f15949b) {
                return;
            }
            if (list != null) {
                Iterator<InterfaceC8746e> it = list.iterator();
                while (it.hasNext()) {
                    C6016g1.m13076b((InterfaceC6025h1) it.next());
                }
            }
            f15949b = true;
        }
    }
}
