package com.facebook.p157o0.p162n0;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.C5608a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.C5908v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EventDeactivationManager.kt */
/* renamed from: com.facebook.o0.n0.a */
/* loaded from: classes.dex */
public final class C5843a {

    /* renamed from: b */
    private static boolean f15263b;

    /* renamed from: a */
    public static final C5843a f15262a = new C5843a();

    /* renamed from: c */
    private static final List<a> f15264c = new ArrayList();

    /* renamed from: d */
    private static final Set<String> f15265d = new HashSet();

    /* compiled from: EventDeactivationManager.kt */
    /* renamed from: com.facebook.o0.n0.a$a */
    public static final class a {

        /* renamed from: a */
        private String f15266a;

        /* renamed from: b */
        private List<String> f15267b;

        public a(String str, List<String> list) {
            C9768m.m32346f(str, "eventName");
            C9768m.m32346f(list, "deprecateParams");
            this.f15266a = str;
            this.f15267b = list;
        }

        /* renamed from: a */
        public final List<String> m12491a() {
            return this.f15267b;
        }

        /* renamed from: b */
        public final String m12492b() {
            return this.f15266a;
        }

        /* renamed from: c */
        public final void m12493c(List<String> list) {
            C9768m.m32346f(list, "<set-?>");
            this.f15267b = list;
        }
    }

    private C5843a() {
    }

    /* renamed from: a */
    public static final void m12487a() {
        C5843a c5843a = f15262a;
        f15263b = true;
        c5843a.m12488b();
    }

    /* renamed from: b */
    private final synchronized void m12488b() {
        C5637c0 m11428o;
        try {
            C5639d0 c5639d0 = C5639d0.f14392a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11428o = C5639d0.m11428o(C5608a0.m11285d(), false);
        } catch (Exception unused) {
        }
        if (m11428o == null) {
            return;
        }
        String m11405i = m11428o.m11405i();
        if (m11405i != null) {
            if (m11405i.length() > 0) {
                JSONObject jSONObject = new JSONObject(m11405i);
                f15264c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = f15265d;
                            C9768m.m32345e(next, RoomNotification.KEY);
                            set.add(next);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            C9768m.m32345e(next, RoomNotification.KEY);
                            a aVar = new a(next, new ArrayList());
                            if (optJSONArray != null) {
                                C5663p0 c5663p0 = C5663p0.f14478a;
                                aVar.m12493c(C5663p0.m11576k(optJSONArray));
                            }
                            f15264c.add(aVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m12489c(Map<String, String> map, String str) {
        C9768m.m32346f(map, "parameters");
        C9768m.m32346f(str, "eventName");
        if (f15263b) {
            ArrayList<String> arrayList = new ArrayList(map.keySet());
            for (a aVar : new ArrayList(f15264c)) {
                if (C9768m.m32341a(aVar.m12492b(), str)) {
                    for (String str2 : arrayList) {
                        if (aVar.m12491a().contains(str2)) {
                            map.remove(str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m12490d(List<C5908v> list) {
        C9768m.m32346f(list, "events");
        if (f15263b) {
            Iterator<C5908v> it = list.iterator();
            while (it.hasNext()) {
                if (f15265d.contains(it.next().m12838f())) {
                    it.remove();
                }
            }
        }
    }
}
