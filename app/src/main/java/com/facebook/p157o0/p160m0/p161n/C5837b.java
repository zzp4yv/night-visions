package com.facebook.p157o0.p160m0.p161n;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParameterComponent.kt */
/* renamed from: com.facebook.o0.m0.n.b */
/* loaded from: classes.dex */
public final class C5837b {

    /* renamed from: a */
    public static final a f15232a = new a(null);

    /* renamed from: b */
    private final String f15233b;

    /* renamed from: c */
    private final String f15234c;

    /* renamed from: d */
    private final List<C5838c> f15235d;

    /* renamed from: e */
    private final String f15236e;

    /* compiled from: ParameterComponent.kt */
    /* renamed from: com.facebook.o0.m0.n.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public C5837b(JSONObject jSONObject) {
        C9768m.m32346f(jSONObject, "component");
        String string = jSONObject.getString("name");
        C9768m.m32345e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f15233b = string;
        String optString = jSONObject.optString("value");
        C9768m.m32345e(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f15234c = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        C9768m.m32345e(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f15236e = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    C9768m.m32345e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new C5838c(jSONObject2));
                    if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
        this.f15235d = arrayList;
    }

    /* renamed from: a */
    public final String m12443a() {
        return this.f15233b;
    }

    /* renamed from: b */
    public final List<C5838c> m12444b() {
        return this.f15235d;
    }

    /* renamed from: c */
    public final String m12445c() {
        return this.f15236e;
    }

    /* renamed from: d */
    public final String m12446d() {
        return this.f15234c;
    }
}
