package com.facebook.p157o0.p158k0;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetadataRule.kt */
/* renamed from: com.facebook.o0.k0.e */
/* loaded from: classes.dex */
public final class C5804e {

    /* renamed from: a */
    public static final a f14982a = new a(null);

    /* renamed from: b */
    private static final Set<C5804e> f14983b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final String f14984c;

    /* renamed from: d */
    private final String f14985d;

    /* renamed from: e */
    private final List<String> f14986e;

    /* compiled from: MetadataRule.kt */
    /* renamed from: com.facebook.o0.k0.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final void m12286a(JSONObject jSONObject) {
            List m37582v0;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C9768m.m32345e(optString, "k");
                    if (!(optString.length() == 0)) {
                        Set set = C5804e.f14983b;
                        C9768m.m32345e(next, RoomNotification.KEY);
                        m37582v0 = C10514v.m37582v0(optString, new String[]{","}, false, 0, 6, null);
                        C9768m.m32345e(optString2, "v");
                        set.add(new C5804e(next, m37582v0, optString2, null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set<String> m12287b() {
            HashSet hashSet = new HashSet();
            Iterator it = C5804e.f14983b.iterator();
            while (it.hasNext()) {
                hashSet.add(((C5804e) it.next()).m12284c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set<C5804e> m12288c() {
            return new HashSet(C5804e.f14983b);
        }

        /* renamed from: d */
        public final void m12289d(String str) {
            C9768m.m32346f(str, "rulesFromServer");
            try {
                C5804e.f14983b.clear();
                m12286a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private C5804e(String str, List<String> list, String str2) {
        this.f14984c = str;
        this.f14985d = str2;
        this.f14986e = list;
    }

    public /* synthetic */ C5804e(String str, List list, String str2, C9756g c9756g) {
        this(str, list, str2);
    }

    /* renamed from: b */
    public final List<String> m12283b() {
        return new ArrayList(this.f14986e);
    }

    /* renamed from: c */
    public final String m12284c() {
        return this.f14984c;
    }

    /* renamed from: d */
    public final String m12285d() {
        return this.f14985d;
    }
}
