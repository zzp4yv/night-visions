package com.flurry.sdk;

import android.content.Context;

/* renamed from: com.flurry.sdk.o2 */
/* loaded from: classes2.dex */
public final class C6089o2 {
    /* renamed from: a */
    public static boolean m13225a(String str) {
        Context m12964a = C5969b0.m12964a();
        if (m12964a != null) {
            return m12964a.checkCallingOrSelfPermission(str) == 0;
        }
        C5988d1.m13030c(6, "PermissionUtil", "Context is null when checking permission.");
        return false;
    }
}
