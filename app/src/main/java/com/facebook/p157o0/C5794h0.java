package com.facebook.p157o0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: PersistedEvents.kt */
/* renamed from: com.facebook.o0.h0 */
/* loaded from: classes.dex */
public final class C5794h0 implements Serializable {

    /* renamed from: f */
    public static final a f14953f = new a(null);

    /* renamed from: g */
    private final HashMap<C5895t, List<C5908v>> f14954g;

    /* compiled from: PersistedEvents.kt */
    /* renamed from: com.facebook.o0.h0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: PersistedEvents.kt */
    /* renamed from: com.facebook.o0.h0$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f14955f = new a(null);

        /* renamed from: g */
        private final HashMap<C5895t, List<C5908v>> f14956g;

        /* compiled from: PersistedEvents.kt */
        /* renamed from: com.facebook.o0.h0$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }
        }

        public b(HashMap<C5895t, List<C5908v>> hashMap) {
            C9768m.m32346f(hashMap, "proxyEvents");
            this.f14956g = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C5794h0(this.f14956g);
        }
    }

    public C5794h0() {
        this.f14954g = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f14954g);
    }

    /* renamed from: a */
    public final void m12254a(C5895t c5895t, List<C5908v> list) {
        C9768m.m32346f(c5895t, "accessTokenAppIdPair");
        C9768m.m32346f(list, "appEvents");
        if (!this.f14954g.containsKey(c5895t)) {
            this.f14954g.put(c5895t, C10749c0.m38571G0(list));
            return;
        }
        List<C5908v> list2 = this.f14954g.get(c5895t);
        if (list2 == null) {
            return;
        }
        list2.addAll(list);
    }

    /* renamed from: b */
    public final Set<Map.Entry<C5895t, List<C5908v>>> m12255b() {
        Set<Map.Entry<C5895t, List<C5908v>>> entrySet = this.f14954g.entrySet();
        C9768m.m32345e(entrySet, "events.entries");
        return entrySet;
    }

    public C5794h0(HashMap<C5895t, List<C5908v>> hashMap) {
        C9768m.m32346f(hashMap, "appEventMap");
        HashMap<C5895t, List<C5908v>> hashMap2 = new HashMap<>();
        this.f14954g = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
