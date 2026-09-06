package com.bumptech.glide.load.engine.p126z;

import com.bumptech.glide.load.engine.p126z.InterfaceC5388m;
import com.bumptech.glide.p145r.C5564k;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.d */
/* loaded from: classes.dex */
abstract class AbstractC5379d<T extends InterfaceC5388m> {

    /* renamed from: a */
    private final Queue<T> f13516a = C5564k.m11049f(20);

    AbstractC5379d() {
    }

    /* renamed from: a */
    abstract T mo10380a();

    /* renamed from: b */
    T m10383b() {
        T poll = this.f13516a.poll();
        return poll == null ? mo10380a() : poll;
    }

    /* renamed from: c */
    public void m10384c(T t) {
        if (this.f13516a.size() < 20) {
            this.f13516a.offer(t);
        }
    }
}
