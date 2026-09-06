package com.facebook.p157o0;

import android.content.Context;
import com.facebook.C5608a0;
import com.facebook.internal.C5664q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9768m;

/* compiled from: AppEventCollection.kt */
/* renamed from: com.facebook.o0.w */
/* loaded from: classes.dex */
public final class C5909w {

    /* renamed from: a */
    private final HashMap<C5895t, C5796i0> f15540a = new HashMap<>();

    /* renamed from: e */
    private final synchronized C5796i0 m12845e(C5895t c5895t) {
        C5796i0 c5796i0 = this.f15540a.get(c5895t);
        if (c5796i0 == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            Context m11284c = C5608a0.m11284c();
            C5664q m11628e = C5664q.f14488a.m11628e(m11284c);
            if (m11628e != null) {
                c5796i0 = new C5796i0(m11628e, C5780a0.f14908a.m12169c(m11284c));
            }
        }
        if (c5796i0 == null) {
            return null;
        }
        this.f15540a.put(c5895t, c5796i0);
        return c5796i0;
    }

    /* renamed from: a */
    public final synchronized void m12846a(C5895t c5895t, C5908v c5908v) {
        C9768m.m32346f(c5895t, "accessTokenAppIdPair");
        C9768m.m32346f(c5908v, "appEvent");
        C5796i0 m12845e = m12845e(c5895t);
        if (m12845e != null) {
            m12845e.m12257a(c5908v);
        }
    }

    /* renamed from: b */
    public final synchronized void m12847b(C5794h0 c5794h0) {
        if (c5794h0 == null) {
            return;
        }
        for (Map.Entry<C5895t, List<C5908v>> entry : c5794h0.m12255b()) {
            C5796i0 m12845e = m12845e(entry.getKey());
            if (m12845e != null) {
                Iterator<C5908v> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    m12845e.m12257a(it.next());
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C5796i0 m12848c(C5895t c5895t) {
        C9768m.m32346f(c5895t, "accessTokenAppIdPair");
        return this.f15540a.get(c5895t);
    }

    /* renamed from: d */
    public final synchronized int m12849d() {
        int i2;
        i2 = 0;
        Iterator<C5796i0> it = this.f15540a.values().iterator();
        while (it.hasNext()) {
            i2 += it.next().m12259c();
        }
        return i2;
    }

    /* renamed from: f */
    public final synchronized Set<C5895t> m12850f() {
        Set<C5895t> keySet;
        keySet = this.f15540a.keySet();
        C9768m.m32345e(keySet, "stateMap.keys");
        return keySet;
    }
}
