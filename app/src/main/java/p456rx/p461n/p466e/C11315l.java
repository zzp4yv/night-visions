package p456rx.p461n.p466e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;

/* compiled from: SubscriptionList.java */
/* renamed from: rx.n.e.l */
/* loaded from: classes3.dex */
public final class C11315l implements InterfaceC11198k {

    /* renamed from: f */
    private List<InterfaceC11198k> f42922f;

    /* renamed from: g */
    private volatile boolean f42923g;

    public C11315l() {
    }

    /* renamed from: c */
    private static void m40463c(Collection<InterfaceC11198k> collection) {
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
    public void m40464a(InterfaceC11198k interfaceC11198k) {
        if (interfaceC11198k.isUnsubscribed()) {
            return;
        }
        if (!this.f42923g) {
            synchronized (this) {
                if (!this.f42923g) {
                    List list = this.f42922f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f42922f = list;
                    }
                    list.add(interfaceC11198k);
                    return;
                }
            }
        }
        interfaceC11198k.unsubscribe();
    }

    /* renamed from: b */
    public void m40465b(InterfaceC11198k interfaceC11198k) {
        if (this.f42923g) {
            return;
        }
        synchronized (this) {
            List<InterfaceC11198k> list = this.f42922f;
            if (!this.f42923g && list != null) {
                boolean remove = list.remove(interfaceC11198k);
                if (remove) {
                    interfaceC11198k.unsubscribe();
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f42923g;
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        if (this.f42923g) {
            return;
        }
        synchronized (this) {
            if (this.f42923g) {
                return;
            }
            this.f42923g = true;
            List<InterfaceC11198k> list = this.f42922f;
            this.f42922f = null;
            m40463c(list);
        }
    }

    public C11315l(InterfaceC11198k... interfaceC11198kArr) {
        this.f42922f = new LinkedList(Arrays.asList(interfaceC11198kArr));
    }

    public C11315l(InterfaceC11198k interfaceC11198k) {
        LinkedList linkedList = new LinkedList();
        this.f42922f = linkedList;
        linkedList.add(interfaceC11198k);
    }
}
