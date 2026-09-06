package com.facebook.login;

import kotlin.text.C10514v;

/* compiled from: NonceUtil.kt */
/* renamed from: com.facebook.login.a0 */
/* loaded from: classes2.dex */
public final class C5746a0 {

    /* renamed from: a */
    public static final C5746a0 f14784a = new C5746a0();

    private C5746a0() {
    }

    /* renamed from: a */
    public static final boolean m12041a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(C10514v.m37556V(str, ' ', 0, false, 6, null) >= 0);
    }
}
