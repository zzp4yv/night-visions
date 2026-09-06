package com.facebook.p157o0.p159l0;

import java.util.Arrays;

/* compiled from: AppEventsCAPIManager.kt */
/* renamed from: com.facebook.o0.l0.o */
/* loaded from: classes.dex */
public enum EnumC5821o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* renamed from: k */
    private final String f15150k;

    EnumC5821o(String str) {
        this.f15150k = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5821o[] valuesCustom() {
        EnumC5821o[] valuesCustom = values();
        return (EnumC5821o[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: k */
    public final String m12369k() {
        return this.f15150k;
    }
}
