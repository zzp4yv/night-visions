package com.facebook.p157o0.p159l0;

import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.m */
/* loaded from: classes.dex */
public enum EnumC5819m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* renamed from: f */
    public static final a f15118f = new a(null);

    /* renamed from: y */
    private final String f15137y;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5819m m12365a(String str) {
            C9768m.m32346f(str, "rawValue");
            for (EnumC5819m enumC5819m : EnumC5819m.valuesCustom()) {
                if (C9768m.m32341a(enumC5819m.m12364k(), str)) {
                    return enumC5819m;
                }
            }
            return null;
        }
    }

    EnumC5819m(String str) {
        this.f15137y = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5819m[] valuesCustom() {
        EnumC5819m[] valuesCustom = values();
        return (EnumC5819m[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: k */
    public final String m12364k() {
        return this.f15137y;
    }
}
