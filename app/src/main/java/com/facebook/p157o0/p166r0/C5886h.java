package com.facebook.p157o0.p166r0;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p164p0.C5859a;
import com.facebook.p157o0.p165q0.AsyncTaskC5873k;
import com.facebook.p157o0.p166r0.C5886h;
import com.facebook.p157o0.p169u0.C5905h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntRange;
import kotlin.text.C10513u;
import kotlin.text.C10514v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ModelManager.kt */
/* renamed from: com.facebook.o0.r0.h */
/* loaded from: classes2.dex */
public final class C5886h {

    /* renamed from: a */
    public static final C5886h f15431a = new C5886h();

    /* renamed from: b */
    private static final Map<String, b> f15432b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final List<String> f15433c;

    /* renamed from: d */
    private static final List<String> f15434d;

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$a */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: ModelManager.kt */
        /* renamed from: com.facebook.o0.r0.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11414a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15438a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f15438a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: k */
        public final String m12703k() {
            int i2 = C11414a.f15438a[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: q */
        public final String m12704q() {
            int i2 = C11414a.f15438a[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$b */
    public static final class b {

        /* renamed from: a */
        public static final a f15439a = new a(null);

        /* renamed from: b */
        private String f15440b;

        /* renamed from: c */
        private String f15441c;

        /* renamed from: d */
        private String f15442d;

        /* renamed from: e */
        private int f15443e;

        /* renamed from: f */
        private float[] f15444f;

        /* renamed from: g */
        private File f15445g;

        /* renamed from: h */
        private C5885g f15446h;

        /* renamed from: i */
        private Runnable f15447i;

        /* compiled from: ModelManager.kt */
        /* renamed from: com.facebook.o0.r0.h$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }

            /* renamed from: b */
            private final void m12716b(String str, int i2) {
                File[] listFiles;
                C5888j c5888j = C5888j.f15450a;
                File m12736a = C5888j.m12736a();
                if (m12736a == null || (listFiles = m12736a.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i2;
                int length = listFiles.length;
                int i3 = 0;
                while (i3 < length) {
                    File file = listFiles[i3];
                    i3++;
                    String name = file.getName();
                    C9768m.m32345e(name, "name");
                    if (C10513u.m37511E(name, str, false, 2, null) && !C10513u.m37511E(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* renamed from: c */
            private final void m12717c(String str, String str2, AsyncTaskC5873k.a aVar) {
                C5888j c5888j = C5888j.f15450a;
                File file = new File(C5888j.m12736a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo12645a(file);
                } else {
                    new AsyncTaskC5873k(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m12718e(List list, File file) {
                C9768m.m32346f(list, "$slaves");
                C9768m.m32346f(file, "file");
                final C5885g m12682a = C5885g.f15417a.m12682a(file);
                if (m12682a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f15439a.m12717c(bVar.m12709e(), bVar.m12711g() + '_' + bVar.m12712h() + "_rule", new AsyncTaskC5873k.a() { // from class: com.facebook.o0.r0.c
                            @Override // com.facebook.p157o0.p165q0.AsyncTaskC5873k.a
                            /* renamed from: a */
                            public final void mo12645a(File file2) {
                                C5886h.b.a.m12719f(C5886h.b.this, m12682a, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public static final void m12719f(b bVar, C5885g c5885g, File file) {
                C9768m.m32346f(bVar, "$slave");
                C9768m.m32346f(file, "file");
                bVar.m12713i(c5885g);
                bVar.m12715k(file);
                Runnable runnable = bVar.f15447i;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            /* renamed from: a */
            public final b m12722a(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i2 = jSONObject.getInt("version_id");
                    float[] m12697o = C5886h.f15431a.m12697o(jSONObject.getJSONArray("thresholds"));
                    C9768m.m32345e(string, "useCase");
                    C9768m.m32345e(string2, "assetUri");
                    return new b(string, string2, optString, i2, m12697o);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: d */
            public final void m12723d(b bVar, final List<b> list) {
                C9768m.m32346f(bVar, "master");
                C9768m.m32346f(list, "slaves");
                m12716b(bVar.m12711g(), bVar.m12712h());
                m12717c(bVar.m12706b(), bVar.m12711g() + '_' + bVar.m12712h(), new AsyncTaskC5873k.a() { // from class: com.facebook.o0.r0.b
                    @Override // com.facebook.p157o0.p165q0.AsyncTaskC5873k.a
                    /* renamed from: a */
                    public final void mo12645a(File file) {
                        C5886h.b.a.m12718e(list, file);
                    }
                });
            }
        }

        public b(String str, String str2, String str3, int i2, float[] fArr) {
            C9768m.m32346f(str, "useCase");
            C9768m.m32346f(str2, "assetUri");
            this.f15440b = str;
            this.f15441c = str2;
            this.f15442d = str3;
            this.f15443e = i2;
            this.f15444f = fArr;
        }

        /* renamed from: b */
        public final String m12706b() {
            return this.f15441c;
        }

        /* renamed from: c */
        public final C5885g m12707c() {
            return this.f15446h;
        }

        /* renamed from: d */
        public final File m12708d() {
            return this.f15445g;
        }

        /* renamed from: e */
        public final String m12709e() {
            return this.f15442d;
        }

        /* renamed from: f */
        public final float[] m12710f() {
            return this.f15444f;
        }

        /* renamed from: g */
        public final String m12711g() {
            return this.f15440b;
        }

        /* renamed from: h */
        public final int m12712h() {
            return this.f15443e;
        }

        /* renamed from: i */
        public final void m12713i(C5885g c5885g) {
            this.f15446h = c5885g;
        }

        /* renamed from: j */
        public final b m12714j(Runnable runnable) {
            this.f15447i = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m12715k(File file) {
            this.f15445g = file;
        }
    }

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15448a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f15448a = iArr;
        }
    }

    static {
        List<String> m38891m;
        List<String> m38891m2;
        m38891m = C10784u.m38891m("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f15433c = m38891m;
        m38891m2 = C10784u.m38891m("none", "address", "health");
        f15434d = m38891m2;
    }

    private C5886h() {
    }

    /* renamed from: b */
    private final void m12684b(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                b m12722a = b.f15439a.m12722a(jSONObject.getJSONObject(keys.next()));
                if (m12722a != null) {
                    f15432b.put(m12722a.m12711g(), m12722a);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static final void m12685c() {
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11527B0(new Runnable() { // from class: com.facebook.o0.r0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5886h.m12686d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:3:0x0004, B:5:0x0018, B:10:0x0022, B:11:0x002d, B:13:0x003d, B:15:0x0043, B:17:0x006b, B:21:0x004b, B:24:0x0054, B:25:0x0028), top: B:2:0x0004 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12686d() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            com.facebook.a0 r2 = com.facebook.C5608a0.f14199a     // Catch: java.lang.Exception -> L73
            android.content.Context r2 = com.facebook.C5608a0.m11284c()     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Exception -> L73
            r3 = 0
            java.lang.String r3 = r2.getString(r1, r3)     // Catch: java.lang.Exception -> L73
            if (r3 == 0) goto L28
            int r5 = r3.length()     // Catch: java.lang.Exception -> L73
            if (r5 != 0) goto L1f
            r4 = 1
        L1f:
            if (r4 == 0) goto L22
            goto L28
        L22:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L73
            r4.<init>(r3)     // Catch: java.lang.Exception -> L73
            goto L2d
        L28:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L73
            r4.<init>()     // Catch: java.lang.Exception -> L73
        L2d:
            r5 = 0
            long r5 = r2.getLong(r0, r5)     // Catch: java.lang.Exception -> L73
            com.facebook.internal.a0 r3 = com.facebook.internal.C5633a0.f14313a     // Catch: java.lang.Exception -> L73
            com.facebook.internal.a0$b r3 = com.facebook.internal.C5633a0.b.ModelRequest     // Catch: java.lang.Exception -> L73
            boolean r3 = com.facebook.internal.C5633a0.m11378g(r3)     // Catch: java.lang.Exception -> L73
            if (r3 == 0) goto L4b
            int r3 = r4.length()     // Catch: java.lang.Exception -> L73
            if (r3 == 0) goto L4b
            com.facebook.o0.r0.h r3 = com.facebook.p157o0.p166r0.C5886h.f15431a     // Catch: java.lang.Exception -> L73
            boolean r3 = r3.m12693k(r5)     // Catch: java.lang.Exception -> L73
            if (r3 != 0) goto L6b
        L4b:
            com.facebook.o0.r0.h r3 = com.facebook.p157o0.p166r0.C5886h.f15431a     // Catch: java.lang.Exception -> L73
            org.json.JSONObject r4 = r3.m12690h()     // Catch: java.lang.Exception -> L73
            if (r4 != 0) goto L54
            return
        L54:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L73
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch: java.lang.Exception -> L73
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L73
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Exception -> L73
            r0.apply()     // Catch: java.lang.Exception -> L73
        L6b:
            com.facebook.o0.r0.h r0 = com.facebook.p157o0.p166r0.C5886h.f15431a     // Catch: java.lang.Exception -> L73
            r0.m12684b(r4)     // Catch: java.lang.Exception -> L73
            r0.m12687e()     // Catch: java.lang.Exception -> L73
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p166r0.C5886h.m12686d():void");
    }

    /* renamed from: e */
    private final void m12687e() {
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i2 = 0;
        for (Map.Entry<String, b> entry : f15432b.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (C9768m.m32341a(key, a.MTML_APP_EVENT_PREDICTION.m12704q())) {
                String m12706b = value.m12706b();
                int max = Math.max(i2, value.m12712h());
                C5633a0 c5633a0 = C5633a0.f14313a;
                if (C5633a0.m11378g(C5633a0.b.SuggestedEvents) && m12692j()) {
                    arrayList.add(value.m12714j(new Runnable() { // from class: com.facebook.o0.r0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5886h.m12688f();
                        }
                    }));
                }
                str = m12706b;
                i2 = max;
            }
            if (C9768m.m32341a(key, a.MTML_INTEGRITY_DETECT.m12704q())) {
                str = value.m12706b();
                i2 = Math.max(i2, value.m12712h());
                C5633a0 c5633a02 = C5633a0.f14313a;
                if (C5633a0.m11378g(C5633a0.b.IntelligentIntegrity)) {
                    arrayList.add(value.m12714j(new Runnable() { // from class: com.facebook.o0.r0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5886h.m12689g();
                        }
                    }));
                }
            }
        }
        if (str == null || i2 <= 0 || arrayList.isEmpty()) {
            return;
        }
        b.f15439a.m12723d(new b("MTML", str, null, i2, null), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12688f() {
        C5905h c5905h = C5905h.f15513a;
        C5905h.m12801a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m12689g() {
        C5859a c5859a = C5859a.f15336a;
        C5859a.m12579a();
    }

    /* renamed from: h */
    private final JSONObject m12690h() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
        GraphRequest m11236x = GraphRequest.f14159a.m11236x(null, "app/model_asset", null);
        m11236x.m11177H(bundle);
        JSONObject m11339c = m11236x.m11179j().m11339c();
        if (m11339c == null) {
            return null;
        }
        return m12698p(m11339c);
    }

    /* renamed from: i */
    public static final File m12691i(a aVar) {
        C9768m.m32346f(aVar, "task");
        b bVar = f15432b.get(aVar.m12704q());
        if (bVar == null) {
            return null;
        }
        return bVar.m12708d();
    }

    /* renamed from: j */
    private final boolean m12692j() {
        boolean m37538J;
        C5663p0 c5663p0 = C5663p0.f14478a;
        Locale m11542L = C5663p0.m11542L();
        if (m11542L != null) {
            String language = m11542L.getLanguage();
            C9768m.m32345e(language, "locale.language");
            m37538J = C10514v.m37538J(language, "en", false, 2, null);
            if (!m37538J) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private final boolean m12693k(long j2) {
        return j2 != 0 && System.currentTimeMillis() - j2 < 259200000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final float[] m12697o(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        float[] fArr = new float[jSONArray.length()];
        int i2 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = jSONArray.getString(i2);
                    C9768m.m32345e(string, "jsonArray.getString(i)");
                    fArr[i2] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return fArr;
    }

    /* renamed from: p */
    private final JSONObject m12698p(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            int i2 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return jSONObject2;
            }
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                if (jSONObject3.has("rules_uri")) {
                    jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                }
                jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                if (i3 >= length) {
                    return jSONObject2;
                }
                i2 = i3;
            }
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: q */
    public static final String[] m12699q(a aVar, float[][] fArr, String[] strArr) {
        C9768m.m32346f(aVar, "task");
        C9768m.m32346f(fArr, "denses");
        C9768m.m32346f(strArr, "texts");
        b bVar = f15432b.get(aVar.m12704q());
        C5885g m12707c = bVar == null ? null : bVar.m12707c();
        if (m12707c == null) {
            return null;
        }
        float[] m12710f = bVar.m12710f();
        int length = strArr.length;
        int length2 = fArr[0].length;
        C5884f c5884f = new C5884f(new int[]{length, length2});
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                System.arraycopy(fArr[i2], 0, c5884f.m12673a(), i2 * length2, length2);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        C5884f m12680b = m12707c.m12680b(c5884f, strArr, aVar.m12703k());
        if (m12680b == null || m12710f == null) {
            return null;
        }
        if (m12680b.m12673a().length == 0) {
            return null;
        }
        if (m12710f.length == 0) {
            return null;
        }
        int i4 = c.f15448a[aVar.ordinal()];
        if (i4 == 1) {
            return f15431a.m12701s(m12680b, m12710f);
        }
        if (i4 == 2) {
            return f15431a.m12700r(m12680b, m12710f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: r */
    private final String[] m12700r(C5884f c5884f, float[] fArr) {
        IntRange m32428k;
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        float[] m12673a = c5884f.m12673a();
        if (m12674b2 != fArr.length) {
            return null;
        }
        m32428k = C9815l.m32428k(0, m12674b);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m32428k, 10));
        Iterator<Integer> it = m32428k.iterator();
        while (it.hasNext()) {
            int mo32397b = ((IntIterator) it).mo32397b();
            int length = fArr.length;
            String str = "none";
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (m12673a[(mo32397b * m12674b2) + i3] >= fArr[i2]) {
                    str = f15434d.get(i3);
                }
                i2++;
                i3 = i4;
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: s */
    private final String[] m12701s(C5884f c5884f, float[] fArr) {
        IntRange m32428k;
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        float[] m12673a = c5884f.m12673a();
        if (m12674b2 != fArr.length) {
            return null;
        }
        m32428k = C9815l.m32428k(0, m12674b);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m32428k, 10));
        Iterator<Integer> it = m32428k.iterator();
        while (it.hasNext()) {
            int mo32397b = ((IntIterator) it).mo32397b();
            int length = fArr.length;
            String str = "other";
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (m12673a[(mo32397b * m12674b2) + i3] >= fArr[i2]) {
                    str = f15433c.get(i3);
                }
                i2++;
                i3 = i4;
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
