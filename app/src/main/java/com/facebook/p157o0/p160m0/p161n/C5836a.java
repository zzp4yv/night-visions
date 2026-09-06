package com.facebook.p157o0.p160m0.p161n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventBinding.kt */
/* renamed from: com.facebook.o0.m0.n.a */
/* loaded from: classes.dex */
public final class C5836a {

    /* renamed from: a */
    public static final b f15215a = new b(null);

    /* renamed from: b */
    private final String f15216b;

    /* renamed from: c */
    private final c f15217c;

    /* renamed from: d */
    private final a f15218d;

    /* renamed from: e */
    private final String f15219e;

    /* renamed from: f */
    private final List<C5838c> f15220f;

    /* renamed from: g */
    private final List<C5837b> f15221g;

    /* renamed from: h */
    private final String f15222h;

    /* renamed from: i */
    private final String f15223i;

    /* renamed from: j */
    private final String f15224j;

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$a */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C5836a m12440a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            C9768m.m32346f(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C9768m.m32345e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C9768m.m32345e(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C9768m.m32345e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C9768m.m32345e(string3, "mapping.getString(\"event_type\")");
            C9768m.m32345e(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            C9768m.m32345e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            a valueOf2 = a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i2 = 0;
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    C9768m.m32345e(jSONObject2, "jsonPath");
                    arrayList.add(new C5838c(jSONObject2));
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    C9768m.m32345e(jSONObject3, "jsonParameter");
                    arrayList2.add(new C5837b(jSONObject3));
                    if (i5 >= length) {
                        break;
                    }
                    i2 = i5;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            C9768m.m32345e(string, "eventName");
            C9768m.m32345e(string4, "appVersion");
            C9768m.m32345e(optString2, "componentId");
            C9768m.m32345e(optString, "pathType");
            C9768m.m32345e(optString3, "activityName");
            return new C5836a(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        /* renamed from: b */
        public final List<C5836a> m12441b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i2 = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            C9768m.m32345e(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(m12440a(jSONObject));
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$c */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public C5836a(String str, c cVar, a aVar, String str2, List<C5838c> list, List<C5837b> list2, String str3, String str4, String str5) {
        C9768m.m32346f(str, "eventName");
        C9768m.m32346f(cVar, "method");
        C9768m.m32346f(aVar, "type");
        C9768m.m32346f(str2, "appVersion");
        C9768m.m32346f(list, "path");
        C9768m.m32346f(list2, "parameters");
        C9768m.m32346f(str3, "componentId");
        C9768m.m32346f(str4, "pathType");
        C9768m.m32346f(str5, "activityName");
        this.f15216b = str;
        this.f15217c = cVar;
        this.f15218d = aVar;
        this.f15219e = str2;
        this.f15220f = list;
        this.f15221g = list2;
        this.f15222h = str3;
        this.f15223i = str4;
        this.f15224j = str5;
    }

    /* renamed from: a */
    public final String m12435a() {
        return this.f15224j;
    }

    /* renamed from: b */
    public final String m12436b() {
        return this.f15216b;
    }

    /* renamed from: c */
    public final List<C5837b> m12437c() {
        List<C5837b> unmodifiableList = Collections.unmodifiableList(this.f15221g);
        C9768m.m32345e(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    /* renamed from: d */
    public final List<C5838c> m12438d() {
        List<C5838c> unmodifiableList = Collections.unmodifiableList(this.f15220f);
        C9768m.m32345e(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
