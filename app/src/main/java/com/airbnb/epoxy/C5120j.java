package com.airbnb.epoxy;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: DiffPayload.java */
/* renamed from: com.airbnb.epoxy.j */
/* loaded from: classes.dex */
public class C5120j {

    /* renamed from: a */
    private final AbstractC5141s<?> f12240a;

    /* renamed from: b */
    private final C0870d<AbstractC5141s<?>> f12241b;

    C5120j(List<? extends AbstractC5141s<?>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = list.size();
        if (size == 1) {
            this.f12240a = list.get(0);
            this.f12241b = null;
            return;
        }
        this.f12240a = null;
        this.f12241b = new C0870d<>(size);
        for (AbstractC5141s<?> abstractC5141s : list) {
            this.f12241b.m5442k(abstractC5141s.m9359id(), abstractC5141s);
        }
    }

    /* renamed from: a */
    public static AbstractC5141s<?> m9299a(List<Object> list, long j2) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            C5120j c5120j = (C5120j) it.next();
            AbstractC5141s<?> abstractC5141s = c5120j.f12240a;
            if (abstractC5141s == null) {
                AbstractC5141s<?> m5438g = c5120j.f12241b.m5438g(j2);
                if (m5438g != null) {
                    return m5438g;
                }
            } else if (abstractC5141s.m9359id() == j2) {
                return c5120j.f12240a;
            }
        }
        return null;
    }

    public C5120j(AbstractC5141s<?> abstractC5141s) {
        this((List<? extends AbstractC5141s<?>>) Collections.singletonList(abstractC5141s));
    }
}
