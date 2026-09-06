package p456rx.p474t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;

/* compiled from: CompositeSubscription.java */
/* renamed from: rx.t.b */
/* loaded from: classes.dex */
public final class C11378b implements InterfaceC11198k {

    /* renamed from: f */
    private Set<InterfaceC11198k> f43086f;

    /* renamed from: g */
    private volatile boolean f43087g;

    /* renamed from: e */
    private static void m40666e(Collection<InterfaceC11198k> collection) {
        if (collection == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<InterfaceC11198k> it = collection.iterator();
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        C11192a.m40139d(arrayList);
    }

    /* renamed from: a */
    public void m40667a(InterfaceC11198k interfaceC11198k) {
        if (interfaceC11198k.isUnsubscribed()) {
            return;
        }
        if (!this.f43087g) {
            synchronized (this) {
                if (!this.f43087g) {
                    if (this.f43086f == null) {
                        this.f43086f = new HashSet(4);
                    }
                    this.f43086f.add(interfaceC11198k);
                    return;
                }
            }
        }
        interfaceC11198k.unsubscribe();
    }

    /* renamed from: b */
    public void m40668b() {
        Set<InterfaceC11198k> set;
        if (this.f43087g) {
            return;
        }
        synchronized (this) {
            if (!this.f43087g && (set = this.f43086f) != null) {
                this.f43086f = null;
                m40666e(set);
            }
        }
    }

    /* renamed from: c */
    public boolean m40669c() {
        Set<InterfaceC11198k> set;
        boolean z = false;
        if (this.f43087g) {
            return false;
        }
        synchronized (this) {
            if (!this.f43087g && (set = this.f43086f) != null && !set.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    public void m40670d(InterfaceC11198k interfaceC11198k) {
        Set<InterfaceC11198k> set;
        if (this.f43087g) {
            return;
        }
        synchronized (this) {
            if (!this.f43087g && (set = this.f43086f) != null) {
                boolean remove = set.remove(interfaceC11198k);
                if (remove) {
                    interfaceC11198k.unsubscribe();
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f43087g;
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        if (this.f43087g) {
            return;
        }
        synchronized (this) {
            if (this.f43087g) {
                return;
            }
            this.f43087g = true;
            Set<InterfaceC11198k> set = this.f43086f;
            this.f43086f = null;
            m40666e(set);
        }
    }
}
