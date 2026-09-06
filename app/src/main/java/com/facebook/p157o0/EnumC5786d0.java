package com.facebook.p157o0;

import java.util.Arrays;

/* compiled from: FlushReason.kt */
/* renamed from: com.facebook.o0.d0 */
/* loaded from: classes.dex */
public enum EnumC5786d0 {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5786d0[] valuesCustom() {
        EnumC5786d0[] valuesCustom = values();
        return (EnumC5786d0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
