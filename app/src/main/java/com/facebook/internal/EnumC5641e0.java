package com.facebook.internal;

import java.util.Arrays;

/* compiled from: FacebookGamingAction.kt */
/* renamed from: com.facebook.internal.e0 */
/* loaded from: classes2.dex */
public enum EnumC5641e0 {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");


    /* renamed from: i */
    private final String f14411i;

    EnumC5641e0(String str) {
        this.f14411i = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5641e0[] valuesCustom() {
        EnumC5641e0[] valuesCustom = values();
        return (EnumC5641e0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: k */
    public final String m11433k() {
        return this.f14411i;
    }
}
