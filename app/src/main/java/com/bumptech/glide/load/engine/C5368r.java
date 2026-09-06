package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC5390f;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* renamed from: com.bumptech.glide.load.engine.r */
/* loaded from: classes.dex */
final class C5368r {

    /* renamed from: a */
    private final Map<InterfaceC5390f, C5362l<?>> f13471a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC5390f, C5362l<?>> f13472b = new HashMap();

    C5368r() {
    }

    /* renamed from: b */
    private Map<InterfaceC5390f, C5362l<?>> m10347b(boolean z) {
        return z ? this.f13472b : this.f13471a;
    }

    /* renamed from: a */
    C5362l<?> m10348a(InterfaceC5390f interfaceC5390f, boolean z) {
        return m10347b(z).get(interfaceC5390f);
    }

    /* renamed from: c */
    void m10349c(InterfaceC5390f interfaceC5390f, C5362l<?> c5362l) {
        m10347b(c5362l.m10328o()).put(interfaceC5390f, c5362l);
    }

    /* renamed from: d */
    void m10350d(InterfaceC5390f interfaceC5390f, C5362l<?> c5362l) {
        Map<InterfaceC5390f, C5362l<?>> m10347b = m10347b(c5362l.m10328o());
        if (c5362l.equals(m10347b.get(interfaceC5390f))) {
            m10347b.remove(interfaceC5390f);
        }
    }
}
