package p323h.p324a.p329z.p333d;

import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;

/* compiled from: DeferredScalarDisposable.java */
/* renamed from: h.a.z.d.c */
/* loaded from: classes2.dex */
public class C9084c<T> extends AbstractC9082a<T> {

    /* renamed from: f */
    protected final InterfaceC9047q<? super T> f34961f;

    /* renamed from: g */
    protected T f34962g;

    public C9084c(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f34961f = interfaceC9047q;
    }

    /* renamed from: c */
    public final void m29274c(T t) {
        int i2 = get();
        if ((i2 & 54) != 0) {
            return;
        }
        InterfaceC9047q<? super T> interfaceC9047q = this.f34961f;
        if (i2 == 8) {
            this.f34962g = t;
            lazySet(16);
            interfaceC9047q.onNext(null);
        } else {
            lazySet(2);
            interfaceC9047q.onNext(t);
        }
        if (get() != 4) {
            interfaceC9047q.mo29218a();
        }
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public final void clear() {
        lazySet(32);
        this.f34962g = null;
    }

    /* renamed from: d */
    public final void m29275d(Throwable th) {
        if ((get() & 54) != 0) {
            C9030a.m29147o(th);
        } else {
            lazySet(2);
            this.f34961f.onError(th);
        }
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
    /* renamed from: g */
    public final int mo29259g(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
        set(4);
        this.f34962g = null;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f34962g;
        this.f34962g = null;
        lazySet(32);
        return t;
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public final boolean mo29116q() {
        return get() == 4;
    }
}
