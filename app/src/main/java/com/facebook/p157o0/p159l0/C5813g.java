package com.facebook.p157o0.p159l0;

import com.facebook.EnumC5626g0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p159l0.EnumC5810d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.C10742u;
import kotlin.C9788b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10512t;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.g */
/* loaded from: classes.dex */
public final class C5813g {

    /* renamed from: a */
    public static final C5813g f15026a = new C5813g();

    /* renamed from: b */
    private static final Map<EnumC5811e, c> f15027b;

    /* renamed from: c */
    public static final Map<EnumC5819m, b> f15028c;

    /* renamed from: d */
    public static final Map<String, EnumC5816j> f15029d;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$a */
    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* renamed from: f */
        public static final C11413a f15030f = new C11413a(null);

        /* renamed from: k */
        private final String f15035k;

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* renamed from: com.facebook.o0.l0.g$a$a, reason: collision with other inner class name */
        public static final class C11413a {
            private C11413a() {
            }

            public /* synthetic */ C11413a(C9756g c9756g) {
                this();
            }

            /* renamed from: a */
            public final a m12329a(String str) {
                C9768m.m32346f(str, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (C9768m.m32341a(aVar.m12328k(), str)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        a(String str) {
            this.f15035k = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: k */
        public final String m12328k() {
            return this.f15035k;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$b */
    public static final class b {

        /* renamed from: a */
        private EnumC5817k f15036a;

        /* renamed from: b */
        private EnumC5815i f15037b;

        public b(EnumC5817k enumC5817k, EnumC5815i enumC5815i) {
            C9768m.m32346f(enumC5815i, "field");
            this.f15036a = enumC5817k;
            this.f15037b = enumC5815i;
        }

        /* renamed from: a */
        public final EnumC5815i m12330a() {
            return this.f15037b;
        }

        /* renamed from: b */
        public final EnumC5817k m12331b() {
            return this.f15036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15036a == bVar.f15036a && this.f15037b == bVar.f15037b;
        }

        public int hashCode() {
            EnumC5817k enumC5817k = this.f15036a;
            return ((enumC5817k == null ? 0 : enumC5817k.hashCode()) * 31) + this.f15037b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f15036a + ", field=" + this.f15037b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$c */
    public static final class c {

        /* renamed from: a */
        private EnumC5817k f15038a;

        /* renamed from: b */
        private EnumC5818l f15039b;

        public c(EnumC5817k enumC5817k, EnumC5818l enumC5818l) {
            C9768m.m32346f(enumC5817k, "section");
            this.f15038a = enumC5817k;
            this.f15039b = enumC5818l;
        }

        /* renamed from: a */
        public final EnumC5818l m12332a() {
            return this.f15039b;
        }

        /* renamed from: b */
        public final EnumC5817k m12333b() {
            return this.f15038a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15038a == cVar.f15038a && this.f15039b == cVar.f15039b;
        }

        public int hashCode() {
            int hashCode = this.f15038a.hashCode() * 31;
            EnumC5818l enumC5818l = this.f15039b;
            return hashCode + (enumC5818l == null ? 0 : enumC5818l.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f15038a + ", field=" + this.f15039b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$d */
    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* renamed from: f */
        public static final a f15040f = new a(null);

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* renamed from: com.facebook.o0.l0.g$d$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }

            /* renamed from: a */
            public final d m12335a(String str) {
                C9768m.m32346f(str, "rawValue");
                if (!C9768m.m32341a(str, EnumC5811e.EXT_INFO.m12306k()) && !C9768m.m32341a(str, EnumC5811e.URL_SCHEMES.m12306k()) && !C9768m.m32341a(str, EnumC5819m.CONTENT_IDS.m12364k()) && !C9768m.m32341a(str, EnumC5819m.CONTENTS.m12364k()) && !C9768m.m32341a(str, a.OPTIONS.m12328k())) {
                    if (!C9768m.m32341a(str, EnumC5811e.ADV_TE.m12306k()) && !C9768m.m32341a(str, EnumC5811e.APP_TE.m12306k())) {
                        if (C9768m.m32341a(str, EnumC5819m.EVENT_TIME.m12364k())) {
                            return d.INT;
                        }
                        return null;
                    }
                    return d.BOOL;
                }
                return d.ARRAY;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$e */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15045a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15046b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f15047c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f15045a = iArr;
            int[] iArr2 = new int[EnumC5817k.valuesCustom().length];
            iArr2[EnumC5817k.APP_DATA.ordinal()] = 1;
            iArr2[EnumC5817k.USER_DATA.ordinal()] = 2;
            f15046b = iArr2;
            int[] iArr3 = new int[EnumC5810d.valuesCustom().length];
            iArr3[EnumC5810d.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[EnumC5810d.CUSTOM.ordinal()] = 2;
            f15047c = iArr3;
        }
    }

    static {
        Map<EnumC5811e, c> m38800l;
        Map<EnumC5819m, b> m38800l2;
        Map<String, EnumC5816j> m38800l3;
        EnumC5811e enumC5811e = EnumC5811e.ANON_ID;
        EnumC5817k enumC5817k = EnumC5817k.USER_DATA;
        EnumC5811e enumC5811e2 = EnumC5811e.ADV_TE;
        EnumC5817k enumC5817k2 = EnumC5817k.APP_DATA;
        m38800l = C10777q0.m38800l(C10740s.m38547a(enumC5811e, new c(enumC5817k, EnumC5818l.ANON_ID)), C10740s.m38547a(EnumC5811e.APP_USER_ID, new c(enumC5817k, EnumC5818l.FB_LOGIN_ID)), C10740s.m38547a(EnumC5811e.ADVERTISER_ID, new c(enumC5817k, EnumC5818l.MAD_ID)), C10740s.m38547a(EnumC5811e.PAGE_ID, new c(enumC5817k, EnumC5818l.PAGE_ID)), C10740s.m38547a(EnumC5811e.PAGE_SCOPED_USER_ID, new c(enumC5817k, EnumC5818l.PAGE_SCOPED_USER_ID)), C10740s.m38547a(enumC5811e2, new c(enumC5817k2, EnumC5818l.ADV_TE)), C10740s.m38547a(EnumC5811e.APP_TE, new c(enumC5817k2, EnumC5818l.APP_TE)), C10740s.m38547a(EnumC5811e.CONSIDER_VIEWS, new c(enumC5817k2, EnumC5818l.CONSIDER_VIEWS)), C10740s.m38547a(EnumC5811e.DEVICE_TOKEN, new c(enumC5817k2, EnumC5818l.DEVICE_TOKEN)), C10740s.m38547a(EnumC5811e.EXT_INFO, new c(enumC5817k2, EnumC5818l.EXT_INFO)), C10740s.m38547a(EnumC5811e.INCLUDE_DWELL_DATA, new c(enumC5817k2, EnumC5818l.INCLUDE_DWELL_DATA)), C10740s.m38547a(EnumC5811e.INCLUDE_VIDEO_DATA, new c(enumC5817k2, EnumC5818l.INCLUDE_VIDEO_DATA)), C10740s.m38547a(EnumC5811e.INSTALL_REFERRER, new c(enumC5817k2, EnumC5818l.INSTALL_REFERRER)), C10740s.m38547a(EnumC5811e.INSTALLER_PACKAGE, new c(enumC5817k2, EnumC5818l.INSTALLER_PACKAGE)), C10740s.m38547a(EnumC5811e.RECEIPT_DATA, new c(enumC5817k2, EnumC5818l.RECEIPT_DATA)), C10740s.m38547a(EnumC5811e.URL_SCHEMES, new c(enumC5817k2, EnumC5818l.URL_SCHEMES)), C10740s.m38547a(EnumC5811e.USER_DATA, new c(enumC5817k, null)));
        f15027b = m38800l;
        EnumC5819m enumC5819m = EnumC5819m.VALUE_TO_SUM;
        EnumC5817k enumC5817k3 = EnumC5817k.CUSTOM_DATA;
        m38800l2 = C10777q0.m38800l(C10740s.m38547a(EnumC5819m.EVENT_TIME, new b(null, EnumC5815i.EVENT_TIME)), C10740s.m38547a(EnumC5819m.EVENT_NAME, new b(null, EnumC5815i.EVENT_NAME)), C10740s.m38547a(enumC5819m, new b(enumC5817k3, EnumC5815i.VALUE_TO_SUM)), C10740s.m38547a(EnumC5819m.CONTENT_IDS, new b(enumC5817k3, EnumC5815i.CONTENT_IDS)), C10740s.m38547a(EnumC5819m.CONTENTS, new b(enumC5817k3, EnumC5815i.CONTENTS)), C10740s.m38547a(EnumC5819m.CONTENT_TYPE, new b(enumC5817k3, EnumC5815i.CONTENT_TYPE)), C10740s.m38547a(EnumC5819m.CURRENCY, new b(enumC5817k3, EnumC5815i.CURRENCY)), C10740s.m38547a(EnumC5819m.DESCRIPTION, new b(enumC5817k3, EnumC5815i.DESCRIPTION)), C10740s.m38547a(EnumC5819m.LEVEL, new b(enumC5817k3, EnumC5815i.LEVEL)), C10740s.m38547a(EnumC5819m.MAX_RATING_VALUE, new b(enumC5817k3, EnumC5815i.MAX_RATING_VALUE)), C10740s.m38547a(EnumC5819m.NUM_ITEMS, new b(enumC5817k3, EnumC5815i.NUM_ITEMS)), C10740s.m38547a(EnumC5819m.PAYMENT_INFO_AVAILABLE, new b(enumC5817k3, EnumC5815i.PAYMENT_INFO_AVAILABLE)), C10740s.m38547a(EnumC5819m.REGISTRATION_METHOD, new b(enumC5817k3, EnumC5815i.REGISTRATION_METHOD)), C10740s.m38547a(EnumC5819m.SEARCH_STRING, new b(enumC5817k3, EnumC5815i.SEARCH_STRING)), C10740s.m38547a(EnumC5819m.SUCCESS, new b(enumC5817k3, EnumC5815i.SUCCESS)), C10740s.m38547a(EnumC5819m.ORDER_ID, new b(enumC5817k3, EnumC5815i.ORDER_ID)), C10740s.m38547a(EnumC5819m.AD_TYPE, new b(enumC5817k3, EnumC5815i.AD_TYPE)));
        f15028c = m38800l2;
        m38800l3 = C10777q0.m38800l(C10740s.m38547a("fb_mobile_achievement_unlocked", EnumC5816j.UNLOCKED_ACHIEVEMENT), C10740s.m38547a("fb_mobile_activate_app", EnumC5816j.ACTIVATED_APP), C10740s.m38547a("fb_mobile_add_payment_info", EnumC5816j.ADDED_PAYMENT_INFO), C10740s.m38547a("fb_mobile_add_to_cart", EnumC5816j.ADDED_TO_CART), C10740s.m38547a("fb_mobile_add_to_wishlist", EnumC5816j.ADDED_TO_WISHLIST), C10740s.m38547a("fb_mobile_complete_registration", EnumC5816j.COMPLETED_REGISTRATION), C10740s.m38547a("fb_mobile_content_view", EnumC5816j.VIEWED_CONTENT), C10740s.m38547a("fb_mobile_initiated_checkout", EnumC5816j.INITIATED_CHECKOUT), C10740s.m38547a("fb_mobile_level_achieved", EnumC5816j.ACHIEVED_LEVEL), C10740s.m38547a("fb_mobile_purchase", EnumC5816j.PURCHASED), C10740s.m38547a("fb_mobile_rate", EnumC5816j.RATED), C10740s.m38547a("fb_mobile_search", EnumC5816j.SEARCHED), C10740s.m38547a("fb_mobile_spent_credits", EnumC5816j.SPENT_CREDITS), C10740s.m38547a("fb_mobile_tutorial_completion", EnumC5816j.COMPLETED_TUTORIAL));
        f15029d = m38800l3;
    }

    private C5813g() {
    }

    /* renamed from: b */
    private final List<Map<String, Object>> m12315b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* renamed from: c */
    private final List<Map<String, Object>> m12316c(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(EnumC5815i.EVENT_NAME.m12356k(), EnumC5820n.MOBILE_APP_INSTALL.m12367k());
        linkedHashMap.put(EnumC5815i.EVENT_TIME.m12356k(), obj);
        return C10782t.m38883e(linkedHashMap);
    }

    /* renamed from: f */
    private final EnumC5810d m12317f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(EnumC5820n.EVENT.m12367k());
        EnumC5810d.a aVar = EnumC5810d.f14998f;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        EnumC5810d m12304a = aVar.m12304a((String) obj);
        if (m12304a == EnumC5810d.OTHER) {
            return m12304a;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            EnumC5811e m12307a = EnumC5811e.f15003f.m12307a(key);
            if (m12307a != null) {
                f15026a.m12326g(map2, map3, m12307a, value);
            } else {
                boolean m32341a = C9768m.m32341a(key, EnumC5817k.CUSTOM_EVENTS.m12360k());
                boolean z = value instanceof String;
                if (m12304a == EnumC5810d.CUSTOM && m32341a && z) {
                    ArrayList<Map<String, Object>> m12321k = m12321k((String) value);
                    if (m12321k != null) {
                        arrayList.addAll(m12321k);
                    }
                } else if (a.f15030f.m12329a(key) != null) {
                    map4.put(key, value);
                }
            }
        }
        return m12304a;
    }

    /* renamed from: h */
    private final void m12318h(Map<String, Object> map, EnumC5811e enumC5811e, Object obj) {
        c cVar = f15027b.get(enumC5811e);
        EnumC5818l m12332a = cVar == null ? null : cVar.m12332a();
        if (m12332a == null) {
            return;
        }
        map.put(m12332a.m12362k(), obj);
    }

    /* renamed from: i */
    private final void m12319i(Map<String, Object> map, EnumC5811e enumC5811e, Object obj) {
        if (enumC5811e == EnumC5811e.USER_DATA) {
            try {
                C5663p0 c5663p0 = C5663p0.f14478a;
                map.putAll(C5663p0.m11578l(new JSONObject((String) obj)));
                return;
            } catch (JSONException e2) {
                C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
                return;
            }
        }
        c cVar = f15027b.get(enumC5811e);
        EnumC5818l m12332a = cVar == null ? null : cVar.m12332a();
        if (m12332a == null) {
            return;
        }
        map.put(m12332a.m12362k(), obj);
    }

    /* renamed from: j */
    private final String m12320j(String str) {
        Map<String, EnumC5816j> map = f15029d;
        if (!map.containsKey(str)) {
            return str;
        }
        EnumC5816j enumC5816j = map.get(str);
        return enumC5816j == null ? HttpUrl.FRAGMENT_ENCODE_SET : enumC5816j.m12358k();
    }

    /* renamed from: k */
    public static final ArrayList<Map<String, Object>> m12321k(String str) {
        String m32368b;
        C9768m.m32346f(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            C5663p0 c5663p0 = C5663p0.f14478a;
            for (String str2 : C5663p0.m11576k(new JSONArray(str))) {
                C5663p0 c5663p02 = C5663p0.f14478a;
                arrayList.add(C5663p0.m11578l(new JSONObject(str2)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str3 : map.keySet()) {
                    EnumC5819m m12365a = EnumC5819m.f15118f.m12365a(str3);
                    b bVar = f15028c.get(m12365a);
                    if (m12365a != null && bVar != null) {
                        EnumC5817k m12331b = bVar.m12331b();
                        if (m12331b == null) {
                            try {
                                String m12356k = bVar.m12330a().m12356k();
                                if (m12365a == EnumC5819m.EVENT_NAME && ((String) map.get(str3)) != null) {
                                    C5813g c5813g = f15026a;
                                    Object obj = map.get(str3);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(m12356k, c5813g.m12320j((String) obj));
                                } else if (m12365a == EnumC5819m.EVENT_TIME && ((Integer) map.get(str3)) != null) {
                                    Object obj2 = map.get(str3);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    Object m12322l = m12322l(str3, obj2);
                                    if (m12322l == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    linkedHashMap2.put(m12356k, m12322l);
                                }
                            } catch (ClassCastException e2) {
                                C5651j0.a aVar = C5651j0.f14429a;
                                EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
                                m32368b = C9788b.m32368b(e2);
                                aVar.m11455c(enumC5626g0, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", m32368b);
                            }
                        } else if (m12331b == EnumC5817k.CUSTOM_DATA) {
                            String m12356k2 = bVar.m12330a().m12356k();
                            Object obj3 = map.get(str3);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object m12322l2 = m12322l(str3, obj3);
                            if (m12322l2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(m12356k2, m12322l2);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(EnumC5817k.CUSTOM_DATA.m12360k(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e3) {
            C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    /* renamed from: l */
    public static final Object m12322l(String str, Object obj) {
        Integer m37503j;
        Integer m37503j2;
        C9768m.m32346f(str, "field");
        C9768m.m32346f(obj, "value");
        d m12335a = d.f15040f.m12335a(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (m12335a == null || str2 == null) {
            return obj;
        }
        int i2 = e.f15045a[m12335a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m37503j2 = C10512t.m37503j(obj.toString());
                return m37503j2;
            }
            m37503j = C10512t.m37503j(str2);
            if (m37503j != null) {
                return Boolean.valueOf(m37503j.intValue() != 0);
            }
            return null;
        }
        try {
            C5663p0 c5663p0 = C5663p0.f14478a;
            List<String> m11576k = C5663p0.m11576k(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            Iterator it = m11576k.iterator();
            while (it.hasNext()) {
                ?? r1 = (String) it.next();
                try {
                    try {
                        C5663p0 c5663p02 = C5663p0.f14478a;
                        r1 = C5663p0.m11578l(new JSONObject((String) r1));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    C5663p0 c5663p03 = C5663p0.f14478a;
                    r1 = C5663p0.m11576k(new JSONArray((String) r1));
                }
                arrayList.add(r1);
            }
            return arrayList;
        } catch (JSONException e2) {
            C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
            return C10742u.f41439a;
        }
    }

    /* renamed from: a */
    public final List<Map<String, Object>> m12323a(EnumC5810d enumC5810d, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<? extends Map<String, ? extends Object>> list, Object obj) {
        C9768m.m32346f(enumC5810d, "eventType");
        C9768m.m32346f(map, "userData");
        C9768m.m32346f(map2, "appData");
        C9768m.m32346f(map3, "restOfData");
        C9768m.m32346f(list, "customEvents");
        Map<String, Object> m12324d = m12324d(map, map2, map3);
        int i2 = e.f15047c[enumC5810d.ordinal()];
        if (i2 == 1) {
            return m12316c(m12324d, obj);
        }
        if (i2 != 2) {
            return null;
        }
        return m12315b(m12324d, list);
    }

    /* renamed from: d */
    public final Map<String, Object> m12324d(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        C9768m.m32346f(map, "userData");
        C9768m.m32346f(map2, "appData");
        C9768m.m32346f(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC5820n.ACTION_SOURCE.m12367k(), EnumC5820n.APP.m12367k());
        linkedHashMap.put(EnumC5817k.USER_DATA.m12360k(), map);
        linkedHashMap.put(EnumC5817k.APP_DATA.m12360k(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List<Map<String, Object>> m12325e(Map<String, ? extends Object> map) {
        C9768m.m32346f(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        EnumC5810d m12317f = m12317f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (m12317f == EnumC5810d.OTHER) {
            return null;
        }
        return m12323a(m12317f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(EnumC5820n.INSTALL_EVENT_TIME.m12367k()));
    }

    /* renamed from: g */
    public final void m12326g(Map<String, Object> map, Map<String, Object> map2, EnumC5811e enumC5811e, Object obj) {
        C9768m.m32346f(map, "userData");
        C9768m.m32346f(map2, "appData");
        C9768m.m32346f(enumC5811e, "field");
        C9768m.m32346f(obj, "value");
        c cVar = f15027b.get(enumC5811e);
        if (cVar == null) {
            return;
        }
        int i2 = e.f15046b[cVar.m12333b().ordinal()];
        if (i2 == 1) {
            m12318h(map2, enumC5811e, obj);
        } else {
            if (i2 != 2) {
                return;
            }
            m12319i(map, enumC5811e, obj);
        }
    }
}
