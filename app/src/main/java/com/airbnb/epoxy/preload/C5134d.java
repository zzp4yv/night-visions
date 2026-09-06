package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.InterfaceC5133c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C10786v;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntRange;

/* compiled from: PreloadTargetProvider.kt */
/* renamed from: com.airbnb.epoxy.preload.d */
/* loaded from: classes.dex */
public final class C5134d<P extends InterfaceC5133c> {

    /* renamed from: a */
    private final ArrayDeque<P> f12275a;

    public C5134d(int i2, Function0<? extends P> function0) {
        IntRange m32428k;
        C9768m.m32347g(function0, "requestHolderFactory");
        m32428k = C9815l.m32428k(0, i2);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m32428k, 10));
        Iterator<Integer> it = m32428k.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).mo32397b();
            arrayList.add(function0.invoke());
        }
        this.f12275a = new ArrayDeque<>(arrayList);
    }

    /* renamed from: a */
    public final void m9341a() {
        Iterator<T> it = this.f12275a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5133c) it.next()).clear();
        }
    }

    /* renamed from: b */
    public final P m9342b() {
        P poll = this.f12275a.poll();
        this.f12275a.offer(poll);
        poll.clear();
        C9768m.m32342b(poll, "result");
        return poll;
    }
}
