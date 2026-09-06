package com.facebook.p157o0.p159l0;

import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.d */
/* loaded from: classes.dex */
public enum EnumC5810d {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* renamed from: f */
    public static final a f14998f = new a(null);

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5810d m12304a(String str) {
            C9768m.m32346f(str, "rawValue");
            return C9768m.m32341a(str, "MOBILE_APP_INSTALL") ? EnumC5810d.MOBILE_APP_INSTALL : C9768m.m32341a(str, "CUSTOM_APP_EVENTS") ? EnumC5810d.CUSTOM : EnumC5810d.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5810d[] valuesCustom() {
        EnumC5810d[] valuesCustom = values();
        return (EnumC5810d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
