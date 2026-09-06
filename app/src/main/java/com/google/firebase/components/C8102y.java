package com.google.firebase.components;

import com.google.firebase.p205s.InterfaceC8463b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* renamed from: com.google.firebase.components.y */
/* loaded from: classes2.dex */
class C8102y<T> implements InterfaceC8463b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f30747b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC8463b<T>> f30746a = Collections.newSetFromMap(new ConcurrentHashMap());

    C8102y(Collection<InterfaceC8463b<T>> collection) {
        this.f30746a.addAll(collection);
    }

    /* renamed from: b */
    static C8102y<?> m25075b(Collection<InterfaceC8463b<?>> collection) {
        return new C8102y<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m25076d() {
        Iterator<InterfaceC8463b<T>> it = this.f30746a.iterator();
        while (it.hasNext()) {
            this.f30747b.add(it.next().get());
        }
        this.f30746a = null;
    }

    /* renamed from: a */
    synchronized void m25077a(InterfaceC8463b<T> interfaceC8463b) {
        if (this.f30747b == null) {
            this.f30746a.add(interfaceC8463b);
        } else {
            this.f30747b.add(interfaceC8463b.get());
        }
    }

    @Override // com.google.firebase.p205s.InterfaceC8463b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f30747b == null) {
            synchronized (this) {
                if (this.f30747b == null) {
                    this.f30747b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m25076d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f30747b);
    }
}
