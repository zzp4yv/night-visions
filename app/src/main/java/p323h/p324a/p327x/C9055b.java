package p323h.p324a.p327x;

import io.reactivex.exceptions.C9207a;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import p323h.p324a.p329z.p330a.InterfaceC9069b;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p344j.C9145c;
import p323h.p324a.p329z.p344j.C9147e;

/* compiled from: CompositeDisposable.java */
/* renamed from: h.a.x.b */
/* loaded from: classes2.dex */
public final class C9055b implements InterfaceC9056c, InterfaceC9069b {

    /* renamed from: f */
    C9147e<InterfaceC9056c> f34937f;

    /* renamed from: g */
    volatile boolean f34938g;

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
        C9075b.m29271c(interfaceC9056c, "disposable is null");
        if (!this.f34938g) {
            synchronized (this) {
                if (!this.f34938g) {
                    C9147e<InterfaceC9056c> c9147e = this.f34937f;
                    if (c9147e == null) {
                        c9147e = new C9147e<>();
                        this.f34937f = c9147e;
                    }
                    c9147e.m29396a(interfaceC9056c);
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
        C9075b.m29271c(interfaceC9056c, "disposables is null");
        if (this.f34938g) {
            return false;
        }
        synchronized (this) {
            if (this.f34938g) {
                return false;
            }
            C9147e<InterfaceC9056c> c9147e = this.f34937f;
            if (c9147e != null && c9147e.m29399e(interfaceC9056c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m29241d(C9147e<InterfaceC9056c> c9147e) {
        if (c9147e == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c9147e.m29397b()) {
            if (obj instanceof InterfaceC9056c) {
                try {
                    ((InterfaceC9056c) obj).mo29115k();
                } catch (Throwable th) {
                    C9207a.m30000a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
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
        if (this.f34938g) {
            return;
        }
        synchronized (this) {
            if (this.f34938g) {
                return;
            }
            this.f34938g = true;
            C9147e<InterfaceC9056c> c9147e = this.f34937f;
            this.f34937f = null;
            m29241d(c9147e);
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return this.f34938g;
    }
}
