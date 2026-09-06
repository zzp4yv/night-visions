package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9756g;
import kotlin.text.C10513u;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification.kt */
/* renamed from: com.facebook.internal.x */
/* loaded from: classes2.dex */
public final class C5705x {

    /* renamed from: a */
    public static final a f14638a = new a(null);

    /* renamed from: b */
    private static C5705x f14639b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f14640c;

    /* renamed from: d */
    private final Map<Integer, Set<Integer>> f14641d;

    /* renamed from: e */
    private final Map<Integer, Set<Integer>> f14642e;

    /* renamed from: f */
    private final String f14643f;

    /* renamed from: g */
    private final String f14644g;

    /* renamed from: h */
    private final String f14645h;

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: com.facebook.internal.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: c */
        private final C5705x m11824c() {
            HashMap m38799k;
            HashMap m38799k2;
            m38799k = C10777q0.m38799k(C10740s.m38547a(2, null), C10740s.m38547a(4, null), C10740s.m38547a(9, null), C10740s.m38547a(17, null), C10740s.m38547a(341, null));
            m38799k2 = C10777q0.m38799k(C10740s.m38547a(102, null), C10740s.m38547a(190, null), C10740s.m38547a(412, null));
            return new C5705x(null, m38799k, m38799k2, null, null, null);
        }

        /* renamed from: d */
        private final Map<Integer, Set<Integer>> m11825d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i4 = 0;
                                while (true) {
                                    int i5 = i4 + 1;
                                    int optInt2 = optJSONArray2.optInt(i4);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i5 >= length2) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C5705x m11826a(JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        if (C10513u.m37515q(optString, "other", true)) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = m11825d(optJSONObject);
                        } else if (C10513u.m37515q(optString, "transient", true)) {
                            str5 = optJSONObject.optString("recovery_message", null);
                            map5 = m11825d(optJSONObject);
                        } else if (C10513u.m37515q(optString, "login_recoverable", true)) {
                            str6 = optJSONObject.optString("recovery_message", null);
                            map6 = m11825d(optJSONObject);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new C5705x(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C5705x m11827b() {
            C5705x c5705x;
            if (C5705x.f14639b == null) {
                C5705x.f14639b = m11824c();
            }
            c5705x = C5705x.f14639b;
            if (c5705x == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return c5705x;
        }
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: com.facebook.internal.x$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14646a;

        static {
            int[] iArr = new int[FacebookRequestError.EnumC5589a.valuesCustom().length];
            iArr[FacebookRequestError.EnumC5589a.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.EnumC5589a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.EnumC5589a.TRANSIENT.ordinal()] = 3;
            f14646a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5705x(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f14640c = map;
        this.f14641d = map2;
        this.f14642e = map3;
        this.f14643f = str;
        this.f14644g = str2;
        this.f14645h = str3;
    }

    /* renamed from: c */
    public final FacebookRequestError.EnumC5589a m11822c(int i2, int i3, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.EnumC5589a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f14640c;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = this.f14640c.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.EnumC5589a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f14642e;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = this.f14642e.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.EnumC5589a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f14641d;
        return (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = this.f14641d.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) ? FacebookRequestError.EnumC5589a.TRANSIENT : FacebookRequestError.EnumC5589a.OTHER;
    }

    /* renamed from: d */
    public final String m11823d(FacebookRequestError.EnumC5589a enumC5589a) {
        int i2 = enumC5589a == null ? -1 : b.f14646a[enumC5589a.ordinal()];
        if (i2 == 1) {
            return this.f14643f;
        }
        if (i2 == 2) {
            return this.f14645h;
        }
        if (i2 != 3) {
            return null;
        }
        return this.f14644g;
    }
}
