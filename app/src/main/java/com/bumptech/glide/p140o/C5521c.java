package com.bumptech.glide.p140o;

import com.bumptech.glide.load.engine.C5359i;
import com.bumptech.glide.load.engine.C5369s;
import com.bumptech.glide.load.p131o.p137h.C5498g;
import com.bumptech.glide.p145r.C5562i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p041e.C0867a;

/* compiled from: LoadPathCache.java */
/* renamed from: com.bumptech.glide.o.c */
/* loaded from: classes.dex */
public class C5521c {

    /* renamed from: a */
    private static final C5369s<?, ?, ?> f13896a = new C5369s<>(Object.class, Object.class, Object.class, Collections.singletonList(new C5359i(Object.class, Object.class, Object.class, Collections.emptyList(), new C5498g(), null)), null);

    /* renamed from: b */
    private final C0867a<C5562i, C5369s<?, ?, ?>> f13897b = new C0867a<>();

    /* renamed from: c */
    private final AtomicReference<C5562i> f13898c = new AtomicReference<>();

    /* renamed from: b */
    private C5562i m10848b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C5562i andSet = this.f13898c.getAndSet(null);
        if (andSet == null) {
            andSet = new C5562i();
        }
        andSet.m11038a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C5369s<Data, TResource, Transcode> m10849a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5369s<Data, TResource, Transcode> c5369s;
        C5562i m10848b = m10848b(cls, cls2, cls3);
        synchronized (this.f13897b) {
            c5369s = (C5369s) this.f13897b.get(m10848b);
        }
        this.f13898c.set(m10848b);
        return c5369s;
    }

    /* renamed from: c */
    public boolean m10850c(C5369s<?, ?, ?> c5369s) {
        return f13896a.equals(c5369s);
    }

    /* renamed from: d */
    public void m10851d(Class<?> cls, Class<?> cls2, Class<?> cls3, C5369s<?, ?, ?> c5369s) {
        synchronized (this.f13897b) {
            C0867a<C5562i, C5369s<?, ?, ?>> c0867a = this.f13897b;
            C5562i c5562i = new C5562i(cls, cls2, cls3);
            if (c5369s == null) {
                c5369s = f13896a;
            }
            c0867a.put(c5562i, c5369s);
        }
    }
}
