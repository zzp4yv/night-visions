package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes2.dex */
final class C7472f1 {

    /* renamed from: a */
    private final ConcurrentHashMap<C7466e1, List<Throwable>> f27724a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f27725b = new ReferenceQueue<>();

    C7472f1() {
    }

    /* renamed from: a */
    public final List<Throwable> m21050a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f27725b.poll();
        while (poll != null) {
            this.f27724a.remove(poll);
            poll = this.f27725b.poll();
        }
        List<Throwable> list = this.f27724a.get(new C7466e1(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f27724a.putIfAbsent(new C7466e1(th, this.f27725b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
