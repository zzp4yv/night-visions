package io.rakam.api;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Rakam.java */
/* renamed from: io.rakam.api.f */
/* loaded from: classes.dex */
public class C9197f {

    /* renamed from: a */
    static final Map<String, C9198g> f35654a = new HashMap();

    /* renamed from: a */
    public static C9198g m29891a() {
        return m29892b(null);
    }

    /* renamed from: b */
    public static synchronized C9198g m29892b(String str) {
        C9198g c9198g;
        synchronized (C9197f.class) {
            String m29989e = C9201j.m29989e(str);
            Map<String, C9198g> map = f35654a;
            c9198g = map.get(m29989e);
            if (c9198g == null) {
                c9198g = new C9198g(m29989e);
                map.put(m29989e, c9198g);
            }
        }
        return c9198g;
    }
}
