package com.airbnb.epoxy;

import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewTypeManager.java */
/* renamed from: com.airbnb.epoxy.m0 */
/* loaded from: classes.dex */
class C5127m0 {

    /* renamed from: a */
    private static final Map<Class, Integer> f12251a = new HashMap();

    /* renamed from: b */
    private AbstractC5141s<?> f12252b;

    C5127m0() {
    }

    /* renamed from: b */
    static int m9311b(AbstractC5141s<?> abstractC5141s) {
        int viewType = abstractC5141s.getViewType();
        if (viewType != 0) {
            return viewType;
        }
        Class<?> cls = abstractC5141s.getClass();
        Map<Class, Integer> map = f12251a;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }

    /* renamed from: a */
    AbstractC5141s<?> m9312a(AbstractC5108d abstractC5108d, int i2) {
        AbstractC5141s<?> abstractC5141s = this.f12252b;
        if (abstractC5141s != null && m9311b(abstractC5141s) == i2) {
            return this.f12252b;
        }
        abstractC5108d.mo9275r(new IllegalStateException("Last model did not match expected view type"));
        for (AbstractC5141s<?> abstractC5141s2 : abstractC5108d.mo9267j()) {
            if (m9311b(abstractC5141s2) == i2) {
                return abstractC5141s2;
            }
        }
        C5146x c5146x = new C5146x();
        if (i2 == c5146x.getViewType()) {
            return c5146x;
        }
        throw new IllegalStateException("Could not find model for view type: " + i2);
    }

    /* renamed from: c */
    int m9313c(AbstractC5141s<?> abstractC5141s) {
        this.f12252b = abstractC5141s;
        return m9311b(abstractC5141s);
    }
}
