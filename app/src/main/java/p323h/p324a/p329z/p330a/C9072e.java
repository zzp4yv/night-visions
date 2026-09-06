package p323h.p324a.p329z.p330a;

import io.reactivex.exceptions.C9207a;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p344j.C9145c;

/* compiled from: ListCompositeDisposable.java */
/* renamed from: h.a.z.a.e */
/* loaded from: classes2.dex */
public final class C9072e implements InterfaceC9056c, InterfaceC9069b {

    /* renamed from: f */
    List<InterfaceC9056c> f34944f;

    /* renamed from: g */
    volatile boolean f34945g;

    @Override // p323h.p324a.p329z.p330a.InterfaceC9069b
    /* renamed from: a */
    public boolean mo29238a(InterfaceC9056c interfaceC9056c) {
        if (!mo29240c(interfaceC9056c)) {
            return false;
        }
        interfaceC9056c.mo29115k();
        return true;
    }

    @Override // p323h.p324a.p329z.p330a.InterfaceC9069b
    /* renamed from: b */
    public boolean mo29239b(InterfaceC9056c interfaceC9056c) {
        C9075b.m29271c(interfaceC9056c, "d is null");
        if (!this.f34945g) {
            synchronized (this) {
                if (!this.f34945g) {
                    List list = this.f34944f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f34944f = list;
                    }
                    list.add(interfaceC9056c);
                    return true;
                }
            }
        }
        interfaceC9056c.mo29115k();
        return false;
    }

    @Override // p323h.p324a.p329z.p330a.InterfaceC9069b
    /* renamed from: c */
    public boolean mo29240c(InterfaceC9056c interfaceC9056c) {
        C9075b.m29271c(interfaceC9056c, "Disposable item is null");
        if (this.f34945g) {
            return false;
        }
        synchronized (this) {
            if (this.f34945g) {
                return false;
            }
            List<InterfaceC9056c> list = this.f34944f;
            if (list != null && list.remove(interfaceC9056c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m29260d(List<InterfaceC9056c> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<InterfaceC9056c> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo29115k();
            } catch (Throwable th) {
                C9207a.m30000a(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw C9145c.m29391c((Throwable) arrayList.get(0));
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
        if (this.f34945g) {
            return;
        }
        synchronized (this) {
            if (this.f34945g) {
                return;
            }
            this.f34945g = true;
            List<InterfaceC9056c> list = this.f34944f;
            this.f34944f = null;
            m29260d(list);
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return this.f34945g;
    }
}
