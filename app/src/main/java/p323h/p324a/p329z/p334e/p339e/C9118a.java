package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9050t;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9052v;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9063d;
import p323h.p324a.p329z.p330a.C9068a;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: SingleCreate.java */
/* renamed from: h.a.z.e.e.a */
/* loaded from: classes2.dex */
public final class C9118a<T> extends AbstractC9049s<T> {

    /* renamed from: a */
    final InterfaceC9052v<T> f35139a;

    /* compiled from: SingleCreate.java */
    /* renamed from: h.a.z.e.e.a$a */
    static final class a<T> extends AtomicReference<InterfaceC9056c> implements InterfaceC9050t<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9051u<? super T> f35140f;

        a(InterfaceC9051u<? super T> interfaceC9051u) {
            this.f35140f = interfaceC9051u;
        }

        /* renamed from: a */
        public void m29312a(Throwable th) {
            if (mo29235c(th)) {
                return;
            }
            C9030a.m29147o(th);
        }

        @Override // p323h.p324a.InterfaceC9050t
        /* renamed from: b */
        public void mo29234b(InterfaceC9063d interfaceC9063d) {
            m29313d(new C9068a(interfaceC9063d));
        }

        @Override // p323h.p324a.InterfaceC9050t
        /* renamed from: c */
        public boolean mo29235c(Throwable th) {
            InterfaceC9056c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC9056c interfaceC9056c = get();
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c || (andSet = getAndSet(enumC9070c)) == enumC9070c) {
                return false;
            }
            try {
                this.f35140f.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        /* renamed from: d */
        public void m29313d(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29254y(this, interfaceC9056c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9050t
        public void onSuccess(T t) {
            InterfaceC9056c andSet;
            InterfaceC9056c interfaceC9056c = get();
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c || (andSet = getAndSet(enumC9070c)) == enumC9070c) {
                return;
            }
            try {
                if (t == null) {
                    this.f35140f.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f35140f.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.mo29115k();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.mo29115k();
                }
                throw th;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C9118a(InterfaceC9052v<T> interfaceC9052v) {
        this.f35139a = interfaceC9052v;
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9051u<? super T> interfaceC9051u) {
        a aVar = new a(interfaceC9051u);
        interfaceC9051u.mo29132b(aVar);
        try {
            this.f35139a.mo4662a(aVar);
        } catch (Throwable th) {
            C9207a.m30000a(th);
            aVar.m29312a(th);
        }
    }
}
