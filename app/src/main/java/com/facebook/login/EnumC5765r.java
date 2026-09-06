package com.facebook.login;

import java.util.Arrays;

/* compiled from: DefaultAudience.kt */
/* renamed from: com.facebook.login.r */
/* loaded from: classes2.dex */
public enum EnumC5765r {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* renamed from: k */
    private final String f14825k;

    EnumC5765r(String str) {
        this.f14825k = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5765r[] valuesCustom() {
        EnumC5765r[] valuesCustom = values();
        return (EnumC5765r[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: k */
    public final String m12057k() {
        return this.f14825k;
    }
}
