package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.Iterator;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p333d.AbstractC9083b;

/* compiled from: ObservableFromIterable.java */
/* renamed from: h.a.z.e.d.k */
/* loaded from: classes2.dex */
public final class C9108k<T> extends AbstractC9043m<T> {

    /* renamed from: f */
    final Iterable<? extends T> f35089f;

    /* compiled from: ObservableFromIterable.java */
    /* renamed from: h.a.z.e.d.k$a */
    static final class a<T> extends AbstractC9083b<T> {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35090f;

        /* renamed from: g */
        final Iterator<? extends T> f35091g;

        /* renamed from: h */
        volatile boolean f35092h;

        /* renamed from: i */
        boolean f35093i;

        /* renamed from: j */
        boolean f35094j;

        /* renamed from: k */
        boolean f35095k;

        a(InterfaceC9047q<? super T> interfaceC9047q, Iterator<? extends T> it) {
            this.f35090f = interfaceC9047q;
            this.f35091g = it;
        }

        /* renamed from: a */
        void m29304a() {
            while (!mo29116q()) {
                try {
                    this.f35090f.onNext(C9075b.m29271c(this.f35091g.next(), "The iterator returned a null value"));
                    if (mo29116q()) {
                        return;
                    }
                    try {
                        if (!this.f35091g.hasNext()) {
                            if (mo29116q()) {
                                return;
                            }
                            this.f35090f.mo29218a();
                            return;
                        }
                    } catch (Throwable th) {
                        C9207a.m30000a(th);
                        this.f35090f.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C9207a.m30000a(th2);
                    this.f35090f.onError(th2);
                    return;
                }
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public void clear() {
            this.f35094j = true;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
        /* renamed from: g */
        public int mo29259g(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f35093i = true;
            return 1;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public boolean isEmpty() {
            return this.f35094j;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35092h = true;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public T poll() {
            if (this.f35094j) {
                return null;
            }
            if (!this.f35095k) {
                this.f35095k = true;
            } else if (!this.f35091g.hasNext()) {
                this.f35094j = true;
                return null;
            }
            return (T) C9075b.m29271c(this.f35091g.next(), "The iterator returned a null value");
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35092h;
        }
    }

    public C9108k(Iterable<? extends T> iterable) {
        this.f35089f = iterable;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        try {
            Iterator<? extends T> it = this.f35089f.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC9071d.m29256v(interfaceC9047q);
                    return;
                }
                a aVar = new a(interfaceC9047q, it);
                interfaceC9047q.mo29219b(aVar);
                if (aVar.f35093i) {
                    return;
                }
                aVar.m29304a();
            } catch (Throwable th) {
                C9207a.m30000a(th);
                EnumC9071d.m29257x(th, interfaceC9047q);
            }
        } catch (Throwable th2) {
            C9207a.m30000a(th2);
            EnumC9071d.m29257x(th2, interfaceC9047q);
        }
    }
}
