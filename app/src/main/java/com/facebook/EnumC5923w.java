package com.facebook;

import java.util.Arrays;

/* compiled from: AccessTokenSource.kt */
/* renamed from: com.facebook.w */
/* loaded from: classes.dex */
public enum EnumC5923w {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* renamed from: s */
    private final boolean f15602s;

    EnumC5923w(boolean z) {
        this.f15602s = z;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5923w[] valuesCustom() {
        EnumC5923w[] valuesCustom = values();
        return (EnumC5923w[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: k */
    public final boolean m12937k() {
        return this.f15602s;
    }
}
